
import java.sql.*;

public class TransactionDAO {

    Connection connection = null;

    public TransactionDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void createAccount(String firstName, String lastName, double balance) throws SQLException {
        String sql = "select count(*) from account";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int id = 1 + resultSet.getInt(1);
        sql = "insert into account (id, firstName, lastName, balance, approved) values (?, ?, ?, ?, 0)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setDouble(4, balance);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Account created");
        }
        else {
            System.out.println("Error, account not created");
        }

    }

    public Transaction login(String firstName, String lastName) throws SQLException {
        String sql = "select * from account where firstName = '" + firstName + "' and lastName = '" + lastName + "' and approved = 1";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        Transaction transaction = new Transaction();
        if (resultSet.next()) {
            transaction = new Transaction(resultSet.getInt(1), resultSet.getString(1), resultSet.getString(3),
                    resultSet.getDouble(4));
        }else{
            System.out.println("No such account was found");
        }
        return transaction;
    }

    public void deposit(Transaction transaction, double amount) throws SQLException {
        if(amount < 0){
            System.out.println("Error, invalid amount for deposit");
            return;
        }
        String sql = "update account set balance = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, (transaction.getBalance() + amount));
        preparedStatement.setInt(2, transaction.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Deposit successful");
            transaction.setBalance(transaction.getBalance() + amount);
        }
        else
            System.out.println("Error, deposit not executed");
    }

    public void withdraw(Transaction transaction, double amount) throws SQLException {
        if(amount < 0 || amount > transaction.getBalance()){
            System.out.println("Error, invalid amount for withdrawal");
            return;
        }
        String sql = "update account set balance = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, (transaction.getBalance() - amount));
        preparedStatement.setInt(2, transaction.getId());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Withdrawal successful");
            transaction.setBalance(transaction.getBalance() - amount);
        }
        else
            System.out.println("Error, deposit not executed");
    }

    public void viewBalance(Transaction transaction) {
        System.out.println("Current Balance: " + transaction.getBalance());
    }

    public double transfer(Transaction transaction) throws SQLException {
        String sql = "select * from transfers where recipient = " + transaction.getId();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("---------------------------------\n" +
                    "From Account ID: " + resultSet.getInt(2) + "\n" +
                    "Amount: " + resultSet.getDouble(3) + "\n" +
                    "---------------------------------\n"
            );
            return resultSet.getDouble(3);
        }
        else{
            return -1;
        }
    }

    public void acceptTransfer(Transaction transaction, boolean accept, double amount) throws SQLException {
        if (accept){
            String sql = "update account set approved = 1 where id = ?";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
        }

    }

    public void postTransfer(Transaction transaction, int recipient, double amount) throws SQLException{
        String sql = "insert into transfers (recipient, sender, amount) values (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, recipient);
        preparedStatement.setInt(2, transaction.getId());
        preparedStatement.setDouble(3, amount);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Transfer posted");
        }
        else {
            System.out.println("Error, transfer not posted");
        }
    }

    public boolean verify(String firstName, String lastName) throws SQLException {
        String sql = "select * from account where firstName = '" + firstName + "' and lastName = '" + lastName + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("Login successful");
            return true;
        }else{
            System.out.println("No such account was found");
            return false;
        }
    }

    public void approve(int id) throws SQLException {
        String sql = "update account set approved = 1 where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Account approved");
        else
            System.out.println("Error, account not approved");
    }

    public void view(boolean flag) throws SQLException {
        String sql = "select * from account where approved = " + flag;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
                System.out.println("---------------------------------\n" +
                        "Account ID: " + resultSet.getInt(1) + "\n" +
                        "Name: " + resultSet.getString(2) + " " + resultSet.getString(3) + "\n" +
                        "Balance: " + resultSet.getDouble(4) + "\n" +
                        "---------------------------------\n"
                );
        }
    }
}

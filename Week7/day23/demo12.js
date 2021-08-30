var Book = /** @class */ (function () {
    function Book(title, author, price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: Title=" + this.title + ", Author=" + this.author + ", Price=" + this.price);
    };
    return Book;
}());
var book1 = new Book('Title 1', 'Author 1', 1000);
var book2 = new Book('Title 2', 'Author 2', 2000);
book1.getBookInfo();
book2.getBookInfo();

class Emplopyee{
    id;
    firstName;
    lastName;
    email;
    phone;
   
    getFullName(){
        // console.log(this.firstName + ' '+ this.lastName );
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

class FullTimeEmployee extends Emplopyee{
    annualSalary;
}

class PartTimeEmployee extends Emplopyee{
    hourSalary;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Mark';
fte.lastName = 'Smith';

let pte = new PartTimeEmployee();
pte.firstName ='Paul';
pte.lastName = 'watson';

fte.getFullName();
pte.getFullName();


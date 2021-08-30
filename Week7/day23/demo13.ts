class Employee{
    public empId: number;
    public firstName: string;
    public lastName: string;
    public email:string;

    public getFullName(){
        console.log(`${this.firstName} ${this.lastName}`)
    }
}

class FullTimeEmployee extends Employee{
    public annualSalary: number;
}

class PartTimeEmployee extends Employee{
    public hourSalary: number;
}

let fte = new FullTimeEmployee();
fte.firstName = 'Mark';
fte.lastName = 'Smith';

let pte = new PartTimeEmployee();
pte.firstName ='Paul';
pte.lastName ='Watson';

fte.getFullName();
pte.getFullName();






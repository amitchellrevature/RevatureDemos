class Calculator{
    x: number;
    y: number;

    constructor(x: number, y?: number){
        this.x = x;
        this.y = y;
    }

    addNumber(){
        console.log(this.x + this.y);
    }
}

// let calculator = new Calculator(10, 20);
// // calculator.x = 10;
// // calculator.y = 20;

// calculator.addNumber();

let calculator = new Calculator(10, 20)
calculator.x = 100;
calculator.y = 200;
calculator.addNumber();
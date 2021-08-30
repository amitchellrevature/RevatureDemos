var Calculator = /** @class */ (function () {
    function Calculator(x, y) {
        this.x = x;
        this.y = y;
    }
    Calculator.prototype.addNumber = function () {
        console.log(this.x + this.y);
    };
    return Calculator;
}());
// let calculator = new Calculator(10, 20);
// // calculator.x = 10;
// // calculator.y = 20;
// calculator.addNumber();
var calculator = new Calculator();
calculator.x = 100;
calculator.y = 200;
calculator.addNumber();

var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return Employee;
}());
var FullTimeEmployee = /** @class */ (function (_super) {
    __extends(FullTimeEmployee, _super);
    function FullTimeEmployee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return FullTimeEmployee;
}(Employee));
var PartTimeEmployee = /** @class */ (function (_super) {
    __extends(PartTimeEmployee, _super);
    function PartTimeEmployee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return PartTimeEmployee;
}(Employee));
var fte = new FullTimeEmployee();
fte.firstName = 'Mark';
fte.lastName = 'Smith';
var pte = new PartTimeEmployee();
pte.firstName = 'Paul';
pte.lastName = 'Watson';
fte.getFullName();
pte.getFullName();

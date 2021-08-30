function hello(name) {
    console.log('Hello ' + name);
}
hello('Paul');
var result = function (name) { return 'Hello ' + name; };
console.log(result('John'));
function addNumber(a, b) {
    return a + b;
}
var sum = addNumber(20, 30);
console.log(sum);
var sum2 = function (a, b) { return a + b; };
console.log(sum2(50, 40));
var employee = {
    firstName: 'mark',
    lastName: 'smith'
};
console.log(employee.firstName); // mark
employee.firstName = 'Paul';
console.log(employee.firstName);

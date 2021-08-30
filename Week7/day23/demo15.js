var Student = /** @class */ (function () {
    function Student() {
        this.passMark = 40;
    }
    Student.prototype.getId = function () {
        return this.id;
    };
    Student.prototype.setId = function (value) {
        if (value < 0)
            throw new Error('id can not be negative');
        this.id = value;
    };
    return Student;
}());
var student = new Student();
student.setId(50);
console.log(student.getId());
// student.name = null;
// student.passMark = 20;
//console.log(`Id: ${student.id}, Name: ${student.name}, PassMark: ${student.passMark}`);

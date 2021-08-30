"use strict";
exports.__esModule = true;
exports.User = void 0;
var User = /** @class */ (function () {
    function User(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    User.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return User;
}());
exports.User = User;
// let userObj = new User('Mark', 'Smith');
// userObj.getFullName();

const employee = {
    firstName : 'Mark',
    lastName : 'Smith',
    getFullName : function(){
        {
            console.log(this)
            return this.firstName + '' + this.lastName;
        }
    }
}

employee.getFullName();

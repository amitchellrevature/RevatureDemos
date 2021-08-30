import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
   styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public names = ['Mark', 'Paul', 'Watson', 'John', 'Stacy'];


  public employees = [
    { id: 1, name: 'Mark', gender: 'Male', email: 'm@gmail.com' },
    { id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com' },
    { id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com' },
    { id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com' },
    { id: 2, name: 'Paul', gender: 'Male', email: 'p@gmail.com' },
    { id: 3, name: 'Watson', gender: 'Male', email: 'w@gmail.com' },
    { id: 4, name: 'Stacy', gender: 'Female', email: 's@gmail.com' }
  ]


  constructor() { }

  ngOnInit(): void {
  }



}

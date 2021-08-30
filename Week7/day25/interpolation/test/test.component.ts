import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  
  <h1>Test Component</h1>
  <h1>Hello Mark</h1>
  <h1>Hello {{firstName}}</h1>
  <h1>{{ 10 + 20 + 30 }}</h1>
  <h1>Welcome {{firstName}}</h1>
  <h1>{{ 'Welcome ' + firstName }}</h1>
  <h1>{{ message.length  }}</h1>
  <h1>{{ message.toUpperCase() }}</h1>
  <h1>{{ greetUser() }}</h1>
  
  
  
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  //public name: string = 'Paul';
  //name: string  ='Paul';
  public firstName = 'Paul';
  public message = 'This is angular training';

  greetUser(){
    return 'Hi! '+ this.firstName;
  }

  constructor() { }

  ngOnInit(): void {
  }

}

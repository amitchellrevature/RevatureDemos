import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  // templateUrl: './test.component.html'
  template: `
  <h1 style="color: red">Heading</h1>
  <h1 [style.color]="hasError ? 'red' : 'green'">Somr Heading</h1>
  <h1 [style.color]="specialColor" >Some Other heading</h1>
  <h1 [ngStyle]="customStyle" >Custmom Style</h1>
  `,
  styles: [`
   
  
  `]
  // styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  hasError = false;
  specialColor  = '#999999'
  public customStyle = {
    color: 'blue',
    fontStyle: 'italic'
  }

  constructor() { }

  ngOnInit(): void {
  }



}

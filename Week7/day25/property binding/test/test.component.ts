import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  
  <img src="https://1000logos.net/wp-content/uploads/2021/05/Google-logo.png" width="200" />

  <img [src]="image" width="200"/>

  <img src={{image}} width="200" />
  <br>
  <button disabled>Button</button>
  <button disabled="{{ isDisabled }}">Button - interpolation</button>
  <button [disabled]="isDisabled" >Button - property binding</button>
  
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public isDisabled = false;
  public image = 'https://1000logos.net/wp-content/uploads/2021/05/Google-logo.png';


  constructor() { }

  ngOnInit(): void {
  }

}

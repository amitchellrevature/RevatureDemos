import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  // templateUrl: './test.component.html'
  template: `
  <h1 class="text-success" >Heading 1</h1>
  <h1 [class]="successClass">Some Heading</h1>
  <br>
  <h1 [class.text-danger]="hasError" >Somr Other Heading</h1>
  <input type="text" class="form-control" [class.is-invalid]="hasError" />
  <h1 [ngClass]="customStyle" >Cusom Heading</h1>
  
  `,
  styles: [`
    .text-success{
      color: green
    }
    .text-danger{
      color: red
    }
    .text-special{
      font-style: italic
    }
  
  `]
  // styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
    public hasError = false;
    public isSpecial = true;
    public successClass = 'text-success';

  constructor() { }

  ngOnInit(): void {
  }

  public customStyle = {
    'text-success': !this.hasError,
    'text-danger': this.hasError,
    'text-special': this.isSpecial
  }


}

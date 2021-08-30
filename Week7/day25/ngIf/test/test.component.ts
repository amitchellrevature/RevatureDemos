import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
   styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  public display = false;
  public isLoggedIn = false;

  constructor() { }

  ngOnInit(): void {
  }



}

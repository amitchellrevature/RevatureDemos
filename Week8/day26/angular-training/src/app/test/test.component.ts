import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  
  childData =  0;

  @Output()
  childEvent = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  onButtonClick(){
    this.childData++;
    this.childEvent.emit(this.childData)
  }

  onButtonClick2(){
    this.childData--;
    this.childEvent.emit(this.childData)
  }

}

import { Component, OnInit, Input, Output, EventEmitter, OnChanges} from '@angular/core';

@Component({
  selector: 'app-test2',
  templateUrl: './test2.component.html',
  styleUrls: ['./test2.component.css']
})
export class Test2Component implements OnChanges {

  @Input()
  childData = '';



  ngOnChanges(): void{
    this.childData =  this.childData;

  }
  

  constructor() { }

  ngOnInit(): void {
  }

}
import { Component, OnInit, Input } from '@angular/core';
import { Time } from '@angular/common';

@Component({
  selector: 'app-countdown-time',
  templateUrl: './countdown-time.component.html',
  styleUrls: ['./countdown-time.component.scss']
})
export class CountdownTimeComponent implements OnInit {
  private intervalId =0;
  message='';
  remainingTime:number;
  @Input()
  seconds = 11;
  clearTimer(){
    clearInterval(this.intervalId);
  }

  constructor() { }

  ngOnInit() {
    this.reset(); 
    this.start();
  }
  ngOnDestroy(){
    this.clearTimer();
  }
  start() {
    this.countDown();
    if(this.remainingTime<=0){
      this.remainingTime= this.seconds;
    }
  }
  reset() {
    this.clearTimer();
    this.remainingTime= this.seconds;
    this.message='Click start button to start the CountDown';
    
  }
  stop(){
    this.clearTimer();
    this.message = `Holding at T-${this.remainingTime} seconds`;
  }
  private countDown(){
    this.clearTimer();
    this.intervalId= window.setInterval(() =>{
      this.remainingTime -= 1;
      if(this.remainingTime ===0){
        this.message = 'Blast off!';
        this.clearTimer();
      }else{ 
        this.message = `T-${this.remainingTime} seconds and counting`;
       }
    },1000);
  } 
}

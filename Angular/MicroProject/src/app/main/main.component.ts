import { Component } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  Stuname:string;
  Stuid:string;
  Couname:string;
  Fees:string;
  detail:string;
  dis:string[];


  constructor(){
    this.Stuname="";
    this.Stuid="";
    this.Couname="";
    this.Fees="";
    this.detail="";
    this.dis=[];
  }

  savedetails(){
    this.detail="";
    this.detail+=this.Stuname+"-";
    this.detail+=this.Stuid+"-";
    this.detail+=this.Couname+"-";
    this.detail+=this.Fees+"";
    this.dis.push(this.detail);
    console.log(this.detail);
  }
}

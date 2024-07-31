import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  flag :boolean;
 fla:boolean;
 vehicles:string[];
 selectedVehicle:string;
 myStyle:{};
 myClass:string;

 constructor(){
  this.flag=true;
  this.fla=true;
  this.vehicles=["TwoWheeler","ThreeWheeler","FourWheeler"];
  this.selectedVehicle="";
  this.myStyle={'width' : '30%','height':'20%', 'border':'2px solid green ' , 'border-radius':'25px' };
  this.myClass="MyClass1";
 }
 changeFlag(){
  this.flag= ! this.flag;
 }
 change(){
  this.fla= ! this.fla;
 }
 setSelectedItem(vec:string){
  this.selectedVehicle=vec;
 }
 changeStyle(){
  this.myStyle={'width' : '30%','height':'20%', 'border':'3px solid blue ' , 'border-radius':'25px' };
 }
 changecolor(){
  this.myClass="MyClass2";
 }
}


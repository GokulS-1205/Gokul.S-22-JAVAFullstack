import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';
import { FactorialService } from './factorial.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  /*flag :boolean;
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
 }*/
sum : number;
sub : number;
multi: number;
fact: number;
constructor(private calc:CalculatorService,private f:FactorialService){
  this.sum = calc.getAddition(10, 20);
  this.sub = calc.getSubraction(30, 20);
  this.multi = calc.getMultiplication(5, 8);
  this.fact = f.getfactorial(5);
}
}


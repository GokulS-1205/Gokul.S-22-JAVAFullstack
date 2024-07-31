import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name:string;
  age:number;
  email:string;
  imagePath: string;
  fname:string;
  constructor(){
             this.name = "Gokul";
             this.age = 21;
             this.email = "gokulsece2022@ksrce.ac.in";
             this.imagePath= "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbMOg-XamfZA3fV6BPO18Xxkdq85_dWbM1BA&s"
             this.fname="";
  }
  ChangeName(){
    this.name = "karthi";
  }
  ChangeAge(){
    this.age = 231;
  }
  ChangeEmail(){
    this.email = "karthi@gmail.com"
  }
  ChangeImage(){
    this.imagePath="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0N5oKYW3RlzwHqVtRT5bGDr7L1UX5ezDszg&ss"
  }
  }


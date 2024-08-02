import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // title:'EmployeeMS';
  employee : Employee;//model class
  v:string
  result : string;
  

  constructor(private service : EmployeeService){
    this.employee = new Employee();
    this.v="";
    this.result="";

  }

  insertEmployee(data: any){
    this.employee.id = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    alert(data.empId+ " " +data.empName+ " " +data.empSalary);
    this.v=data.empId+ " " +data.empName+ " " +data.empSalary;
    // console.log(data.empId);
    this.service.insertEmployee(this.employee);
    this.result = this.service.insertEmployee(this.employee);
  }
}

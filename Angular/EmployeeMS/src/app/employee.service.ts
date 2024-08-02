import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url:string;
  // employeeArr : Employee[];
  // employee : Employee;
  constructor(private http: HttpClient) {//for to get services
    this.url="http://localhost:3004/employees";
    // this.employee= new Employee();
    // this.employeeArr = [];
   }
  insertEmployee(employee : Employee){
    this.http.post<Employee>(this.url,employee).subscribe();
    return "Employee Details Added";
  }
}

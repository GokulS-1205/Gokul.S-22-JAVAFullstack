import { Injectable } from '@angular/core';

@Injectable()
  // {providedIn: 'root'}
export class FactorialService {
getfactorial(a:number){
  let b=1;
  for(let i=1;i<=a;i++){
    b=b*i;
  }
return b;
}
  // constructor() { }
}

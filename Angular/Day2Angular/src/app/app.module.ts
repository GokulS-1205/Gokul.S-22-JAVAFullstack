import { Component, NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { FormsModule } from '@angular/forms';
import {RouterModule,Routes} from '@angular/router';
import { CalculatorService } from './calculator.service';
import { ChildComponent } from './child/child.component';
import { FactorialService } from './factorial.service';

const ROUTES:Routes = [
  {path: 'home', component:HomeComponent},
  {path: 'contact', component:ContactComponent},
  {path:'about' ,component:AboutComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [
    // provideClientHydration()
    CalculatorService,
    FactorialService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

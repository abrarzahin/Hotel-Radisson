import { Component } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms'
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'client';
  constructor(private http:HttpClient) {}

  private baseUrl:string = 'http://localhost:7000';
  private reservationUrl:string = this.baseUrl + '/room/v1/reservation/';
}

import { Component } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ReservationService} from './reservation.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'client';

  constructor(private reservationService: ReservationService){}

  rooms: Room[];

  ngOnInit() {
    this.rooms = [ new Room("127", "127", "150"),
    new Room("138", "138", "180"),
    new Room("254", "254", "200")
    ];
  }

  
}

export class Room {
  id: string;
  roomNumber: string;
  price: string;

  constructor(id: string, roomNumber: string, price: string) {
    this.id = id;
    this.roomNumber = roomNumber;
    this.price = price;
  }

}




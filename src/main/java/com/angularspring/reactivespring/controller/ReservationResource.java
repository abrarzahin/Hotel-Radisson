package com.angularspring.reactivespring.controller;

import com.angularspring.reactivespring.model.Reservation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
@CrossOrigin
public class ReservationResource {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    @GetMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<String> getReservationById(@PathVariable String roomId) {

        //reservationService.getReservation(roomId);

        return Mono.just("{get works}");
    }
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<String> createReservation(@RequestBody Mono<Reservation> reservation) {

        return Mono.just("{post works}");
    }
    @PutMapping (path= "{roomId}", produces= MediaType.APPLICATION_JSON_UTF8_VALUE,
                consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<String> updatePrice (@PathVariable String roomId,
                                     @RequestBody Mono<Reservation> reservation){
        return Mono.just("{put works}");
    }

    @DeleteMapping(path = "{roomId}")
    public Mono<Boolean> deleteReservation(@PathVariable String roomId){
        return Mono.just(true);
    }

}

package com.hackaton.cardsgame.controller;

import com.hackaton.cardsgame.model.Room;
import com.hackaton.cardsgame.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/rooms")
@AllArgsConstructor
public class RoomController {

    private final RoomRepository roomRepository;

    @GetMapping
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @GetMapping(value = "/{uuid}")
    public Room getRoom(@PathVariable UUID uuid) {
        return roomRepository.getOne(uuid);
    }

    @PostMapping
    public Room save(@RequestBody Room room) {
        return roomRepository.save(room);
    }

}

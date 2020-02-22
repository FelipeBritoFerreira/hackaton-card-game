package com.hackaton.cardsgame.controller;

import com.hackaton.cardsgame.model.Room;
import com.hackaton.cardsgame.repository.RoomRepository;
import com.hackaton.cardsgame.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "{uuid}")
    public Room getRoom(@PathVariable UUID uuid) {
        return roomRepository.getOne(uuid);
    }

    @PostMapping
    public void save(@RequestBody Room room) {
        roomRepository.save(room);
    }

}

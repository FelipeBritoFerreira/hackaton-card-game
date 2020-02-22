package com.hackaton.cardsgame.controller;

import com.hackaton.cardsgame.model.Room;
import com.hackaton.cardsgame.model.User;
import com.hackaton.cardsgame.repository.RoomRepository;
import com.hackaton.cardsgame.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    private final UserRepository userRepository;

    @GetMapping
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @GetMapping(value = "/{uuid}")
    public Room getRoom(@PathVariable UUID uuid) {
        return roomRepository.getOne(uuid);
    }

    @PostMapping
    public Room create(@RequestBody Room room) {
        return roomRepository.save(room);
    }

    @PutMapping(value = "{uuid}/users/{userId}")
    public Room addUser(@PathVariable UUID uuid, @PathVariable UUID userId) {
        User user = userRepository.getOne(userId);
        Room room = roomRepository.getOne(uuid);
        room.getUsers().add(user);
        return roomRepository.save(room);
    }

}

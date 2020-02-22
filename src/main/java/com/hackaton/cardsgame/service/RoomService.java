package com.hackaton.cardsgame.service;

import com.hackaton.cardsgame.model.Room;
import com.hackaton.cardsgame.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public void save(Room room) {
        roomRepository.save(room);
    }




}

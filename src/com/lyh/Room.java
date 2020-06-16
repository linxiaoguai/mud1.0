package com.lyh;

import com.lyh.creature.Creature;

import java.util.HashMap;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/6/7 12:18
 * @version: v1.0
 */
public class Room {
    private String id;
    private String description;
    private HashMap<String, Room> reachableRooms = new HashMap();
    private Creature creature;

    public  void addReachableRoom(String roomId,Room room){
        this.reachableRooms.put(roomId, room);
    }
    public Room searchReachableRoomById(String targetRoomId, HashMap<String, Room> reachableRooms) {
        Room room = null;
        if (reachableRooms.containsKey(targetRoomId)) {
            room = (Room)reachableRooms.get(targetRoomId);
        }

        return room;
    }
    public String toString() {
        return this.description;
    }

    public Room() {
    }

    public Room(String id, String description, HashMap<String, Room> reachableRooms, Creature creature) {
        this.id = id;
        this.description = description;
        this.reachableRooms = reachableRooms;
        this.creature = creature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Room> getReachableRooms() {
        return reachableRooms;
    }

    public void setReachableRooms(HashMap<String, Room> reachableRooms) {
        this.reachableRooms = reachableRooms;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}

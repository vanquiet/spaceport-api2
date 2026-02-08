package com.spaceport.spaceportapi.patterns;

import com.spaceport.spaceportapi.model.BaseEntity;
import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.model.Ship;

public class EntityFactory {

    public static BaseEntity create(String type, String name, String extra) {
        return switch (type) {
            case "PILOT" -> new Pilot(name, extra);
            case "SHIP" -> new Ship(name, Double.parseDouble(extra));
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}

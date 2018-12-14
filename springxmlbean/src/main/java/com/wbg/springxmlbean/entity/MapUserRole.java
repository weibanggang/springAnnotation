package com.wbg.springxmlbean.entity;

import java.util.Map;

public class MapUserRole {
    private Map<User,Role> map;

    @Override
    public String toString() {
        return "MapUserRole{" +
                "map=" + map +
                '}';
    }

    public Map<User, Role> getMap() {
        return map;
    }

    public void setMap(Map<User, Role> map) {
        this.map = map;
    }
}

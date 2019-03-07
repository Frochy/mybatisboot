package com.frochy.util;


import com.frochy.entity.User;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class GSonTool {
    static Gson gs = new Gson();

    public static String userToJson(User user) {
        return gs.toJson(user);
    }

    public static String usersToJson(List<User> users) {
        return gs.toJson(users);
    }

    public static List<User> jsonToUser(String jsonStr) {
        return gs.fromJson(jsonStr, ArrayList.class);
    }
}

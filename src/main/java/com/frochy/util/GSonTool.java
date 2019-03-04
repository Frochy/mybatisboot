package com.frochy.util;


import com.frochy.entity.User;
import com.google.gson.Gson;

public class GSonTool {
    static Gson gs = new Gson();

    public static String userToJson(User user){
        return gs.toJson(user);
    }

    public static User jsonToUser(String jsonStr){
        return gs.fromJson(jsonStr,User.class);
    }
}

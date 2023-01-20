package org.example;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<>();

    public IDandPasswords() {
        logininfo.put("Bro", "Pizza");
        logininfo.put("Brometheus", "PASSWORD");
        logininfo.put("BrocODE", "abc123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}

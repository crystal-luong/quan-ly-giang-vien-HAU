/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class UserDAO {
    List<User> ls = new ArrayList<>();
    
    public UserDAO() {
        ls.add(new User("admin", "12345", true));
        ls.add(new User("trieule", "12345", true));
        
    }
    public boolean checkLogin(String username, String pass) {
        for (User u : ls) {
            if(u.getUsername().equals(username)
                    && u.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
}

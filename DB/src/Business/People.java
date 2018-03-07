/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Zuzu
 */
public class People {
    private String name;
    private String email;
    private String nickname;
    
    People(String _name, String _email, String _nickname){
        this.name = _name;
        this.email = _email;
        this.nickname = _nickname;
    }
    
    public String getName(){
        return name;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getNickname(){
        return nickname;
    }
}

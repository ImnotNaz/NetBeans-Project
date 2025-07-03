/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Admin {
    private int id;
    private String name;
    private String username;
    private String password;
    
    public Admin(){}

    public Admin(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void infoAdmin(){
        String pesan = "ID : " + getId() + "\n"
                    + "Nama : " + getName() + "\n"
                    + "Username : " + getUsername() + "\n"
                    + "Password : " + getPassword() + "\n";
        
        JOptionPane.showMessageDialog(null, "Data Admin berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);  
        JOptionPane.showMessageDialog(null, pesan, "Admin", JOptionPane.INFORMATION_MESSAGE);    
    }
}

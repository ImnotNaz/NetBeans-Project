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
public class PanduanTataCaraBerwudhu {
    private String judul;
    private String keterangan;
    private String information;
    
    public PanduanTataCaraBerwudhu(){}

    public PanduanTataCaraBerwudhu(String judul, String keterangan, String information) {
        this.judul = judul;
        this.keterangan = keterangan;
        this.information = information;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    
    public void infoBerwudhu(){
        String pesan = "Judul : " + getJudul() + "\n"
                    + "Keterangan : " + getKeterangan() + "\n"
                    + "Informasi : " + getInformation() + "\n";
        
        JOptionPane.showMessageDialog(null, "Data Panduan Tata Cara Berwudhu berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);  
        JOptionPane.showMessageDialog(null, pesan, "Panduan Tata Cara Berwudhu", JOptionPane.INFORMATION_MESSAGE);    
    }
}

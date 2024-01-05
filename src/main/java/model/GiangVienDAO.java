/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class GiangVienDAO {
    List<GiangVien> ls = new ArrayList<>();
    public int add(GiangVien gv) {
        ls.add(gv);
        return 1;
    }
    public List<GiangVien> getAllGiangVien(){
        return ls;
    }
    public int delGiangVienByID(String ma){
        for (GiangVien gv : ls) {
            if(gv.getMaGV().equalsIgnoreCase(ma)) {
                ls.remove(gv);
                return 1;
            }
        }
        return -1;
    }
    public GiangVien getGiangVienByID(String id){
        for(GiangVien gv : ls) {
            if(gv.getMaGV().equalsIgnoreCase(id)) {
                return gv;
            }
        }
        return null;
    }    
}

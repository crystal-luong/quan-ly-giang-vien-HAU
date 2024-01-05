/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class GiangVien {
    private String maGV;
    private String tenGV;
    private Date ngaySinh;
    private String email;
    private boolean gioiTinh;
    private String diaChi;
    private String hinhAnh;
    public Object getNgaySinh;

    public GiangVien(String maGV, String tenGV, Date ngaySinh, String email, boolean gioiTinh, String diaChi, String hinhAnh) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hinhAnh = hinhAnh;
    }
     public GiangVien(){
         
     }

   

    



    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    
    
}

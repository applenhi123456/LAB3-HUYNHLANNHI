/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector cong(Vector v) {
        return new Vector(x + v.getX(), y + v.getY(), z + v.getZ());
    }

    public Vector tru(Vector v) {
        return new Vector(x - v.getX(), y - v.getY(), z - v.getZ());
    }

    public Vector nhanVoiHangSo(double a) {
        return new Vector(a * x, a * y, a * z);
    }

    public double nhanVoHuong(Vector v) {
        return x * v.getX() + y * v.getY() + z * v.getZ();
    }
}
package com.antGr;

import java.util.Objects;
//класс определяет координаты точки в пространстве
//и имеет доп. методы для вычисления расстояний между точками и проверки идентичности 2 объектов данного типа
public class Point3D {
    private double x;
    private double y;
    private double z;

    //перегрузки конструкторов
    Point3D(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //геттеры-сеттеры для приватных полей класса
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

    //метод проверяет идентичность объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.getX(), getX()) == 0 &&
                Double.compare(point3D.getY(), getY()) == 0 &&
                Double.compare(point3D.getZ(), getZ()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }
    //вычисление расстояния между 2 точками
    public double distanseTo(Point3D otherPoint3D){
        double x1 = otherPoint3D.getX();
        double y1 = otherPoint3D.getY();
        double z1 = otherPoint3D.getZ();
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)+Math.pow(z-z1,2));
    }
}

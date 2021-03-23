package com.antGr;

public class Main {

    //ввод 3 3D точек, создание по ним 3 объектов Point3d
    public static void main(String[] args) {
        double point1_x=0, point1_y=0, point1_z=0;
        double point2_x=1, point2_y=2, point2_z=3;
        double point3_x=158, point3_y=256, point3_z=800;
        double testPoint_x=0, testPoint_y=0, testPoint_z=1;

        //System.out.println("Please input 3 coordinates for first point: \n");

        Point3D point3D_1 = new Point3D(point1_x,point1_y,point1_z);
        Point3D point3D_2 = new Point3D(point2_x,point2_y,point2_z);
        Point3D point3D_3 = new Point3D(point3_x,point3_y,point3_z);
        Point3D testpoint3D = new Point3D(testPoint_x,testPoint_y,testPoint_z);

        System.out.println("\nInput coordinates: \npoint1 =  " + point1_x + ";" + point1_y + ";" + point1_z + "." +
                "\npoint2 =  " + point2_x + ";" + point2_y + ";" + point2_z + "." +
                "\npoint3 =  " + point3_x + ";" + point3_y + ";" + point3_z+ ". \n");

        if (point3D_1.equals(point3D_2)||point3D_1.equals(point3D_3)||point3D_3.equals(point3D_2)) {
            System.out.println("\n the triangle1 has zero area. \n");
        }else{
            double triangleSquare1 = computeArea(point3D_1,point3D_2,point3D_3);
            double triangleSquare2 = computeArea(testpoint3D,point3D_2,point3D_3);
            double triangleSquare3 = computeArea(point3D_1,testpoint3D,point3D_3);
            double triangleSquare4 = computeArea(point3D_1,point3D_2,testpoint3D);
            System.out.println("the triangle has area = " + triangleSquare1);
            System.out.println("the triangle has area = " + triangleSquare2);
            System.out.println("the triangle has area = " + triangleSquare3);
            System.out.println("the triangle has area = " + triangleSquare4);
        }
    }
    //вычисление площади треугольника по формуле Герона
    public static double computeArea(Point3D point3D_1, Point3D point3D_2, Point3D point3D_3){
        double a = point3D_1.distanseTo(point3D_2);
        double b = point3D_2.distanseTo(point3D_3);
        double c = point3D_3.distanseTo(point3D_1);
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        double scale = Math.pow(10, 2);
        return Math.ceil(s * scale) / scale;
    }
}

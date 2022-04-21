package com.gmail.cyrusmahle24;

public class Circle{

  private float radius;
  private int x;
  private int y;

  public double pi=3.14;

public Circle(float radius,int x,int y){

this.x=x;
this.y=y;
this.radius=radius;

}
public void setX(int x){
   this.x=x;
}

public void setY(int y){
   this.y=y;
}

public void setRadius(float radius){
   this.radius=radius;
}

public float getRadius(){
    return radius;
}

public int getX(){
   return x;
}

public int getY(){
    return y;
}

void calculateArea(){

   System.out.println("Area : "+pi*(getRadius()*getRadius()));
}

void calculateCircumference(){

  System.out.println("Circumference : "+2*pi*radius);

}


void calculateDiameter(){

 System.out.println("Diameter : "+getRadius()+getRadius());

}


}
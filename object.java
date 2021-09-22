import java.util.*;

class Car{
int wheel;
float price;
String color;
void start(){
System.out.println("Car Start");
}
void appliedGear(){
System.out.println("Applied Gear");
}
void moving(){
System.out.println("Car is moving");
}
void stop(){
System.out.println("Car Stop");
}
}
class object{
public static void main(String args[]){
Car innova = new Car();
innova.start();
innova.stop();
}
}

    

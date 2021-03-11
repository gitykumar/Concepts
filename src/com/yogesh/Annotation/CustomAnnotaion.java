package com.yogesh.Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ElectricCar{
	
	int battery () default 9999;
	String bodyType () default "Saloon";
	
}

@ElectricCar //(battery = 100000, bodyType = "SUV")
class Car{
	
	String manufacture;
	int price;
	public Car(String manufacture, int price) {
		super();
		this.manufacture = manufacture;
		this.price = price;
	}
	
		
}



public class CustomAnnotaion {

	public static void main(String[] args) {

		Car car = new Car("Tata", 1500000);
		
		Class c = car.getClass();
		Annotation ant = c.getAnnotation(ElectricCar.class);
		ElectricCar ec = (ElectricCar) ant;
		System.out.println("Make :"+car.manufacture+", Price: "+car.price+"lakh, Battery Capacity: "+ec.battery()+"-Ah and BodyType:"+ec.bodyType());
		
		
		
		
	}

}

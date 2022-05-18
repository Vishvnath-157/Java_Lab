class RaceTrack{
	public static void main(String... args){
	
	Car c1=new Car(2010, "Porche",25.0);
	System.out.println("Manufacturing year :"+ c1.getYear());
	System.out.println("Car maker :" +c1.getMake());
	System.out.println("Car Speed :" +c1.getSpeed());
	
	c1.Accelerate();
	System.out.println("Car Updated Speed :" +c1.getSpeed());
	
	
	
	}


}
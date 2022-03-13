package activities;

interface BicycleParts{
	public int gears = 0;
	public int speed = 0;
	
}
interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);	
}
class Bicycle implements BicycleParts,BicycleOperations{
	public int gears;
    public int speed;
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.speed = currentSpeed;
    }
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
		System.out.println("current speed :"+speed);
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed +increment;
        System.out.println("Current speed: " + speed);
		
	}
	public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
}
}
	
	class MountainBike extends Bicycle {
	    public int seatHeight;
	    public MountainBike(int gears, int currentSpeed, int startHeight) {
	        super(gears, currentSpeed);
	        seatHeight = startHeight;
	    }
	    public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    public String bicycleDesc() {
	        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	    }  
	}
public class Activity7 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
	}

}


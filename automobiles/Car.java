package automobiles;

public class Car {
     public int seats;
     public int wheels;
     public String carName;
     public boolean KeyStatus;
     
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public boolean isKeyStatus() {
		return KeyStatus;
	}

	public void setKeyStatus(boolean keyStatus) {
		KeyStatus = keyStatus;
	}

}

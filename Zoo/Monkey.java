package Zoo;

public class Monkey {
	public String color;
	public float weight;
	public int age;
	public Monkey()
	{
	}
	public Monkey(String color,float weight,int age)
	{
	this.color=color;
	this.weight=weight;
	this.age=age;
	}
	public boolean isVegetarian()
	{
	return true;
	}
	public boolean canClimb()
	{
	return true;
	}
	public void getSound()
	{
	System.out.println("barks");
	}
	}
	/*public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}  }*/



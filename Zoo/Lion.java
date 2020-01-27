package Zoo;

public class Lion {

public String color;
public float weight;
public int age;
public Lion()
{
}
public Lion(String color,float weight,int age)
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
return false;
}
public void getSound()
{
System.out.println("Roars");;
}
}


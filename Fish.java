//Author : Muhammad Rizqi Bin Khairul Nizam
public class Fish {

//attribute of data member of fields
private String color ="blue"; //default value

//method
public void Swim () {
	System.out.println(color + " fish swim");

}
//setter / mutator method
public void SetColor(String warna){
	color=warna;

	
}
//getter / accessor method
public String GetColor()
	{
		return color;
	}
}
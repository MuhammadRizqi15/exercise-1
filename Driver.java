//Author : Muhammad Rizqi Bin Khairul Nizam
public class Driver {

	public static void main(String[]arg){
		//fish jadi datatype sebab sebelah jadi public class
		//Fish nemo; == int x; boleh je buat macam ni
		//jadi macam di bawah ni sebab public dan selepas new mesti letak balik public sebelum ini dan ()
		Fish nemo = new Fish(); //nemo ada object, Fish adalah class

		//nak panggil biasanya ..() tapi java kena panggil class mana 
		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();
		nemo.Eat();// superclass call subclass method 


		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish(); // jenis ikan yang lain
		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		Aquarium fancyAquarium = new Aquarium();
		fancyAquarium.fillFish();

	}
}
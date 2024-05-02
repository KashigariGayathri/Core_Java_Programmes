package oopsConceptExamples;

public class Dogs {
	String dogbreed;
	long price;
	
	public Dogs(String name, int price1)
	{
		dogbreed=name;
		price=price1;
	}
	public Dogs()
	{
		dogbreed="German Shepherd";
		price=50000;
		
	}

	public String getDogbreed() {
		return dogbreed;
	}
	public void setDogbreed(String dogbreed) {
		this.dogbreed = dogbreed;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void display()
	{
		System.out.println(dogbreed+ " : "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs dogs=new Dogs("BullDog",30000);
		dogs.display();
		Dogs dogs1=new Dogs("Poodle",75000);
		dogs1.display();
		Dogs dogs2=new Dogs();
		dogs2.display();
		

	}

}

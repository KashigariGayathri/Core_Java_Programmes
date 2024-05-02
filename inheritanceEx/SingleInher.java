package inheritanceEx;
class Category{
	   String cname="Electronics";
		 void disCategory() {
			System.out.println("category class ");
		}
	}

	class Item extends Category{
		private String cname="Laptops";
		void disItem() {
			System.out.println("category class : " +super.cname);
			System.out.println("Item class : " +cname);
		}
	}

public class SingleInher {
	public static void main(String[] args) {
			Item i=new Item();
			i.disItem();
			i.disCategory();


	}

}

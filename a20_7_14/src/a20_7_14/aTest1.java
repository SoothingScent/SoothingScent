package a20_7_14;


public class aTest1 {
	
	void main(String[] args) {
		ºØ¾î»§ kim;
		kim = new ºØ¾î»§(); // ´Ù¸¥ class È£Ãâ, kim = ºØ¾î»§ ÀÚ·áÇü °´Ã¼
		kim.ÆÏ=2;
		kim.¹ÝÁ×=10;
		kim.¸¸µé±â();
		kim.²¨³»±â();
		
		ºØ¾î»§ lee;
		lee = new ºØ¾î»§();
		lee.ÆÏ=1;
		lee.¹ÝÁ×=5;
		lee.¸¸µé±â();
		lee.²¨³»±â();
	}
	class ºØ¾î»§ {
		int Æ²;
		int ¹ÝÁ×;
		int ÆÏ;

		void ¸¸µé±â() {
		Æ²=¹ÝÁ×+ÆÏ+¹ÝÁ×;
		}

		void ²¨³»±â() {
			System.out.println(Æ²);
		}
	}
}

package a20_8_05;

class Takoyaki {
	int 문어, 야채, 반죽, 가츠오부시, 소스;
	int 타코야끼;
	int 제품;

	void 만들기() {
		타코야끼 = 반죽 + 문어 + 야채 + 반죽;
	}

	void 판매() {
		제품 = 타코야끼 + 가츠오부시 + 소스;
		System.out.println(제품);
	}

	Takoyaki(int 문어, int 야채, int 반죽) {
		this.문어 = 문어;
		this.야채 = 야채;
		this.반죽 = 반죽;
		가츠오부시 = 5;
		소스 = 5;
	}

	Takoyaki() {

	}
}

public class Test {
	public static void main(String[] args) {
		Takoyaki Yuuka = new Takoyaki(10, 10, 35);
		Yuuka.만들기();
		Yuuka.판매();
	}
}

package a20_8_04;

class 중식 {
	중식() {

	}

	중식(int 짜장, int 돼지기름) {
		this.짜장 = 짜장;
		this.돼지기름 = 돼지기름;
	}

	int 짜장, 당면, 버섯, 돼지기름, 그릇;

	void 짜장면() {
		그릇 = 짜장 + 버섯 + 돼지기름;
	}

	void 잡채() {
		그릇 = 당면 + 버섯 + 돼지기름;
	}

	void show() {
		System.out.println(그릇);
	}
}

class 일식 {
	int 참치, 간장, 우럭, 광어, 그릇;

	일식(Object obj) {
		if (obj instanceof 한식) {
			한식 kor = (한식) obj;
			kor.비빔밥(200);
			kor.show();
		} else if (obj instanceof 중식) {
			중식 chn = (중식) obj;
			chn.잡채();
			chn.show();
		}
	}

	일식(int 우럭, int 간장) {
		this.우럭 = 우럭;
		this.간장 = 간장;
	}

	void 회덮밥() {
		그릇 = 우럭 + 광어 + 간장;
	}

	void 초밥(int 밥) {
		그릇 = 밥 + 우럭 + 참치 + 간장;
	}

	void show() {
		System.out.println(그릇);
	}
}

public class 한식 {
	int 마늘, 김치, 계란, 그릇;

	void 비빔밥(int 밥) {
		그릇 = 마늘 + 김치 + 계란 + 밥;
	}

	void show() {
		System.out.println(그릇);
	}

	public static void main(String[] args) {
		일식 japan = new 일식(100, 2);
		중식 china = new 중식(50, 30);

		japan.회덮밥();
		japan.show();

		china.잡채();
		china.show();

		한식 korea = new 한식();

		korea.비빔밥(300);
		korea.show();

		일식 ilhan = new 일식(new 한식());
		일식 iljung = new 일식(new 중식());
	}
}

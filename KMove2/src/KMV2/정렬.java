package KMV2;

//SelectSort() 오름차순정렬
//SelectSort_R() 내림차순정렬
//BubbleSort() 버블정렬
//boolean BinarySearch(int a[], int key) return -> true||false
public class 정렬 {
	public void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	public void SelectSort(int a[]) {
		int i, j;
		int len = a.length;
		int temp;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// swap(a[i], a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void SelectSort_R(int a[]) {
		int i, j;
		int len = a.length;
		int temp;
		for (i = 0; i < len - 1; i++) {
			for (j = i + 1; j < len; j++) {
				if (a[i] < a[j]) {
					// swap(a[i], a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void BubbleSort(int a[]) {
		int i, j;
		int len = a.length - 1;
		int temp;
		for (i = 0; i < len; i++) {
			for (j = 0; j < len - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public void BubbleSort_R(int a[]) {
		int i, j;
		int len = a.length - 1;
		int temp;
		for (i = 0; i < len; i++) {
			for (j = 0; j < len - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public void prn(int a[]) {
		int i;
		int len = a.length;
		for (i = 0; i < len; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public boolean BinarySearch(int a[], int key) {
		BubbleSort(a);
		int h = a.length - 1, l = 0, m = 0;
		do {

			if (l > h) {
				return false;
			} else {
				m = (l + h) / 2;
				if (key == a[m]) {
					return true;
				} else {
					if (key < a[m])
						h = m - 1;
					else
						l = m + 1;
				}
			}
		} while (true);
	}
}

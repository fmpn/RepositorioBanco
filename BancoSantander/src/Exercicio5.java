
public class Exercicio5 {

		public static void main(String[] args) {
			int x = 10;
			int[] a = {4, 2, 5, 1, 10};
			boolean achou = false;
			int i = 0;
			while (achou == false && i < a.length) {
				if (a[i] == x) {
					achou = true;
				}
			}
			System.out.println(achou);
		}
}

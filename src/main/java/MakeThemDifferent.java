import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MakeThemDifferent {

	static Integer removeCoin1;
	static Integer increaseCoin2;
	static Integer coinUsedCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		removeCoin1 = sc.nextInt();
		increaseCoin2 = sc.nextInt();

		List<Integer> input = new ArrayList();
		for (int i = 0; i < n; i++) {
			input.add(sc.nextInt());
		}
		
		List<Integer> output = new ArrayList();
		
		Iterator<Integer> iterator = input.iterator();
		makeItDifferent(iterator, input, output);
		
//		List<Integer> hs = new ArrayList();
//		for (Integer number : input) {
//			if (hs.contains(number)) {
//				int diffN = makeItDifferent(hs, number);
//			} else {
//				hs.add(number);
//			}
//		}
		
		System.out.println(coinUsedCount);
		System.out.println("=====================");
//		for (Integer integer : hs) {
//			System.out.print(integer + " ");
//		}
		System.out.println("=====================");
	}
	private static void makeItDifferent(Iterator<Integer> iterator, List<Integer> input, List<Integer> output) {
		int i = 0 ;
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (output.contains(integer)) {
				iterator.remove();
				coinUsedCount += removeCoin1;
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (input.contains(output.get(j))) {
							coinUsedCount += increaseCoin2;
							Integer oj = output.get(j);
							oj--;
							while (input.contains(oj)) {
								oj--;
							}
							output.remove(j);
							output.add(j, oj);
						}
					}
				}
			} else {
				i++;
				output.add(integer);
			}
		}
	}
	
	private static int makeItDifferent(List<Integer> hs, int number) {

		int newNumber;
		if (hs.contains(number)) {
			newNumber = number + 1;
			coinUsedCount += increaseCoin2;
			int makeItDifferent = makeItDifferent(hs, newNumber);
			return makeItDifferent;
		} else {
			return number;
		}
	}

}

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamSorted {

	public static void main(String[] args) {
		//Natural Sorting Order
		Stream<String> str = Stream.of("ert","3","yt","s","8765");
		Stream<Integer> in = Stream.of(6654,987,123,9089);
		List<String> naturalOrder = str.sorted().collect(Collectors.toList());
		System.out.println("Natural Sorted Order: "+naturalOrder);
		List<Integer> naturalSortedOrder = in.sorted().collect(Collectors.toList());
	    System.out.println(naturalSortedOrder);
	    
	    //Reverse Sorted Order
	    //Once stream is operated, it will close. So, we have to recreate it to use again.
	    str = Stream.of("ert","3","yt","s","8765");
	    in = Stream.of(6654,987,123,9089);
	    List<String> reverseOrder = str.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println("Reverse Sorted Order: "+reverseOrder);
	    List<Integer>  reverseSortedOrder = in.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(reverseSortedOrder);
	    
	}
}

import java.util.ArrayList;
import java.util.List;

public class ParallelCollectionStream {

	public static void main(String[] args) {
		List<String> normalStream = new ArrayList<String>();
		normalStream.add("A");
		normalStream.add("B");
		normalStream.add("C");
		normalStream.add("D");
		normalStream.add("E");
		System.out.println("Normal Streaming");
		normalStream.stream().forEach(System.out::println);
		
		List<String> parallelStream = new ArrayList<String>();
		parallelStream.add("A");
		parallelStream.add("B");
		parallelStream.add("C");
		parallelStream.add("D");
		parallelStream.add("E");
		System.out.println("Parallel Streaming");
		parallelStream.parallelStream().forEach(System.out::println);
	}
}

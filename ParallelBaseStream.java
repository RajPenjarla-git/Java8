import java.util.stream.IntStream;


public class ParallelBaseStream {

	
	public static void main(String[] args) {
		
		//Normal Streaming
		IntStream normalStream = IntStream.rangeClosed(1, 5);
		System.out.println("Normal Streaming");
		normalStream.forEach(System.out::println);
		System.out.println("Is Stream Running in Parallel mode: " + normalStream.isParallel());
		
		//Parallel Streaming
		IntStream parallelStream = IntStream.rangeClosed(6, 10);
		System.out.println("Parallel Streaming");
		parallelStream.parallel().forEach(System.out::println);
		System.out.println("Is Stream Running in Parallel mode: " + parallelStream.isParallel());
		
 	}
}

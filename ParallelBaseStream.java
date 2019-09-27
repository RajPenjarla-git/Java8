import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


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
		
		//Stream.collect() method
		Stream<Integer> intStream = Stream.of(1,2,3,4,5,6);
		System.out.println("Converting Stream to List with intStream.collect(Collectors.toList())");
		List<Integer> streamToList = intStream.collect(Collectors.toList());
		System.out.println(streamToList);
		
		//Stream to Map
		//Stream once operated will close. So, we have to recreate it again
		intStream = Stream.of(7,8,9,10,11,12);
		System.out.println("Converting Stream to Map with intStream.collect(Collectors.toMap(i->i,i->i+10)");
		Map<String,Integer> streamToMap = intStream.collect(Collectors.toMap(m ->m.toString(),m->m*2));
		System.out.println(streamToMap);
		
		//Stream to Array
		System.out.println("Converting Stream to Array with intStream.toArray(Integer[]::new)");
		//Stream once operated will close. So, we have to recreate it again
		intStream = Stream.of(13,14,15,16,17,18);
		Integer[] array = intStream.toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
		
		//Stream count()
		intStream = Stream.of(19,20,21,22,23,24);
		System.out.println("Count no. of elements in the Stream: "+ intStream.count());
	}
}

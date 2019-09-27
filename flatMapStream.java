import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class flatMapStream {

	public static void main(String[] args) {
		Stream<List<String>> streamList = Stream.of(Arrays.asList("Raj"),
				Arrays.asList("Kishore"),
				Arrays.asList("Bachu"));
		//flat to stream from List<String> to Stream<String>
		Stream<String> flatMapStream = streamList.flatMap(argList -> argList.stream());
		flatMapStream.forEach(System.out::println);
	}
}

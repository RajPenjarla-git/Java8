import java.util.Optional;


public class OptionalClass {

	
	public static void main(String[] args) {
		
		String[] string = new String[10];
		//Optional Class
		System.out.println("-------With Optional Class--------");
		Optional<String> withOptionalClass = Optional.ofNullable(string[5]);
		System.out.println("Optional.isPresent() method will return true if value present");
		if(withOptionalClass.isPresent()){
			String value = string[6].toLowerCase();
			System.out.println(value);
		}else{
			System.out.println("string[5] is: "+withOptionalClass);
		}
		
		//Without Optional Class
		System.out.println("-------Without Optional Class--------");
		String withoutOptionalClass = string[4];
		System.out.println("string[4] is: "+ withoutOptionalClass);
		System.out.println("string[4].toUpperCase() will throw NullPointerException :");
		withoutOptionalClass = string[4].toUpperCase();
	}
}

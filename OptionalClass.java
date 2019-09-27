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
		
		//Setting value for Optional at index 4
		 string[4] = "Raj";
		 withOptionalClass = Optional.of(string[4]); //is not null
		 System.out.println("Optional.get() method returns value: "+withOptionalClass.get());
		 System.out.println("Optional.isPresent() method returns true if value present: "+withOptionalClass.isPresent());
		 System.out.println("Optional.hashCode() method returns hashcode: "+withOptionalClass.hashCode());
				
		 
		 //Without Optional Class
		System.out.println("-------Without Optional Class--------");
		String[] str = new String[10];
		String withoutOptionalClass = str[4];
		System.out.println("string[4] is: "+ withoutOptionalClass);
		System.out.println("string[4].toUpperCase() will throw NullPointerException :" +withoutOptionalClass);
		withoutOptionalClass = str[4].toUpperCase();
	}
}

import java.util.Optional;

class ReverseString {
	
	String reverse(String inputString) {
		StringBuilder builder = new StringBuilder(Optional.ofNullable(inputString).orElse(""));
		return builder.reverse().toString();
	}
	
}

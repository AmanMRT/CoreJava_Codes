package ObjectOrientedConcepts.Assignment2;

public class Document{
	
	//class variable
	String text;

	//setter method(mutator) for text variable
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Document [text=" + text + "]";
	}
}
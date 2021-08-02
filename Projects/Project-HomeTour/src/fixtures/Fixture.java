package fixtures;

public abstract class Fixture {
	public String functionalName;
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture(String functionalName, String name, String shortDescription, String longDescription) {
		this.functionalName = functionalName;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
}

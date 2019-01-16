package headfirst.designpatterns.templatemethod.barista;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through example2");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}

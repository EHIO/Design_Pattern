package behavior.templatemethod.example.v1;

/**
 * 咖啡师
 */
public class Barista {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("制作茶...");
        tea.prepareRecipe();
        System.out.println("制作咖啡...");
        coffee.prepareRecipe();
    }
}

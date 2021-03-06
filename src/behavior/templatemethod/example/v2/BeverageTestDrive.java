package behavior.templatemethod.example.v2;

public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n制作茶...");
        tea.prepareRecipe();

        System.out.println("\n制作咖啡...");
        coffee.prepareRecipe();


        // 带有钩子方法的版本
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n制作茶...");
        teaHook.prepareRecipe();

        System.out.println("\n制作咖啡...");
        coffeeHook.prepareRecipe();
    }
}

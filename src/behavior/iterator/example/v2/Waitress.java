package behavior.iterator.example.v2;

import java.util.concurrent.TimeUnit;

/**
 * 女招待
 *
 * @author run
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    /**
     * 打印每份菜单的所有项
     */
    public void printMenu() throws InterruptedException {
        Iterator breakfastIterator = pancakeHouseMenu.createIterator();
        this.printMenu(breakfastIterator);
        TimeUnit.SECONDS.sleep(1);
        System.err.println("----------------------------------");
        Iterator lunchIterator = dinerMenu.createIterator();
        this.printMenu(lunchIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}

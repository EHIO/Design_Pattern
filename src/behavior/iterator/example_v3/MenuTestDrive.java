package behavior.iterator.example_v3;

public class MenuTestDrive {
	public static void main(String[] args) {
		//创建两种菜单
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		//创建女招待
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}

}

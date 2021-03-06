package behavior.state.gumballstate;

/**
 * 未投币状态
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入币了......");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您没有投币");
    }

    @Override
    public void turnCrank() {
        System.out.println("您需要投币");
    }

    @Override
    public void dispense() {
        System.out.println("请先投币");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "未投币";
    }
}

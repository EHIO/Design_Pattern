package behavior.state.gumballstatewinner;

/**
 * 万能糖果机
 */
public class GumballMachine {

    /**
     * 售馨状态
     */
    State soldOutState;
    /**
     * 未投币状态
     */
    State noQuarterState;
    /**
     * 已投币状态
     */
    State hasQuarterState;
    /**
     * 售出状态
     */
    State soldState;
    /**
     * 幸运儿状态
     */
    State winnerState;

    /**
     * 初始化状态：售馨
     */
    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    /**
     * 投币
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退币
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("一个糖果滚出了槽口...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("糖果机器刚刚被重新填满;这是新的计数: " + this.count);
        state.refill();
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n万能糖果机.");
        result.append("\n为你提供服务\n");
        result.append("存货: " + count + " 个糖果");
        result.append("\n");
        return result.toString();
    }
}

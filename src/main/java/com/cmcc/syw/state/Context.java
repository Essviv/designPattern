package com.cmcc.syw.state;

import java.util.Random;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class Context {
    //当前的状态
    private State state;

    //个数
    private int count;

    public static void main(String[] args) {
        Context context = new Context();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            context.setCount(random.nextInt(400) - 200); //-200, 200
            context.sayHello();
        }
    }

    public void sayHello() {
        state.sayHello(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;

        //状态变更
        stateChange();
    }

    //状态变更
    private void stateChange() {
        if (this.count >= 0) {
            state = new FirstStateImpl();
        } else {
            state = new SecondStateImpl();
        }
    }

}

package com.cmcc.syw.state;

/**
 * Created by sunyiwei on 16-1-8.
 */
public class Context {
    private State state;
    private int count;

    public void doSth(){
        if(count++ % 2 == 0){
            state = new FirstStateImpl();
        }else {
            state = new SecondStateImpl();
        }

        state.doSth();
    }

    public static void main(String[] args) {
        Context context = new Context();
        for (int i = 0; i < 10; i++) {
           context.doSth();
        }
    }
}

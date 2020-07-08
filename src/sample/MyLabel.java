package sample;

import javafx.scene.control.Label;

import java.util.concurrent.RecursiveAction;

public class MyLabel extends RecursiveAction implements Runnable {
    private int val1;
    private int val2;
    private Label label1;
    private Label label2;

    public synchronized void setlabels() {
        this.label1.setText(String.valueOf(this.val1));
        this.label2.setText(String.valueOf(this.val2));
    }

    @Override
    protected void compute() {
        this.label1.setText(String.valueOf(this.val1));
        this.label2.setText(String.valueOf(this.val2));
    }

    public void setLabel1(Label label1) {
        this.label1 = label1;
    }

    public void setLabel2(Label label2) {
        this.label2 = label2;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }


    @Override
    public void run() {
        Object object1 = label1, object2 = label2;
        synchronized (object1) {
            synchronized (object2) {
            }
        }
    }
}

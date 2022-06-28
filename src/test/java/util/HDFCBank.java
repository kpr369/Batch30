package util;

import java.util.Comparator;

public abstract class HDFCBank implements RBI, Comparator,Runnable,Cloneable {

    @Override
    public void personalLoan() {
        System.out.println("8.7%");
    }

    @Override
    public void timings() {

        System.out.println("10 to 6PM");
    }

    public static void main(String[] args) {

    }
}

package util;

import java.util.Comparator;

public class SBIBank implements RBI , Runnable,Cloneable, Comparator {
    @Override
    public void personalLoan() {
        System.out.println("10%");
    }

    @Override
    public void timings() {
        System.out.println("10 to 4PM");
    }

    @Override
    public void homeLoan() {

    }

    public static void main(String[] args) {

        RBI rbi = new SBIBank();
        System.out.println(rbi.number);
    }

    @Override
    public void run() {

    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

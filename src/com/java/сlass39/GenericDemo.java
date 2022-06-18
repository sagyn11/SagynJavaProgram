package com.java.сlass39;


class Box {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.setNum(10);
        b2.setNum(20);
        System.out.println(b1.getNum());
    }
}

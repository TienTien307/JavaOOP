package kethua;

import phamvitruycap.ClassA;

public class kethua extends ClassA {
    public void showInfo(){
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        kethua k = new kethua();
        k.showInfo();
    }
}

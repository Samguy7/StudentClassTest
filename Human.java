/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Human {

    protected boolean canTalk;
    protected boolean canWalk;

    public void setcanTalk(boolean canTalk) {
        this.canTalk = canTalk;
        if (this.canTalk) {
            System.out.println("Yes, this human can talk");
        } else {
            System.out.println("No, sorry this human cannot talk");
        }

    }

    public boolean getcanTalk() {
        return this.canTalk;
    }

    public void setcanWalk(boolean canWalk) {
        this.canWalk = canWalk;
        if (this.canWalk) {
            System.out.println("Yes, this human can walk");
        } else {
            System.out.println("No, sorry this human cannot walk");
        }
    }

    public boolean getcanWalk() {
        return this.canWalk;
    }
}

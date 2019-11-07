package com.apple.texttwo;

/**
 * @program:
 * @Description:
 * @author: xujunhao
 * @date: 2019/11/2
 */
public class Shape2 {
    public static Shape randShape(){
        switch ((int)(Math.random()*3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
        }
    }
    public static void main(String[] args){
        Shape[]s = new Shape[4];
        for (int i = 0;i<s.length;++i)
            s[i] = randShape();
        for (int i = 0;i<s.length;++i)
            s[i].draw();
    }
}

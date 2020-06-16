package com.lyh;

import com.lyh.article.Weapon;
import com.lyh.creature.Creature;

public class Main {

    public static void main(String[] args) {
//        int max=3,min=1;
//        int ran2;
//
//        for(int i=0;i<10;i++){
//            ran2=(int) (Math.random()*(max-min)+min);
//            System.out.println(ran2);
//        }

	// write your code here
        Creature creature=new Creature() {
            @Override
            public void useArticle(Weapon weapon, Creature targetCreature) {

            }
        };
        Sense sense=new Sense();
        sense.initSense();
        sense.play();
    }
}

package com.lyh.creature;

import com.lyh.creature.PlayingCard;

import java.util.ArrayList;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 17:04
 * @version: v1.0
 */
public class PlayingCardSet {
    private ArrayList<PlayingCard>monsterWolves=new ArrayList<>();

    //增删改查
    //根据id来查对应的MonsterWolf对象
    //如果找到了对应的id的Monster，放回相应的对象，如果没有找到，则返回null
    public PlayingCard get(String id){
        PlayingCard monsterWolf=null;
        for (PlayingCard item:monsterWolves){
            if(true==id.equals(item.getId())){
                monsterWolf=item;
                break;
            }
        }
        return monsterWolf;
    }


    public PlayingCardSet(){

    }

    public PlayingCardSet(ArrayList<PlayingCard> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }

    public ArrayList<PlayingCard> getMonsterWolves() {
        return monsterWolves;
    }

    public void setMonsterWolves(ArrayList<PlayingCard> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }
}

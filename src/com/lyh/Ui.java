package com.lyh;

import com.lyh.creature.Creature;
import com.lyh.creature.PlayingCard;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 17:46
 * @version: v1.0
 */
public class Ui {
    public void displayStaus(Sense sense){
        System.out.println("===============================");
        System.out.println("欢迎来到爱丽丝梦游仙境！");
        System.out.println("在这里，你将开启奇幻旅程-------");
        System.out.println("作为一个屠龙少年，你的任务是帮助爱丽丝逃离红皇后的爪牙！");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("╭| ━     ━ |╮╭|||━     ━|||╮╰``╯ ");
        System.out.println("╰|  ^     ^  |╯╰|| ０     ０ ||╯ Love ");
        System.out.println("  ╰╭╮-╭╮╯    |╰╭╮-╭╮╯|  ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("请输入:help查看游戏命令");
        System.out.println(sense.getPerson().getDescription()+":"+sense.getPerson().getHPValue());
        for (PlayingCard item:sense.getPlayingCardSet().getMonsterWolves()){
            System.out.println(item.getId()+"("+item.getDescription()+"):"+item.getHPValue());

        }
//        System.out.println();


        System.out.println("===============================");
    }
    public void displayHelpMsg(){
        System.out.println("3command:chop(chop wolf) bye help ");
    }
    public void displayBye(){
        System.out.println("bye bye");
    }
    public void displayErroCmdMsg(){
        System.out.println("你输入的是非法命令");
    }
    public void dispalyDamageMsg(Creature attackCreature, Creature targetCreature){
        System.out.println(attackCreature.getDescription()+"对"+targetCreature.getDescription()
                +"造成"+attackCreature.getCurrentWeapon().getDamagePoint()+"伤害。");
    }
}

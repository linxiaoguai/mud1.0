package com.lyh;

import com.lyh.article.WeaponKnife;
import com.lyh.article.WeaponSword;
import com.lyh.creature.Person;
import com.lyh.creature.PlayingCard;
import com.lyh.creature.PlayingCardSet;

import java.util.Scanner;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 17:00
 * @version: v1.0
 */
public class Sense {
    private Person person=new Person();
    private PlayingCard playingCard1=new PlayingCard();
    private PlayingCard playingCard2=new PlayingCard();
    private PlayingCard playingCard3=new PlayingCard();
    private PlayingCardSet playingCardSet =new PlayingCardSet();
    Ui ui=new Ui();

    public void initSense(){
        initMonster();
        initPerson();
    }
    public void initPerson(){
        person.setId("201902190");
        person.setDescription("小林");
        person.setHPValue(300);
        person.setCurrentWeapon(new WeaponSword("pw1","倚天剑",-50));
    }
    public  void initMonster(){
        playingCard1.setId("card1");
        playingCard1.setDescription("红桃♥A");
        playingCard1.setHPValue(200);
        playingCard1.setCurrentWeapon(new WeaponKnife("playingCard1","尖刺1",-30));

        playingCard2.setId("card2");
        playingCard2.setDescription("红桃♥K");
        playingCard2.setHPValue(200);
        playingCard2.setCurrentWeapon(new WeaponKnife("playingCard1","尖刺2",-30));

        playingCard3.setId("card3");
        playingCard3.setDescription("红桃♥J");
        playingCard3.setHPValue(200);
        playingCard3.setCurrentWeapon(new WeaponKnife("playingCard1","尖刺",-30));

        playingCardSet.getMonsterWolves().add((playingCard1));
        playingCardSet.getMonsterWolves().add(playingCard2);
        playingCardSet.getMonsterWolves().add(playingCard3);
    }

//    public boolean judgeSuccess() {
//        boolean flagPersonSuccess = true;
//
//        if (this.getPerson().getHPValue() <= 0) {
//            flagPersonSuccess = false;
//        }
//    }//判断胜负

    public void play(){
        ui.displayStaus(this);


        Scanner in=new Scanner(System.in);
        while (true){
            //用户输入命令
            String command=in.nextLine();
            //分割命令行各个单元
            String[] cmdLineItems =command.split(" ");

            //chop bye help其他（错误）做相应的处理
            if(cmdLineItems[0].equals("bye")){
                ui.displayBye();
                System.exit(0);
            }else if(cmdLineItems[0].equals(("help"))){
                ui.displayHelpMsg();
            }else if(cmdLineItems[0].equals("chop")){
                this.getPerson().useArticle(getPerson().getCurrentWeapon(),
                        this.getPlayingCardSet().get(cmdLineItems[1]));
                ui.dispalyDamageMsg(this.getPerson(),this.getPlayingCardSet().get(cmdLineItems[1]));
                for(PlayingCard item:this.getPlayingCardSet().getMonsterWolves()){
                    if(1==Utils.randomMonsterChop()){
                        item.useArticle(item.getCurrentWeapon(),this.getPerson());
                        ui.dispalyDamageMsg(item,this.getPerson());
                    }else {
                    }
                }
//                this.getPerson().useArticle(getPerson().getCurrentWeapon(),
//                        this.getPerson());自杀
                //妖怪随机砍人
            }else {
                ui.displayErroCmdMsg();
            }
            ui.displayStaus(this);
        }
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PlayingCard getPlayingCard1() {
        return playingCard1;
    }

    public void setPlayingCard1(PlayingCard playingCard1) {
        this.playingCard1 = playingCard1;
    }

    public PlayingCard getPlayingCard2() {
        return playingCard2;
    }

    public void setPlayingCard2(PlayingCard playingCard2) {
        this.playingCard2 = playingCard2;
    }

    public PlayingCard getPlayingCard3() {
        return playingCard3;
    }

    public void setPlayingCard3(PlayingCard playingCard3) {
        this.playingCard3 = playingCard3;
    }

    public PlayingCardSet getPlayingCardSet() {
        return playingCardSet;
    }

    public void setPlayingCardSet(PlayingCardSet playingCardSet) {
        this.playingCardSet = playingCardSet;
    }

    public Ui getUi() {
        return ui;
    }

    public void setUi(Ui ui) {
        this.ui = ui;
    }
}

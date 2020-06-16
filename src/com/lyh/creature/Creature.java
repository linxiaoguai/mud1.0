package com.lyh.creature;

import com.lyh.article.Weapon;

import java.util.ArrayList;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:37
 * @version: v1.0
 */
//抽象类不能实例化
public abstract class Creature {
    private  String id;
    private  String description;
    private int HPValue;
    //生物拥有装备，装备应该是Creature的一个属性
    private Weapon currentWeapon;//1.人只有一个武器
    private ArrayList<Weapon>weapons=new ArrayList<>();//人可以换武器

//声明，不同的生物如何使用工具，具体的方法，很有可能是不一样的，
// 生物没确定之前，没办法写出使用道具的具体实现，因此，只有写一个声明
    public abstract void  useArticle(Weapon weapon,Creature targetCreature);

    public  Creature(){

    }
    public Creature(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Creature(String id, String description, int HPValue) {
        this.id = id;
        this.description = description;
        this.HPValue = HPValue;
    }

    public int getHPValue() {
        return HPValue;
    }

    public void setHPValue(int HPValue) {
        this.HPValue = HPValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
}

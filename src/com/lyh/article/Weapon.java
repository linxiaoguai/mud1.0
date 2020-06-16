package com.lyh.article;

import com.lyh.creature.Creature;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:40
 * @version: v1.0
 */
public abstract class Weapon {
    private String id;
    private String description;
    private  int damagePoint;
    //使用道具
    public  abstract void useArticle(Creature enemyCreature);
public Weapon(){

}

    public Weapon(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Weapon(String id, String description, int damagePoint) {
        this.id = id;
        this.description = description;
        this.damagePoint = damagePoint;
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

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}

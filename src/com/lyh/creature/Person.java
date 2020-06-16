package com.lyh.creature;

import com.lyh.article.Weapon;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:44
 * @version: v1.0
 */
public class Person extends Creature {

    @Override
    public void useArticle(Weapon weapon, Creature targetCreature) {
weapon.useArticle(targetCreature);
    }
}

package com.lyh.creature;

import com.lyh.article.Weapon;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:45
 * @version: v1.0
 */
public class PlayingCard extends Creature {

    @Override
    public void useArticle(Weapon weapon, Creature targetCreature) {
weapon.useArticle(targetCreature);
    }
}

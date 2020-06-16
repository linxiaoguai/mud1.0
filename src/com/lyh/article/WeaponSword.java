package com.lyh.article;

import com.lyh.article.Weapon;
import com.lyh.creature.Creature;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:54
 * @version: v1.0
 */
public class WeaponSword extends Weapon {
    public WeaponSword(String id, String description, int damagePoint) {
        super(id, description, damagePoint);
    }

    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPValue(enemyCreature.getHPValue()+this.getDamagePoint());

    }

}

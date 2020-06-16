package com.lyh.article;

import com.lyh.article.Weapon;
import com.lyh.creature.Creature;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:53
 * @version: v1.0
 */
public class WeaponKnife extends Weapon {
    public WeaponKnife(String id, String description, int damagePoint) {
        super(id, description, damagePoint);
    }
    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPValue(enemyCreature.getHPValue()+this.getDamagePoint());
    }
}

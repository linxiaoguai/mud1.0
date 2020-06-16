package com.lyh.article;

import com.lyh.article.Weapon;
import com.lyh.creature.Creature;

/**
 * @description:匕首的使用方法
 * @author: xiaolin
 * @date: Created in 2020/5/16 16:55
 * @version: v1.0
 */

public class WeaponDagger extends Weapon {
//给敌人生物的生命值造成伤害
    //匕首的使用方法，修改enemyCreature的HP
    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHPValue(enemyCreature.getHPValue()+this.getDamagePoint());
    }
}

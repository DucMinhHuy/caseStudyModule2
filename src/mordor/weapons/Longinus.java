package mordor.weapons;

import controller.hero.Hero;
import controller.hero.heroName.Amily;
import controller.methods.IAttack;
import controller.methods.ICoolDownReduction;
import controller.methods.IHp;
import controller.weapon.PhysicalAttack;

public class Longinus {
    private PhysicalAttack NormalAttack;

    public Longinus(PhysicalAttack normalAttack) {
        NormalAttack = normalAttack;
    }

    public PhysicalAttack getNormalAttack() {
        return NormalAttack;
    }

    public void setNormalAttack(PhysicalAttack normalAttack) {
        NormalAttack = normalAttack;
    }
}

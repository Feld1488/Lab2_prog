import ru.ifmo.se.pokemon.*;

class RockTomb extends PhysicalMove {
    protected RockTomb(){
        super(Type.NORMAL, 60, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "casts Rock Tomb";
    }
}

class Facade extends PhysicalMove {
    protected Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status PokCon = def.getCondition();
        if (PokCon.equals(Status.BURN) || PokCon.equals(Status.POISON) || PokCon.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int)Math.round(damage)*2);
        }
    }
    @Override
    protected String describe() {
        return "casts Facade";
    }
}

class WaterPulse extends SpecialMove {
    protected WaterPulse() {
        super(Type.WATER, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) {
            Effect.confuse(p);
        }
    }
    @Override
    protected String describe() {
        return "casts Water Pulse";
    }
}

class Amnesia extends StatusMove {
    protected Amnesia() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 2);
    }
    @Override
    protected String describe() {
        return "casts Amnesia";
    }
}

class Thunderbolt extends SpecialMove {
    protected Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.paralyze(p); 
        }
    }
    @Override
    protected String describe() {
        return "casts Thunderbolt";
    }
}

class DoubleTeam extends StatusMove {
    protected DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe() {
        return "casts Double Team";
    }
}

class Swagger extends StatusMove {
    protected Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
    @Override
    protected String describe() {
        return "casts Swagger";
    }
}

class Spark extends PhysicalMove {
    protected Spark() {
        super(Type.ELECTRIC, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "casts Spark";
    }
}

class Confide extends StatusMove {
    protected Confide() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "casts Confide";
    }
}

class Psychic extends SpecialMove {
    protected Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "casts Psychic";
    }
}

class Magnitude extends PhysicalMove {
    protected Magnitude() {
        super(Type.GROUND, (int)(Math.random()*141 + 10), 100);
    }
    @Override
    protected String describe() {
        return "casts Magnitude";
    }
}
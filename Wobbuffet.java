import ru.ifmo.se.pokemon.*;

public class Wobbuffet extends Wynaut {
    public Wobbuffet(String name, int level){
        super(name, level);
        setStats(190, 33, 58, 33, 58, 33);
        setType(Type.PSYCHIC);
        setMove(new Thunderbolt(), new DoubleTeam(), new Swagger(), new Spark());
    }       
}
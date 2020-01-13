import ru.ifmo.se.pokemon.*;

public class Wynaut extends Pokemon {
    public Wynaut(String name, int level){
        super(name, level);
        setStats(95, 23, 48, 23, 48, 23);
        setType(Type.PSYCHIC);
        setMove(new Thunderbolt(), new DoubleTeam(), new Swagger());
    }       
}
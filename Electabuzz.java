import ru.ifmo.se.pokemon.*;

public class Electabuzz extends Elekid {
    public Electabuzz(String name, int level){
        super(name, level);
        setStats(65, 83, 57, 95, 85, 105);
        setType(Type.ELECTRIC);
        setMove(new Confide(), new Swagger(), new Psychic());
    }       
}
import ru.ifmo.se.pokemon.*;

public class Elekid extends Pokemon {
    public Elekid(String name, int level){
        super(name, level);
        setStats(45, 63, 37, 65, 55, 95);
        setType(Type.ELECTRIC);
        setMove(new Confide(), new Swagger());
    }       
}
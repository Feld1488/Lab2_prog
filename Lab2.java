import ru.ifmo.se.pokemon.*;
public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Virizion p1 = new Virizion("Vir", 1);
        Wynaut p2 = new Wynaut("Wyn", 1);
        Wobbuffet p3 = new Wobbuffet("Wob", 1); 
        Elekid p4 = new Elekid("Elekid", 1);
        Electabuzz p5 = new Electabuzz("Elebuzz", 1);
        Electivire p6 = new Electivire("Elevir", 1);

        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}

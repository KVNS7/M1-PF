public class Paire <A, B> {

    private final A fst;
    private final B snd;

    public Paire(A fst, B snd){
        this.fst = fst;
        this.snd = snd;
    }

    public A fst() {
        return fst;
    }

    public B snd() {
        return snd;
    }
    
    public <C> Paire<C,B> changeFst(C value){
        return new Paire<>( value, this.snd);
    }

    public <C> Paire<A,C> changeSnd(C value){
        return new Paire<>(this.fst, value);
    }

    @Override
    public String toString(){
        return "(" + fst + ", " + snd + ") :: Paire[" + fst.getClass().getSimpleName() + ", " + snd.getClass().getSimpleName() + "]";
    }

    public static void main(String[] args){
        Paire<Integer, String> paire1 = new Paire<Integer,String>(1, "un");

        System.out.println(paire1);

        Paire<Double, String> paire2 = new Paire<Double,String>(1.0, "un");

        System.out.println(paire2);

        Paire<Double, Paire> paire3 = new Paire<Double, Paire>(1.0, paire1);

        System.out.println(paire3);


    }

}


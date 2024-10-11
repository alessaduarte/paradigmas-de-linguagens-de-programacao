abstract class Animal {
    protected String som;

    public Animal(String som) {
        this.som = som;
    }

    public abstract String getSom();
}

class Cachorro extends Animal {
    public Cachorro() {
        super("AuAu");
    }

    @Override
    public String getSom() {
        return som;
    }
}

class Gato extends Animal {
    public Gato() {
        super("Miau");
    }

    @Override
    public String getSom() {
        return som;
    }
}


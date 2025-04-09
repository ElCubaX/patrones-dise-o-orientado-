package co.edu.ucc.jose.sistemacafe;

interface Cafe {
    String descripcion();
    double costo();
}

class CafeBasico implements Cafe {
    public String descripcion() {
        return "Café básico";
    }

    public double costo() {
        return 5.0;
    }
}

abstract class CafeDecorator implements Cafe {
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public String descripcion() {
        return cafe.descripcion();
    }

    public double costo() {
        return cafe.costo();
    }
}

class ConLeche extends CafeDecorator {
    public ConLeche(Cafe cafe) {
        super(cafe);
    }

    public String descripcion() {
        return super.descripcion() + " + Leche";
    }

    public double costo() {
        return super.costo() + 1.5;
    }
}

class ConAzucar extends CafeDecorator {
    public ConAzucar(Cafe cafe) {
        super(cafe);
    }

    public String descripcion() {
        return super.descripcion() + " + Azúcar";
    }

    public double costo() {
        return super.costo() + 0.5;
    }
}

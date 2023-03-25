public class Coche {
    public int velocidad;

    public void acelerar_mariano_murcia(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_mariano_murcia(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0 ) velocidad =0;
    }
}

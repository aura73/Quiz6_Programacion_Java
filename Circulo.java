class Circulo extends FiguraGeometrica{
    private double radio;

    /**
     * Toda la sub-clase es complejidad temporal: O(1) tiempo constante
     * @param nombre nombre del circulo
     * @param color color del circulo
     * @param radio radio del circulo
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }


    /**
     *
     * @return retorna el area del circulo
     */
    @Override
    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }


    /**
     *
     * @return retorna el perimetro del circulo
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
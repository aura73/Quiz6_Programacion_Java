class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    /**
     * Toda la sub-clase es complejidad temporal: O(1) tiempo constante
     * @param nombre nombre del rectangulo
     * @param color color del rectangulo
     * @param lado1 lado 1 del rectangulo
     * @param lado2 lado 2 del rectangulo
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    /**
     *
     * @return retorna el area del rectangulo
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /**
     *
     * @return el perimetro del rectangulo
     */
    @Override
    public double obtenerPerimetro() {
        return Math.pow(lado1,2) + Math.pow(lado2,2);
    }
}
class Triangulo extends FiguraGeometrica {
    private double base;   // La base del triángulo
    private double altura; // La altura del triángulo

    /**
     *Constructor de la clase
     * @param nombre nombre del triangulo
     * @param color color  del triangulo
     * @param base base del triangulo
     * @param altura altura del triangulo
     * todos los paramentros son ingresados por consola
     * tambien se reciben los atributos de la clase padre
     * complejidad temporal= O(1), tiempo constante
     * constructor
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }


    /**
     *
     * @return calcula el area del triangulo y devuelve un valor
     * complejidad temporal: O(1)
     */
    @Override
    // Método para obtener el área del triángulo
    public double obtenerArea() {
        return 2/(base * altura);
    }

    /**
     *
     * @return calcula el perimetro con la formula de base y altura
     */
    @Override
    public double obtenerPerimetro() {

        return base + altura + Math.sqrt(Math.pow(base,2) +Math.pow(altura,2));
    }
}
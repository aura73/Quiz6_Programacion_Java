/**
 * Clase para Figura Geometrica
 */
public class FiguraGeometrica {
    private String nombre;
    private String color;

    /**
     *
     * Constructor de la clase.
     * Complejidad temporal: O(1) Tiempo constante.
     * @param nombre nombre de la figura
     * @param color color de la figura
     */

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public double obtenerArea() {
        return 0.0;
    }

    public double obtenerPerimetro() {
        return 0.0;
    }
// getters y setters de nombre y color
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

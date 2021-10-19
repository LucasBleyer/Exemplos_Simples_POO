package exemplo_3;

public class Triangulo {
    private float base;
    private float altura;
    private float area;

//contrutores    
    public Triangulo(float base, float altura, float area) {
        this.base = 0;
        this.altura = 0;
        this.area = 0;
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

//getters e setters    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void calculaArea() {//troquei o set Area por calcula area
        this.area = this.base * this.altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base= " + base + ", altura= " + altura + ", area= " + area + '}';
    }
 
}
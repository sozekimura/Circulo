import java.util.Scanner;

class Circulo {
    private float radio;
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }

    public float calcularArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
}

class calculoAreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es radio del círculo? ");
        float radio = scanner.nextFloat();

        Circulo circulo = new Circulo();
        circulo.setRadio(radio);

        float area = circulo.calcularArea();

        System.out.println("El área del círculo es: " + area);
    }
}
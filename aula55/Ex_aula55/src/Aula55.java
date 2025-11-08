void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    char answer;

    do {
        IO.println("Digite a temperatura em Celsius: ");
        double temp = sc.nextDouble();
        double fahrenheit = (9 * temp) / 5 + 32;
        System.out.printf("Equivalente em Fahreinheit: %.1f%n", fahrenheit);
        IO.println("Deseja repetir (s/n)?");
        answer = sc.next().charAt(0);
    } while (answer != 'n');
    sc.close();
}
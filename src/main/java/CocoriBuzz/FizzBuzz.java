package CocoriBuzz;

public class FizzBuzz {
    public String[] nombres() {
        String[] nombres = new String[101];
        for (int i = 1; i < 101; i++) {
            String result = traduit(i);
            nombres[i] = result;
        }
        return nombres;
    }

    private String traduit(int nombre) {
        if (estUnMultipleDeTrois(nombre) || estUnMultipleDeCinq(nombre)) {
            String result = "";
            if (estUnMultipleDeTrois(nombre)) {
                result = "Fizz";
            }
            if (estUnMultipleDeCinq(nombre)) {
                result += "Buzz";
            }
            return result;
        }
        return String.valueOf(nombre);
    }

    private boolean estUnMultipleDeCinq(int nombre) {
        return nombre % 5 == 0;
    }

    private boolean estUnMultipleDeTrois(int nombre) {
        return nombre % 3 == 0;
    }
}

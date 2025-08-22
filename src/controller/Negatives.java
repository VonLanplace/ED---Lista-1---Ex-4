package controller;

public class Negatives {
    public static int total(int[] vec, int size, int total)
    {
        // O codigo para se ele tentar olhar uma casa menor que
        // 0 como o indice de um vetor não pode ser menor que zero
        // ele chega até o final de forma garantida
        if (size < 0) {
            return total;
        }
        if (vec[size] < 0) {
            total++;
        }
        return total(vec, size - 1, total);
    }
}

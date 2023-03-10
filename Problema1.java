class Problema1 {

    public static void LEERNUMERO(int NUMERO) {
        System.out.println(NUMERO);
        if (NUMERO % 2 == 0) { //PAR
            while (NUMERO > 0){
                NUMERO = NUMERO - 2;
                System.out.println(NUMERO);
            }
        } else {
            while (NUMERO > 1) { //IMPAR
                NUMERO = NUMERO - 2;
                System.out.println(NUMERO);
            }
        }
    }

    public static void main(String[] args) {
        int NUMERO = 9;
        LEERNUMERO(NUMERO);
    }
}

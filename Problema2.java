
class Problema2 {

    public static void LEERPERSONAS() {
        int personas_mayores = 0;
        int personas_menores = 0;
        int masculinos_mayores = 0;
        int femeninos_mayores = 0;
        int num_mujeres = 0;
        String SEXO;
        int EDAD;
        int numAl;
        
        PERSONA PERSONAS[] = new PERSONA[50];
        
        for (int i = 0; i < PERSONAS.length; i++) {
            numAl = (int) (Math.random() * 2);
            if (numAl == 1) {
                SEXO =  "Masculino"; // SEXO DE LAS PERSONAS
            } else {
                SEXO =  "Femenino"; // SEXO DE LAS PERSONAS
            }
            EDAD = (int) (Math.random() * 100); // EDAD DE LAS PERSONAS
            PERSONAS[i] = new PERSONA(SEXO, EDAD);
            if (EDAD > 18) { // CALCULO PERSONAS MAYORES Y MENORES DE EDAD
                personas_mayores++;
            } else if (EDAD < 18) {
                personas_menores++;
            }
            if (SEXO.equals("Masculino") && EDAD > 18) { // CALCULO PERSONAS FEMENINAS Y MASCULINAS MAYORES DE EDAD
                masculinos_mayores++;
            } else if (SEXO.equals("Femenino")&& EDAD > 18){
                femeninos_mayores++;
            }
            if (SEXO.equals("Femenino")){ //CALCULO DE MUJERES
                num_mujeres++;
            }
        }
        
        double por_mayores = (double) personas_mayores/50 * 100; //CALCULO DE PORCENTAJE DE PERSONAS MAYORES DE EDAD
        double por_femenino = (double) num_mujeres/50 * 100; //CALCULO DE MUJERES
        
        System.out.println("Cantidad de personas mayores de edad: " + personas_mayores );
        System.out.println("Cantidad de personas menores de edad: " + personas_menores );
        System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinos_mayores );
        System.out.println("Cantidad de personas femeninas mayores de edad: " + femeninos_mayores );
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + por_mayores );
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas: " + por_femenino);
}
public static void main(String[] args) {
        LEERPERSONAS(); // CREAMOS 50 PERSONAS CON SEXO Y NOMBRES
    }
}

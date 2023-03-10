class Problema3 {
    public static double LEERHORASTRABAJADAS(){
        return 20; //HORAS TRABAJADAS
    }
    
    public static double LEERTARIFA(){
        return 50; // TARIFA
    }
    
    public static void main (String[] args) {
        double HORASTRABAJADAS = LEERHORASTRABAJADAS();
        double TARIFA = LEERTARIFA();
        
        double SUELDO;
        double HORAS_EXTRAS;
        double TARIFA_EXTRA;
        
        // CALCULO DE SUELDO
        if(HORASTRABAJADAS <= 40){ 
            SUELDO = HORASTRABAJADAS * TARIFA;
        }else{
            HORAS_EXTRAS = HORASTRABAJADAS - 40;
            TARIFA_EXTRA = TARIFA * 1.5;
            SUELDO = (40 * TARIFA) + (HORAS_EXTRAS * TARIFA_EXTRA);
        }
         
        System.out.println("El sueldo del trabajador es: " + SUELDO);
    }
}



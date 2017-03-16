
class numeroAbinarioR{

    public static void main (String[] args){
        if(args.length > 0){
            for(int i=0; i < args.length ; i++){
                Convercion(Integer.parseInt(args[i]));
            }
        }else{
            System.out.println("Dame parametros pelotudo");
        }
    }

    static String binary = "";
    public static void Convercion(int numero){
        if(numero > 0){
            if(numero%2 == 0){
                binary += "0";
                Convercion(numero/2);
            }else{
                binary += "1";
                Convercion(numero/2);
            }
        }else{
            reversa(binary, binary.length());
            binary = "";
        }
    }

    public static void reversa(String binario, int tam){
        String volteado = "";
        for(int i = tam-1 ; i >= 0 ; i--){
            volteado += binario.charAt(i);
        }
        System.out.println(volteado);
    }
}

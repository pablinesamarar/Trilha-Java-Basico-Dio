public class MetodoComparacao {
    public static void main(String[] args) {
        
        MetodoComparacao metodoComparacao = new MetodoComparacao();
        System.out.println(metodoComparacao.compararString("a","b" )) ;
    }
    public String compararString (String a, String b){
        if(a.equals(b)){
            return "As strings são iguais";
        }
        return "As strings são diferentes";
    }

}

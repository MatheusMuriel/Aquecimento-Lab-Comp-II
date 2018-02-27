
/**
 * Lista 1 Laboratorio de Computacao II
 *
 * @author Matheus Muriel
 * @version 26/02/18
 */
public class Principal
{
    public static void main(String[] args){
        Principal.numeroPalindromo();
    }

    /**
     * Calcula o n-esimo valor da sequencia de fibonacci.
     * 
     * @param n     numero do elemento da sequencia. Obrigatoriamente
     *              deve ser maior que 0. (n > 0)
     *
     * @return      valor do n-esimo elemento.
     */
    public static int fibonacci(int n) {
        int n1 = 1;
        int n2 = 0;
        int aux = 0;
        for(int i = 0; i < n; i++){
            aux = n1;
            n1 = n1+n2;
            n2 = aux;
        }
        return aux;
    }
    public static int fibonacciRec(int n) {
        if ( n == 1) {return 1; }
        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }
    
    /**
     *  Metodo que recebe um arranjo de inteiros 
     *  e retorna o calculo de todos os seus componentes
     *  
     * @param vals  Arranjo de inteiros
     * @return soma de todos os componentes
     */
    public static int somatorio(int[] vals) {
        int aux = 0;
        for(int i = 0; i < vals.length; i++){ aux += vals[i];}
        return aux;
    }
    
    /**
     * Metodo que retorna o segundo e o terceiro
     * maior componente do arranjo
     * 
     * @param vals  arranjo de inteiros
     * @return
     */
    public static int segundoTerceiro(int[] vals) {
        for(int i = 1; i < vals.length; i++) {
            for(int j = 0; j < i; j++) {
                if(vals[i] > vals[j]) {
                    int temp = vals[i];
                    vals[i] = vals[j];
                    vals[j] = temp;
                }
            }
        }
        return vals[1] + vals[2];
    }

    public static String dePrimeiroDelimAoFim(String str, char delim) {
        return str.substring( str.indexOf(delim) + 1, str.length() );
    }

    public static String deUltimoDelimAoFim(String str, char delim) {
        return str.substring( str.lastIndexOf(delim) + 1, str.length() );
    }

    public static String entreDelims(String str, char delim) {
        if(str.indexOf(delim) == str.lastIndexOf(delim)){ return str.substring(str.indexOf(delim) + 1, str.length()); }
        else{ return str.substring(str.indexOf(delim) + 1, str.lastIndexOf(delim)); }
    }

    public static boolean isPalindromo(String str){
        StringBuffer buff = new StringBuffer(str);
        String palavra = new String(str);
        String reverso = new String(buff.reverse());
        if(palavra.length() == 1){
            try{throw new AssertionError("Um caractere é sempre palindromo."); }
            finally{ return true; }
        }

        if(palavra.length() == 2 && palavra.equals(reverso)){
            try{ throw new AssertionError("Dois caracteres iguais sempre palindromo."); }
            finally{ return true; }
        }

        if (palavra.equals(reverso)) {return true; } else{ return false; }

    }

    public static boolean isPalindromoSemEspaco(String str) {
        String strSemEspaco = str.replace(" ", "");
        StringBuffer buff = new StringBuffer(strSemEspaco);
        String palavra = new String(strSemEspaco);
        String reverso = new String(buff.reverse());
        
        if(palavra.length() == 1){
            try{ throw new AssertionError("Um caractere é sempre palindromo."); }
            finally{ return true; }
        }

        if(palavra.length() == 2 && palavra.equals(reverso)){
            try{ throw new AssertionError("Dois caracteres iguais sempre palindromo."); }
            finally{ return true; }
        }

        if (palavra.equals(reverso)) { return true; } else{ return false; }
    }
    
    /**
     * Metodo que recebe um arranjo de String e 
     * printa na tela os componentes dele que são palindromos
     * 
     * @param palavras  arranjo de String contendo as palavras
     */
    public static void retornaPalindromos(String[] palavras){
        for(int i = 0; i < palavras.length; i++){
            String temp = palavras[i];
            Principal principal = new Principal();
            principal.isPalindromo(temp);
            if(principal.isPalindromo(temp) == true){
                System.out.println("A palavra: " + temp + " é um Palindromo");
            }
        }
    }
    
    /**
     * Metodo que calcula todos os numeros palindromos de 0 a 10000
     */
    public static void numeroPalindromo(){
        for(int i = 0; i <= 10000; i++){
            if(i % 2 == 0){
                Principal principal = new Principal();
                if(principal.isPalindromo(Integer.toString(i)) == true){
                    System.out.println("O numero " + i + " é palindromo");
                }
            }
        }
    }
    
}

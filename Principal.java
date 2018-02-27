
/**
 * Lista 1 Laboratorio de Computacao II
 *
 * @author Arthur Berbert; Guilherme Rocha; Matheus Muriel
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
        assert n >= 0: "S� s�o permitidos inteiros positivos ou nulos";
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
        assert n >= 0: "S� s�o permitidos inteiros positivos ou nulos";
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

    /**
     * Manipula a String para retornar todo conteúdo após a primeira aparição de uma carácter.
     *
     * @param str   gera uma substring com o conteúdo da string apartir do ponto
     *              em que aparece o char.
     *
     * @param delim carácter delimitador.
     *
     * @return      substring gerada.
     */
    public static String dePrimeiroDelimAoFim(String str, char delim) {
        return str.substring(str.indexOf(delim) + 1, str.length());
    }

    /**
     * Manipula a String para retornar todo o conteúdo após a ultima aparição do carácter.
     *
     * @param str   gera uma substring com o conteúdo da string apartir do ponto
     *              da ultima aparição do char.
     *
     * @param delim carácter delimitador.
     *
     * @return      substring gerada.
     */
    public static String deUltimoDelimAoFim(String str, char delim) {
        return str.substring(str.lastIndexOf(delim) + 1, str.length());
    }

    /**
     * Manipula a String para retornar todo o conteúdo entre a primeira e ultima aparição do carácter.
     *
     * @param str   gera uma substring com o conteúdo da string entre o primeiro
     *              e ultimo char.
     *
     * @param delim carácter delimitador.
     *
     * @return      substring gerada.
     */
    public static String entreDelims(String str, char delim) {
        if (str.indexOf(delim) == str.lastIndexOf(delim)) {
            return str.substring(str.indexOf(delim) + 1, str.length());
        } else {
            return str.substring(str.indexOf(delim) + 1, str.lastIndexOf(delim));
        }
    }

    /**
     * verifica se a palavra passada por parametros é um palindromo.
     *
     * @param str  String que vai receber a palavra a ser testada.
     *              if le a palavra e comparar de tras pra frente.
     *
     * @return      recebe verdadeiro ao menos que as palavras sejam diferentes, se caso for diferente recebe false.
     */
    public static boolean isPalindromo(String str) {
        boolean aux = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - i -1))
                aux = false;
        }
        return aux;
    }

    /**
     * Compara se a frase é um palindromo eleminando os espaços em branco.
     *
     * @param str   o metodo tira os espaços entre as palavras.
     *
     *
     * @return      recebe verdadeiro ao menos que as palavras sejam diferentes, se caso for diferente recebe false.
     */
    public static boolean isPalindromoSemEspaco(String str) {
        boolean aux = true;
        str = str.replaceAll(" ", "");
        Principal palindromo = new Principal();
        palindromo.isPalindromo(str);

        return palindromo.isPalindromo(str);
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

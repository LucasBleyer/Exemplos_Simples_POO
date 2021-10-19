/*
2. Crie a classe Livro e defina atributos e métodos para a mesma. Nela:
a) crie dois objetos quaisquer
b) realize uma operação de atualização em alguma variável de instância (atributo)
c) anote o estado atual de cada um dos objetos criados
*/

package exemplo_2;

public class exemplo_2 {

    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.setTitulo("Independencia do Brasil");
        livro.setAnoPublicacao(2020);
        
        System.out.println(livro.toString());
    }
    
}
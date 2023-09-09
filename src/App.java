import javax.swing.JOptionPane;

import classes.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null,"Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null,"Nome da classe: ");

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.Caracteristicas();
        
          
        

        
    }
}

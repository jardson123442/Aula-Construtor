package classes;

import javax.swing.JOptionPane;

public class Personagem {
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 1000;

        if (classe.equals("Guerreiro")){
            forca = nivel * 2;
        } else {
            forca = nivel;
        }

    }

    public void Caracteristicas(){
        String status = String.format("Nome: %s\nNivel: %d\nForca: %d\nVida: %d\nClasse: %s",
            nome, nivel, forca, vida, classe);
        JOptionPane.showMessageDialog(null, status, "status do personagem", JOptionPane.INFORMATION_MESSAGE);
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    
    
}

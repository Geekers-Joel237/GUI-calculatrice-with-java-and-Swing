 public class MainCalculatrice {
    public static  void main(String[] args) {
        CalculatriceGraphique maCalculatrice = new CalculatriceGraphique();
        MoteurCalcul moteurCalcul = new MoteurCalcul(maCalculatrice);
        maCalculatrice.bouton0.addActionListener(moteurCalcul);
        maCalculatrice.bouton1.addActionListener(moteurCalcul);
        maCalculatrice.bouton2.addActionListener(moteurCalcul);
        maCalculatrice.bouton3.addActionListener(moteurCalcul);
        maCalculatrice.bouton4.addActionListener(moteurCalcul);
        maCalculatrice.bouton5.addActionListener(moteurCalcul);
        maCalculatrice.bouton6.addActionListener(moteurCalcul);
        maCalculatrice.bouton7.addActionListener(moteurCalcul);
        maCalculatrice.bouton8.addActionListener(moteurCalcul);
        maCalculatrice.bouton9.addActionListener(moteurCalcul);
        maCalculatrice.boutonEffacer.addActionListener(moteurCalcul);
        maCalculatrice.boutonEgale.addActionListener(moteurCalcul);
        maCalculatrice.boutonPlus.addActionListener(moteurCalcul);
        maCalculatrice.boutonMoins.addActionListener(moteurCalcul);
        maCalculatrice.boutonFois.addActionListener(moteurCalcul);
        maCalculatrice.boutonDiviser.addActionListener(moteurCalcul);

        
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class CalculatriceGraphique {

    //Declaration des composantes de ma calculatrice
    JPanel monPanneauFinal;
    JPanel panneauNumerique;
    JPanel panneauOperateur;
    JPanel panneauAffichage;
    JTextField champAffichage1;
    JTextField champAffichage2;
    JButton bouton0;
    JButton bouton1;
    JButton bouton2;
    JButton bouton3;
    JButton bouton4;
    JButton bouton5;
    JButton bouton6;
    JButton bouton7;
    JButton bouton8;
    JButton bouton9;
    JButton boutonEgale;
    JButton boutonPlus;
    JButton boutonMoins;
    JButton boutonFois;
    JButton boutonDiviser;
    JButton boutonEffacer;

    //Constructeur de ma calculatrice graphique
    public CalculatriceGraphique(){

        //Initialisation du panneau final et ajout d'un gestionnaire de disposition
        monPanneauFinal = new JPanel();
        BorderLayout disposition1 = new BorderLayout();
        monPanneauFinal.setLayout(disposition1);
        
        //initialisation du champ d'affichage et ajustement sur le panneau
        panneauAffichage = new JPanel();
        GridLayout disposition4 = new GridLayout(2,1);
        panneauAffichage.setLayout(disposition4);
        champAffichage1 = new JTextField();
        champAffichage2 = new JTextField();

        panneauAffichage.add(champAffichage1);
        panneauAffichage.add(champAffichage2);
        monPanneauFinal.add("North", panneauAffichage);
        

        // Initialisation du panneau de chiffres et ajout d'un gestionnaire de disposition
        panneauNumerique = new JPanel();
        GridLayout disposition2 = new GridLayout(4,3);
        panneauNumerique.setLayout(disposition2);

        //Creation des composants graphiques en memoire
        bouton0 = new JButton("0");
        bouton1 = new JButton("1");
        bouton2 = new JButton("2");
        bouton3 = new JButton("3");
        bouton4 = new JButton("4");
        bouton5 = new JButton("5");
        bouton6 = new JButton("6");
        bouton7 = new JButton("7");
        bouton8 = new JButton("8");
        bouton9 = new JButton("9");
        boutonEgale = new JButton("=");
        boutonEffacer = new JButton("CE");

        boutonPlus = new JButton("+");
        boutonMoins = new JButton("-");
        boutonFois = new JButton("*");
        boutonDiviser = new JButton("/");

        //ajout des composants graphiques au panneau numerique
        panneauNumerique.add(bouton0);
        panneauNumerique.add(bouton1);
        panneauNumerique.add(bouton2);
        panneauNumerique.add(bouton3);
        panneauNumerique.add(bouton4);
        panneauNumerique.add(bouton5);
        panneauNumerique.add(bouton6);
        panneauNumerique.add(bouton7);
        panneauNumerique.add(bouton8);
        panneauNumerique.add(bouton9);
        panneauNumerique.add(boutonEgale);
        panneauNumerique.add(boutonEffacer);
        
        //Creation du panneau des operateurs ,gestionnaire de disposition, 
        //ajout des composants + ajout de ceux-ci au panneau d'operations

        panneauOperateur = new JPanel();
        GridLayout disposition3 = new GridLayout(4,1);
        panneauOperateur.setLayout(disposition3);

        panneauOperateur.add(boutonPlus);
        panneauOperateur.add(boutonMoins);
        panneauOperateur.add(boutonFois);
        panneauOperateur.add(boutonDiviser);

        //Ajout des panneaux au panneau principal
        monPanneauFinal.add("East", panneauOperateur);
        monPanneauFinal.add("Center", panneauNumerique);

        //Creation d'un cadre et dimensionnement
        JFrame monCadre =  new JFrame();
        monCadre.setContentPane(monPanneauFinal);
        monCadre.pack();
        monCadre.setVisible(true);

    }

    

}

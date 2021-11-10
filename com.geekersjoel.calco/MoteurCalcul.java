import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Action;
import javax.swing.JButton;

public class MoteurCalcul implements Action{
    //Une reference a ma CalculatriceGraphique
    CalculatriceGraphique parent;
    
    //Variables permettant de stocker l'action selectionnee et la valeur courante
    char actionSelectionnee = ' ';//+ - * / = CE 
    double resultatCourant ;
    NumberFormat formatNombres = NumberFormat.getInstance();


    MoteurCalcul(CalculatriceGraphique parent){
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Recuperation de la source de l'evenement
        JButton boutonClique = (JButton) e.getSource();

        //Recupere la valeur de la source de l'evenement
        String texteChampAffichage1 = this.parent.champAffichage1.getText();
        String texteChampAffichage2 = this.parent.champAffichage2.getText();
        
        //Declaration valeur affichee
        double valeurAffichee = 0;

        if(!"".equals(texteChampAffichage2)){
            valeurAffichee = formatNombres.parse(texteChampAffichage2, new ParsePosition(0)).doubleValue();
            // valeurAffichee = Double.valueOf(texteChampAffichage).doubleValue();
            System.out.println(valeurAffichee);
        }
        
        JButton boutonAction = (JButton)e.getSource();

        //Pour chaque bouton d'action ,memoriser l'action selectionnee,
        //la stockee ds resultatCourant et vider le champ d'affichage 
        //avant l'entree du nombre suivant
        if(boutonAction == this.parent.boutonPlus){
            actionSelectionnee = '+';
            resultatCourant = valeurAffichee;
            this.parent.champAffichage1.setText(texteChampAffichage1+texteChampAffichage2+actionSelectionnee);
            this.parent.champAffichage2.setText("");
            
        }
        else if(boutonAction == this.parent.boutonMoins){
            actionSelectionnee = '-';
            resultatCourant = valeurAffichee;
            this.parent.champAffichage1.setText(texteChampAffichage1+texteChampAffichage2+actionSelectionnee);
            this.parent.champAffichage2.setText("");
        }
        else if(boutonAction == this.parent.boutonFois){
            actionSelectionnee = '*';
            resultatCourant = valeurAffichee;
            this.parent.champAffichage1.setText(texteChampAffichage1+texteChampAffichage2+actionSelectionnee);
            this.parent.champAffichage2.setText("");
         }
        else if(boutonAction == this.parent.boutonDiviser){
            actionSelectionnee = '/';
            resultatCourant = valeurAffichee;
            this.parent.champAffichage1.setText(texteChampAffichage1+texteChampAffichage2+actionSelectionnee);
            this.parent.champAffichage2.setText("");
        }
        else if(boutonAction == this.parent.boutonEffacer){
            actionSelectionnee = ' ';
            resultatCourant = 0;
            this.parent.champAffichage1.setText("");
            this.parent.champAffichage2.setText("");
        }
        else if(boutonAction == this.parent.boutonEgale){
            //Effectuer le calcul adequat en modifiant la valeur de resultat
            //et affichage du resultat
            // valeurAffichee = Double.valueOf(boutonClique.getText()).doubleValue();
            System.out.println(valeurAffichee+"Nouvelle valeur affichee");
            if(actionSelectionnee == '+'){
                resultatCourant += valeurAffichee;
                this.parent.champAffichage1.setText(this.parent.champAffichage1.getText()+(int) (valeurAffichee)+" = ");
                this.parent.champAffichage2.setText(formatNombres.format(resultatCourant));

            }
            else if(actionSelectionnee == '-'){
                resultatCourant -= valeurAffichee;
                this.parent.champAffichage1.setText(this.parent.champAffichage1.getText()+(int) (valeurAffichee)+" = ");
                this.parent.champAffichage2.setText(formatNombres.format(resultatCourant));

            }
            else if(actionSelectionnee == '*'){
                resultatCourant *= valeurAffichee;
                this.parent.champAffichage1.setText(this.parent.champAffichage1.getText()+(int) (valeurAffichee)+" = ");
                this.parent.champAffichage2.setText(formatNombres.format(resultatCourant));

            }
            else if(actionSelectionnee == '/'){
                this.parent.champAffichage1.setText(this.parent.champAffichage1.getText()+(int) (valeurAffichee)+" = ");
                if((int)(valeurAffichee) == 0){
                    this.parent.champAffichage2.setText("Division par 0 impossible !");
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        public void run() {
                            parent.champAffichage2.setText(""); 
                        };
                    }, 1000);
                }else{
                    resultatCourant/= valeurAffichee;
                    this.parent.champAffichage2.setText(formatNombres.format(resultatCourant));
                }
                
            }

        }
        else{
            String texteChampAffichage3 = boutonClique.getText();
            this.parent.champAffichage2.setText(texteChampAffichage2+texteChampAffichage3);
        }

    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    
}

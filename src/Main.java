/*
 * Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: nome, cognome, codice ed età, e che contenga il costruttore
parametrizzato ed i metodi getCodice, getCognome e getEta che restituiscono rispettivamente il codice, il cognome e l'età del docente.
Scrivere poi una classe Universita, che rappresenti un insieme di docenti universitari tramite un array di tipo Docente, e che contenga il costruttore
 parametrizzato ed un metodo etaMinima che restituisce la minima eta' tra i docenti universitari e un metodo che restituisce il nome del docente che ha l'eta' minima.
 * */
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Universita universita=new Universita();
		String risposta="si";
		do {
			Docente docente=new Docente();
			universita.addDocente(docente);
			risposta=JOptionPane.showInputDialog("Vuoi inserire altri docenti ?");
		}while(risposta.equalsIgnoreCase("si"));
		JOptionPane.showMessageDialog(null, universita.visualizzaDocente());
		JOptionPane.showMessageDialog(null, "Lista generale docenti: " + "\n" + universita.Docenti());
	}

}

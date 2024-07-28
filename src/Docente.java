import javax.swing.*;
public class Docente {
	private String nome;
	private String cognome;
	private int codice;
	private int eta;
	
	public Docente() {
		inserisciDatiDocente(); 
	}
	
	public Docente(String nome, String cognome, int codice, int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.codice=codice;
		this.eta=eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String toString() {
		return "Nome docente: "+ nome + "\ncognome docente: " + cognome + "\nCodice docente: " + codice + "\nEtà docente: " + eta+"\n";
	}
	
	public void inserisciDatiDocente() {
		nome=JOptionPane.showInputDialog("Inserisci nome: ");
		cognome=JOptionPane.showInputDialog("Inserisci cognome: ");
		codice=stringToInt("codice del docente");
		while(codice<=0) {
			JOptionPane.showMessageDialog(null, "Inserisci un valore maggiore di zero");
			codice=stringToInt("codice del docente");
		}
		eta=stringToInt("età del docente");
		while(eta<=0) {
			JOptionPane.showMessageDialog(null, "Inserisci un valore maggiore di zero");
			eta=stringToInt("età del docente");
		}
		
	}
	
	public int stringToInt(String s) {
		boolean check;
		int number=0;
		do {
			check=true;
			String a = JOptionPane.showInputDialog("Inserisci " + s);
			try {
				number=Integer.parseInt(a);
			}catch(Exception e) {
				check=false;
				JOptionPane.showMessageDialog(null, "Non hai inserito un intero!!");
			}
			
	}while(!check);
	return number;
	}
}

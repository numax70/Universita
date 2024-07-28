import java.util.*;
public class Universita {
	private ArrayList<Docente> docenti;
	
	public Universita() {
		docenti=new ArrayList<Docente>();
	}
	
	public Universita(ArrayList<Docente> docente) {
		this.docenti=docente;
	}
	
	public void addDocente(Docente docente) {
		docenti.add(docente);
	}
	
	public int etaMinima() {
		//restituisce la minima eta' tra i docenti universitari
		int minimaEta=docenti.get(0).getEta();
		for(int i=0; i<docenti.size(); i++) {
			if(docenti.get(i).getEta()<minimaEta) {
				minimaEta=docenti.get(i).getEta();
			}
		}
		return minimaEta;
	}
	
	public String nomeDocente() {
		//restituisce il nome del docente che ha l'eta' minima.
		int eta=etaMinima();
		String nome="";
		for(int i=0; i<docenti.size(); i++) {
			if(docenti.get(i).getEta()==eta) {
				nome=docenti.get(i).getNome();
			}
		}
		return nome;
	}
	
	public String Docenti() {
		String risultato="";
		for(int i=0; i<docenti.size(); i++) {
			risultato+=docenti.get(i).toString();
		}
		return risultato;
	}
	
	public String visualizzaDocente() {
		String risultato="";
		int eta=etaMinima();
		String nome = nomeDocente();
		risultato="Nome del docente: " + nome + "\nEtà del docente: " + eta;
		return risultato;
		
	}
	
	
}

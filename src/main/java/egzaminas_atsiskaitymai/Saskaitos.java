package egzaminas_atsiskaitymai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saskaitos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	
	public int id;
	
	public String data;
	
	public double suma;
	
	public int klientaiId;
	
	public Saskaitos() {
		super();
	}	

	public Saskaitos(int id, String data, double suma, int klientai_id) {
		super();
		this.id = id;
		this.data = data;
		this.suma = suma;
		this.klientaiId = klientai_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public int getKlientaiId() {
		return klientaiId;
	}

	public void setKlientaiId(int klientai_id) {
		this.klientaiId = klientai_id;
	}
}

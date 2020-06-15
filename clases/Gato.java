package thp.ej7.clases;

import thp.ej7.clases.Raton;

public class Gato {
	
	private double energia;
	

	public Gato(double energia) {		
		setEnergia(energia);
	}

	public double getEnergia() {
		return energia;
	}

	private void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public boolean alcanzar(Raton raton1 , double metrosRaton) {
		
		boolean alcanza = false;
		double metrosGato = this.energia;
		double metrosCorreRaton = (raton1.getEnergia() / 2) + metrosRaton ;
		
		boolean corre = metrosGato >= metrosCorreRaton ;
		
		
		if (corre) {
			
			alcanza = true;
			
		}
					
		return alcanza;
			
		}
	
		
	}
	



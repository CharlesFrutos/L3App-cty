package py.edu.facitec.l3.model;

import java.util.Date;

/**
 * 
 * @author rorogarcete
 *
 */
public class Persona {
	private int codigo;
	private String nombre;
	private String abreviatura;
	private int genero;
	private Date fechaRegistro;
	
	public Persona() {
		super();
		this.codigo=0;
		this.nombre="";
		this.abreviatura="";
		this.genero=0;
		this.fechaRegistro=new Date();
	}
	
	
	

}

package simulacion_banco;

public class TestReferencias {
	public class Persona {

	    String nombre;
	    String numeroIdentidad;
	    int edad;
	    Direccion direccion;
	}

	public class Empresa {

	    String razonSocial;
	    String numeroIdentidadSocial;
	    Direccion direccion;
	}
	
	public class Direccion {

	    String calle;
	    String complemento;
	    String numero;
	    String vecindario;
	    String ciudad;
	    String codigoPostal;

	}
}

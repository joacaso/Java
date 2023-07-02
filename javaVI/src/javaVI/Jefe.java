package javaVI;

public class Jefe extends Empleado {	protected String departamentoAcargo;	protected int cantidadEmpleados;

    // Constructor
    public Jefe(String nombre, String domicilio, String legajo, String cargo, String departamentoAcargo, int cantidadEmpleados) {
        super(nombre, domicilio, legajo, cargo);
        this.departamentoAcargo = departamentoAcargo;
        this.cantidadEmpleados = cantidadEmpleados;
    }
       
    public String getDepartamentoAcargo() {
		return departamentoAcargo;
	}

	public void setDepartamentoAcargo(String departamentoAcargo) {
		this.departamentoAcargo = departamentoAcargo;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	@Override
    public String detalle() {
        return super.detalle() + ", Departamento a cargo: " + departamentoAcargo + ", Cantidad de empleados: " + cantidadEmpleados;
    }
}	

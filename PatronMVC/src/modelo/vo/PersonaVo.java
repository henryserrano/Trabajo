package modelo.vo;

public class PersonaVo {
	
	private Integer idPersona;
	private String nombrePersona;
	private String apellidoPersona;
	private Integer edadPersona;
	private String profesionPersona;
	
	private Integer telefonoPersona;
	private String ciudadPersona;
	
	/**
	 * @return the idPersona
	 */
	public Integer getIdPersona() {
		return idPersona;
	}
	public String getApellidoPersona() {
		return apellidoPersona;
	}
	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}
	public String getCiudadPersona() {
		return ciudadPersona;
	}
	public void setCiudadPersona(String ciudadPersona) {
		this.ciudadPersona = ciudadPersona;
	}
	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	/**
	 * @return the nombrePersona
	 */
	public String getNombrePersona() {
		return nombrePersona;
	}
	/**
	 * @param nombrePersona the nombrePersona to set
	 */
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	/**
	 * @return the edadPersona
	 */
	public Integer getEdadPersona() {
		return edadPersona;
	}
	/**
	 * @param edadPersona the edadPersona to set
	 */
	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}
	/**
	 * @return the profesionPersona
	 */
	public String getProfesionPersona() {
		return profesionPersona;
	}
	/**
	 * @param profesionPersona the profesionPersona to set
	 */
	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}
	/**
	 * @return the telefonoPersona
	 */
	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}
	/**
	 * @param telefonoPersona the telefonoPersona to set
	 */
	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}
	

}

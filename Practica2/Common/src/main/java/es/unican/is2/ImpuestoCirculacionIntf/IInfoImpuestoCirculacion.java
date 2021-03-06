package es.unican.is2.ImpuestoCirculacionIntf;

import es.unican.is2.ImpuestoCirculacionCommon.Contribuyente;
import es.unican.is2.ImpuestoCirculacionCommon.Vehiculo;

/**
 * Interfaz de negocio para consultar información sobre 
 * contribuyentes y vehiculos
 */
public interface IInfoImpuestoCirculacion {
	
	/**
	 * Retorna el vehiculo cuya matricula se pasa como parametro
	 * @param matricula 
	 * @return El vehiculo indicado
	 * 	       null si no existe
	 */
	public Vehiculo vehiculo(String matricula); 	
	
	/**
	 * Retorna el contribuyente cuyo dni se pasa como parametro
	 * @param dni DNI del contribuyente buscado
	 * @return El contribuyente
	 * 		   null si no existe
	 */
	public Contribuyente contribuyente(String dni); 
	
	
}

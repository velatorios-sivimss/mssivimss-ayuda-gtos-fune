package com.imss.sivimss.registroagf.util;

import com.imss.sivimss.registroagf.model.request.CrearPagosRequest;

public class PagosUtil {
	
	public String crearDetalle(CrearPagosRequest datos, Integer idUsuario, String estatusPago) {
		
		QueryHelper q = new QueryHelper("INSERT INTO SVT_PAGO_DETALLE");
		q.agregarParametroValues("ID_PAGO_BITACORA", "'" + datos.getIdPagoBitacora() + "'");
		q.agregarParametroValues("ID_METODO_PAGO", "'" + datos.getIdMetodoPago() + "'");
		q.agregarParametroValues("IMP_PAGO", datos.getImportePago().toString());
		
		if( datos.getNumAutorizacion()!= null ) {
			q.agregarParametroValues("NUM_AUTORIZACION", "'" + datos.getNumAutorizacion() + "'");
		}
		
		if( datos.getFechaPago() != null ) {	
			q.agregarParametroValues("FEC_PAGO", "'" + datos.getFechaPago() + "'" );
		}else {
			q.agregarParametroValues("FEC_PAGO", "NOW()" );
		}
		
		if( datos.getFechaValeAGF() != null ) {
			q.agregarParametroValues("FEC_VALE_AGF", "'" + datos.getFechaValeAGF() + "'");
		}else {
			q.agregarParametroValues("FEC_VALE_AGF", "NOW()" );
		}
		
		q.agregarParametroValues("CVE_ESTATUS", estatusPago );
		q.agregarParametroValues("ID_USUARIO_ALTA", idUsuario.toString() );
		
		return q.obtenerQueryInsertar();
		
	}
	
	public String totalPagado(Integer idPagoBitacora){
		
		StringBuilder query = new StringBuilder("SELECT IFNULL(\r\n"
				+ "(SELECT SUM(PD.IMP_PAGO)\r\n"
				+ "FROM  SVT_PAGO_DETALLE PD\r\n"
				+ "WHERE\r\n"
				+ "PD.ID_PAGO_BITACORA = ");
		query.append(idPagoBitacora);
		query.append(" AND PD.CVE_ESTATUS = '4' ), 0) AS totalPagado");
		
		return query.toString();
	}
	
	public String impOds(Integer idPagoBitacora){
		
		StringBuilder query = new StringBuilder("SELECT\r\n"
				+ "IMP_VALOR AS impOds,\r\n"
				+ "ID_REGISTRO AS idOds\r\n"
				+ "FROM SVT_PAGO_BITACORA\r\n"
				+ "WHERE\r\n"
				+ "ID_PAGO_BITACORA = ");
		query.append(idPagoBitacora);
		query.append(" LIMIT 1");
		
		return query.toString();
	}
	
	
	public String actODs(Integer idOds, Integer idUsuario) {
		
		QueryHelper q = new QueryHelper("UPDATE SVC_ORDEN_SERVICIO");
		q.agregarParametroValues("ID_ESTATUS_ORDEN_SERVICIO", "4");
		q.agregarParametroValues("FEC_ACTUALIZACION", "NOW()");
		q.agregarParametroValues("ID_USUARIO_MODIFICA", idUsuario.toString());
		q.addWhere("ID_ORDEN_SERVICIO = " + idOds);
		q.addWhere("AND ID_ESTATUS_ORDEN_SERVICIO IN ('2','3')");
		
		return q.obtenerQueryActualizar();
	}
	
	public String actPB(Integer idPb, Integer idUsuario, String idEstatus, String generarPagare) {
		
		QueryHelper q = new QueryHelper("UPDATE SVT_PAGO_BITACORA");
		q.agregarParametroValues("CVE_ESTATUS_PAGO", idEstatus);
		q.agregarParametroValues("FEC_ACTUALIZACION", "NOW()");
		q.agregarParametroValues("ID_USUARIO_MODIFICA", idUsuario.toString());
		q.agregarParametroValues("IND_GEN_PAGARE", generarPagare);
		q.addWhere("ID_PAGO_BITACORA = " + idPb);
	
		return q.obtenerQueryActualizar();
	}
	
	public String detalleAGF(Integer idPagoBitacora){
		StringBuilder query = new StringBuilder("SELECT\r\n"
				+ "ID_PAGO_DETALLE AS idPagoDetalle\r\n"
				+ "FROM\r\n"
				+ "SVT_PAGO_DETALLE\r\n"
				+ "WHERE\r\n"
				+ "ID_METODO_PAGO = 2\r\n"
				+ "AND ID_PAGO_BITACORA = ");
		
		query.append(idPagoBitacora);
		query.append( "\r\n"
				+ "ORDER BY ID_PAGO_DETALLE DESC\r\n"
				+ "LIMIT 1");
		return query.toString();
	}
	
}

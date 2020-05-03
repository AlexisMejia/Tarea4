package com.uca.capas.Tarea4.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;


public class producto {
	
	@NotEmpty(message="*Campo obligatorio*")
	@NotNull
	@Size(min=12, max=12, message="*El codigo debe tener 12 digitos*")
	 String codigo;
	
	@NotEmpty(message= "*Campo obligatorio*")
	@Size(max =100, message="Maximo de 100 caracteres")
	 String nombreProducto;
	
	
	@NotEmpty(message= "*Campo obligatorio*")
	@Size(max =100, message="Maximo de 100 caracteres")
	 String marca;
	
	@NotEmpty(message= "*Campo obligatorio*")
	@Size(max =500, message="Maximo de 500 caracteres")
	 String descripcion;
	
	@NumberFormat
	@Positive
	@NotNull
	@Digits(fraction = 0, integer = 10, message = "Numero entero")
	 Integer existencias;
	
	@NotEmpty(message="*Campo obligatorio*")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	 String fecha;

	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getExistencias() {
		return existencias;
	}

	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}

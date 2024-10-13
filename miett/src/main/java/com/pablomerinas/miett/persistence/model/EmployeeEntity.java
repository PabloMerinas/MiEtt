package com.pablomerinas.miett.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Clase Empleado, representa la tabla MTEMPLOYEES
 */
@Data
@Table(name = "MTEMPLOYEES")
@Entity
public class EmployeeEntity {

	/**
	 * ID del empleado.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;

	/**
	 * Nombre del empleado.
	 */
	private String firstName;

	/**
	 * Apellido 1 del empleado.
	 */
	private String surName1;

	/**
	 * Apellido 2 del empleado.
	 */
	private String surName2;

}

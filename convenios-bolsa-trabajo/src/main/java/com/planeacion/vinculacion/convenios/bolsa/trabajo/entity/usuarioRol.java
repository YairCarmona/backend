package com.planeacion.vinculacion.convenios.bolsa.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario_rol")
public class usuarioRol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuarioRol;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private usuario usuario;
	
	@ManyToOne()
	private rol rol;
}

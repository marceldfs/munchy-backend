package mz.co.munchy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Restaurante {

	private @Id @GeneratedValue Long id;
	private String nome;
	private String endereco;

	private Restaurante() {}

	public Restaurante(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
}

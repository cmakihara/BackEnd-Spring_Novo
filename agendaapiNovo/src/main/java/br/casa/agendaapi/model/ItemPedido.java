package br.casa.agendaapi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "itempedido")
public class ItemPedido {

	
	@Id
	@Column(name = "id_itempedido")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_itempedido;
	
	
	
	private String nome;
	private String tipo;
	private String valor;
	private int quantidade;
	private String seila;
	
	
	private int pedido;

	

	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getSeila() {
		return seila;
	}
	public void setSeila(String seila) {
		this.seila = seila;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setId_itempedido(Long id_itempedido) {
		this.id_itempedido = id_itempedido;
	}
	public int getPedido() {
		return pedido;
	}
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
	
	
}

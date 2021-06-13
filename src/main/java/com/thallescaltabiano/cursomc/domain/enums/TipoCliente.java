package com.thallescaltabiano.cursomc.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1,"Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod){ //static para ser possivel executar a funcao mesmo sem instaciar o objeto
		if(cod == null) {
			return null;
		}
		for(TipoCliente x: TipoCliente.values()) { //for para percorrer os valores de cada tipo cliente x do Enum
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}

/*
A construção de atributos e métodos para Enum é necessário para evitar aterações no arquivo que possam quebrar o banco de dados.
Para acessarmos as caracteristas de um tipo enumerado é criado o metodo toenum()
sua função é receber um codigo como paramento, verificar se o mesmo existe e retorna o seu codigo e o tipo da Pessoa associado a ele
*/
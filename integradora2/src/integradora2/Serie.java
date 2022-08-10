package integradora2;

public class Serie implements ISerie
{
	private String nome;
	private String link;	

	@Override
	public String getSerie(String nome){
		this.nome = nome;
		this.link = "www." + nome.replaceAll("\\s+","").toLowerCase() + ".com"; 
		return this.link;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}

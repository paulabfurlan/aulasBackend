package integradora2;

public class SerieProxy implements ISerie{
	private int qtdViews;
	private Serie serie;
	
	public SerieProxy() {
		this.qtdViews = 0;
		this.serie = new Serie();
	}

	@Override
	public String getSerie(String nome) throws SerieNaoHabilitadaException {
		String link = null;
		this.qtdViews++;
		if(this.qtdViews > 5)
			throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas!");
		else
			link = this.serie.getSerie(nome);
		
		return link;
	}

	public int getQtdViews() {
		return qtdViews;
	}

	public void setQtdViews(int qtdViews) {
		this.qtdViews = qtdViews;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
}

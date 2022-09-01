
public class Data {

	private String data;
	private int dia;
	private int mes;
	private int ano;

	Data(String data) {
		this.data = data;
		formataData();
		validaData();
	}

	private boolean validaData() {
		if (dia > 0 && dia < 32) {
			if (mes > 0 && mes < 13) {
				if (ano > 2021) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private void formataData() {
		this.dia = Integer.parseInt(data.substring(0, 2));
		this.mes = Integer.parseInt(data.substring(3, 5));
		this.ano = Integer.parseInt(data.substring(6, 10));
	}
	
	public String getData(){
		return this.data;
	}
	
	public int getDia(){
		return this.dia;
	}
	
	public int getMes(){
		return this.mes;
	}
	
	public int getAno(){
		return this.ano;
	}
}

import java.util.Scanner;

public class Data {

	private String data;
	private int dia;
	private int mes;
	private int ano;

	Data() {
		this.data = null;
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	public void leData(String data) {
		this.data = data;
	}

	public boolean validaData() {
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

	public void formataData() {
		this.dia = Integer.parseInt(data.substring(0, 2));
		this.mes = Integer.parseInt(data.substring(3, 5));
		this.ano = Integer.parseInt(data.substring(6, 10));
	}
}

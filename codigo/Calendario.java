class Calendario{

	private List<Compromisso> compromissos;
	
	Calendario(){
		compromissos = new ArrayList<>();
	}
	
	public void addCompromisso(){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do compromisso: ")
		String nome = teclado.next();
		
		System.out.println("Informe a data do compromisso: ");
		String dataValidar = teclado.next();
		boolean isDataValida = Data.validaData(dataValidar);
		
		while(!isDataValida){
		
			System.out.println("Data inválida, informe outra: ");
			dataValidar = teclado.next();
			
			isDataValida = Data.validaData(dataValidar);
		
		}
	
		Data data = new Data(dataValidar);
		
		System.out.println("Informe o intervalo de dias que o compromisso terá: ");
		int intervaloDias = teclado.nextInt();
		
		System.out.println("Informe o numero de repetições que o compromisso terá: ");
		int nrRepeticoes = teclado.nextInt();
		
		
		addCompromisso(data, nome, intervaloDias, nrRepeticoes);
	
	}
	
	private void addCompromisso(Data data, String nome, int intervaloDias, int nrRepeticoes ){
		
		Compormisso compromisso = new Compormisso(data, nome, intervaloDias, nrRepeticoes);
		
		compromissos.add(compromisso);
	
	}
	
	public void procuraCompromisso(String nome){
	
		boolean isCompromissoExiste = false;
	
		for(Compromisso compromisso : this.compromissos){
		
			if(compromisso.getNome().equals(nome)){
				System.out.println("Compromisso existe");
				isCompromissoExiste = true;
			}
		
		}
		
		if(isCompromissoExiste = false){
			System.out.println("Compromisso não existe");
		}
		
	}
	
	public void listarCompromissos(Data dataInicio, Data dataFim){
		
		for(Compromisso compromisso : this.compromisso){
		
			
			if( (compromisso.getData().getAno() >= dataInicio.getAno() && compromisso.getData().getAno() <= dataFim.getAno()) &&
				(compromisso.getData().getMes() >= dataInicio.getMes() && compromisso.getData().getMes() <= dataFim.getMes()) &&
				(compromisso.getData().getDia() >= dataInicio.getDia() && compromisso.getData().getDia() <= dataFim.getDia()
			){
			
				System.out.println("Nome do compromisso: " + compromisso.getNome());
			}
			
		}
		
	
	}


}
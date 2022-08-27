public class Compromisso{
    
    //Atributos:
        private String nome;
        private String descricao;
        Data data;
    //EndRegion:

    //Metodos:  
    
        Compromisso(String nome, String data){
            this.nome = nome;
            this.descricao = "";
            this.data = new Data();
        } 

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getNome(){
            return this.nome;
        }

        public void setDescricao(String descricao){
            this.descricao = descricao;
        }

        public String getDescricao(){
            return this.descricao;
        }
    //EndRegion
        
}

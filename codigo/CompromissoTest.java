
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CompromissoTest{

    Compromisso compromisso;

    @BeforeAll
    public void init(){
        compromisso = new Compromisso("Reunião", "15/09/2022");
    }

    @Test
    public void testaConstrutor(){

        assertEquals("Reunião", compromisso.getNome());
    }
}

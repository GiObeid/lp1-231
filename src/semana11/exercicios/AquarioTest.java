package semana11.exercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void calcularVolumeTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 25.0;
        aquario.altura = 40.0;
        aquario.largura = 40.0;

        double volume = aquario.calcularVolume();

        assertEquals(40.0, volume);
    }

    @Test
    public void calcularPotenciaDoTermostatoPositivaTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 25.0;
        aquario.altura = 40.0;
        aquario.largura = 40.0;

        double potencia = aquario.calcularPotenciaDoTermostato(27.0,24.0);
        
        assertEquals(6.0, potencia);
    }

    @Test
    public void calcularPotenciaDoTermostatoNegativaTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 25.0;
        aquario.altura = 40.0;
        aquario.largura = 40.0;

        double potencia = aquario.calcularPotenciaDoTermostato(24.0,27.0);
        
        assertEquals(-6.0, potencia);
    }

    @Test
    public void calcularQuantidadeLitrosFiltroMaximoTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 25.0;
        aquario.altura = 40.0;
        aquario.largura = 40.0;

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double maximo = filtragem[0];

        assertEquals(120, maximo);

    }

    @Test
    public void calcularQuantidadeLitrosFiltroMinimoTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 25.0;
        aquario.altura = 40.0;
        aquario.largura = 40.0;

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double minimo = filtragem[1];

        assertEquals(80, minimo);

    }

}

 
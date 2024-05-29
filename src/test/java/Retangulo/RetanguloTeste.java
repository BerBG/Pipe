package Retangulo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RetanguloTeste {

    @Test
    public void testArea() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(40, retangulo.area());
    }

    @Test
    public void testPerimetro() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(30, retangulo.perimetro());
    }
}

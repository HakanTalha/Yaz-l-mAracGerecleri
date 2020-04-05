package tr.edu.medipol.hakantalha;
import org.junit.*;
import static org.junit.Assert.assertEquals;
public class ToplamaTest {
	@Test
	public void PozitifSayilariToplama() {
		
		Hesap toplama  = new Toplama();
		String sayi1="10";
		String sayi2="20";
		String sonuc = toplama.sonucubul(sayi1, sayi2);
		assertEquals("30",sonuc);		
	}	
	@Test
	public void NegatifSayilariToplama() {
	Hesap toplama = new Toplama();
	String Sayi1="-10";
	String Sayi2="-20";
	String sonuc = toplama.sonucubul(Sayi1, Sayi2);
	assertEquals("-30",sonuc);
				
	}

}

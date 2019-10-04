package dad.javafx.bindings.mode;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		PersonaFx andres=new PersonaFx();
		andres.setNombre("Andres");
		andres.setSexo(Sexo.APACHE);
		andres.setFechaNacimiento(LocalDate.of(1997, 10, 2));
		
		
	}
}

package clase1;

import java.util.Scanner;

public class Actividad_7 {

	public static void main(String[] args) {
		String user;
		String pass;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("por faver ingrese el usuario");
			user = teclado.next();
		System.out.println("porfavor ingrese la contraseņa");
			pass = teclado.next();
			
		String usuario = "enzo";
		String contraseņa = "4321";
		
		if (user.equals(usuario)) {
			if (pass.equals(contraseņa)) {
				System.out.println("bienvendio al sistema");
			}else {
				System.out.println("la contraseņa ingresada no es valida");
			}
		}else {
			System.out.println("el usuario ingresado no es valido");
		}

	}

}

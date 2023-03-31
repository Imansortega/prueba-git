package paquete;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\nEn esta clase se dan los datos de qualified name, package y classpath\n");
		
		@SuppressWarnings("rawtypes")
		Class c = java.util.ArrayList.class;
		String className = c.getName();
		System.out.println("The fully-qualified name of the class is: " + className);
		System.out.println("El \"fully-qualified name\" de la clase es: ---> " + Principal.class);
		System.out.println("El nombre del package es:                 ---> " + Principal.class.getPackageName());	
		System.out.println("El classpath es:                          ---> " + System.getProperty("java.class.path"));
		System.out.println("----------------------------------------------");
		
	}

}

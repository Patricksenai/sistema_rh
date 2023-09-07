package com.rh.sistema_rh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaRhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaRhApplication.class, args);
	
Gerente gerente = new Gerente("Felipe ","", "", "")
Supervisor supervisor = new Supervisor("", "", "", "");
Atendente atendente = new Atendente("ihbcdihjasdc","61651651","651651","65465");
System.out.println("-------------------------------------------------");
atendente.imprimirDados();
System.out.println("-------------------------------------------------");
supervisor.imprimirDados();

	}
}



	



package com.ryanprado.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ryanprado.senai.domain.Cliente;
import com.ryanprado.senai.domain.Estado;
import com.ryanprado.senai.domain.enums.TipoCliente;
import com.ryanprado.senai.repositories.ClienteRepository;
import com.ryanprado.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{
	
	@Autowired
	private EstadoRepository estadoRepository;
	 
   @Autowired
   private ClienteRepository clienteRespository;
   
	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}
	 
	@Override
	public void run(String... args) throws Exception {
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Sao Paulo");
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		
		
		Cliente cli1 = new  Cliente(null, "Danilo Araújo", "12345678901",	"danilo@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli1.getTelefones().addAll(Arrays.asList("34900000000","98765432112"));
		clienteRespository.saveAll(Arrays.asList(cli1));
		
		Cliente cli2 = new  Cliente(null, "Felipe", "09876543211",	"felipe@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli2.getTelefones().addAll(Arrays.asList("34998765429","98765432113"));
		clienteRespository.saveAll(Arrays.asList(cli2));
		
		Cliente cli3 = new  Cliente(null, "Karina", "12345678904",	"kaka@hotmail.com",
				TipoCliente.PESSOAFISICA );
		cli3.getTelefones().addAll(Arrays.asList("34984567555","98765442112"));
		clienteRespository.saveAll(Arrays.asList(cli3));
		
		Cliente cli4 = new  Cliente(null, "Fabio", "12432456123",	"fabio@outlook0.com",
				TipoCliente.PESSOAFISICA );
		cli4.getTelefones().addAll(Arrays.asList("34999876543","98775432112"));
		clienteRespository.saveAll(Arrays.asList(cli4));
		
		Cliente cli5 = new  Cliente(null, "Lenin", "12345677901",	"lenis@gmail.com.br",
				TipoCliente.PESSOAFISICA );
		cli5.getTelefones().addAll(Arrays.asList("34990706500","98465432112"));
		clienteRespository.saveAll(Arrays.asList(cli5));
		
		Cliente cli6 = new  Cliente(null, "Sabrina", "12345678981",	"brina@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli6.getTelefones().addAll(Arrays.asList("34990550088","98765432612"));
		clienteRespository.saveAll(Arrays.asList(cli6));
		
		Cliente cli7 = new  Cliente(null, "Danilo Araújo Martins", "14797928612",	"danilo.martins.ara@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli7.getTelefones().addAll(Arrays.asList("34900000000","98765432112"));
		clienteRespository.saveAll(Arrays.asList(cli7));
		
		Cliente cli8 = new  Cliente(null, "Andressa", "54345668901",	"andressa@outlook.com",
				TipoCliente.PESSOAFISICA );
		cli8.getTelefones().addAll(Arrays.asList("34998564632","987654332"));
		clienteRespository.saveAll(Arrays.asList(cli8));
		
		Cliente cli9 = new  Cliente(null, "Joao Lucas", "12345558431",	"joao@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli9.getTelefones().addAll(Arrays.asList("34984567783","98765448812"));
		clienteRespository.saveAll(Arrays.asList(cli9));
		
		Cliente cli10 = new  Cliente(null, "Igor", "14567832511",	"igoro@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli10.getTelefones().addAll(Arrays.asList("34984567433","98765432777"));
		clienteRespository.saveAll(Arrays.asList(cli10));
		
		
		
		
	}

}

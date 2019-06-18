package com.Danilo.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Danilo.senai.domain.Cidade;
import com.Danilo.senai.domain.Cliente;
import com.Danilo.senai.domain.Endereco;
import com.Danilo.senai.domain.Estado;
import com.Danilo.senai.domain.enums.TipoCliente;
import com.Danilo.senai.repositories.CidadeRepository;
import com.Danilo.senai.repositories.ClienteRepository;
import com.Danilo.senai.repositories.EnderecoRepository;
import com.Danilo.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{
	
	@Autowired
	private EstadoRepository estadoRepository;
	 
   @Autowired
   private ClienteRepository clienteRespository;
   
   @Autowired
   private CidadeRepository cidadeRespository;
   
   @Autowired
   private EnderecoRepository enderecoRespository;
   
   
   
	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}
	 
	@Override
	public void run(String... args) throws Exception {
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Sao Paulo");
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		
		Cidade c1 = new Cidade (null,"Uberlândia", est1);
		Cidade c2 = new Cidade (null,"São Paulo", est2);
		cidadeRespository.saveAll(Arrays.asList(c1,c2));
		
	
		
		
		Cliente cli1 = new  Cliente(null, "Danilo Araújo", "12345678901",	"danilo@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli1.getTelefones().addAll(Arrays.asList("34900000000","98765432112"));
		
		
		Cliente cli2 = new  Cliente(null, "Felipe", "09876543211",	"felipe@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli2.getTelefones().addAll(Arrays.asList("34998765429","98765432113"));
		
		
		Cliente cli3 = new  Cliente(null, "Karina", "12345678904",	"kaka@hotmail.com",
				TipoCliente.PESSOAFISICA );
		cli3.getTelefones().addAll(Arrays.asList("34984567555","98765442112"));
	
		
		Cliente cli4 = new  Cliente(null, "Fabio", "12432456123",	"fabio@outlook0.com",
				TipoCliente.PESSOAFISICA );
		cli4.getTelefones().addAll(Arrays.asList("34999876543","98775432112"));
		
		
		Cliente cli5 = new  Cliente(null, "Lenin", "12345677901",	"lenis@gmail.com.br",
				TipoCliente.PESSOAFISICA );
		cli5.getTelefones().addAll(Arrays.asList("34990706500","98465432112"));
		
		
		Cliente cli6 = new  Cliente(null, "Sabrina", "12345678981",	"brina@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli6.getTelefones().addAll(Arrays.asList("34990550088","98765432612"));
		
		
		Cliente cli7 = new  Cliente(null, "Danilo Araújo Martins", "14797928612",	"danilo.martins.ara@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli7.getTelefones().addAll(Arrays.asList("34900000000","98765432112"));
		
		
		Cliente cli8 = new  Cliente(null, "Andressa", "54345668901",	"andressa@outlook.com",
				TipoCliente.PESSOAFISICA );
		cli8.getTelefones().addAll(Arrays.asList("34998564632","987654332"));
		
		
		Cliente cli9 = new  Cliente(null, "Joao Lucas", "12345558431",	"joao@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli9.getTelefones().addAll(Arrays.asList("34984567783","98765448812"));
		
		
		Cliente cli10 = new  Cliente(null, "Igor", "14567832511",	"igoro@gmail.com",
				TipoCliente.PESSOAFISICA );
		cli10.getTelefones().addAll(Arrays.asList("34984567433","98765432777"));
		clienteRespository.saveAll(Arrays.asList(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli10));
		
		
		Endereco e1 = new Endereco(null, "Rua das Emboabas","55b","Ap310","Jardim","38447587",cli1,c1);
		cli1.getEnderecos().addAll(Arrays.asList(e1));
		enderecoRespository.saveAll(Arrays.asList(e1));
		
		
		
	}

}

package banco.inter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodosTeste.MetodosDeTestesJava;
import pages.Elementos;


public class AbrirContaInterTest extends MetodosDeTestesJava {

	MetodosDeTestesJava metodos = new MetodosDeTestesJava();
	Elementos el = new Elementos();
	
	@Given("que eu acesse o site do banco inter {string}")
	public void que_eu_acesse_o_site_do_banco_inter(String site) {
	    
		metodos.abrirNavegador(site);
			
		metodos.validarJanela(lDriver().findElement(By.id("onetrust-accept-btn-handler")));
	
	}
	@When("clico em abrir sua conta")
	public void clico_em_abrir_sua_conta() {
	   
		metodos.clicar(el.getAbraSuaConta());
	}

	@When("digitar o nome {string}")
	public void digitar_o_nome(String texto) {
		
		metodos.preencher(el.getnome(), texto);
	    
	}

	@When("digitar o telefone {string}")
	public void digitar_o_telefone(String telefone) {
		
		metodos.preencher(el.gettelefone(), telefone);
			
	}

	@When("digitar o email {string}")
	public void digitar_o_email(String email) {
	   
		metodos.preencher(el.getemails(), email);
	}

	@When("digitar o cpf {string}")
	public void digitar_o_cpf(String cpf) {
	    
		metodos.preencher(el.getcpf(), cpf);
	}

	@When("digitar a data de nascimento {string}")
	public void digitar_a_data_de_nascimento(String nasc) {
	   
		metodos.preencher(el.getdataNasc(), nasc);
	}
	
	@When("clico em autorizar politica de privacidade")
	public void clico_em_autorizar_politica_de_privacidade() {
	    
		metodos.clicar(el.getbtnAceite());
	}

	@When("clico no botao continuar do do formulario")
	public void clico_no_botao_continuar_do_do_formulario() {
	    
		metodos.clicar(el.getbtnEnviar());
	}

	@Then("formulario enviado com sucesso")
	public void formulario_enviado_com_sucesso() {
		
		metodos.screenShot("Teste abertura de conta");
		metodos.fechar();
		
	}
}

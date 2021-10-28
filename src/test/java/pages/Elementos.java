package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import metodosTeste.MetodosDeTestesJava;

public class Elementos  {
	
	
	
	private By abraSuaConta = By.xpath("//*[@class=\"btn--green btn--sm btn btn-open-account text-white fw-600\"]");

	public By getAbraSuaConta() {
		return abraSuaConta;
	}

	private By btnPopap = By.id("onetrust-accept-btn-handler");
	
	public By getbtnPopap() {
		return btnPopap;
	}
	
	private By nome = By.id("nome");
	
	public By getnome() {
		return nome;
	}
	
	private By telefone = By.name("celular");
	
	public By gettelefone() {
		return telefone;
	}
	
	private By emails = By.id("email");
	
	public By getemails() {
		return emails;
	}
	
	private By cpf = By.id("cpf");
	
	public By getcpf() {
		return cpf;
	}
	
	private By dataNasc = By.id("dataNascimento");
	
	public By getdataNasc() {
		return dataNasc;
	}
	
	private By btnAceite = By.xpath("//*[@class=\"form-label-check fs-14 lh-17\"]");
	
	public By getbtnAceite() {
		return btnAceite;
	}
	
	private By btnEnviar = By.xpath("//*[@class=\"btn btn-orange--extra fs-14 fw-600 rounded-2 mx-auto text-white text-none\"]");
	
	public By getbtnEnviar() {
		return btnEnviar;
	}
}



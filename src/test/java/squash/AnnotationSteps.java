/**
 *     This file is part of the Squashtest platform.
 *     Copyright (C) 2018 - 2019 Henix
 *
 *     See the NOTICE file distributed with this work for additional
 *     information regarding copyright ownership.
 *
 *     This is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     this software is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this software.  If not, see <http://www.gnu.org/licenses />.
 */
package squash;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonnéque;
import cucumber.api.java.fr.Quand;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import squash.page.HomeWorkspacePage;
import squash.page.LoginPage;
import squash.page.TestCaseInfoPage;
import squash.utils.SlowWebDriver;

import java.util.concurrent.TimeUnit;

public class AnnotationSteps {
	private static final String SQUASH_URL = "http://127.0.0.1:8080/squash";
	private WebDriver driver;
	private WebDriverWait wait;

	@Before
	public void setup(){
		driver = new SlowWebDriver(new ChromeDriver(), 2000);
		wait = new WebDriverWait(driver, 100);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(SQUASH_URL);
	}

	@Etantdonnéque("je suis sur la page d'authentification Squash")
	public void je_suis_sur_la_page_d_authentification_Squash() {
		LoginPage squashLoginPage = new LoginPage(driver);
		squashLoginPage.checkElementWithId("username");
		squashLoginPage.checkElementWithId("password");
	}

	@Etantdonnéque("je me connecte en tant que {string} avec mot de passe {string}")
	public void je_me_connecte_en_tant_que_avec_mot_de_passe(String username, String password) {
		LoginPage squashLoginPage = new LoginPage(driver);
		squashLoginPage.fillUserNameAndPasswordInput(wait, username, password);
		squashLoginPage.loginToHomePage(wait);
	}

	@Etantdonnéque("je suis sur la page d'accueil Squash")
	public void je_suis_sur_la_page_d_accueil_Squash() {
		HomeWorkspacePage homePage = new HomeWorkspacePage(driver);
		Assert.assertTrue(homePage.checkHomePage());
	}

	@Etantdonnéque("je navigate au CdT BBD dont l'id est {long}")
	public void je_navigate_au_CdT_BDD_dont_l_id_est(long id) {
		String testCaseUrl = SQUASH_URL+"/test-cases/"+id+"/info";
		driver.get(testCaseUrl);
		TestCaseInfoPage testCaseInfoPage = new TestCaseInfoPage(driver);
		testCaseInfoPage.checkElementWithId("test-case-name-div");
		WebElement testCaseNameElement = testCaseInfoPage.getDriver().findElement(By.id("test-case-name"));
		Assert.assertEquals("Test case name href must be the same to test case url.", testCaseUrl, testCaseNameElement.getAttribute("href"));
	}

	@Etantdonnéque("je saisis un paramètre dans un pas de test")
	public void je_saisis_un_paramètre_dans_un_pas_de_test() {
		System.out.println("Hello 1");



	}

	@Quand("dans la zone Action je saisis : {string}")
	public void dans_la_zone_Action_je_saisis(String string) {
		System.out.println("Hello 2");
	}

	@Alors("je suis dans le cas suivant : chevron ouvrant présent mais pas de chevron fermant")
	public void je_suis_dans_le_cas_suivant_chevron_ouvrant_présent_mais_pas_de_chevron_fermant() {
		System.out.println("Hello 3");
	}


	@Alors("le message suivant est affiché dans une pop up :")
	public void le_message_suivant_est_affiché_dans_une_pop_up(String docString) {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 4");
	}

	@Alors("je suis dans le cas suivant : chevron fermant présent mais pas de chevron ouvrant")
	public void je_suis_dans_le_cas_suivant_chevron_fermant_présent_mais_pas_de_chevron_ouvrant() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 5");
	}

	@Alors("je suis dans le cas suivant : pas de paramètre renseigné entre les chevrons")
	public void je_suis_dans_le_cas_suivant_pas_de_paramètre_renseigné_entre_les_chevrons() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 6");
	}

	@Alors("je suis dans le cas suivant : caractère interdit")
	public void je_suis_dans_le_cas_suivant_caractère_interdit() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 7");
	}

	@After
	public void close(){
		if (driver != null) {
			driver.quit();
		}
	}
}
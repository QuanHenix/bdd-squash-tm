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

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonnéque;
import cucumber.api.java.fr.Quand;

public class AnnotationSteps {

	@Etantdonnéque("je saisis un paramètre dans un pas de test")
	public void je_saisis_un_paramètre_dans_un_pas_de_test() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello 5");
	}

	@Quand("dans la zone Action je saisis : {string}")
	public void dans_la_zone_Action_je_saisis(String string) {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 1");
	}

	@Alors("je suis dans le cas suivant : chevron ouvrant présent mais pas de chevron fermant")
	public void je_suis_dans_le_cas_suivant_chevron_ouvrant_présent_mais_pas_de_chevron_fermant() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 2");
	}


	@Alors("le message suivant est affiché dans une pop up :")
	public void le_message_suivant_est_affiché_dans_une_pop_up(String docString) {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 3");
	}

	@Alors("je suis dans le cas suivant : chevron fermant présent mais pas de chevron ouvrant")
	public void je_suis_dans_le_cas_suivant_chevron_fermant_présent_mais_pas_de_chevron_ouvrant() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 4");
	}

	@Alors("je suis dans le cas suivant : pas de paramètre renseigné entre les chevrons")
	public void je_suis_dans_le_cas_suivant_pas_de_paramètre_renseigné_entre_les_chevrons() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 5");
	}

	@Alors("je suis dans le cas suivant : caractère interdit")
	public void je_suis_dans_le_cas_suivant_caractère_interdit() {
		// Write code here that turns the phrase above into concrete actions
//		throw new cucumber.api.PendingException();
		System.out.println("Hello 6");
	}
}
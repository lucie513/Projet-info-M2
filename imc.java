/*
 * imc.java
 * 
 * Copyright 2020 fmahfoudh01 <fmahfoudh01@SEC-C210-F06>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class imc {
	
	public static void main (String[] args) {
		double p, t, ind ;
		char sexe;
		System.out.println("Quel est votre poids ? ") ;
		p = Lire.d() ;
		System.out.println("Quelle taille faites vous ?") ;
		t = Lire.d() ;
		ind = p/(t*t) ;
		System.out.println("Etes vous un homme ou une femme ?");
		sexe = Lire.c();
		if (sexe == 'h'){
			if (ind == 22.7) {
				System.out.println("L'IMC calcule est de " + ind + ", il est normal.");
			}
			else {
				System.out.println("L'IMC calcule est de " + ind + ", il est anormal.");
			}};
		if (sexe == 'f'){
			if (ind == 22.4){
				System.out.println("L'IMC calcule est de " + ind + ", il est normal.");
			}
			else {
				System.out.println("L'IMC calcule est de " + ind + ", il est anormal.");
			}};
	}
}


/*
 * operateur.java
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


public class operateur {
	
	public static void main (String[] args) {
		double x, y;
		char o;
		
		System.out.println("Donnez x");
		x = Lire.d();
		System.out.println("Donnez y");
		y = Lire.d();
		System.out.println("Quel est votre operateur ?");
		o = Lire.c();
		if (o == '+') {
			System.out.println("resultat = " + x+y);
		};
		if (o == '-') {
			System.out.println("resultat = " + (x-y));
		};
		if (o == '*') {
			System.out.println("resultat = " + x*y);
		};
		if (o == '/') {
			System.out.println("resultat = " + x/y);
		};
	}
}


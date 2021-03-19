/*
 * Premier.java
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


public class Premier {
	
	public static void main (String[] args) {
		//calcule la surface d'un triangle dont on demande les données
		
			double b, h ;
			System.out.println("Donnez b : ") ;
			b = Lire.d() ;
			System.out.println("Donnez h : ") ;
			h = Lire.d() ;
			System.out.println("La surface est : " + 0.5*b*h) ;
	}
}


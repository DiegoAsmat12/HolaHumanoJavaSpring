package com.diegoasmat.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHumano {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String saludo(@RequestParam(value="nombre", required=false)String nombre,
			@RequestParam(value="apellido", required=false)String apellido,
			@RequestParam(value="veces", required=false)Integer veces) {
		String cadenaSaludo = " Hola ";
		if(nombre==null) {
			cadenaSaludo+= "Humano.";
		}
		else {
			cadenaSaludo+=nombre;
		}
		if(apellido!=null) {
			cadenaSaludo+=(" "+apellido);
		}
		if(veces!=null) {
			String cadenaAux="";
			for(int i=0; i<veces; i++) {
				cadenaAux+=(cadenaSaludo+" ");
				
			}
			return cadenaAux;
		}
		return cadenaSaludo;
	}
	
}

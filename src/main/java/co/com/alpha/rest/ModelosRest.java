package co.com.alpha.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.alpha.domain.model.Modelo;
import co.com.alpha.domain.service.ModelosService;

@RestController
@RequestMapping("/modelos")
public class ModelosRest {

	@Autowired
	ModelosService modelosService;

	@GetMapping("/lista")
	private List<Modelo> lista() {
		System.out.println("esta listando modelos");
		return modelosService.findAll();
	}

	@PostMapping("/guardar")
	public void guardar(@RequestBody Modelo modelos) {
		System.out.println("esta guardando el Modelos");
		modelosService.save(modelos);
	}

	@PostMapping("/agregar/material/{idMaterial}/{idModelo}")
	public void guardar(@PathVariable Modelo idMaterial, @PathVariable Modelo idModelo) {
		System.out.println("esta guardando el Modelo con un material agregado");
		modelosService.save(idMaterial, idModelo);
	}

	@PutMapping("/modificar")
	public void modificar(@RequestBody Modelo modelos) {
		System.out.println("esta modificando el Modelos");
		modelosService.ubdate(modelos);
	}

	@DeleteMapping(value = "/eliminar/{id}")
	public void elimiar(@PathVariable("id") Integer id) {
		System.out.println("esta eliminando el Modelos");
		modelosService.eliminarid(id);
	}

}

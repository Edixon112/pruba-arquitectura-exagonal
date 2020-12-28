package co.com.alpha.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.alpha.domain.model.Cliente;
import co.com.alpha.domain.service.ClienteService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cliente")
public class ClienteRest {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping ("/lista")
	private List<Cliente> lista(){
		System.out.println("esta listando");
		return clienteService.findAll();
	}
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Cliente cliente) {
		System.out.println("esta guardando el Cliente");
		clienteService.save(cliente);
	}
	
	@PutMapping ("/modificar")
	public void modificar(@RequestBody Cliente cliente) {
		System.out.println("esta modificando el Cliente");
		clienteService.update(cliente);
	}
	
	@DeleteMapping (value = "/eliminar/{id}")
	public void elimiar(@PathVariable("id") Integer id) {
		System.out.println("esta eliminando el Cliente");
		clienteService.eliminarid(id);
	}
	
}
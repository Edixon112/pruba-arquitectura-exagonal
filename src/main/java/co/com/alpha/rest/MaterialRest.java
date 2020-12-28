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

import co.com.alpha.domain.model.Material;
import co.com.alpha.domain.service.MaterialService;

@RestController
@RequestMapping("/material")
public class MaterialRest {
		
		@Autowired
		private MaterialService materialService;
		
		@GetMapping ("/lista")
		private List<Material> lista(){
			System.out.println("esta listando");
			return materialService.findAll();
		}
		
		@PostMapping ("/guardar")
		public void guardar(@RequestBody Material material) {
			System.out.println("esta guardando el Material");
			materialService.save(material);
		}
		
		@PutMapping ("/modificar")
		public void modificar(@RequestBody Material material) {
			System.out.println("esta modificando el Material");
			materialService.update(material);
		}
		
		@DeleteMapping (value = "/eliminar/{id}")
		public void elimiar(@PathVariable("id") Integer id) {
			System.out.println("esta eliminando el Matrial");
			materialService.eliminarid(id);
		}
		
}

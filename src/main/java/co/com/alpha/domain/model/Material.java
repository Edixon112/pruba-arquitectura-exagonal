package co.com.alpha.domain.model;



import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name = "Materiales")
public class Material {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private Long precio;
	
	@ManyToMany 
	private List<Modelo> modelos;


}

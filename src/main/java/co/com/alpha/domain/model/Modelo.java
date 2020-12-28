package co.com.alpha.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Modelos")
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String nombrereja;
	
	@JoinTable(name = "materiales_modelos",
			joinColumns = @JoinColumn(name = "modelo_id",nullable = false),
			inverseJoinColumns = @JoinColumn(name = "material_id",nullable = false ))
	@ManyToMany
	private List<Material> materiales;
	
	public void addMaterial(Material material) {
		if(this.materiales == null) {
			this.materiales = new ArrayList<>();
		}
		this.materiales.add(material);
	}
	
/*
	@ManyToMany

	@JoinTable(name = "tabla de combinacion",
	joinColumns = @JoinColumn(name = "Modelos_id"), 
	inverseJoinColumns = @JoinColumn(name = "Material_id"))
	Set<Material> likedMaterial;
*/
	
}
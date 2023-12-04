package org.example.myshop.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.example.myshop.model.CategoryData;

import javax.persistence.*;

@Data
@Entity
@Table(name="categories")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Category extends CategoryData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, unique = true)
	private String title;

	public Category(CategoryData categoryData){
		super(categoryData);
	}
}

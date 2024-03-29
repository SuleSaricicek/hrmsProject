package kodlamaio.hrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_positions")
@Entity


public class JobPosition {
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;



}

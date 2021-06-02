package kodlamaio.hrmsProject.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProject.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();

}

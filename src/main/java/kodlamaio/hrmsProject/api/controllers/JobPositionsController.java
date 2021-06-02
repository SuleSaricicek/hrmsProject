package kodlamaio.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProject.business.abstracts.JobPositionService;
import kodlamaio.hrmsProject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	public JobPositionsController() {
		
	}
	
	public JobPositionService getJobPositionService() {
		return jobPositionService;
	}

	public void setJobPositionService(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	
	@GetMapping("/getall")
	List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
}

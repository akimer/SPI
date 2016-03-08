package fr.univbrest.dosi.spi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.spi.bean.Evaluation;
import fr.univbrest.dosi.spi.service.EvaluationService;

/**
 * 
 * @author Othman
 *
 */
@RestController
public class EvaluationController {

	@Autowired
	EvaluationService evaServ;
	
	@RequestMapping(value="/evaluations")
	public List<Evaluation> listerEvaluations(){
		return evaServ.getAllEvaluations();
	}
	
	@RequestMapping(value="/findEvaluationById-{idEvaluation}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Evaluation getEvaluation(@PathVariable(value="idEvaluation")Long idEvaluation){
		return evaServ.getEvaluation(idEvaluation);
	}
}

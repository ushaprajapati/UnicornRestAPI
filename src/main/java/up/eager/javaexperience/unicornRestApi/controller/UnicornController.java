package up.eager.javaexperience.unicornRestApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import up.eager.javaexperience.unicornRestApi.model.Unicorn;
import up.eager.javaexperience.unicornRestApi.repository.UnicornapiRepository;

@RestController
public class UnicornController {
	
	@Autowired
	UnicornapiRepository unirepo;
	
	@PostMapping("/addunicorn")
	public Unicorn addUnicorn(@RequestBody Unicorn uni) {
		unirepo.save(uni);
		return  uni;
	}
	
	@GetMapping("/getall")
	public List<Unicorn> getAllUnicorn(){
		return unirepo.findAll();
	}
	
	@GetMapping("/unicorn/{id}")
	public Optional<Unicorn> findById(@PathVariable("id") int id) {
		return unirepo.findById(id);
	}
	

}

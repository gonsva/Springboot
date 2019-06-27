package UFC.UFC_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import UFC.UFC_app.model.Note;
import UFC.UFC_app.repository.NotesRepository;

@RestController
@RequestMapping("api/v1")
public class NotesController {
	
	@Autowired
	private NotesRepository notesRepository;
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list(){
		return notesRepository.findAll();
		
	}

}

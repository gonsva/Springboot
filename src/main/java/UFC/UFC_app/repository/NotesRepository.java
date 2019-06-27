package UFC.UFC_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import UFC.UFC_app.model.Note;

public interface NotesRepository 
		extends JpaRepository<Note, Long>{

}

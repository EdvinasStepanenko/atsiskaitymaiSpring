package egzaminas_atsiskaitymai;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SaskaitosRepository extends CrudRepository<Saskaitos, Integer> {

	//Object findByKlientai_id(Integer klientai_id);
	List<Saskaitos> findByKlientaiId (Integer kid);

}
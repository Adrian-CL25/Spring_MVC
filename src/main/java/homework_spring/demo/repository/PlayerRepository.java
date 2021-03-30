package homework_spring.demo.repository;

import homework_spring.demo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("userRepository")
public interface PlayerRepository extends JpaRepository<Player,Integer> {

}

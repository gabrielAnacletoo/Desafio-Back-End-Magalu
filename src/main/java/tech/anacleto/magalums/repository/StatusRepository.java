package tech.anacleto.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.anacleto.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}

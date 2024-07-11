package tech.anacleto.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.anacleto.magalums.entity.Notification;
import tech.anacleto.magalums.entity.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}

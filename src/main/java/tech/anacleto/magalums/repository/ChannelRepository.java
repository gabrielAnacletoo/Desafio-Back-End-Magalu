package tech.anacleto.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.anacleto.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}

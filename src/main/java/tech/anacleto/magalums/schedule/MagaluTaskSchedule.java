package tech.anacleto.magalums.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tech.anacleto.magalums.service.NotificationService;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class MagaluTaskSchedule {

    private static final Logger logger = LoggerFactory.getLogger(MagaluTaskSchedule.class);

    private final NotificationService notificationService;

    public MagaluTaskSchedule(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasks(){
        var dateTime = LocalDateTime.now();
        //logger.info("Running at {}", dateTime);
        notificationService.checkAndSend(dateTime);
    }
}

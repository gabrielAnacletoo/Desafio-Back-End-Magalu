package tech.anacleto.magalums.controller.dto;

import tech.anacleto.magalums.entity.Channel;
import tech.anacleto.magalums.entity.Notification;
import tech.anacleto.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {
    public Notification toNotification(){
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}

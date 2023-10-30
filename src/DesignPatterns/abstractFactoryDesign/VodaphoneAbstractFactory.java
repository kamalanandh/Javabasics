package DesignPatterns.abstractFactoryDesign;

public class VodaphoneAbstractFactory { //Main Abstract factory pattern class is called
    static NotificationAbstractService buildNotification(NotificationType type)
    {
        NotificationAbstractService notify = null;
        //type string will be any of the one enums
        switch (type)
        {
            case SMS:
                notify = new SMSAbstractNotification(NetworkType.VODAPHONE);
                break;

            case PUSH:
                notify = new PushAbstractNotification(NetworkType.VODAPHONE);
                break;

            case EMAIL:
                notify = new EmailAbstractNotification(NetworkType.VODAPHONE);
                break;

            default:
                break;

        }
        return notify;
    }
}
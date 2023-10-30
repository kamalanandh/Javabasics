package DesignPatterns.abstractFactoryDesign;

public class PhoneFactory {
    private PhoneFactory()
    {

    }
    public static NotificationAbstractService sendPhoneNotification(NotificationType type,NetworkType network)
    {
        //This is a enhanced switch - advance Java
        return switch (network) {
            case VODAPHONE -> {
                yield VodaphoneAbstractFactory.buildNotification(type);
            }
            case JIO -> JIOAbstractFactory.buildNotification(type);
            default -> AirtelAbstractFactory.buildNotification(type);
        };
    }
}


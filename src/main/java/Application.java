public class Application {
  public static void main(String[] args) {
    Sms sms = new Sms();
    Notification notification = new Notification(sms);
    notification.alert();
  }
}

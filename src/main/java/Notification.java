public class Notification {
  private Message message;

  //dependeny injection 2 class arasinda obyekt bagliligini qirir.
  //constructor injection
  public Notification(Message message){
    this.message = message;
  }
  public void alert(){
    System.out.println("Notificiation");
    message.send();
  }
}

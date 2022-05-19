import Subjects.*;
import Observers.*;


public class App {

    public static void main(String[] args ) {

        MainObserver twClient = new TwitterObserver("FCITKAU");
        MainObserver emailClient = new EmailObserverClient("Abdullah.m.bajaman@gmail.com");
        MainObserver smsClient = new smsObserver("+966000000000");
        Subject s = new MessageSubject();

        s.subscribe(twClient);
        s.subscribe(emailClient);

        s.notifyUpdate(""" 
                  \n Listen along with us in our new episode, where we talk about the new breakthrough in the tech industry  .. 
                 In addition to our highly acclaimed guest who believes that Bitcoin will change the world in the next 3 years! 
                """);
        System.out.println("[!] Change: unsubscribed email and subscribed SMS\n");
        s.unsubscribe(emailClient);
        s.subscribe(smsClient);

        s.notifyUpdate("\nHave you got 20 minutes? Join us through our platforms and enjoy 20 minutes of informative content .. ");
    }
}

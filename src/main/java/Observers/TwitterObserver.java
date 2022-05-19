package Observers;

public class TwitterObserver extends MainObserver {
    public TwitterObserver(String recipient){
        super.setRecipient(recipient);
    }
    @Override
    public void update(String message){
        System.out.println("\n >> Twitter Client :: @" + getRecipient() + " " + message);
    }
}

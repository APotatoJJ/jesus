import java.util.*;
import java.util.concurrent.TimeUnit;
class Main {
  public static String playerName = new String();
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("\033\143");
      System.out.println();
      System.out.println( "                       Welcome to the future of technology!"); // This might be a good start??
      input.nextLine();
      System.out.println();
      System.out.println( "     Your job as our volunteer is to test our sensory filled virtual world");// there's lorrrre, bouta get matpat in dis ho
      input.nextLine();
      System.out.println();
      System.out.println("Once we've imported you into our system we'll assess your person for our VR assets");
      input.nextLine();
      System.out.println();
      System.out.println( "           *Note you will not remember anything going into the system*");
      input.nextLine();
      System.out.println();
      System.out.println( "    !!YOU MAY EXPERIENCE MILD DISCOMFORT WHILST BEING IMPORTED TO THE SYSTEM!!");
      input.nextLine();
      System.out.println();
    System.out.print("\033\143");
      System.out.println( "        *Our company is not responsible for including but not limited to:* ");
      input.nextLine();
      System.out.println( "                                   *Trauma* ");
      input.nextLine();
      System.out.println( "                                   *Mental Instability* ");
      input.nextLine();
      System.out.println( "                                   *Sense of detachment from society* ");
      input.nextLine();
      System.out.println( "                                   *Blindness in one or both eyes* ");
      input.nextLine();
      System.out.println( "                                   *Death* ");
      input.nextLine();
      System.out.println( "                                   *Depression* ");
      input.nextLine();
      System.out.println( "                                   *Loss of age* ");
      input.nextLine();
      System.out.println( "                                   *Spinal or nerve paralisis* ");
      input.nextLine();
      System.out.println( "                                   *Loss of taste* ");
      input.nextLine();
      System.out.println( "                                   *Loss of hearing* ");
      input.nextLine();
      System.out.println( "                                   *Loss of smell* ");
      input.nextLine();
      System.out.println( "                                   *Loss of sense in direction* ");
      input.nextLine();
      System.out.println( "                                   *Numbness* ");
      input.nextLine();
      System.out.println( "                                   *Short term memory loss* ");
      input.nextLine();
    System.out.print("\033\143");
      System.out.println( "                   Please enjoy your experience at error.pnf404_siMi! ");
      input.nextLine();
    System.out.print("\033\143");
      loading("loading...");
    System.out.print("\033\143");
      System.out.println( "                                  Download Complete+");
      input.nextLine();
    System.out.print("\033\143");
      System.out.println( "System AI:");
      System.out.print( "Hey! It's great to finally meet you, we've been waiting forever name.notFound");
      input.nextLine();
    System.out.print("\033\143");
      System.out.println( "System AI:");
      System.out.print( "uh I forgot your name...");
      input.nextLine();
    System.out.print("\033\143");
      System.out.println( "System AI:");
      System.out.println( "What is it?");
      naming();
    System.out.print("\033\143");
      System.out.println( "System AI:");
      System.out.print( "Okay... " + playerName );
      input.nextLine();
    System.out.print("\033\143");
      System.out.println( "System AI:");
      System.out.print(playerName + "?");
      input.nextLine();
      psvynA();
}
  public static void psvynA(){
    System.out.print("\033\143");
      System.out.println( "System AI:");
      System.out.print("Really?");
      String ynA = input.next();
        ynA.toLowerCase(); 
    switch (ynA){
      case ("yes"):
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "I really don't understand humans");
          input.nextLine();
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "What kind of parent would name their child " + playerName);
          input.nextLine();
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "That's like being born with disability!");
          input.nextLine();
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "You know what... I'm changing your name");
          input.nextLine();
        System.out.print("\033\143");
          loading("loading...");
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "I got it!");
          input.nextLine();
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "Israel!");
          input.nextLine();
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "Your name is Israel");
          input.nextLine();
        break;
      case ("no"):
        System.out.print("\033\143");
          System.out.println( "System AI:");
          System.out.println( "Bruh what is it then? ");
          playerName = null;
          naming();
          psvynA();
        break;
  }
}
  public static void loading(String output) {
      for (int i = 0; i<output.length(); i++) {
        char loading = output.charAt(i);
        System.out.print(loading);
        try {
          TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (Exception e) {
      }
        files();
    }
    System.out.print("\033\143");
      for (int i = 0; i<output.length(); i++) {
        char loading = output.charAt(i);
        System.out.print(loading);
        try {
          TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (Exception e) {
      }
        files();
    }
    System.out.print("\033\143");
      for (int i = 0; i<output.length(); i++) {
        char loading = output.charAt(i);
        System.out.print(loading);
        try {
          TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (Exception e) {
      }
        files();
    }
    System.out.print("\033\143");
      for (int i = 0; i<output.length(); i++) {
        char loading = output.charAt(i);
        System.out.print(loading);
        try {
          TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (Exception e) {
      }
        files();
    }
    System.out.print("\033\143");
      for (int i = 0; i<output.length(); i++) {
        char loading = output.charAt(i);
        System.out.print(loading);
        try {
          TimeUnit.MILLISECONDS.sleep(100);
        }
        catch (Exception e) {
      }
        files();
    }
  }
  public static void naming(){
        playerName = input.next();
      }
  public static void files(){
  int files = (int)(Math.random()*(17)+1);
          switch (files){
            case(1):
                System.out.print("  Audio files");
              break;
            case(2):
                System.out.print("  model files");
              break;
            case(3):
                System.out.print("  music files");
              break;
            case(4):
                System.out.print("  misc files");
              break;
            case(5):
                System.out.print("  JPEG");
              break;
            case(6):
                System.out.print("  PNG");
              break;
            case(7):
                System.out.print("  PDF");
              break;
            case(8):
                System.out.print("  SVG");
              break;
            case(9):
                System.out.print("  MP4");
              break;
            case(10):
                System.out.print("  colider files");
              break;
            case(11):
                System.out.print("  controls");
              break;
            case(12):
                System.out.print("  system");
              break;
            case(13):
                System.out.print("  graphics");
              break;
            case(14):
                System.out.print("  renders");
              break;
            case(15):
                System.out.print("  jokes");
              break;
            case(16):
                System.out.print("  Watchers");
              break;
            case(17):
                System.out.print("  personal data");
              break;
            case(18):
                System.out.print("  rng factors");
              break;
        }
  } // It's supposed to add top "loading" but im'a need a bit of time to figure it out for now ima move on to the "person assesment" section
}
// I have an idea to use the main page to let the player create their character and their baground then use their inputs in the future, maybe?
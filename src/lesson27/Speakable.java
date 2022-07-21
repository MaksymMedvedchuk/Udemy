package lesson27;

public interface Speakable {

    default void printSpeakInfo(){
        System.out.println("Somebody speaks");
    }
}

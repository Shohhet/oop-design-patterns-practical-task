package patterns.behavioral.iterator;

import java.util.concurrent.TimeUnit;

public class IteratorRunner {
    public static void main(String[] args) throws InterruptedException {
        RadioWave[] waves = {
                new RadioWave(101.2),
                new RadioWave(102.8),
                new RadioWave(105.6),
                new RadioWave(108.4),
                new RadioWave(110.1)
        };
        Radio radio = new Radio(waves);
        Iterator<RadioWave> iterator = radio.getIterator();
        while(iterator.hasNext()) {
            IteratorRunner.listenRadioWave(iterator.next());
        }

    }
    private static void listenRadioWave(RadioWave radioWave) throws InterruptedException {
        System.out.println("Listening radio at frequency " + radioWave.getFrequency() + "....");
        TimeUnit.SECONDS.sleep(1);
    }
}

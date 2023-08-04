package patterns.behavioral.iterator;


public class Radio implements Rememberable{
    private final RadioWave[] radioWaves;

    public Radio(RadioWave[] radioWaves) {
        this.radioWaves = radioWaves;
    }


    @Override
    public Iterator<RadioWave> getIterator() {
        return new WaveIterator();
    }
    private class WaveIterator implements Iterator<RadioWave> {
        int index;
        @Override
        public boolean hasNext() {
            return index < radioWaves.length;
        }

        @Override
        public RadioWave next() {
            return radioWaves[index++];
        }
    }
}

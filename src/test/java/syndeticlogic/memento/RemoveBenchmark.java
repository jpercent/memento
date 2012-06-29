package syndeticlogic.memento;

import syndeticlogic.memento.Benchmark;
import syndeticlogic.memento.Cache;

public class RemoveBenchmark implements Benchmark {

    private String name;
    private Object[] keys;

    public RemoveBenchmark(String name, Object[] keys) {
        this.keys = keys;
        this.name = name;
    }

    public void run(Cache cache) {

        for (int i = 0; i < keys.length; i++) {
            cache.remove(keys[i]);
        }
    }

    public String toString() {
        return name;
    }
}

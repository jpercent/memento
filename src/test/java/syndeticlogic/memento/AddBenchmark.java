package syndeticlogic.memento;

import syndeticlogic.memento.Cache;

public class AddBenchmark implements Benchmark {

    private String name;
    private Object[] keys;

    public AddBenchmark(String name, Object[] keys) {
        this.keys = keys;
        this.name = name;
    }

    public void run(Cache cache) {

        for (int i = 0; i < keys.length; i++) {
            cache.addObject(keys[i], TEST_VALUE);
        }
    }

    public String toString() {
        return name;
    }
}

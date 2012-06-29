package syndeticlogic.memento;

import syndeticlogic.memento.Cache;

import java.io.Serializable;

public interface Benchmark {

    static final Serializable TEST_VALUE = "da' object";

    public void run(Cache cache);
}

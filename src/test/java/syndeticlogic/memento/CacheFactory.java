package syndeticlogic.memento;

import syndeticlogic.memento.Cache;

public interface CacheFactory {
    Cache newInstance(String cacheName, long timeoutMilliSeconds, int maxSize);
}

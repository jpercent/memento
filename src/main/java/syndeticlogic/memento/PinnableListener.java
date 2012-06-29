package syndeticlogic.memento;

public interface PinnableListener {
	void pin(Object key);
	void unpin(Object key);
}

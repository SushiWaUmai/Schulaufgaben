import java.util.function.Predicate;

public class BetterList<T> extends List<T> {
    private void move(T a) {
        toFirst();
        while (getContent() != a) {
            next();
        }
    }

    private void move(int index) {
        if(index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        
        toFirst();
        for (int i = 0; i < index; i++) {
            next();
        }
    }

    public T get(int index) {
        move(index);
        return getContent();
    }

    public String toString() {
        String result = "[ ";
        toFirst();
        while (getContent() != null) {
            result += getContent().toString() + " ";
            next();
        }
        result += " ]";
        return result;
    }

    public T find(T a) {
        toFirst();

        while (getContent() != null) {
            T o = getContent();
            if (o.equals(a)) {
                return o;
            }
            next();
        }
        return null;
    }

    public T find(Predicate<T> p) {
        toFirst();

        while (getContent() != null) {
            T o = getContent();
            if (p.test(o)) {
                return o;
            }
            next();
        }
        return null;
    }

    public int size() {
        int result = 0;
        toFirst();
        while (getContent() != null) {
            result++;
            next();
        }
        return result;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size()];
        toFirst();
        int i = 0;
        while (getContent() != null) {
            result[i] = getContent();
            next();
            i++;
        }
        return result;
    }

    public void insert(int index, T a) {
        move(index);
        insert(a);
    }

    public T remove(int index) {
        move(index);
        T result = getContent();
        remove();
        return result;
    }

    public T remove(T a) {
        move(a);
        remove();
        return a;
    }

    public void removeIf(Predicate<T> p) {
        toFirst();
        while (getContent() != null) {
            T o = getContent();
            if (p.test(o)) {
                remove();
                return;
            }
            next();
        }
    }

    public void replace(int index, T a) {
        move(index);
        setContent(a);
    }

    public void replaceIf(Predicate<T> p, T a) {
        toFirst();
        while (getContent() != null) {
            T o = getContent();
            if (p.test(o)) {
                setContent(a);
                return;
            }
            next();
        }
    }
}

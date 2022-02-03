import java.util.function.Predicate;

public class BetterList<T> extends List<T> {
    
    private void Move(T a) {
        toFirst();
        while (getContent() != a) {
            next();
        }
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

    public int getSize() {
        int result = 0;
        toFirst();
        while (getContent() != null) {
            result++;
            next();
        }
        return result;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[getSize()];
        toFirst();
        int i = 0;
        while (getContent() != null) {
            result[i] = getContent();
            next();
            i++;
        }
        return result;
    }

    public void remove(T a) {
        Move(a);
        remove();
    }
}

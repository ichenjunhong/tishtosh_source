package p064c.p065a.p072e.p087j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p064c.p065a.p071d.C1711f;

/* renamed from: c.a.e.j.b */
public enum C2125b implements C1711f<Object, List<Object>>, Callable<List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> C1711f<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public final List<Object> call() throws Exception {
        return new ArrayList();
    }

    public final List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }
}

package dagger.android;

/* renamed from: dagger.android.b */
public interface C52871b<T> {

    /* renamed from: dagger.android.b$a */
    public static abstract class C52872a<T> implements C52873b<T> {
        /* renamed from: a */
        public abstract C52871b<T> mo56091a();

        /* renamed from: b */
        public abstract void mo56092b(T t);

        /* renamed from: a */
        public final C52871b<T> mo56094a(T t) {
            mo56092b(t);
            return mo56091a();
        }
    }

    /* renamed from: dagger.android.b$b */
    public interface C52873b<T> {
        /* renamed from: a */
        C52871b<T> mo56094a(T t);
    }

    /* renamed from: a */
    void mo56093a(T t);
}

package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.h */
public abstract class C0176h {

    /* renamed from: android.arch.lifecycle.h$a */
    public enum C0177a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.h$b */
    public enum C0178b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(C0178b bVar) {
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public abstract C0178b mo323a();

    /* renamed from: a */
    public abstract void mo324a(C0183j jVar);

    /* renamed from: b */
    public abstract void mo325b(C0183j jVar);
}

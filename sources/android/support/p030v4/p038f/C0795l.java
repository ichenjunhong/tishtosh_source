package android.support.p030v4.p038f;

/* renamed from: android.support.v4.f.l */
public final class C0795l {

    /* renamed from: android.support.v4.f.l$a */
    public interface C0796a<T> {
        T acquire();

        boolean release(T t);
    }

    /* renamed from: android.support.v4.f.l$b */
    public static class C0797b<T> implements C0796a<T> {

        /* renamed from: a */
        private final Object[] f2713a;

        /* renamed from: b */
        private int f2714b;

        public T acquire() {
            if (this.f2714b <= 0) {
                return null;
            }
            int i = this.f2714b - 1;
            T t = this.f2713a[i];
            this.f2713a[i] = null;
            this.f2714b--;
            return t;
        }

        public C0797b(int i) {
            if (i > 0) {
                this.f2713a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public boolean release(T t) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= this.f2714b) {
                    z = false;
                    break;
                } else if (this.f2713a[i] == t) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f2714b >= this.f2713a.length) {
                return false;
            } else {
                this.f2713a[this.f2714b] = t;
                this.f2714b++;
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.f.l$c */
    public static class C0798c<T> extends C0797b<T> {

        /* renamed from: a */
        private final Object f2715a = new Object();

        public final T acquire() {
            T acquire;
            synchronized (this.f2715a) {
                acquire = super.acquire();
            }
            return acquire;
        }

        public C0798c(int i) {
            super(i);
        }

        public final boolean release(T t) {
            boolean release;
            synchronized (this.f2715a) {
                release = super.release(t);
            }
            return release;
        }
    }
}

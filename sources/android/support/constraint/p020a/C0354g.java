package android.support.constraint.p020a;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: android.support.constraint.a.g */
final class C0354g {

    /* renamed from: android.support.constraint.a.g$a */
    interface C0355a<T> {
        /* renamed from: a */
        T mo803a();

        /* renamed from: a */
        void mo804a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo805a(T t);
    }

    /* renamed from: android.support.constraint.a.g$b */
    static class C0356b<T> implements C0355a<T> {

        /* renamed from: a */
        private final Object[] f1126a = new Object[UnReadVideoExperiment.BROWSE_RECORD_LIST];

        /* renamed from: b */
        private int f1127b;

        /* renamed from: a */
        public final T mo803a() {
            if (this.f1127b <= 0) {
                return null;
            }
            int i = this.f1127b - 1;
            T t = this.f1126a[i];
            this.f1126a[i] = null;
            this.f1127b--;
            return t;
        }

        C0356b(int i) {
        }

        /* renamed from: a */
        public final boolean mo805a(T t) {
            if (this.f1127b >= this.f1126a.length) {
                return false;
            }
            this.f1126a[this.f1127b] = t;
            this.f1127b++;
            return true;
        }

        /* renamed from: a */
        public final void mo804a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f1127b < this.f1126a.length) {
                    this.f1126a[this.f1127b] = t;
                    this.f1127b++;
                }
            }
        }
    }
}

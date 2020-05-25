package org.greenrobot.eventbus;

import android.os.Looper;

/* renamed from: org.greenrobot.eventbus.h */
public interface C53765h {

    /* renamed from: org.greenrobot.eventbus.h$a */
    public static class C53766a implements C53765h {

        /* renamed from: a */
        private final Looper f133355a;

        /* renamed from: a */
        public final boolean mo112971a() {
            if (this.f133355a == Looper.myLooper()) {
                return true;
            }
            return false;
        }

        public C53766a(Looper looper) {
            this.f133355a = looper;
        }

        /* renamed from: a */
        public final C53770l mo112970a(C53755c cVar) {
            return new C53761f(cVar, this.f133355a, 10);
        }
    }

    /* renamed from: a */
    C53770l mo112970a(C53755c cVar);

    /* renamed from: a */
    boolean mo112971a();
}

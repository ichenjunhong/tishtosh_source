package android.arch.lifecycle;

import android.arch.p006a.p007a.C0040a;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;

/* renamed from: android.arch.lifecycle.o */
public final class C0190o {

    /* renamed from: android.arch.lifecycle.o$a */
    public static final class C0191a<T> implements C53694b<T> {

        /* renamed from: a */
        final C0184k f451a;

        /* renamed from: b */
        final LiveData<T> f452b;

        /* renamed from: android.arch.lifecycle.o$a$a */
        static final class C0192a<T> implements C0199s<T>, C53696d {

            /* renamed from: a */
            final C53695c<? super T> f453a;

            /* renamed from: b */
            final C0184k f454b;

            /* renamed from: c */
            final LiveData<T> f455c;

            /* renamed from: d */
            volatile boolean f456d;

            /* renamed from: e */
            boolean f457e;

            /* renamed from: f */
            long f458f;

            /* renamed from: g */
            T f459g;

            public final void cancel() {
                if (!this.f456d) {
                    this.f456d = true;
                    C0040a.m62a().mo60c(new Runnable() {
                        public final void run() {
                            if (C0192a.this.f457e) {
                                C0192a.this.f455c.removeObserver(C0192a.this);
                                C0192a.this.f457e = false;
                            }
                            C0192a.this.f459g = null;
                        }
                    });
                }
            }

            public final void request(final long j) {
                if (!this.f456d) {
                    C0040a.m62a().mo60c(new Runnable() {
                        public final void run() {
                            long j;
                            if (!C0192a.this.f456d) {
                                if (j <= 0) {
                                    C0192a.this.f456d = true;
                                    if (C0192a.this.f457e) {
                                        C0192a.this.f455c.removeObserver(C0192a.this);
                                        C0192a.this.f457e = false;
                                    }
                                    C0192a.this.f459g = null;
                                    C0192a.this.f453a.onError(new IllegalArgumentException("Non-positive request"));
                                    return;
                                }
                                C0192a aVar = C0192a.this;
                                if (C0192a.this.f458f + j >= C0192a.this.f458f) {
                                    j = C0192a.this.f458f + j;
                                } else {
                                    j = Long.MAX_VALUE;
                                }
                                aVar.f458f = j;
                                if (!C0192a.this.f457e) {
                                    C0192a.this.f457e = true;
                                    C0192a.this.f455c.observe(C0192a.this.f454b, C0192a.this);
                                    return;
                                }
                                if (C0192a.this.f459g != null) {
                                    C0192a.this.onChanged(C0192a.this.f459g);
                                    C0192a.this.f459g = null;
                                }
                            }
                        }
                    });
                }
            }

            public final void onChanged(T t) {
                if (!this.f456d) {
                    if (this.f458f > 0) {
                        this.f459g = null;
                        this.f453a.onNext(t);
                        if (this.f458f != Long.MAX_VALUE) {
                            this.f458f--;
                        }
                    } else {
                        this.f459g = t;
                    }
                }
            }

            C0192a(C53695c<? super T> cVar, C0184k kVar, LiveData<T> liveData) {
                this.f453a = cVar;
                this.f454b = kVar;
                this.f455c = liveData;
            }
        }

        /* renamed from: a */
        public final void mo336a(C53695c<? super T> cVar) {
            cVar.onSubscribe(new C0192a(cVar, this.f451a, this.f452b));
        }

        public C0191a(C0184k kVar, LiveData<T> liveData) {
            this.f451a = kVar;
            this.f452b = liveData;
        }
    }
}

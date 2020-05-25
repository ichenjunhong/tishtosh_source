package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.bytedance.android.live.core.rxutils.autodispose.p241a.p242a.C3995a;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.C1664a;
import p064c.p065a.p094l.C2178a;

final class LifecycleEventsObservable extends C2201v<C0177a> {

    /* renamed from: a */
    final C0176h f11124a;

    /* renamed from: b */
    final C2178a<C0177a> f11125b = C2178a.m6527l();

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.LifecycleEventsObservable$1 */
    static /* synthetic */ class C39901 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11126a = new int[C0178b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.arch.lifecycle.h$b[] r0 = android.arch.lifecycle.C0176h.C0178b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11126a = r0
                int[] r0 = f11126a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.arch.lifecycle.h$b r1 = android.arch.lifecycle.C0176h.C0178b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11126a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.arch.lifecycle.h$b r1 = android.arch.lifecycle.C0176h.C0178b.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11126a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.arch.lifecycle.h$b r1 = android.arch.lifecycle.C0176h.C0178b.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11126a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.arch.lifecycle.h$b r1 = android.arch.lifecycle.C0176h.C0178b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11126a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.arch.lifecycle.h$b r1 = android.arch.lifecycle.C0176h.C0178b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.rxutils.autodispose.LifecycleEventsObservable.C39901.<clinit>():void");
        }
    }

    static final class ArchLifecycleObserver extends C1664a implements C0183j {

        /* renamed from: a */
        private final C0176h f11127a;

        /* renamed from: b */
        private final C1674ab<? super C0177a> f11128b;

        /* renamed from: c */
        private final C2178a<C0177a> f11129c;

        /* renamed from: a */
        public final void mo6125a() {
            this.f11127a.mo325b(this);
        }

        /* access modifiers changed from: 0000 */
        @C0200t(mo345a = C0177a.ON_ANY)
        public final void onStateChange(C0184k kVar, C0177a aVar) {
            if (!isDisposed()) {
                if (!(aVar == C0177a.ON_CREATE && this.f11129c.mo6469m() == aVar)) {
                    this.f11129c.onNext(aVar);
                }
                this.f11128b.onNext(aVar);
            }
        }

        ArchLifecycleObserver(C0176h hVar, C1674ab<? super C0177a> abVar, C2178a<C0177a> aVar) {
            this.f11127a = hVar;
            this.f11128b = abVar;
            this.f11129c = aVar;
        }
    }

    LifecycleEventsObservable(C0176h hVar) {
        this.f11124a = hVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C0177a> abVar) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f11124a, abVar, this.f11125b);
        abVar.onSubscribe(archLifecycleObserver);
        if (!C3995a.m10113a()) {
            abVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f11124a.mo324a(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f11124a.mo325b(archLifecycleObserver);
        }
    }
}

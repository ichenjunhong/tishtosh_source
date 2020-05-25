package kotlinx.coroutines.android;

import kotlinx.coroutines.C53217ao;
import kotlinx.coroutines.C53217ao.C53218a;
import kotlinx.coroutines.C53226aw;
import kotlinx.coroutines.C53280bw;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.android.c */
public abstract class C53215c extends C53280bw implements C53217ao {
    private C53215c() {
    }

    public /* synthetic */ C53215c(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public C53226aw mo110773a(long j, Runnable runnable) {
        C52711k.m112240b(runnable, "block");
        return C53218a.m113056a(this, j, runnable);
    }
}

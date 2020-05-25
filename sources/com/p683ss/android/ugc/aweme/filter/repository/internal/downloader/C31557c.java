package com.p683ss.android.ugc.aweme.filter.repository.internal.downloader;

import com.p683ss.android.ugc.aweme.filter.repository.internal.C31546b;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31549c;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import java.util.concurrent.Future;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p094l.C2178a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.c */
final class C31557c implements Comparable<Object>, Runnable {

    /* renamed from: a */
    public final C31493f f82533a;

    /* renamed from: b */
    public final int f82534b;

    /* renamed from: c */
    public final C2178a<C31546b> f82535c;

    /* renamed from: d */
    public volatile boolean f82536d;

    /* renamed from: e */
    public volatile Future<?> f82537e;

    /* renamed from: f */
    private final C1711f<C31493f, C31550d> f82538f;

    public final void run() {
        this.f82535c.onNext(new C31546b(C31549c.START, this.f82533a, null, null));
        try {
            this.f82535c.onNext(new C31546b(C31549c.SUCCESS, this.f82533a, (C31550d) this.f82538f.apply(this.f82533a), null));
        } catch (Exception e) {
            this.f82535c.onNext(new C31546b(C31549c.FAILED, this.f82533a, null, e));
        } catch (Throwable th) {
            this.f82535c.onComplete();
            throw th;
        }
        this.f82535c.onComplete();
    }

    public final int compareTo(Object obj) {
        int i;
        C52711k.m112240b(obj, "other");
        if (obj instanceof C31557c) {
            boolean z = this.f82536d;
            C31557c cVar = (C31557c) obj;
            boolean z2 = cVar.f82536d;
            int i2 = this.f82534b;
            int i3 = cVar.f82534b;
            if (z == z2) {
                return C52711k.m112230a(i2, i3);
            }
            if (!z) {
                return 1;
            }
            i = -1;
        } else {
            i = 0;
        }
        return i;
    }

    private C31557c(C31493f fVar, int i, C1711f<C31493f, C31550d> fVar2, C2178a<C31546b> aVar, boolean z, Future<?> future) {
        C52711k.m112240b(fVar, "request");
        C52711k.m112240b(fVar2, "delegate");
        C52711k.m112240b(aVar, "subject");
        this.f82533a = fVar;
        this.f82534b = i;
        this.f82538f = fVar2;
        this.f82535c = aVar;
        this.f82536d = z;
        this.f82537e = future;
    }

    public /* synthetic */ C31557c(C31493f fVar, int i, C1711f fVar2, C2178a aVar, boolean z, Future future, int i2, C52707g gVar) {
        this(fVar, i, fVar2, aVar, z, null);
    }
}

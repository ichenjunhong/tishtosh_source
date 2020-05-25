package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.C53217ao;
import kotlinx.coroutines.C53226aw;
import kotlinx.coroutines.C53342j;
import p2628d.C52860x;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.android.b */
public final class C53211b extends C53215c implements C53217ao {
    private volatile C53211b _immediate;

    /* renamed from: b */
    public final C53211b f131788b;

    /* renamed from: c */
    public final Handler f131789c;

    /* renamed from: d */
    private final String f131790d;

    /* renamed from: e */
    private final boolean f131791e;

    /* renamed from: kotlinx.coroutines.android.b$a */
    public static final class C53212a implements C53226aw {

        /* renamed from: a */
        final /* synthetic */ C53211b f131792a;

        /* renamed from: b */
        final /* synthetic */ Runnable f131793b;

        /* renamed from: a */
        public final void mo110788a() {
            this.f131792a.f131789c.removeCallbacks(this.f131793b);
        }

        C53212a(C53211b bVar, Runnable runnable) {
            this.f131792a = bVar;
            this.f131793b = runnable;
        }
    }

    /* renamed from: kotlinx.coroutines.android.b$b */
    public static final class C53213b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53211b f131794a;

        /* renamed from: b */
        final /* synthetic */ C53342j f131795b;

        public C53213b(C53211b bVar, C53342j jVar) {
            this.f131794a = bVar;
            this.f131795b = jVar;
        }

        public final void run() {
            this.f131795b.mo110934a(this.f131794a, C52860x.f131107a);
        }
    }

    /* renamed from: kotlinx.coroutines.android.b$c */
    static final class C53214c extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C53211b f131796a;

        /* renamed from: b */
        final /* synthetic */ Runnable f131797b;

        C53214c(C53211b bVar, Runnable runnable) {
            this.f131796a = bVar;
            this.f131797b = runnable;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f131796a.f131789c.removeCallbacks(this.f131797b);
            return C52860x.f131107a;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f131789c);
    }

    public final String toString() {
        if (this.f131790d == null) {
            String handler = this.f131789c.toString();
            C52711k.m112236a((Object) handler, "handler.toString()");
            return handler;
        } else if (!this.f131791e) {
            return this.f131790d;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f131790d);
            sb.append(" [immediate]");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53211b) || ((C53211b) obj).f131789c != this.f131789c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo19709a(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        if (!this.f131791e || (!C52711k.m112239a((Object) Looper.myLooper(), (Object) this.f131789c.getLooper()))) {
            return true;
        }
        return false;
    }

    public C53211b(Handler handler, String str) {
        C52711k.m112240b(handler, "handler");
        this(handler, str, false);
    }

    /* renamed from: a */
    public final void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        this.f131789c.post(runnable);
    }

    /* renamed from: a */
    public final C53226aw mo110773a(long j, Runnable runnable) {
        C52711k.m112240b(runnable, "block");
        this.f131789c.postDelayed(runnable, C52753d.m112319b(j, 4611686018427387903L));
        return new C53212a(this, runnable);
    }

    /* renamed from: a */
    public final void mo110784a(long j, C53342j<? super C52860x> jVar) {
        C52711k.m112240b(jVar, "continuation");
        Runnable bVar = new C53213b(this, jVar);
        this.f131789c.postDelayed(bVar, C52753d.m112319b(j, 4611686018427387903L));
        jVar.mo110933a(new C53214c(this, bVar));
    }

    private C53211b(Handler handler, String str, boolean z) {
        C53211b bVar = null;
        super(null);
        this.f131789c = handler;
        this.f131790d = str;
        this.f131791e = z;
        if (this.f131791e) {
            bVar = this;
        }
        this._immediate = bVar;
        C53211b bVar2 = this._immediate;
        if (bVar2 == null) {
            bVar2 = new C53211b(this.f131789c, this.f131790d, true);
            this._immediate = bVar2;
        }
        this.f131788b = bVar2;
    }
}

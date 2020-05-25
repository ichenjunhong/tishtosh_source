package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: kotlinx.coroutines.bl */
public interface C53263bl extends C52631b {

    /* renamed from: c */
    public static final C53265b f131892c = C53265b.f131893a;

    /* renamed from: kotlinx.coroutines.bl$a */
    public static final class C53264a {
        /* renamed from: a */
        public static /* synthetic */ C53226aw m113182a(C53263bl blVar, boolean z, boolean z2, C52671b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return blVar.mo110860a(z, z2, bVar);
        }
    }

    /* renamed from: kotlinx.coroutines.bl$b */
    public static final class C53265b implements C52633c<C53263bl> {

        /* renamed from: a */
        static final /* synthetic */ C53265b f131893a = new C53265b();

        private C53265b() {
        }
    }

    /* renamed from: a */
    C53226aw mo110859a(C52671b<? super Throwable, C52860x> bVar);

    /* renamed from: a */
    C53226aw mo110860a(boolean z, boolean z2, C52671b<? super Throwable, C52860x> bVar);

    /* renamed from: a */
    C53347o mo110861a(C53349q qVar);

    /* renamed from: b */
    Object mo110862b(C52625c<? super C52860x> cVar);

    /* renamed from: b */
    boolean mo110755b();

    /* renamed from: b */
    boolean mo110863b(Throwable th);

    /* renamed from: i */
    boolean mo110864i();

    /* renamed from: j */
    boolean mo110865j();

    /* renamed from: k */
    CancellationException mo110866k();

    /* renamed from: l */
    boolean mo110867l();

    /* renamed from: m */
    void mo110868m();
}

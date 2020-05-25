package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53331t;
import kotlinx.coroutines.internal.C53334w;
import kotlinx.coroutines.p2679b.C53242i;
import kotlinx.coroutines.p2679b.C53243j;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52857u;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;

/* renamed from: kotlinx.coroutines.au */
public abstract class C53224au<T> extends C53242i {

    /* renamed from: e */
    public int f131806e;

    /* renamed from: a */
    public abstract Object mo110790a();

    /* renamed from: a */
    public <T> T mo110793a(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public abstract C52625c<T> mo110791d();

    public final void run() {
        C52628e context;
        C53263bl blVar;
        Object a;
        C53243j jVar = this.f131858g;
        try {
            C52625c d = mo110791d();
            if (d != null) {
                C53221ar arVar = (C53221ar) d;
                C52625c<T> cVar = arVar.f131802d;
                context = cVar.getContext();
                if (C53287cc.m113260a(this.f131806e)) {
                    blVar = (C53263bl) context.get(C53263bl.f131892c);
                } else {
                    blVar = null;
                }
                Object a2 = mo110790a();
                a = C53334w.m113370a(context, arVar.f131800b);
                if (blVar != null) {
                    if (!blVar.mo110755b()) {
                        cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(blVar.mo110866k())));
                        C53334w.m113371b(context, a);
                        jVar.mo110822a();
                        return;
                    }
                }
                Throwable b = m113069b(a2);
                if (b != null) {
                    cVar.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(C53331t.m113355a(b, cVar))));
                } else {
                    cVar.resumeWith(C52848o.m114620constructorimpl(mo110793a(a2)));
                }
                C53334w.m113371b(context, a);
                jVar.mo110822a();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th) {
            try {
                StringBuilder sb = new StringBuilder("Unexpected exception running ");
                sb.append(this);
                throw new C53220aq(sb.toString(), th);
            } catch (Throwable th2) {
                jVar.mo110822a();
                throw th2;
            }
        }
    }

    public C53224au(int i) {
        this.f131806e = i;
    }

    /* renamed from: b */
    public static Throwable m113069b(Object obj) {
        if (!(obj instanceof C53354t)) {
            obj = null;
        }
        C53354t tVar = (C53354t) obj;
        if (tVar != null) {
            return tVar.f131987b;
        }
        return null;
    }
}

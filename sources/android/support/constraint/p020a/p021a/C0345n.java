package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.p021a.C0328d.C0331b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.n */
public final class C0345n {

    /* renamed from: a */
    int f1059a;

    /* renamed from: b */
    int f1060b;

    /* renamed from: c */
    int f1061c;

    /* renamed from: d */
    int f1062d;

    /* renamed from: e */
    ArrayList<C0346a> f1063e = new ArrayList<>();

    /* renamed from: android.support.constraint.a.a.n$a */
    static class C0346a {

        /* renamed from: a */
        C0328d f1064a;

        /* renamed from: b */
        C0328d f1065b;

        /* renamed from: c */
        int f1066c;

        /* renamed from: d */
        C0331b f1067d;

        /* renamed from: e */
        int f1068e;

        public C0346a(C0328d dVar) {
            this.f1064a = dVar;
            this.f1065b = dVar.f935d;
            this.f1066c = dVar.mo705a();
            this.f1067d = dVar.f938g;
            this.f1068e = dVar.f940i;
        }
    }

    public C0345n(C0333e eVar) {
        this.f1059a = eVar.f958L;
        this.f1060b = eVar.f959M;
        this.f1061c = eVar.mo730j();
        this.f1062d = eVar.mo731k();
        ArrayList s = eVar.mo739s();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            this.f1063e.add(new C0346a((C0328d) s.get(i)));
        }
    }

    /* renamed from: a */
    public final void mo770a(C0333e eVar) {
        eVar.f958L = this.f1059a;
        eVar.f959M = this.f1060b;
        eVar.mo717b(this.f1061c);
        eVar.mo720c(this.f1062d);
        int size = this.f1063e.size();
        for (int i = 0; i < size; i++) {
            C0346a aVar = (C0346a) this.f1063e.get(i);
            eVar.mo711a(aVar.f1064a.f934c).mo707a(aVar.f1065b, aVar.f1066c, -1, aVar.f1067d, aVar.f1068e, false);
        }
    }
}

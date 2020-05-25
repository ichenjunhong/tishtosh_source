package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0349c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.o */
public class C0347o extends C0333e {

    /* renamed from: aD */
    public ArrayList<C0333e> f1069aD = new ArrayList<>();

    /* renamed from: f */
    public void mo726f() {
        this.f1069aD.clear();
        super.mo726f();
    }

    /* renamed from: A */
    public final C0336f mo771A() {
        C0333e eVar = this.f953G;
        C0336f fVar = (C0336f) this;
        while (eVar != null) {
            C0333e eVar2 = eVar.f953G;
            if (eVar instanceof C0336f) {
                fVar = (C0336f) eVar;
            }
            eVar = eVar2;
        }
        return fVar;
    }

    /* renamed from: t */
    public final void mo740t() {
        super.mo740t();
        if (this.f1069aD != null) {
            int size = this.f1069aD.size();
            for (int i = 0; i < size; i++) {
                C0333e eVar = (C0333e) this.f1069aD.get(i);
                eVar.mo712a(mo732l(), mo733m());
                if (!(eVar instanceof C0336f)) {
                    eVar.mo740t();
                }
            }
        }
    }

    /* renamed from: x */
    public void mo748x() {
        mo740t();
        if (this.f1069aD != null) {
            int size = this.f1069aD.size();
            for (int i = 0; i < size; i++) {
                C0333e eVar = (C0333e) this.f1069aD.get(i);
                if (eVar instanceof C0347o) {
                    ((C0347o) eVar).mo748x();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo772a(C0333e eVar) {
        this.f1069aD.remove(eVar);
        eVar.f953G = null;
    }

    /* renamed from: a */
    public final void mo715a(C0349c cVar) {
        super.mo715a(cVar);
        int size = this.f1069aD.size();
        for (int i = 0; i < size; i++) {
            ((C0333e) this.f1069aD.get(i)).mo715a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo712a(int i, int i2) {
        super.mo712a(i, i2);
        int size = this.f1069aD.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0333e) this.f1069aD.get(i3)).mo712a(mo734n(), mo735o());
        }
    }
}

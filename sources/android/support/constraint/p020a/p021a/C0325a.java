package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0348b;
import android.support.constraint.p020a.C0351e;
import android.support.constraint.p020a.C0353f;
import android.support.constraint.p020a.C0357h;
import android.support.constraint.p020a.p021a.C0333e.C0335a;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.a */
public final class C0325a extends C0339h {

    /* renamed from: a */
    public int f912a;

    /* renamed from: at */
    private ArrayList<C0342k> f913at = new ArrayList<>(4);

    /* renamed from: b */
    public boolean f914b = true;

    /* renamed from: a */
    public final boolean mo701a() {
        return true;
    }

    /* renamed from: b */
    public final void mo702b() {
        super.mo702b();
        this.f913at.clear();
    }

    /* renamed from: c */
    public final void mo703c() {
        C0342k kVar;
        float f = Float.MAX_VALUE;
        switch (this.f912a) {
            case 0:
                kVar = this.f1008v.f932a;
                break;
            case 1:
                kVar = this.f1010x.f932a;
                break;
            case 2:
                kVar = this.f1009w.f932a;
                break;
            case 3:
                kVar = this.f1011y.f932a;
                break;
            default:
                return;
        }
        f = 0.0f;
        int size = this.f913at.size();
        C0342k kVar2 = null;
        int i = 0;
        while (i < size) {
            C0342k kVar3 = (C0342k) this.f913at.get(i);
            if (kVar3.f1058i == 1) {
                if (this.f912a == 0 || this.f912a == 2) {
                    if (kVar3.f1048f < f) {
                        f = kVar3.f1048f;
                        kVar2 = kVar3.f1047e;
                    }
                } else if (kVar3.f1048f > f) {
                    f = kVar3.f1048f;
                    kVar2 = kVar3.f1047e;
                }
                i++;
            } else {
                return;
            }
        }
        if (C0351e.m843a() != null) {
            C0353f a = C0351e.m843a();
            a.f1125z++;
        }
        kVar.f1047e = kVar2;
        kVar.f1048f = f;
        kVar.mo768e();
        switch (this.f912a) {
            case 0:
                this.f1010x.f932a.mo756a(kVar2, f);
                return;
            case 1:
                this.f1008v.f932a.mo756a(kVar2, f);
                return;
            case 2:
                this.f1011y.f932a.mo756a(kVar2, f);
                return;
            case 3:
                this.f1009w.f932a.mo756a(kVar2, f);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo699a(int i) {
        C0342k kVar;
        C0342k kVar2;
        if (this.f953G != null && ((C0336f) this.f953G).mo747f(2)) {
            switch (this.f912a) {
                case 0:
                    kVar = this.f1008v.f932a;
                    break;
                case 1:
                    kVar = this.f1010x.f932a;
                    break;
                case 2:
                    kVar = this.f1009w.f932a;
                    break;
                case 3:
                    kVar = this.f1011y.f932a;
                    break;
                default:
                    return;
            }
            kVar.f1049g = 5;
            if (this.f912a == 0 || this.f912a == 1) {
                this.f1009w.f932a.mo756a((C0342k) null, 0.0f);
                this.f1011y.f932a.mo756a((C0342k) null, 0.0f);
            } else {
                this.f1008v.f932a.mo756a((C0342k) null, 0.0f);
                this.f1010x.f932a.mo756a((C0342k) null, 0.0f);
            }
            this.f913at.clear();
            for (int i2 = 0; i2 < this.f1041as; i2++) {
                C0333e eVar = this.f1040ar[i2];
                if (this.f914b || eVar.mo701a()) {
                    switch (this.f912a) {
                        case 0:
                            kVar2 = eVar.f1008v.f932a;
                            break;
                        case 1:
                            kVar2 = eVar.f1010x.f932a;
                            break;
                        case 2:
                            kVar2 = eVar.f1009w.f932a;
                            break;
                        case 3:
                            kVar2 = eVar.f1011y.f932a;
                            break;
                        default:
                            kVar2 = null;
                            break;
                    }
                    if (kVar2 != null) {
                        this.f913at.add(kVar2);
                        kVar2.mo766a(kVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo700a(C0351e eVar) {
        boolean z;
        this.f950D[0] = this.f1008v;
        this.f950D[2] = this.f1009w;
        this.f950D[1] = this.f1010x;
        this.f950D[3] = this.f1011y;
        for (int i = 0; i < this.f950D.length; i++) {
            this.f950D[i].f941j = eVar.mo788a((Object) this.f950D[i]);
        }
        if (this.f912a >= 0 && this.f912a < 4) {
            C0328d dVar = this.f950D[this.f912a];
            int i2 = 0;
            while (true) {
                if (i2 >= this.f1041as) {
                    z = false;
                    break;
                }
                C0333e eVar2 = this.f1040ar[i2];
                if ((this.f914b || eVar2.mo701a()) && (((this.f912a == 0 || this.f912a == 1) && eVar2.mo743v() == C0335a.MATCH_CONSTRAINT) || ((this.f912a == 2 || this.f912a == 3) && eVar2.mo744w() == C0335a.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i2++;
                }
            }
            z = true;
            if (this.f912a == 0 || this.f912a == 1 ? this.f953G.mo743v() == C0335a.WRAP_CONTENT : this.f953G.mo744w() == C0335a.WRAP_CONTENT) {
                z = false;
            }
            for (int i3 = 0; i3 < this.f1041as; i3++) {
                C0333e eVar3 = this.f1040ar[i3];
                if (this.f914b || eVar3.mo701a()) {
                    C0357h a = eVar.mo788a((Object) eVar3.f950D[this.f912a]);
                    eVar3.f950D[this.f912a].f941j = a;
                    if (this.f912a == 0 || this.f912a == 2) {
                        C0357h hVar = dVar.f941j;
                        C0348b c = eVar.mo798c();
                        C0357h d = eVar.mo800d();
                        d.f1136e = 0;
                        c.mo781b(hVar, a, d, 0);
                        if (z) {
                            eVar.mo790a(c, (int) (c.f1073d.mo687a(d) * -1.0f), 1);
                        }
                        eVar.mo789a(c);
                    } else {
                        C0357h hVar2 = dVar.f941j;
                        C0348b c2 = eVar.mo798c();
                        C0357h d2 = eVar.mo800d();
                        d2.f1136e = 0;
                        c2.mo775a(hVar2, a, d2, 0);
                        if (z) {
                            eVar.mo790a(c2, (int) (c2.f1073d.mo687a(d2) * -1.0f), 1);
                        }
                        eVar.mo789a(c2);
                    }
                }
            }
            if (this.f912a == 0) {
                eVar.mo799c(this.f1010x.f941j, this.f1008v.f941j, 0, 6);
                if (!z) {
                    eVar.mo799c(this.f1008v.f941j, this.f953G.f1010x.f941j, 0, 5);
                }
            } else if (this.f912a == 1) {
                eVar.mo799c(this.f1008v.f941j, this.f1010x.f941j, 0, 6);
                if (!z) {
                    eVar.mo799c(this.f1008v.f941j, this.f953G.f1008v.f941j, 0, 5);
                }
            } else if (this.f912a == 2) {
                eVar.mo799c(this.f1011y.f941j, this.f1009w.f941j, 0, 6);
                if (!z) {
                    eVar.mo799c(this.f1009w.f941j, this.f953G.f1011y.f941j, 0, 5);
                }
            } else if (this.f912a == 3) {
                eVar.mo799c(this.f1009w.f941j, this.f1011y.f941j, 0, 6);
                if (!z) {
                    eVar.mo799c(this.f1009w.f941j, this.f953G.f1009w.f941j, 0, 5);
                }
            }
        }
    }
}

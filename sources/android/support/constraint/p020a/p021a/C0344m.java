package android.support.constraint.p020a.p021a;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.a.a.m */
public class C0344m {

    /* renamed from: h */
    HashSet<C0344m> f1057h = new HashSet<>(2);

    /* renamed from: i */
    int f1058i = 0;

    /* renamed from: a */
    public void mo754a() {
    }

    /* renamed from: f */
    public final boolean mo769f() {
        if (this.f1058i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo760b() {
        this.f1058i = 0;
        this.f1057h.clear();
    }

    /* renamed from: d */
    public final void mo767d() {
        this.f1058i = 0;
        Iterator it = this.f1057h.iterator();
        while (it.hasNext()) {
            ((C0344m) it.next()).mo767d();
        }
    }

    /* renamed from: e */
    public final void mo768e() {
        this.f1058i = 1;
        Iterator it = this.f1057h.iterator();
        while (it.hasNext()) {
            ((C0344m) it.next()).mo754a();
        }
    }

    /* renamed from: a */
    public final void mo766a(C0344m mVar) {
        this.f1057h.add(mVar);
    }
}

package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.C19170a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.http.a.b.f */
public final class C19181f implements Cloneable {

    /* renamed from: a */
    public List f52878a = new ArrayList(16);

    public final Object clone() throws CloneNotSupportedException {
        C19181f fVar = (C19181f) super.clone();
        fVar.f52878a = new ArrayList(this.f52878a);
        return fVar;
    }

    /* renamed from: a */
    public final void mo39137a(C19170a aVar) {
        this.f52878a.add(aVar);
    }

    /* renamed from: a */
    public final C19170a[] mo39138a(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f52878a.size(); i++) {
            C19170a aVar = (C19170a) this.f52878a.get(i);
            if (aVar.mo39116a().equalsIgnoreCase(str)) {
                arrayList.add(aVar);
            }
        }
        return (C19170a[]) arrayList.toArray(new C19170a[arrayList.size()]);
    }

    /* renamed from: b */
    public final C19170a mo39139b(String str) {
        for (int i = 0; i < this.f52878a.size(); i++) {
            C19170a aVar = (C19170a) this.f52878a.get(i);
            if (aVar.mo39116a().equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }
}

package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49942b.C49943a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.g */
public final class C49959g implements C49942b {

    /* renamed from: a */
    private final ArrayList<C49971b> f125162a = new ArrayList<>();

    /* renamed from: b */
    private C49971b f125163b;

    /* renamed from: c */
    private final List<C49943a> f125164c = new ArrayList();

    /* renamed from: d */
    private int f125165d = Integer.MAX_VALUE;

    /* renamed from: b */
    public final C49971b mo97749b() {
        return this.f125163b;
    }

    /* renamed from: c */
    public final int mo97752c() {
        return this.f125165d;
    }

    /* renamed from: a */
    public final List<C49971b> mo97744a() {
        return this.f125162a;
    }

    /* renamed from: b */
    public final void mo97750b(C49943a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f125164c.remove(aVar);
    }

    /* renamed from: a */
    public final void mo97745a(int i) {
        this.f125165d = i;
        for (C49943a a : this.f125164c) {
            a.mo97740a(i);
        }
    }

    /* renamed from: a */
    public final void mo97746a(C49943a aVar) {
        C52711k.m112240b(aVar, "callback");
        if (!this.f125164c.contains(aVar)) {
            this.f125164c.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo97751b(C49971b bVar) {
        if (!C52711k.m112239a((Object) this.f125163b, (Object) bVar)) {
            C49971b bVar2 = this.f125163b;
            this.f125163b = bVar;
            for (C49943a a : this.f125164c) {
                a.mo97742a(bVar2, this.f125163b);
            }
        }
    }

    /* renamed from: a */
    public final void mo97747a(C49971b bVar) {
        boolean z;
        C52711k.m112240b(bVar, "item");
        Iterator it = this.f125162a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C49971b) it.next()).f125188a == bVar.f125188a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            Object obj = this.f125162a.get(i);
            C52711k.m112236a(obj, "toolbarItems[index]");
            ((C49971b) obj).f125198k = true;
            this.f125162a.set(i, bVar.clone());
            for (C49943a a : this.f125164c) {
                a.mo97741a(i, bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo97748a(List<? extends C49971b> list) {
        C52711k.m112240b(list, "items");
        ArrayList arrayList = new ArrayList(this.f125162a);
        this.f125162a.clear();
        for (C49971b b : list) {
            this.f125162a.add(b.clone());
        }
        ArrayList<C49971b> arrayList2 = this.f125162a;
        HashSet hashSet = new HashSet(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(hashSet);
        C52575l.m112106c(arrayList2);
        for (C49943a a : this.f125164c) {
            a.mo97743a((List<? extends C49971b>) arrayList, (List<? extends C49971b>) this.f125162a);
        }
    }
}

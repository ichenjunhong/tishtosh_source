package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15441d.C15443b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.ag */
final class C15250ag extends C15254ak {

    /* renamed from: a */
    private final ArrayList<C15222f> f39365a;

    /* renamed from: b */
    private final /* synthetic */ C15244aa f39366b;

    public C15250ag(C15244aa aaVar, ArrayList<C15222f> arrayList) {
        this.f39366b = aaVar;
        super(aaVar, null);
        this.f39365a = arrayList;
    }

    /* renamed from: a */
    public final void mo28164a() {
        Set<Scope> set;
        C15256am amVar = this.f39366b.f39335a.f39422m;
        C15244aa aaVar = this.f39366b;
        if (aaVar.f39341g == null) {
            set = Collections.emptySet();
        } else {
            Set<Scope> hashSet = new HashSet<>(aaVar.f39341g.f39827b);
            Map<C15211a<?>, C15443b> map = aaVar.f39341g.f39829d;
            for (C15211a aVar : map.keySet()) {
                if (!aaVar.f39335a.f39416g.containsKey(aVar.mo28066b())) {
                    hashSet.addAll(((C15443b) map.get(aVar)).f39844a);
                }
            }
            set = hashSet;
        }
        amVar.f39377e = set;
        ArrayList arrayList = this.f39365a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C15222f) obj).mo28071a(this.f39366b.f39338d, this.f39366b.f39335a.f39422m.f39377e);
        }
    }
}

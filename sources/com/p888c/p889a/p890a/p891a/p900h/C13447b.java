package com.p888c.p889a.p890a.p891a.p900h;

import android.view.View;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13410c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.c.a.a.a.h.b */
public final class C13447b {

    /* renamed from: a */
    final HashMap<View, String> f35018a = new HashMap<>();

    /* renamed from: b */
    final HashMap<View, C13448a> f35019b = new HashMap<>();

    /* renamed from: c */
    final HashMap<String, View> f35020c = new HashMap<>();

    /* renamed from: d */
    final HashSet<View> f35021d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f35022e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f35023f = new HashSet<>();

    /* renamed from: g */
    final HashMap<String, String> f35024g = new HashMap<>();

    /* renamed from: h */
    boolean f35025h;

    /* renamed from: com.c.a.a.a.h.b$a */
    public static class C13448a {

        /* renamed from: a */
        public final C13410c f35026a;

        /* renamed from: b */
        public final ArrayList<String> f35027b = new ArrayList<>();

        public C13448a(C13410c cVar, String str) {
            this.f35026a = cVar;
            mo25151a(str);
        }

        /* renamed from: a */
        public final void mo25151a(String str) {
            this.f35027b.add(str);
        }
    }

    /* renamed from: a */
    private void m27113a(C13410c cVar, C13404l lVar) {
        View view = (View) cVar.f34957a.get();
        if (view != null) {
            C13448a aVar = (C13448a) this.f35019b.get(view);
            if (aVar != null) {
                aVar.mo25151a(lVar.mo25101d());
            } else {
                this.f35019b.put(view, new C13448a(cVar, lVar.mo25101d()));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25150a(C13404l lVar) {
        for (C13410c a : lVar.f34937b) {
            m27113a(a, lVar);
        }
    }
}

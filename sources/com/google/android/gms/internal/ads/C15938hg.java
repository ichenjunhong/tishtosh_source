package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C15006c;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hg */
final class C15938hg implements C15948hq<ama> {
    C15938hg() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        C15006c s = ama.mo29187s();
        if (s != null) {
            s.mo27669a();
            return;
        }
        C15006c t = ama.mo29194t();
        if (t != null) {
            t.mo27669a();
        } else {
            abv.m32798e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}

package com.p683ss.android.ugc.aweme.homepage.api.interaction;

import android.arch.lifecycle.C0198r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.b */
public final class C32972b extends C0198r<Integer> {

    /* renamed from: a */
    public boolean f85693a;

    /* renamed from: b */
    public C32974c f85694b = new C32973a();

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.b$a */
    public static final class C32973a implements C32974c {
        C32973a() {
        }

        /* renamed from: a */
        public final int mo55924a() {
            return 0;
        }

        /* renamed from: a */
        public final void mo55925a(int i) {
        }

        /* renamed from: a */
        public final void mo55926a(int i, boolean z) {
        }
    }

    /* renamed from: a */
    public final Integer getValue() {
        return Integer.valueOf(this.f85694b.mo55924a());
    }

    public final /* synthetic */ void setValue(Object obj) {
        mo69883a(((Number) obj).intValue());
    }

    /* renamed from: a */
    public final void mo69883a(int i) {
        this.f85694b.mo55925a(i);
        super.setValue(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo69886a(C32974c cVar) {
        C52711k.m112240b(cVar, "value");
        this.f85693a = true;
        this.f85694b = cVar;
    }

    /* renamed from: a */
    public final void mo69884a(int i, boolean z) {
        mo69885a(i, z, true);
    }

    /* renamed from: a */
    public final void mo69885a(int i, boolean z, boolean z2) {
        this.f85694b.mo55926a(i, z);
        if (z2) {
            super.setValue(Integer.valueOf(i));
        }
    }
}

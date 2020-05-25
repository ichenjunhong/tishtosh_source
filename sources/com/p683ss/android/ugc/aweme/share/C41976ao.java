package com.p683ss.android.ugc.aweme.share;

import android.os.Bundle;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.ao */
public final class C41976ao {

    /* renamed from: a */
    public String f106245a;

    /* renamed from: b */
    public String f106246b;

    /* renamed from: com.ss.android.ugc.aweme.share.ao$a */
    public static final class C41977a {

        /* renamed from: a */
        public final C41976ao f106247a = new C41976ao(null);

        /* renamed from: a */
        public final C41977a mo86066a(String str) {
            if (str != null) {
                this.f106247a.f106245a = str;
            }
            return this;
        }

        /* renamed from: b */
        public final C41977a mo86067b(String str) {
            if (str != null) {
                this.f106247a.f106246b = str;
            }
            return this;
        }
    }

    private C41976ao() {
        this.f106245a = "";
        this.f106246b = "";
    }

    public /* synthetic */ C41976ao(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final Bundle mo86065a(Bundle bundle) {
        C52711k.m112240b(bundle, "bundle");
        bundle.putString("tab_name", this.f106245a);
        bundle.putString("impr_id", this.f106246b);
        return bundle;
    }
}

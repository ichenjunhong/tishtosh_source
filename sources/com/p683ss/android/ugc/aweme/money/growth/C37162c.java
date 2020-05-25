package com.p683ss.android.ugc.aweme.money.growth;

import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.money.growth.c */
public final class C37162c {

    /* renamed from: d */
    public static final C37163a f94845d = new C37163a(null);

    /* renamed from: a */
    public int f94846a;

    /* renamed from: b */
    public boolean f94847b;

    /* renamed from: c */
    public String f94848c = "";

    /* renamed from: e */
    private final Keva f94849e;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.c$a */
    public static final class C37163a {
        private C37163a() {
        }

        public /* synthetic */ C37163a(C52707g gVar) {
            this();
        }
    }

    public C37162c() {
        Keva repo = Keva.getRepo("money_growth");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f94849e = repo;
        mo76482a(this.f94849e.getInt("deepLinkDialogShown", 0));
        mo76484a(this.f94849e.getBoolean("has_showed_pop", false));
        String string = this.f94849e.getString("activity_id_for_deeplink", "");
        if (string != null) {
            mo76483a(string);
        }
    }

    /* renamed from: a */
    public final void mo76483a(String str) {
        C52711k.m112240b(str, "value");
        this.f94848c = str;
        this.f94849e.storeString("activity_id_for_deeplink", str);
    }

    /* renamed from: a */
    public final void mo76482a(int i) {
        this.f94846a = i;
        this.f94849e.storeInt("deepLinkDialogShown", i);
        if (i == 2) {
            this.f94849e.storeString("activity_id_for_deeplink", "");
        }
    }

    /* renamed from: a */
    public final void mo76484a(boolean z) {
        this.f94847b = z;
        this.f94849e.storeBoolean("has_showed_pop", z);
    }
}

package com.p683ss.android.ugc.aweme.p2377ug.p2378a;

import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.a.f */
public final class C47423f {

    /* renamed from: h */
    public static final C47424a f119644h = new C47424a(null);

    /* renamed from: a */
    final Keva f119645a;

    /* renamed from: b */
    public long f119646b;

    /* renamed from: c */
    public boolean f119647c;

    /* renamed from: d */
    public boolean f119648d;

    /* renamed from: e */
    public String f119649e = "";

    /* renamed from: f */
    public long f119650f;

    /* renamed from: g */
    public boolean f119651g;

    /* renamed from: i */
    private final String f119652i = "LIKE";

    /* renamed from: com.ss.android.ugc.aweme.ug.a.f$a */
    public static final class C47424a {
        private C47424a() {
        }

        public /* synthetic */ C47424a(C52707g gVar) {
            this();
        }
    }

    public C47423f() {
        Keva repo = Keva.getRepo("praise_keva");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f119645a = repo;
        mo94702b(this.f119645a.getLong("key_app_first_open_time", 0));
        Keva keva = this.f119645a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119652i);
        sb.append("key_last_dialog_show_time");
        mo94699a(keva.getLong(sb.toString(), 0));
        Keva keva2 = this.f119645a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f119652i);
        sb2.append("key_is_clicked_feedback");
        mo94701a(keva2.getBoolean(sb2.toString(), false));
        Keva keva3 = this.f119645a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f119652i);
        sb3.append("key_is_clicked_submit");
        mo94703b(keva3.getBoolean(sb3.toString(), false));
        Keva keva4 = this.f119645a;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f119652i);
        sb4.append("key_last_show_version");
        String string = keva4.getString(sb4.toString(), "");
        C52711k.m112236a((Object) string, "keva.getString(keyPrefix…EY_LAST_SHOW_VERSION, \"\")");
        mo94700a(string);
        mo94704c(this.f119645a.getBoolean("key_debug_open", false));
    }

    /* renamed from: c */
    public final void mo94704c(boolean z) {
        this.f119651g = z;
        this.f119645a.storeBoolean("key_debug_open", z);
    }

    /* renamed from: a */
    public final void mo94699a(long j) {
        this.f119646b = j;
        Keva keva = this.f119645a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119652i);
        sb.append("key_last_dialog_show_time");
        keva.storeLong(sb.toString(), j);
    }

    /* renamed from: b */
    public final void mo94702b(long j) {
        if (this.f119650f == 0) {
            this.f119650f = j;
            this.f119645a.storeLong("key_app_first_open_time", j);
        }
    }

    /* renamed from: a */
    public final void mo94700a(String str) {
        C52711k.m112240b(str, "value");
        this.f119649e = str;
        Keva keva = this.f119645a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119652i);
        sb.append("key_last_show_version");
        keva.storeString(sb.toString(), str);
    }

    /* renamed from: b */
    public final void mo94703b(boolean z) {
        this.f119648d = z;
        Keva keva = this.f119645a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119652i);
        sb.append("key_is_clicked_submit");
        keva.storeBoolean(sb.toString(), z);
    }

    /* renamed from: a */
    public final void mo94701a(boolean z) {
        this.f119647c = z;
        Keva keva = this.f119645a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119652i);
        sb.append("key_is_clicked_feedback");
        keva.storeBoolean(sb.toString(), z);
    }
}

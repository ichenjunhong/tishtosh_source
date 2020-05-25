package com.p683ss.android.ugc.aweme.notification.p2013c;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.c.b */
public final class C38161b {

    /* renamed from: a */
    private Map<String, String> f97183a = new HashMap();

    /* renamed from: b */
    private String f97184b;

    /* renamed from: c */
    private String f97185c;

    /* renamed from: d */
    private int f97186d;

    /* renamed from: e */
    private String f97187e;

    /* renamed from: f */
    private String f97188f;

    /* renamed from: g */
    private String f97189g;

    /* renamed from: h */
    private long f97190h;

    /* renamed from: i */
    private String f97191i;

    /* renamed from: j */
    private String f97192j;

    /* renamed from: k */
    private String f97193k;

    /* renamed from: l */
    private int f97194l;

    /* renamed from: m */
    private LogPbBean f97195m;

    /* renamed from: n */
    private String f97196n;

    /* renamed from: o */
    private String f97197o;

    /* renamed from: p */
    private String f97198p;

    /* renamed from: q */
    private String f97199q;

    /* renamed from: r */
    private String f97200r;

    /* renamed from: b */
    private void m85282b() {
        m85281a("action_type", this.f97184b);
        m85281a("account_type", this.f97185c);
        m85281a("client_order", String.valueOf(this.f97186d));
        m85281a("notice_type", this.f97187e);
        m85281a("notification_type", this.f97188f);
        m85281a("message_time", String.valueOf(this.f97190h));
        m85281a("from_user_id", this.f97191i);
        m85281a("from_item", this.f97192j);
        m85281a("from_item_id", this.f97193k);
        m85281a("is_together", String.valueOf(this.f97194l));
        m85281a("enter_from", this.f97198p);
        if (!TextUtils.isEmpty(this.f97197o)) {
            m85281a("scene_id", this.f97197o);
        }
        if (!TextUtils.isEmpty(this.f97199q)) {
            m85281a("tab_name", this.f97199q);
        }
        if (!TextUtils.isEmpty(this.f97196n)) {
            m85281a("timeline", this.f97196n);
        }
        if (!TextUtils.isEmpty(this.f97189g)) {
            m85281a("follow_button", this.f97189g);
        }
        if (!TextUtils.isEmpty(this.f97200r)) {
            m85281a("explain_relation", this.f97200r);
        }
        if (this.f97195m != null) {
            m85281a("log_pb", new C17971f().mo34889b(this.f97195m));
        }
    }

    /* renamed from: a */
    public final void mo78149a() {
        m85282b();
        C26890h.m65011a("notification_message_inner_message", this.f97183a);
    }

    /* renamed from: a */
    public final C38161b mo78144a(int i) {
        this.f97186d = i;
        return this;
    }

    /* renamed from: b */
    public final C38161b mo78150b(int i) {
        this.f97194l = i;
        return this;
    }

    /* renamed from: c */
    public final C38161b mo78152c(String str) {
        this.f97188f = str;
        return this;
    }

    /* renamed from: d */
    public final C38161b mo78153d(String str) {
        this.f97189g = str;
        return this;
    }

    /* renamed from: e */
    public final C38161b mo78154e(String str) {
        this.f97191i = str;
        return this;
    }

    /* renamed from: f */
    public final C38161b mo78155f(String str) {
        this.f97192j = str;
        return this;
    }

    /* renamed from: g */
    public final C38161b mo78156g(String str) {
        this.f97193k = str;
        return this;
    }

    /* renamed from: h */
    public final C38161b mo78157h(String str) {
        this.f97196n = str;
        return this;
    }

    /* renamed from: i */
    public final C38161b mo78158i(String str) {
        this.f97197o = str;
        return this;
    }

    /* renamed from: j */
    public final C38161b mo78159j(String str) {
        this.f97198p = str;
        return this;
    }

    /* renamed from: k */
    public final C38161b mo78160k(String str) {
        this.f97199q = str;
        return this;
    }

    /* renamed from: l */
    public final C38161b mo78161l(String str) {
        this.f97200r = str;
        return this;
    }

    /* renamed from: b */
    public final C38161b mo78151b(String str) {
        this.f97185c = str;
        return this;
    }

    /* renamed from: a */
    public final C38161b mo78145a(long j) {
        this.f97190h = j;
        return this;
    }

    /* renamed from: a */
    public final C38161b mo78146a(LogPbBean logPbBean) {
        this.f97195m = logPbBean;
        return this;
    }

    /* renamed from: a */
    public final C38161b mo78147a(String str) {
        this.f97184b = str;
        return this;
    }

    /* renamed from: a */
    public final C38161b mo78148a(boolean z) {
        String str;
        if (z) {
            str = "yellow_dot";
        } else {
            str = "";
        }
        this.f97187e = str;
        return this;
    }

    /* renamed from: a */
    private void m85281a(String str, String str2) {
        this.f97183a.put(str, str2);
    }
}

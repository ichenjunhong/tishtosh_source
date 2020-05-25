package com.p683ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.aa */
public final class C29981aa {

    /* renamed from: a */
    public Map<String, String> f78235a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, String> f78236b = new ConcurrentHashMap();

    /* renamed from: c */
    public C17971f f78237c = new C17971f();

    /* renamed from: com.ss.android.ugc.aweme.feed.aa$a */
    static class C29982a {

        /* renamed from: a */
        public static final C29981aa f78238a = new C29981aa();
    }

    /* renamed from: a */
    public static C29981aa m70153a() {
        return C29982a.f78238a;
    }

    /* renamed from: a */
    public final String mo60160a(LogPbBean logPbBean) {
        if (logPbBean == null) {
            return "";
        }
        return this.f78237c.mo34889b(logPbBean);
    }

    /* renamed from: a */
    public final String mo60161a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f78235a.containsKey(str)) {
            return (String) this.f78235a.get(str);
        }
        return "";
    }

    /* renamed from: b */
    public final String mo60163b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f78236b.containsKey(str)) {
            return (String) this.f78236b.get(str);
        }
        return "";
    }

    /* renamed from: a */
    public final void mo60162a(String str, LogPbBean logPbBean) {
        if (!TextUtils.isEmpty(str) && logPbBean != null && logPbBean.getImprId() != null) {
            this.f78235a.put(str, this.f78237c.mo34889b(logPbBean));
        }
    }
}

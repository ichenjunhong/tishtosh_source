package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.i */
public final class C30286i {

    /* renamed from: a */
    public final SharedPreferences f79121a;

    /* renamed from: b */
    private List<String> f79122b;

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.i$a */
    static class C30288a {

        /* renamed from: a */
        public static final C30286i f79123a = new C30286i();
    }

    /* renamed from: a */
    public static C30286i m71202a() {
        return C30288a.f79123a;
    }

    private C30286i() {
        this.f79121a = C35807d.m80935a(C11010c.m22280a(), "sp_show_share_guide_cache", 0);
        try {
            this.f79122b = JSON.parseArray(this.f79121a.getString("cached_video_id", ""), String.class);
        } catch (Exception unused) {
        }
        if (this.f79122b == null) {
            this.f79122b = new ArrayList();
        }
    }

    /* renamed from: a */
    public final boolean mo60688a(String str) {
        return this.f79122b.contains(str);
    }

    /* renamed from: b */
    public final void mo60689b(String str) {
        if (!this.f79122b.contains(str)) {
            if (this.f79122b.size() >= 20) {
                this.f79122b.remove(0);
            }
            this.f79122b.add(str);
            this.f79121a.edit().putString("cached_video_id", JSON.toJSONString(this.f79122b)).apply();
        }
    }
}

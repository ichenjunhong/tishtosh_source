package com.bytedance.android.livesdk.feed.feed;

import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.feed.feed.f */
public final class C6945f {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public long f19009a;
    @C17952c(mo34828a = "name")

    /* renamed from: b */
    public String f19010b;
    @C17952c(mo34828a = "default")

    /* renamed from: c */
    public int f19011c;
    @C17952c(mo34828a = "url")

    /* renamed from: d */
    public String f19012d;
    @C17952c(mo34828a = "inter_url")

    /* renamed from: e */
    public String f19013e;
    @C17952c(mo34828a = "style")

    /* renamed from: f */
    public int f19014f;
    @C17952c(mo34828a = "type")

    /* renamed from: g */
    public int f19015g;
    @C17952c(mo34828a = "umeng_event")

    /* renamed from: h */
    public String f19016h;
    @C17952c(mo34828a = "umeng_source")

    /* renamed from: i */
    public int f19017i;
    @C17952c(mo34828a = "enable_dislike")

    /* renamed from: j */
    public int f19018j;
    @C17952c(mo34828a = "enable_draw_stream")

    /* renamed from: k */
    public int f19019k;

    /* renamed from: l */
    public boolean f19020l;

    /* renamed from: a */
    public final int mo13132a() {
        if (this.f19014f <= 0 || this.f19014f > 4) {
            this.f19014f = 2;
        }
        return this.f19014f;
    }

    /* renamed from: b */
    public final boolean mo13133b() {
        if (C9431p.m18664a(this.f19010b) || C9431p.m18664a(this.f19012d)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}

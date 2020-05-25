package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.banner.C2966b;
import com.bytedance.android.live.base.model.banner.C2967c;
import com.google.gson.C18085o;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.feed.a */
public class C2974a extends Extra {
    @C17952c(mo34828a = "cost")

    /* renamed from: a */
    public long f8711a;
    @C17952c(mo34828a = "rank_round_banner")

    /* renamed from: b */
    public C2967c f8712b;
    @C17952c(mo34828a = "unread_extra")

    /* renamed from: c */
    public String f8713c;

    /* renamed from: d */
    transient C2975a f8714d;
    @C17952c(mo34828a = "max_time")

    /* renamed from: e */
    public long f8715e;
    @C17952c(mo34828a = "min_time")

    /* renamed from: f */
    public long f8716f;
    @C17952c(mo34828a = "req_id")

    /* renamed from: g */
    public String f8717g;
    @C17952c(mo34828a = "banner")

    /* renamed from: h */
    public C2966b f8718h;
    @C17952c(mo34828a = "total")

    /* renamed from: i */
    public int f8719i;
    @C17952c(mo34828a = "style")

    /* renamed from: j */
    public int f8720j;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: k */
    private C18085o f8721k;

    /* renamed from: com.bytedance.android.live.base.model.feed.a$a */
    public static final class C2975a {
        @C17952c(mo34828a = "impr_id")

        /* renamed from: a */
        public String f8722a;
    }

    /* renamed from: a */
    public final C18085o mo7693a() {
        if (this.f8714d == null) {
            return this.f8721k;
        }
        this.f8721k = C2942b.m8369a().mo34875a((Object) this.f8714d).mo35009m();
        this.f8714d = null;
        return this.f8721k;
    }
}

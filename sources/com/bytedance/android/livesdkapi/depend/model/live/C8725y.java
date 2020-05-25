package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.y */
public class C8725y {
    @C17952c(mo34828a = "ngb_push_url")

    /* renamed from: a */
    public String f23971a = "";
    @C17952c(mo34828a = "ngb_push_url_postfix")

    /* renamed from: b */
    public String f23972b = "";
    @C17952c(mo34828a = "height")

    /* renamed from: c */
    public int f23973c = 640;
    @C17952c(mo34828a = "width")

    /* renamed from: d */
    public int f23974d = 360;
    @C17952c(mo34828a = "min_bitrate")

    /* renamed from: e */
    public int f23975e = 200;
    @C17952c(mo34828a = "default_bitrate")

    /* renamed from: f */
    public int f23976f = 500;
    @C17952c(mo34828a = "max_bitrate")

    /* renamed from: g */
    public int f23977g = 800;
    @C17952c(mo34828a = "video_profile")

    /* renamed from: h */
    public int f23978h = 1;
    @C17952c(mo34828a = "hardware_encode")

    /* renamed from: i */
    public boolean f23979i;
    @C17952c(mo34828a = "bitrate_adapt_strategy")

    /* renamed from: j */
    public int f23980j;
    @C17952c(mo34828a = "fps")

    /* renamed from: k */
    public int f23981k = 15;
    @C17952c(mo34828a = "anchor_interact_profile")

    /* renamed from: l */
    public int f23982l;
    @C17952c(mo34828a = "audience_interact_profile")

    /* renamed from: m */
    public int f23983m;
    @C17952c(mo34828a = "super_resolution")

    /* renamed from: n */
    public C8726a f23984n;
    @C17952c(mo34828a = "h265_enable")

    /* renamed from: o */
    public boolean f23985o;
    @C17952c(mo34828a = "gop_sec")

    /* renamed from: p */
    public float f23986p = 2.0f;
    @C17952c(mo34828a = "bframe_enable")

    /* renamed from: q */
    public boolean f23987q = true;
    @C17952c(mo34828a = "roi")

    /* renamed from: r */
    public boolean f23988r;
    @C17952c(mo34828a = "sw_roi")

    /* renamed from: s */
    public boolean f23989s;

    /* renamed from: t */
    public int f23990t;

    /* renamed from: u */
    public int f23991u;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.y$a */
    public static class C8726a {
        @C17952c(mo34828a = "enable")

        /* renamed from: a */
        public boolean f23992a;
        @C17952c(mo34828a = "antialiasing")

        /* renamed from: b */
        public boolean f23993b;
        @C17952c(mo34828a = "strength")

        /* renamed from: c */
        public int f23994c;

        public C8726a() {
            this(false, false, 0);
        }

        public C8726a(boolean z, boolean z2, int i) {
            this.f23992a = z;
            this.f23993b = z2;
            this.f23994c = i;
        }
    }

    /* renamed from: a */
    public final int mo15390a() {
        if (this.f23973c == 0) {
            this.f23973c = 640;
        }
        return this.f23973c;
    }

    /* renamed from: b */
    public final int mo15391b() {
        if (this.f23974d == 0) {
            this.f23974d = 360;
        }
        return this.f23974d;
    }

    /* renamed from: c */
    public final int mo15392c() {
        if (this.f23975e == 0) {
            this.f23975e = 200;
        }
        return this.f23975e;
    }

    /* renamed from: d */
    public final int mo15393d() {
        if (this.f23976f == 0) {
            this.f23976f = 500;
        }
        return this.f23976f;
    }

    /* renamed from: f */
    public final int mo15395f() {
        if (this.f23981k == 0) {
            this.f23981k = 15;
        }
        return this.f23981k;
    }

    /* renamed from: e */
    public final int mo15394e() {
        if (this.f23977g == 0) {
            this.f23977g = (mo15393d() * 2) - mo15392c();
        }
        return this.f23977g;
    }
}

package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.am */
public final class C23207am extends C23241k<C23207am> {

    /* renamed from: O */
    private String f61731O;

    /* renamed from: P */
    private String f61732P;

    /* renamed from: Q */
    private String f61733Q;

    /* renamed from: R */
    private String f61734R;

    /* renamed from: S */
    private String f61735S;

    /* renamed from: T */
    private int f61736T;

    /* renamed from: U */
    private boolean f61737U;

    /* renamed from: V */
    private String f61738V;

    /* renamed from: W */
    private Aweme f61739W;

    /* renamed from: X */
    private String f61740X;

    /* renamed from: Y */
    private String f61741Y;

    /* renamed from: Z */
    private String f61742Z;

    /* renamed from: a */
    public String f61743a = "normal_share";

    /* renamed from: aa */
    private String f61744aa;

    /* renamed from: ab */
    private String f61745ab;

    /* renamed from: ac */
    private boolean f61746ac;

    /* renamed from: ad */
    private String f61747ad;

    /* renamed from: ae */
    private String f61748ae;

    /* renamed from: b */
    public int f61749b;

    /* renamed from: c */
    public String f61750c;

    /* renamed from: d */
    public String f61751d;

    /* renamed from: e */
    public String f61752e;

    public C23207am() {
        super("share_video");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f61731O, C23232a.f62006b);
        mo48072a("author_id", this.f61732P, C23232a.f62006b);
        mo48072a("platform", this.f61733Q, C23232a.f62005a);
        mo48072a("content_type", this.f61734R, C23232a.f62005a);
        mo48072a("share_mode", this.f61735S, C23232a.f62005a);
        mo48072a("reflow_flag", String.valueOf(this.f61736T), C23232a.f62005a);
        mo48072a("enter_method", this.f61743a, C23232a.f62005a);
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(C23198ae.m56857c(this.f61739W));
        }
        if (this.f61749b != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61749b);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        if (this.f61737U) {
            mo48072a("scene_id", this.f61738V, C23232a.f62006b);
            mo48072a("country_name", this.f62035A, C23232a.f62005a);
            mo48075d();
            mo48078i(C23198ae.m56857c(this.f61739W));
        }
        mo48070a((Map<String, String>) C23794bh.m58391e().mo65590a(this.f61739W, C23794bh.m58391e().mo65589a()));
        if (C40906h.m90485a().mo83391b(this.f61731O)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        } else {
            mo48072a("previous_page", this.f61741Y, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61751d)) {
            mo48072a(this.f61751d, this.f61752e, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61750c)) {
            mo48072a("playlist_type", this.f61750c, C23232a.f62005a);
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48069a("tab_name", BusinessComponentServiceUtils.getBusinessBridgeService().mo49723a());
        }
        mo48072a("sector", this.f61740X, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61742Z)) {
            mo48072a("impr_type", this.f61742Z, C23232a.f62005a);
        }
        if (C23198ae.m56862e(this.f61985g) && !TextUtils.isEmpty(this.f61744aa)) {
            mo48072a("is_reposted", "1", C23232a.f62005a);
            mo48072a("repost_from_group_id", this.f61744aa, C23232a.f62005a);
            mo48072a("repost_from_user_id", this.f61745ab, C23232a.f62005a);
        }
        mo48072a("request_id", C23198ae.m56857c(this.f61739W), C23232a.f62006b);
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f61746ac) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f61747ad);
            mo48069a("rec_uid", this.f61748ae);
        }
        if (!TextUtils.isEmpty(this.f62002x)) {
            mo48069a("creation_id", this.f62002x);
        }
    }

    /* renamed from: a */
    public final C23207am mo47987a(int i) {
        this.f61736T = i;
        return this;
    }

    /* renamed from: b */
    public final C23207am mo47989b(String str) {
        this.f61733Q = str;
        return this;
    }

    /* renamed from: c */
    public final C23207am mo47990c(String str) {
        this.f62002x = str;
        return this;
    }

    /* renamed from: a */
    public final C23207am mo47988a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: e */
    public final C23207am mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61739W = aweme;
            this.f61731O = aweme.getAid();
            this.f61732P = m57044d(aweme);
            this.f61734R = C23198ae.m56879o(aweme);
            this.f61742Z = C23198ae.m56883s(aweme);
            this.f61744aa = aweme.getRepostFromGroupId();
            this.f61745ab = aweme.getRepostFromUserId();
            this.f61746ac = C47915gg.m103646a(aweme);
            this.f61747ad = C23198ae.m56886v(aweme);
            this.f61748ae = C23198ae.m56887w(aweme);
        }
        return this;
    }
}

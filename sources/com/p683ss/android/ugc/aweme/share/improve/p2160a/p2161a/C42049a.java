package com.p683ss.android.ugc.aweme.share.improve.p2160a.p2161a;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42053ab;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.a */
public final class C42049a extends C42053ab {

    /* renamed from: b */
    public final Challenge f106438b;

    /* renamed from: c */
    public final boolean f106439c;

    /* renamed from: d */
    public final String f106440d;

    /* renamed from: e */
    public final String f106441e;

    /* renamed from: f */
    public final String f106442f;

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        int i;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C26890h.m65011a("click_qr_code", C23089d.m56640a().mo47829a("tag_id", this.f106438b.getCid()).mo47829a("platform", "scan").mo47829a("qr_code_type", "shaped").mo47829a("enter_from", "challenge").f61491a);
        if (C26403au.m63866b(this.f106438b)) {
            i = 23;
        } else {
            i = 2;
        }
        C40954a a = new C40954a().mo83447a(i, this.f106438b.getCid(), this.f106439c, this.f106438b.getChallengeName(), "challenge");
        long userCount = (long) this.f106438b.getUserCount();
        a.f104177a.title = this.f106438b.getChallengeName();
        a.f104177a.describe = String.valueOf(userCount);
        SmartRouter.buildRoute((Context) C42149b.m92512a(context), "//qrcodev2").withParam("extra_params", (Serializable) a.f104177a).open();
        C26890h.onEvent(new MobClick().setEventName("share_challenge").setLabelName("qr_code").setExtValueString(this.f106438b.getCid()).setJsonObject(new C26898j().mo54849a("request_id", this.f106441e).mo54849a("challenge_id", this.f106440d).mo54849a("process_id", this.f106442f).mo54850a()));
        C26890h.m65011a("share_tag", C23089d.m56640a().mo47829a("tag_id", this.f106440d).mo47829a("platform", "qr_code").mo47829a("share_mode", "normal_share").mo47829a("process_id", this.f106442f).f61491a);
        C41979aq.m91947b().addShareRecord("qr_code", 1);
    }

    public C42049a(Challenge challenge, boolean z, String str, String str2, String str3) {
        C52711k.m112240b(challenge, "challenge");
        super(null, false, 3, null);
        this.f106438b = challenge;
        this.f106439c = z;
        this.f106440d = str;
        this.f106441e = str2;
        this.f106442f = str3;
    }
}

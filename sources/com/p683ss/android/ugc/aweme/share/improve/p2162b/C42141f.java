package com.p683ss.android.ugc.aweme.share.improve.p2162b;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.f */
public final class C42141f extends C42140e {

    /* renamed from: a */
    public static final C42142a f106607a = new C42142a(null);

    /* renamed from: b */
    private final Aweme f106608b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.f$a */
    public static final class C42142a {
        private C42142a() {
        }

        public /* synthetic */ C42142a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.any;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        return true;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "qr_code";
    }

    /* renamed from: c */
    public final String mo86137c() {
        String b = C23723j.m58219b(R.string.d29);
        C52711k.m112236a((Object) b, "ResUtils.getString(R.string.qr_code)");
        return b;
    }

    public C42141f(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        this.f106608b = aweme;
    }

    /* renamed from: a */
    public final boolean mo49947a(C42318f fVar, Context context) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        SmartRouter.buildRoute(context, "//qrcodev2").withParam("extra_params", (Serializable) new C40954a().mo83446a(1, this.f106608b.getAid(), "video").mo83448a(C23198ae.m56881q(this.f106608b), C47915gg.m103649b(this.f106608b)).f104177a).open();
        return true;
    }
}

package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.FamiliarGroupEnhanceConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.FamiliarGroupEnhanceSetting;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.c */
public final class C34579c extends C35456b {

    /* renamed from: a */
    public static final C34580a f89124a = new C34580a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.c$a */
    public static final class C34580a {
        private C34580a() {
        }

        public /* synthetic */ C34580a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.c$b */
    static final class C34581b implements C35457c {

        /* renamed from: a */
        final /* synthetic */ C34579c f89125a;

        C34581b(C34579c cVar) {
            this.f89125a = cVar;
        }

        /* renamed from: a */
        public final void mo72636a(Context context, C35456b bVar, int i) {
            int i2;
            C35190af.m79536r("create_group_cell_click");
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            int N = a.mo73388N();
            FamiliarGroupEnhanceConfig familiarGroupEnhanceConfig = FamiliarGroupEnhanceSetting.INSTANCE.getFamiliarGroupEnhanceConfig();
            if (familiarGroupEnhanceConfig != null) {
                i2 = familiarGroupEnhanceConfig.getCellClickDisappearThreshold();
            } else {
                i2 = 1;
            }
            if (N < i2) {
                C35284t a2 = C35284t.m79782a();
                C52711k.m112236a((Object) a2, "IMSPUtils.get()");
                a2.mo73431j(System.currentTimeMillis());
            }
            C35284t.m79782a().mo73389O();
        }
    }

    /* renamed from: b */
    public final int mo72634b() {
        return 30;
    }

    public final String bm_() {
        return "group_create_session";
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C34581b(this);
    }

    /* renamed from: d */
    public final void mo72643d() {
        this.f91121l = 2147483637;
        this.f91116g = C11010c.m22280a().getResources().getString(R.string.fsn);
        this.f91117h = C11010c.m22280a().getResources().getString(R.string.fsq);
    }
}

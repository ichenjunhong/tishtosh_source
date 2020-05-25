package com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h;

import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImCreateChatV2Config;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImCreateChatV2Settings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35448c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.h.d */
public final class C34375d implements C35448c {

    /* renamed from: a */
    public static final C34376a f88741a = new C34376a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.h.d$a */
    public static final class C34376a {
        private C34376a() {
        }

        public /* synthetic */ C34376a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo72371a() {
        if (m78268a(ImCreateChatV2Settings.INSTANCE.getImCreateChatV2Setting())) {
            C34032k.m77795a();
            C34238a.m78110a();
            if (C34237d.m78083a().isEmpty()) {
                C52711k.m112236a((Object) C34387b.m78292a(), "IMUserDao.inst()");
                if (C34387b.m78309m() >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m78268a(ImCreateChatV2Config imCreateChatV2Config) {
        if (imCreateChatV2Config == null) {
            return false;
        }
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        if (imCreateChatV2Config.getVersion() != a.mo73440p()) {
            C35284t.m79782a().mo73418f(imCreateChatV2Config.getVersion());
        }
        long currentTimeMillis = System.currentTimeMillis();
        C35284t a2 = C35284t.m79782a();
        C52711k.m112236a((Object) a2, "IMSPUtils.get()");
        long r = a2.mo73442r();
        C35284t a3 = C35284t.m79782a();
        C52711k.m112236a((Object) a3, "IMSPUtils.get()");
        if (a3.mo73441q() < imCreateChatV2Config.getFrequencyNum() && currentTimeMillis - r >= ((long) (imCreateChatV2Config.getFrequencyDay() * 24 * 60 * 60 * 1000))) {
            return true;
        }
        return false;
    }
}

package com.p683ss.android.ugc.aweme.live;

import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.p753k.p758b.p759a.C12118c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.guide.LiveBroadcastWarn;
import com.p683ss.android.ugc.aweme.live.feedpage.C36082a;
import com.p683ss.android.ugc.aweme.live.feedpage.C36084c;
import com.p683ss.android.ugc.aweme.live.p1919b.C36059a;
import com.p683ss.android.ugc.aweme.live.p1919b.C36060b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.live.p1921d.C36069d;
import com.p683ss.android.ugc.aweme.p1632di.C27626bm;
import com.p683ss.android.ugc.aweme.p1803i.C33087a;
import com.p683ss.android.ugc.aweme.p1803i.C33088b;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.port.internal.C39655e;
import com.p683ss.android.ugc.aweme.story.live.C46639b;
import com.p683ss.android.ugc.aweme.story.live.C46640c;
import com.p683ss.android.ugc.aweme.story.live.C46642e;
import com.p683ss.android.ugc.aweme.story.live.C46645h;
import com.p683ss.android.ugc.aweme.story.live.LivePreview;

/* renamed from: com.ss.android.ugc.aweme.live.w */
public final class C36173w implements ILiveOuterService {

    /* renamed from: a */
    private C46640c f92613a;

    /* renamed from: b */
    private C36095h f92614b = new C36175x();

    /* renamed from: a */
    public static ILiveOuterService m81665a() {
        if (C27991b.f73522r == null) {
            synchronized (ILiveOuterService.class) {
                if (C27991b.f73522r == null) {
                    C27991b.f73522r = C27626bm.m66305a();
                }
            }
        }
        return (ILiveOuterService) C27991b.f73522r;
    }

    public final void changeLiveHostConfigNetState(boolean z) {
    }

    public final C33087a getDebugHandler() {
        return new C33087a() {
            /* renamed from: a */
            public final Class mo70084a() {
                return LiveSettingActivity.class;
            }

            /* renamed from: b */
            public final Class mo70085b() {
                return LiveFeedActivity.class;
            }

            /* renamed from: c */
            public final Class mo70086c() {
                return LivePlayActivity.class;
            }
        };
    }

    public final C36065d getLive() {
        m81666b();
        return C36152a.f92562a;
    }

    public final C36059a getLiveCommonManager() {
        m81666b();
        return C36060b.m81416a();
    }

    public final C36071e getLiveFeedFactory() {
        m81666b();
        return C36147a.f92557a;
    }

    public final C36075f getLiveInitService() {
        m81666b();
        return C36169a.f92608a;
    }

    public final C36095h getLiveOuterSettingService() {
        m81666b();
        return this.f92614b;
    }

    public final C36098k getLiveServiceAdapter() {
        m81666b();
        return C46642e.f117646a;
    }

    public final C33089c getLiveWatcherUtils() {
        m81666b();
        return C46645h.m101231b();
    }

    /* renamed from: b */
    private void m81666b() {
        C36148r.m81573a().initNetworkInterceptor();
        Live.getService();
    }

    public final C46639b getILiveAllService() {
        if (this.f92613a == null) {
            this.f92613a = new C46640c();
        }
        return this.f92613a;
    }

    public final C39655e getLiveModule() {
        m81666b();
        return new C36171v();
    }

    public final C36082a getLiveStateManager() {
        m81666b();
        return (C36084c) C36084c.f92450i.mo39084b();
    }

    public final C8683f startLiveManager() {
        m81666b();
        return Live.getService().mo15055h();
    }

    public final C33088b generateLivPreview(AbsActivity absActivity) {
        m81666b();
        return new LivePreview(absActivity);
    }

    public final void monitorImageNetwork(Object obj) {
        m81666b();
        C12118c.m24543a().mo22889a(obj);
    }

    public final C36068c generateLivePlayHelper(Runnable runnable, C36067b bVar) {
        m81666b();
        return new C36069d(runnable, bVar);
    }

    public final void tryShowTakeLiveBubble(Fragment fragment, View view, boolean z) {
        new LiveBroadcastWarn(fragment, view, z).mo69820a();
    }
}

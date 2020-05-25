package com.p683ss.android.ugc.aweme.p1807im.sdk.p1845j;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.j.c */
public final class C34392c {

    /* renamed from: a */
    public static final C34393a f88758a = new C34393a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.j.c$a */
    public static final class C34393a {

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.j.c$a$a */
        public static final class C34394a implements C33242d {

            /* renamed from: a */
            final /* synthetic */ SharePackage f88759a;

            /* renamed from: b */
            final /* synthetic */ Context f88760b;

            /* renamed from: c */
            final /* synthetic */ Runnable f88761c;

            /* renamed from: d */
            final /* synthetic */ Runnable f88762d;

            public final void sendMsg() {
                BaseContent b = C35106c.m79334b(this.f88759a);
                if (b != null) {
                    IMUser iMUser = new IMUser();
                    iMUser.setUid(this.f88759a.f106900i.getString("uid_for_share"));
                    Context context = this.f88760b;
                    Runnable runnable = this.f88761c;
                    Runnable runnable2 = this.f88762d;
                    C35237bj.m79649a().mo73340a(iMUser.getUid(), b);
                    C10691a.m21534a(context, (int) R.string.bna, 0).mo19066a();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }

            public C34394a(SharePackage sharePackage, Context context, Runnable runnable, Runnable runnable2) {
                this.f88759a = sharePackage;
                this.f88760b = context;
                this.f88761c = runnable;
                this.f88762d = runnable2;
            }
        }

        private C34393a() {
        }

        public /* synthetic */ C34393a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m78322a(C11207p pVar) {
            C52711k.m112240b(pVar, "storyMessage");
            Map localExt = pVar.getLocalExt();
            C52711k.m112236a((Object) localExt, "storyMessage.localExt");
            localExt.put("story_state_unexpected", "story_state_unexpected");
            C11213r.m22773e(pVar);
        }
    }

    /* renamed from: a */
    public static final void m78321a(C11207p pVar) {
        C34393a.m78322a(pVar);
    }
}

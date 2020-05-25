package com.p683ss.android.ugc.trill.app;

import android.content.Context;
import com.bytedance.p785o.p786a.C12402a;
import com.bytedance.p785o.p786a.C12402a.C12404a;
import com.bytedance.p785o.p786a.p788b.C12414a;
import com.bytedance.p785o.p786a.p788b.p794b.C12419a;
import com.bytedance.p785o.p786a.p788b.p794b.C12420b;
import com.bytedance.p785o.p786a.p795c.C12424d;
import com.facebook.imageutils.C14252b;
import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.ugc.aweme.app.application.C23020c;
import com.p683ss.android.ugc.aweme.app.application.C23022d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a.C24059a;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.p683ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl;
import com.p683ss.android.ugc.aweme.utils.C47758cb;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.webpcompat.IWebpErrorCallback;
import com.p683ss.android.ugc.webpcompat.WebpCompatManager;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.app.b */
public final class C50309b {
    public static void attachBaseContextAfterMultiDex(TrillApplication trillApplication) {
        C40895d.f104075a = new OptimizePushProcessImpl();
        C22574a.m55738f().mo46917a("method_init_webp_compat", false);
        C14252b.m29208a(C50306a.f126195a);
        WebpCompatManager.getInstance(trillApplication).init(new IWebpErrorCallback() {
            public final void onWebpError(int i, String str) {
                C23088c a = C23088c.m56631a();
                a.mo47824a("info", "WebpCompat have some Exception!").mo47824a("product", "musically/tiktok").mo47822a("errorCode", Integer.valueOf(i)).mo47824a("errorDesc", str);
                C23569o.m57776a("type_log_webp_error", i, a.mo47825b());
            }
        });
        C22574a.m55738f().mo46921b("method_init_webp_compat", false);
        C22574a.m55738f().mo46917a("method_setup_graph_duration", false);
        trillApplication.mo47845d();
        C22574a.m55738f().mo46921b("method_setup_graph_duration", false);
        GlobalContext.setContext(trillApplication);
        C48016e.m103936a((Context) trillApplication);
        if (trillApplication.mo98216f()) {
            trillApplication.f126190g = new C23020c();
        } else {
            trillApplication.f126190g = new C23022d();
        }
        trillApplication.f126190g.mo47757a(trillApplication);
        C35857a.m81001b().mo74526a(new SharePreferencePreloadForAllProcessTask()).mo74527a();
        C12404a aVar = new C12404a(trillApplication);
        aVar.mo23463a(new C12419a());
        aVar.mo23463a(new C12414a());
        aVar.mo23463a(new C12420b());
        C12402a aVar2 = new C12402a(aVar.f32650a, aVar.f32651b, aVar.f32652c, aVar.f32653d);
        C12402a.m24980a(aVar2).mo23462a(C12424d.IMMEDIATE);
        C47758cb.f120281a = true;
        if (trillApplication.f61140c) {
            C22574a.m55738f().mo46921b("cold_boot_application_attach_duration", true);
            C22574a.m55738f().mo46917a("cold_boot_application_attach_to_create", true);
        }
        String str = "app_attach_end_async";
        C52711k.m112240b(str, "scene");
        C24076h.m58904e().execute(new C24059a(str));
    }
}

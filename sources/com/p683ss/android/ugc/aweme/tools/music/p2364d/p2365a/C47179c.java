package com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.c */
public final class C47179c {

    /* renamed from: b */
    public static final C47179c f119117b = C47181b.f119120a;

    /* renamed from: c */
    public static final C47180a f119118c = new C47180a(null);

    /* renamed from: a */
    public final SharedPreferences f119119a;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.c$a */
    public static final class C47180a {
        private C47180a() {
        }

        /* renamed from: a */
        public static C47179c m102428a() {
            return C47179c.f119117b;
        }

        public /* synthetic */ C47180a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.c$b */
    static final class C47181b {

        /* renamed from: a */
        static final C47179c f119120a = new C47179c();

        /* renamed from: b */
        public static final C47181b f119121b = new C47181b();

        private C47181b() {
        }
    }

    public C47179c() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        C39541ac applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        C52711k.m112236a((Object) applicationService, "ServiceManager.get().get…       applicationService");
        this.f119119a = C35807d.m80935a(applicationService.mo74157c(), "collect_music", 0);
    }
}

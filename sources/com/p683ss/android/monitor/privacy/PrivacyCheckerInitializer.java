package com.p683ss.android.monitor.privacy;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11022g;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService;
import com.p683ss.android.ugc.aweme.privacychecker.impl.fake.PrivacyCheckerServiceImpl;

/* renamed from: com.ss.android.monitor.privacy.PrivacyCheckerInitializer */
public class PrivacyCheckerInitializer implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    static final /* synthetic */ String lambda$run$0$PrivacyCheckerInitializer(Context context) throws Exception {
        Context applicationContext = context.getApplicationContext();
        String str = "build_timestamp";
        if (applicationContext == null) {
            return "";
        }
        return C11022g.m22322a(applicationContext, str);
    }

    public void run(Context context) {
        PrivacyCheckerService createPrivacyCheckerServicebyMonsterPlugin = PrivacyCheckerServiceImpl.createPrivacyCheckerServicebyMonsterPlugin();
        Application application = (Application) context.getApplicationContext();
        String valueOf = String.valueOf(C19005d.m46186b());
        C11010c cVar = C11010c.f29572u;
        cVar.getClass();
        C19525a aVar = new C19525a(cVar);
        C11010c cVar2 = C11010c.f29572u;
        cVar2.getClass();
        createPrivacyCheckerServicebyMonsterPlugin.init(application, valueOf, aVar, new C19526b(cVar2), C19527c.f53874a, new C19528d(context), C19529e.f53876a);
    }
}

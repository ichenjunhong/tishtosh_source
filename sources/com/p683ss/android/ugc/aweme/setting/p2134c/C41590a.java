package com.p683ss.android.ugc.aweme.setting.p2134c;

import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.c.a */
public final class C41590a implements C41683a {

    /* renamed from: com.ss.android.ugc.aweme.setting.c.a$a */
    static final class C41591a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C41686c f105324a;

        C41591a(C41686c cVar) {
            this.f105324a = cVar;
        }

        public final /* synthetic */ Object call() {
            C45407ay.m98968a("EnablePreUploadByUser onSuccess");
            C18085o oVar = new C18085o();
            oVar.mo35019a("enable_pre_upload", (Number) Integer.valueOf(this.f105324a.f105472O));
            AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().updateUserSettings(oVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        C0013i.m16a((Callable<TResult>) new C41591a<TResult>(cVar));
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
        C45407ay.m98968a("EnablePreUploadByUser onFailed");
    }
}

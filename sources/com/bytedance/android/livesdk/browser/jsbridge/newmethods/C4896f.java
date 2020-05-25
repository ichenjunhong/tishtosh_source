package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.NetworkUtils;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.f */
public final class C4896f extends C10782e<Object, C4897a> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.f$a */
    static class C4897a {
        @C17952c(mo34828a = "appName")

        /* renamed from: a */
        String f13175a;
        @C17952c(mo34828a = "aid")

        /* renamed from: b */
        int f13176b;
        @C17952c(mo34828a = "appVersion")

        /* renamed from: c */
        String f13177c;
        @C17952c(mo34828a = "versionCode")

        /* renamed from: d */
        String f13178d;
        @C17952c(mo34828a = "netType")

        /* renamed from: e */
        String f13179e;
        @C17952c(mo34828a = "orientation")

        /* renamed from: f */
        String f13180f;
        @C17952c(mo34828a = "device_id")

        /* renamed from: g */
        String f13181g;
        @C17952c(mo34828a = "user_id")

        /* renamed from: h */
        long f13182h;
        @C17952c(mo34828a = "screenWidth")

        /* renamed from: i */
        float f13183i;
        @C17952c(mo34828a = "screenHeight")

        /* renamed from: j */
        float f13184j;

        C4897a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        return m11409a(obj, fVar);
    }

    /* renamed from: a */
    private static C4897a m11409a(Object obj, C10783f fVar) throws Exception {
        String str;
        C4897a aVar = new C4897a();
        IHostContext a = TTLiveSDKContext.getHostService().mo10308a();
        aVar.f13175a = a.appName();
        aVar.f13176b = a.appId();
        String str2 = "";
        try {
            str2 = fVar.f28972a.getPackageManager().getPackageInfo(fVar.f28972a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = a.getVersionCode();
        }
        aVar.f13177c = str2;
        aVar.f13178d = a.getVersionCode();
        aVar.f13179e = NetworkUtils.getNetworkAccessType(a.context());
        if (!(fVar.f28972a instanceof Activity)) {
            str = "vertical";
        } else if (((Activity) fVar.f28972a).getRequestedOrientation() == 1) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        aVar.f13180f = str;
        aVar.f13181g = AppLog.getServerDeviceId();
        aVar.f13182h = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        aVar.f13183i = C3922z.m9914e(C3922z.m9910c());
        aVar.f13184j = C3922z.m9914e(C3922z.m9908b());
        return aVar;
    }
}

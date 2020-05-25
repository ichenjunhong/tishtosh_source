package com.p683ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.content.Context;
import com.bytedance.p513c.C9282a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.p683ss.android.ugc.aweme.sec.p2128a.C41464a;
import com.p683ss.android.ugc.aweme.sec.p2129b.C41466a;
import com.p683ss.android.ugc.aweme.secapi.C41483a;
import com.p683ss.android.ugc.aweme.secapi.C41484b;
import com.p683ss.android.ugc.aweme.secapi.ISecApi;
import com.p683ss.sys.ces.out.ISdk;
import com.p683ss.sys.ces.out.StcSDKFactory;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sec.SecApiImpl */
public final class SecApiImpl implements ISecApi {
    public static final C41461a Companion = new C41461a(null);
    public static final String TAG = "Sec";

    /* renamed from: com.ss.android.ugc.aweme.sec.SecApiImpl$a */
    public static final class C41461a {
        private C41461a() {
        }

        public /* synthetic */ C41461a(C52707g gVar) {
            this();
        }
    }

    public final void loadSo() {
        C41466a.m91277a("DmtSec", "loadSo");
    }

    public final String onEvent() {
        ISdk iSdk = C41462a.f105097b;
        if (iSdk != null) {
            return iSdk.onEvent();
        }
        return null;
    }

    public final void dismissCaptcha() {
        C32458a.m75141a(4, TAG, "dismissCaptcha");
        if (C41462a.f105096a) {
            SecCaptcha secCaptcha = C41462a.f105098c;
            if (secCaptcha == null) {
                C52711k.m112237a("captcha");
            }
            C9282a aVar = secCaptcha.f105123b;
            if (aVar != null) {
                aVar.mo16872b();
            }
        }
    }

    public static ISecApi createISecApibyMonsterPlugin() {
        Object a = C27991b.m66756a(ISecApi.class);
        if (a != null) {
            return (ISecApi) a;
        }
        if (C27991b.f73506bj == null) {
            synchronized (ISecApi.class) {
                if (C27991b.f73506bj == null) {
                    C27991b.f73506bj = new SecApiImpl();
                }
            }
        }
        return (SecApiImpl) C27991b.f73506bj;
    }

    public final void setParams() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        if (AppLog.getServerDeviceId() != null) {
            str = AppLog.getServerDeviceId();
        } else {
            str = "";
        }
        if (AppLog.getInstallId() != null) {
            str2 = AppLog.getInstallId();
        } else {
            str2 = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("setParams:did = ");
        sb.append(str);
        sb.append("  iid = ");
        sb.append(str2);
        C32458a.m75141a(4, str3, sb.toString());
        ISdk iSdk = C41462a.f105097b;
        if (iSdk != null) {
            iSdk.setParams(str, str2);
        }
        StringBuilder sb2 = new StringBuilder("init setParamsTime = ");
        sb2.append(currentTimeMillis2 - currentTimeMillis);
        C41466a.m91277a("DmtSec", sb2.toString());
    }

    public final void reportData(String str) {
        C52711k.m112240b(str, "scene");
        C41462a.m91273a(str);
    }

    public final boolean needVerifyImage(int i) {
        boolean z = false;
        if (C41462a.f105096a) {
            if (C41462a.f105098c == null) {
                C52711k.m112237a("captcha");
            }
            if (i == 3058 || i == 3059 || i == 1104 || i == 1105) {
                z = true;
            }
        }
        if (z) {
            String str = TAG;
            StringBuilder sb = new StringBuilder("needVerifyImage: ");
            sb.append(i);
            C32458a.m75141a(4, str, sb.toString());
        }
        return z;
    }

    public final boolean isCaptchaUrl(String str) {
        boolean z;
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str, "url");
        boolean z2 = false;
        if (C41462a.f105096a) {
            if (C41462a.f105098c == null) {
                C52711k.m112237a("captcha");
            }
            C52711k.m112240b(str, "url");
            C52711k.m112240b(str, "url");
            CharSequence charSequence = str;
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (C52830p.m112456b(charSequence, (CharSequence) "/passport/", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "/login/", false, 2, (Object) null))) {
                z2 = true;
            }
        }
        if (z2) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("isCaptchaUrl: ");
            sb.append(str);
            C32458a.m75141a(4, str2, sb.toString());
        }
        return z2;
    }

    public final void updateDeviceIdAndInstallId(String str, String str2) {
        C52711k.m112240b(str, "deviceId");
        C52711k.m112240b(str2, "iid");
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("updateDeviceIdAndInstallId:did = ");
        sb.append(str);
        sb.append("  iid = ");
        sb.append(str2);
        C32458a.m75141a(4, str3, sb.toString());
        C41462a.m91274a(str, str2);
    }

    public final void popCaptcha(Activity activity, int i, C41483a aVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aVar, "secCaptchaListener");
        String str = TAG;
        StringBuilder sb = new StringBuilder("popCaptcha - errorcode = ");
        sb.append(i);
        C32458a.m75141a(4, str, sb.toString());
        C41462a.m91272a(i, activity, aVar);
    }

    public final void initSec(Context context, String str, int i, String str2, String str3, boolean z, C41484b bVar) {
        Context context2 = context;
        String str4 = str;
        int i2 = i;
        String str5 = str2;
        String str6 = str3;
        C41484b bVar2 = bVar;
        C52711k.m112240b(context2, "context");
        C52711k.m112240b(str4, "language");
        C52711k.m112240b(str5, "appName");
        C52711k.m112240b(str6, "channel");
        C52711k.m112240b(bVar2, "secGetDataCallBack");
        C32458a.m75141a(4, TAG, "initSec");
        C52711k.m112240b(context2, "context");
        C52711k.m112240b(str4, "language");
        C52711k.m112240b(str5, "appName");
        C52711k.m112240b(str6, "channel");
        C52711k.m112240b(bVar2, "secService");
        StringBuilder sb = new StringBuilder("init language = ");
        sb.append(str4);
        sb.append(", aid = ");
        sb.append(i2);
        sb.append(", appName = ");
        sb.append(str5);
        sb.append(", channel= ");
        sb.append(str6);
        C41466a.m91277a("DmtSec", sb.toString());
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        C41462a.f105097b = StcSDKFactory.getSDK(context2, (long) i2);
        long currentTimeMillis3 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("init getSdkTime = ");
        sb2.append(currentTimeMillis3 - currentTimeMillis2);
        C41466a.m91277a("DmtSec", sb2.toString());
        long currentTimeMillis4 = System.currentTimeMillis();
        ISdk iSdk = C41462a.f105097b;
        ISdk a = C41462a.m91271a();
        if (a != null) {
            a.SetRegionType(2);
        }
        long currentTimeMillis5 = System.currentTimeMillis();
        StringBuilder sb3 = new StringBuilder("init setRegionTime = ");
        sb3.append(currentTimeMillis5 - currentTimeMillis4);
        C41466a.m91277a("DmtSec", sb3.toString());
        C41462a.f105099d = new C41464a(C41462a.f105097b);
        C0013i a2 = C0013i.m12a(1000);
        C41463a aVar = new C41463a(bVar, z, str, i, str2, str3, context);
        a2.mo20a((C0011g<TResult, TContinuationResult>) aVar, (Executor) C0013i.f24a);
        long currentTimeMillis6 = System.currentTimeMillis();
        StringBuilder sb4 = new StringBuilder("init Time = ");
        sb4.append(currentTimeMillis6 - currentTimeMillis);
        C41466a.m91277a("DmtSec", sb4.toString());
    }
}

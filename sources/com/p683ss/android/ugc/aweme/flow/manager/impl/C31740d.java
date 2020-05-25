package com.p683ss.android.ugc.aweme.flow.manager.impl;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a.C9920a;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12792q.C12794a;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12683a;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.ttnet.retrofit.C13358b;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.net.C26923f;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.d */
public class C31740d implements C9382a {

    /* renamed from: a */
    protected static final String f82905a = "d";

    /* renamed from: c */
    public static boolean f82906c;

    /* renamed from: b */
    protected final String f82907b = "CMCC_PASS_CODE";

    /* renamed from: d */
    protected String f82908d = "";

    /* renamed from: e */
    protected C12792q f82909e;

    /* renamed from: f */
    protected IMobileFlowApi f82910f;

    /* renamed from: g */
    protected int f82911g;

    /* renamed from: h */
    protected Context f82912h = AwemeApplication.m56199a();

    /* renamed from: i */
    protected C9381g f82913i = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: j */
    protected final String f82914j = "CMCC_SIM";

    /* renamed from: k */
    private int f82915k = 1000;

    /* renamed from: b */
    private boolean m73687b() {
        return false;
    }

    /* renamed from: c */
    private boolean m73688c() {
        return NetworkUtils.isMobile(this.f82912h);
    }

    /* renamed from: a */
    public final void mo64618a() {
        SharePrefCache.inst().getLastUploadPassCode().mo47776a(m73691f());
    }

    /* renamed from: e */
    private boolean m73690e() {
        if (f82906c || (m73689d() && m73688c() && m73687b())) {
            return true;
        }
        return false;
    }

    private C31740d() {
    }

    /* renamed from: d */
    private static boolean m73689d() {
        String lowerCase = Build.BRAND.toLowerCase();
        String str = Build.MODEL;
        if (!TextUtils.equals(lowerCase, "coolpad") || !str.contains("A8-932") || VERSION.SDK_INT != 21) {
            return ((Boolean) SharePrefCache.inst().getEnableUploadPC().mo47782d()).booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    private String m73691f() {
        StringBuilder sb = new StringBuilder();
        sb.append(C20902b.m53242a().getCurUserId());
        sb.append("#");
        sb.append(C31744e.m73696a(this.f82912h));
        sb.append("#");
        sb.append(AppLog.getServerDeviceId());
        return sb.toString();
    }

    @C53771m
    public void onEvent(C26923f fVar) {
        if (this.f82915k != fVar.f70799a) {
            this.f82915k = fVar.f70799a;
            if (fVar.f70799a == 1 && m73690e()) {
                this.f82913i.removeMessages(4);
                this.f82913i.removeMessages(1);
                this.f82913i.sendEmptyMessage(4);
            }
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        if (message.what == 4) {
            this.f82913i.removeMessages(4);
            if (m73690e()) {
                String str3 = (String) SharePrefCache.inst().getLastUploadPassCode().mo47782d();
                if (TextUtils.isEmpty(str3) || !TextUtils.equals(m73691f(), str3)) {
                    if (this.f82909e == null) {
                        C317411 r3 = new C12684a() {
                            /* renamed from: a */
                            public final C12683a mo9562a() {
                                return new C13358b();
                            }
                        };
                        C12794a aVar = new C12794a();
                        if (f82906c) {
                            str2 = "http://121.15.167.251:30030";
                        } else {
                            str2 = "http://wap.cmpassport.com";
                        }
                        this.f82909e = aVar.mo23945a(str2).mo23941a((C12684a) r3).mo23946a((Executor) new C9919a()).mo23944a((C12745a) C9920a.m19890a()).mo23947a();
                    }
                    if (this.f82910f == null) {
                        this.f82910f = (IMobileFlowApi) this.f82909e.mo23937a(IMobileFlowApi.class);
                    }
                    if (f82906c) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("expandParams", "phoneNum=15710066003");
                        str = C31739c.m73684a("/umcopenapi/wabpGetUseInfo?", hashMap);
                    } else {
                        str = C31739c.m73684a("/openapi/wabpGetUseInfo?", null);
                    }
                    this.f82910f.getPassCode(str).enqueue(new C12743e<C31737a>() {
                        /* renamed from: a */
                        public final void mo19943a(C12690b<C31737a> bVar, Throwable th) {
                        }

                        /* renamed from: a */
                        public final void mo19942a(C12690b<C31737a> bVar, C12799u<C31737a> uVar) {
                            if (uVar != null) {
                                C31737a aVar = (C31737a) uVar.f33552b;
                                if (aVar != null && aVar.f82897d == 0) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("cmccCertify", aVar.toString());
                                    C18894a.m46005a("getPassCodeFromServerSuccess", bundle);
                                    C31740d.this.f82908d = aVar.f82896c;
                                    C17825i.m43739a(UpdateMobilePassCodeApiManager.f82893b.upload(aVar.f82896c), new C17824h<BaseResponse>() {
                                        public final void onFailure(Throwable th) {
                                        }

                                        public final /* synthetic */ void onSuccess(Object obj) {
                                            BaseResponse baseResponse = (BaseResponse) obj;
                                            C31740d.this.mo64618a();
                                        }
                                    });
                                    C31740d.this.f82911g = 0;
                                    C31740d.this.f82913i.sendEmptyMessage(1);
                                }
                            }
                        }
                    });
                }
            }
        }
    }
}

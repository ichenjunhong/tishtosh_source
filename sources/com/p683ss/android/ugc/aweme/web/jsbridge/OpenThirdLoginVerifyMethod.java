package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod */
public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public final C10757a f121523a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod$a */
    static final class C48297a implements C23423b {

        /* renamed from: a */
        final /* synthetic */ OpenThirdLoginVerifyMethod f121524a;

        /* renamed from: b */
        final /* synthetic */ C29789a f121525b;

        /* renamed from: c */
        final /* synthetic */ String f121526c;

        C48297a(OpenThirdLoginVerifyMethod openThirdLoginVerifyMethod, C29789a aVar, String str) {
            this.f121524a = openThirdLoginVerifyMethod;
            this.f121525b = aVar;
            this.f121526c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:62:0x0108  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo48596a(int r6, int r7, android.content.Intent r8) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                r2 = -1
                if (r7 != r2) goto L_0x0117
                r7 = 10000(0x2710, float:1.4013E-41)
                if (r6 != r7) goto L_0x0117
                java.lang.String r6 = "access_token"
                java.lang.String r6 = r8.getStringExtra(r6)
                if (r6 != 0) goto L_0x0013
                java.lang.String r6 = ""
            L_0x0013:
                java.lang.String r7 = "access_token_secret"
                java.lang.String r7 = r8.getStringExtra(r7)
                if (r7 != 0) goto L_0x001d
                java.lang.String r7 = ""
            L_0x001d:
                java.lang.String r2 = "code"
                java.lang.String r8 = r8.getStringExtra(r2)
                if (r8 != 0) goto L_0x0027
                java.lang.String r8 = ""
            L_0x0027:
                java.lang.String r2 = ""
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r2)
                if (r2 == 0) goto L_0x0049
                java.lang.String r2 = ""
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r2)
                if (r2 == 0) goto L_0x0049
                java.lang.String r2 = ""
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r2)
                if (r2 == 0) goto L_0x0049
                com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a r6 = r5.f121525b
                if (r6 == 0) goto L_0x0048
                java.lang.String r7 = ""
                r6.mo60038a(r1, r7)
            L_0x0048:
                return r0
            L_0x0049:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r3 = "line"
                java.lang.String r4 = r5.f121526c     // Catch:{ JSONException -> 0x010c }
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ JSONException -> 0x010c }
                if (r3 == 0) goto L_0x0074
                java.lang.String r3 = "access_token"
                java.lang.String r6 = android.net.Uri.encode(r6)     // Catch:{ JSONException -> 0x010c }
                r2.put(r3, r6)     // Catch:{ JSONException -> 0x010c }
                java.lang.String r6 = "access_token_secret"
                java.lang.String r7 = android.net.Uri.encode(r7)     // Catch:{ JSONException -> 0x010c }
                r2.put(r6, r7)     // Catch:{ JSONException -> 0x010c }
                java.lang.String r6 = "code"
                java.lang.String r7 = android.net.Uri.encode(r8)     // Catch:{ JSONException -> 0x010c }
                r2.put(r6, r7)     // Catch:{ JSONException -> 0x010c }
                goto L_0x0083
            L_0x0074:
                java.lang.String r3 = "access_token"
                r2.put(r3, r6)     // Catch:{ JSONException -> 0x010c }
                java.lang.String r6 = "access_token_secret"
                r2.put(r6, r7)     // Catch:{ JSONException -> 0x010c }
                java.lang.String r6 = "code"
                r2.put(r6, r8)     // Catch:{ JSONException -> 0x010c }
            L_0x0083:
                java.lang.String r6 = "platform"
                java.lang.String r7 = r5.f121526c     // Catch:{ JSONException -> 0x010c }
                r2.put(r6, r7)     // Catch:{ JSONException -> 0x010c }
                java.lang.String r6 = "platform_app_id"
                java.lang.String r7 = r5.f121526c     // Catch:{ JSONException -> 0x010c }
                if (r7 != 0) goto L_0x0092
                goto L_0x00ff
            L_0x0092:
                int r8 = r7.hashCode()     // Catch:{ JSONException -> 0x010c }
                r3 = -1240244679(0xffffffffb6135e39, float:-2.1959552E-6)
                if (r8 == r3) goto L_0x00ef
                r3 = -916346253(0xffffffffc961aa73, float:-924327.2)
                if (r8 == r3) goto L_0x00df
                r3 = 3765(0xeb5, float:5.276E-42)
                if (r8 == r3) goto L_0x00cf
                r3 = 28903346(0x1b907b2, float:6.796931E-38)
                if (r8 == r3) goto L_0x00bf
                r3 = 497130182(0x1da19ac6, float:4.2776377E-21)
                if (r8 == r3) goto L_0x00af
                goto L_0x00ff
            L_0x00af:
                java.lang.String r8 = "facebook"
                boolean r7 = r7.equals(r8)     // Catch:{ JSONException -> 0x010c }
                if (r7 == 0) goto L_0x00ff
                java.lang.String r7 = ""
                java.lang.String r8 = "BuildConfigDiff.getFacebookID()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ JSONException -> 0x010c }
                goto L_0x0101
            L_0x00bf:
                java.lang.String r8 = "instagram"
                boolean r7 = r7.equals(r8)     // Catch:{ JSONException -> 0x010c }
                if (r7 == 0) goto L_0x00ff
                java.lang.String r7 = "204"
                java.lang.String r8 = "BuildConfigDiff.getInstagramID()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ JSONException -> 0x010c }
                goto L_0x0101
            L_0x00cf:
                java.lang.String r8 = "vk"
                boolean r7 = r7.equals(r8)     // Catch:{ JSONException -> 0x010c }
                if (r7 == 0) goto L_0x00ff
                java.lang.String r7 = ""
                java.lang.String r8 = "BuildConfigDiff.getVKID()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ JSONException -> 0x010c }
                goto L_0x0101
            L_0x00df:
                java.lang.String r8 = "twitter"
                boolean r7 = r7.equals(r8)     // Catch:{ JSONException -> 0x010c }
                if (r7 == 0) goto L_0x00ff
                java.lang.String r7 = "504"
                java.lang.String r8 = "BuildConfigDiff.getTwitterID()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ JSONException -> 0x010c }
                goto L_0x0101
            L_0x00ef:
                java.lang.String r8 = "google"
                boolean r7 = r7.equals(r8)     // Catch:{ JSONException -> 0x010c }
                if (r7 == 0) goto L_0x00ff
                java.lang.String r7 = ""
                java.lang.String r8 = "BuildConfigDiff.getGoogleID()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ JSONException -> 0x010c }
                goto L_0x0101
            L_0x00ff:
                java.lang.String r7 = ""
            L_0x0101:
                r2.put(r6, r7)     // Catch:{ JSONException -> 0x010c }
                com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a r6 = r5.f121525b
                if (r6 == 0) goto L_0x0120
                r6.mo60039a(r2)
                goto L_0x0120
            L_0x010c:
                com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a r6 = r5.f121525b
                if (r6 == 0) goto L_0x0116
                java.lang.String r7 = "failed"
                r6.mo60038a(r1, r7)
            L_0x0116:
                return r0
            L_0x0117:
                com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a r6 = r5.f121525b
                if (r6 == 0) goto L_0x0120
                java.lang.String r7 = ""
                r6.mo60038a(r1, r7)
            L_0x0120:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod.C48297a.mo48596a(int, int, android.content.Intent):boolean");
        }
    }

    public OpenThirdLoginVerifyMethod(C10757a aVar) {
        super(aVar);
        this.f121523a = aVar;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        if (this.f77793e != null && this.f121523a != null) {
            if (jSONObject != null) {
                str = jSONObject.getString("platform");
            } else {
                str = null;
            }
            Context context = (Context) this.f77793e.get();
            if (context instanceof CrossPlatformActivity) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
                crossPlatformActivity.mo48604a((C23423b) new C48297a(this, aVar, str));
                Intent authorizeActivityStartIntent = C20854a.m53165e().getAuthorizeActivityStartIntent(crossPlatformActivity);
                authorizeActivityStartIntent.putExtra("platform", str);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
                crossPlatformActivity.startActivityForResult(authorizeActivityStartIntent, 10000);
                return;
            }
            aVar.mo60038a(0, "");
        }
    }
}

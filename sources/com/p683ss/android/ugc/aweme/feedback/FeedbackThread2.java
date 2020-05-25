package com.p683ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.p1144c.C18891d;
import com.p683ss.android.newmedia.C19530a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackThread2 */
public final class FeedbackThread2 extends C9393e {

    /* renamed from: c */
    private static final String f81892c;

    /* renamed from: d */
    private static final String f81893d;

    /* renamed from: e */
    private static final String f81894e;

    /* renamed from: f */
    private static final String f81895f;

    /* renamed from: a */
    C18891d[] f81896a = new C18891d[1];

    /* renamed from: b */
    boolean f81897b;

    /* renamed from: g */
    private final Handler f81898g;

    /* renamed from: h */
    private final Context f81899h;

    /* renamed from: i */
    private C31271e f81900i;

    /* renamed from: j */
    private C31342s f81901j;

    /* renamed from: k */
    private C31289r f81902k;

    /* renamed from: l */
    private C18933b f81903l;

    /* renamed from: m */
    private boolean f81904m = true;

    /* renamed from: n */
    private FeedbackApi f81905n = ((FeedbackApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(FeedbackApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackThread2$FeedbackApi */
    public interface FeedbackApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);

        @C12718t(mo23886a = "/feedback/2/post_message/")
        @C12705g
        C17832m<String> doPost(@C12713o int i, @C12704f Map<String, String> map, @C12694aa Map<String, String> map2);
    }

    /* renamed from: b */
    private int m72982b() {
        return m72978a(0, this.f81900i.mo64162a(true), false);
    }

    /* renamed from: a */
    private String m72980a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                if (!C9431p.m18664a(this.f81902k.f82034m)) {
                    jSONObject.put("account_type", this.f81902k.f82034m);
                }
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return "";
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19530a.f52038c);
        sb.append("/feedback/2/list/");
        f81892c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C19530a.f52038c);
        sb2.append("/feedback/3/list/");
        f81893d = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C19530a.f52038c);
        sb3.append("/feedback/1/post_message/");
        f81894e = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C19530a.f52037b);
        sb4.append("/2/data/upload_image/");
        f81895f = sb4.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(50:24|25|26|(1:28)|29|(6:31|(2:33|(4:35|129|(1:131)|132)(3:36|(5:40|(1:42)|43|(1:45)|(4:49|(1:51)|52|(1:54)))|55))|123|129|(0)|132)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(1:82)|83|(1:85)|86|(1:88)|89|(1:91)|92|93|94|95|(1:97)|98|(1:100)|101|(1:103)(1:104)|(1:108)|109|(1:111)|112|(1:114)|115|(5:117|(2:119|(1:121))(1:122)|129|(0)|132)|123|129|(0)|132) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x036c */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0383 A[Catch:{ Throwable -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0390 A[Catch:{ Throwable -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0393 A[Catch:{ Throwable -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b0 A[Catch:{ Throwable -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03d1 A[Catch:{ Throwable -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0408 A[Catch:{ Throwable -> 0x0495 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0374 A[Catch:{ Throwable -> 0x0495 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r7 = r17
            android.content.Context r0 = r7.f81899h
            com.ss.android.ugc.aweme.feedback.e r0 = com.p683ss.android.ugc.aweme.feedback.C31271e.m72994a(r0)
            r7.f81900i = r0
            boolean r0 = r7.f81904m
            r1 = 1
            r8 = 10
            r9 = 11
            r3 = 0
            if (r0 == 0) goto L_0x0103
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            int r0 = r0.f82100e
            r4 = 2
            if (r0 != r4) goto L_0x0037
            int r2 = r17.m72982b()
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r10 = r7.f81900i
            r11 = 0
            com.ss.android.ugc.aweme.feedback.s r1 = r7.f81901j
            long r13 = r1.f82097b
            com.ss.android.ugc.aweme.feedback.s r1 = r7.f81901j
            int r15 = r1.f82098c
            java.lang.String r16 = " DESC"
            java.util.List r1 = r10.mo64163a(r11, r13, r15, r16)
            r0.f82102g = r1
            goto L_0x00ec
        L_0x0037:
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            int r0 = r0.f82100e
            r4 = 3
            if (r0 != r4) goto L_0x0061
            int r2 = r17.m72982b()
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r10 = r7.f81900i
            r11 = 0
            com.ss.android.ugc.aweme.feedback.s r1 = r7.f81901j
            long r13 = r1.f82097b
            r15 = -1
            java.lang.String r16 = " DESC"
            java.util.List r1 = r10.mo64163a(r11, r13, r15, r16)
            r0.f82102g = r1
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r1 = r7.f81900i
            java.util.List r1 = r1.mo64166b()
            r0.f82103h = r1
            goto L_0x00ec
        L_0x0061:
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            int r0 = r0.f82100e
            r4 = 5
            if (r0 != r4) goto L_0x0085
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r10 = r7.f81900i
            r11 = 0
            r13 = 0
            r15 = -1
            r16 = 0
            java.util.List r1 = r10.mo64163a(r11, r13, r15, r16)
            r0.f82102g = r1
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r1 = r7.f81900i
            java.util.List r1 = r1.mo64166b()
            r0.f82103h = r1
            r2 = 0
            goto L_0x00ec
        L_0x0085:
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            int r0 = r0.f82100e
            r4 = 4
            if (r0 != r4) goto L_0x00bd
            int r2 = r17.m72982b()
            if (r2 != 0) goto L_0x00ec
            com.ss.android.ugc.aweme.feedback.e r0 = r7.f81900i
            long r2 = r0.mo64162a(r3)
            r4 = 0
            r6 = 0
            r1 = r17
            int r2 = r1.m72978a(r2, r4, r6)
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r10 = r7.f81900i
            r11 = 0
            r13 = 0
            r15 = -1
            r16 = 0
            java.util.List r1 = r10.mo64163a(r11, r13, r15, r16)
            r0.f82102g = r1
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r1 = r7.f81900i
            java.util.List r1 = r1.mo64166b()
            r0.f82103h = r1
            goto L_0x00ec
        L_0x00bd:
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            int r0 = r0.f82100e
            if (r0 != r1) goto L_0x00ea
            r2 = 0
            r4 = 0
            r6 = 1
            r1 = r17
            int r2 = r1.m72978a(r2, r4, r6)
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r10 = r7.f81900i
            r11 = 0
            r13 = 0
            r15 = -1
            r16 = 0
            java.util.List r1 = r10.mo64163a(r11, r13, r15, r16)
            r0.f82102g = r1
            com.ss.android.ugc.aweme.feedback.s r0 = r7.f81901j
            com.ss.android.ugc.aweme.feedback.e r1 = r7.f81900i
            java.util.List r1 = r1.mo64166b()
            r0.f82103h = r1
            goto L_0x00ec
        L_0x00ea:
            r2 = 18
        L_0x00ec:
            if (r2 != 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r8 = 11
        L_0x00f1:
            android.os.Handler r0 = r7.f81898g
            android.os.Message r0 = r0.obtainMessage(r8)
            com.ss.android.ugc.aweme.feedback.s r1 = r7.f81901j
            r0.obj = r1
            r0.arg1 = r2
            android.os.Handler r1 = r7.f81898g
            r1.sendMessage(r0)
            return
        L_0x0103:
            java.lang.String r0 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.feedback.r r6 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = r6.f82027f     // Catch:{ Throwable -> 0x0495 }
            if (r6 != 0) goto L_0x0115
            com.ss.android.ugc.aweme.feedback.r r6 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r10 = ""
            r6.f82027f = r10     // Catch:{ Throwable -> 0x0495 }
        L_0x0115:
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.feedback.r r10 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r10 = r10.f82027f     // Catch:{ Throwable -> 0x0495 }
            r6.<init>(r10)     // Catch:{ Throwable -> 0x0495 }
            boolean r6 = r6.exists()     // Catch:{ Throwable -> 0x0495 }
            r10 = -1024(0xfffffffffffffc00, float:NaN)
            if (r6 == 0) goto L_0x0259
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Throwable -> 0x0495 }
            r15.<init>()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "watermark"
            java.lang.String r4 = "0"
            r15.put(r0, r4)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "upload_image_choose"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "faq_id"
            com.ss.android.ugc.aweme.feedback.r r6 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = r6.f82028g     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "type"
            java.lang.String r6 = "single"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)     // Catch:{ Throwable -> 0x0495 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r4)     // Catch:{ Throwable -> 0x0495 }
            r11 = 20480(0x5000, float:2.8699E-41)
            java.lang.String r12 = f81895f     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r13 = "image"
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r14 = r0.f82027f     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.common.c.d[] r0 = r7.f81896a     // Catch:{ Throwable -> 0x0495 }
            r16 = r0
            java.lang.String r0 = com.p683ss.android.common.util.NetworkUtils.postFile(r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x0495 }
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r4 != 0) goto L_0x0492
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0495 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = com.p683ss.android.newmedia.p1198d.C19548a.isApiSuccess(r4)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = "feedback_uploadimage_error_rate"
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "errorCode"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47822a(r2, r3)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "errorDesc"
            java.lang.String r3 = "data"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)     // Catch:{ Throwable -> 0x0495 }
            org.json.JSONObject r1 = r1.mo47825b()     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r0, r1)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "upload_image_choose_failed"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "faq_id"
            com.ss.android.ugc.aweme.feedback.r r3 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r3 = r3.f82028g     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "type"
            java.lang.String r3 = "single"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)     // Catch:{ Throwable -> 0x0495 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)     // Catch:{ Throwable -> 0x0495 }
            r0 = 16
            goto L_0x04a4
        L_0x01b6:
            java.lang.String r0 = "upload_image_choose_succeed"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = "faq_id"
            com.ss.android.ugc.aweme.feedback.r r11 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r11 = r11.f82028g     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r11)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = "type"
            java.lang.String r11 = "single"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r11)     // Catch:{ Throwable -> 0x0495 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r4.optJSONObject(r0)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r4 = "web_uri"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.optString(r4, r5)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "width"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = "height"
            java.lang.String r6 = r0.optString(r6)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r11 = "url_list"
            org.json.JSONArray r0 = r0.optJSONArray(r11)     // Catch:{ Throwable -> 0x0495 }
            if (r0 == 0) goto L_0x0256
            int r11 = r0.length()     // Catch:{ Throwable -> 0x0495 }
            if (r11 <= 0) goto L_0x0256
            com.ss.android.d.b r11 = r7.f81903l     // Catch:{ Throwable -> 0x0495 }
            if (r11 != 0) goto L_0x0208
            com.ss.android.d.b r11 = new com.ss.android.d.b     // Catch:{ Throwable -> 0x0495 }
            android.content.Context r12 = r7.f81899h     // Catch:{ Throwable -> 0x0495 }
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0495 }
            r7.f81903l = r11     // Catch:{ Throwable -> 0x0495 }
        L_0x0208:
            r11 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch:{ Throwable -> 0x0495 }
            if (r0 == 0) goto L_0x0215
            java.lang.String r11 = "url"
            java.lang.String r11 = r0.optString(r11)     // Catch:{ Throwable -> 0x0495 }
        L_0x0215:
            if (r11 == 0) goto L_0x0256
            int r0 = r11.length()     // Catch:{ Throwable -> 0x0495 }
            if (r0 <= 0) goto L_0x0256
            java.lang.String r0 = "~noop.image"
            boolean r0 = r11.endsWith(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 == 0) goto L_0x022d
            java.lang.String r0 = "~noop.image"
            java.lang.String r12 = ""
            java.lang.String r11 = r11.replace(r0, r12)     // Catch:{ Throwable -> 0x0495 }
        L_0x022d:
            java.lang.String r0 = "/img/"
            java.lang.String r12 = "/obj/"
            java.lang.String r0 = r11.replace(r0, r12)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = com.bytedance.common.utility.C9395d.m18571a(r0)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.d.b r11 = r7.f81903l     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r11 = r11.mo38805c(r0)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.d.b r12 = r7.f81903l     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = r12.mo38808e(r0)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.feedback.r r12 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r12 = r12.f82027f     // Catch:{ Throwable -> 0x0495 }
            boolean r11 = com.p683ss.android.ugc.aweme.video.C48016e.m103948c(r12, r11)     // Catch:{ Throwable -> 0x0495 }
            if (r11 != 0) goto L_0x0256
            com.ss.android.ugc.aweme.feedback.r r11 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r11 = r11.f82027f     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.video.C48016e.m103948c(r11, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x0256:
            r0 = r4
            r4 = r5
            r5 = r6
        L_0x0259:
            java.lang.String r6 = ""
            com.ss.android.ugc.aweme.services.IExternalService r11 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.services.IExternalService r11 = (com.p683ss.android.ugc.aweme.services.IExternalService) r11     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.services.external.IConfigService r11 = r11.configService()     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r11 = r11.avsettingsConfig()     // Catch:{ Throwable -> 0x0495 }
            boolean r11 = r11.enableFeedbackLog()     // Catch:{ Throwable -> 0x0495 }
            if (r11 == 0) goto L_0x0273
            java.lang.String r6 = com.p683ss.android.ugc.aweme.feedback.C31280i.m73008a()     // Catch:{ Throwable -> 0x0495 }
        L_0x0273:
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Throwable -> 0x0495 }
            r11.<init>()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r12 = "appkey"
            java.lang.String r13 = com.bytedance.ies.ugc.p694a.C11010c.m22285f()     // Catch:{ Throwable -> 0x0495 }
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r12 = "content"
            com.ss.android.ugc.aweme.feedback.r r13 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r13 = r13.f82022a     // Catch:{ Throwable -> 0x0495 }
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.feedback.r r12 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r12 = r12.f82023b     // Catch:{ Throwable -> 0x0495 }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r12)     // Catch:{ Throwable -> 0x0495 }
            if (r12 != 0) goto L_0x029d
            java.lang.String r12 = "contact"
            com.ss.android.ugc.aweme.feedback.r r13 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r13 = r13.f82023b     // Catch:{ Throwable -> 0x0495 }
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x0495 }
        L_0x029d:
            com.ss.android.ugc.aweme.feedback.r r12 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r12 = r12.f82024c     // Catch:{ Throwable -> 0x0495 }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r12)     // Catch:{ Throwable -> 0x0495 }
            if (r12 != 0) goto L_0x02b0
            java.lang.String r12 = "report_type"
            com.ss.android.ugc.aweme.feedback.r r13 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r13 = r13.f82024c     // Catch:{ Throwable -> 0x0495 }
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x0495 }
        L_0x02b0:
            com.ss.android.ugc.aweme.feedback.r r12 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r12 = r12.f82025d     // Catch:{ Throwable -> 0x0495 }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r12)     // Catch:{ Throwable -> 0x0495 }
            if (r12 != 0) goto L_0x02c3
            java.lang.String r12 = "report_content"
            com.ss.android.ugc.aweme.feedback.r r13 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r13 = r13.f82025d     // Catch:{ Throwable -> 0x0495 }
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x0495 }
        L_0x02c3:
            com.ss.android.ugc.aweme.feedback.r r12 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            long r12 = r12.f82026e     // Catch:{ Throwable -> 0x0495 }
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02da
            java.lang.String r12 = "user_id"
            com.ss.android.ugc.aweme.feedback.r r13 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            long r2 = r13.f82026e     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0495 }
            r11.put(r12, r2)     // Catch:{ Throwable -> 0x0495 }
        L_0x02da:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r2 != 0) goto L_0x02e5
            java.lang.String r2 = "image_uri"
            r11.put(r2, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x02e5:
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x02f0
            java.lang.String r0 = "aweme_infra_log"
            r11.put(r0, r6)     // Catch:{ Throwable -> 0x0495 }
        L_0x02f0:
            java.lang.String r0 = "device"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0495 }
            r11.put(r0, r2)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = r0.f82028g     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x030a
            java.lang.String r0 = "feedback_id"
            com.ss.android.ugc.aweme.feedback.r r2 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = r2.f82028g     // Catch:{ Throwable -> 0x0495 }
            r11.put(r0, r2)     // Catch:{ Throwable -> 0x0495 }
        L_0x030a:
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = r0.f82029h     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "fantasy_log"
            com.ss.android.ugc.aweme.feedback.r r2 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = r2.f82029h     // Catch:{ Throwable -> 0x0495 }
            r11.put(r0, r2)     // Catch:{ Throwable -> 0x0495 }
        L_0x031d:
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = r0.f82030i     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x0330
            java.lang.String r0 = "aweme_login_log"
            com.ss.android.ugc.aweme.feedback.r r2 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = r2.f82030i     // Catch:{ Throwable -> 0x0495 }
            r11.put(r0, r2)     // Catch:{ Throwable -> 0x0495 }
        L_0x0330:
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = r0.f82031j     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x0343
            java.lang.String r0 = "last_uid"
            com.ss.android.ugc.aweme.feedback.r r2 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = r2.f82031j     // Catch:{ Throwable -> 0x0495 }
            r11.put(r0, r2)     // Catch:{ Throwable -> 0x0495 }
        L_0x0343:
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = r0.f82032k     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x0356
            java.lang.String r0 = "description"
            com.ss.android.ugc.aweme.feedback.r r2 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = r2.f82032k     // Catch:{ Throwable -> 0x0495 }
            r11.put(r0, r2)     // Catch:{ Throwable -> 0x0495 }
        L_0x0356:
            android.content.Context r0 = r7.f81899h     // Catch:{ Exception -> 0x036c }
            java.lang.String r0 = com.p683ss.android.common.applog.AppLog.getVersion(r0)     // Catch:{ Exception -> 0x036c }
            java.lang.String r2 = "app_version"
            r11.put(r2, r0)     // Catch:{ Exception -> 0x036c }
            java.lang.String r0 = "sig_hash"
            android.content.Context r2 = r7.f81899h     // Catch:{ Exception -> 0x036c }
            java.lang.String r2 = com.p683ss.android.common.applog.AppLog.getSigHash(r2)     // Catch:{ Exception -> 0x036c }
            r11.put(r0, r2)     // Catch:{ Exception -> 0x036c }
        L_0x036c:
            android.content.Context r0 = r7.f81899h     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = com.p683ss.android.common.util.NetworkUtils.getNetworkAccessType(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 == 0) goto L_0x0379
            java.lang.String r2 = "network_type"
            r11.put(r2, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x0379:
            java.lang.String r0 = com.p683ss.android.ugc.aweme.utils.C47792cx.m103422a()     // Catch:{ Throwable -> 0x0495 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r2 != 0) goto L_0x0388
            java.lang.String r2 = "logout_info"
            r11.put(r2, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x0388:
            java.lang.String r0 = com.p683ss.android.ugc.aweme.lancet.I18nLancet.f52269a     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x0393
            java.lang.String r0 = com.p683ss.android.ugc.aweme.lancet.I18nLancet.f52269a     // Catch:{ Throwable -> 0x0495 }
            goto L_0x0399
        L_0x0393:
            java.lang.String r0 = com.p683ss.android.message.p1191b.C19470k.m47655b()     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.lancet.I18nLancet.f52269a = r0     // Catch:{ Throwable -> 0x0495 }
        L_0x0399:
            if (r0 == 0) goto L_0x03a8
            int r2 = r0.length()     // Catch:{ Throwable -> 0x0495 }
            r3 = 30
            if (r2 >= r3) goto L_0x03a8
            java.lang.String r2 = "rom"
            r11.put(r2, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x03a8:
            com.ss.android.ugc.aweme.feedback.r r0 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            long r2 = r0.f82033l     // Catch:{ Throwable -> 0x0495 }
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x03c7
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0495 }
            r0.<init>()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "roomId"
            com.ss.android.ugc.aweme.feedback.r r3 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            long r12 = r3.f82033l     // Catch:{ Throwable -> 0x0495 }
            r0.put(r2, r12)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "extra_persistent_params"
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0495 }
            r11.put(r2, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x03c7:
            java.lang.String r0 = r17.m72980a()     // Catch:{ Throwable -> 0x0495 }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r2 != 0) goto L_0x03d6
            java.lang.String r2 = "extra_params"
            r11.put(r2, r0)     // Catch:{ Throwable -> 0x0495 }
        L_0x03d6:
            m72981a(r11)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "image_width"
            r11.put(r0, r4)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "image_height"
            r11.put(r0, r5)     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.common.applog.NetUtil.putCommonParams(r11, r1)     // Catch:{ Throwable -> 0x0495 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x0495 }
            r0.<init>()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r1 = "app_name"
            java.lang.String r2 = com.bytedance.ies.ugc.p694a.C11010c.m22283d()     // Catch:{ Throwable -> 0x0495 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.feedback.FeedbackThread2$FeedbackApi r1 = r7.f81905n     // Catch:{ Throwable -> 0x0495 }
            r2 = 12040(0x2f08, float:1.6872E-41)
            com.google.b.h.a.m r0 = r1.doPost(r2, r11, r0)     // Catch:{ Throwable -> 0x0495 }
            java.lang.Object r0 = r0.get()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0495 }
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r1 != 0) goto L_0x0492
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0495 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r0 = "message"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "success"
            boolean r0 = r2.equals(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 != 0) goto L_0x048e
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r2 = "err_code"
            int r2 = r1.optInt(r2, r10)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r3 = "message"
            java.lang.String r1 = r1.optString(r3)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r3 = "feedback_failed"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "faq_id"
            com.ss.android.ugc.aweme.feedback.r r6 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = r6.f82028g     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "page_type"
            java.lang.String r6 = "app"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "question_content"
            com.ss.android.ugc.aweme.feedback.r r6 = r7.f81902k     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r6 = r6.f82022a     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "status_code"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47826a(r5, r2)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "message"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r1)     // Catch:{ Throwable -> 0x0495 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r4)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r3 = "feedback_error_rate"
            com.ss.android.ugc.aweme.app.f.c r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r5 = "errorCode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x0495 }
            com.ss.android.ugc.aweme.app.f.c r2 = r4.mo47822a(r5, r2)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r4 = "errorDesc"
            com.ss.android.ugc.aweme.app.f.c r1 = r2.mo47824a(r4, r1)     // Catch:{ Throwable -> 0x0495 }
            org.json.JSONObject r1 = r1.mo47825b()     // Catch:{ Throwable -> 0x0495 }
            com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r3, r1)     // Catch:{ Throwable -> 0x0495 }
            java.lang.String r1 = "session_expired"
            java.lang.String r2 = "name"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Throwable -> 0x0495 }
            boolean r0 = r1.equals(r0)     // Catch:{ Throwable -> 0x0495 }
            if (r0 == 0) goto L_0x0492
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x04a4
        L_0x048e:
            r0 = 0
            r9 = 10
            goto L_0x04a4
        L_0x0492:
            r0 = 18
            goto L_0x04a4
        L_0x0495:
            r0 = move-exception
            boolean r1 = r0 instanceof java.util.concurrent.ExecutionException
            if (r1 == 0) goto L_0x049e
            java.lang.Throwable r0 = r0.getCause()
        L_0x049e:
            android.content.Context r1 = r7.f81899h
            int r0 = com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a.m56495b(r1, r0)
        L_0x04a4:
            boolean r1 = r7.f81897b
            if (r1 != 0) goto L_0x04b5
            android.os.Handler r1 = r7.f81898g
            android.os.Message r1 = r1.obtainMessage(r9)
            r1.arg1 = r0
            android.os.Handler r0 = r7.f81898g
            r0.sendMessage(r1)
        L_0x04b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.FeedbackThread2.run():void");
    }

    /* renamed from: a */
    private static void m72981a(Map<String, String> map) {
        if (C31300c.m73019c()) {
            for (Entry entry : C31300c.m73018b().entrySet()) {
                map.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public FeedbackThread2(Handler handler, Context context, C31342s sVar) {
        this.f81898g = handler;
        this.f81899h = context.getApplicationContext();
        this.f81901j = sVar;
    }

    public FeedbackThread2(C9381g gVar, Context context, C31289r rVar) {
        this.f81898g = gVar;
        this.f81899h = context.getApplicationContext();
        this.f81902k = rVar;
        this.f81904m = false;
    }

    /* renamed from: a */
    private int m72978a(long j, long j2, boolean z) {
        int a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j3 = -1;
        long j4 = j;
        while (true) {
            C31342s sVar = new C31342s(j4, j2, 50);
            a = m72979a((List<C31274g>) arrayList, (List<C31274g>) arrayList2, sVar);
            if (a != 0 || arrayList.size() <= 0) {
                break;
            }
            long j5 = ((C31274g) arrayList.get(arrayList.size() - 1)).f81949b;
            if (j3 == j5 || j2 >= j5 || !sVar.f82101f) {
                break;
            }
            j3 = j5;
            j4 = j3;
        }
        if (z && a == 0) {
            this.f81900i.mo64164a();
        }
        this.f81900i.mo64165a((List<C31274g>) arrayList);
        this.f81900i.mo64165a((List<C31274g>) arrayList2);
        return a;
    }

    /* renamed from: a */
    private int m72979a(List<C31274g> list, List<C31274g> list2, C31342s sVar) {
        boolean z;
        List<C31274g> list3 = list;
        C31342s sVar2 = sVar;
        try {
            StringBuffer stringBuffer = new StringBuffer(f81893d);
            StringBuilder sb = new StringBuilder("?appkey=");
            sb.append(C11010c.m22285f());
            stringBuffer.append(sb.toString());
            if (sVar2.f82098c > 0) {
                StringBuilder sb2 = new StringBuilder("&count=");
                sb2.append(sVar2.f82098c);
                stringBuffer.append(sb2.toString());
            }
            long j = 0;
            if (sVar2.f82097b > 0) {
                StringBuilder sb3 = new StringBuilder("&min_id=");
                sb3.append(sVar2.f82097b);
                stringBuffer.append(sb3.toString());
            }
            if (sVar2.f82096a > 0) {
                StringBuilder sb4 = new StringBuilder("&max_id=");
                sb4.append(sVar2.f82096a);
                stringBuffer.append(sb4.toString());
            }
            String str = (String) this.f81905n.doGet(stringBuffer.toString()).get();
            if (C9431p.m18664a(str)) {
                return 18;
            }
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                int length = optJSONArray.length();
                if (jSONObject.isNull("has_more")) {
                    if (length >= sVar2.f82098c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sVar2.f82101f = z;
                } else {
                    sVar2.f82101f = jSONObject.optBoolean("has_more", false);
                }
                int i = 0;
                while (i < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    long optLong = optJSONObject.optLong("id", -1);
                    if (optLong > j) {
                        C31274g gVar = new C31274g(optLong);
                        gVar.mo64170a(optJSONObject);
                        list3.add(gVar);
                        if (gVar.f81960m != null && gVar.f81960m.size() > 0) {
                            for (C31275a aVar : gVar.f81960m) {
                                C31274g gVar2 = new C31274g(gVar.f81948a, gVar.f81949b, gVar.f81950c);
                                gVar2.f81951d = gVar.f81951d;
                                gVar2.f81954g = gVar.f81954g;
                                gVar2.f81957j = gVar.f81957j;
                                gVar2.f81953f = aVar.f81964c;
                                gVar2.f81955h = aVar.f81962a;
                                gVar2.f81956i = aVar.f81963b;
                                gVar2.f81961n = true;
                                list3.add(gVar2);
                            }
                        }
                    }
                    i++;
                    j = 0;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("default_item");
                if (optJSONObject2 != null) {
                    C31274g gVar3 = new C31274g(optJSONObject2.optLong("id", 0));
                    gVar3.mo64170a(optJSONObject2);
                    gVar3.f81957j = 2;
                    list2.add(gVar3);
                }
                return 0;
            } else if ("session_expired".equals(jSONObject.optJSONObject("data").optString(LeakCanaryFileProvider.f132049i))) {
                return 105;
            } else {
                return 18;
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            return C22971a.m56495b(this.f81899h, th);
        }
    }
}

package com.p683ss.caijing.globaliap.p2559d;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.base.mvp.C51165d;
import com.p683ss.base.mvp.p2548a.C51162a;
import com.p683ss.base.p2546a.C51154b;
import com.p683ss.base.p2546a.C51156c;
import com.p683ss.base.p2546a.C51157d;
import com.p683ss.caijing.globaliap.p2556a.C51217a;
import com.p683ss.caijing.globaliap.p2556a.C51219b;
import com.p683ss.caijing.globaliap.p2556a.C51220c;
import com.p683ss.caijing.globaliap.p2556a.C51220c.C51221a;
import com.p683ss.caijing.globaliap.p2558c.C51226a;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51256b;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51258d;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51259e;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51260f;
import com.p683ss.caijing.globaliap.p2559d.C51268j.C51269a;
import com.p683ss.caijing.globaliap.p2563f.C51282a;
import com.p683ss.caijing.globaliap.p2563f.C51283b;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import com.p683ss.caijing.globaliap.pay.C51292c;
import com.p683ss.caijing.globaliap.pay.C51294e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.d */
public final class C51238d extends C51165d implements C51162a {

    /* renamed from: a */
    public String f127963a;

    /* renamed from: b */
    public C51249e f127964b;

    /* renamed from: c */
    public C51243e f127965c;

    /* renamed from: d */
    boolean f127966d;

    /* renamed from: e */
    String f127967e;

    /* renamed from: f */
    String f127968f;

    /* renamed from: g */
    String f127969g;

    /* renamed from: h */
    long f127970h;

    /* renamed from: i */
    public WeakReference<Activity> f127971i;

    /* renamed from: j */
    private Handler f127972j = new Handler();

    /* renamed from: k */
    private C51240b f127973k;

    /* renamed from: com.ss.caijing.globaliap.d.d$a */
    public class C51239a implements C51256b {
        /* renamed from: b */
        public final void mo101739b() {
            C51238d.this.f127965c.mo101774a(C51294e.m110283a(199, "bind google service error"));
            C51283b.m110250a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), false);
        }

        /* renamed from: a */
        public final void mo101738a() {
            String b = C51292c.m110281b(C51238d.this.f127963a, "order", null);
            if (TextUtils.isEmpty(b)) {
                C51238d.this.f127965c.mo101774a(C51294e.m110284a("order is null"));
                return;
            }
            try {
                C51217a aVar = new C51217a();
                aVar.f127910a = b;
                C51219b bVar = new C51219b();
                bVar.mo101745a(aVar);
                C51154b.m110035a((C51157d<Result>) bVar).mo101670a((C51156c<Result>) new C51241c<Result>(C51238d.this, 0));
            } catch (JSONException unused) {
                C51238d.this.f127965c.mo101774a(C51294e.m110284a("order parse failed"));
            }
            C51283b.m110250a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), true);
        }

        private C51239a() {
        }

        public /* synthetic */ C51239a(C51238d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$b */
    class C51240b implements Runnable {

        /* renamed from: b */
        private C51156c<JSONObject> f127976b;

        /* renamed from: c */
        private C51268j f127977c;

        public final void run() {
            C51238d.this.mo101768a(this.f127977c, this.f127976b);
        }

        private C51240b(C51268j jVar, C51156c<JSONObject> cVar) {
            this.f127977c = jVar;
            this.f127976b = cVar;
        }

        /* synthetic */ C51240b(C51238d dVar, C51268j jVar, C51156c cVar, byte b) {
            this(jVar, cVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$c */
    class C51241c implements C51156c<JSONObject> {
        /* renamed from: a */
        public final void mo101673a() {
            C51238d.this.f127965c.mo101774a(C51294e.m110288c());
            C51282a.m110243a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), C51292c.m110281b(C51238d.this.f127963a, "merchant_id", ""), C51292c.m110281b(C51238d.this.f127963a, "total_amount", ""), false);
        }

        private C51241c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc A[Catch:{ JSONException -> 0x0196 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0140 A[Catch:{ JSONException -> 0x0196 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo101674a(java.lang.Object r10) {
            /*
                r9 = this;
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                com.ss.caijing.globaliap.d.d r0 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                com.ss.caijing.globaliap.d.e r0 = r0.f127964b
                if (r0 == 0) goto L_0x01c8
                com.ss.caijing.globaliap.d.d r0 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                java.lang.String r0 = r0.f127963a
                java.lang.String r1 = "app_id"
                java.lang.String r2 = ""
                java.lang.String r3 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r0, r1, r2)
                com.ss.caijing.globaliap.d.d r0 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                java.lang.String r0 = r0.f127963a
                java.lang.String r1 = "uid"
                java.lang.String r2 = ""
                java.lang.String r4 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r0, r1, r2)
                r0 = 0
                com.ss.caijing.globaliap.a.a r1 = new com.ss.caijing.globaliap.a.a     // Catch:{ JSONException -> 0x0196 }
                r1.<init>()     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.a.a$a r1 = new com.ss.caijing.globaliap.a.a$a     // Catch:{ JSONException -> 0x0196 }
                r1.<init>()     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = "response"
                org.json.JSONObject r10 = r10.getJSONObject(r2)     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = "code"
                java.lang.String r2 = r10.getString(r2)     // Catch:{ JSONException -> 0x0196 }
                r1.f128038g = r2     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = "msg"
                java.lang.String r2 = r10.optString(r2)     // Catch:{ JSONException -> 0x0196 }
                r1.f128039h = r2     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = "trade_info"
                org.json.JSONObject r2 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r2 == 0) goto L_0x0072
                java.lang.String r5 = "trade_no"
                java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0196 }
                r1.f127911a = r5     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = "product_id"
                java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0196 }
                r1.f127912b = r5     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = "trade_amount"
                long r5 = r2.getLong(r5)     // Catch:{ JSONException -> 0x0196 }
                r1.f127914d = r5     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = r1.f127911a     // Catch:{ JSONException -> 0x0196 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r2 != 0) goto L_0x00d5
                java.lang.String r2 = r1.f127912b     // Catch:{ JSONException -> 0x0196 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r2 == 0) goto L_0x0072
                goto L_0x00d5
            L_0x0072:
                java.lang.String r2 = "merchant_info"
                org.json.JSONObject r2 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r2 == 0) goto L_0x0097
                java.lang.String r5 = "merchant_id"
                java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0196 }
                r1.f127913c = r5     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = "app_id"
                java.lang.String r2 = r2.getString(r5)     // Catch:{ JSONException -> 0x0196 }
                r1.f127916f = r2     // Catch:{ JSONException -> 0x0196 }
                android.content.Context r2 = com.p683ss.caijing.globaliap.pay.C51292c.m110280b()     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = r1.f127916f     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r6 = "pay_controll"
                java.lang.String r7 = "cj_appid"
                com.p683ss.base.p2547b.C51159b.m110043a(r2, r6, r7, r5)     // Catch:{ JSONException -> 0x0196 }
            L_0x0097:
                java.lang.String r2 = "user_info"
                org.json.JSONObject r2 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r2 == 0) goto L_0x00a7
                java.lang.String r5 = "uid"
                java.lang.String r2 = r2.getString(r5)     // Catch:{ JSONException -> 0x0196 }
                r1.f127915e = r2     // Catch:{ JSONException -> 0x0196 }
            L_0x00a7:
                java.lang.String r2 = "paytype_info"
                org.json.JSONObject r10 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r10 == 0) goto L_0x00d5
                java.lang.String r2 = "googlepay_iap"
                org.json.JSONObject r10 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0196 }
                if (r10 == 0) goto L_0x00d5
                java.lang.String r2 = "retry_sleep_time"
                int r10 = r10.getInt(r2)     // Catch:{ JSONException -> 0x0196 }
                android.content.Context r2 = com.p683ss.caijing.globaliap.pay.C51292c.m110280b()     // Catch:{ JSONException -> 0x0196 }
                int r10 = r10 * 1000
                java.lang.String r5 = "pay_controll"
                java.lang.String r6 = "retry_sleep_time"
                android.content.SharedPreferences r2 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r2, r5, r0)     // Catch:{ JSONException -> 0x0196 }
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ JSONException -> 0x0196 }
                r2.putInt(r6, r10)     // Catch:{ JSONException -> 0x0196 }
                r2.apply()     // Catch:{ JSONException -> 0x0196 }
            L_0x00d5:
                boolean r10 = r1.mo101797c()     // Catch:{ JSONException -> 0x0196 }
                r2 = 1
                if (r10 == 0) goto L_0x0140
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = r1.f127912b     // Catch:{ JSONException -> 0x0196 }
                r10.f127967e = r5     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = r1.f127911a     // Catch:{ JSONException -> 0x0196 }
                r10.f127968f = r5     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = r1.f127913c     // Catch:{ JSONException -> 0x0196 }
                r10.f127969g = r5     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                long r5 = r1.f127914d     // Catch:{ JSONException -> 0x0196 }
                r10.f127970h = r5     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r5 = r10.f127968f     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r6 = r10.f127969g     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                long r7 = r10.f127970h     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r10 = com.p683ss.caijing.globaliap.p2559d.C51266h.m110207a(r3, r4, r5, r6, r7)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r1 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.e r1 = r1.f127964b     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r3 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r3 = r3.f127967e     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r4 = "inapp"
                com.ss.caijing.globaliap.d.d$d r5 = new com.ss.caijing.globaliap.d.d$d     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r6 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                r5.<init>(r6, r0)     // Catch:{ JSONException -> 0x0196 }
                r1.mo101784a(r3, r4, r10, r5)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r10 = r10.f127963a     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r1 = "app_id"
                java.lang.String r3 = ""
                java.lang.String r10 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r10, r1, r3)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r1 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r1 = r1.f127963a     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r3 = "merchant_id"
                java.lang.String r4 = ""
                java.lang.String r1 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r1, r3, r4)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r3 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r3 = r3.f127963a     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r4 = "total_amount"
                java.lang.String r5 = ""
                java.lang.String r3 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r3, r4, r5)     // Catch:{ JSONException -> 0x0196 }
                com.p683ss.caijing.globaliap.p2563f.C51282a.m110243a(r10, r1, r3, r2)     // Catch:{ JSONException -> 0x0196 }
                return
            L_0x0140:
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d$e r10 = r10.f127965c     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r1 = r1.f128039h     // Catch:{ JSONException -> 0x0196 }
                android.os.Bundle r3 = new android.os.Bundle     // Catch:{ JSONException -> 0x0196 }
                r3.<init>()     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r4 = "pay_result_code"
                r3.putInt(r4, r2)     // Catch:{ JSONException -> 0x0196 }
                android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x0196 }
                r2.<init>()     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r4 = "pay_result_detail_code"
                r5 = 4
                r2.putInt(r4, r5)     // Catch:{ JSONException -> 0x0196 }
                boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0196 }
                if (r4 != 0) goto L_0x0166
                java.lang.String r4 = "pay_result_msg"
                r2.putString(r4, r1)     // Catch:{ JSONException -> 0x0196 }
            L_0x0166:
                java.lang.String r1 = "pay_result_extra"
                r3.putBundle(r1, r2)     // Catch:{ JSONException -> 0x0196 }
                r10.mo101774a(r3)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r10 = r10.f127963a     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r1 = "app_id"
                java.lang.String r2 = ""
                java.lang.String r10 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r10, r1, r2)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r1 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r1 = r1.f127963a     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = "merchant_id"
                java.lang.String r3 = ""
                java.lang.String r1 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r1, r2, r3)     // Catch:{ JSONException -> 0x0196 }
                com.ss.caijing.globaliap.d.d r2 = com.p683ss.caijing.globaliap.p2559d.C51238d.this     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r2 = r2.f127963a     // Catch:{ JSONException -> 0x0196 }
                java.lang.String r3 = "total_amount"
                java.lang.String r4 = ""
                java.lang.String r2 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r2, r3, r4)     // Catch:{ JSONException -> 0x0196 }
                com.p683ss.caijing.globaliap.p2563f.C51282a.m110243a(r10, r1, r2, r0)     // Catch:{ JSONException -> 0x0196 }
                return
            L_0x0196:
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                com.ss.caijing.globaliap.d.d$e r10 = r10.f127965c
                android.os.Bundle r1 = com.p683ss.caijing.globaliap.pay.C51294e.m110288c()
                r10.mo101774a(r1)
                com.ss.caijing.globaliap.d.d r10 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                java.lang.String r10 = r10.f127963a
                java.lang.String r1 = "app_id"
                java.lang.String r2 = ""
                java.lang.String r10 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r10, r1, r2)
                com.ss.caijing.globaliap.d.d r1 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                java.lang.String r1 = r1.f127963a
                java.lang.String r2 = "merchant_id"
                java.lang.String r3 = ""
                java.lang.String r1 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r1, r2, r3)
                com.ss.caijing.globaliap.d.d r2 = com.p683ss.caijing.globaliap.p2559d.C51238d.this
                java.lang.String r2 = r2.f127963a
                java.lang.String r3 = "total_amount"
                java.lang.String r4 = ""
                java.lang.String r2 = com.p683ss.caijing.globaliap.pay.C51292c.m110281b(r2, r3, r4)
                com.p683ss.caijing.globaliap.p2563f.C51282a.m110243a(r10, r1, r2, r0)
            L_0x01c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.p2559d.C51238d.C51241c.mo101674a(java.lang.Object):void");
        }

        /* synthetic */ C51241c(C51238d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$d */
    class C51242d implements C51259e {
        /* renamed from: a */
        public final void mo101771a() {
            C51238d.this.f127965c.mo101774a(C51294e.m110283a(199, ""));
            C51283b.m110256b(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), false);
        }

        private C51242d() {
        }

        /* renamed from: a */
        public final void mo101772a(Bundle bundle) {
            int i;
            boolean z;
            int i2;
            String b = C51292c.m110281b(C51238d.this.f127963a, "app_id", "");
            if (bundle != null) {
                i = bundle.getInt("RESPONSE_CODE", -1);
            } else {
                i = -1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", b);
            hashMap.put("resultCode", Integer.toString(i));
            C51284c.m110260a("caijing_iap_google_fetch_intent_code", hashMap);
            Activity activity = (Activity) C51238d.this.f127971i.get();
            if (C51238d.this.f127966d || activity == null) {
                if (C51238d.this.f127965c != null) {
                    C51238d.this.f127965c.mo101774a(C51294e.m110286b());
                    C51283b.m110256b(b, false);
                }
                return;
            }
            boolean z2 = true;
            if (bundle == null || bundle.getInt("RESPONSE_CODE", -1) != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("BUY_INTENT");
                    if (pendingIntent != null) {
                        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), 0, 0, 0);
                        C51238d.this.f127965c.mo101775b();
                        String str = C51238d.this.f127969g;
                        long j = C51238d.this.f127970h;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("params_for_special", "caijing_pay_casher");
                        hashMap2.put("app_id", b);
                        hashMap2.put("merchant_id", str);
                        hashMap2.put("amount", Long.valueOf(j).toString());
                        hashMap2.put("platform", "googlepay");
                        C51284c.m110260a("caijing_iap_charge_request", hashMap2);
                        C51283b.m110256b(b, true);
                        return;
                    }
                    throw new C51237c("pendingIntent from gp is null");
                } catch (SendIntentException e) {
                    throw new C51237c((Exception) e);
                } catch (C51237c unused) {
                    C51238d.this.f127965c.mo101774a(C51294e.m110283a(120, "fetch intent:exception"));
                    C51283b.m110256b(b, false);
                }
            } else {
                if (bundle == null || bundle.getInt("RESPONSE_CODE", -1) != 7) {
                    z2 = false;
                }
                if (z2) {
                    C51238d.this.f127964b.mo101783a(C51238d.this.f127967e, "inapp", (C51260f) new C51246h(C51238d.this, 0));
                    C51283b.m110256b(b, false);
                    return;
                }
                int i3 = bundle.getInt("RESPONSE_CODE", -1);
                if (i3 == -1) {
                    i2 = 3;
                } else {
                    i2 = i3 + 100;
                }
                C51238d.this.f127965c.mo101774a(C51294e.m110283a(i2, ""));
                C51283b.m110256b(b, false);
            }
        }

        /* synthetic */ C51242d(C51238d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$e */
    public interface C51243e {
        /* renamed from: a */
        void mo101773a();

        /* renamed from: a */
        void mo101774a(Bundle bundle);

        /* renamed from: b */
        void mo101775b();
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$f */
    class C51244f implements C51156c<JSONObject> {

        /* renamed from: b */
        private int f127981b;

        /* renamed from: c */
        private C51268j f127982c;

        /* renamed from: a */
        public final void mo101673a() {
            m110171a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), "");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo101674a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (C51238d.this.f127964b != null) {
                String b = C51292c.m110281b(C51238d.this.f127963a, "app_id", "");
                new C51220c();
                try {
                    C51221a a = C51220c.m110130a(jSONObject);
                    if (a.mo101797c()) {
                        C51238d.m110155a(C51238d.this, a, this.f127982c);
                        C51238d.this.f127964b.mo101782a(this.f127982c.f128026c, (C51258d) new C51245g(C51238d.this, 0));
                        C51283b.m110253a(b, true, true, this.f127981b + 1);
                        C51283b.m110258c(b, true);
                    } else if (a.mo101748b()) {
                        C51226a.m110139a(this.f127982c.f128028e, this.f127982c.f128027d);
                        C51238d.m110155a(C51238d.this, a, this.f127982c);
                        C51238d.this.f127965c.mo101774a(C51266h.m110205a(this.f127982c));
                        C51283b.m110253a(b, true, false, this.f127981b + 1);
                        C51283b.m110251a(b, true, "GooglePayModel");
                    } else {
                        m110171a(b, a.f128039h);
                    }
                } catch (JSONException unused) {
                    m110171a(b, "server error:json");
                }
            }
        }

        private C51244f(C51268j jVar) {
            this.f127982c = jVar;
        }

        /* renamed from: a */
        private void m110171a(String str, String str2) {
            this.f127981b++;
            if (this.f127981b < 5) {
                C51238d.m110156a(C51238d.this, this.f127982c, (C51156c) this);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                C51238d.this.f127965c.mo101774a(C51294e.m110288c());
            } else {
                C51238d.this.f127965c.mo101774a(C51294e.m110287b(str2));
            }
            C51283b.m110253a(str, true, false, this.f127981b + 1);
        }

        /* synthetic */ C51244f(C51238d dVar, C51268j jVar, byte b) {
            this(jVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$g */
    class C51245g implements C51258d {
        /* renamed from: a */
        public final void mo101776a() {
            C51238d.this.f127965c.mo101773a();
            C51283b.m110248a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), -1, true);
        }

        private C51245g() {
        }

        /* renamed from: a */
        public final void mo101777a(int i) {
            C51238d.this.f127965c.mo101773a();
            C51283b.m110248a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), i, true);
        }

        /* synthetic */ C51245g(C51238d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$h */
    class C51246h implements C51260f {
        private C51246h() {
        }

        /* renamed from: a */
        public final void mo101778a(int i) {
            C51238d.this.f127965c.mo101774a(C51294e.m110283a(i + 100, "unknow product"));
            C51283b.m110247a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), i);
        }

        /* renamed from: a */
        public final void mo101779a(C51268j jVar) {
            int i;
            if (jVar != null) {
                C51238d.this.mo101769a(jVar, C51238d.this.mo101767a(jVar));
                C51238d.this.mo101768a(jVar, (C51156c<JSONObject>) new C51247i<JSONObject>(C51238d.this, jVar, 0));
            } else {
                C51238d.this.f127965c.mo101774a(C51294e.m110283a(198, ""));
            }
            String b = C51292c.m110281b(C51238d.this.f127963a, "app_id", "");
            if (jVar != null) {
                i = jVar.f128024a;
            } else {
                i = -1;
            }
            C51283b.m110247a(b, i);
        }

        /* synthetic */ C51246h(C51238d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$i */
    class C51247i implements C51156c<JSONObject> {

        /* renamed from: b */
        private int f127986b;

        /* renamed from: c */
        private C51268j f127987c;

        /* renamed from: a */
        public final void mo101673a() {
            m110178a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), "network error");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo101674a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (C51238d.this.f127964b != null) {
                String b = C51292c.m110281b(C51238d.this.f127963a, "app_id", "");
                new C51220c();
                try {
                    C51221a a = C51220c.m110130a(jSONObject);
                    if (a.mo101748b()) {
                        C51226a.m110139a(this.f127987c.f128028e, this.f127987c.f128027d);
                        C51238d.m110155a(C51238d.this, a, this.f127987c);
                        C51238d.this.f127965c.mo101774a(C51266h.m110205a(this.f127987c));
                        C51283b.m110253a(b, false, false, this.f127986b + 1);
                        C51283b.m110251a(b, false, "GooglePayModel");
                    } else if (a.mo101747a()) {
                        C51238d.m110155a(C51238d.this, a, this.f127987c);
                        C51238d.this.f127964b.mo101782a(this.f127987c.f128026c, (C51258d) new C51248j(C51238d.this, 0));
                        C51283b.m110258c(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), false);
                        C51283b.m110253a(b, false, true, this.f127986b + 1);
                    } else {
                        m110178a(b, a.f128039h);
                    }
                } catch (JSONException unused) {
                    m110178a(b, "server error");
                }
            }
        }

        private C51247i(C51268j jVar) {
            this.f127987c = jVar;
        }

        /* renamed from: a */
        private void m110178a(String str, String str2) {
            this.f127986b++;
            if (this.f127986b < 5) {
                C51238d.m110156a(C51238d.this, this.f127987c, (C51156c) this);
                return;
            }
            C51238d.this.f127965c.mo101774a(C51294e.m110283a(196, str2));
            C51283b.m110253a(str, false, false, this.f127986b + 1);
        }

        /* synthetic */ C51247i(C51238d dVar, C51268j jVar, byte b) {
            this(jVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$j */
    class C51248j implements C51258d {
        /* renamed from: a */
        public final void mo101776a() {
            C51238d.this.f127965c.mo101774a(C51294e.m110283a(195, "consume last order failed"));
            C51283b.m110248a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), -1, false);
        }

        private C51248j() {
        }

        /* renamed from: a */
        public final void mo101777a(int i) {
            if (i == 0) {
                C51238d.this.f127964b.mo101784a(C51238d.this.f127967e, "inapp", C51266h.m110207a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), C51292c.m110281b(C51238d.this.f127963a, "uid", ""), C51238d.this.f127968f, C51238d.this.f127969g, C51238d.this.f127970h), new C51242d(C51238d.this, 0));
                String b = C51292c.m110281b(C51238d.this.f127963a, "app_id", "");
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", b);
                C51284c.m110260a("caijing_iap_google_restart_current_process", hashMap);
            } else {
                C51238d.this.f127965c.mo101774a(C51294e.m110283a(i + 100, ""));
            }
            C51283b.m110248a(C51292c.m110281b(C51238d.this.f127963a, "app_id", ""), i, false);
        }

        /* synthetic */ C51248j(C51238d dVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo101692a() {
        this.f127966d = true;
        if (this.f127964b != null) {
            this.f127964b.mo101780a();
            this.f127964b = null;
        }
        if (this.f127973k != null) {
            this.f127972j.removeCallbacks(this.f127973k);
            this.f127973k = null;
        }
    }

    public C51238d(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C51220c mo101767a(C51268j jVar) {
        String b = C51292c.m110281b(this.f127963a, "app_id", "");
        String b2 = C51292c.m110281b(this.f127963a, "uid", "");
        C51220c cVar = new C51220c();
        cVar.f127922e = b;
        cVar.f127918a = jVar.f128032i;
        cVar.f127921d = jVar.f128033j;
        cVar.f127924g = jVar.f128029f;
        cVar.f127925h = jVar.f128031h;
        cVar.f127923f = jVar.f128026c;
        cVar.f127920c = jVar.f128025b;
        cVar.f127919b = b2;
        cVar.f127926i = jVar.f128030g;
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101768a(C51268j jVar, C51156c<JSONObject> cVar) {
        C51219b bVar = new C51219b();
        try {
            bVar.mo101745a(mo101767a(jVar));
            C51154b.m110035a((C51157d<Result>) bVar).mo101670a(cVar);
        } catch (JSONException unused) {
            this.f127965c.mo101774a(C51294e.m110286b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101769a(C51268j jVar, C51220c cVar) {
        try {
            C51267i.m110215a(mo101695b(), jVar.f128026c, C51267i.m110212a(cVar.mo101796a()));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m110156a(C51238d dVar, C51268j jVar, C51156c cVar) {
        dVar.f127973k = new C51240b(dVar, jVar, cVar, 0);
        dVar.f127972j.postDelayed(dVar.f127973k, 2000);
    }

    /* renamed from: a */
    static /* synthetic */ void m110155a(C51238d dVar, C51221a aVar, C51268j jVar) {
        String b = C51292c.m110281b(dVar.f127963a, "app_id", "");
        if (aVar.mo101747a()) {
            C51267i.m110216a(dVar.mo101695b(), jVar.f128026c);
            C51283b.m110259d(b, true);
            return;
        }
        C51283b.m110259d(b, false);
    }

    /* renamed from: a */
    public final void mo101693a(int i, int i2, Bundle bundle) {
        C51268j jVar;
        boolean z;
        if (bundle == null) {
            this.f127965c.mo101774a(C51294e.m110283a(120, "handle result: data is null"));
            return;
        }
        String b = C51292c.m110281b(this.f127963a, "app_id", "");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (i == 1001) {
            try {
                int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
                if (i2 == -1 && intExtra == 0) {
                    String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
                    String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
                    if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                        throw new C51237c("purchaseData or dataSignature is null");
                    }
                    jVar = C51266h.m110206a(stringExtra, stringExtra2);
                } else {
                    StringBuilder sb = new StringBuilder("resultCode:");
                    sb.append(i2);
                    sb.append(",responseCode:");
                    sb.append(intExtra);
                    jVar = new C51269a().mo101795a(intExtra).f128037a;
                }
            } catch (C51237c unused) {
                this.f127965c.mo101774a(C51294e.m110283a(120, "google buy failed:exception"));
                C51282a.m110242a(C51292c.m110281b(this.f127963a, "app_id", ""), this.f127969g, this.f127970h, false, false);
                return;
            }
        } else {
            jVar = null;
        }
        if (jVar == null) {
            this.f127965c.mo101774a(C51294e.m110286b());
            return;
        }
        int i3 = jVar.f128024a;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", b);
        hashMap.put("resultCode", Integer.toString(i3));
        C51284c.m110260a("caijing_iap_google_page_result", hashMap);
        if (jVar.f128024a == 0) {
            String str = this.f127968f;
            String str2 = this.f127969g;
            long j = this.f127970h;
            jVar.f128025b = str;
            jVar.f128032i = str2;
            jVar.f128033j = j;
            mo101769a(jVar, mo101767a(jVar));
            mo101768a(jVar, (C51156c<JSONObject>) new C51244f<JSONObject>(this, jVar, 0));
            C51282a.m110242a(b, this.f127969g, this.f127970h, true, false);
        } else if (jVar.f128024a == 7) {
            this.f127965c.mo101774a(C51294e.m110283a(jVar.f128024a + 100, ""));
            C51282a.m110242a(b, this.f127969g, this.f127970h, false, false);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("app_id", b);
            C51284c.m110260a("caijing_iap_unconsumed_but_open_goole", hashMap2);
        } else {
            new StringBuilder("google buy failed:").append(jVar.f128024a);
            this.f127965c.mo101774a(C51294e.m110283a(jVar.f128024a + 100, ""));
            if (jVar.f128024a == 1) {
                z = true;
            } else {
                z = false;
            }
            C51282a.m110242a(b, this.f127969g, this.f127970h, false, z);
        }
    }
}

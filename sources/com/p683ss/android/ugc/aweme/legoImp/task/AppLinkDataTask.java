package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.applinks.C13604a;
import com.facebook.applinks.C13604a.C13606a;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.net.C37745b;
import com.p683ss.android.ugc.aweme.net.C37790j;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.trill.facebook.C50325a;
import com.p683ss.android.ugc.trill.facebook.FBAppLinksSetting;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppLinkDataTask */
public class AppLinkDataTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private void reTryRunTask(Context context) {
        try {
            C14533n.m29762a("1862952583919182");
            fetchDeferredAppLinkData(context);
        } catch (C14457k | NullPointerException e) {
            C9220a.m18312a(e, "fetchDeferredAppLinkData retry failed");
        }
    }

    private void safeRunTask(Context context) {
        try {
            fetchDeferredAppLinkData(context);
        } catch (C14457k | NullPointerException e) {
            C9220a.m18312a(e, "fetchDeferredAppLinkData first failed");
            reTryRunTask(context);
        }
    }

    public void run(Context context) {
        if (FBAppLinksSetting.isAppLinksEnable()) {
            safeRunTask(context);
        }
    }

    private void fetchDeferredAppLinkData(final Context context) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        C359311 r2 = new C13606a() {
            /* renamed from: a */
            public final void mo25458a(C13604a aVar) {
                String str;
                if (aVar != null) {
                    Bundle bundle = aVar.f35501d;
                    if (bundle != null) {
                        String string = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                        if (!TextUtils.isEmpty(string) && !C37165a.m83405b().mo76488a(string)) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("channel", "facebook");
                                jSONObject.put("url", string);
                                String str2 = "target";
                                if (aVar.f35499b == null) {
                                    str = "";
                                } else {
                                    str = aVar.f35499b.toString();
                                }
                                jSONObject.put(str2, str);
                                jSONObject.put("total_time", SystemClock.uptimeMillis() - C22574a.m55738f().f60707h);
                                jSONObject.put("fetch_time", SystemClock.uptimeMillis() - uptimeMillis);
                            } catch (JSONException unused) {
                            }
                            C9951d.m19997a("deep_link", jSONObject);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C19180e("facebook_code_start_url", string));
                            new C37745b(C50325a.f126208a, C37790j.POST, (List<C19180e>) arrayList, String.class).mo77238a();
                            Intent intent = new Intent(context, C23794bh.m58407u().mo46882a());
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(aVar.f35499b);
                            intent.putExtra("dl_from", "facebook");
                            intent.addFlags(268435456);
                            intent.putExtra("from_notification", false);
                            intent.putExtra("from_task", true);
                            context.startActivity(intent);
                        }
                    }
                }
            }
        };
        C14283ab.m29306a((Object) context, "context");
        C14283ab.m29306a((Object) r2, "completionHandler");
        String a = C14277aa.m29250a(context);
        C14283ab.m29306a((Object) a, "applicationId");
        C14533n.m29771e().execute(new Runnable(context.getApplicationContext(), a, r2) {

            /* renamed from: a */
            final /* synthetic */ Context f35503a;

            /* renamed from: b */
            final /* synthetic */ String f35504b;

            /* renamed from: c */
            final /* synthetic */ C13606a f35505c;

            /* JADX WARNING: Removed duplicated region for block: B:40:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:30:0x00aa] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r10 = this;
                    android.content.Context r0 = r10.f35503a
                    java.lang.String r1 = r10.f35504b
                    com.facebook.applinks.a$a r2 = r10.f35505c
                    org.json.JSONObject r3 = new org.json.JSONObject
                    r3.<init>()
                    java.lang.String r4 = "event"
                    java.lang.String r5 = "DEFERRED_APP_LINK"
                    r3.put(r4, r5)     // Catch:{ JSONException -> 0x00c6 }
                    com.facebook.internal.b r4 = com.facebook.internal.C14295b.m29331a(r0)     // Catch:{ JSONException -> 0x00c6 }
                    java.lang.String r5 = com.facebook.p909a.C13581g.m27416b(r0)     // Catch:{ JSONException -> 0x00c6 }
                    boolean r6 = com.facebook.C14533n.m29768b(r0)     // Catch:{ JSONException -> 0x00c6 }
                    com.facebook.internal.C14277aa.m29273a(r3, r4, r5, r6)     // Catch:{ JSONException -> 0x00c6 }
                    android.content.Context r4 = com.facebook.C14533n.m29773g()     // Catch:{ JSONException -> 0x00c6 }
                    com.facebook.internal.C14277aa.m29272a(r3, r4)     // Catch:{ JSONException -> 0x00c6 }
                    java.lang.String r4 = "application_package_name"
                    java.lang.String r0 = r0.getPackageName()     // Catch:{ JSONException -> 0x00c6 }
                    r3.put(r4, r0)     // Catch:{ JSONException -> 0x00c6 }
                    java.lang.String r0 = "%s/activities"
                    r4 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    r5 = 0
                    r4[r5] = r1
                    java.lang.String r0 = com.C2240a.m6772a(r0, r4)
                    r1 = 0
                    com.facebook.GraphRequest r0 = com.facebook.GraphRequest.m27266a(r1, r0, r3, r1)     // Catch:{ Exception -> 0x00c1 }
                    com.facebook.t r0 = r0.mo25312a()     // Catch:{ Exception -> 0x00c1 }
                    org.json.JSONObject r0 = r0.f38084b     // Catch:{ Exception -> 0x00c1 }
                    if (r0 == 0) goto L_0x00c1
                    java.lang.String r3 = "applink_args"
                    java.lang.String r3 = r0.optString(r3)     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r4 = "click_time"
                    r5 = -1
                    long r7 = r0.optLong(r4, r5)     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r4 = "applink_class"
                    java.lang.String r4 = r0.optString(r4)     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r9 = "applink_url"
                    java.lang.String r0 = r0.optString(r9)     // Catch:{ Exception -> 0x00c1 }
                    boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00c1 }
                    if (r9 != 0) goto L_0x00c1
                    com.facebook.applinks.a r3 = com.facebook.applinks.C13604a.m27471a(r3)     // Catch:{ Exception -> 0x00c1 }
                    int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r1 == 0) goto L_0x008e
                    org.json.JSONObject r1 = r3.f35500c     // Catch:{ JSONException -> 0x008d }
                    if (r1 == 0) goto L_0x007d
                    org.json.JSONObject r1 = r3.f35500c     // Catch:{ JSONException -> 0x008d }
                    java.lang.String r5 = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
                    r1.put(r5, r7)     // Catch:{ JSONException -> 0x008d }
                L_0x007d:
                    android.os.Bundle r1 = r3.f35501d     // Catch:{ JSONException -> 0x008d }
                    if (r1 == 0) goto L_0x008e
                    android.os.Bundle r1 = r3.f35501d     // Catch:{ JSONException -> 0x008d }
                    java.lang.String r5 = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
                    java.lang.String r6 = java.lang.Long.toString(r7)     // Catch:{ JSONException -> 0x008d }
                    r1.putString(r5, r6)     // Catch:{ JSONException -> 0x008d }
                    goto L_0x008e
                L_0x008d:
                L_0x008e:
                    if (r4 == 0) goto L_0x00a8
                    org.json.JSONObject r1 = r3.f35500c     // Catch:{ JSONException -> 0x00a7 }
                    if (r1 == 0) goto L_0x009b
                    org.json.JSONObject r1 = r3.f35500c     // Catch:{ JSONException -> 0x00a7 }
                    java.lang.String r5 = "com.facebook.platform.APPLINK_NATIVE_CLASS"
                    r1.put(r5, r4)     // Catch:{ JSONException -> 0x00a7 }
                L_0x009b:
                    android.os.Bundle r1 = r3.f35501d     // Catch:{ JSONException -> 0x00a7 }
                    if (r1 == 0) goto L_0x00a8
                    android.os.Bundle r1 = r3.f35501d     // Catch:{ JSONException -> 0x00a7 }
                    java.lang.String r5 = "com.facebook.platform.APPLINK_NATIVE_CLASS"
                    r1.putString(r5, r4)     // Catch:{ JSONException -> 0x00a7 }
                    goto L_0x00a8
                L_0x00a7:
                L_0x00a8:
                    if (r0 == 0) goto L_0x00c2
                    org.json.JSONObject r1 = r3.f35500c     // Catch:{ Exception -> 0x00c2, Exception -> 0x00c2 }
                    if (r1 == 0) goto L_0x00b5
                    org.json.JSONObject r1 = r3.f35500c     // Catch:{ Exception -> 0x00c2, Exception -> 0x00c2 }
                    java.lang.String r4 = "com.facebook.platform.APPLINK_NATIVE_URL"
                    r1.put(r4, r0)     // Catch:{ Exception -> 0x00c2, Exception -> 0x00c2 }
                L_0x00b5:
                    android.os.Bundle r1 = r3.f35501d     // Catch:{ Exception -> 0x00c2, Exception -> 0x00c2 }
                    if (r1 == 0) goto L_0x00c2
                    android.os.Bundle r1 = r3.f35501d     // Catch:{ Exception -> 0x00c2, Exception -> 0x00c2 }
                    java.lang.String r4 = "com.facebook.platform.APPLINK_NATIVE_URL"
                    r1.putString(r4, r0)     // Catch:{ Exception -> 0x00c2, Exception -> 0x00c2 }
                    goto L_0x00c2
                L_0x00c1:
                    r3 = r1
                L_0x00c2:
                    r2.mo25458a(r3)
                    return
                L_0x00c6:
                    r0 = move-exception
                    com.facebook.k r1 = new com.facebook.k
                    java.lang.String r2 = "An error occurred while preparing deferred app link"
                    r1.<init>(r2, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.applinks.C13604a.C136051.run():void");
            }

            {
                this.f35503a = r1;
                this.f35504b = r2;
                this.f35505c = r3;
            }
        });
    }
}

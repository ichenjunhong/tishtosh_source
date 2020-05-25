package com.facebook.p909a.p910a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.facebook.C14533n;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.a.a.e */
public class C13534e {

    /* renamed from: a */
    public static final String f35336a = C13534e.class.getCanonicalName();

    /* renamed from: f */
    private static C13534e f35337f;

    /* renamed from: b */
    public final Handler f35338b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public WeakReference<Activity> f35339c;

    /* renamed from: d */
    public Timer f35340d;

    /* renamed from: e */
    public String f35341e = null;

    /* renamed from: com.facebook.a.a.e$a */
    static class C13539a implements Callable<String> {

        /* renamed from: a */
        private WeakReference<View> f35347a;

        public final /* synthetic */ Object call() throws Exception {
            View view = (View) this.f35347a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }

        C13539a(View view) {
            this.f35347a = new WeakReference<>(view);
        }
    }

    /* renamed from: a */
    public final void mo25355a() {
        final C135351 r0 = new TimerTask() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0079 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    com.facebook.a.a.e r0 = com.facebook.p909a.p910a.C13534e.this     // Catch:{ Exception -> 0x008c }
                    java.lang.ref.WeakReference<android.app.Activity> r0 = r0.f35339c     // Catch:{ Exception -> 0x008c }
                    java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x008c }
                    android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x008c }
                    if (r0 != 0) goto L_0x000d
                    return
                L_0x000d:
                    java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x008c }
                    java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x008c }
                    android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x008c }
                    android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x008c }
                    android.view.View r0 = r0.getRootView()     // Catch:{ Exception -> 0x008c }
                    java.lang.Boolean r2 = com.facebook.p909a.p910a.C13524b.f35307f     // Catch:{ Exception -> 0x008c }
                    boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x008c }
                    if (r2 != 0) goto L_0x002a
                    return
                L_0x002a:
                    boolean r2 = com.facebook.internal.C14346r.m29405a()     // Catch:{ Exception -> 0x008c }
                    if (r2 == 0) goto L_0x003a
                    java.lang.String r0 = "UnityFacebookSDKPlugin"
                    java.lang.String r1 = "CaptureViewHierarchy"
                    java.lang.String r2 = ""
                    com.facebook.p909a.p910a.p911a.C13522d.m27331a(r0, r1, r2)     // Catch:{ Exception -> 0x008c }
                    return
                L_0x003a:
                    java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x008c }
                    com.facebook.a.a.e$a r3 = new com.facebook.a.a.e$a     // Catch:{ Exception -> 0x008c }
                    r3.<init>(r0)     // Catch:{ Exception -> 0x008c }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x008c }
                    com.facebook.a.a.e r3 = com.facebook.p909a.p910a.C13534e.this     // Catch:{ Exception -> 0x008c }
                    android.os.Handler r3 = r3.f35338b     // Catch:{ Exception -> 0x008c }
                    r3.post(r2)     // Catch:{ Exception -> 0x008c }
                    java.lang.String r3 = ""
                    r4 = 1
                    java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0058 }
                    java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x0058 }
                    java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0058 }
                    goto L_0x0059
                L_0x0058:
                    r2 = r3
                L_0x0059:
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                    r3.<init>()     // Catch:{ Exception -> 0x008c }
                    java.lang.String r4 = "screenname"
                    r3.put(r4, r1)     // Catch:{ JSONException -> 0x0079 }
                    java.lang.String r1 = "screenshot"
                    r3.put(r1, r2)     // Catch:{ JSONException -> 0x0079 }
                    org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0079 }
                    r1.<init>()     // Catch:{ JSONException -> 0x0079 }
                    org.json.JSONObject r0 = com.facebook.p909a.p910a.p911a.C13523e.m27333a(r0)     // Catch:{ JSONException -> 0x0079 }
                    r1.put(r0)     // Catch:{ JSONException -> 0x0079 }
                    java.lang.String r0 = "view"
                    r3.put(r0, r1)     // Catch:{ JSONException -> 0x0079 }
                L_0x0079:
                    java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x008c }
                    com.facebook.a.a.e r1 = com.facebook.p909a.p910a.C13534e.this     // Catch:{ Exception -> 0x008c }
                    java.util.concurrent.Executor r2 = com.facebook.C14533n.m29771e()     // Catch:{ Exception -> 0x008c }
                    com.facebook.a.a.e$3 r3 = new com.facebook.a.a.e$3     // Catch:{ Exception -> 0x008c }
                    r3.<init>(r0)     // Catch:{ Exception -> 0x008c }
                    r2.execute(r3)     // Catch:{ Exception -> 0x008c }
                    return
                L_0x008c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.p909a.p910a.C13534e.C135351.run():void");
            }
        };
        C14533n.m29771e().execute(new Runnable() {
            public final void run() {
                try {
                    if (C13534e.this.f35340d != null) {
                        C13534e.this.f35340d.cancel();
                    }
                    C13534e.this.f35341e = null;
                    C13534e.this.f35340d = new Timer();
                    C13534e.this.f35340d.scheduleAtFixedRate(r0, 0, 1000);
                } catch (Exception unused) {
                }
            }
        });
    }

    public C13534e(Activity activity) {
        this.f35339c = new WeakReference<>(activity);
        f35337f = this;
    }
}

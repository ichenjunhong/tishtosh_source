package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.common.p1037d.C15377d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.uk */
public final class C16293uk implements C16297uo {

    /* renamed from: a */
    private static final Object f45679a = new Object();

    /* renamed from: b */
    private static C16297uo f45680b = null;

    /* renamed from: c */
    private static C16297uo f45681c = null;

    /* renamed from: d */
    private final Object f45682d;

    /* renamed from: e */
    private final Context f45683e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f45684f;

    /* renamed from: g */
    private final ExecutorService f45685g;

    /* renamed from: h */
    private final zzbgz f45686h;

    /* renamed from: a */
    public static C16297uo m38892a(Context context) {
        synchronized (f45679a) {
            if (f45680b == null) {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44425e)).booleanValue()) {
                    f45680b = new C16293uk(context);
                } else {
                    f45680b = new C16298up();
                }
            }
        }
        return f45680b;
    }

    /* renamed from: a */
    public static C16297uo m38893a(Context context, zzbgz zzbgz) {
        synchronized (f45679a) {
            if (f45681c == null) {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44425e)).booleanValue()) {
                    C16293uk ukVar = new C16293uk(context, zzbgz);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (ukVar.f45682d) {
                            ukVar.f45684f.put(thread, Boolean.valueOf(true));
                        }
                        thread.setUncaughtExceptionHandler(new C16295um(ukVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C16294ul(ukVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f45681c = ukVar;
                } else {
                    f45681c = new C16298up();
                }
            }
        }
        return f45681c;
    }

    private C16293uk(Context context) {
        this(context, zzbgz.m39278a());
    }

    private C16293uk(Context context, zzbgz zzbgz) {
        this.f45682d = new Object();
        this.f45684f = new WeakHashMap<>();
        this.f45685g = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f45683e = context;
        this.f45686h = zzbgz;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31421a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0042
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0036
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.aes.m32762b(r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0033
            r6 = 1
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = ""
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.mo31423a(r11, r10, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16293uk.mo31421a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo31422a(Throwable th, String str) {
        mo31423a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo31423a(Throwable th, String str, float f) {
        if (aes.m32753a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            avx.m34243a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m38891a(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.f45685g.submit(new C16296un(this, new afg(), (String) obj));
                }
            }
        }
    }

    /* renamed from: a */
    private final Builder m38891a(String str, String str2, String str3, int i) {
        boolean z;
        try {
            z = C15377d.m31951a(this.f45683e).mo28319a();
        } catch (Throwable th) {
            afc.m32793b("Error fetching instant app info", th);
            z = false;
        }
        String str4 = "unknown";
        try {
            str4 = this.f45683e.getPackageName();
        } catch (Throwable unused) {
            afc.m32798e("Cannot obtain package name, proceeding.");
        }
        Builder appendQueryParameter = new Builder().scheme(WebKitApi.SCHEME_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT));
        String str5 = "device";
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (!str7.startsWith(str6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 1 + String.valueOf(str7).length());
            sb.append(str6);
            sb.append(" ");
            sb.append(str7);
            str7 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter(str5, str7).appendQueryParameter("js", this.f45686h.f46237a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", C15740bx.m36940a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "235029740").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", caf.m37100e()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(caf.m37099d().mo30717a(C15740bx.f44341cV)));
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.measurement.C15044a;
import com.google.android.gms.common.C15384g;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@C16299uq
public final class aad {

    /* renamed from: a */
    public final AtomicReference<Object> f40050a = new AtomicReference<>(null);

    /* renamed from: b */
    public final AtomicReference<C15044a> f40051b = new AtomicReference<>(null);

    /* renamed from: c */
    public final BlockingQueue<FutureTask<?>> f40052c = new ArrayBlockingQueue(50);

    /* renamed from: d */
    private final AtomicReference<ThreadPoolExecutor> f40053d = new AtomicReference<>(null);

    /* renamed from: e */
    private final Object f40054e = new Object();

    /* renamed from: f */
    private String f40055f = null;

    /* renamed from: g */
    private String f40056g = null;

    /* renamed from: h */
    private final AtomicBoolean f40057h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicInteger f40058i = new AtomicInteger(-1);

    /* renamed from: j */
    private final AtomicReference<Object> f40059j = new AtomicReference<>(null);

    /* renamed from: k */
    private final ConcurrentMap<String, Method> f40060k = new ConcurrentHashMap(9);

    /* renamed from: a */
    public final boolean mo28557a(Context context) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44245af)).booleanValue() || this.f40057h.get()) {
            return false;
        }
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44255ap)).booleanValue()) {
            return true;
        }
        if (this.f40058i.get() == -1) {
            if (aes.m32765c(context, C15384g.f39685b) || !aes.m32761b(context)) {
                this.f40058i.set(1);
            } else {
                abv.m32798e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                this.f40058i.set(0);
            }
        }
        if (this.f40058i.get() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m32401b(Context context) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44252am)).booleanValue()) {
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44253an)).booleanValue()) {
                return false;
            }
        }
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44254ao)).booleanValue()) {
            return true;
        }
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo28553a(Context context, String str) {
        if (mo28557a(context)) {
            if (m32401b(context)) {
                mo28556a("beginAdUnitExposure", (aau) new aae(str));
            } else {
                m32400a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: b */
    public final void mo28559b(Context context, String str) {
        if (mo28557a(context)) {
            if (m32401b(context)) {
                mo28556a("endAdUnitExposure", (aau) new aag(str));
            } else {
                m32400a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* renamed from: c */
    public final String mo28560c(Context context) {
        if (!mo28557a(context)) {
            return "";
        }
        if (m32401b(context)) {
            return (String) mo28552a("getCurrentScreenNameOrScreenClass", (T) "", aak.f40069a);
        }
        if (!mo28558a(context, "com.google.android.gms.measurement.AppMeasurement", this.f40059j, true)) {
            return "";
        }
        try {
            String str = (String) m32404h(context, "getCurrentScreenName").invoke(this.f40059j.get(), new Object[0]);
            if (str == null) {
                str = (String) m32404h(context, "getCurrentScreenClass").invoke(this.f40059j.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            mo28555a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: d */
    public final String mo28562d(Context context) {
        if (!mo28557a(context)) {
            return null;
        }
        synchronized (this.f40054e) {
            if (this.f40055f != null) {
                String str = this.f40055f;
                return str;
            }
            if (m32401b(context)) {
                this.f40055f = (String) mo28552a("getGmpAppId", (T) this.f40055f, aam.f40072a);
            } else {
                this.f40055f = (String) mo28551a("getGmpAppId", context);
            }
            String str2 = this.f40055f;
            return str2;
        }
    }

    /* renamed from: e */
    public final String mo28564e(Context context) {
        if (!mo28557a(context)) {
            return null;
        }
        long longValue = ((Long) caf.m37099d().mo30717a(C15740bx.f44250ak)).longValue();
        if (m32401b(context)) {
            if (longValue >= 0) {
                return (String) m32399a().submit(new aao(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) mo28552a("getAppInstanceId", (T) null, aan.f40073a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) mo28551a("getAppInstanceId", context);
        } else {
            try {
                return (String) m32399a().submit(new aap(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* renamed from: f */
    public final String mo28566f(Context context) {
        if (!mo28557a(context)) {
            return null;
        }
        if (m32401b(context)) {
            Long l = (Long) mo28552a("getAdEventId", (T) null, aaq.f40077a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object a = mo28551a("generateEventId", context);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo28568g(Context context) {
        if (!mo28557a(context)) {
            return null;
        }
        synchronized (this.f40054e) {
            if (this.f40056g != null) {
                String str = this.f40056g;
                return str;
            }
            if (m32401b(context)) {
                this.f40056g = (String) mo28552a("getAppIdOrigin", (T) this.f40056g, aar.f40078a);
            } else {
                this.f40056g = "fa";
            }
            String str2 = this.f40056g;
            return str2;
        }
    }

    /* renamed from: c */
    public final void mo28561c(Context context, String str) {
        mo28554a(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: d */
    public final void mo28563d(Context context, String str) {
        mo28554a(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: e */
    public final void mo28565e(Context context, String str) {
        mo28554a(context, "_aq", str, (Bundle) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28554a(Context context, String str, String str2, Bundle bundle) {
        if (mo28557a(context)) {
            Bundle a = m32398a(str2, str);
            if (bundle != null) {
                a.putAll(bundle);
            }
            if (m32401b(context)) {
                mo28556a("logEventInternal", (aau) new aah(str, a));
            } else if (mo28558a(context, "com.google.android.gms.measurement.AppMeasurement", this.f40059j, true)) {
                Method h = m32403h(context);
                try {
                    h.invoke(this.f40059j.get(), new Object[]{"am", str, a});
                } catch (Exception e) {
                    mo28555a(e, "logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: a */
    private static Bundle m32398a(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String str3 = "Invalid event ID: ";
            String valueOf = String.valueOf(str);
            abv.m32793b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: h */
    private final Method m32403h(Context context) {
        Method method = (Method) this.f40060k.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f40060k.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            mo28555a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: g */
    private final Method m32402g(Context context, String str) {
        Method method = (Method) this.f40060k.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f40060k.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            mo28555a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m32404h(Context context, String str) {
        Method method = (Method) this.f40060k.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f40060k.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            mo28555a(e, str, false);
            return null;
        }
    }

    /* renamed from: f */
    public final Method mo28567f(Context context, String str) {
        Method method = (Method) this.f40060k.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f40060k.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            mo28555a(e, str, false);
            return null;
        }
    }

    /* renamed from: a */
    private final void m32400a(Context context, String str, String str2) {
        if (mo28558a(context, "com.google.android.gms.measurement.AppMeasurement", this.f40059j, true)) {
            Method g = m32402g(context, str2);
            try {
                g.invoke(this.f40059j.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                abv.m32494a(sb.toString());
            } catch (Exception e) {
                mo28555a(e, str2, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo28551a(String str, Context context) {
        if (!mo28558a(context, "com.google.android.gms.measurement.AppMeasurement", this.f40059j, true)) {
            return null;
        }
        try {
            return m32404h(context, str).invoke(this.f40059j.get(), new Object[0]);
        } catch (Exception e) {
            mo28555a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo28555a(Exception exc, String str, boolean z) {
        if (!this.f40057h.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            abv.m32798e(sb.toString());
            if (z) {
                abv.m32798e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f40057h.set(true);
            }
        }
    }

    /* renamed from: a */
    private final ThreadPoolExecutor m32399a() {
        if (this.f40053d.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.f40053d;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) caf.m37099d().mo30717a(C15740bx.f44251al)).intValue(), ((Integer) caf.m37099d().mo30717a(C15740bx.f44251al)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new aas(this));
            atomicReference.compareAndSet(null, threadPoolExecutor);
        }
        return (ThreadPoolExecutor) this.f40053d.get();
    }

    /* renamed from: a */
    public final boolean mo28558a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception e) {
                mo28555a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo28556a(String str, aau aau) {
        synchronized (this.f40051b) {
            FutureTask futureTask = new FutureTask(new aai(this, aau, str), null);
            if (this.f40051b.get() != null) {
                futureTask.run();
            } else {
                this.f40052c.offer(futureTask);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo28552a(String str, T t, aat<T> aat) {
        synchronized (this.f40051b) {
            if (((C15044a) this.f40051b.get()) != null) {
                try {
                    T a = aat.mo28574a((C15044a) this.f40051b.get());
                    return a;
                } catch (Exception e) {
                    mo28555a(e, str, false);
                    return t;
                }
            }
        }
    }
}

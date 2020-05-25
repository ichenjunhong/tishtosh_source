package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15526q;
import com.google.android.gms.measurement.internal.C17122h.C17123a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.eu */
public final class C17110eu extends C17028bu {

    /* renamed from: a */
    public C17112ew f48313a = C17111ev.f48316a;

    /* renamed from: b */
    private Boolean f48314b;

    /* renamed from: c */
    private Boolean f48315c;

    C17110eu(C17005ay ayVar) {
        super(ayVar);
        C17122h.f48396g = ayVar;
    }

    /* renamed from: d */
    static String m41770d() {
        return (String) C17122h.f48399j.mo33351b();
    }

    /* renamed from: a */
    public final int mo33272a(String str) {
        return mo33275b(str, C17122h.f48413x);
    }

    /* renamed from: e */
    public final boolean mo33281e() {
        if (this.f48315c == null) {
            synchronized (this) {
                if (this.f48315c == null) {
                    ApplicationInfo applicationInfo = mo32850m().getApplicationInfo();
                    String a = C15526q.m32305a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f48315c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f48315c == null) {
                        this.f48315c = Boolean.TRUE;
                        mo32854q().f48445b.mo33376a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f48315c.booleanValue();
    }

    /* renamed from: a */
    public final long mo33273a(String str, C17123a<Long> aVar) {
        if (str == null) {
            return ((Long) aVar.mo33351b()).longValue();
        }
        String a = this.f48313a.mo32896a(str, aVar.f48416a);
        if (TextUtils.isEmpty(a)) {
            return ((Long) aVar.mo33351b()).longValue();
        }
        try {
            return ((Long) aVar.mo33350a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) aVar.mo33351b()).longValue();
        }
    }

    /* renamed from: b */
    public final int mo33275b(String str, C17123a<Integer> aVar) {
        if (str == null) {
            return ((Integer) aVar.mo33351b()).intValue();
        }
        String a = this.f48313a.mo32896a(str, aVar.f48416a);
        if (TextUtils.isEmpty(a)) {
            return ((Integer) aVar.mo33351b()).intValue();
        }
        try {
            return ((Integer) aVar.mo33350a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) aVar.mo33351b()).intValue();
        }
    }

    /* renamed from: c */
    public final boolean mo33278c(String str, C17123a<Boolean> aVar) {
        if (str == null) {
            return ((Boolean) aVar.mo33351b()).booleanValue();
        }
        String a = this.f48313a.mo32896a(str, aVar.f48416a);
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) aVar.mo33351b()).booleanValue();
        }
        return ((Boolean) aVar.mo33350a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo33280d(String str, C17123a<Boolean> aVar) {
        return mo33278c(str, aVar);
    }

    /* renamed from: a */
    public final boolean mo33274a(C17123a<Boolean> aVar) {
        return mo33278c(null, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Boolean mo33276b(String str) {
        C15464q.m32125a(str);
        try {
            if (mo32850m().getPackageManager() == null) {
                mo32854q().f48445b.mo33376a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C15377d.m31951a(mo32850m()).mo28318a(mo32850m().getPackageName(), 128);
            if (a == null) {
                mo32854q().f48445b.mo33376a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                mo32854q().f48445b.mo33376a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (NameNotFoundException e) {
            mo32854q().f48445b.mo33377a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo33283f() {
        Boolean b = mo33276b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: g */
    public final Boolean mo33285g() {
        return mo33276b("firebase_analytics_collection_enabled");
    }

    /* renamed from: h */
    public static long m41771h() {
        return ((Long) C17122h.f48349M.mo33351b()).longValue();
    }

    /* renamed from: i */
    public static long m41772i() {
        return ((Long) C17122h.f48402m.mo33351b()).longValue();
    }

    /* renamed from: j */
    public final String mo33289j() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            mo32854q().f48445b.mo33377a("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            mo32854q().f48445b.mo33377a("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            mo32854q().f48445b.mo33377a("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo32854q().f48445b.mo33377a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: t */
    public static boolean m41773t() {
        return ((Boolean) C17122h.f48398i.mo33351b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo33277c(String str) {
        return "1".equals(this.f48313a.mo32896a(str, "gaia_collection_enabled"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo33279d(String str) {
        return mo33278c(str, C17122h.f48359W);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo33282e(String str) {
        return mo33278c(str, C17122h.f48366ab);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo33284f(String str) {
        return mo33278c(str, C17122h.f48368ad);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo33286g(String str) {
        return mo33278c(str, C17122h.f48372ah);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo33293u() {
        if (this.f48314b == null) {
            this.f48314b = mo33276b("app_measurement_lite");
            if (this.f48314b == null) {
                this.f48314b = Boolean.valueOf(false);
            }
        }
        if (this.f48314b.booleanValue() || !this.f48052r.f47965d) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    static boolean m41774v() {
        return ((Boolean) C17122h.f48373ai.mo33351b()).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo33287h(String str) {
        return mo33278c(str, C17122h.f48374aj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo33288i(String str) {
        return mo33278c(str, C17122h.f48375ak);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo33290j(String str) {
        return mo33278c(str, C17122h.f48376al);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo33291k(String str) {
        return mo33278c(str, C17122h.f48377am);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo33292l(String str) {
        return mo33278c(str, C17122h.f48379ao);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}

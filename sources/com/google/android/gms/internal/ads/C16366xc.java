package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15518i;
import com.google.android.gms.common.util.C15524o;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.xc */
public final class C16366xc {

    /* renamed from: A */
    private int f45925A;

    /* renamed from: B */
    private String f45926B;

    /* renamed from: C */
    private boolean f45927C;

    /* renamed from: a */
    private int f45928a;

    /* renamed from: b */
    private boolean f45929b;

    /* renamed from: c */
    private boolean f45930c;

    /* renamed from: d */
    private int f45931d;

    /* renamed from: e */
    private int f45932e;

    /* renamed from: f */
    private int f45933f;

    /* renamed from: g */
    private String f45934g;

    /* renamed from: h */
    private int f45935h;

    /* renamed from: i */
    private int f45936i;

    /* renamed from: j */
    private int f45937j;

    /* renamed from: k */
    private boolean f45938k;

    /* renamed from: l */
    private int f45939l;

    /* renamed from: m */
    private double f45940m;

    /* renamed from: n */
    private boolean f45941n;

    /* renamed from: o */
    private String f45942o;

    /* renamed from: p */
    private String f45943p;

    /* renamed from: q */
    private boolean f45944q;

    /* renamed from: r */
    private boolean f45945r;

    /* renamed from: s */
    private String f45946s;

    /* renamed from: t */
    private boolean f45947t;

    /* renamed from: u */
    private final boolean f45948u;

    /* renamed from: v */
    private boolean f45949v;

    /* renamed from: w */
    private String f45950w;

    /* renamed from: x */
    private String f45951x;

    /* renamed from: y */
    private float f45952y;

    /* renamed from: z */
    private int f45953z;

    public C16366xc(Context context) {
        PackageManager packageManager = context.getPackageManager();
        m38991a(context);
        m38992b(context);
        m38993c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f45944q = m38989a(packageManager, "geo:0,0?q=donuts") != null;
        this.f45945r = m38989a(packageManager, "http://www.google.com") != null;
        this.f45946s = locale.getCountry();
        this.f45947t = aes.m32757a();
        if (C15518i.f39987a == null) {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2.hasSystemFeature("com.google.android.feature.services_updater") && packageManager2.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            C15518i.f39987a = Boolean.valueOf(z);
        }
        this.f45948u = C15518i.f39987a.booleanValue();
        this.f45949v = C15518i.m32286c(context);
        this.f45950w = locale.getLanguage();
        this.f45951x = m38990a(context, packageManager);
        this.f45926B = m38994d(context);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f45952y = displayMetrics.density;
                this.f45953z = displayMetrics.widthPixels;
                this.f45925A = displayMetrics.heightPixels;
            }
        }
    }

    public C16366xc(Context context, C16365xb xbVar) {
        m38991a(context);
        m38992b(context);
        m38993c(context);
        this.f45942o = Build.FINGERPRINT;
        this.f45943p = Build.DEVICE;
        this.f45927C = C15524o.m32293a() && C15817cv.m37169a(context);
        this.f45944q = xbVar.f45900b;
        this.f45945r = xbVar.f45901c;
        this.f45946s = xbVar.f45903e;
        this.f45947t = xbVar.f45904f;
        this.f45948u = xbVar.f45905g;
        this.f45949v = xbVar.f45906h;
        this.f45950w = xbVar.f45909k;
        this.f45951x = xbVar.f45910l;
        this.f45926B = xbVar.f45911m;
        this.f45952y = xbVar.f45918t;
        this.f45953z = xbVar.f45919u;
        this.f45925A = xbVar.f45920v;
    }

    /* renamed from: a */
    private final void m38991a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f45928a = audioManager.getMode();
                this.f45929b = audioManager.isMusicActive();
                this.f45930c = audioManager.isSpeakerphoneOn();
                this.f45931d = audioManager.getStreamVolume(3);
                this.f45932e = audioManager.getRingerMode();
                this.f45933f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C14963ax.m30834d().mo28588a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f45928a = -2;
        this.f45929b = false;
        this.f45930c = false;
        this.f45931d = 0;
        this.f45932e = 2;
        this.f45933f = 0;
    }

    /* renamed from: b */
    private final void m38992b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f45934g = telephonyManager.getNetworkOperator();
        this.f45936i = telephonyManager.getNetworkType();
        this.f45937j = telephonyManager.getPhoneType();
        this.f45935h = -2;
        this.f45938k = false;
        this.f45939l = -1;
        if (acd.m32590a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo a = C16367xd.m38996a(connectivityManager);
            if (a != null) {
                this.f45935h = a.getType();
                this.f45939l = a.getDetailedState().ordinal();
            } else {
                this.f45935h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f45938k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m38993c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f45940m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f45941n = z;
            return;
        }
        this.f45940m = -1.0d;
        this.f45941n = false;
    }

    /* renamed from: d */
    private static String m38994d(Context context) {
        try {
            PackageInfo b = C15377d.m31951a(context).mo28321b("com.android.vending", 128);
            if (b == null) {
                return null;
            }
            int i = b.versionCode;
            String str = b.packageName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m38990a(Context context, PackageManager packageManager) {
        ResolveInfo a = m38989a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null) {
            return null;
        }
        ActivityInfo activityInfo = a.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo b = C15377d.m31951a(context).mo28321b(activityInfo.packageName, 0);
            if (b == null) {
                return null;
            }
            int i = b.versionCode;
            String str = activityInfo.packageName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
            sb.append(i);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str);
            return sb.toString();
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static ResolveInfo m38989a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C14963ax.m30834d().mo28588a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    public final C16365xb mo31464a() {
        C16365xb xbVar = new C16365xb(this.f45928a, this.f45944q, this.f45945r, this.f45934g, this.f45946s, this.f45947t, this.f45948u, this.f45949v, this.f45929b, this.f45930c, this.f45950w, this.f45951x, this.f45926B, this.f45931d, this.f45935h, this.f45936i, this.f45937j, this.f45932e, this.f45933f, this.f45952y, this.f45953z, this.f45925A, this.f45940m, this.f45941n, this.f45938k, this.f45939l, this.f45942o, this.f45927C, this.f45943p);
        return xbVar;
    }
}

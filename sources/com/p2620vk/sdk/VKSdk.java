package com.p2620vk.sdk;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p2620vk.sdk.api.C52351b;
import com.p2620vk.sdk.api.C52354e;
import com.p2620vk.sdk.api.C52354e.C52359a;
import com.p2620vk.sdk.api.C52360f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.vk.sdk.VKSdk */
public class VKSdk {

    /* renamed from: a */
    static int f130275a = 0;

    /* renamed from: b */
    public static ArrayList<String> f130276b;

    /* renamed from: c */
    public static final List<Object> f130277c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private static Handler f130278d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private static VKSdk f130279f = null;

    /* renamed from: g */
    private static boolean f130280g = false;

    /* renamed from: h */
    private static String f130281h;

    /* renamed from: i */
    private static volatile C52318b f130282i;

    /* renamed from: e */
    private final Context f130283e;

    /* renamed from: com.vk.sdk.VKSdk$a */
    static class C52317a {

        /* renamed from: a */
        public C52322a f130289a;

        /* renamed from: b */
        public C52322a f130290b;

        /* renamed from: c */
        public C52351b f130291c;

        public C52317a(C52322a aVar) {
            this.f130289a = aVar;
        }

        public C52317a(C52351b bVar) {
            this.f130291c = bVar;
        }

        public C52317a(C52322a aVar, C52322a aVar2) {
            this.f130289a = aVar2;
            this.f130290b = aVar;
        }
    }

    /* renamed from: com.vk.sdk.VKSdk$b */
    public enum C52318b {
        Unknown,
        LoggedOut,
        Pending,
        LoggedIn
    }

    /* renamed from: a */
    public static boolean m111761a() {
        return f130280g;
    }

    /* renamed from: c */
    public static String m111768c() {
        return f130281h;
    }

    /* renamed from: b */
    public static boolean m111766b() {
        C52322a b = C52322a.m111781b();
        if (b == null || b.mo109136a()) {
            return false;
        }
        return true;
    }

    private VKSdk(Context context) {
        this.f130283e = context;
    }

    /* renamed from: a */
    public static boolean m111762a(Context context) {
        return m111767b(context, null);
    }

    /* renamed from: c */
    static void m111769c(Context context) {
        m111756a(context, null);
    }

    /* renamed from: b */
    public static void m111764b(Context context) {
        C52322a a = C52322a.m111778a(context, (C52322a) null);
        if (a != null) {
            m111759a(a, (C52322a) null);
        }
    }

    /* renamed from: a */
    static void m111760a(C52359a aVar) {
        C52354e eVar = new C52354e("stats.trackVisitor");
        eVar.f130366l = 0;
        eVar.mo109163a(aVar);
    }

    /* renamed from: a */
    private static int m111753a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 0);
    }

    /* renamed from: a */
    public static void m111756a(Context context, C52419b<C52318b> bVar) {
        C52421d.m111977a(context);
        if (C52322a.m111781b() != null) {
            m111758a(C52318b.LoggedIn, bVar);
        } else {
            m111758a(C52318b.LoggedOut, bVar);
        }
    }

    /* renamed from: b */
    private static boolean m111767b(final Context context, C52419b<C52318b> bVar) {
        final Context applicationContext = context.getApplicationContext();
        C52421d.m111977a(applicationContext);
        C52322a b = C52322a.m111781b();
        if (b == null || b.f130298a == null || b.mo109136a()) {
            m111756a(context, null);
            return false;
        }
        m111758a(C52318b.Pending, null);
        m111760a((C52359a) new C52359a(null) {
            /* renamed from: a */
            public final void mo109127a(C52360f fVar) {
                VKSdk.m111756a(context, null);
            }

            /* renamed from: a */
            public final void mo109126a(C52351b bVar) {
                if (!(bVar == null || bVar.f130348d == null || bVar.f130348d.f130350f != 5)) {
                    VKSdk.m111764b(applicationContext);
                }
                VKSdk.m111756a(context, null);
            }
        });
        return true;
    }

    /* renamed from: a */
    private static void m111758a(C52318b bVar, C52419b<C52318b> bVar2) {
        f130282i = bVar;
        if (bVar2 != null) {
            bVar2.mo23369a(f130282i);
        }
    }

    /* renamed from: a */
    static void m111759a(final C52322a aVar, final C52322a aVar2) {
        f130278d.post(new Runnable() {
            public final void run() {
                Iterator it = VKSdk.f130277c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: a */
    private static String m111755a(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    /* renamed from: b */
    private static void m111765b(Context context, String str, String str2) {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: a */
    public static VKSdk m111754a(Context context, int i, String str) {
        if (i == 0) {
            i = m111753a(context, "VK_SDK_APP_ID_PLEASE_DONT_TOUCH");
        }
        if (TextUtils.isEmpty(str)) {
            str = m111755a(context, "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH", "5.21");
        }
        if (i != 0) {
            f130280g = true;
            VKSdk b = m111763b(context, i, str);
            if (f130275a != 0) {
                m111757a(context, "VK_SDK_APP_ID_PLEASE_DONT_TOUCH", f130275a);
            }
            if (f130281h != null) {
                m111765b(context, "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH", f130281h);
            }
            return b;
        }
        throw new RuntimeException("your_app_id is 0");
    }

    /* renamed from: b */
    private static synchronized VKSdk m111763b(Context context, int i, String str) {
        VKSdk vKSdk;
        synchronized (VKSdk.class) {
            if (f130275a == 0) {
                f130279f = new VKSdk(context);
                f130275a = i;
                if (TextUtils.isEmpty(str)) {
                    str = "5.21";
                }
                f130281h = str;
                f130282i = C52318b.Unknown;
                m111762a(context);
            }
            vKSdk = f130279f;
        }
        return vKSdk;
    }

    /* renamed from: a */
    private static void m111757a(Context context, String str, int i) {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(str, i);
        edit.apply();
    }
}

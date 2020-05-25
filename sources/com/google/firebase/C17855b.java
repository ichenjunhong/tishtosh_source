package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import android.util.Log;
import com.C2240a;
import com.google.android.gms.common.api.internal.C15270b;
import com.google.android.gms.common.api.internal.C15270b.C15271a;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.C15466s;
import com.google.android.gms.common.util.C15526q;
import com.google.firebase.components.C17863a;
import com.google.firebase.components.C17863a.C178641;
import com.google.firebase.components.C17875k;
import com.google.firebase.components.C17877m;
import com.google.firebase.p1072a.C17847c;
import com.google.firebase.p1074c.C17862a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.google.firebase.b */
public class C17855b {

    /* renamed from: a */
    static final Map<String, C17855b> f49624a = new C0777a();

    /* renamed from: c */
    private static final List<String> f49625c = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: d */
    private static final List<String> f49626d = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: e */
    private static final List<String> f49627e = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: f */
    private static final List<String> f49628f = Arrays.asList(new String[0]);

    /* renamed from: g */
    private static final Set<String> f49629g = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Object f49630h = new Object();

    /* renamed from: i */
    private static final Executor f49631i = new C17858c(0);

    /* renamed from: b */
    final AtomicBoolean f49632b = new AtomicBoolean(false);

    /* renamed from: j */
    private final Context f49633j;

    /* renamed from: k */
    private final String f49634k;

    /* renamed from: l */
    private final C17885d f49635l;

    /* renamed from: m */
    private final C17877m f49636m;

    /* renamed from: n */
    private final SharedPreferences f49637n;

    /* renamed from: o */
    private final C17847c f49638o;

    /* renamed from: p */
    private final AtomicBoolean f49639p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicBoolean f49640q;

    /* renamed from: r */
    private final List<Object> f49641r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final List<Object> f49642s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private final List<Object> f49643t = new CopyOnWriteArrayList();

    /* renamed from: u */
    private C17856a f49644u;

    /* renamed from: com.google.firebase.b$a */
    public interface C17856a {
    }

    /* renamed from: com.google.firebase.b$b */
    static class C17857b implements C15271a {

        /* renamed from: a */
        static AtomicReference<C17857b> f49645a = new AtomicReference<>();

        C17857b() {
        }

        /* renamed from: a */
        public final void mo28197a(boolean z) {
            synchronized (C17855b.f49630h) {
                Iterator it = new ArrayList(C17855b.f49624a.values()).iterator();
                while (it.hasNext()) {
                    C17855b bVar = (C17855b) it.next();
                    if (bVar.f49632b.get()) {
                        C17855b.m43785a(bVar, z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.b$c */
    static class C17858c implements Executor {

        /* renamed from: a */
        private static final Handler f49646a = new Handler(Looper.getMainLooper());

        private C17858c() {
        }

        /* synthetic */ C17858c(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            f49646a.post(runnable);
        }
    }

    /* renamed from: com.google.firebase.b$d */
    static class C17859d extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C17859d> f49647a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f49648b;

        private C17859d(Context context) {
            this.f49648b = context;
        }

        /* renamed from: a */
        static /* synthetic */ void m43799a(Context context) {
            if (f49647a.get() == null) {
                C17859d dVar = new C17859d(context);
                if (f49647a.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C17855b.f49630h) {
                for (C17855b f : C17855b.f49624a.values()) {
                    f.mo34685f();
                }
            }
            this.f49648b.unregisterReceiver(this);
        }
    }

    /* renamed from: h */
    private String m43789h() {
        m43791j();
        return this.f49634k;
    }

    /* renamed from: a */
    public final Context mo34679a() {
        m43791j();
        return this.f49633j;
    }

    /* renamed from: b */
    public final C17885d mo34681b() {
        m43791j();
        return this.f49635l;
    }

    public int hashCode() {
        return this.f49634k.hashCode();
    }

    /* renamed from: j */
    private void m43791j() {
        C15464q.m32130a(!this.f49639p.get(), (Object) "FirebaseApp was deleted");
    }

    /* renamed from: d */
    public final boolean mo34682d() {
        m43791j();
        return this.f49640q.get();
    }

    /* renamed from: e */
    public final boolean mo34683e() {
        return "[DEFAULT]".equals(m43789h());
    }

    public String toString() {
        return C15462p.m32119a((Object) this).mo28449a(LeakCanaryFileProvider.f132049i, this.f49634k).mo28449a("options", this.f49635l).toString();
    }

    /* renamed from: c */
    public static C17855b m43787c() {
        C17855b bVar;
        synchronized (f49630h) {
            bVar = (C17855b) f49624a.get("[DEFAULT]");
            if (bVar == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(C15526q.m32305a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo34685f() {
        boolean c = C0726c.m2099c(this.f49633j);
        if (c) {
            C17859d.m43799a(this.f49633j);
        } else {
            this.f49636m.mo34707a(mo34683e());
        }
        m43786a(C17855b.class, this, f49625c, c);
        if (mo34683e()) {
            m43786a(C17855b.class, this, f49626d, c);
            m43786a(Context.class, this.f49633j, f49627e, c);
        }
    }

    /* renamed from: i */
    private boolean m43790i() {
        if (this.f49637n.contains("firebase_data_collection_default_enabled")) {
            return this.f49637n.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f49633j.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo a = C17861c.m43801a(packageManager, this.f49633j.getPackageName(), 128);
                if (!(a == null || a.metaData == null || !a.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return a.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    public final <T> T mo34680a(Class<T> cls) {
        m43791j();
        return this.f49636m.mo34699a((Class) cls);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17855b)) {
            return false;
        }
        return this.f49634k.equals(((C17855b) obj).m43789h());
    }

    /* renamed from: a */
    public static C17855b m43783a(Context context) {
        C17885d dVar;
        synchronized (f49630h) {
            if (f49624a.containsKey("[DEFAULT]")) {
                C17855b c = m43787c();
                return c;
            }
            C15466s sVar = new C15466s(context);
            String a = sVar.mo28451a("google_app_id");
            if (TextUtils.isEmpty(a)) {
                dVar = null;
            } else {
                dVar = new C17885d(a, sVar.mo28451a("google_api_key"), sVar.mo28451a("firebase_database_url"), sVar.mo28451a("ga_trackingId"), sVar.mo28451a("gcm_defaultSenderId"), sVar.mo28451a("google_storage_bucket"), sVar.mo28451a("project_id"));
            }
            if (dVar == null) {
                return null;
            }
            C17855b a2 = m43784a(context, dVar, "[DEFAULT]");
            return a2;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m43785a(C17855b bVar, boolean z) {
        Iterator it = bVar.f49642s.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private C17855b(Context context, String str, C17885d dVar) {
        this.f49633j = (Context) C15464q.m32123a(context);
        this.f49634k = C15464q.m32125a(str);
        this.f49635l = (C17885d) C15464q.m32123a(dVar);
        this.f49644u = new C17862a();
        this.f49637n = C35807d.m80935a(context, "com.google.firebase.common.prefs", 0);
        this.f49640q = new AtomicBoolean(m43790i());
        C178641 r8 = new Object(context, new C17875k(0)) {

            /* renamed from: a */
            public final T f49654a;

            /* renamed from: b */
            public final C17876l<T> f49655b;

            /* renamed from: a */
            private static Set<C17878n> m43808a(Set<C17878n> set) {
                HashSet hashSet = new HashSet();
                for (C17878n nVar : set) {
                    if (nVar.mo34708a()) {
                        hashSet.add(nVar);
                    }
                }
                return hashSet;
            }

            /* renamed from: a */
            public static List<C17868d> m43807a(List<String> list) {
                ArrayList arrayList = new ArrayList();
                for (String cls : list) {
                    try {
                        Class cls2 = Class.forName(cls);
                        if (C17868d.class.isAssignableFrom(cls2)) {
                            arrayList.add((C17868d) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }
                return arrayList;
            }

            /* renamed from: b */
            static List<C17863a<?>> m43809b(List<C17863a<?>> list) {
                HashMap hashMap = new HashMap(list.size());
                for (C17863a aVar : list) {
                    C17878n nVar = new C17878n(aVar);
                    Iterator it = aVar.f49649a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Class cls = (Class) it.next();
                            if (hashMap.put(cls, nVar) != null) {
                                throw new IllegalArgumentException(C2240a.m6772a("Multiple components provide %s.", new Object[]{cls}));
                            }
                        }
                    }
                }
                for (C17878n nVar2 : hashMap.values()) {
                    for (C17869e eVar : nVar2.f49669a.f49650b) {
                        if (eVar.mo34701a()) {
                            C17878n nVar3 = (C17878n) hashMap.get(eVar.f49661a);
                            if (nVar3 != null) {
                                nVar2.f49670b.add(nVar3);
                                nVar3.f49671c.add(nVar2);
                            }
                        }
                    }
                }
                HashSet<C17878n> hashSet = new HashSet<>(hashMap.values());
                Set a = m43808a((Set<C17878n>) hashSet);
                ArrayList arrayList = new ArrayList();
                while (!a.isEmpty()) {
                    C17878n nVar4 = (C17878n) a.iterator().next();
                    a.remove(nVar4);
                    arrayList.add(nVar4.f49669a);
                    for (C17878n nVar5 : nVar4.f49670b) {
                        nVar5.f49671c.remove(nVar4);
                        if (nVar5.mo34708a()) {
                            a.add(nVar5);
                        }
                    }
                }
                if (arrayList.size() == list.size()) {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (C17878n nVar6 : hashSet) {
                    if (!nVar6.mo34708a() && !nVar6.f49670b.isEmpty()) {
                        arrayList2.add(nVar6.f49669a);
                    }
                }
                throw new C17870f(arrayList2);
            }

            {
                this.f49654a = r1;
                this.f49655b = r2;
            }
        };
        List a = C178641.m43807a(r8.f49655b.mo34706a(r8.f49654a));
        this.f49636m = new C17877m(f49631i, a, C17863a.m43804a(context, Context.class, new Class[0]), C17863a.m43804a(this, C17855b.class, new Class[0]), C17863a.m43804a(dVar, C17885d.class, new Class[0]));
        this.f49638o = (C17847c) this.f49636m.mo34699a(C17847c.class);
    }

    /* renamed from: a */
    private static C17855b m43784a(Context context, C17885d dVar, String str) {
        C17855b bVar;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (C17857b.f49645a.get() == null) {
                C17857b bVar2 = new C17857b();
                if (C17857b.f49645a.compareAndSet(null, bVar2)) {
                    C15270b.m31653a(application);
                    C15270b.m31652a().mo28198a((C15271a) bVar2);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f49630h) {
            boolean z = !f49624a.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            C15464q.m32130a(z, (Object) sb.toString());
            C15464q.m32124a(context, (Object) "Application context cannot be null.");
            bVar = new C17855b(context, trim, dVar);
            f49624a.put(trim, bVar);
        }
        bVar.mo34685f();
        return bVar;
    }

    /* renamed from: a */
    private static <T> void m43786a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (f49628f.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (f49629g.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb.toString());
                    }
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb2.toString());
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    Log.wtf("FirebaseApp", "Failed to initialize ".concat(String.valueOf(str)), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }
}

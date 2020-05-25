package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C15333e;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C15538a;
import com.google.android.gms.measurement.p1047a.C16979a;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.cm */
public class C16596cm {

    /* renamed from: h */
    private static volatile C16596cm f46617h;

    /* renamed from: a */
    final String f46618a;

    /* renamed from: b */
    protected final C15514e f46619b;

    /* renamed from: c */
    public final C16979a f46620c;

    /* renamed from: d */
    Map<Object, Object> f46621d;

    /* renamed from: e */
    boolean f46622e;

    /* renamed from: f */
    public String f46623f;
    /* access modifiers changed from: 0000 */

    /* renamed from: g */
    public C16591ch f46624g;

    /* renamed from: i */
    private final ExecutorService f46625i;

    /* renamed from: j */
    private int f46626j;

    /* renamed from: com.google.android.gms.internal.measurement.cm$a */
    public class C16597a extends C16594ck {

        /* renamed from: a */
        private final AtomicReference<Bundle> f46627a = new AtomicReference<>();

        /* renamed from: b */
        private boolean f46628b;

        public C16597a() {
        }

        /* renamed from: a */
        public final void mo31892a(Bundle bundle) {
            synchronized (this.f46627a) {
                try {
                    this.f46627a.set(bundle);
                    this.f46628b = true;
                    this.f46627a.notify();
                } catch (Throwable th) {
                    this.f46627a.notify();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public final String mo31902a(long j) {
            return (String) mo31901a(mo31903b(j), String.class);
        }

        /* renamed from: b */
        public final Bundle mo31903b(long j) {
            Bundle bundle;
            synchronized (this.f46627a) {
                if (!this.f46628b) {
                    try {
                        this.f46627a.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = (Bundle) this.f46627a.get();
            }
            return bundle;
        }

        /* renamed from: a */
        public final <T> T mo31901a(Bundle bundle, Class<T> cls) {
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get("r");
            if (obj == null) {
                return null;
            }
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                C16596cm.this.mo31899a(5, "Unexpected object type. Expected, Received", (Object) cls.getCanonicalName(), (Object) obj.getClass().getCanonicalName(), (Object) e);
                throw e;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.cm$b */
    abstract class C16598b implements Runnable {

        /* renamed from: a */
        final long f46630a;

        /* renamed from: b */
        final long f46631b;

        /* renamed from: c */
        private final boolean f46632c;

        C16598b(C16596cm cmVar) {
            this(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo31904a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo31905b() throws RemoteException;

        C16598b(boolean z) {
            this.f46630a = C16596cm.this.f46619b.mo28523a();
            this.f46631b = C16596cm.this.f46619b.mo28524b();
            this.f46632c = z;
        }

        public void run() {
            if (C16596cm.this.f46622e) {
                mo31904a();
                return;
            }
            try {
                mo31905b();
            } catch (Exception e) {
                C16596cm.this.m39662a(e, false, this.f46632c);
                mo31904a();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.cm$c */
    class C16599c implements ActivityLifecycleCallbacks {
        C16599c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C16596cm.this.mo31900a((C16598b) new C16619df(this, activity, bundle));
        }

        public final void onActivityStarted(Activity activity) {
            C16596cm.this.mo31900a((C16598b) new C16620dg(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C16596cm.this.mo31900a((C16598b) new C16621dh(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C16596cm.this.mo31900a((C16598b) new C16622di(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C16596cm.this.mo31900a((C16598b) new C16623dj(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C16597a aVar = new C16597a();
            C16596cm.this.mo31900a((C16598b) new C16624dk(this, activity, aVar));
            Bundle b = aVar.mo31903b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            C16596cm.this.mo31900a((C16598b) new C16625dl(this, activity));
        }
    }

    /* renamed from: a */
    public static C16596cm m39659a(Context context, String str, String str2, String str3, Bundle bundle) {
        C15464q.m32123a(context);
        if (f46617h == null) {
            synchronized (C16596cm.class) {
                if (f46617h == null) {
                    C16596cm cmVar = new C16596cm(context, str, str2, str3, bundle);
                    f46617h = cmVar;
                }
            }
        }
        return f46617h;
    }

    private C16596cm(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m39663a(str2, str3)) {
            this.f46618a = "FA";
        } else {
            this.f46618a = str;
        }
        this.f46619b = C15517h.m32280d();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f46625i = threadPoolExecutor;
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C16599c());
        }
        this.f46620c = new C16979a(this);
        boolean z = false;
        if (!(!m39665b(context) || m39664b())) {
            this.f46623f = null;
            this.f46622e = true;
            return;
        }
        if (!m39663a(str2, str3)) {
            this.f46623f = "fa";
            if (str2 == null || str3 == null) {
                boolean z2 = str2 == null;
                if (str3 == null) {
                    z = true;
                }
                boolean z3 = z2 ^ z;
            } else {
                this.f46622e = true;
                return;
            }
        } else {
            this.f46623f = str2;
        }
        C16600cn cnVar = new C16600cn(this, context, str2, str3, bundle);
        mo31900a((C16598b) cnVar);
    }

    /* renamed from: b */
    private static boolean m39665b(Context context) {
        try {
            C15333e.m31883a(context);
            if (C15333e.m31885a() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m39663a(String str, String str2) {
        return (str2 == null || str == null || m39664b()) ? false : true;
    }

    /* renamed from: a */
    public final void mo31900a(C16598b bVar) {
        this.f46625i.execute(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16591ch mo31898a(Context context) {
        try {
            IBinder a = DynamiteModule.m32334a(context, DynamiteModule.f40023d, "com.google.android.gms.measurement.dynamite").mo28530a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
            if (queryLocalInterface instanceof C16591ch) {
                return (C16591ch) queryLocalInterface;
            }
            return new C16592ci(a);
        } catch (C15538a e) {
            m39662a(e, true, false);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39662a(Exception exc, boolean z, boolean z2) {
        this.f46622e |= z;
        if (!z) {
            String str = "Error with data collection. Data lost.";
            if (z2) {
                mo31899a(5, str, (Object) exc, (Object) null, (Object) null);
            }
        }
    }

    /* renamed from: b */
    private static boolean m39664b() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final long mo31896a() {
        C16597a aVar = new C16597a();
        mo31900a((C16598b) new C16608cv(this, aVar));
        Long l = (Long) aVar.mo31901a(aVar.mo31903b(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f46619b.mo28523a()).nextLong();
        int i = this.f46626j + 1;
        this.f46626j = i;
        return nextLong + ((long) i);
    }

    /* renamed from: a */
    public final void mo31899a(int i, String str, Object obj, Object obj2, Object obj3) {
        C16612cz czVar = new C16612cz(this, false, 5, str, obj, obj2, obj3);
        mo31900a((C16598b) czVar);
    }

    /* renamed from: a */
    public final Bundle mo31897a(Bundle bundle, boolean z) {
        C16597a aVar = new C16597a();
        mo31900a((C16598b) new C16614da(this, bundle, aVar));
        if (z) {
            return aVar.mo31903b(5000);
        }
        return null;
    }
}

package com.p683ss.android.ugc.aweme.location;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Message;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import java.lang.ref.WeakReference;
import java.util.Vector;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.location.j */
public final class C36266j implements C9382a, C36284t {

    /* renamed from: d */
    public static final C36267a f92833d = new C36267a(null);

    /* renamed from: a */
    final Vector<WeakReference<C36265i>> f92834a = new Vector<>();

    /* renamed from: b */
    public WeakReference<C36265i> f92835b;

    /* renamed from: c */
    public C36275n f92836c;

    /* renamed from: e */
    private C9381g f92837e;

    /* renamed from: f */
    private final Context f92838f;

    /* renamed from: g */
    private final C36259d f92839g;

    /* renamed from: com.ss.android.ugc.aweme.location.j$a */
    public static final class C36267a {

        /* renamed from: com.ss.android.ugc.aweme.location.j$a$a */
        public static final class C36268a implements C47939a {

            /* renamed from: a */
            final /* synthetic */ C47939a f92840a;

            /* renamed from: a */
            public final void mo60068a() {
                C47939a aVar = this.f92840a;
                if (aVar != null) {
                    aVar.mo60068a();
                }
            }

            /* renamed from: b */
            public final void mo60069b() {
                C47939a aVar = this.f92840a;
                if (aVar != null) {
                    aVar.mo60069b();
                }
            }

            C36268a(C47939a aVar) {
                this.f92840a = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.location.j$a$b */
        public static final class C36269b implements C47939a {

            /* renamed from: a */
            final /* synthetic */ C47939a f92841a;

            /* renamed from: a */
            public final void mo60068a() {
                C47939a aVar = this.f92841a;
                if (aVar != null) {
                    aVar.mo60068a();
                }
            }

            /* renamed from: b */
            public final void mo60069b() {
                C47939a aVar = this.f92841a;
                if (aVar != null) {
                    aVar.mo60069b();
                }
            }

            C36269b(C47939a aVar) {
                this.f92841a = aVar;
            }
        }

        private C36267a() {
        }

        /* renamed from: a */
        private static String[] m81888a() {
            return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        }

        public /* synthetic */ C36267a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo75090a(Context context) {
            if (context != null) {
                return C47937a.m103721a(context, m81888a());
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo75091b(Context context) {
            if (!m81890c(context) || !mo75090a(context)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private static boolean m81890c(Context context) {
            if (context == null) {
                return false;
            }
            if (VERSION.SDK_INT >= 28) {
                Object systemService = context.getSystemService("location");
                if (!(systemService instanceof LocationManager)) {
                    systemService = null;
                }
                LocationManager locationManager = (LocationManager) systemService;
                if (locationManager != null) {
                    return locationManager.isLocationEnabled();
                }
                return false;
            } else if (VERSION.SDK_INT >= 19) {
                try {
                    if (Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                        return true;
                    }
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            } else if (!TextUtils.isEmpty(Secure.getString(context.getContentResolver(), "location_providers_allowed"))) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public static void m81887a(Activity activity, C47939a aVar) {
            if (activity != null) {
                C47937a.m103719a(activity, (int) TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, m81888a(), (C47939a) new C36268a(aVar));
            }
        }

        /* renamed from: b */
        public static void m81889b(Activity activity, C47939a aVar) {
            if (activity != null) {
                C47937a.m103724b(activity, 1001, m81888a(), new C36269b(aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.location.j$b */
    static final class C36270b extends C52712l implements C52671b<WeakReference<C36265i>, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36266j f92842a;

        /* renamed from: b */
        final /* synthetic */ C36265i f92843b;

        C36270b(C36266j jVar, C36265i iVar) {
            this.f92842a = jVar;
            this.f92843b = iVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            if (((C36265i) ((WeakReference) obj).get()) == this.f92843b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final boolean m81879a(Context context) {
        return f92833d.mo75091b(context);
    }

    /* renamed from: e */
    private final boolean m81880e() {
        boolean z;
        Context context = this.f92838f;
        if (context == null) {
            return false;
        }
        try {
            z = C18920g.m46055c(context, context.getPackageName());
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final C36282r mo75084a() {
        if (mo75088c()) {
            C36275n nVar = this.f92836c;
            if (nVar != null) {
                return nVar.mo75064b();
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo75087b() {
        if (mo75088c() && m81880e()) {
            C36275n nVar = this.f92836c;
            if (nVar != null) {
                nVar.mo75062a();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo75088c() {
        boolean z;
        C36259d dVar = this.f92839g;
        if (dVar != null) {
            z = dVar.mo75075c();
        } else {
            z = false;
        }
        if (!z || !f92833d.mo75091b(this.f92838f)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo75089d() {
        if (mo75088c()) {
            mo75086a(false);
            C9381g gVar = this.f92837e;
            if (gVar != null) {
                gVar.sendEmptyMessage(241);
            }
        }
    }

    /* renamed from: a */
    public final void mo75086a(boolean z) {
        mo75088c();
    }

    /* renamed from: a */
    public final C36282r mo75085a(C36265i iVar) {
        if (!mo75088c()) {
            return null;
        }
        C36282r a = mo75084a();
        if (a != null) {
            if (!a.isValid()) {
                a = null;
            }
            if (a != null) {
                return a;
            }
        }
        if (iVar != null) {
            synchronized (this.f92834a) {
                this.f92834a.add(new WeakReference(iVar));
                mo75087b();
            }
        }
        return null;
    }

    public final void handleMsg(Message message) {
        if (mo75088c()) {
            synchronized (this.f92834a) {
                for (WeakReference weakReference : this.f92834a) {
                    C36265i iVar = (C36265i) weakReference.get();
                    if (iVar != null) {
                        iVar.bF_();
                    }
                }
                this.f92834a.clear();
                WeakReference<C36265i> weakReference2 = this.f92835b;
                if (weakReference2 != null) {
                    C36265i iVar2 = (C36265i) weakReference2.get();
                    if (iVar2 != null) {
                        iVar2.bF_();
                    }
                }
            }
        }
    }

    public C36266j(Context context, C36259d dVar) {
        this.f92838f = context;
        this.f92839g = dVar;
        if (C18920g.m46048a(this.f92838f)) {
            this.f92837e = new C9381g(this);
        }
    }
}

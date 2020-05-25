package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.C2240a;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15229d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15457n.C15458a;
import com.google.android.gms.internal.p1043d.C16482d;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C15428c<T extends IInterface> {

    /* renamed from: a */
    private static final Feature[] f39782a = new Feature[0];

    /* renamed from: k */
    public static final String[] f39783k = {"service_esmobile", "service_googleme"};

    /* renamed from: A */
    private final int f39784A;

    /* renamed from: B */
    private final String f39785B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public ConnectionResult f39786C;

    /* renamed from: b */
    int f39787b;

    /* renamed from: c */
    long f39788c;

    /* renamed from: d */
    public final Context f39789d;

    /* renamed from: e */
    public final Looper f39790e;

    /* renamed from: f */
    final Handler f39791f;

    /* renamed from: g */
    protected C15431c f39792g;

    /* renamed from: h */
    boolean f39793h;

    /* renamed from: i */
    public volatile zzb f39794i;

    /* renamed from: j */
    protected AtomicInteger f39795j;

    /* renamed from: l */
    private long f39796l;

    /* renamed from: m */
    private int f39797m;

    /* renamed from: n */
    private long f39798n;

    /* renamed from: o */
    private C15417ah f39799o;

    /* renamed from: p */
    private final C15449i f39800p;

    /* renamed from: q */
    private final C15369c f39801q;

    /* renamed from: r */
    private final Object f39802r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f39803s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C15459o f39804t;

    /* renamed from: u */
    private T f39805u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final ArrayList<C15436h<?>> f39806v;

    /* renamed from: w */
    private C15438j f39807w;

    /* renamed from: x */
    private int f39808x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C15429a f39809y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C15430b f39810z;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface C15429a {
        /* renamed from: a */
        void mo28416a(int i);

        /* renamed from: a */
        void mo28417a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface C15430b {
        /* renamed from: a */
        void mo28418a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface C15431c {
        /* renamed from: a */
        void mo28163a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    public class C15432d implements C15431c {
        public C15432d() {
        }

        /* renamed from: a */
        public final void mo28163a(ConnectionResult connectionResult) {
            if (connectionResult.mo28024b()) {
                C15428c.this.mo28401a((C15453l) null, C15428c.this.mo28414q());
                return;
            }
            if (C15428c.this.f39810z != null) {
                C15428c.this.f39810z.mo28418a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface C15433e {
        /* renamed from: a */
        void mo28212a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    abstract class C15434f extends C15436h<Boolean> {

        /* renamed from: a */
        private final int f39812a;

        /* renamed from: b */
        private final Bundle f39813b;

        protected C15434f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f39812a = i;
            this.f39813b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo28419a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo28421a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo28420a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C15428c.this.m32022a(1, null);
                return;
            }
            int i = this.f39812a;
            if (i != 0) {
                if (i != 10) {
                    C15428c.this.m32022a(1, null);
                    if (this.f39813b != null) {
                        pendingIntent = (PendingIntent) this.f39813b.getParcelable("pendingIntent");
                    }
                    mo28419a(new ConnectionResult(this.f39812a, pendingIntent));
                } else {
                    C15428c.this.m32022a(1, null);
                    throw new IllegalStateException(C2240a.m6772a("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C15428c.this.mo27963a(), C15428c.this.mo27964b()}));
                }
            } else if (!mo28421a()) {
                C15428c.this.m32022a(1, null);
                mo28419a(new ConnectionResult(8, null));
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    final class C15435g extends C16482d {
        public C15435g(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (C15428c.this.f39795j.get() != message.arg1) {
                if (m32070b(message)) {
                    m32069a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !C15428c.this.mo28405h()) {
                m32069a(message);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 4) {
                    C15428c.this.f39786C = new ConnectionResult(message.arg2);
                    if (!C15428c.this.mo28415r() || C15428c.this.f39793h) {
                        if (C15428c.this.f39786C != null) {
                            connectionResult2 = C15428c.this.f39786C;
                        } else {
                            connectionResult2 = new ConnectionResult(8);
                        }
                        C15428c.this.f39792g.mo28163a(connectionResult2);
                        C15428c.this.mo28398a(connectionResult2);
                        return;
                    }
                    C15428c.this.m32022a(3, null);
                } else if (message.what == 5) {
                    if (C15428c.this.f39786C != null) {
                        connectionResult = C15428c.this.f39786C;
                    } else {
                        connectionResult = new ConnectionResult(8);
                    }
                    C15428c.this.f39792g.mo28163a(connectionResult);
                    C15428c.this.mo28398a(connectionResult);
                } else if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    C15428c.this.f39792g.mo28163a(connectionResult3);
                    C15428c.this.mo28398a(connectionResult3);
                } else if (message.what == 6) {
                    C15428c.this.m32022a(5, null);
                    if (C15428c.this.f39809y != null) {
                        C15428c.this.f39809y.mo28416a(message.arg2);
                    }
                    C15428c cVar = C15428c.this;
                    cVar.f39787b = message.arg2;
                    cVar.f39788c = System.currentTimeMillis();
                    C15428c.this.m32025a(5, 1, null);
                } else if (message.what == 2 && !C15428c.this.mo28404g()) {
                    m32069a(message);
                } else if (m32070b(message)) {
                    ((C15436h) message.obj).mo28423b();
                } else {
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            }
        }

        /* renamed from: a */
        private static void m32069a(Message message) {
            ((C15436h) message.obj).mo28424c();
        }

        /* renamed from: b */
        private static boolean m32070b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    protected abstract class C15436h<TListener> {

        /* renamed from: a */
        private TListener f39816a;

        /* renamed from: b */
        private boolean f39817b;

        public C15436h(TListener tlistener) {
            this.f39816a = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo28420a(TListener tlistener);

        /* renamed from: b */
        public final void mo28423b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f39816a;
            }
            if (tlistener != null) {
                try {
                    mo28420a(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f39817b = true;
            }
            mo28424c();
        }

        /* renamed from: c */
        public final void mo28424c() {
            mo28425d();
            synchronized (C15428c.this.f39806v) {
                C15428c.this.f39806v.remove(this);
            }
        }

        /* renamed from: d */
        public final void mo28425d() {
            synchronized (this) {
                this.f39816a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class C15437i extends C15458a {

        /* renamed from: a */
        private C15428c f39819a;

        /* renamed from: b */
        private final int f39820b;

        public C15437i(C15428c cVar, int i) {
            this.f39819a = cVar;
            this.f39820b = i;
        }

        /* renamed from: a */
        public final void mo28390a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public final void mo28391a(int i, IBinder iBinder, Bundle bundle) {
            C15464q.m32124a(this.f39819a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f39819a.mo28397a(i, iBinder, bundle, this.f39820b);
            this.f39819a = null;
        }

        /* renamed from: a */
        public final void mo28392a(int i, IBinder iBinder, zzb zzb) {
            C15464q.m32124a(this.f39819a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C15464q.m32123a(zzb);
            this.f39819a.f39794i = zzb;
            mo28391a(i, iBinder, zzb.f39883a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class C15438j implements ServiceConnection {

        /* renamed from: a */
        private final int f39821a;

        public C15438j(int i) {
            this.f39821a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C15459o oVar;
            if (iBinder == null) {
                C15428c.m32023a(C15428c.this, 16);
                return;
            }
            synchronized (C15428c.this.f39803s) {
                C15428c cVar = C15428c.this;
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C15459o)) {
                        oVar = new C15461a(iBinder);
                    } else {
                        oVar = (C15459o) queryLocalInterface;
                    }
                }
                cVar.f39804t = oVar;
            }
            C15428c.this.mo28396a(0, (Bundle) null, this.f39821a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C15428c.this.f39803s) {
                C15428c.this.f39804t = null;
            }
            C15428c.this.f39791f.sendMessage(C15428c.this.f39791f.obtainMessage(6, this.f39821a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$k */
    protected final class C15439k extends C15434f {

        /* renamed from: a */
        private final IBinder f39823a;

        public C15439k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f39823a = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo28419a(ConnectionResult connectionResult) {
            if (C15428c.this.f39810z != null) {
                C15428c.this.f39810z.mo28418a(connectionResult);
            }
            C15428c.this.mo28398a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo28421a() {
            try {
                if (!C15428c.this.mo27964b().equals(this.f39823a.getInterfaceDescriptor())) {
                    return false;
                }
                IInterface a = C15428c.this.mo27962a(this.f39823a);
                if (a == null || (!C15428c.this.m32025a(2, 4, a) && !C15428c.this.m32025a(3, 4, a))) {
                    return false;
                }
                C15428c.this.f39786C = null;
                if (C15428c.this.f39809y != null) {
                    C15428c.this.f39809y.mo28417a((Bundle) null);
                }
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$l */
    protected final class C15440l extends C15434f {
        public C15440l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo28419a(ConnectionResult connectionResult) {
            C15428c.this.f39792g.mo28163a(connectionResult);
            C15428c.this.mo28398a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo28421a() {
            C15428c.this.f39792g.mo28163a(ConnectionResult.f39245a);
            return true;
        }
    }

    /* renamed from: s */
    private static String mo29433s() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo27962a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo27963a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo27964b();

    /* renamed from: c */
    public boolean mo27965c() {
        return false;
    }

    /* renamed from: i */
    public boolean mo28406i() {
        return false;
    }

    /* renamed from: m */
    public Account mo28410m() {
        return null;
    }

    protected C15428c(Context context, Looper looper, int i, C15429a aVar, C15430b bVar, String str) {
        this(context, looper, C15449i.m32101a(context), C15369c.getInstance(), i, (C15429a) C15464q.m32123a(aVar), (C15430b) C15464q.m32123a(bVar), null);
    }

    protected C15428c(Context context, Looper looper, C15449i iVar, C15369c cVar, int i, C15429a aVar, C15430b bVar, String str) {
        this.f39802r = new Object();
        this.f39803s = new Object();
        this.f39806v = new ArrayList<>();
        this.f39808x = 1;
        this.f39786C = null;
        this.f39793h = false;
        this.f39794i = null;
        this.f39795j = new AtomicInteger(0);
        this.f39789d = (Context) C15464q.m32124a(context, (Object) "Context must not be null");
        this.f39790e = (Looper) C15464q.m32124a(looper, (Object) "Looper must not be null");
        this.f39800p = (C15449i) C15464q.m32124a(iVar, (Object) "Supervisor must not be null");
        this.f39801q = (C15369c) C15464q.m32124a(cVar, (Object) "API availability must not be null");
        this.f39791f = new C15435g(looper);
        this.f39784A = i;
        this.f39809y = aVar;
        this.f39810z = bVar;
        this.f39785B = str;
    }

    /* renamed from: t */
    private final String mo33400t() {
        return this.f39785B == null ? this.f39789d.getClass().getName() : this.f39785B;
    }

    /* renamed from: k */
    public final Feature[] mo28408k() {
        zzb zzb = this.f39794i;
        if (zzb == null) {
            return null;
        }
        return zzb.f39884b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28398a(ConnectionResult connectionResult) {
        this.f39797m = connectionResult.f39246b;
        this.f39798n = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32022a(int i, T t) {
        boolean z = true;
        if ((i == 4) != (t != null)) {
            z = false;
        }
        C15464q.m32133b(z);
        synchronized (this.f39802r) {
            this.f39808x = i;
            this.f39805u = t;
            switch (i) {
                case 1:
                    if (this.f39807w != null) {
                        this.f39800p.mo28439a(mo27963a(), mo29433s(), 129, this.f39807w, mo33400t());
                        this.f39807w = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.f39807w == null || this.f39799o == null)) {
                        this.f39800p.mo28439a(this.f39799o.f39774a, this.f39799o.f39775b, this.f39799o.f39776c, this.f39807w, mo33400t());
                        this.f39795j.incrementAndGet();
                    }
                    this.f39807w = new C15438j(this.f39795j.get());
                    this.f39799o = new C15417ah(mo29433s(), mo27963a(), false, 129);
                    if (!this.f39800p.mo28378a(new C15450a(this.f39799o.f39774a, this.f39799o.f39775b, this.f39799o.f39776c), this.f39807w, mo33400t())) {
                        mo28396a(16, (Bundle) null, this.f39795j.get());
                        break;
                    }
                    break;
                case 4:
                    this.f39796l = System.currentTimeMillis();
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m32025a(int i, int i2, T t) {
        synchronized (this.f39802r) {
            if (this.f39808x != i) {
                return false;
            }
            m32022a(i2, t);
            return true;
        }
    }

    /* renamed from: l */
    public final void mo28409l() {
        int isGooglePlayServicesAvailable = this.f39801q.isGooglePlayServicesAvailable(this.f39789d, mo27967e());
        if (isGooglePlayServicesAvailable != 0) {
            m32022a(1, (T) null);
            this.f39792g = (C15431c) C15464q.m32124a(new C15432d(), (Object) "Connection progress callbacks cannot be null.");
            this.f39791f.sendMessage(this.f39791f.obtainMessage(3, this.f39795j.get(), isGooglePlayServicesAvailable, null));
            return;
        }
        mo28399a((C15431c) new C15432d());
    }

    /* renamed from: a */
    public final void mo28399a(C15431c cVar) {
        this.f39792g = (C15431c) C15464q.m32124a(cVar, (Object) "Connection progress callbacks cannot be null.");
        m32022a(2, (T) null);
    }

    /* renamed from: g */
    public final boolean mo28404g() {
        boolean z;
        synchronized (this.f39802r) {
            z = this.f39808x == 4;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo28405h() {
        boolean z;
        synchronized (this.f39802r) {
            if (this.f39808x != 2) {
                if (this.f39808x != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: u */
    private final boolean m32033u() {
        boolean z;
        synchronized (this.f39802r) {
            z = this.f39808x == 3;
        }
        return z;
    }

    /* renamed from: f */
    public void mo28403f() {
        this.f39795j.incrementAndGet();
        synchronized (this.f39806v) {
            int size = this.f39806v.size();
            for (int i = 0; i < size; i++) {
                ((C15436h) this.f39806v.get(i)).mo28425d();
            }
            this.f39806v.clear();
        }
        synchronized (this.f39803s) {
            this.f39804t = null;
        }
        m32022a(1, (T) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Bundle mo28411n() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28397a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f39791f.sendMessage(this.f39791f.obtainMessage(1, i2, -1, new C15439k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28396a(int i, Bundle bundle, int i2) {
        this.f39791f.sendMessage(this.f39791f.obtainMessage(7, i2, -1, new C15440l(i, null)));
    }

    /* renamed from: o */
    public final void mo28412o() {
        if (!mo28404g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: p */
    public final T mo28413p() throws DeadObjectException {
        T t;
        synchronized (this.f39802r) {
            if (this.f39808x != 5) {
                mo28412o();
                C15464q.m32130a(this.f39805u != null, (Object) "Client is connected but service is null");
                t = this.f39805u;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* renamed from: a */
    public final void mo28401a(C15453l lVar, Set<Scope> set) {
        Bundle n = mo28411n();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f39784A);
        getServiceRequest.f39732a = this.f39789d.getPackageName();
        getServiceRequest.f39735d = n;
        if (set != null) {
            getServiceRequest.f39734c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo28406i()) {
            getServiceRequest.f39736e = mo28410m() != null ? mo28410m() : new Account("<<default account>>", "com.google");
            if (lVar != null) {
                getServiceRequest.f39733b = lVar.asBinder();
            }
        }
        getServiceRequest.f39737f = f39782a;
        getServiceRequest.f39738g = f39782a;
        try {
            synchronized (this.f39803s) {
                if (this.f39804t != null) {
                    this.f39804t.mo28446a(new C15437i(this, this.f39795j.get()), getServiceRequest);
                }
            }
        } catch (DeadObjectException unused) {
            this.f39791f.sendMessage(this.f39791f.obtainMessage(6, this.f39795j.get(), 1));
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo28397a(8, (IBinder) null, (Bundle) null, this.f39795j.get());
        }
    }

    /* renamed from: a */
    public final void mo28400a(C15433e eVar) {
        eVar.mo28212a();
    }

    /* renamed from: d */
    public Intent mo27966d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Set<Scope> mo28414q() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: a */
    public final void mo28402a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C15459o oVar;
        synchronized (this.f39802r) {
            i = this.f39808x;
            t = this.f39805u;
        }
        synchronized (this.f39803s) {
            oVar = this.f39804t;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append(TEVideoRecorder.FACE_BEAUTY_NULL);
        } else {
            printWriter.append(mo27964b()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oVar == null) {
            printWriter.println(TEVideoRecorder.FACE_BEAUTY_NULL);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(oVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f39796l > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f39796l;
            String format = simpleDateFormat.format(new Date(this.f39796l));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f39788c > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f39787b) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f39787b));
                    break;
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f39788c;
            String format2 = simpleDateFormat.format(new Date(this.f39788c));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f39798n > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C15229d.m31477a(this.f39797m));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f39798n;
            String format3 = simpleDateFormat.format(new Date(this.f39798n));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final boolean mo28415r() {
        if (this.f39793h || TextUtils.isEmpty(mo27964b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo27964b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final String mo28407j() {
        if (mo28404g() && this.f39799o != null) {
            return this.f39799o.f39775b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: e */
    public int mo27967e() {
        return C15369c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: a */
    static /* synthetic */ void m32023a(C15428c cVar, int i) {
        int i2;
        if (cVar.m32033u()) {
            i2 = 5;
            cVar.f39793h = true;
        } else {
            i2 = 4;
        }
        cVar.f39791f.sendMessage(cVar.f39791f.obtainMessage(i2, cVar.f39795j.get(), 16));
    }
}

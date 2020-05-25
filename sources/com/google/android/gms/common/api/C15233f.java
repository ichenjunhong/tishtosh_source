package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0777a;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.C15211a.C15215d.C15218c;
import com.google.android.gms.common.api.C15211a.C15215d.C15219d;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.internal.C15256am;
import com.google.android.gms.common.api.internal.C15292bu;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.api.internal.C15307cg;
import com.google.android.gms.common.api.internal.C15315cn;
import com.google.android.gms.common.api.internal.C15334f;
import com.google.android.gms.common.api.internal.C15342k;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15441d.C15443b;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17144b;
import com.google.android.gms.signin.C17147e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class C15233f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<C15233f> f39297a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.f$a */
    public static final class C15234a {

        /* renamed from: a */
        public Looper f39298a;

        /* renamed from: b */
        private Account f39299b;

        /* renamed from: c */
        private final Set<Scope> f39300c = new HashSet();

        /* renamed from: d */
        private final Set<Scope> f39301d = new HashSet();

        /* renamed from: e */
        private int f39302e;

        /* renamed from: f */
        private View f39303f;

        /* renamed from: g */
        private String f39304g;

        /* renamed from: h */
        private String f39305h;

        /* renamed from: i */
        private final Map<C15211a<?>, C15443b> f39306i = new C0777a();

        /* renamed from: j */
        private final Context f39307j;

        /* renamed from: k */
        private final Map<C15211a<?>, C15215d> f39308k = new C0777a();

        /* renamed from: l */
        private C15334f f39309l;

        /* renamed from: m */
        private int f39310m = -1;

        /* renamed from: n */
        private C15236c f39311n;

        /* renamed from: o */
        private GoogleApiAvailability f39312o = GoogleApiAvailability.getInstance();

        /* renamed from: p */
        private C15212a<? extends C17147e, C17142a> f39313p = C17144b.f48525a;

        /* renamed from: q */
        private final ArrayList<C15235b> f39314q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C15236c> f39315r = new ArrayList<>();

        /* renamed from: s */
        private boolean f39316s = false;

        public C15234a(Context context) {
            this.f39307j = context;
            this.f39298a = context.getMainLooper();
            this.f39304g = context.getPackageName();
            this.f39305h = context.getClass().getName();
        }

        /* renamed from: a */
        public final C15234a mo28118a(C15235b bVar) {
            C15464q.m32124a(bVar, (Object) "Listener must not be null");
            this.f39314q.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C15234a mo28119a(C15236c cVar) {
            C15464q.m32124a(cVar, (Object) "Listener must not be null");
            this.f39315r.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C15234a mo28116a(C15211a<? extends C15219d> aVar) {
            C15464q.m32124a(aVar, (Object) "Api must not be null");
            this.f39308k.put(aVar, null);
            List a = aVar.f39276a.mo27906a(null);
            this.f39301d.addAll(a);
            this.f39300c.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C15218c> C15234a mo28117a(C15211a<O> aVar, O o) {
            C15464q.m32124a(aVar, (Object) "Api must not be null");
            C15464q.m32124a(o, (Object) "Null options are not permitted for this Api");
            this.f39308k.put(aVar, o);
            List a = aVar.f39276a.mo27906a(o);
            this.f39301d.addAll(a);
            this.f39300c.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final C15233f mo28120a() {
            C15464q.m32134b(!this.f39308k.isEmpty(), "must call addApi() to add at least one API");
            C17142a aVar = C17142a.f48516a;
            if (this.f39308k.containsKey(C17144b.f48526b)) {
                aVar = (C17142a) this.f39308k.get(C17144b.f48526b);
            }
            C15441d dVar = new C15441d(this.f39299b, this.f39300c, this.f39306i, this.f39302e, this.f39303f, this.f39304g, this.f39305h, aVar);
            Map<C15211a<?>, C15443b> map = dVar.f39829d;
            C0777a aVar2 = new C0777a();
            C0777a aVar3 = new C0777a();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f39308k.keySet().iterator();
            C15211a aVar4 = null;
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    C15211a aVar5 = (C15211a) it.next();
                    Object obj = this.f39308k.get(aVar5);
                    if (map.get(aVar5) != null) {
                        z = true;
                    }
                    aVar2.put(aVar5, Boolean.valueOf(z));
                    C15315cn cnVar = new C15315cn(aVar5, z);
                    arrayList.add(cnVar);
                    C15211a aVar6 = aVar5;
                    C15222f a = aVar5.mo28065a().mo27863a(this.f39307j, this.f39298a, dVar, obj, cnVar, cnVar);
                    aVar3.put(aVar6.mo28066b(), a);
                    if (a.mo27965c()) {
                        if (aVar4 == null) {
                            aVar4 = aVar6;
                        } else {
                            String str = aVar6.f39277b;
                            String str2 = aVar4.f39277b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                            sb.append(str);
                            sb.append(" cannot be used with ");
                            sb.append(str2);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    if (aVar4 != null) {
                        C15464q.m32131a(this.f39299b == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar4.f39277b);
                        C15464q.m32131a(this.f39300c.equals(this.f39301d), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar4.f39277b);
                    }
                    int a2 = C15256am.m31589a((Iterable<C15222f>) aVar3.values(), true);
                    ArrayList arrayList2 = arrayList;
                    C15256am amVar = new C15256am(this.f39307j, new ReentrantLock(), this.f39298a, dVar, this.f39312o, this.f39313p, aVar2, this.f39314q, this.f39315r, aVar3, this.f39310m, a2, arrayList2, false);
                    synchronized (C15233f.f39297a) {
                        C15233f.f39297a.add(amVar);
                    }
                    if (this.f39310m >= 0) {
                        C15307cg.m31738b(this.f39309l).mo28236a(this.f39310m, amVar, this.f39311n);
                    }
                    return amVar;
                }
            }
        }

        /* renamed from: a */
        public final C15234a mo28115a(FragmentActivity fragmentActivity, C15236c cVar) {
            C15334f fVar = new C15334f(fragmentActivity);
            C15464q.m32134b(true, "clientId must be non-negative");
            this.f39310m = 0;
            this.f39311n = cVar;
            this.f39309l = fVar;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C15235b {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: com.google.android.gms.common.api.f$c */
    public interface C15236c {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public abstract void mo28099a(FragmentActivity fragmentActivity);

    /* renamed from: a */
    public abstract void mo28100a(C15236c cVar);

    /* renamed from: a */
    public abstract void mo28102a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo28105b(C15236c cVar);

    /* renamed from: e */
    public abstract void mo28109e();

    /* renamed from: f */
    public abstract ConnectionResult mo28110f();

    /* renamed from: g */
    public abstract void mo28111g();

    /* renamed from: h */
    public abstract void mo28112h();

    /* renamed from: i */
    public abstract C15237g<Status> mo28113i();

    /* renamed from: j */
    public abstract boolean mo28114j();

    /* renamed from: a */
    public static Set<C15233f> m31488a() {
        Set<C15233f> set;
        synchronized (f39297a) {
            set = f39297a;
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28097a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <C extends C15222f> C mo28096a(C15214c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo28104b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo28107c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo28103a(C15342k kVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo28108d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo28098a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo28101a(C15292bu buVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo28106b(C15292bu buVar) {
        throw new UnsupportedOperationException();
    }
}

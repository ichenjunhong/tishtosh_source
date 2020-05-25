package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.internal.C15243a;
import com.google.android.gms.common.api.internal.C15278bg;
import com.google.android.gms.common.api.internal.C15282bk;
import com.google.android.gms.common.api.internal.C15283bl;
import com.google.android.gms.common.api.internal.C15287bp;
import com.google.android.gms.common.api.internal.C15298c.C15299a;
import com.google.android.gms.common.api.internal.C15302cb;
import com.google.android.gms.common.api.internal.C15303cc;
import com.google.android.gms.common.api.internal.C15304cd;
import com.google.android.gms.common.api.internal.C15305ce;
import com.google.android.gms.common.api.internal.C15306cf;
import com.google.android.gms.common.api.internal.C15328d;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.common.api.internal.C15335g;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.common.api.internal.C15341j;
import com.google.android.gms.common.api.internal.C15343l;
import com.google.android.gms.common.api.internal.C15345n;
import com.google.android.gms.common.api.internal.C15347p;
import com.google.android.gms.common.api.internal.C15352u;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.e */
public class C15230e<O extends C15215d> {

    /* renamed from: a */
    public final Context f39283a;

    /* renamed from: b */
    public final C15211a<O> f39284b;

    /* renamed from: c */
    public final O f39285c;

    /* renamed from: d */
    public final C15306cf<O> f39286d;

    /* renamed from: e */
    public final Looper f39287e;

    /* renamed from: f */
    public final int f39288f;

    /* renamed from: g */
    public final C15233f f39289g;

    /* renamed from: h */
    protected final C15328d f39290h;

    /* renamed from: i */
    private final C15343l f39291i;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C15231a {

        /* renamed from: a */
        public static final C15231a f39292a = new C15232a().mo28095a();

        /* renamed from: b */
        public final C15343l f39293b;

        /* renamed from: c */
        public final Looper f39294c;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C15232a {

            /* renamed from: a */
            private C15343l f39295a;

            /* renamed from: b */
            private Looper f39296b;

            /* renamed from: a */
            public final C15232a mo28094a(C15343l lVar) {
                C15464q.m32124a(lVar, (Object) "StatusExceptionMapper must not be null.");
                this.f39295a = lVar;
                return this;
            }

            /* renamed from: a */
            public final C15232a mo28093a(Looper looper) {
                C15464q.m32124a(looper, (Object) "Looper must not be null.");
                this.f39296b = looper;
                return this;
            }

            /* renamed from: a */
            public final C15231a mo28095a() {
                if (this.f39295a == null) {
                    this.f39295a = new C15243a();
                }
                if (this.f39296b == null) {
                    this.f39296b = Looper.getMainLooper();
                }
                return new C15231a(this.f39295a, this.f39296b);
            }
        }

        private C15231a(C15343l lVar, Account account, Looper looper) {
            this.f39293b = lVar;
            this.f39294c = looper;
        }
    }

    protected C15230e(Context context, C15211a<O> aVar, Looper looper) {
        C15464q.m32124a(context, (Object) "Null context is not permitted.");
        C15464q.m32124a(aVar, (Object) "Api must not be null.");
        C15464q.m32124a(looper, (Object) "Looper must not be null.");
        this.f39283a = context.getApplicationContext();
        this.f39284b = aVar;
        this.f39285c = null;
        this.f39287e = looper;
        this.f39286d = new C15306cf<>(aVar);
        this.f39289g = new C15278bg(this);
        this.f39290h = C15328d.m31838a(this.f39283a);
        this.f39288f = this.f39290h.mo28263c();
        this.f39291i = new C15243a();
    }

    public C15230e(Context context, C15211a<O> aVar, O o, Looper looper, C15343l lVar) {
        this(context, aVar, o, new C15232a().mo28093a(looper).mo28094a(lVar).mo28095a());
    }

    public C15230e(Activity activity, C15211a<O> aVar, O o, C15231a aVar2) {
        C15464q.m32124a(activity, (Object) "Null activity is not permitted.");
        C15464q.m32124a(aVar, (Object) "Api must not be null.");
        C15464q.m32124a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f39283a = activity.getApplicationContext();
        this.f39284b = aVar;
        this.f39285c = o;
        this.f39287e = aVar2.f39294c;
        this.f39286d = C15306cf.m31735a(this.f39284b, this.f39285c);
        this.f39289g = new C15278bg(this);
        this.f39290h = C15328d.m31838a(this.f39283a);
        this.f39288f = this.f39290h.mo28263c();
        this.f39291i = aVar2.f39293b;
        if (!(activity instanceof GoogleApiActivity)) {
            C15328d dVar = this.f39290h;
            C15306cf<O> cfVar = this.f39286d;
            C15335g a = C15352u.m31538a(activity);
            C15352u uVar = (C15352u) a.mo28247a("ConnectionlessLifecycleHelper", C15352u.class);
            if (uVar == null) {
                uVar = new C15352u(a);
            }
            uVar.f39637c = dVar;
            C15464q.m32124a(cfVar, (Object) "ApiKey cannot be null");
            uVar.f39636b.add(cfVar);
            dVar.mo28260a(uVar);
        }
        this.f39290h.mo28259a(this);
    }

    public C15230e(Context context, C15211a<O> aVar, O o, C15231a aVar2) {
        C15464q.m32124a(context, (Object) "Null context is not permitted.");
        C15464q.m32124a(aVar, (Object) "Api must not be null.");
        C15464q.m32124a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f39283a = context.getApplicationContext();
        this.f39284b = aVar;
        this.f39285c = o;
        this.f39287e = aVar2.f39294c;
        this.f39286d = C15306cf.m31735a(this.f39284b, this.f39285c);
        this.f39289g = new C15278bg(this);
        this.f39290h = C15328d.m31838a(this.f39283a);
        this.f39288f = this.f39290h.mo28263c();
        this.f39291i = aVar2.f39293b;
        this.f39290h.mo28259a(this);
    }

    public C15230e(Activity activity, C15211a<O> aVar, O o, C15343l lVar) {
        this(activity, aVar, o, new C15232a().mo28094a(lVar).mo28093a(activity.getMainLooper()).mo28095a());
    }

    public C15230e(Context context, C15211a<O> aVar, O o, C15343l lVar) {
        this(context, aVar, o, new C15232a().mo28094a(lVar).mo28095a());
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15341j<A, ?>, U extends C15347p<A, ?>> C15179g<Void> mo28088a(T t, U u) {
        C15464q.m32123a(t);
        C15464q.m32123a(u);
        C15464q.m32124a(t.mo28290a(), (Object) "Listener has already been released.");
        C15464q.m32124a(u.f39627a, (Object) "Listener has already been released.");
        C15464q.m32134b(t.mo28290a().equals(u.f39627a), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        C15328d dVar = this.f39290h;
        C15180h hVar = new C15180h();
        dVar.f39576i.sendMessage(dVar.f39576i.obtainMessage(8, new C15282bk(new C15303cc(new C15283bl(t, u), hVar), dVar.f39572e.get(), this)));
        return hVar.f39202a;
    }

    /* renamed from: a */
    public final C15179g<Boolean> mo28087a(C15337a<?> aVar) {
        C15464q.m32124a(aVar, (Object) "Listener key cannot be null.");
        C15328d dVar = this.f39290h;
        C15180h hVar = new C15180h();
        dVar.f39576i.sendMessage(dVar.f39576i.obtainMessage(13, new C15282bk(new C15305ce(aVar, hVar), dVar.f39572e.get(), this)));
        return hVar.f39202a;
    }

    /* renamed from: a */
    public C15222f mo28090a(Looper looper, C15329a<O> aVar) {
        return this.f39284b.mo28065a().mo27863a(this.f39283a, looper, mo27862a().mo28431a(), this.f39285c, aVar, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.gms.common.internal.C15441d.C15442a mo27862a() {
        /*
            r2 = this;
            com.google.android.gms.common.internal.d$a r0 = new com.google.android.gms.common.internal.d$a
            r0.<init>()
            O r1 = r2.f39285c
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C15211a.C15215d.C15217b
            if (r1 == 0) goto L_0x001a
            O r1 = r2.f39285c
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C15211a.C15215d.C15217b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo28068a()
            if (r1 == 0) goto L_0x001a
            android.accounts.Account r1 = r1.mo27914a()
            goto L_0x002a
        L_0x001a:
            O r1 = r2.f39285c
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C15211a.C15215d.C15216a
            if (r1 == 0) goto L_0x0029
            O r1 = r2.f39285c
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C15211a.C15215d.C15216a) r1
            android.accounts.Account r1 = r1.mo28067a()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            com.google.android.gms.common.internal.d$a r0 = r0.mo28428a(r1)
            O r1 = r2.f39285c
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C15211a.C15215d.C15217b
            if (r1 == 0) goto L_0x0043
            O r1 = r2.f39285c
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C15211a.C15215d.C15217b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo28068a()
            if (r1 == 0) goto L_0x0043
            java.util.Set r1 = r1.mo27915b()
            goto L_0x0047
        L_0x0043:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0047:
            com.google.android.gms.common.internal.d$a r0 = r0.mo28430a(r1)
            android.content.Context r1 = r2.f39283a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            com.google.android.gms.common.internal.d$a r0 = r0.mo28432b(r1)
            android.content.Context r1 = r2.f39283a
            java.lang.String r1 = r1.getPackageName()
            com.google.android.gms.common.internal.d$a r0 = r0.mo28429a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C15230e.mo27862a():com.google.android.gms.common.internal.d$a");
    }

    /* renamed from: a */
    public C15287bp mo28091a(Context context, Handler handler) {
        return new C15287bp(context, handler, mo27862a().mo28431a());
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28092a(T t) {
        t.mo28135f();
        C15328d dVar = this.f39290h;
        dVar.f39576i.sendMessage(dVar.f39576i.obtainMessage(4, new C15282bk(new C15302cb(1, t), dVar.f39572e.get(), this)));
        return t;
    }

    /* renamed from: a */
    public final <TResult, A extends C15213b> C15179g<TResult> mo28089a(C15345n<A, TResult> nVar) {
        C15180h hVar = new C15180h();
        C15328d dVar = this.f39290h;
        dVar.f39576i.sendMessage(dVar.f39576i.obtainMessage(4, new C15282bk(new C15304cd(1, nVar, hVar, this.f39291i), dVar.f39572e.get(), this)));
        return hVar.f39202a;
    }
}

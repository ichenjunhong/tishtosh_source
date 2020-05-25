package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C15147b;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.internal.C15428c.C15431c;
import com.google.android.gms.common.internal.C15428c.C15432d;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15446g;
import com.google.android.gms.common.internal.C15453l;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;

/* renamed from: com.google.android.gms.signin.internal.a */
public final class C17148a extends C15446g<C17153f> implements C17147e {

    /* renamed from: a */
    private final boolean f48533a;

    /* renamed from: m */
    private final C15441d f48534m;

    /* renamed from: n */
    private final Bundle f48535n;

    /* renamed from: o */
    private Integer f48536o;

    private C17148a(Context context, Looper looper, boolean z, C15441d dVar, Bundle bundle, C15235b bVar, C15236c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f48533a = true;
        this.f48534m = dVar;
        this.f48535n = bundle;
        this.f48536o = dVar.f39835j;
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: e */
    public final int mo27967e() {
        return C15384g.f39685b;
    }

    /* renamed from: i */
    public final boolean mo28406i() {
        return this.f48533a;
    }

    /* renamed from: a */
    public final void mo33397a(C15453l lVar, boolean z) {
        try {
            ((C17153f) mo28413p()).mo33404a(lVar, this.f48536o.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: s */
    public final void mo29433s() {
        try {
            ((C17153f) mo28413p()).mo33403a(this.f48536o.intValue());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo33398a(C17151d dVar) {
        Account account;
        C15464q.m32124a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            C15441d dVar2 = this.f48534m;
            if (dVar2.f39826a != null) {
                account = dVar2.f39826a;
            } else {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C15147b.m31320a(this.f39789d).mo27951a();
            }
            ((C17153f) mo28413p()).mo33405a(new zah(new ResolveAccountRequest(account, this.f48536o.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            try {
                dVar.mo28166a(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: n */
    public final Bundle mo28411n() {
        if (!this.f39789d.getPackageName().equals(this.f48534m.f39832g)) {
            this.f48535n.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f48534m.f39832g);
        }
        return this.f48535n;
    }

    /* renamed from: t */
    public final void mo33400t() {
        mo28399a((C15431c) new C15432d());
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C17153f) {
            return (C17153f) queryLocalInterface;
        }
        return new C17154g(iBinder);
    }

    public C17148a(Context context, Looper looper, boolean z, C15441d dVar, C17142a aVar, C15235b bVar, C15236c cVar) {
        C17142a aVar2 = dVar.f39834i;
        Integer num = dVar.f39835j;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.f39826a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVar2.f48517b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVar2.f48518c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVar2.f48519d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVar2.f48520e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVar2.f48521f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVar2.f48522g);
            if (aVar2.f48523h != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", aVar2.f48523h.longValue());
            }
            if (aVar2.f48524i != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", aVar2.f48524i.longValue());
            }
        }
        this(context, looper, true, dVar, bundle, bVar, cVar);
    }
}

package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.p1033b.C15172a;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;
import com.google.android.gms.p1033b.C15183j;
import com.google.firebase.C17855b;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.at */
final class C17909at implements C17916b {

    /* renamed from: a */
    final C17939w f49764a;

    /* renamed from: b */
    private final C17855b f49765b;

    /* renamed from: c */
    private final C17933q f49766c;

    /* renamed from: d */
    private final Executor f49767d;

    C17909at(C17855b bVar, C17933q qVar, Executor executor) {
        this(bVar, qVar, executor, new C17939w(bVar.mo34679a(), qVar));
    }

    private C17909at(C17855b bVar, C17933q qVar, Executor executor, C17939w wVar) {
        this.f49765b = bVar;
        this.f49766c = qVar;
        this.f49764a = wVar;
        this.f49767d = executor;
    }

    /* renamed from: a */
    public final boolean mo34753a() {
        return this.f49766c.mo34782a() != 0;
    }

    /* renamed from: a */
    public final C15179g<Void> mo34750a(String str, String str2) {
        return C15183j.m31395a(null);
    }

    /* renamed from: a */
    public final C15179g<String> mo34752a(String str, String str2, String str3, String str4) {
        return m43891b(m43890a(str, str3, str4, new Bundle()));
    }

    /* renamed from: a */
    public final C15179g<Void> mo34751a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m43889a(m43891b(m43890a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: b */
    public final C15179g<Void> mo34754b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m43889a(m43891b(m43890a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: a */
    private final C15179g<Bundle> m43890a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f49765b.mo34681b().f49689b);
        bundle.putString("gmsv", Integer.toString(this.f49766c.mo34785d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f49766c.mo34783b());
        bundle.putString("app_ver_name", this.f49766c.mo34784c());
        bundle.putString("cliv", "fiid-12451000");
        C15180h hVar = new C15180h();
        this.f49767d.execute(new C17910au(this, bundle, hVar));
        return hVar.f39202a;
    }

    /* renamed from: a */
    private final <T> C15179g<Void> m43889a(C15179g<T> gVar) {
        return gVar.mo27992a(C17901al.m43884a(), (C15172a<TResult, TContinuationResult>) new C17911av<TResult,TContinuationResult>(this));
    }

    /* renamed from: b */
    private final C15179g<String> m43891b(C15179g<Bundle> gVar) {
        return gVar.mo27992a(this.f49767d, (C15172a<TResult, TContinuationResult>) new C17912aw<TResult,TContinuationResult>(this));
    }
}

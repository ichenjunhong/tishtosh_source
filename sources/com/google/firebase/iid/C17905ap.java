package com.google.firebase.iid;

import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.ap */
final /* synthetic */ class C17905ap implements Runnable {

    /* renamed from: a */
    private final FirebaseInstanceId f49748a;

    /* renamed from: b */
    private final String f49749b;

    /* renamed from: c */
    private final String f49750c;

    /* renamed from: d */
    private final C15180h f49751d;

    /* renamed from: e */
    private final String f49752e;

    C17905ap(FirebaseInstanceId firebaseInstanceId, String str, String str2, C15180h hVar, String str3) {
        this.f49748a = firebaseInstanceId;
        this.f49749b = str;
        this.f49750c = str2;
        this.f49751d = hVar;
        this.f49752e = str3;
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.f49748a;
        String str = this.f49749b;
        String str2 = this.f49750c;
        C15180h hVar = this.f49751d;
        String str3 = this.f49752e;
        String d = FirebaseInstanceId.m43845d();
        C17890aa b = FirebaseInstanceId.m43843b(str, str2);
        if (b == null || b.mo34729b(firebaseInstanceId.f49700d.mo34783b())) {
            String a = C17890aa.m43866a(b);
            C17936t tVar = firebaseInstanceId.f49702f;
            FirebaseInstanceId firebaseInstanceId2 = firebaseInstanceId;
            C17906aq aqVar = new C17906aq(firebaseInstanceId2, d, a, str, str3);
            C15179g a2 = tVar.mo34787a(str, str3, aqVar);
            Executor executor = firebaseInstanceId.f49698b;
            C17907ar arVar = new C17907ar(firebaseInstanceId2, str, str3, hVar, d);
            a2.mo27994a(executor, (C15175c<TResult>) arVar);
            return;
        }
        hVar.mo28005a(new C17915az(d, b.f49715a));
    }
}

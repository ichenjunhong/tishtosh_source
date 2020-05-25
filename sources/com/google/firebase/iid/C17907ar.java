package com.google.firebase.iid;

import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.firebase.iid.ar */
final /* synthetic */ class C17907ar implements C15175c {

    /* renamed from: a */
    private final FirebaseInstanceId f49758a;

    /* renamed from: b */
    private final String f49759b;

    /* renamed from: c */
    private final String f49760c;

    /* renamed from: d */
    private final C15180h f49761d;

    /* renamed from: e */
    private final String f49762e;

    C17907ar(FirebaseInstanceId firebaseInstanceId, String str, String str2, C15180h hVar, String str3) {
        this.f49758a = firebaseInstanceId;
        this.f49759b = str;
        this.f49760c = str2;
        this.f49761d = hVar;
        this.f49762e = str3;
    }

    /* renamed from: a */
    public final void mo26975a(C15179g gVar) {
        FirebaseInstanceId firebaseInstanceId = this.f49758a;
        String str = this.f49759b;
        String str2 = this.f49760c;
        C15180h hVar = this.f49761d;
        String str3 = this.f49762e;
        if (gVar.mo28000b()) {
            String str4 = (String) gVar.mo28002d();
            FirebaseInstanceId.f49695a.mo34795a("", str, str2, str4, firebaseInstanceId.f49700d.mo34783b());
            hVar.mo28005a(new C17915az(str3, str4));
            return;
        }
        hVar.mo28004a(gVar.mo28003e());
    }
}

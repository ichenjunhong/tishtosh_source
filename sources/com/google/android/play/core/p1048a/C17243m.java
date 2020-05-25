package com.google.android.play.core.p1048a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.p1049b.C17245a;
import com.google.android.play.core.p1056f.C17374l;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.a.m */
final class C17243m extends C17240j<Void> {
    C17243m(C17236f fVar, C17374l<Void> lVar) {
        super(fVar, new C17384b("OnCompleteUpdateCallback"), lVar);
    }

    /* renamed from: b */
    public final void mo33512b(Bundle bundle) throws RemoteException {
        super.mo33512b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f48698a.mo33666a((Exception) new C17245a(bundle.getInt("error.code", -2)));
        } else {
            this.f48698a.mo33667a(null);
        }
    }
}

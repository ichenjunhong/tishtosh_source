package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.c */
final /* synthetic */ class C15139c implements Comparator {

    /* renamed from: a */
    static final Comparator f39169a = new C15139c();

    private C15139c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).f39263a.compareTo(((Scope) obj2).f39263a);
    }
}

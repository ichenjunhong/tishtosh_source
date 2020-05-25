package com.google.android.gms.signin;

import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15223g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C17148a;

/* renamed from: com.google.android.gms.signin.b */
public final class C17144b {

    /* renamed from: a */
    public static final C15212a<C17148a, C17142a> f48525a = new C17145c();

    /* renamed from: b */
    public static final C15211a<C17142a> f48526b = new C15211a<>("SignIn.API", f48525a, f48527c);

    /* renamed from: c */
    private static final C15223g<C17148a> f48527c = new C15223g<>();

    /* renamed from: d */
    private static final C15223g<C17148a> f48528d = new C15223g<>();

    /* renamed from: e */
    private static final C15212a<C17148a, Object> f48529e = new C17146d();

    /* renamed from: f */
    private static final Scope f48530f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f48531g = new Scope("email");

    /* renamed from: h */
    private static final C15211a<Object> f48532h = new C15211a<>("SignIn.INTERNAL_API", f48529e, f48528d);
}

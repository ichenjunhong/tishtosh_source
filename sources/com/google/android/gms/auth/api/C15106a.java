package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.credentials.C15120a;
import com.google.android.gms.auth.api.proxy.C15131a;
import com.google.android.gms.auth.api.signin.C15137a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C15151f;
import com.google.android.gms.auth.api.signin.internal.C15152g;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15215d.C15220e;
import com.google.android.gms.common.api.C15211a.C15223g;
import com.google.android.gms.internal.auth-api.C16447d;
import com.google.android.gms.internal.auth-api.C16448e;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C15106a {

    /* renamed from: a */
    public static final C15223g<C16448e> f39002a = new C15223g<>();

    /* renamed from: b */
    public static final C15223g<C15152g> f39003b = new C15223g<>();

    /* renamed from: c */
    public static final C15211a<C15117c> f39004c = C15116b.f39050a;

    /* renamed from: d */
    public static final C15211a<C15107a> f39005d = new C15211a<>("Auth.CREDENTIALS_API", f39010i, f39002a);

    /* renamed from: e */
    public static final C15211a<GoogleSignInOptions> f39006e = new C15211a<>("Auth.GOOGLE_SIGN_IN_API", f39011j, f39003b);

    /* renamed from: f */
    public static final C15131a f39007f = C15116b.f39051b;

    /* renamed from: g */
    public static final C15120a f39008g = new C16447d();

    /* renamed from: h */
    public static final C15137a f39009h = new C15151f();

    /* renamed from: i */
    private static final C15212a<C16448e, C15107a> f39010i = new C15129e();

    /* renamed from: j */
    private static final C15212a<C15152g, GoogleSignInOptions> f39011j = new C15130f();

    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C15107a implements C15220e {

        /* renamed from: b */
        private static final C15107a f39012b = new C15107a(new C15108a());

        /* renamed from: a */
        public final boolean f39013a;

        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C15108a {

            /* renamed from: a */
            protected Boolean f39014a = Boolean.valueOf(false);
        }

        public C15107a(C15108a aVar) {
            this.f39013a = aVar.f39014a.booleanValue();
        }
    }
}

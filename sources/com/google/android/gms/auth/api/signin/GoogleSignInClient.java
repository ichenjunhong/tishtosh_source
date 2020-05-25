package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.C15106a;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.common.api.internal.C15243a;
import com.google.android.gms.common.api.internal.C15343l;

public class GoogleSignInClient extends C15230e<GoogleSignInOptions> {

    /* renamed from: i */
    private static final C15134a f39131i = new C15134a(null);

    /* renamed from: j */
    private static int f39132j = C15135b.f39133a;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$a */
    static class C15134a {
        private C15134a() {
        }

        /* synthetic */ C15134a(C15143g gVar) {
            this();
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$b */
    static final class C15135b {

        /* renamed from: a */
        public static final int f39133a = 1;

        /* renamed from: b */
        public static final int f39134b = 2;

        /* renamed from: c */
        public static final int f39135c = 3;

        /* renamed from: d */
        public static final int f39136d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f39137e = {f39133a, f39134b, f39135c, f39136d};

        /* renamed from: a */
        public static int[] m31299a() {
            return (int[]) f39137e.clone();
        }
    }

    GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C15106a.f39006e, googleSignInOptions, (C15343l) new C15243a());
    }

    GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C15106a.f39006e, googleSignInOptions, (C15343l) new C15243a());
    }
}

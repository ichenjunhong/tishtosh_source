package com.p683ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.account.util.m */
public final class C22271m {

    /* renamed from: com.ss.android.ugc.aweme.account.util.m$a */
    public static class C22273a {

        /* renamed from: a */
        public Bundle f60042a;

        /* renamed from: b */
        private Class<? extends Fragment> f60043b;

        /* renamed from: a */
        public final Fragment mo46370a() {
            try {
                Fragment fragment = (Fragment) this.f60043b.newInstance();
                if (!this.f60042a.isEmpty()) {
                    fragment.setArguments(this.f60042a);
                }
                return fragment;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final C22273a mo46371a(String str, int i) {
            this.f60042a.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public final C22273a mo46372a(String str, String str2) {
            this.f60042a.putString(str, str2);
            return this;
        }

        private C22273a(Class<? extends Fragment> cls, Bundle bundle) {
            Bundle bundle2;
            this.f60043b = cls;
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = (Bundle) bundle.clone();
            }
            this.f60042a = bundle2;
        }

        /* renamed from: a */
        public final C22273a mo46373a(String str, boolean z) {
            this.f60042a.putBoolean(str, z);
            return this;
        }
    }

    /* renamed from: a */
    public static C22273a m55123a(Class<? extends Fragment> cls) {
        return new C22273a(cls, null);
    }

    /* renamed from: a */
    public static C22273a m55124a(Class<? extends Fragment> cls, Bundle bundle) {
        return new C22273a(cls, bundle);
    }
}

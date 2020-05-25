package com.p683ss.android.ugc.aweme.mobile.p1965a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.mobile.a.a */
public final class C37133a {

    /* renamed from: com.ss.android.ugc.aweme.mobile.a.a$a */
    public static class C37135a {

        /* renamed from: a */
        public Bundle f94795a;

        /* renamed from: b */
        private Class<? extends Fragment> f94796b;

        /* renamed from: a */
        public final Fragment mo76411a() {
            try {
                Fragment fragment = (Fragment) this.f94796b.newInstance();
                if (!this.f94795a.isEmpty()) {
                    fragment.setArguments(this.f94795a);
                }
                return fragment;
            } catch (Exception unused) {
                return null;
            }
        }

        private C37135a(Class<? extends Fragment> cls) {
            this.f94796b = cls;
            this.f94795a = new Bundle();
        }

        /* renamed from: a */
        public final C37135a mo76412a(String str, int i) {
            this.f94795a.putInt(str, i);
            return this;
        }
    }

    /* renamed from: a */
    public static C37135a m83365a(Class<? extends Fragment> cls) {
        return new C37135a(cls);
    }
}

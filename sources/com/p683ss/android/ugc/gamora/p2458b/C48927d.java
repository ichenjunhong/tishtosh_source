package com.p683ss.android.ugc.gamora.p2458b;

import android.arch.lifecycle.C0161ac;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.JediViewModel;

/* renamed from: com.ss.android.ugc.gamora.b.d */
public final class C48927d {

    /* renamed from: com.ss.android.ugc.gamora.b.d$a */
    static class C48929a implements C0212b {
        private C48929a() {
        }

        /* renamed from: a */
        public final <T extends C0209x> T mo361a(Class<T> cls) {
            try {
                T t = (C0209x) cls.newInstance();
                if (t instanceof JediViewModel) {
                    JediViewModel jediViewModel = (JediViewModel) t;
                    C11926m a = jediViewModel.f31279c.mo22643a(cls);
                    if (a != null) {
                        a.binding(jediViewModel);
                    }
                    jediViewModel.mo22526a(C48930e.f123101a);
                }
                return t;
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public static C48926c m105736a(FragmentActivity fragmentActivity) {
        if (fragmentActivity.getApplication() != null) {
            return new C48926c(C0161ac.m373a(fragmentActivity), new C48929a());
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}

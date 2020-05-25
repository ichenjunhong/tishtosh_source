package com.bytedance.android.live;

import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.live.a */
public class C2940a extends C0649f {
    /* renamed from: a */
    private void m8367a(String str, Object obj) {
        try {
            Field declaredField = C2940a.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception unused) {
        }
    }

    public void show(C0654k kVar, String str) {
        m8367a("mDismissed", Boolean.valueOf(false));
        m8367a("mShownByMe", Boolean.valueOf(true));
        C0679r a = kVar.mo2225a();
        a.mo2178a((Fragment) this, str);
        a.mo2195c();
    }

    public int show(C0679r rVar, String str) {
        m8367a("mDismissed", Boolean.valueOf(false));
        m8367a("mShownByMe", Boolean.valueOf(true));
        rVar.mo2178a((Fragment) this, str);
        m8367a("mViewDestroyed", Boolean.valueOf(false));
        int c = rVar.mo2195c();
        m8367a("mBackStackId", Integer.valueOf(c));
        return c;
    }

    public void showNow(C0654k kVar, String str) {
        m8367a("mDismissed", Boolean.valueOf(false));
        m8367a("mShownByMe", Boolean.valueOf(true));
        C0679r a = kVar.mo2225a();
        a.mo2178a((Fragment) this, str);
        try {
            a.mo2200e();
        } catch (Throwable unused) {
            a.mo2195c();
        }
    }
}

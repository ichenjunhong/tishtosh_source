package com.bytedance.scene;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.scene.C12969t.C12971a;
import com.bytedance.scene.p841c.C12880l;

/* renamed from: com.bytedance.scene.u */
public final class C12973u extends Fragment implements C12971a {

    /* renamed from: a */
    private final C12969t f33970a = C12969t.f33964a.mo24563a();

    /* renamed from: a */
    public final C12969t mo24563a() {
        return this.f33970a;
    }

    /* renamed from: b */
    private static C12973u m26090b() {
        return new C12973u();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    /* renamed from: a */
    public static C12973u m26089a(Activity activity, String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_ScopeHolderFragment");
        String sb2 = sb.toString();
        FragmentManager fragmentManager = activity.getFragmentManager();
        C12973u uVar = (C12973u) fragmentManager.findFragmentByTag(sb2);
        if (uVar != null && z) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(uVar);
            C12880l.m25804a(fragmentManager, beginTransaction, z2);
            uVar = null;
        }
        if (uVar != null) {
            return uVar;
        }
        C12973u b = m26090b();
        FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
        beginTransaction2.add(b, sb2);
        C12880l.m25804a(fragmentManager, beginTransaction2, z2);
        return b;
    }
}

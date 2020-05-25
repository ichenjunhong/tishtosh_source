package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.co */
public class C40303co extends C0649f {

    /* renamed from: a */
    public C40291cc f102902a;

    /* renamed from: b */
    private HashMap f102903b;

    /* renamed from: a */
    public void mo82266a() {
        if (this.f102903b != null) {
            this.f102903b.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo82266a();
    }

    /* renamed from: a */
    public final void mo82569a(C40291cc ccVar) {
        C52711k.m112240b(ccVar, "mProfileReturnListener");
        this.f102902a = ccVar;
    }

    public void show(C0654k kVar, String str) {
        C52711k.m112240b(kVar, "manager");
        C52711k.m112240b(str, "tag");
        try {
            super.show(kVar, str);
        } catch (Exception unused) {
        }
    }
}

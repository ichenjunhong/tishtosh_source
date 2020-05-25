package com.bytedance.android.live.core.p229f;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.core.f.a */
public class C3846a extends Fragment {

    /* renamed from: C */
    public boolean f10827C;

    /* renamed from: D */
    protected boolean f10828D;

    /* renamed from: E */
    public boolean f10829E;

    /* renamed from: a */
    private final C1689b f10830a = new C1689b();

    /* renamed from: l */
    public boolean mo8452l() {
        return this.f10828D;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f10828D = false;
    }

    public void onPause() {
        super.onPause();
        this.f10827C = false;
    }

    public void onResume() {
        super.onResume();
        this.f10827C = true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10828D = false;
        this.f10829E = true;
        this.f10830a.mo6180a();
    }

    /* renamed from: a */
    public final void mo9206a(C1690c cVar) {
        this.f10830a.mo6181a(cVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10827C = false;
        this.f10828D = false;
        this.f10829E = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f10828D = true;
    }
}

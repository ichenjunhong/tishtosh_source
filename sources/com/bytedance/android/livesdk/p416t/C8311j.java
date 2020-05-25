package com.bytedance.android.livesdk.p416t;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.bytedance.android.livesdk.p416t.C8302f.C8304a;
import com.bytedance.android.livesdk.p416t.p418b.C8287c;

/* renamed from: com.bytedance.android.livesdk.t.j */
final /* synthetic */ class C8311j implements OnCancelListener {

    /* renamed from: a */
    private final C8304a f22654a;

    /* renamed from: b */
    private final C8287c f22655b;

    C8311j(C8304a aVar, C8287c cVar) {
        this.f22654a = aVar;
        this.f22655b = cVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C8304a aVar = this.f22654a;
        this.f22655b.mo14466b();
    }
}

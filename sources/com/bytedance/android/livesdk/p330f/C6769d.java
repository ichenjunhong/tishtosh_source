package com.bytedance.android.livesdk.p330f;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.bytedance.android.livesdk.C4494aa;

/* renamed from: com.bytedance.android.livesdk.f.d */
final /* synthetic */ class C6769d implements OnShowListener {

    /* renamed from: a */
    private final C6768c f18544a;

    C6769d(C6768c cVar) {
        this.f18544a = cVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C6768c cVar = this.f18544a;
        C4494aa.m10815a().mo10295b();
        if (cVar.f18542h != null) {
            cVar.f18542h.onShow(cVar);
        }
    }
}

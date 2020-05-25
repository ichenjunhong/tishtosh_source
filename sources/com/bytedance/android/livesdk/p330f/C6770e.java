package com.bytedance.android.livesdk.p330f;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.livesdk.C4494aa;

/* renamed from: com.bytedance.android.livesdk.f.e */
final /* synthetic */ class C6770e implements OnDismissListener {

    /* renamed from: a */
    private final C6768c f18545a;

    C6770e(C6768c cVar) {
        this.f18545a = cVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C6768c cVar = this.f18545a;
        C4494aa.m10815a().mo10296c();
        if (cVar.f18543i != null) {
            cVar.f18543i.onDismiss(cVar);
        }
    }
}

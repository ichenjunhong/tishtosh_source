package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.livesdk.p272ad.C4525b;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.p */
final /* synthetic */ class C3350p implements OnDismissListener {

    /* renamed from: a */
    private final C3344m f9625a;

    C3350p(C3344m mVar) {
        this.f9625a = mVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C3344m mVar = this.f9625a;
        mVar.f9613d.setCurrentItem(((Integer) C4525b.f12377at.mo10345a()).intValue());
        if (mVar.f9616g != null) {
            mVar.f9616g.onDismiss(dialogInterface);
        }
    }
}

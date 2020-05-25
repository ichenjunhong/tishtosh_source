package com.bytedance.android.livesdk.p279af;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.af.q */
final /* synthetic */ class C4607q implements OnClickListener {

    /* renamed from: a */
    private final C4606p f12584a;

    C4607q(C4606p pVar) {
        this.f12584a = pVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4606p pVar = this.f12584a;
        switch (i) {
            case 0:
                C4581b.m11003a(pVar.f12570a, pVar.f12571b, 40003);
                return;
            case 1:
                C4581b.m11004a(pVar.f12570a, pVar.f12571b, 40004, pVar.f12572c, pVar.mo10400d());
                return;
            case 2:
                if (pVar.f12573d != null) {
                    pVar.f12573d.mo8916b_();
                    break;
                }
                break;
        }
    }
}

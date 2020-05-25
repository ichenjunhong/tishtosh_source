package com.bytedance.android.livesdk.gift.dialog.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.l */
final /* synthetic */ class C7273l implements OnClickListener {

    /* renamed from: a */
    private final C7267i f19780a;

    C7273l(C7267i iVar) {
        this.f19780a = iVar;
    }

    public final void onClick(View view) {
        C7267i iVar = this.f19780a;
        if (iVar.f19758a.mo13536a(new C7289a(7, null))) {
            iVar.f19770m.mo13487b(new C7275n(iVar));
            iVar.f19767j.setVisibility(8);
            iVar.f19770m.setVisibility(0);
            iVar.mo13511a();
        }
    }
}

package com.bytedance.android.livesdk.gift.dialog.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.k */
final /* synthetic */ class C7272k implements OnClickListener {

    /* renamed from: a */
    private final C7267i f19779a;

    C7272k(C7267i iVar) {
        this.f19779a = iVar;
    }

    public final void onClick(View view) {
        C7267i iVar = this.f19779a;
        if (!(iVar.f19768k instanceof C7497h) || !(iVar.f19768k.f20516d instanceof Prop) || ((Prop) iVar.f19768k.f20516d).propType != 4) {
            if (iVar.f19758a.mo13536a(new C7289a(7, null))) {
                iVar.f19767j.setVisibility(8);
                iVar.f19770m.setVisibility(0);
                iVar.f19770m.mo13486a(new C7274m(iVar));
                iVar.mo13511a();
            }
            return;
        }
        iVar.f19758a.mo13536a(new C7289a(14, null));
    }
}

package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.livesdkapi.depend.model.C8688c;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.d */
final /* synthetic */ class C3305d implements OnClickListener {

    /* renamed from: a */
    private final C3302c f9511a;

    /* renamed from: b */
    private final int f9512b;

    C3305d(C3302c cVar, int i) {
        this.f9511a = cVar;
        this.f9512b = i;
    }

    public final void onClick(View view) {
        C3302c cVar = this.f9511a;
        int i = this.f9512b;
        if (cVar.f9501f) {
            C8688c cVar2 = (C8688c) cVar.f9499d.get(i);
            if (cVar.f9498c == null || !cVar.f9498c.mo15141a(cVar2)) {
                if (!cVar.f9496a.mo8282a(cVar2)) {
                    cVar.f9500e = cVar2;
                    cVar.f9496a.mo8281a(C3037b.f8913a, cVar2, (C3044a) cVar);
                } else {
                    if (!(cVar.f9498c == null || cVar.f9498c.f23744e == cVar2.f23744e || cVar.f9497b == null)) {
                        cVar.f9497b.mo8685a(Boolean.valueOf(false), cVar.f9498c);
                    }
                    C8688c cVar3 = cVar.f9498c;
                    cVar.f9498c = cVar2;
                    if (cVar3 != null && cVar.f9499d.contains(cVar3)) {
                        int indexOf = cVar.f9499d.indexOf(cVar3);
                        if (indexOf >= 0) {
                            cVar.notifyItemChanged(indexOf);
                        }
                    }
                    if (cVar.f9497b != null) {
                        cVar.f9497b.mo8685a(Boolean.valueOf(true), cVar.f9498c);
                    }
                }
                cVar.mo8675a(cVar2);
                cVar.notifyItemChanged(i);
            }
        }
    }
}

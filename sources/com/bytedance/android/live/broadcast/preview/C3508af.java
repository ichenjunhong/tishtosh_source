package com.bytedance.android.live.broadcast.preview;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.af */
final /* synthetic */ class C3508af implements C1710e {

    /* renamed from: a */
    private final C3589i f9998a;

    C3508af(C3589i iVar) {
        this.f9998a = iVar;
    }

    public final void accept(Object obj) {
        C3589i iVar = this.f9998a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null && !TextUtils.isEmpty(((Room) dVar.data).title())) {
            iVar.f10246d.setText(((Room) dVar.data).title());
        }
    }
}

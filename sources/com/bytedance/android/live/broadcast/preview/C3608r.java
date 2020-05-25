package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.C3455c;
import com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.r */
final /* synthetic */ class C3608r implements C1710e {

    /* renamed from: a */
    private final C3589i f10287a;

    C3608r(C3589i iVar) {
        this.f10287a = iVar;
    }

    public final void accept(Object obj) {
        C3589i iVar = this.f10287a;
        C3455c cVar = (C3455c) ((C4177d) obj).data;
        if (cVar != null) {
            if (cVar.f9885b) {
                iVar.f10266x.unload(iVar.f10267y);
                iVar.f10267y = new SelectLiveTypeWidget();
                iVar.f10266x.load(R.id.euo, iVar.f10267y);
                iVar.mo8352a(C8710m.valueOf((String) C4525b.f12314J.mo10345a()));
                return;
            }
            iVar.f10266x.unload(iVar.f10267y);
            iVar.mo8352a(C8710m.VIDEO);
        }
    }
}

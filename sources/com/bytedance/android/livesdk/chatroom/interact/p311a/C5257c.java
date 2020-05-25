package com.bytedance.android.livesdk.chatroom.interact.p311a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5252a.C5255c;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.c */
final /* synthetic */ class C5257c implements OnClickListener {

    /* renamed from: a */
    private final C5255c f14067a;

    C5257c(C5255c cVar) {
        this.f14067a = cVar;
    }

    public final void onClick(View view) {
        C5255c cVar = this.f14067a;
        if (C5252a.this.f14052b == null || C5252a.this.f14052b.size() == 0) {
            C5252a.this.f14053c.mo11106b(cVar.f14064b);
            return;
        }
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        Iterator it = C5252a.this.f14052b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (b == ((C5696e) it.next()).f14953d.getId()) {
                    break;
                }
            } else {
                C5252a.this.f14053c.mo11106b(cVar.f14064b);
                break;
            }
        }
    }
}

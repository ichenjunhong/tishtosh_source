package com.bytedance.android.livesdk.commonpop;

import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.message.model.C8006q;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.commonpop.a */
public final class C6714a extends C5868cl<C6715b> implements OnMessageListener {
    /* renamed from: a */
    public final void mo8520a(C6715b bVar) {
        super.mo8520a(bVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.COMMON_POPUP_MESSAGE.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        boolean z;
        if (!(mo8518c() == null || iMessage == null || !(iMessage instanceof C8006q))) {
            C8006q qVar = (C8006q) iMessage;
            boolean z2 = qVar.f21898b;
            if (this.f15366s != null) {
                z = ((Boolean) this.f15366s.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(qVar.f21897a) && mo8518c() != null) {
                if (z2 || !z) {
                    C3837e.m9744a("ttlive_show_common_dialog", 0, new JSONObject());
                    ((C6715b) mo8518c()).mo12831a(qVar.f21897a);
                    try {
                        C3831a.m9707a("COMMON_POPUP_DIALOG_SHOW", qVar.f21897a);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}

package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ai */
final /* synthetic */ class C6447ai implements C1710e {

    /* renamed from: a */
    private final DecorationWrapperWidget f17748a;

    /* renamed from: b */
    private final C8721u f17749b;

    C6447ai(DecorationWrapperWidget decorationWrapperWidget, C8721u uVar) {
        this.f17748a = decorationWrapperWidget;
        this.f17749b = uVar;
    }

    public final void accept(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f17748a;
        C8721u uVar = this.f17749b;
        Long l = (Long) obj;
        if (uVar != null) {
            boolean z = uVar.f23946g == 1;
            long id = decorationWrapperWidget.f16939f != null ? decorationWrapperWidget.f16939f.getId() : 0;
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(id));
            hashMap.put("prop_id", String.valueOf(uVar.f23947h));
            if (z) {
                hashMap.put("words", uVar.f23943d);
            }
            if (!(decorationWrapperWidget.f16939f == null || decorationWrapperWidget.f16939f.getOwner() == null)) {
                hashMap.put("anchor_id", String.valueOf(decorationWrapperWidget.f16939f.getOwner().getId()));
            }
            C8049c.m15979a().mo14202a(z ? "live_character_prop_effective_use" : "live_picture_prop_effective_use", hashMap, new C8059j().mo14213a("live_take_detail").mo14218f("other").mo14214b("live_take"), new C8060k());
            if (z) {
                decorationWrapperWidget.f16935b = true;
                return;
            }
            decorationWrapperWidget.f16934a = true;
        }
    }
}

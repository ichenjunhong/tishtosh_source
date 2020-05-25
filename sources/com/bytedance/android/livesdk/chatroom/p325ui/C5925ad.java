package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.chatroom.presenter.C5891t;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ad */
final /* synthetic */ class C5925ad implements OnClickListener {

    /* renamed from: a */
    private final FastGiftView f15594a;

    C5925ad(FastGiftView fastGiftView) {
        this.f15594a = fastGiftView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FastGiftView fastGiftView = this.f15594a;
        fastGiftView.f15473e.f15412b = false;
        Set set = (Set) C4525b.f12325U.mo10345a();
        if (set == null) {
            set = new HashSet();
        }
        set.add(String.valueOf(C5891t.m12825d().f20543d));
        C4525b.f12325U.mo10346a(set);
        dialogInterface.dismiss();
        fastGiftView.mo11809e();
        HashMap hashMap = new HashMap();
        hashMap.put("button_type", "send");
        C8049c.m15979a().mo14202a("shortcut_popup_click", hashMap, Room.class, C8059j.class);
    }
}

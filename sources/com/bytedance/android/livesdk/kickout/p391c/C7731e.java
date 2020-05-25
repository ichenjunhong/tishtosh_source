package com.bytedance.android.livesdk.kickout.p391c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p399o.C8049c;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.c.e */
final /* synthetic */ class C7731e implements OnClickListener {

    /* renamed from: a */
    private final C7726b f21261a;

    /* renamed from: b */
    private final Map f21262b;

    /* renamed from: c */
    private final String f21263c;

    /* renamed from: d */
    private final User f21264d;

    C7731e(C7726b bVar, Map map, String str, User user) {
        this.f21261a = bVar;
        this.f21262b = map;
        this.f21263c = str;
        this.f21264d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7726b bVar = this.f21261a;
        Map map = this.f21262b;
        String str = this.f21263c;
        User user = this.f21264d;
        String str2 = bVar.f21249h.equals("activity_banned_talk") ? "livesdk_anchor_mute_cancel_toast_click" : "livesdk_anchor_blacklist_cancel_toast_click";
        map.put("action_type", "yes");
        C8049c.m15979a().mo14202a(str2, map, new Object[0]);
        bVar.f21244c.setVisibility(0);
        bVar.f21243b.setVisibility(8);
        if (str.equals("activity_kick_out")) {
            bVar.f21250i.mo14059a(false, bVar.f21253l, user.getId());
        } else {
            bVar.f21251j.mo12852a(false, bVar.f21253l, user.getId(), user.getSecUid());
        }
        dialogInterface.dismiss();
    }
}

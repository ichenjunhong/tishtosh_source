package com.bytedance.android.livesdk.kickout.p391c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.c.d */
final /* synthetic */ class C7730d implements OnClickListener {

    /* renamed from: a */
    private final C7726b f21259a;

    /* renamed from: b */
    private final Map f21260b;

    C7730d(C7726b bVar, Map map) {
        this.f21259a = bVar;
        this.f21260b = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7726b bVar = this.f21259a;
        Map map = this.f21260b;
        String str = bVar.f21249h.equals("activity_banned_talk") ? "livesdk_anchor_mute_cancel_toast_click" : "livesdk_anchor_blacklist_cancel_toast_click";
        map.put("action_type", "no");
        C8049c.m15979a().mo14202a(str, map, new Object[0]);
        dialogInterface.dismiss();
    }
}

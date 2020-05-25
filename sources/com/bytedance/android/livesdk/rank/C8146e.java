package com.bytedance.android.livesdk.rank;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.C5184d;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.rank.e */
final /* synthetic */ class C8146e implements OnClickListener {

    /* renamed from: a */
    private final C8127b f22241a;

    /* renamed from: b */
    private final C5184d f22242b;

    /* renamed from: c */
    private final HashMap f22243c;

    /* renamed from: d */
    private final boolean f22244d;

    C8146e(C8127b bVar, C5184d dVar, HashMap hashMap, boolean z) {
        this.f22241a = bVar;
        this.f22242b = dVar;
        this.f22243c = hashMap;
        this.f22244d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C8127b bVar = this.f22241a;
        C5184d dVar = this.f22242b;
        HashMap hashMap = this.f22243c;
        boolean z = this.f22244d;
        dialogInterface.dismiss();
        bVar.mo14318a(dVar);
        hashMap.put("choose_type", "yes_never");
        C8049c.m15979a().mo14202a("livesdk_toast_click", hashMap, Room.class);
        if (z) {
            C4525b.f12355aX.mo10346a(Boolean.valueOf(false));
        }
    }
}

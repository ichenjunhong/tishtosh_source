package com.bytedance.android.livesdk.rank;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.rank.f */
final /* synthetic */ class C8166f implements OnClickListener {

    /* renamed from: a */
    private final HashMap f22303a;

    C8166f(HashMap hashMap) {
        this.f22303a = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HashMap hashMap = this.f22303a;
        dialogInterface.dismiss();
        hashMap.put("choose_type", "cancel");
        C8049c.m15979a().mo14202a("livesdk_toast_click", hashMap, Room.class);
    }
}

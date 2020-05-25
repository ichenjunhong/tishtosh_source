package com.bytedance.android.livesdk.chatroom.interact.p322k;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.k.c */
final /* synthetic */ class C5653c implements OnClickListener {

    /* renamed from: a */
    private final C5647a f14811a;

    C5653c(C5647a aVar) {
        this.f14811a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5647a aVar = this.f14811a;
        dialogInterface.dismiss();
        C8302f.m16453a((Activity) aVar.f14784a).mo14484a(new C8288d() {
            /* renamed from: a */
            public final void mo9068a(String... strArr) {
                C5647a.this.f14796m.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(1));
            }

            /* renamed from: b */
            public final void mo9069b(String... strArr) {
                C4204a.m10421a(C5647a.this.f14784a, (int) R.string.emh);
            }
        }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
    }
}

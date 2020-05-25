package com.bytedance.android.livesdk.chatroom.interact.p322k;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.p279af.C4563ad;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.k.e */
final /* synthetic */ class C5655e implements OnClickListener {

    /* renamed from: a */
    private final C56514 f14813a;

    /* renamed from: b */
    private final boolean f14814b;

    C5655e(C56514 r1, boolean z) {
        this.f14813a = r1;
        this.f14814b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C56514 r6 = this.f14813a;
        boolean z = this.f14814b;
        dialogInterface.dismiss();
        if (C5647a.this.f14796m != null) {
            C5647a.this.f14796m.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(z ? 5 : 9));
        }
        if (!z) {
            C4563ad.m10956a(C5647a.this.f14792i, "shutdown_connection", "guest_cancel", false);
        }
    }
}

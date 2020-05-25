package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p030v4.app.C0621ad;
import android.support.p043v7.app.C1160b.C1161a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.chatroom.event.C5162ah;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;
import p2658e.p2659a.p2660a.p2661a.p2662a.C53032a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ba */
final /* synthetic */ class C4863ba implements C1710e {

    /* renamed from: a */
    private final SubscribeMatchMethod f13093a;

    /* renamed from: b */
    private final int f13094b;

    /* renamed from: c */
    private final C10783f f13095c;

    C4863ba(SubscribeMatchMethod subscribeMatchMethod, int i, C10783f fVar) {
        this.f13093a = subscribeMatchMethod;
        this.f13094b = i;
        this.f13095c = fVar;
    }

    public final void accept(Object obj) {
        SubscribeMatchMethod subscribeMatchMethod = this.f13093a;
        int i = this.f13094b;
        C10783f fVar = this.f13095c;
        C4177d dVar = (C4177d) obj;
        if (i != 1) {
            C4204a.m10421a(fVar.f28972a, (int) R.string.hwr);
        } else if (C0621ad.m1696a(fVar.f28972a).mo2144a()) {
            new C1161a(fVar.f28972a).mo3768b((int) R.string.hwv).mo3759a((int) R.string.hwu, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
            }).mo3772b().show();
        } else {
            new C1161a(fVar.f28972a).mo3768b((int) R.string.hww).mo3769b((int) R.string.hws, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
            }).mo3759a((int) R.string.hwt, (OnClickListener) new OnClickListener(fVar) {

                /* renamed from: a */
                final /* synthetic */ C10783f f13025a;

                {
                    this.f13025a = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent b = C53032a.m112778b(this.f13025a.f28972a);
                    if (b != null) {
                        this.f13025a.f28972a.startActivity(b);
                    }
                }
            }).mo3772b().show();
        }
        C5162ah ahVar = new C5162ah();
        ahVar.f13841a = true;
        C4495a.m10823a().mo10301a((Object) ahVar);
    }
}

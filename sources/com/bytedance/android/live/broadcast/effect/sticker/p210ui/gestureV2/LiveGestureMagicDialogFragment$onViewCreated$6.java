package com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.SwitchCompat;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$onViewCreated$6 */
public final class LiveGestureMagicDialogFragment$onViewCreated$6 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ C3310a f9527a;

    /* renamed from: e */
    public final boolean mo4742e() {
        SwitchCompat switchCompat = (SwitchCompat) this.f9527a.mo8690b(R.id.akf);
        C52711k.m112236a((Object) switchCompat, "gesture_magic_switch");
        return switchCompat.isChecked();
    }

    LiveGestureMagicDialogFragment$onViewCreated$6(C3310a aVar, Context context, int i, boolean z) {
        this.f9527a = aVar;
        super(context, 0, false);
    }
}

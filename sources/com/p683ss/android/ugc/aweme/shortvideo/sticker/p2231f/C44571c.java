package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2231f;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39610bo;
import com.p683ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p683ss.android.ugc.aweme.sticker.C46049k;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f.c */
public final class C44571c implements C39610bo {
    /* renamed from: a */
    public final void mo80685a(Context context, String str, Effect effect) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "from");
    }

    /* renamed from: a */
    public final String mo80683a() {
        String str = C44566a.f112753a;
        C52711k.m112236a((Object) str, "UnlockStickerOperationHelper.getShotFrom()");
        return str;
    }

    /* renamed from: a */
    public final void mo80684a(Context context) {
        C52711k.m112240b(context, "context");
        C44566a.m97504a(context);
    }

    /* renamed from: a */
    public final C46049k mo80682a(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2) {
        C52711k.m112240b(str, "shotFrom");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(onUnlockShareFinishListener, "listener");
        C44567b bVar = new C44567b(str, context, effect, onUnlockShareFinishListener, true, z2);
        return bVar;
    }
}

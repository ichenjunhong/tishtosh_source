package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8003o;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.e */
public final class C5089e extends C5084b<C8003o> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C8003o) this.f13643a).f21877a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11753b(((C8003o) this.f13643a).f21877a, "", " ", R.color.agf, R.color.agg, false);
    }

    public C5089e(C8003o oVar) {
        super(oVar);
    }
}

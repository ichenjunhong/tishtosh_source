package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.i */
public final class C5095i extends C5084b<C8017z> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C8017z) this.f13643a).f21944a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        return C5113y.m11753b(((C8017z) this.f13643a).f21944a, "：", ((C8017z) this.f13643a).baseMessage.f24135f, R.color.a_y, R.color.alt, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        String str = ((C8017z) this.f13643a).baseMessage.f24135f;
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11753b(((C8017z) this.f13643a).f21944a, "：", str, R.color.agf, R.color.agi, false);
    }

    public C5095i(C8017z zVar) {
        super(zVar);
    }
}

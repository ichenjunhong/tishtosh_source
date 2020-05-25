package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C7850bs;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.t */
public final class C5108t extends C5084b<C7850bs> {
    /* renamed from: e */
    public final User mo10980e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        if (this.f13643a == null || TextUtils.isEmpty(((C7850bs) this.f13643a).f21691b)) {
            return C5115z.f13664a;
        }
        String str = ((C7850bs) this.f13643a).f21691b;
        C4514j.m10883j().mo10327h();
        return C5113y.m11751a(str, (int) R.color.agf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        if (this.f13643a == null || TextUtils.isEmpty(((C7850bs) this.f13643a).f21691b)) {
            return C5115z.f13664a;
        }
        return C5113y.m11751a(((C7850bs) this.f13643a).f21691b, (int) R.color.a_y);
    }

    public C5108t(C7850bs bsVar) {
        super(bsVar);
    }
}

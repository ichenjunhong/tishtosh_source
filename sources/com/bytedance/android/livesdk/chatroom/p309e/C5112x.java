package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C7871cl;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.x */
public final class C5112x extends C5084b<C7871cl> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7871cl) this.f13643a).f21796b;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        if (this.f13643a == null) {
            return super.mo10988k();
        }
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        return C5113y.m11750a(((C7871cl) this.f13643a).f21796b, "  ", ((C7871cl) this.f13643a).mo14161a(), R.color.a_y, R.color.alt, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11750a(((C7871cl) this.f13643a).f21796b, "  ", ((C7871cl) this.f13643a).mo14161a(), R.color.agf, R.color.agf, false);
    }

    public C5112x(C7871cl clVar) {
        super(clVar);
    }
}

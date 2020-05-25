package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.w */
public final class C5111w extends C5084b<C7869cj> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C7869cj) this.f13643a).f21788c;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11753b(((C7869cj) this.f13643a).f21788c, "：", ((C7869cj) this.f13643a).f21787b, R.color.agf, R.color.agg, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        String str = ((C7869cj) this.f13643a).f21787b;
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        return C5113y.m11753b(((C7869cj) this.f13643a).f21788c, "：", str, R.color.agf, R.color.agg, false);
    }

    public C5111w(C7869cj cjVar) {
        super(cjVar);
    }
}

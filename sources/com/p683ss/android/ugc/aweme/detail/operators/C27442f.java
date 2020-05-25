package com.p683ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.f */
public final class C27442f extends C27403a<C24559a, C26876b<C24559a>> {

    /* renamed from: a */
    private String f72214a;

    public final int getPageType(int i) {
        if (TextUtils.equals("from_discovery_challenge", this.f72214a)) {
            return 9000;
        }
        return i + 3000;
    }

    public C27442f(C26875a aVar, String str) {
        C24559a aVar2;
        if (aVar instanceof C24559a) {
            aVar2 = (C24559a) aVar;
        } else {
            aVar2 = new C24559a();
        }
        this.mModel = aVar2;
        this.mPresenter = new C26876b();
        this.f72214a = str;
        if (TextUtils.equals("from_discovery_challenge", this.f72214a) && this.mModel != null) {
            ((C24559a) this.mModel).mo50331a("discovery_challenge_video");
        }
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C26876b bVar2 = this.mPresenter;
        isDataEmpty();
        bVar2.mo44934a_(Integer.valueOf(i), bVar.getChallengeId(), Integer.valueOf(bVar.getVideoType()), Boolean.valueOf(false));
    }
}

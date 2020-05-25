package com.p683ss.android.ugc.aweme.commercialize.feed;

import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.indicationlink.C25943b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.q */
final /* synthetic */ class C25920q implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f68458a;

    /* renamed from: b */
    private final int f68459b;

    /* renamed from: c */
    private final int f68460c;

    /* renamed from: d */
    private final int f68461d;

    /* renamed from: e */
    private final int f68462e;

    C25920q(CommerceVideoDelegate commerceVideoDelegate, int i, int i2, int i3, int i4) {
        this.f68458a = commerceVideoDelegate;
        this.f68459b = i;
        this.f68460c = i2;
        this.f68461d = i3;
        this.f68462e = i4;
    }

    public final void run() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68458a;
        int i = this.f68459b;
        int i2 = this.f68460c;
        int i3 = this.f68461d;
        int i4 = this.f68462e;
        DataCenter dataCenter = commerceVideoDelegate.f68306h;
        String str = "ON_PROGRESS_FORWARD";
        C25943b bVar = new C25943b(commerceVideoDelegate.f68309k.mo54203d(), (long) (i + i2), i3 == i4);
        dataCenter.mo48228a(str, (Object) bVar);
        if (i3 == i4) {
            commerceVideoDelegate.f68309k.mo54198a(350);
        }
    }
}

package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C7066p;
import com.bytedance.android.livesdk.feed.drawerfeed.p336a.C6867a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p331a.C6827p;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.h */
final /* synthetic */ class C6886h implements C3924b {

    /* renamed from: a */
    private final C7066p f18858a;

    C6886h(C7066p pVar) {
        this.f18858a = pVar;
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        C6792a aVar;
        C7066p pVar = this.f18858a;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bxj, viewGroup, false);
        if (objArr.length <= 0 || !(objArr[0] instanceof C6827p)) {
            aVar = null;
            feedDataKey = null;
        } else {
            C6827p pVar2 = objArr[0];
            FeedDataKey a = pVar2.mo13001a();
            aVar = pVar2.mo13002b();
            feedDataKey = a;
        }
        C6867a aVar2 = new C6867a(inflate, aVar, feedDataKey, (objArr.length <= 2 || !(objArr[2] instanceof C2180b)) ? null : objArr[2], (objArr.length <= 3 || !(objArr[3] instanceof C2180b)) ? null : objArr[3], (objArr.length <= 4 || !(objArr[4] instanceof C2180b)) ? null : objArr[4], pVar, viewGroup);
        return aVar2;
    }
}

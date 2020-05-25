package com.bytedance.android.livesdk.feed.p344l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.C7066p;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p331a.C6827p;
import com.bytedance.android.livesdk.feed.p341i.C6967ah;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.l.f */
public final /* synthetic */ class C7019f implements C3924b {

    /* renamed from: a */
    private final C7066p f19172a;

    public C7019f(C7066p pVar) {
        this.f19172a = pVar;
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        C6792a aVar;
        C7066p pVar = this.f19172a;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aph, viewGroup, false);
        if (objArr.length <= 0 || !(objArr[0] instanceof C6827p)) {
            aVar = null;
            feedDataKey = null;
        } else {
            C6827p pVar2 = objArr[0];
            FeedDataKey a = pVar2.mo13001a();
            aVar = pVar2.mo13002b();
            feedDataKey = a;
        }
        C6967ah ahVar = new C6967ah(inflate, aVar, feedDataKey, (objArr.length <= 2 || !(objArr[2] instanceof C2180b)) ? null : objArr[2], (objArr.length <= 3 || !(objArr[3] instanceof C2180b)) ? null : objArr[3], (objArr.length <= 4 || !(objArr[4] instanceof C2180b)) ? null : objArr[4], pVar);
        return ahVar;
    }
}

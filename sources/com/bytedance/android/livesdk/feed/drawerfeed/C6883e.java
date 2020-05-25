package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.drawerfeed.p336a.C6878l;
import com.bytedance.android.livesdk.feed.p331a.C6827p;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.e */
final /* synthetic */ class C6883e implements C3924b {

    /* renamed from: a */
    private final C6861a f18849a;

    /* renamed from: b */
    private final C6957i f18850b;

    /* renamed from: c */
    private final C7023m f18851c;

    /* renamed from: d */
    private final C8757g f18852d;

    C6883e(C6861a aVar, C6957i iVar, C7023m mVar, C8757g gVar) {
        this.f18849a = aVar;
        this.f18850b = iVar;
        this.f18851c = mVar;
        this.f18852d = gVar;
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        C6861a aVar = this.f18849a;
        C6957i iVar = this.f18850b;
        C7023m mVar = this.f18851c;
        C8757g gVar = this.f18852d;
        C6878l lVar = new C6878l(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bwq, viewGroup, false), aVar, iVar, (objArr.length <= 0 || !(objArr[0] instanceof C6827p)) ? null : objArr[0].mo13001a(), mVar, gVar, (objArr.length <= 1 || !(objArr[1] instanceof C2180b)) ? null : objArr[1], (objArr.length <= 4 || !(objArr[4] instanceof C2180b)) ? null : objArr[4], (objArr.length <= 2 || !(objArr[2] instanceof C2180b)) ? null : objArr[2], (objArr.length <= 3 || !(objArr[3] instanceof C2180b)) ? null : objArr[3], viewGroup);
        return lVar;
    }
}

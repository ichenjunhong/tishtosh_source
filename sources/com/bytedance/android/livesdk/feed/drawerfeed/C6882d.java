package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.p331a.C6827p;
import com.bytedance.android.livesdk.feed.p341i.C6966ag;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.d */
final /* synthetic */ class C6882d implements C3924b {

    /* renamed from: a */
    private final C6861a f18845a;

    /* renamed from: b */
    private final C6957i f18846b;

    /* renamed from: c */
    private final C7023m f18847c;

    /* renamed from: d */
    private final C8757g f18848d;

    C6882d(C6861a aVar, C6957i iVar, C7023m mVar, C8757g gVar) {
        this.f18845a = aVar;
        this.f18846b = iVar;
        this.f18847c = mVar;
        this.f18848d = gVar;
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        C6861a aVar = this.f18845a;
        C6957i iVar = this.f18846b;
        C7023m mVar = this.f18847c;
        C8757g gVar = this.f18848d;
        C6966ag agVar = new C6966ag(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aln, viewGroup, false), aVar, iVar, (objArr.length <= 0 || !(objArr[0] instanceof C6827p)) ? null : objArr[0].mo13001a(), mVar, gVar, (objArr.length <= 1 || !(objArr[1] instanceof C2180b)) ? null : objArr[1], (objArr.length <= 4 || !(objArr[4] instanceof C2180b)) ? null : objArr[4], (objArr.length <= 2 || !(objArr[2] instanceof C2180b)) ? null : objArr[2], (objArr.length <= 3 || !(objArr[3] instanceof C2180b)) ? null : objArr[3]);
        return agVar;
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.widget;

import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.d */
final /* synthetic */ class C45602d implements C1710e {

    /* renamed from: a */
    private final C45564a f115348a;

    C45602d(C45564a aVar) {
        this.f115348a = aVar;
    }

    public final void accept(Object obj) {
        C45564a aVar = this.f115348a;
        C52847n nVar = (C52847n) obj;
        Integer num = (Integer) nVar.getFirst();
        aVar.f115151b[num.intValue()] = nVar;
        if (aVar.f115152c) {
            aVar.f115152c = false;
            aVar.notifyDataSetChanged();
            return;
        }
        aVar.notifyItemChanged(num.intValue());
    }
}

package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.p1057b.p1058a.C17418j;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43192a;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bh */
public final /* synthetic */ class C42462bh implements C2205y {

    /* renamed from: a */
    private final ShortVideoContext f107376a;

    public C42462bh(ShortVideoContext shortVideoContext) {
        this.f107376a = shortVideoContext;
    }

    public final void subscribe(C2204x xVar) {
        ShortVideoContext shortVideoContext = this.f107376a;
        C43203d dVar = shortVideoContext.f107070aV;
        if (TextUtils.isEmpty(shortVideoContext.f107112e)) {
            xVar.mo6282a(C17418j.absent());
            xVar.mo6273a();
        } else if (dVar == null || !TextUtils.equals(dVar.getMusicPath(), shortVideoContext.f107112e)) {
            C43191e.m94743a(shortVideoContext.f107112e, 7, (C43192a) new C42463bi(shortVideoContext, xVar));
        } else {
            xVar.mo6282a(C17418j.m42647of(dVar));
            xVar.mo6273a();
        }
    }
}

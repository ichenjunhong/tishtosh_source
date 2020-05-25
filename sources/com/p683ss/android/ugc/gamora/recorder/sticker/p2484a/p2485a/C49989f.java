package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43909b;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C49997c;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C49998d;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49982e.C49983a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.f */
public final class C49989f implements C12356a, C49998d {

    /* renamed from: a */
    private final C12361b f125253a;

    /* renamed from: b */
    private final C43909b f125254b;

    /* renamed from: c */
    private final C52670a<C49983a> f125255c;

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125253a;
    }

    /* renamed from: a */
    public final C49997c mo97771a(C50048n nVar) {
        C52711k.m112240b(nVar, "stickerApiComponent");
        C49982e eVar = new C49982e(this.f125255c, (AppCompatActivity) mo23370j().mo23373a(AppCompatActivity.class, (String) null), nVar, (ShortVideoContext) mo23370j().mo23373a(ShortVideoContext.class, (String) null), this.f125254b);
        return eVar;
    }

    public C49989f(C12361b bVar, C43909b bVar2, C52670a<C49983a> aVar) {
        C52711k.m112240b(bVar, "diContainer");
        C52711k.m112240b(bVar2, "challengeStickerListener");
        C52711k.m112240b(aVar, "stateSupplier");
        this.f125253a = bVar;
        this.f125254b = bVar2;
        this.f125255c = aVar;
    }
}

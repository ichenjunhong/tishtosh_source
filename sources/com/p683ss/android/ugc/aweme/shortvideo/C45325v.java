package com.p683ss.android.ugc.aweme.shortvideo;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v */
public final class C45325v {

    /* renamed from: e */
    public static final long f114600e = C39618d.f101151O.mo83119c(C40796a.LongVideoThreshold);

    /* renamed from: f */
    public static final C45326a f114601f = new C45326a(null);

    /* renamed from: a */
    public final FragmentActivity f114602a;

    /* renamed from: b */
    public final C45004a f114603b;

    /* renamed from: c */
    public final C49607a f114604c;

    /* renamed from: d */
    public final ShortVideoContext f114605d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v$a */
    public static final class C45326a {
        private C45326a() {
        }

        public /* synthetic */ C45326a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C49850a mo91604a() {
        return (C49850a) C2755a.m7851a(this.f114602a).mo7341b(C49850a.class);
    }

    /* renamed from: b */
    public final long mo91605b() {
        C46066a aVar = this.f114605d.f107126s;
        if (aVar != null) {
            return aVar.getMaxDuration();
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo91606c() {
        C46066a aVar = this.f114605d.f107126s;
        if (aVar == null || aVar.isMultiBgVideo()) {
            return false;
        }
        return true;
    }

    public C45325v(FragmentActivity fragmentActivity, C45004a aVar, C49607a aVar2, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aVar, "cameraApi");
        C52711k.m112240b(aVar2, "chooseMusicApi");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f114602a = fragmentActivity;
        this.f114603b = aVar;
        this.f114604c = aVar2;
        this.f114605d = shortVideoContext;
    }
}

package com.p683ss.android.ugc.aweme.shortvideo;

import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45016ah;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2224b.C44451a;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.tools.C46807aa;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import p2628d.C52855s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fb */
public final class C43807fb {

    /* renamed from: a */
    private static final long f110942a = C39618d.f101151O.mo83119c(C40796a.LongVideoThreshold);

    /* renamed from: b */
    private C49850a f110943b;

    /* renamed from: c */
    private ShortVideoContext f110944c;

    /* renamed from: d */
    private FragmentActivity f110945d;

    /* renamed from: e */
    private C45004a f110946e;

    public final void onEvent(C46807aa aaVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        C42475bt btVar;
        C45016ah ahVar;
        String str;
        boolean z;
        boolean z2;
        C46807aa aaVar2 = aaVar;
        if (this.f110943b == null) {
            this.f110943b = (C49850a) ApiCenter.m7844a(this.f110945d).mo7341b(C49850a.class);
        }
        if (aaVar2.f118269a) {
            C42482c b = C43214dh.m94817a().mo50201b();
            String str2 = this.f110944c.f107112e;
            if (aaVar2.f118270b) {
                j = 15000;
            } else {
                j = f110942a;
            }
            boolean z3 = false;
            if (b == null || TextUtils.isEmpty(str2)) {
                j2 = j;
                j3 = 0;
            } else {
                j3 = C42479bx.m93330a(b, str2);
                if (this.f110944c.mo86375p().isEmpty()) {
                    C49850a aVar = this.f110943b;
                    if (j3 > j) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar.mo97680a(z2);
                }
                j2 = Math.min(j3, j);
            }
            C46066a aVar2 = this.f110944c.f107126s;
            if (aVar2 != null) {
                j4 = aVar2.getMaxDuration();
            } else {
                j4 = 0;
            }
            if (j4 > 0) {
                C46066a aVar3 = this.f110944c.f107126s;
                if (aVar3 == null || aVar3.isMultiBgVideo()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    j2 = Math.min(j2, j4);
                }
            }
            if (this.f110944c.mo86362d()) {
                C52855s a = C44451a.m97277a(this.f110944c.f107036O, str2, b, j);
                j3 = ((Long) a.getFirst()).longValue();
                j2 = ((Long) a.getSecond()).longValue();
                j5 = ((Long) a.getThird()).longValue();
            } else {
                j5 = j2;
            }
            if (this.f110944c.mo86362d()) {
                btVar = new C42476bu().mo86607a(j, j5);
            } else {
                btVar = new C42476bu().mo86607a(j, j3);
            }
            this.f110944c.mo86361c();
            C45004a aVar4 = this.f110946e;
            if (aaVar2.f118270b) {
                ahVar = C45016ah.FORM_15S;
            } else {
                ahVar = C45016ah.FORM_60S;
            }
            aVar4.mo91326a(ahVar, !aaVar2.f118269a);
            this.f110944c.f107089ao = !aaVar2.f118270b;
            this.f110944c.f107110c = j2;
            this.f110946e.mo91330a(new C47324o(j5));
            if (btVar == C42475bt.MUSIC && !aaVar2.f118272d) {
                C49607a b2 = C49608a.m107073b(this.f110945d);
                if (b2 != null) {
                    b2.mo97518a(Integer.valueOf(1));
                }
            }
            if (this.f110944c.mo86375p().isEmpty() && b != null) {
                if (((long) b.shootDuration) > j || Math.abs(b.shootDuration - b.duration) >= 1000) {
                    this.f110943b.mo97680a(true);
                } else {
                    this.f110943b.mo97680a(false);
                }
            }
            C39618d.f101151O.mo83116a(C40796a.DurationMode, this.f110944c.f107089ao);
            C39666o oVar = (C39666o) C26888e.m65000a(C32463a.m75161a(), C39666o.class);
            if (oVar != null && !oVar.mo48457b(false)) {
                oVar.mo48460c(true);
            }
            if (aaVar2.f118271c == 2) {
                z3 = true;
            }
            if (!z3) {
                String str3 = "video_duration_select";
                C23089d a2 = C23089d.m56640a();
                String str4 = "to_status";
                if (aaVar2.f118270b) {
                    str = "15s";
                } else {
                    str = "60s";
                }
                C26890h.m65011a(str3, a2.mo47829a(str4, str).mo47829a("creation_id", this.f110944c.f107131x).mo47829a("shoot_way", this.f110944c.f107132y).mo47826a("draft_id", this.f110944c.f107022A).f61491a);
            }
        }
    }

    public C43807fb(FragmentActivity fragmentActivity, C45004a aVar, ShortVideoContext shortVideoContext) {
        this.f110944c = shortVideoContext;
        this.f110946e = aVar;
        this.f110945d = fragmentActivity;
    }
}

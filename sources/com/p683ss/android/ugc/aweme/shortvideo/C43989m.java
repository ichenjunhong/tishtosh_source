package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.tools.C46938d;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.m */
public final class C43989m {

    /* renamed from: a */
    private final long f111401a = C39618d.f101151O.mo83119c(C40796a.LongVideoThreshold);

    /* renamed from: b */
    private final long f111402b = 15000;

    /* renamed from: c */
    private final AppCompatActivity f111403c;

    /* renamed from: d */
    private final C45017b f111404d;

    /* renamed from: a */
    private final ShortVideoContext m96551a() {
        C0209x a = C0214z.m440a((FragmentActivity) this.f111403c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        return ((ShortVideoContextViewModel) a).f107134a;
    }

    /* renamed from: b */
    private final long m96552b() {
        C46066a aVar;
        ShortVideoContext a = m96551a();
        if (a != null) {
            aVar = a.f107126s;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.getMaxDuration();
        }
        return 0;
    }

    public final void onEvent(C46938d dVar) {
        C46066a aVar;
        boolean z;
        long j;
        long j2;
        C52711k.m112240b(dVar, "event");
        if (m96552b() > 0) {
            ShortVideoContext a = m96551a();
            if (a != null) {
                aVar = a.f107126s;
            } else {
                aVar = null;
            }
            if (aVar == null || aVar.isMultiBgVideo()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long b = m96552b();
                ShortVideoContext a2 = m96551a();
                if (a2 != null) {
                    if (a2.f107089ao) {
                        j = this.f111401a;
                    } else {
                        j = this.f111402b;
                    }
                    C42482c b2 = C43214dh.m94817a().mo50201b();
                    String str = a2.f107112e;
                    if (b2 == null || TextUtils.isEmpty(str)) {
                        j2 = j - a2.f107120m;
                    } else {
                        j2 = Math.min(j, C42479bx.m93330a(b2, str)) - a2.f107120m;
                    }
                    if (b > 0) {
                        j2 = Math.min(j2, b);
                    }
                    long j3 = a2.f107120m + j2;
                    a2.f107110c = j3;
                    this.f111404d.mo91330a(new C47324o(j3));
                }
            }
        }
    }

    public C43989m(AppCompatActivity appCompatActivity, C45017b bVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(bVar, "cameraLogicComponent");
        this.f111403c = appCompatActivity;
        this.f111404d = bVar;
    }
}

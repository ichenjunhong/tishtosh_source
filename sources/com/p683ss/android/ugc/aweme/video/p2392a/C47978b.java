package com.p683ss.android.ugc.aweme.video.p2392a;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCDNUrlTimeoutExperiment;
import com.p683ss.android.ugc.aweme.video.p2393b.C47992a;
import com.p683ss.android.ugc.aweme.video.p2393b.C47993b;
import com.p683ss.android.ugc.aweme.video.p2393b.C47994c;
import com.p683ss.android.ugc.aweme.video.p2393b.C47995d;
import com.p683ss.android.ugc.aweme.video.p2393b.C47996e;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.session.C50123b;
import com.p683ss.android.ugc.playerkit.videoview.p2496b.C50137c;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50145c;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50153i;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.video.a.b */
public final class C47978b implements C50137c {

    /* renamed from: a */
    private ArrayList<C50149g> f120606a = new ArrayList<>();

    /* renamed from: b */
    private volatile C50149g f120607b;

    public C47978b() {
        this.f120606a.add(new C47994c());
        this.f120606a.add(new C47995d());
        this.f120606a.add(C47993b.f120631a);
    }

    /* renamed from: a */
    public final C50145c mo95136a(C50123b bVar) {
        boolean z;
        if (this.f120607b == null) {
            synchronized (this) {
                if (this.f120607b == null) {
                    if (C48017a.m103960b() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        this.f120607b = new C47996e(C48107j.m104193f());
                    } else {
                        this.f120607b = new C47992a();
                    }
                    this.f120606a.add(this.f120607b);
                }
            }
        }
        return new C50153i(this.f120606a, C10181b.m20511a().mo18169a(VideoCDNUrlTimeoutExperiment.class, true, "cdn_url_timeout_time", 31744, (long) VideoCDNUrlTimeoutExperiment.DEFAULT_TIMEOUT));
    }
}

package com.p683ss.android.ugc.aweme.p1963ml;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.net.p1993f.C37771a;
import com.p683ss.android.ugc.aweme.p1963ml.p1964ab.SmartSpeedExperiment.C37102a;
import com.p683ss.android.ugc.aweme.setting.C41522ac;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoNetworkSpeedAlgorithmExperiment;
import com.p683ss.android.ugc.p2454f.C48911a;
import com.p683ss.android.ugc.p2454f.C48913c;
import com.p683ss.android.ugc.p2454f.C48916d;
import com.p683ss.android.ugc.p2454f.C48918e;

/* renamed from: com.ss.android.ugc.aweme.ml.j */
public final class C37113j implements C41522ac {

    /* renamed from: a */
    static C37113j f94759a = new C37113j();

    /* renamed from: b */
    public MLModel f94760b = C37102a.m83333a();

    private C37113j() {
        C23794bh.m58401o().mo85304a((C41522ac) this);
        m83344a(this.f94760b, true);
    }

    public final void onChanged() {
        boolean z;
        MLModel a = C37102a.m83333a();
        if (a == null || a == this.f94760b) {
            z = false;
        } else {
            z = true;
        }
        this.f94760b = a;
        m83344a(this.f94760b, z);
    }

    /* renamed from: a */
    private static void m83344a(MLModel mLModel, boolean z) {
        if (mLModel == null) {
            int a = C10181b.m20511a().mo18168a(VideoNetworkSpeedAlgorithmExperiment.class, true, "video_network_speed_algorithm", 31744, 0);
            if (a == 1) {
                C48918e.m105713a().f123074d = new C48911a();
            } else {
                if (a == 2) {
                    C48918e.m105713a().f123074d = new C37771a();
                }
            }
        } else if (z) {
            C48918e.m105713a().f123074d = new C48913c(C37114k.f94761a);
            C48916d.m105711a().mo96741a(new C37098a(mLModel)).mo40670f();
        }
    }
}

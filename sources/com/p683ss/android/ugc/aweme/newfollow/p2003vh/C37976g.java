package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.g */
public class C37976g extends C31805p implements C38871j {
    /* renamed from: b */
    public final boolean mo64769b() {
        return true;
    }

    /* renamed from: h */
    public final void mo64787h() {
    }

    /* renamed from: o */
    public final void mo64797o() {
    }

    /* renamed from: k */
    public final void mo64793k() {
        this.f83009Q.setVisibility(8);
    }

    /* renamed from: ae */
    public final void mo64847ae() {
        if (C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false)) {
            mo64841Y();
        } else {
            super.mo64847ae();
        }
    }

    /* renamed from: m */
    public final void mo64795m() {
        mo64796n();
        mo64802r();
        if (!mo64769b()) {
            mo64800p();
        }
        mo64797o();
    }

    /* renamed from: r */
    public final void mo64802r() {
        if (this.f82994B != null) {
            this.f82994B.setVisibility(0);
            this.f82994B.setTextSize(1, 13.0f);
            if (!C31753a.m73743c(this.f83048c) || this.f82994B == null) {
                this.f82994B.setText(R.string.fbv);
            } else {
                this.f82994B.setText(R.string.c7g);
            }
        }
    }

    /* renamed from: v */
    public final List<String> mo64806v() {
        ArrayList arrayList = new ArrayList();
        if (!C31190f.m72831a(this.f83048c) && C47915gg.m103646a(this.f83048c)) {
            arrayList.add(mo64749N().getString(R.string.f9m));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public final void mo64841Y() {
        super.mo64841Y();
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f83048c.getAid());
        bundle.putString("refer", mo64771c());
        bundle.putString("video_from", mo64846ad());
        bundle.putInt("profile_enterprise_type", this.f83048c.getEnterpriseType());
        bundle.putInt("page_type", mo64845ab());
        if (mo64842Z() != null) {
            bundle.putString("userid", mo64842Z());
            bundle.putString("sec_userid", mo64844aa());
        }
        C0643c b = C0643c.m1729b(this.f83120av, 0, 0, this.f83120av.getWidth(), this.f83120av.getHeight());
        if (C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
            SmartRouter.buildRoute(mo64749N(), "//detail/live").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
        } else {
            SmartRouter.buildRoute(mo64749N(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
        }
    }

    /* renamed from: a */
    public final void mo64756a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo64757a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo64757a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.b_r);
        mo64757a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cud);
        viewStub4.setLayoutResource(R.layout.b_w);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cty);
        viewStub5.setLayoutResource(R.layout.a3n);
        mo64757a(viewStub5.inflate(), 16.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.cts);
        viewStub6.setLayoutResource(R.layout.b_u);
        mo64758a(viewStub6.inflate(), 16.0f, 20.0f);
    }

    /* renamed from: a */
    public final void mo64760a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        int a = C9432q.m18670a(mo64749N());
        int b = C9432q.m18688b(mo64749N());
        float b2 = C9432q.m18687b(mo64749N(), 16.0f);
        float f = ((float) i2) / ((float) i);
        float f2 = ((float) b) * 0.56f;
        if (f > 1.3333334f) {
            iArr[1] = (int) f2;
            iArr[0] = (int) (((float) iArr[1]) / 1.3333334f);
            int i3 = (int) ((((float) a) * 0.85f) - b2);
            if (iArr[0] > i3) {
                iArr[0] = i3;
            }
        } else {
            iArr[0] = (int) (((float) a) - (b2 * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f);
            if (((float) iArr[1]) > f2) {
                iArr[1] = (int) f2;
                iArr[0] = (int) (((float) iArr[1]) / f);
            }
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view.setLayoutParams(layoutParams);
    }

    public C37976g(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        super(followFeedLayout, bVar, jVar, aVar, true);
    }
}

package com.p683ss.android.ugc.aweme.forward.p1776d;

import android.support.p030v4.app.FragmentActivity;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.flowfeed.p1756e.C31767b;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32383e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.d.g */
public class C32396g extends C32390c {
    /* renamed from: b */
    public final void mo65541b() {
        super.mo65541b();
        mo65574a(false);
    }

    /* renamed from: d */
    public final void mo65543d() {
        super.mo65543d();
        mo65571j();
    }

    /* renamed from: c */
    public final void mo65542c() {
        super.mo65542c();
        this.f84298c.mo64965e();
    }

    /* renamed from: a */
    public final void mo65539a() {
        boolean z;
        if (this.f84296a.mo65546b() instanceof FragmentActivity) {
            z = FollowEnterDetailViewModel.m74256a(this.f84299d, (FragmentActivity) this.f84296a.mo65546b()).f83230a;
        } else {
            z = false;
        }
        if (!z) {
            super.mo65539a();
        }
    }

    /* renamed from: f */
    public final void mo65544f() {
        if (this.f84297b != null && this.f84297b.getForwardItem() != null) {
            C31842e i = mo65570i();
            if (i != null) {
                i.f83202c.mo95017a(UnReadVideoExperiment.BROWSE_RECORD_LIST);
            }
            C31767b.m73783b().mo64687a(this.f84296a.mo65546b(), this.f84297b, this.f84299d, C31842e.m74200a(this.f84296a.mo65545a().mo64657d(), this.f84297b.getAid()), "");
        }
    }

    /* renamed from: l */
    public final void mo65575l() {
        mo65566a(15000);
        C31842e i = mo65570i();
        if (i != null) {
            i.f83202c.mo95017a(16777216);
            int[] iArr = new int[2];
            ImageView g = ((C32383e) this.f84296a).mo65556g();
            g.getLocationOnScreen(iArr);
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], g.getHeight(), g.getWidth(), (float) this.f84296a.mo65546b().getResources().getDimensionPixelOffset(R.dimen.zu));
            C31781d.m73922a().mo64685a(this.f84296a.mo65546b(), iViewInfo, this.f84297b, this.f84299d, i.f83208i);
        }
    }

    /* renamed from: a */
    public final void mo65565a(int i) {
        super.mo65565a(i);
        mo65566a(15000);
    }

    /* renamed from: a */
    public final void mo65574a(boolean z) {
        if (this.f84296a.mo65546b() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m74256a(this.f84299d, (FragmentActivity) this.f84296a.mo65546b()).f83230a = z;
        }
    }

    public C32396g(C32383e eVar, C31848j jVar) {
        super(eVar, jVar);
    }
}

package com.p683ss.android.ugc.aweme.flowfeed.p1759h;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1756e.C31767b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.o */
public class C31804o extends C31782a {

    /* renamed from: av */
    protected ViewGroup f83093av;

    /* renamed from: aw */
    ViewStub f83094aw;

    /* renamed from: ax */
    boolean f83095ax;

    /* renamed from: G */
    public final void mo64742G() {
        super.mo64742G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public String mo64835T() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public String mo64836U() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public int mo64837V() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public String mo64838W() {
        return "from_follow_page";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo64769b() {
        return this.f83095ax;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo64781f() {
        mo64808x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo64784g() {
        super.mo64784g();
    }

    /* renamed from: L */
    public final void mo64747L() {
        super.mo64747L();
        mo64840a(false);
    }

    /* renamed from: J */
    public final void mo64745J() {
        if (!mo64833R()) {
            super.mo64745J();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo64748M() {
        super.mo64748M();
        if (!C32800a.m75679a(this.f83093av)) {
            mo64754a(15000);
            mo64839X();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public boolean mo64833R() {
        if (!(mo64749N() instanceof FragmentActivity)) {
            return false;
        }
        return FollowEnterDetailViewModel.m74256a(mo64771c(), (FragmentActivity) mo64749N()).f83230a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo64778e() {
        List imageInfos = this.f83048c.getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                mo64760a((View) this.f83093av, imageInfo.getWidth(), imageInfo.getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo64810z() {
        if (VERSION.SDK_INT >= 21) {
            this.f83093av.setOutlineProvider(new C47856en(this.f83093av.getResources().getDimensionPixelOffset(R.dimen.zu)));
            this.f83093av.setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo64839X() {
        C31842e D = mo64739D();
        if (D != null) {
            D.f83202c.mo95017a(16777216);
            int[] iArr = new int[2];
            this.f83053h.getLocationOnScreen(iArr);
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f83053h.getHeight(), this.f83053h.getWidth(), (float) this.f83053h.getResources().getDimensionPixelOffset(R.dimen.zu));
            C31767b.m73783b().mo64685a(mo64749N(), iViewInfo, this.f83048c, mo64771c(), D.f83208i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo64808x() {
        super.mo64808x();
        List imageInfos = this.f83048c.getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
            if (imageInfo != null) {
                if (imageInfo.getLabelLarge() != null) {
                    C9376b.m18558a((Collection<T>) imageInfo.getLabelLarge().getUrlList());
                }
                C23515d.m57670a(this.f83053h, imageInfo.getLabelLarge(), this.f83053h.getWidth(), this.f83053h.getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo64834S() {
        if (this.f83048c != null) {
            C23794bh.m58392f().mo65001b(this.f83048c, mo64771c());
            mo64840a(true);
            C31213v.m72896a(this.f83052g.mo64671c(this.f83048c));
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f83048c.getAid());
            bundle.putString("refer", mo64771c());
            bundle.putString("video_from", mo64838W());
            bundle.putInt("profile_enterprise_type", this.f83048c.getEnterpriseType());
            bundle.putInt("page_type", mo64837V());
            if (mo64835T() != null) {
                bundle.putString("userid", mo64835T());
                bundle.putString("sec_userid", mo64836U());
            }
            C0643c b = C0643c.m1729b(this.f83093av, 0, 0, this.f83093av.getWidth(), this.f83093av.getHeight());
            if (C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
                SmartRouter.buildRoute(mo64749N(), "//detail/live").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            } else {
                SmartRouter.buildRoute(mo64749N(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        mo64775d();
    }

    /* renamed from: b */
    public final void mo64766b(int i) {
        super.mo64766b(i);
        mo64754a(15000);
    }

    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        this.f83017Y.mo64965e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64764a(FollowFeedLayout followFeedLayout) {
        super.mo64764a(followFeedLayout);
        this.f83093av = (ViewGroup) followFeedLayout.findViewById(R.id.b80);
        this.f83094aw = (ViewStub) followFeedLayout.findViewById(R.id.ctv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64840a(boolean z) {
        if (mo64749N() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m74256a(mo64771c(), (FragmentActivity) mo64749N()).f83230a = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64756a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo64757a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo64757a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.b_t);
        mo64757a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cud);
        viewStub4.setLayoutResource(R.layout.b_w);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cty);
        viewStub5.setLayoutResource(R.layout.b_s);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.cts);
        viewStub6.setLayoutResource(R.layout.b_u);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.cu0);
        viewStub7.setLayoutResource(R.layout.b_y);
        mo64757a(viewStub7.inflate(), 12.0f);
    }

    public C31804o(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        this(followFeedLayout, bVar, jVar, aVar, false);
    }

    public C31804o(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f83093av.setOnTouchListener(this.f83041au);
        this.f83095ax = z;
        if (this.f83095ax) {
            this.f83003K.setDisplayType(true);
        }
    }
}

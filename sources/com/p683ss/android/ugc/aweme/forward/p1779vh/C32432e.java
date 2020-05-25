package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32383e;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32396g;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.e */
public class C32432e extends BaseForwardViewHolder implements C32383e {

    /* renamed from: R */
    protected RemoteImageView f84442R;

    /* renamed from: S */
    protected ViewGroup f84443S;

    /* renamed from: T */
    MentionTextView f84444T;

    /* renamed from: U */
    View f84445U;

    /* renamed from: V */
    ViewGroup f84446V;

    /* renamed from: W */
    ViewStub f84447W;

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo65648D() {
        mo65686G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public String mo65688I() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public String mo65689J() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public int mo65690K() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public String mo65691L() {
        return "from_follow_page";
    }

    /* renamed from: g */
    public final ImageView mo65556g() {
        return this.f84442R;
    }

    /* renamed from: k */
    public final void mo56247k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo65686G() {
        ((C32396g) this.f84369M).mo65575l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo65692M() {
        this.f84369M.mo65544f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo65647C() {
        if (VERSION.SDK_INT >= 21) {
            this.f84446V.setOutlineProvider(new C47856en(this.f84446V.getResources().getDimensionPixelOffset(R.dimen.zu)));
            this.f84446V.setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo65682y() {
        if (this.f84362F.getForwardItem() != null && this.f84362F.getForwardItem().getAuthor() != null) {
            mo65658a(this.f84444T, this.f84362F.getForwardItem());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65674s() {
        super.mo65674s();
        this.f84442R.setVisibility(0);
        if (this.f84362F.getForwardItem() != null) {
            List imageInfos = this.f84362F.getForwardItem().getImageInfos();
            if (!C9376b.m18558a((Collection<T>) imageInfos)) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    if (imageInfo.getLabelLarge() != null) {
                        C9376b.m18558a((Collection<T>) imageInfo.getLabelLarge().getUrlList());
                    }
                    C23515d.m57670a(this.f84442R, imageInfo.getLabelLarge(), this.f84442R.getWidth(), this.f84442R.getHeight());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65679v() {
        if (this.f84362F != null && this.f84362F.getForwardItem() != null && this.f84362F.getForwardItem().getImageInfos() != null) {
            List imageInfos = this.f84362F.getForwardItem().getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    mo65654a((View) this.f84443S, imageInfo.getWidth(), imageInfo.getHeight());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo65687H() {
        if (this.f84362F != null && this.f84362F.getForwardItem() != null) {
            C23794bh.m58392f().mo65001b(this.f84362F, mo65673r());
            ((C32396g) this.f84369M).mo65566a(15000);
            C31213v.m72896a(this.f84360D.mo64671c(this.f84362F));
            ((C32396g) this.f84369M).mo65574a(true);
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f84362F.getAid());
            bundle.putString("refer", mo65673r());
            bundle.putString("video_from", mo65691L());
            bundle.putInt("profile_enterprise_type", this.f84362F.getEnterpriseType());
            bundle.putInt("page_type", mo65690K());
            if (mo65688I() != null) {
                bundle.putString("userid", mo65688I());
                bundle.putString("sec_userid", mo65689J());
            }
            C0643c b = C0643c.m1729b(this.f84443S, 0, 0, this.f84443S.getWidth(), this.f84443S.getHeight());
            if (C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
                SmartRouter.buildRoute(mo65546b(), "//detail/live").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            } else {
                SmartRouter.buildRoute(mo65546b(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo65694d(View view) {
        mo65692M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C32396g mo65693a(C31848j jVar) {
        return new C32396g(this, jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo65695e(View view) {
        if (!C32800a.m75679a(view)) {
            mo65686G();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65651a(View view) {
        super.mo65651a(view);
        this.f84442R = (RemoteImageView) view.findViewById(R.id.azj);
        this.f84443S = (ViewGroup) view.findViewById(R.id.b80);
        this.f84443S.setOnClickListener(new C32433f(this));
        this.f84444T = (MentionTextView) view.findViewById(R.id.dd6);
        this.f84445U = view.findViewById(R.id.b8p);
        this.f84445U.setOnClickListener(new C32434g(this));
        this.f84446V = (ViewGroup) view.findViewById(R.id.cfh);
        this.f84447W = (ViewStub) view.findViewById(R.id.ctv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65661b(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo65652a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo65652a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.ba3);
        mo65652a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cty);
        viewStub4.setLayoutResource(R.layout.b_s);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cts);
        viewStub5.setLayoutResource(R.layout.b_u);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.cu0);
        viewStub6.setLayoutResource(R.layout.b_y);
        mo65652a(viewStub6.inflate(), 12.0f);
    }

    public C32432e(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar) {
        super(followFeedLayout, bVar, eVar, aVar);
        this.f84369M = mo65693a(jVar);
    }
}

package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31760g;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32384f;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32398i;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPlayerProgressbar;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44586b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2234b.C44587a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.sticker.C46062l;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.i */
public class C32436i extends BaseForwardViewHolder implements C32384f, C44586b {

    /* renamed from: R */
    protected RemoteImageView f84452R;

    /* renamed from: S */
    protected ViewGroup f84453S;

    /* renamed from: T */
    MentionTextView f84454T;

    /* renamed from: U */
    View f84455U;

    /* renamed from: V */
    ViewGroup f84456V;

    /* renamed from: W */
    protected KeepSurfaceTextureView f84457W;

    /* renamed from: X */
    ImageView f84458X;

    /* renamed from: Y */
    TextView f84459Y;

    /* renamed from: Z */
    MarqueeView f84460Z;

    /* renamed from: aa */
    FrameLayout f84461aa;

    /* renamed from: ab */
    VideoPlayerProgressbar f84462ab;

    /* renamed from: ac */
    ImageView f84463ac;

    /* renamed from: ad */
    protected ViewGroup f84464ad;

    /* renamed from: ae */
    ImageView f84465ae;

    /* renamed from: af */
    ImageView f84466af;

    /* renamed from: ag */
    ViewStub f84467ag;

    /* renamed from: ah */
    ViewGroup f84468ah;

    /* renamed from: ai */
    ViewGroup f84469ai;

    /* renamed from: aj */
    TextView f84470aj;

    /* renamed from: ak */
    private C44576a f84471ak;

    /* renamed from: al */
    private RotateAnimation f84472al;

    /* renamed from: am */
    private boolean f84473am;

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo65648D() {
        mo65698H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public String mo65700J() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public String mo65701K() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public int mo65702L() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public String mo65703M() {
        return "from_follow_page";
    }

    /* renamed from: g */
    public final KeepSurfaceTextureView mo65561g() {
        return this.f84457W;
    }

    /* renamed from: k */
    public final void mo56247k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo65668o() {
        return this.f84473am;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo65698H() {
        ((C32398i) this.f84369M).mo65583p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo65704N() {
        this.f84369M.mo65544f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo65680w() {
        this.f84408y.setVisibility(4);
    }

    /* renamed from: h */
    public final void mo65551h() {
        super.mo65551h();
        this.f84460Z.postDelayed(new Runnable() {
            public final void run() {
                if (C32436i.this.f84460Z != null && C32436i.this.f84365I) {
                    C32436i.this.f84460Z.mo64085a();
                }
            }
        }, 100);
    }

    /* renamed from: i */
    public final void mo65552i() {
        super.mo65552i();
        if (this.f84460Z != null) {
            this.f84460Z.mo64087b();
        }
    }

    /* renamed from: m */
    public final void mo65553m() {
        super.mo65553m();
        if (this.f84460Z != null) {
            this.f84460Z.mo64088c();
        }
    }

    /* renamed from: G */
    public final void mo65686G() {
        if (this.f84362F.getForwardItem() != null) {
            this.f84471ak.mo90508a(this.f84362F.getForwardItem());
            this.f84471ak.mo90512b();
        }
    }

    /* renamed from: ac */
    public final AbsInteractStickerWidget mo60212ac() {
        AbsInteractStickerWidget a = C31781d.m73922a().mo64683a();
        this.f84368L.mo48250a((int) R.id.auf, (Widget) a);
        return a;
    }

    /* renamed from: j */
    public final int[] mo65562j() {
        return new int[]{this.f84464ad.getLayoutParams().width, this.f84464ad.getLayoutParams().height};
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo65647C() {
        if (VERSION.SDK_INT >= 21) {
            this.f84456V.setOutlineProvider(new C47856en(this.f84456V.getResources().getDimensionPixelOffset(R.dimen.zu)));
            this.f84456V.setClipToOutline(true);
        }
    }

    /* renamed from: l */
    public final void mo65563l() {
        if (this.f84457W != null) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            this.f84457W.getTransform(matrix);
            matrix.getValues(fArr);
            m75016a((int) (((float) this.f84453S.getLayoutParams().width) * fArr[0]), (int) (((float) this.f84453S.getLayoutParams().height) * fArr[4]), (int) fArr[2], (int) fArr[5]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo65682y() {
        if (this.f84362F.getForwardItem() != null && this.f84362F.getForwardItem().getAuthor() != null) {
            mo65658a(this.f84454T, this.f84362F.getForwardItem());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65679v() {
        if (this.f84362F.getForwardItem() != null && this.f84362F.getForwardItem().getVideo() != null) {
            mo65654a((View) this.f84453S, this.f84362F.getForwardItem().getVideo().getWidth(), this.f84362F.getForwardItem().getVideo().getHeight());
            m75016a(this.f84453S.getLayoutParams().width, this.f84453S.getLayoutParams().height, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo65674s() {
        int i;
        Resources resources;
        MarqueeView marqueeView;
        Object[] objArr;
        String str;
        super.mo65674s();
        if (this.f84362F.getForwardItem() != null) {
            mo65559a(true);
            LayoutParams layoutParams = this.f84464ad.getLayoutParams();
            layoutParams.width = (int) (((float) this.f84453S.getLayoutParams().width) * 0.6f);
            this.f84464ad.setLayoutParams(layoutParams);
            Music music = this.f84362F.getForwardItem().getMusic();
            if (music == null || !music.isOriginMusic()) {
                this.f84459Y.setVisibility(8);
                this.f84458X.setImageResource(R.drawable.dfb);
            } else {
                this.f84459Y.setVisibility(0);
                this.f84458X.setImageResource(R.drawable.dgf);
            }
            if (music != null) {
                marqueeView = this.f84460Z;
                resources = this.itemView.getResources();
                i = R.string.cer;
                objArr = new Object[2];
                objArr[0] = music.getMusicName();
                str = music.getAuthorName();
            } else {
                marqueeView = this.f84460Z;
                resources = this.itemView.getResources();
                i = R.string.cep;
                objArr = new Object[2];
                objArr[0] = this.itemView.getResources().getString(R.string.ce5);
                if (this.f84362F.getForwardItem().getAuthor() == null) {
                    str = "";
                } else {
                    str = this.f84362F.getForwardItem().getAuthor().getNickname();
                }
            }
            objArr[1] = str;
            marqueeView.setText(resources.getString(i, objArr));
            this.f84462ab.setVisibility(8);
            mo65557a(1);
            C23794bh.m58395i().mo76330a(mo65546b(), this.f84362F.getForwardItem(), this.f84469ai, this.f84470aj, mo65673r(), mo65702L());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo65699I() {
        if (this.f84362F != null) {
            C23794bh.m58392f().mo65001b(this.f84362F, mo65673r());
            C30367g.m71282a().f79372a = ((C32398i) this.f84369M).mo65580n();
            C30367g.m71282a().f79374c = ((C32398i) this.f84369M).mo65570i().f83205f;
            C31213v.m72896a(this.f84360D.mo64671c(this.f84362F));
            ((C32398i) this.f84369M).mo65578c(true);
            C32398i iVar = (C32398i) this.f84369M;
            C31842e i = iVar.mo65570i();
            if (i != null) {
                i.f83207h = null;
                iVar.f84309k.f96594a = null;
                iVar.f84310l = null;
            }
            ((C32398i) this.f84369M).f84313o = true;
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f84362F.getAid());
            bundle.putString("refer", mo65673r());
            bundle.putString("video_from", mo65703M());
            bundle.putInt("profile_enterprise_type", this.f84362F.getEnterpriseType());
            bundle.putInt("page_type", mo65702L());
            if (mo65700J() != null) {
                bundle.putString("userid", mo65700J());
                bundle.putString("sec_userid", mo65701K());
            }
            C0643c b = C0643c.m1729b(this.f84453S, 0, 0, this.f84453S.getWidth(), this.f84453S.getHeight());
            if (C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
                SmartRouter.buildRoute(mo65546b(), "//detail/live").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            } else {
                SmartRouter.buildRoute(mo65546b(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
            }
        }
    }

    /* renamed from: b */
    public final void mo65560b(boolean z) {
        this.f84462ab.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo65709g(View view) {
        mo65704N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C32398i mo65705a(C31848j jVar) {
        return new C32398i(this, jVar, mo65702L());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo65708f(View view) {
        if (!C32800a.m75679a(view)) {
            mo65698H();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo65710h(View view) {
        if (!C32800a.m75679a(view)) {
            mo65698H();
        }
    }

    /* renamed from: c */
    private void m75017c(boolean z) {
        if (z) {
            if (this.f84463ac.getVisibility() != 0) {
                this.f84463ac.startAnimation(this.f84472al);
                this.f84463ac.setVisibility(0);
            }
        } else if (this.f84463ac.getVisibility() != 8) {
            this.f84463ac.clearAnimation();
            this.f84463ac.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo65558a(C43893g gVar) {
        this.f84462ab.mo91146a(gVar, (int) gVar.f111160a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo65706d(View view) {
        if (!(this.f84362F == null || this.f84362F.getForwardItem() == null || this.f84360D == null || !(this.f84360D instanceof C31760g))) {
            ((C31760g) this.f84360D).mo64672c(view, this.itemView, this.f84362F);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo65707e(View view) {
        if (!(this.f84362F == null || this.f84362F.getForwardItem() == null || this.f84360D == null || !(this.f84360D instanceof C31760g))) {
            ((C31760g) this.f84360D).mo64673d(view, this.itemView, this.f84362F);
        }
    }

    /* renamed from: a */
    public final void mo65557a(int i) {
        switch (i) {
            case 0:
                this.f84465ae.setVisibility(8);
                m75017c(false);
                this.f84466af.setVisibility(0);
                return;
            case 1:
                m75017c(false);
                this.f84466af.setVisibility(8);
                this.f84465ae.setVisibility(0);
                return;
            case 2:
                this.f84465ae.setVisibility(8);
                this.f84466af.setVisibility(8);
                m75017c(true);
                break;
            case 3:
                this.f84465ae.setVisibility(8);
                m75017c(false);
                this.f84466af.setVisibility(8);
                return;
        }
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
        viewStub3.setLayoutResource(R.layout.ba4);
        mo65652a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cty);
        viewStub4.setLayoutResource(R.layout.b_s);
        mo65652a(viewStub4.inflate(), 12.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cts);
        viewStub5.setLayoutResource(R.layout.b_u);
        mo65652a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.cu0);
        viewStub6.setLayoutResource(R.layout.b_y);
        mo65652a(viewStub6.inflate(), 12.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65651a(View view) {
        super.mo65651a(view);
        this.f84452R = (RemoteImageView) view.findViewById(R.id.azj);
        this.f84452R.setOnClickListener(new C32438j(this));
        this.f84453S = (ViewGroup) view.findViewById(R.id.b_i);
        this.f84454T = (MentionTextView) view.findViewById(R.id.dd6);
        this.f84455U = view.findViewById(R.id.b8p);
        this.f84455U.setOnClickListener(new C32439k(this));
        this.f84456V = (ViewGroup) view.findViewById(R.id.cfi);
        this.f84456V.setOnClickListener(new C32440l(this));
        this.f84457W = (KeepSurfaceTextureView) view.findViewById(R.id.czh);
        this.f84458X = (ImageView) view.findViewById(R.id.bo7);
        this.f84459Y = (TextView) view.findViewById(R.id.boc);
        this.f84459Y.setOnClickListener(new C32441m(this));
        this.f84461aa = (FrameLayout) view.findViewById(R.id.b8h);
        this.f84461aa.setOnClickListener(new C32442n(this));
        this.f84460Z = (MarqueeView) view.findViewById(R.id.bot);
        this.f84462ab = (VideoPlayerProgressbar) view.findViewById(R.id.dpu);
        this.f84463ac = (ImageView) view.findViewById(R.id.b25);
        this.f84464ad = (ViewGroup) view.findViewById(R.id.b8g);
        this.f84465ae = (ImageView) view.findViewById(R.id.b37);
        this.f84466af = (ImageView) view.findViewById(R.id.b2x);
        this.f84465ae.setOnClickListener(new C32443o(this));
        this.f84466af.setOnClickListener(new C32444p(this));
        this.f84467ag = (ViewStub) view.findViewById(R.id.ctv);
        this.f84468ah = (ViewGroup) view.findViewById(R.id.auf);
        this.f84469ai = (ViewGroup) view.findViewById(R.id.bma);
        this.f84470aj = (TextView) view.findViewById(R.id.bm8);
    }

    /* renamed from: a */
    public final void mo65559a(boolean z) {
        if (z) {
            this.f84452R.setVisibility(0);
            if (!(this.f84362F == null || this.f84362F.getForwardItem() == null || this.f84362F.getForwardItem().getVideo() == null)) {
                C23515d.m57670a(this.f84452R, this.f84362F.getForwardItem().getVideo().getOriginCover(), this.f84452R.getWidth(), this.f84452R.getHeight());
            }
        } else {
            this.f84452R.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m75016a(int i, int i2, int i3, int i4) {
        if (this.f84362F.getForwardItem() != null) {
            C46062l lVar = new C46062l();
            lVar.mo92607b(this.f84362F.getForwardItem().getAuthorUid()).mo92606a(mo65673r()).mo92608c(this.f84362F.getForwardItem().getAid()).mo92609d(C29981aa.m70153a().mo60161a(this.f84362F.getForwardItem().getRequestId()));
            this.f84471ak.mo90508a(this.f84362F.getForwardItem());
            this.f84471ak.f112784d = new C44587a(i, i2, i3, i4);
            this.f84471ak.f112785e = lVar;
            this.f84471ak.f112789i = false;
            this.f84471ak.mo90506a();
        }
    }

    public C32436i(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar) {
        this(followFeedLayout, bVar, jVar, eVar, aVar, false);
    }

    /* renamed from: a */
    public final void mo65657a(Aweme aweme, List<Comment> list, List<User> list2, String str, String str2) {
        super.mo65657a(aweme, list, list2, str, str2);
        if (this.f84362F.getForwardItem() != null) {
            this.f84471ak.mo90508a(this.f84362F.getForwardItem());
            this.f84471ak.mo90514d();
        }
        mo65686G();
    }

    public C32436i(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31758e eVar, C31754a aVar, boolean z) {
        super(followFeedLayout, bVar, eVar, aVar);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f84472al = rotateAnimation;
        this.f84472al.setRepeatCount(-1);
        this.f84472al.setInterpolator(new LinearInterpolator());
        this.f84472al.setDuration(1000);
        this.f84473am = z;
        this.f84369M = mo65705a(jVar);
        if (EarPhoneUnplugExperiment.m82548a()) {
            Activity g = C11016e.m22312g();
            if (g instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) g;
                HomePageDataViewModel.m75866a(fragmentActivity).f85654h.observe(fragmentActivity, new C32445q(this));
            }
        }
        this.f84471ak = new C44576a(this);
    }
}

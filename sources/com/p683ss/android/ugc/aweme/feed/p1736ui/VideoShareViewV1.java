package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.experiment.InterctionShareButtonStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.InterctionShareButtonWhatsappStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareGuideLimitExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareIconInverseStrategyExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareIconVariantExperiment;
import com.p683ss.android.ugc.aweme.feed.guide.C30286i;
import com.p683ss.android.ugc.aweme.feed.helper.C30399u;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31201m;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C41975an;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoShareViewV1 */
public class VideoShareViewV1 extends C31009h implements C0199s<C23274a>, C30313ae<C30332aw>, C30447d {

    /* renamed from: i */
    private static SharedPreferences f80539i;

    /* renamed from: a */
    boolean f80540a;

    /* renamed from: b */
    boolean f80541b;

    /* renamed from: c */
    private boolean f80542c;

    /* renamed from: d */
    private boolean f80543d;

    /* renamed from: e */
    private String f80544e;

    /* renamed from: f */
    private long f80545f;

    /* renamed from: g */
    private boolean f80546g;

    /* renamed from: h */
    private int f80547h;

    /* renamed from: j */
    private String f80548j;
    View mShareContainerView;
    TextView mShareCount;
    RemoteImageView shareIv;

    /* renamed from: a */
    public final void mo49781a() {
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60714a(Object obj) {
    }

    /* renamed from: j */
    private void m72055j() {
        if (this.f81201u == null || !C30399u.m71323a((Activity) this.f81201u.getActivity())) {
            m72056k();
        } else {
            this.shareIv.setImageResource(R.drawable.cso);
        }
    }

    /* renamed from: o */
    private static SharedPreferences m72060o() {
        if (f80539i == null) {
            f80539i = C35807d.m80935a(C11010c.m22280a(), "sp_video_digg_record", 0);
        }
        return f80539i;
    }

    /* renamed from: r */
    private static int m72063r() {
        return C10181b.m20511a().mo18168a(ShareIconInverseStrategyExperiment.class, true, "share_icon_inverse_strategy", 31744, 0);
    }

    /* renamed from: s */
    private static int m72064s() {
        if (C47915gg.m103651b()) {
            return 0;
        }
        return C10181b.m20511a().mo18168a(ShareGuideLimitExperiment.class, true, "share_guide_daily_limit", 31744, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63420b() {
        if (!C31357a.m73095a() || m72059n() || C30399u.m71324a(this.f81198r)) {
            m72053d();
        } else {
            m72053d();
        }
    }

    /* renamed from: k */
    private void m72056k() {
        this.mShareContainerView.setAlpha(1.0f);
        this.shareIv.getLayoutParams().width = (int) C9432q.m18687b(this.f81198r, 40.0f);
        this.shareIv.getLayoutParams().height = -1;
        this.shareIv.setImageResource(C41975an.m91942a());
    }

    /* renamed from: n */
    private boolean m72059n() {
        if (this.f81192l == null) {
            return false;
        }
        User author = this.f81192l.getAuthor();
        if (author != null) {
            return TextUtils.equals(author.getUid(), C20854a.m53167g().getCurUser().getUid());
        }
        return false;
    }

    /* renamed from: u */
    private void m72066u() {
        if (this.mShareContainerView != null && !this.f80541b) {
            this.f80541b = true;
            this.mShareContainerView.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150).withEndAction(new Runnable() {
                public final void run() {
                    VideoShareViewV1.this.mShareContainerView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(150).withEndAction(new Runnable() {
                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.05f, 0.9f, 1.05f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            VideoShareViewV1.this.mShareContainerView.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    /* renamed from: v */
    private void m72067v() {
        if (C47915gg.m103651b()) {
            this.shareIv.setImageResource(R.drawable.dge);
            C23729p.m58257a((View) this.mShareCount, 8);
        }
        if (C36330a.m81964a(this.f81192l) && this.mShareCount != null) {
            this.mShareCount.setText("0");
        }
    }

    /* renamed from: d */
    private void m72053d() {
        if (C47915gg.m103651b()) {
            this.shareIv.setImageResource(R.drawable.dge);
            C23729p.m58257a((View) this.mShareCount, 8);
        } else if (this.f81192l != null && this.f81192l.getAuthor() != null && !RefineShareInSiteExperiment.INSTANCE.mo73737b() && C20854a.m53167g().isMe(this.f81192l.getAuthor().getUid())) {
            this.shareIv.setImageResource(R.drawable.dge);
        } else if (C30399u.m71324a(this.f81198r)) {
            m72055j();
        } else if (C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0) != 0) {
            m72054e();
        } else {
            try {
                m72056k();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: p */
    private void m72061p() {
        if (this.f80541b) {
            this.f80541b = false;
            m72062q();
        }
        if (this.f80540a) {
            this.f80540a = false;
            m72062q();
        }
        if (this.f80546g) {
            this.f80546g = false;
            if (this.mShareCount != null && this.mShareCount.getVisibility() == 0 && !TextUtils.isEmpty(this.f80544e)) {
                this.mShareCount.setText(this.f80544e);
            }
            m72062q();
        }
        if (this.f80543d) {
            this.f80543d = false;
            m72062q();
        }
    }

    /* renamed from: q */
    private void m72062q() {
        Animation animation = this.mShareContainerView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.mShareContainerView.clearAnimation();
        if (C31357a.m73095a()) {
            mo63420b();
        } else if (C30399u.m71324a(this.f81198r)) {
            m72055j();
        } else if (C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0) != 0) {
            m72054e();
        } else {
            m72056k();
        }
        this.mShareContainerView.setScaleX(1.0f);
        this.mShareContainerView.setScaleY(1.0f);
        m72057l();
    }

    /* renamed from: e */
    private void m72054e() {
        this.f80548j = C41979aq.m91947b().getMostUseShareChannel();
        boolean b = C30399u.f79466b.mo60817b(this.f81198r);
        if (this.f80548j != null || !b) {
            int a = C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0);
            if (this.f80548j == null || a == 1) {
                m72056k();
                return;
            }
            Drawable channelDrawable = C41979aq.m91947b().channelDrawable(this.f81201u.getActivity(), this.f80548j);
            if (channelDrawable != null) {
                this.shareIv.getLayoutParams().width = (int) C9432q.m18687b(this.f81198r, 36.0f);
                this.shareIv.getLayoutParams().height = (int) C9432q.m18687b(this.f81198r, 36.0f);
                this.shareIv.setImageDrawable(channelDrawable);
            }
            return;
        }
        this.shareIv.getLayoutParams().width = (int) C9432q.m18687b(this.f81198r, 36.0f);
        this.shareIv.getLayoutParams().height = (int) C9432q.m18687b(this.f81198r, 36.0f);
        this.shareIv.setImageResource(R.drawable.cso);
    }

    /* renamed from: l */
    private void m72057l() {
        if (this.f81192l != null) {
            User author = this.f81192l.getAuthor();
            AwemeStatistics statistics = this.f81192l.getStatistics();
            if (statistics == null || author == null) {
                this.mShareCount.setVisibility(8);
            } else if (TextUtils.equals(C20854a.m53167g().getCurUserId(), author.getUid())) {
                this.mShareCount.setVisibility(8);
            } else if (C10181b.m20511a().mo18168a(ShareButtonStyleExperiment.class, true, "share_button_style", 31744, 0) == 2) {
                this.mShareCount.setVisibility(0);
                this.mShareCount.setTextSize(1, 10.0f);
                this.mShareCount.setText(R.string.fbv);
            } else if (C10181b.m20511a().mo18168a(ShareButtonStyleExperiment.class, true, "share_button_style", 31744, 0) == 3) {
                this.mShareCount.setVisibility(0);
                this.mShareCount.setTextSize(1, 12.0f);
                this.mShareCount.setText(C33095b.m76068a(statistics.getShareCount()));
            } else {
                this.mShareCount.setVisibility(8);
            }
            m72067v();
        }
    }

    /* renamed from: m */
    private boolean m72058m() {
        try {
            if (C11016e.m22312g() != this.f81201u.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m82601a((FragmentActivity) C11016e.m22312g()).getAid(), this.f81192l.getAid()) || !C30399u.m71324a(this.f81198r) || !C30399u.m71325a(this.f81192l) || C30286i.m71202a().mo60688a(this.f81192l.getAid())) {
                return false;
            }
            C30286i.m71202a().mo60689b(this.f81192l.getAid());
            int a = C10181b.m20511a().mo18168a(InterctionShareButtonWhatsappStyleExperiment.class, true, "interction_share_button_whatsapp_style", 31744, 0);
            if (!C30399u.m71323a((Activity) this.f81201u.getActivity())) {
                this.shareIv.setImageResource(R.drawable.cso);
                switch (a) {
                    case 1:
                        m72051a(1.02f, 0.95f);
                        break;
                    case 2:
                        m72051a(1.05f, 0.9f);
                        break;
                }
            } else {
                switch (a) {
                    case 1:
                        m72051a(1.02f, 0.95f);
                        break;
                    case 2:
                        m72066u();
                        break;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: t */
    private void m72065t() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f80541b && C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0) == 0 && m72064s() == 0 && !C47915gg.m103651b() && !this.f80543d && !this.f80546g && !C47950q.m103755d(this.f81192l) && !C47950q.m103754c(this.f81192l) && !C30399u.m71324a(this.f81198r)) {
            boolean z4 = false;
            if (!C31190f.m72843k(this.f81192l) || C31190f.m72844l(this.f81192l)) {
                z = false;
            } else {
                z = true;
            }
            if (C10181b.m20511a().mo18168a(ShareIconVariantExperiment.class, true, "share_icon_variant", 31744, 0) == 1 && m72063r() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = Keva.getRepo("share_repo").getBoolean("user_download_action", false);
            if (m72063r() == 1 || (!z5 && m72063r() == 2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && (z2 || z3)) {
                z4 = true;
            }
            this.f80540a = true;
            this.mShareContainerView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new C31001fn(this, z4)).start();
        }
    }

    public VideoShareViewV1(View view) {
        super(view);
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f81193m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6x);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        ButterKnife.bind((Object) this, view);
        this.mShareContainerView.setOnTouchListener(C23729p.m58253a());
        C47718bf.m103290c(this);
        if (RefineShareInSiteExperiment.INSTANCE.mo73737b() && C47915gg.m103651b()) {
            this.f81199s.setVisibility(8);
        }
    }

    @C53771m
    public void onVideoPlayerEvent(C43893g gVar) {
        if (gVar.f111162c == 7 && TextUtils.equals(gVar.f111165f, this.f81192l.getAid())) {
            String str = gVar.f111165f;
            this.f80547h++;
            if (!m72058m() && !m72052a(str)) {
                int s = m72064s();
                if (!(s == 0 || s == -2)) {
                    try {
                        if (C11016e.m22312g() != this.f81201u.getActivity() || TextUtils.equals(AwemeChangeCallBack.m82601a((FragmentActivity) C11016e.m22312g()).getAid(), this.f81192l.getAid())) {
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m72052a(String str) {
        Drawable drawable;
        if (this.f80547h != 2) {
            return false;
        }
        try {
            if (C11016e.m22312g() != this.f81201u.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m82601a((FragmentActivity) C11016e.m22312g()).getAid(), this.f81192l.getAid())) {
                return false;
            }
            boolean b = C30399u.f79466b.mo60817b(this.f81198r);
            int a = C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0);
            if (a == 0 || (this.f80548j == null && !b)) {
                return false;
            }
            if (C30286i.m71202a().mo60688a(this.f81192l.getAid())) {
                return true;
            }
            C30286i.m71202a().mo60689b(this.f81192l.getAid());
            this.shareIv.getLayoutParams().width = (int) C9432q.m18687b(this.f81198r, 36.0f);
            this.shareIv.getLayoutParams().height = (int) C9432q.m18687b(this.f81198r, 36.0f);
            if (TextUtils.isEmpty(this.f80548j) || this.f81201u == null || this.f81201u.getActivity() == null) {
                drawable = this.f81198r.getResources().getDrawable(R.drawable.cso);
            } else {
                drawable = C41979aq.m91947b().channelDrawable(this.f81201u.getActivity(), this.f80548j);
            }
            this.shareIv.setImageDrawable(drawable);
            if ((a == 1 && this.f80548j == null) || a == 2) {
                m72066u();
                return true;
            } else if (a == 3) {
                m72051a(1.05f, 0.9f);
                return true;
            } else if (a != 1 || this.f80548j == null || this.f81201u == null || this.f81201u.getActivity() == null) {
                return false;
            } else {
                m72051a(1.05f, 0.9f);
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        dataCenter.mo48226a("video_show_share_guide_animation", (C0199s<C23274a>) this).mo48226a("video_show_share_panel_guide_animation", (C0199s<C23274a>) this).mo48226a("video_hide_share_panel_guide_animation", (C0199s<C23274a>) this).mo48226a("update_diig_view", (C0199s<C23274a>) this).mo48226a("video_on_pause", (C0199s<C23274a>) this).mo48226a("pause_share_guide_animation", (C0199s<C23274a>) this).mo48226a("recover_share_guide_animation", (C0199s<C23274a>) this).mo48226a("on_page_unselected", (C0199s<C23274a>) this).mo48226a("on_page_selected", (C0199s<C23274a>) this).mo48226a("video_digg", (C0199s<C23274a>) this).mo48226a("handle_double_click", (C0199s<C23274a>) this).mo48226a("video_share_click", (C0199s<C23274a>) this).mo48226a("show_festival_activity_icon", (C0199s<C23274a>) this).mo48226a("awesome_update_backup_data", (C0199s<C23274a>) this).mo48226a("video_show_flip_share_drawable", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        if (this.f81192l != null) {
            this.mShareContainerView.setVisibility(0);
            this.mShareCount.setVisibility(0);
            mo63420b();
            if (C31201m.m72857a(this.f81192l, this.f81196p) || ((!C47950q.m103755d(this.f81192l) && !C47950q.m103754c(this.f81192l)) || m72059n())) {
                this.mShareContainerView.setAlpha(1.0f);
                this.mShareContainerView.setEnabled(true);
            } else {
                this.mShareContainerView.setAlpha(0.5f);
                this.mShareContainerView.setEnabled(false);
            }
            m72057l();
            this.f80547h = 0;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r11 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r11
            if (r11 == 0) goto L_0x02cf
            java.lang.String r0 = r11.f62242a
            int r1 = r0.hashCode()
            r2 = 5
            r3 = -1
            r4 = 3
            r5 = 0
            r6 = 1
            switch(r1) {
                case -1618328215: goto L_0x00ab;
                case -1475411887: goto L_0x00a0;
                case -1070474451: goto L_0x0096;
                case -777668341: goto L_0x008c;
                case 245017106: goto L_0x0081;
                case 249129690: goto L_0x0077;
                case 281945252: goto L_0x006c;
                case 350216171: goto L_0x0061;
                case 651229933: goto L_0x0056;
                case 920041496: goto L_0x004c;
                case 1181771620: goto L_0x0040;
                case 1346787590: goto L_0x0035;
                case 1628582276: goto L_0x002a;
                case 1863388195: goto L_0x001f;
                case 1952793192: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x00b6
        L_0x0014:
            java.lang.String r1 = "video_show_share_panel_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 6
            goto L_0x00b7
        L_0x001f:
            java.lang.String r1 = "video_show_share_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 5
            goto L_0x00b7
        L_0x002a:
            java.lang.String r1 = "on_page_unselected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 1
            goto L_0x00b7
        L_0x0035:
            java.lang.String r1 = "recover_share_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 3
            goto L_0x00b7
        L_0x0040:
            java.lang.String r1 = "video_share_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 10
            goto L_0x00b7
        L_0x004c:
            java.lang.String r1 = "pause_share_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 2
            goto L_0x00b7
        L_0x0056:
            java.lang.String r1 = "awesome_update_backup_data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 12
            goto L_0x00b7
        L_0x0061:
            java.lang.String r1 = "on_page_selected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 11
            goto L_0x00b7
        L_0x006c:
            java.lang.String r1 = "show_festival_activity_icon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 14
            goto L_0x00b7
        L_0x0077:
            java.lang.String r1 = "video_on_pause"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 0
            goto L_0x00b7
        L_0x0081:
            java.lang.String r1 = "video_show_flip_share_drawable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 13
            goto L_0x00b7
        L_0x008c:
            java.lang.String r1 = "update_diig_view"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 4
            goto L_0x00b7
        L_0x0096:
            java.lang.String r1 = "video_hide_share_panel_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 7
            goto L_0x00b7
        L_0x00a0:
            java.lang.String r1 = "handle_double_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 9
            goto L_0x00b7
        L_0x00ab:
            java.lang.String r1 = "video_digg"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            r0 = 8
            goto L_0x00b7
        L_0x00b6:
            r0 = -1
        L_0x00b7:
            switch(r0) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x02c7;
                case 2: goto L_0x029d;
                case 3: goto L_0x0295;
                case 4: goto L_0x0288;
                case 5: goto L_0x0284;
                case 6: goto L_0x0274;
                case 7: goto L_0x0267;
                case 8: goto L_0x01b1;
                case 9: goto L_0x0109;
                case 10: goto L_0x0108;
                case 11: goto L_0x00f7;
                case 12: goto L_0x00eb;
                case 13: goto L_0x00c1;
                case 14: goto L_0x00bc;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x02cf
        L_0x00bc:
            r10.mo63420b()
            goto L_0x02cf
        L_0x00c1:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f81192l
            boolean r11 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73097a(r11)
            if (r11 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f81192l
            com.ss.android.ugc.aweme.profile.model.User r11 = r11.getAuthor()
            if (r11 == 0) goto L_0x00ea
            boolean r11 = r10.f80543d
            if (r11 != 0) goto L_0x00ea
            com.ss.android.ugc.aweme.IAccountService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53161a()
            com.ss.android.ugc.aweme.IAccountUserService r11 = r11.userService()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
            r11.isMe(r0)
        L_0x00ea:
            return
        L_0x00eb:
            java.lang.Object r11 = r11.mo48246a()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r11 = (com.p683ss.android.ugc.aweme.feed.model.VideoItemParams) r11
            if (r11 == 0) goto L_0x02cf
            r10.mo58323a(r11)
            return
        L_0x00f7:
            android.view.View r11 = r10.mShareContainerView
            if (r11 == 0) goto L_0x0107
            android.view.View r11 = r10.mShareContainerView
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setScaleX(r0)
            android.view.View r11 = r10.mShareContainerView
            r11.setScaleY(r0)
        L_0x0107:
            return
        L_0x0108:
            return
        L_0x0109:
            boolean r11 = r10.f80542c
            if (r11 != 0) goto L_0x02cf
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f81192l
            if (r11 == 0) goto L_0x02cf
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f81192l
            int r11 = r11.getUserDigg()
            if (r11 != 0) goto L_0x02cf
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f81192l
            if (r11 == 0) goto L_0x02cf
            boolean r0 = r11.isProhibited()
            if (r0 != 0) goto L_0x02cf
            boolean r0 = r10.f80543d
            if (r0 == 0) goto L_0x0129
            goto L_0x02cf
        L_0x0129:
            boolean r0 = r10.f80542c
            if (r0 != 0) goto L_0x01b0
            int r11 = r11.getUserDigg()
            if (r11 != 0) goto L_0x01b0
            boolean r11 = r10.f80540a
            if (r11 != 0) goto L_0x01b0
            boolean r11 = com.p683ss.android.ugc.aweme.feed.utils.C31201m.m72856a()
            if (r11 == 0) goto L_0x01b0
            r10.f80546g = r6
            com.ss.android.ugc.aweme.app.SharePrefCache r11 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r11 = r11.getIsShowFavouriteIcon()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r11.mo47776a(r0)
            android.widget.TextView r11 = r10.mShareCount
            if (r11 == 0) goto L_0x017f
            android.widget.TextView r11 = r10.mShareCount
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x017f
            android.widget.TextView r11 = r10.mShareCount
            java.lang.CharSequence r11 = r11.getText()
            if (r11 == 0) goto L_0x016d
            android.widget.TextView r11 = r10.mShareCount
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            goto L_0x016f
        L_0x016d:
            java.lang.String r11 = ""
        L_0x016f:
            r10.f80544e = r11
            android.widget.TextView r11 = r10.mShareCount
            android.content.Context r0 = r10.f81198r
            r1 = 2132541883(0x7f1c01bb, float:2.0736855E38)
            java.lang.String r0 = r0.getString(r1)
            r11.setText(r0)
        L_0x017f:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.shareIv
            if (r11 == 0) goto L_0x018b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r11 = r10.shareIv
            r0 = 2131954517(0x7f130b55, float:1.9545535E38)
            r11.setImageResource(r0)
        L_0x018b:
            android.view.View r11 = r10.mShareContainerView
            if (r11 == 0) goto L_0x01b0
            android.view.View r11 = r10.mShareContainerView
            android.view.ViewPropertyAnimator r11 = r11.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r11 = r11.scaleX(r0)
            android.view.ViewPropertyAnimator r11 = r11.scaleY(r0)
            r0 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r11 = r11.setDuration(r0)
            com.ss.android.ugc.aweme.feed.ui.fo r0 = new com.ss.android.ugc.aweme.feed.ui.fo
            r0.<init>(r10)
            android.view.ViewPropertyAnimator r11 = r11.withEndAction(r0)
            r11.start()
        L_0x01b0:
            return
        L_0x01b1:
            java.lang.Object r11 = r11.mo48246a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r2) goto L_0x02cf
            int r11 = m72064s()
            if (r11 == 0) goto L_0x0266
            int r11 = m72064s()
            r0 = -2
            if (r11 == r0) goto L_0x0266
            int r11 = m72064s()
            if (r11 == r3) goto L_0x0266
            com.ss.android.ugc.aweme.IAccountUserService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r11 = r11.getCurUserId()
            int r0 = m72064s()
            android.content.SharedPreferences r1 = m72060o()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "video_digg_"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            int r1 = r1.getInt(r2, r5)
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r5 = m72060o()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "video_digg_time_"
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r8 = 0
            long r7 = r5.getLong(r7, r8)
            boolean r5 = android.text.format.DateUtils.isToday(r7)
            if (r5 != 0) goto L_0x0243
            android.content.SharedPreferences r0 = m72060o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "video_digg_time_"
            r1.<init>(r4)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.putLong(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "video_digg_"
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.putInt(r11, r6)
            r0.apply()
            goto L_0x02cf
        L_0x0243:
            if (r0 <= r4) goto L_0x0246
            goto L_0x0247
        L_0x0246:
            r0 = 3
        L_0x0247:
            if (r1 > r0) goto L_0x0266
            android.content.SharedPreferences r0 = m72060o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "video_digg_"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            int r1 = r1 + r6
            r0.putInt(r11, r1)
            r0.apply()
        L_0x0266:
            return
        L_0x0267:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            java.lang.Runnable r1 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30997fj.f81172a
            r0.<init>(r5, r1)
            r11.mo60617a(r0)
            return
        L_0x0274:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.fi r1 = new com.ss.android.ugc.aweme.feed.ui.fi
            r1.<init>(r10)
            r0.<init>(r5, r1)
            r11.mo60617a(r0)
            return
        L_0x0284:
            r10.m72065t()
            return
        L_0x0288:
            java.lang.Object r11 = r11.mo48246a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r10.f80542c = r11
            return
        L_0x0295:
            boolean r11 = r10.f80540a
            if (r11 == 0) goto L_0x029c
            r10.m72065t()
        L_0x029c:
            return
        L_0x029d:
            boolean r11 = r10.f80540a
            if (r11 == 0) goto L_0x02a4
            r10.m72062q()
        L_0x02a4:
            boolean r11 = r10.f80546g
            if (r11 == 0) goto L_0x02c6
            android.widget.TextView r11 = r10.mShareCount
            if (r11 == 0) goto L_0x02c3
            android.widget.TextView r11 = r10.mShareCount
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x02c3
            java.lang.String r11 = r10.f80544e
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x02c3
            android.widget.TextView r11 = r10.mShareCount
            java.lang.String r0 = r10.f80544e
            r11.setText(r0)
        L_0x02c3:
            r10.m72062q()
        L_0x02c6:
            return
        L_0x02c7:
            r10.m72061p()
            return
        L_0x02cb:
            r10.m72061p()
            return
        L_0x02cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.VideoShareViewV1.onChanged(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        if (r1.equals("homepage_hot") == false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            boolean r8 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r8)
            if (r8 == 0) goto L_0x0007
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f80545f
            long r2 = r0 - r2
            r4 = 800(0x320, double:3.953E-321)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x001a
            r0 = 0
            r7.f80545f = r0
            return
        L_0x001a:
            r7.f80545f = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            if (r8 != 0) goto L_0x0021
            return
        L_0x0021:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            boolean r8 = r8.isCanPlay()
            if (r8 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            boolean r8 = r8.isDelete()
            if (r8 == 0) goto L_0x0043
        L_0x0031:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            int r0 = r7.f81196p
            boolean r8 = com.p683ss.android.ugc.aweme.feed.utils.C31201m.m72857a(r8, r0)
            if (r8 != 0) goto L_0x0043
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            boolean r8 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81965b(r8)
            if (r8 == 0) goto L_0x005b
        L_0x0043:
            int r8 = r7.f81196p
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r8 == r0) goto L_0x0083
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            int r0 = r7.f81196p
            boolean r8 = com.p683ss.android.ugc.aweme.feed.utils.C31201m.m72857a(r8, r0)
            if (r8 != 0) goto L_0x0083
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            boolean r8 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r8)
            if (r8 == 0) goto L_0x0083
        L_0x005b:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f81192l
            boolean r8 = r8.isImage()
            if (r8 == 0) goto L_0x0070
            android.content.Context r8 = r7.f81198r
            r0 = 2132545667(0x7f1c1083, float:2.074453E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r0)
            r8.mo19066a()
            return
        L_0x0070:
            android.content.Context r8 = r7.f81198r
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            r1 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81963a(r0, r1)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r8, r0)
            r8.mo19066a()
            return
        L_0x0083:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r8 = r7.f81197q
            java.lang.String r0 = "video_share_click"
            r1 = 0
            r8.mo48228a(r0, r1)
            boolean r8 = r7.f80540a
            r0 = 0
            if (r8 == 0) goto L_0x00c4
            java.lang.String r8 = "share_highlight_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f81192l
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f81192l
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "show_content"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.feed.C30130ag.m70703c()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "is_pop_up"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r1)
            goto L_0x00db
        L_0x00c4:
            com.ss.android.ugc.aweme.feed.helper.i r8 = com.p683ss.android.ugc.aweme.feed.helper.C30385i.m71299a()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.shareIv
            java.lang.String r2 = r7.f81193m
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f81192l
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f81192l
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r4)
            r8.mo60806a(r1, r2, r3, r4)
        L_0x00db:
            com.ss.android.ugc.aweme.secapi.ISecApi r8 = com.p683ss.android.ugc.aweme.sec.SecApiImpl.createISecApibyMonsterPlugin()
            com.ss.android.ugc.aweme.secapi.ISecApi r8 = (com.p683ss.android.ugc.aweme.secapi.ISecApi) r8
            java.lang.String r1 = "share"
            r8.reportData(r1)
            r7.m72061p()
            java.lang.String r8 = r7.f81193m
            if (r8 != 0) goto L_0x00f1
            java.lang.String r8 = ""
            r7.f81193m = r8
        L_0x00f1:
            com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r8 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
            boolean r8 = r8.mo73737b()
            java.lang.String r1 = r7.f81193m
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r3 == r4) goto L_0x0112
            r4 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r3 == r4) goto L_0x0109
            goto L_0x011c
        L_0x0109:
            java.lang.String r3 = "homepage_hot"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x011c
            goto L_0x011d
        L_0x0112:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x011c
            r0 = 1
            goto L_0x011d
        L_0x011c:
            r0 = -1
        L_0x011d:
            switch(r0) {
                case 0: goto L_0x023b;
                case 1: goto L_0x01a7;
                default: goto L_0x0120;
            }
        L_0x0120:
            int r0 = r7.f81202v
            r1 = 2
            if (r0 != r1) goto L_0x02df
            android.content.Context r0 = r7.f81198r
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r2 = "click_share_button"
            java.lang.String r3 = r7.f81193m
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            java.lang.String r4 = r0.getAid()
            r5 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.aq.h r0 = new com.ss.android.ugc.aweme.aq.h
            r0.<init>(r8)
            java.lang.String r8 = r7.f81193m
            com.ss.android.ugc.aweme.aq.h r8 = r0.mo48086d(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo47954f(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48085c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48084b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48083a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48100j(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            int r1 = r7.f81196p
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r0, r1)
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48101k(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x02ce
            java.lang.String r0 = ""
            goto L_0x02d8
        L_0x01a7:
            android.content.Context r0 = r7.f81198r
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r2 = "click_share_button"
            java.lang.String r3 = "homepage_follow"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            java.lang.String r4 = r0.getAid()
            r5 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.aq.h r0 = new com.ss.android.ugc.aweme.aq.h
            r0.<init>(r8)
            java.lang.String r8 = "homepage_follow"
            com.ss.android.ugc.aweme.aq.h r8 = r0.mo48086d(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo47954f(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48085c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48084b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48083a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48100j(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            int r1 = r7.f81196p
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r0, r1)
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48101k(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = ""
            goto L_0x0232
        L_0x0228:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x0232:
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48091h(r0)
            r8.mo48076e()
            goto L_0x02df
        L_0x023b:
            android.content.Context r0 = r7.f81198r
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r2 = "click_share_button"
            java.lang.String r3 = "homepage_hot"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            java.lang.String r4 = r0.getAid()
            r5 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.aq.h r0 = new com.ss.android.ugc.aweme.aq.h
            r0.<init>(r8)
            java.lang.String r8 = "homepage_hot"
            com.ss.android.ugc.aweme.aq.h r8 = r0.mo48086d(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo47954f(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48085c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48084b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48083a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f81197q
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48100j(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            int r1 = r7.f81196p
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r0, r1)
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48101k(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x02bc
            java.lang.String r0 = ""
            goto L_0x02c6
        L_0x02bc:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x02c6:
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48091h(r0)
            r8.mo48076e()
            goto L_0x02df
        L_0x02ce:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f81192l
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x02d8:
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48091h(r0)
            r8.mo48076e()
        L_0x02df:
            com.ss.android.ugc.aweme.main.b.a r8 = new com.ss.android.ugc.aweme.main.b.a
            r8.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.VideoShareViewV1.onClick(android.view.View):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63419a(boolean z) {
        Drawable drawable;
        if (!C23794bh.m58394h().mo70343a() || !TextUtils.equals(C30130ag.m70703c(), "chat_merge")) {
            if (z) {
                drawable = C0726c.m2091a(this.f81198r, (int) R.drawable.csb);
                this.mShareCount.setVisibility(8);
            } else {
                drawable = C41979aq.m91947b().getFirstShareIcon((Activity) this.f81198r);
            }
            if (drawable != null) {
                this.shareIv.setImageDrawable(drawable);
                C26890h.m65011a("share_highlight", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", C23198ae.m56877m(this.f81192l)).mo47829a("author_id", C23198ae.m56846a(this.f81192l)).mo47829a("show_content", C30130ag.m70703c()).f61491a);
            }
        } else {
            C23794bh.m58394h().mo70341a(this.f81198r, this.shareIv, 4);
            C26890h.m65011a("share_highlight", C23089d.m56640a().mo47829a("enter_from", this.f81193m).mo47829a("group_id", C23198ae.m56877m(this.f81192l)).mo47829a("author_id", C23198ae.m56846a(this.f81192l)).mo47829a("show_content", C30130ag.m70703c()).f61491a);
        }
        this.mShareContainerView.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new Runnable() {
            public final void run() {
                VideoShareViewV1.this.mShareContainerView.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new Runnable() {
                    public final void run() {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(600);
                        scaleAnimation.setRepeatMode(2);
                        scaleAnimation.setRepeatCount(-1);
                        VideoShareViewV1.this.mShareContainerView.startAnimation(scaleAnimation);
                    }
                }).start();
            }
        }).start();
    }

    /* renamed from: a */
    private void m72051a(float f, float f2) {
        if (this.mShareContainerView != null && !this.f80541b) {
            this.f80541b = true;
            this.mShareContainerView.animate().scaleX(0.001f).scaleY(0.001f).setDuration(300).withEndAction(new C31003fp(this, f2, f)).start();
        }
    }
}

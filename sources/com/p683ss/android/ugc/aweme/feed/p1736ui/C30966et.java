package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.feed.experiment.InterctionShareButtonStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.InterctionShareButtonWhatsappStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareGuideLimitExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareIconInverseStrategyExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareIconVariantExperiment;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.guide.C30286i;
import com.p683ss.android.ugc.aweme.feed.helper.C30399u;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
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
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C41975an;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.et */
public final class C30966et extends C30241a implements C0199s<C23274a>, OnClickListener, C30313ae<C30332aw>, C30447d {

    /* renamed from: B */
    private static SharedPreferences f81097B;

    /* renamed from: A */
    private int f81098A = 0;

    /* renamed from: C */
    private String f81099C = null;

    /* renamed from: p */
    RemoteImageView f81100p;

    /* renamed from: q */
    TextView f81101q;

    /* renamed from: r */
    View f81102r;

    /* renamed from: s */
    boolean f81103s = false;

    /* renamed from: t */
    boolean f81104t = false;

    /* renamed from: u */
    public String f81105u;

    /* renamed from: v */
    private boolean f81106v;

    /* renamed from: w */
    private boolean f81107w;

    /* renamed from: x */
    private long f81108x = 0;

    /* renamed from: y */
    private boolean f81109y;

    /* renamed from: z */
    private volatile boolean f81110z = false;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60714a(Object obj) {
    }

    /* renamed from: e */
    public final void mo60599e() {
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final void mo63743h(Map<String, Object> map) {
        boolean z = true;
        if (map == null ? !C31357a.m73095a() || m72549n() : !((Boolean) map.get("isInActivityState")).booleanValue() || ((Boolean) map.get("isSelfAweme")).booleanValue()) {
            z = false;
        }
        if (!z || C30399u.m71324a(this.f79017j)) {
            m72543i(map);
        } else {
            m72543i(map);
        }
    }

    /* renamed from: k */
    private void m72546k() {
        if (this.f79021n == null || !C30399u.m71323a((Activity) this.f79021n.getActivity())) {
            m72547l();
        } else {
            this.f81100p.setImageResource(R.drawable.cso);
        }
    }

    /* renamed from: o */
    private static SharedPreferences m72550o() {
        if (f81097B == null) {
            f81097B = C35807d.m80935a(C11010c.m22280a(), "sp_video_digg_record", 0);
        }
        return f81097B;
    }

    /* renamed from: p */
    private static int m72551p() {
        return C10181b.m20511a().mo18168a(ShareIconInverseStrategyExperiment.class, true, "share_icon_inverse_strategy", 31744, 0);
    }

    /* renamed from: q */
    private static int m72552q() {
        if (C47915gg.m103651b()) {
            return 0;
        }
        return C10181b.m20511a().mo18168a(ShareGuideLimitExperiment.class, true, "share_guide_daily_limit", 31744, 0);
    }

    /* renamed from: l */
    private void m72547l() {
        this.f81102r.setAlpha(1.0f);
        this.f81100p.getLayoutParams().width = (int) C9432q.m18687b(this.f79017j, 40.0f);
        this.f81100p.getLayoutParams().height = -1;
        this.f81100p.setImageResource(C41975an.m91942a());
    }

    /* renamed from: n */
    private boolean m72549n() {
        if (this.f79011d == null) {
            return false;
        }
        User author = this.f79011d.getAuthor();
        if (author != null) {
            return TextUtils.equals(author.getUid(), C20854a.m53167g().getCurUser().getUid());
        }
        return false;
    }

    /* renamed from: s */
    private void m72554s() {
        if (this.f81102r != null && !this.f81104t) {
            this.f81104t = true;
            this.f81102r.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150).withEndAction(new Runnable() {
                public final void run() {
                    C30966et.this.f81102r.animate().scaleX(0.9f).scaleY(0.9f).setDuration(150).withEndAction(new Runnable() {
                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.05f, 0.9f, 1.05f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            C30966et.this.f81102r.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    /* renamed from: j */
    private void m72544j() {
        this.f81099C = C41979aq.m91947b().getMostUseShareChannel();
        boolean b = C30399u.f79466b.mo60817b(this.f79017j);
        if (this.f81099C != null || !b) {
            int a = C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0);
            if (this.f81099C == null || a == 1) {
                m72547l();
                return;
            }
            Drawable channelDrawable = C41979aq.m91947b().channelDrawable(this.f79021n.getActivity(), this.f81099C);
            if (channelDrawable != null) {
                this.f81100p.getLayoutParams().width = (int) C9432q.m18687b(this.f79017j, 36.0f);
                this.f81100p.getLayoutParams().height = (int) C9432q.m18687b(this.f79017j, 36.0f);
                this.f81100p.setImageDrawable(channelDrawable);
            }
            return;
        }
        this.f81100p.getLayoutParams().width = (int) C9432q.m18687b(this.f79017j, 36.0f);
        this.f81100p.getLayoutParams().height = (int) C9432q.m18687b(this.f79017j, 36.0f);
        this.f81100p.setImageResource(R.drawable.cso);
    }

    /* renamed from: m */
    private boolean m72548m() {
        try {
            if (C11016e.m22312g() != this.f79021n.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m82601a((FragmentActivity) C11016e.m22312g()).getAid(), this.f79011d.getAid()) || !C30399u.m71324a(this.f79017j) || !C30399u.m71325a(this.f79011d) || C30286i.m71202a().mo60688a(this.f79011d.getAid())) {
                return false;
            }
            C30286i.m71202a().mo60689b(this.f79011d.getAid());
            int a = C10181b.m20511a().mo18168a(InterctionShareButtonWhatsappStyleExperiment.class, true, "interction_share_button_whatsapp_style", 31744, 0);
            if (!C30399u.m71323a((Activity) this.f79021n.getActivity())) {
                this.f81100p.setImageResource(R.drawable.cso);
                switch (a) {
                    case 1:
                        m72540a(1.02f, 0.95f);
                        break;
                    case 2:
                        m72540a(1.05f, 0.9f);
                        break;
                }
            } else {
                switch (a) {
                    case 1:
                        m72540a(1.02f, 0.95f);
                        break;
                    case 2:
                        m72554s();
                        break;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: r */
    private void m72553r() {
        boolean z;
        boolean z2;
        boolean z3;
        final boolean z4;
        final boolean z5;
        if (!this.f81104t && C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0) == 0 && m72552q() == 0 && !C47915gg.m103651b() && !this.f81107w && !this.f81109y && !C47950q.m103755d(this.f79011d) && !C47950q.m103754c(this.f79011d) && !C30399u.m71324a(this.f79017j)) {
            if (!C31190f.m72843k(this.f79011d) || C31190f.m72844l(this.f79011d)) {
                z = false;
            } else {
                z = true;
            }
            if (C10181b.m20511a().mo18168a(ShareIconVariantExperiment.class, true, "share_icon_variant", 31744, 0) == 1 && m72551p() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = Keva.getRepo("share_repo").getBoolean("user_download_action", false);
            if (m72551p() == 1 || (!z6 && m72551p() == 2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z || (!z2 && !z3)) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.f81103s = true;
            final Aweme aweme = this.f79011d;
            final String str = this.f79012e;
            if (!C23794bh.m58394h().mo70343a() || !TextUtils.equals(C30130ag.m70703c(), "chat_merge")) {
                z5 = false;
            } else {
                z5 = true;
            }
            C30255o oVar = C30255o.f79039a;
            C309757 r5 = new Runnable() {
                public final void run() {
                    ViewPropertyAnimator duration = C30966et.this.f81102r.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300);
                    C30995fh fhVar = new C30995fh(this, z5, str, aweme, z4);
                    duration.withEndAction(fhVar).start();
                }
            };
            oVar.mo60617a(new C30256p(false, r5));
        }
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f79012e;
    }

    public C30966et(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
    }

    @C53771m
    public final void onVideoPlayerEvent(final C43893g gVar) {
        if (gVar.f111162c == 7 && TextUtils.equals(gVar.f111165f, this.f79011d.getAid())) {
            C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                public final void run() {
                    synchronized (C30966et.this) {
                        C30966et.this.mo63737a(gVar.f111165f);
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    private void m72541a(Aweme aweme) {
        if (C47915gg.m103651b()) {
            this.f81100p.setImageResource(R.drawable.dge);
            C23729p.m58257a((View) this.f81101q, 8);
        }
        if (C36330a.m81964a(aweme) && this.f81101q != null) {
            this.f81101q.setText("0");
        }
    }

    /* renamed from: i */
    private void m72543i(Map<String, Object> map) {
        Aweme aweme;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
        } else {
            aweme = this.f79011d;
        }
        if (C47915gg.m103651b()) {
            this.f81100p.setImageResource(R.drawable.dge);
            C23729p.m58257a((View) this.f81101q, 8);
        } else if (aweme != null && aweme.getAuthor() != null && !RefineShareInSiteExperiment.INSTANCE.mo73737b() && C20854a.m53167g().isMe(aweme.getAuthor().getUid())) {
            this.f81100p.setImageResource(R.drawable.dge);
        } else if (C30399u.m71324a(this.f79017j)) {
            m72546k();
        } else if (C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0) != 0) {
            m72544j();
        } else {
            try {
                m72547l();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        boolean z;
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!aVar.f62242a.equals("video_params") || this.f79011d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("ui_state", hashMap);
        hashMap.put("aweme_state", this.f79011d);
        hashMap.put("isInActivityState", Boolean.valueOf(C31357a.m73095a()));
        hashMap.put("isSelfAweme", Boolean.valueOf(m72549n()));
        if (m72549n() || ((!C47950q.m103755d(this.f79011d) && !C47950q.m103754c(this.f79011d)) || C31201m.m72857a(this.f79011d, this.f79015h))) {
            z = false;
        } else {
            z = true;
        }
        hashMap.put("share_enable_state", Boolean.valueOf(z));
        return aVar2;
    }

    /* renamed from: c */
    public final void mo63584c(Map<String, Object> map) {
        String str = (String) map.get("shareCountTextState");
        if (this.f81104t) {
            this.f81104t = false;
            C30255o.f79039a.mo60617a(new C30256p(false, new C30989fb(this, map)));
        }
        if (this.f81103s) {
            this.f81103s = false;
            C30255o.f79039a.mo60617a(new C30256p(false, new C30990fc(this, map)));
        }
        if (this.f81109y) {
            this.f81109y = false;
            C30255o.f79039a.mo60617a(new C30256p(false, new C30991fd(this, str, map)));
        }
        if (this.f81107w) {
            this.f81107w = false;
            C30255o.f79039a.mo60617a(new C30256p(false, new C30992fe(this, map)));
        }
    }

    /* renamed from: d */
    public final void mo63742g(Map<String, Object> map) {
        Animation animation = this.f81102r.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f81102r.clearAnimation();
        if (C31357a.m73095a()) {
            mo63743h(map);
        } else if (C30399u.m71324a(this.f79017j)) {
            m72546k();
        } else if (C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0) != 0) {
            m72544j();
        } else {
            m72547l();
        }
        this.f81102r.setScaleX(1.0f);
        this.f81102r.setScaleY(1.0f);
        m72545j(map);
    }

    /* renamed from: b */
    private boolean m72542b(String str) {
        Drawable drawable;
        if (this.f81098A != 2) {
            return false;
        }
        try {
            if (C11016e.m22312g() != this.f79021n.getActivity() || !TextUtils.equals(AwemeChangeCallBack.m82601a((FragmentActivity) C11016e.m22312g()).getAid(), this.f79011d.getAid())) {
                return false;
            }
            boolean b = C30399u.f79466b.mo60817b(this.f79017j);
            int a = C10181b.m20511a().mo18168a(InterctionShareButtonStyleExperiment.class, true, "interction_share_button_style", 31744, 0);
            if (a == 0 || (this.f81099C == null && !b)) {
                return false;
            }
            if (C30286i.m71202a().mo60688a(this.f79011d.getAid())) {
                return true;
            }
            C30286i.m71202a().mo60689b(this.f79011d.getAid());
            this.f81100p.getLayoutParams().width = (int) C9432q.m18687b(this.f79017j, 36.0f);
            this.f81100p.getLayoutParams().height = (int) C9432q.m18687b(this.f79017j, 36.0f);
            if (TextUtils.isEmpty(this.f81099C) || this.f79021n == null || this.f79021n.getActivity() == null) {
                drawable = this.f79017j.getResources().getDrawable(R.drawable.cso);
            } else {
                drawable = C41979aq.m91947b().channelDrawable(this.f79021n.getActivity(), this.f81099C);
            }
            this.f81100p.setImageDrawable(drawable);
            if ((a == 1 && this.f81099C == null) || a == 2) {
                m72554s();
                return true;
            } else if (a == 3) {
                m72540a(1.05f, 0.9f);
                return true;
            } else if (a != 1 || this.f81099C == null || this.f79021n == null || this.f79021n.getActivity() == null) {
                return false;
            } else {
                m72540a(1.05f, 0.9f);
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    private void m72545j(Map<String, Object> map) {
        Aweme aweme = (Aweme) map.get("aweme_state");
        if (aweme != null) {
            User author = aweme.getAuthor();
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics == null || author == null) {
                this.f81101q.setVisibility(8);
            } else if (TextUtils.equals(C20854a.m53167g().getCurUserId(), author.getUid())) {
                this.f81101q.setVisibility(8);
            } else if (C10181b.m20511a().mo18168a(ShareButtonStyleExperiment.class, true, "share_button_style", 31744, 0) == 2) {
                this.f81101q.setVisibility(0);
                this.f81101q.setTextSize(1, 10.0f);
                this.f81101q.setText(R.string.fbv);
            } else if (C10181b.m20511a().mo18168a(ShareButtonStyleExperiment.class, true, "share_button_style", 31744, 0) == 3) {
                this.f81101q.setVisibility(0);
                this.f81101q.setTextSize(1, 12.0f);
                this.f81101q.setText(C33095b.m76068a(statistics.getShareCount()));
            } else {
                this.f81101q.setVisibility(8);
            }
            m72541a(aweme);
        }
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6x);
        this.f81100p = (RemoteImageView) this.f79019l.findViewById(R.id.cn8);
        this.f81101q = (TextView) this.f79019l.findViewById(R.id.cn1);
        this.f81102r = this.f79019l.findViewById(R.id.cmz);
        this.f81100p.setOnClickListener(this);
        this.f81101q.setOnClickListener(this);
        this.f81102r.setOnClickListener(this);
        this.f81102r.setOnTouchListener(C23729p.m58253a());
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        dataCenter.mo48226a("video_show_share_guide_animation", (C0199s<C23274a>) this.f79009b).mo48226a("video_show_share_panel_guide_animation", (C0199s<C23274a>) this.f79009b).mo48226a("video_hide_share_panel_guide_animation", (C0199s<C23274a>) this.f79009b).mo48226a("update_diig_view", (C0199s<C23274a>) this.f79009b).mo48226a("video_on_pause", (C0199s<C23274a>) this.f79009b).mo48226a("pause_share_guide_animation", (C0199s<C23274a>) this.f79009b).mo48226a("recover_share_guide_animation", (C0199s<C23274a>) this.f79009b).mo48226a("on_page_unselected", (C0199s<C23274a>) this.f79009b).mo48226a("on_page_selected", (C0199s<C23274a>) this.f79009b).mo48226a("video_digg", (C0199s<C23274a>) this.f79009b).mo48226a("handle_double_click", (C0199s<C23274a>) this.f79009b).mo48226a("video_share_click", (C0199s<C23274a>) this.f79009b).mo48226a("show_festival_activity_icon", (C0199s<C23274a>) this.f79009b).mo48226a("awesome_update_backup_data", (C0199s<C23274a>) this.f79009b).mo48226a("video_show_flip_share_drawable", (C0199s<C23274a>) this.f79009b);
    }

    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60600e(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r11.f62242a
            int r1 = r0.hashCode()
            r2 = 5
            r3 = -1
            r4 = 3
            r5 = 1
            r6 = 0
            switch(r1) {
                case -1618328215: goto L_0x00aa;
                case -1475411887: goto L_0x009f;
                case -1070474451: goto L_0x0095;
                case -777668341: goto L_0x008b;
                case 245017106: goto L_0x0080;
                case 249129690: goto L_0x0076;
                case 281945252: goto L_0x006b;
                case 350216171: goto L_0x0060;
                case 651229933: goto L_0x0055;
                case 920041496: goto L_0x004b;
                case 1181771620: goto L_0x003f;
                case 1346787590: goto L_0x0034;
                case 1628582276: goto L_0x0029;
                case 1863388195: goto L_0x001e;
                case 1952793192: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x00b5
        L_0x0013:
            java.lang.String r1 = "video_show_share_panel_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 6
            goto L_0x00b6
        L_0x001e:
            java.lang.String r1 = "video_show_share_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 5
            goto L_0x00b6
        L_0x0029:
            java.lang.String r1 = "on_page_unselected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            goto L_0x00b6
        L_0x0034:
            java.lang.String r1 = "recover_share_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 3
            goto L_0x00b6
        L_0x003f:
            java.lang.String r1 = "video_share_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 10
            goto L_0x00b6
        L_0x004b:
            java.lang.String r1 = "pause_share_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 2
            goto L_0x00b6
        L_0x0055:
            java.lang.String r1 = "awesome_update_backup_data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 12
            goto L_0x00b6
        L_0x0060:
            java.lang.String r1 = "on_page_selected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 11
            goto L_0x00b6
        L_0x006b:
            java.lang.String r1 = "show_festival_activity_icon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 14
            goto L_0x00b6
        L_0x0076:
            java.lang.String r1 = "video_on_pause"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 1
            goto L_0x00b6
        L_0x0080:
            java.lang.String r1 = "video_show_flip_share_drawable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 13
            goto L_0x00b6
        L_0x008b:
            java.lang.String r1 = "update_diig_view"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 4
            goto L_0x00b6
        L_0x0095:
            java.lang.String r1 = "video_hide_share_panel_guide_animation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 7
            goto L_0x00b6
        L_0x009f:
            java.lang.String r1 = "handle_double_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 9
            goto L_0x00b6
        L_0x00aa:
            java.lang.String r1 = "video_digg"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            r0 = 8
            goto L_0x00b6
        L_0x00b5:
            r0 = -1
        L_0x00b6:
            switch(r0) {
                case 0: goto L_0x0309;
                case 1: goto L_0x0309;
                case 2: goto L_0x02a8;
                case 3: goto L_0x02a0;
                case 4: goto L_0x0293;
                case 5: goto L_0x028f;
                case 6: goto L_0x027f;
                case 7: goto L_0x0272;
                case 8: goto L_0x01bc;
                case 9: goto L_0x013d;
                case 10: goto L_0x013c;
                case 11: goto L_0x0128;
                case 12: goto L_0x0111;
                case 13: goto L_0x00eb;
                case 14: goto L_0x00bb;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x0346
        L_0x00bb:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r0 = "isInActivityState"
            boolean r1 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.put(r0, r1)
            java.lang.String r0 = "isSelfAweme"
            boolean r1 = r10.m72549n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.put(r0, r1)
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r0 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r1 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.fa r2 = new com.ss.android.ugc.aweme.feed.ui.fa
            r2.<init>(r10, r11)
            r1.<init>(r6, r2)
            r0.mo60617a(r1)
            goto L_0x0346
        L_0x00eb:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f79011d
            boolean r11 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73097a(r11)
            if (r11 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f79011d
            com.ss.android.ugc.aweme.profile.model.User r11 = r11.getAuthor()
            if (r11 == 0) goto L_0x0110
            boolean r11 = r10.f81107w
            if (r11 != 0) goto L_0x0110
            com.ss.android.ugc.aweme.IAccountUserService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
            r11.isMe(r0)
        L_0x0110:
            return
        L_0x0111:
            java.lang.Object r0 = r11.mo48246a()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.p683ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L_0x0346
            com.ss.android.ugc.aweme.arch.widgets.base.a r0 = new com.ss.android.ugc.aweme.arch.widgets.base.a
            java.lang.String r1 = "video_params"
            java.lang.Object r11 = r11.mo48246a()
            r0.<init>(r1, r11)
            r10.onChanged(r0)
            return
        L_0x0128:
            android.view.View r11 = r10.f81102r
            if (r11 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$10 r1 = new com.ss.android.ugc.aweme.feed.ui.et$10
            r1.<init>()
            r0.<init>(r6, r1)
            r11.mo60617a(r0)
        L_0x013b:
            return
        L_0x013c:
            return
        L_0x013d:
            boolean r11 = r10.f81106v
            if (r11 != 0) goto L_0x0346
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f79011d
            if (r11 == 0) goto L_0x0346
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f79011d
            int r11 = r11.getUserDigg()
            if (r11 != 0) goto L_0x0346
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r10.f79011d
            if (r11 == 0) goto L_0x0346
            boolean r0 = r11.isProhibited()
            if (r0 != 0) goto L_0x0346
            boolean r0 = r10.f81107w
            if (r0 == 0) goto L_0x015d
            goto L_0x0346
        L_0x015d:
            boolean r0 = r10.f81106v
            if (r0 != 0) goto L_0x01bb
            int r11 = r11.getUserDigg()
            if (r11 != 0) goto L_0x01bb
            boolean r11 = r10.f81103s
            if (r11 != 0) goto L_0x01bb
            boolean r11 = com.p683ss.android.ugc.aweme.feed.utils.C31201m.m72856a()
            if (r11 == 0) goto L_0x01bb
            r10.f81109y = r5
            com.ss.android.ugc.aweme.app.SharePrefCache r11 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r11 = r11.getIsShowFavouriteIcon()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r11.mo47776a(r0)
            android.widget.TextView r11 = r10.f81101q
            if (r11 == 0) goto L_0x01ac
            android.widget.TextView r11 = r10.f81101q
            java.lang.CharSequence r11 = r11.getText()
            if (r11 == 0) goto L_0x0199
            android.widget.TextView r11 = r10.f81101q
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            goto L_0x019b
        L_0x0199:
            java.lang.String r11 = ""
        L_0x019b:
            r10.f81105u = r11
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$8 r1 = new com.ss.android.ugc.aweme.feed.ui.et$8
            r1.<init>()
            r0.<init>(r6, r1)
            r11.mo60617a(r0)
        L_0x01ac:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$9 r1 = new com.ss.android.ugc.aweme.feed.ui.et$9
            r1.<init>()
            r0.<init>(r6, r1)
            r11.mo60617a(r0)
        L_0x01bb:
            return
        L_0x01bc:
            java.lang.Object r11 = r11.mo48246a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r2) goto L_0x0346
            int r11 = m72552q()
            if (r11 == 0) goto L_0x0271
            int r11 = m72552q()
            r0 = -2
            if (r11 == r0) goto L_0x0271
            int r11 = m72552q()
            if (r11 == r3) goto L_0x0271
            com.ss.android.ugc.aweme.IAccountUserService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r11 = r11.getCurUserId()
            int r0 = m72552q()
            android.content.SharedPreferences r1 = m72550o()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "video_digg_"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            int r1 = r1.getInt(r2, r6)
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r6 = m72550o()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "video_digg_time_"
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r8 = 0
            long r6 = r6.getLong(r7, r8)
            boolean r6 = android.text.format.DateUtils.isToday(r6)
            if (r6 != 0) goto L_0x024e
            android.content.SharedPreferences r0 = m72550o()
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
            r0.putInt(r11, r5)
            r0.apply()
            goto L_0x0346
        L_0x024e:
            if (r0 <= r4) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r0 = 3
        L_0x0252:
            if (r1 > r0) goto L_0x0271
            android.content.SharedPreferences r0 = m72550o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "video_digg_"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            int r1 = r1 + r5
            r0.putInt(r11, r1)
            r0.apply()
        L_0x0271:
            return
        L_0x0272:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            java.lang.Runnable r1 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30981ev.f81133a
            r0.<init>(r6, r1)
            r11.mo60617a(r0)
            return
        L_0x027f:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r11 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r0 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.eu r1 = new com.ss.android.ugc.aweme.feed.ui.eu
            r1.<init>(r10)
            r0.<init>(r6, r1)
            r11.mo60617a(r0)
            return
        L_0x028f:
            r10.m72553r()
            return
        L_0x0293:
            java.lang.Object r11 = r11.mo48246a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r10.f81106v = r11
            return
        L_0x02a0:
            boolean r11 = r10.f81103s
            if (r11 == 0) goto L_0x02a7
            r10.m72553r()
        L_0x02a7:
            return
        L_0x02a8:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r0 = "isInActivityState"
            boolean r1 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.put(r0, r1)
            java.lang.String r0 = "isSelfAweme"
            boolean r1 = r10.m72549n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.put(r0, r1)
            boolean r0 = r10.f81103s
            if (r0 == 0) goto L_0x02da
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r0 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r1 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$4 r2 = new com.ss.android.ugc.aweme.feed.ui.et$4
            r2.<init>(r11)
            r1.<init>(r6, r2)
            r0.mo60617a(r1)
        L_0x02da:
            boolean r0 = r10.f81109y
            if (r0 == 0) goto L_0x0308
            android.widget.TextView r0 = r10.f81101q
            if (r0 == 0) goto L_0x02f9
            java.lang.String r0 = r10.f81105u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02f9
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r0 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r1 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$5 r2 = new com.ss.android.ugc.aweme.feed.ui.et$5
            r2.<init>()
            r1.<init>(r6, r2)
            r0.mo60617a(r1)
        L_0x02f9:
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r0 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r1 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$6 r2 = new com.ss.android.ugc.aweme.feed.ui.et$6
            r2.<init>(r11)
            r1.<init>(r6, r2)
            r0.mo60617a(r1)
        L_0x0308:
            return
        L_0x0309:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r0 = "isInActivityState"
            boolean r1 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.put(r0, r1)
            java.lang.String r0 = "isSelfAweme"
            boolean r1 = r10.m72549n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.put(r0, r1)
            java.lang.String r0 = r10.f81105u
            java.lang.String r1 = "shareCountTextState"
            r11.put(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f79011d
            java.lang.String r1 = "aweme_state"
            r11.put(r1, r0)
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r0 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r1 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.ui.et$1 r2 = new com.ss.android.ugc.aweme.feed.ui.et$1
            r2.<init>(r11)
            r1.<init>(r6, r2)
            r0.mo60617a(r1)
            return
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30966et.mo60600e(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013f, code lost:
        if (r1.equals("homepage_hot") == false) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x026b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
            boolean r8 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r8)
            if (r8 == 0) goto L_0x000a
            return
        L_0x000a:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f81108x
            long r2 = r0 - r2
            r4 = 800(0x320, double:3.953E-321)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x001d
            r0 = 0
            r7.f81108x = r0
            return
        L_0x001d:
            r7.f81108x = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            if (r8 != 0) goto L_0x0024
            return
        L_0x0024:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            boolean r8 = r8.isCanPlay()
            if (r8 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            boolean r8 = r8.isDelete()
            if (r8 == 0) goto L_0x0046
        L_0x0034:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            int r0 = r7.f79015h
            boolean r8 = com.p683ss.android.ugc.aweme.feed.utils.C31201m.m72857a(r8, r0)
            if (r8 != 0) goto L_0x0046
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            boolean r8 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81965b(r8)
            if (r8 == 0) goto L_0x005e
        L_0x0046:
            int r8 = r7.f79015h
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r8 == r0) goto L_0x0086
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            int r0 = r7.f79015h
            boolean r8 = com.p683ss.android.ugc.aweme.feed.utils.C31201m.m72857a(r8, r0)
            if (r8 != 0) goto L_0x0086
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            boolean r8 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r8)
            if (r8 == 0) goto L_0x0086
        L_0x005e:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f79011d
            boolean r8 = r8.isImage()
            if (r8 == 0) goto L_0x0073
            android.content.Context r8 = r7.f79017j
            r0 = 2132545667(0x7f1c1083, float:2.074453E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r0)
            r8.mo19066a()
            return
        L_0x0073:
            android.content.Context r8 = r7.f79017j
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            r1 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81963a(r0, r1)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r8, r0)
            r8.mo19066a()
            return
        L_0x0086:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r8 = r7.f79016i
            java.lang.String r0 = "video_share_click"
            r1 = 0
            r8.mo48228a(r0, r1)
            boolean r8 = r7.f81103s
            r0 = 0
            if (r8 == 0) goto L_0x00c7
            java.lang.String r8 = "share_highlight_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f79011d
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f79011d
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "show_content"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.feed.C30130ag.m70703c()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "is_pop_up"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r1)
            goto L_0x00de
        L_0x00c7:
            com.ss.android.ugc.aweme.feed.helper.i r8 = com.p683ss.android.ugc.aweme.feed.helper.C30385i.m71299a()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r7.f81100p
            java.lang.String r2 = r7.f79012e
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f79011d
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f79011d
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56846a(r4)
            r8.mo60806a(r1, r2, r3, r4)
        L_0x00de:
            com.ss.android.ugc.aweme.secapi.ISecApi r8 = com.p683ss.android.ugc.aweme.sec.SecApiImpl.createISecApibyMonsterPlugin()
            com.ss.android.ugc.aweme.secapi.ISecApi r8 = (com.p683ss.android.ugc.aweme.secapi.ISecApi) r8
            java.lang.String r1 = "share"
            r8.reportData(r1)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r1 = "isInActivityState"
            boolean r2 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r8.put(r1, r2)
            java.lang.String r1 = "isSelfAweme"
            boolean r2 = r7.m72549n()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r8.put(r1, r2)
            java.lang.String r1 = r7.f81105u
            java.lang.String r2 = "shareCountTextState"
            r8.put(r2, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f79011d
            java.lang.String r2 = "aweme_state"
            r8.put(r2, r1)
            r7.mo63584c(r8)
            java.lang.String r8 = r7.f79012e
            if (r8 != 0) goto L_0x0121
            java.lang.String r8 = ""
            r7.f79012e = r8
        L_0x0121:
            com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r8 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
            boolean r8 = r8.mo73737b()
            java.lang.String r1 = r7.f79012e
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r3 == r4) goto L_0x0142
            r4 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r3 == r4) goto L_0x0139
            goto L_0x014c
        L_0x0139:
            java.lang.String r3 = "homepage_hot"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x014c
            goto L_0x014d
        L_0x0142:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014c
            r0 = 1
            goto L_0x014d
        L_0x014c:
            r0 = -1
        L_0x014d:
            switch(r0) {
                case 0: goto L_0x026b;
                case 1: goto L_0x01d7;
                default: goto L_0x0150;
            }
        L_0x0150:
            int r0 = r7.f79022o
            r1 = 2
            if (r0 != r1) goto L_0x030f
            android.content.Context r0 = r7.f79017j
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r2 = "click_share_button"
            java.lang.String r3 = r7.f79012e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            java.lang.String r4 = r0.getAid()
            r5 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.aq.h r0 = new com.ss.android.ugc.aweme.aq.h
            r0.<init>(r8)
            java.lang.String r8 = r7.f79012e
            com.ss.android.ugc.aweme.aq.h r8 = r0.mo48086d(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo47954f(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48085c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48084b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48083a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48100j(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            int r1 = r7.f79015h
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r0, r1)
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48101k(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x02fe
            java.lang.String r0 = ""
            goto L_0x0308
        L_0x01d7:
            android.content.Context r0 = r7.f79017j
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r2 = "click_share_button"
            java.lang.String r3 = "homepage_follow"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            java.lang.String r4 = r0.getAid()
            r5 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.aq.h r0 = new com.ss.android.ugc.aweme.aq.h
            r0.<init>(r8)
            java.lang.String r8 = "homepage_follow"
            com.ss.android.ugc.aweme.aq.h r8 = r0.mo48086d(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo47954f(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48085c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48084b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48083a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48100j(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            int r1 = r7.f79015h
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r0, r1)
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48101k(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x0258
            java.lang.String r0 = ""
            goto L_0x0262
        L_0x0258:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x0262:
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48091h(r0)
            r8.mo48076e()
            goto L_0x030f
        L_0x026b:
            android.content.Context r0 = r7.f79017j
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r2 = "click_share_button"
            java.lang.String r3 = "homepage_hot"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            java.lang.String r4 = r0.getAid()
            r5 = 0
            com.p683ss.android.ugc.aweme.common.C26890h.m65005a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.aq.h r0 = new com.ss.android.ugc.aweme.aq.h
            r0.<init>(r8)
            java.lang.String r8 = "homepage_hot"
            com.ss.android.ugc.aweme.aq.h r8 = r0.mo48086d(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo47954f(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_id"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48085c(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_id_key"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48084b(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "playlist_type"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48083a(r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.f79016i
            java.lang.String r1 = "tab_name"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo48230b(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48100j(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            int r1 = r7.f79015h
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56854b(r0, r1)
            com.ss.android.ugc.aweme.aq.k r8 = r8.mo48101k(r0)
            com.ss.android.ugc.aweme.aq.h r8 = (com.p683ss.android.ugc.aweme.p1382aq.C23238h) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x02ec
            java.lang.String r0 = ""
            goto L_0x02f6
        L_0x02ec:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x02f6:
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48091h(r0)
            r8.mo48076e()
            goto L_0x030f
        L_0x02fe:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f79011d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getUid()
        L_0x0308:
            com.ss.android.ugc.aweme.aq.h r8 = r8.mo48091h(r0)
            r8.mo48076e()
        L_0x030f:
            com.ss.android.ugc.aweme.main.b.a r8 = new com.ss.android.ugc.aweme.main.b.a
            r8.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30966et.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo63737a(String str) {
        this.f81098A++;
        if (!m72548m() && !m72542b(str)) {
            int q = m72552q();
            if (q != 0 && q != -2) {
                try {
                    if (C11016e.m22312g() != this.f79021n.getActivity() || TextUtils.equals(AwemeChangeCallBack.m82601a((FragmentActivity) C11016e.m22312g()).getAid(), this.f79011d.getAid())) {
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo63738a(String str, Map map) {
        if (this.f81101q != null && this.f81101q.getVisibility() == 0 && !TextUtils.isEmpty(str)) {
            this.f81101q.setText(str);
        }
        mo63742g(map);
    }

    /* renamed from: a */
    private void m72540a(float f, float f2) {
        if (this.f81102r != null && !this.f81104t) {
            this.f81104t = true;
            this.f81102r.animate().scaleX(0.001f).scaleY(0.001f).setDuration(300).withEndAction(new C30994fg(this, f2, f)).start();
        }
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
            if (RefineShareInSiteExperiment.INSTANCE.mo73737b() && C47915gg.m103651b()) {
                this.f79018k.setVisibility(8);
            }
        }
        if (aVar != null) {
            HashMap hashMap = (HashMap) aVar.mo48246a();
            if (((Aweme) hashMap.get("aweme_state")) != null) {
                this.f81102r.setVisibility(0);
                this.f81101q.setVisibility(0);
                mo63743h((Map<String, Object>) hashMap);
                if (C31201m.m72857a(this.f79011d, this.f79015h) || ((!C47950q.m103755d(this.f79011d) && !C47950q.m103754c(this.f79011d)) || m72549n())) {
                    this.f81102r.setAlpha(1.0f);
                    this.f81102r.setEnabled(true);
                } else {
                    this.f81102r.setAlpha(0.5f);
                    this.f81102r.setEnabled(false);
                }
                m72545j(hashMap);
                this.f81098A = 0;
            }
        }
    }
}

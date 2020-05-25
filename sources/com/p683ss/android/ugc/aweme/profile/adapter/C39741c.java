package com.p683ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.commercialize.log.C26065bb;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26833a;
import com.p683ss.android.ugc.aweme.experiment.C29506g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.experiment.ShowPrivateAlbumExp;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.c */
public final class C39741c extends C26833a {

    /* renamed from: a */
    Context f101448a;

    /* renamed from: b */
    public String f101449b;

    /* renamed from: c */
    View f101450c;

    /* renamed from: d */
    View f101451d;

    /* renamed from: e */
    View f101452e;

    /* renamed from: f */
    private DmtTextView f101453f;

    /* renamed from: g */
    private View f101454g;

    /* renamed from: h */
    private TextView f101455h;

    /* renamed from: o */
    private ImageView f101456o;

    /* renamed from: p */
    private TextView f101457p;

    /* renamed from: q */
    private DmtTextView f101458q;

    /* renamed from: r */
    private ViewGroup f101459r;

    /* renamed from: s */
    private View f101460s;

    /* renamed from: t */
    private View f101461t;

    /* renamed from: u */
    private TextView f101462u;

    /* renamed from: v */
    private View f101463v;

    /* renamed from: w */
    private TextView f101464w;

    /* renamed from: x */
    private Drawable f101465x;

    /* renamed from: y */
    private boolean f101466y = true;

    /* renamed from: c */
    public final void mo50308c() {
        mo50301a();
    }

    /* renamed from: b */
    public final int[] mo50307b() {
        return C47788ct.m103417a(200);
    }

    /* renamed from: k */
    private void m88462k() {
        this.f101466y = true;
        this.f101464w.setVisibility(8);
        this.f101458q.setVisibility(8);
        this.f101459r.setVisibility(0);
        if (this.f101460s.getVisibility() == 0) {
            this.f101460s.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo50301a() {
        if (this.f70665k != null) {
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (mo54753a(video, "AwemeViewHolder")) {
                    this.f70667m = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                    this.f70666l.setImageResource(R.color.a1x);
                } else {
                    mo54752a(video.getCover(), "AwemeViewHolder");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m88458a(Context context, Aweme aweme) {
        if (!(aweme == null || !C26065bb.m63156a().f68837b || aweme.getStarRecommendTag() == null)) {
            C25944j.m62908a().getFeedRawAdLogService().mo53126a(context, "starpage_ad", "othershow", "{}", "cover_tag", aweme.getAdOrderId());
        }
    }

    public C39741c(View view, String str, final C24579d dVar) {
        super(view);
        this.f101448a = view.getContext();
        this.f101449b = str;
        this.f101450c = view.findViewById(R.id.yw);
        this.f101451d = view.findViewById(R.id.eqi);
        this.f70666l = (SmartImageView) view.findViewById(R.id.a22);
        this.f101457p = (TextView) view.findViewById(R.id.ddq);
        this.f101453f = (DmtTextView) view.findViewById(R.id.dhp);
        this.f101454g = view.findViewById(R.id.cs2);
        this.f101455h = (TextView) view.findViewById(R.id.cs3);
        this.f101456o = (ImageView) view.findViewById(R.id.dpi);
        this.f101458q = (DmtTextView) view.findViewById(R.id.c6k);
        this.f101459r = (ViewGroup) view.findViewById(R.id.dpe);
        this.f101461t = view.findViewById(R.id.crw);
        this.f101462u = (TextView) view.findViewById(R.id.cru);
        this.f101464w = (TextView) view.findViewById(R.id.ez9);
        this.f101460s = view.findViewById(R.id.bk7);
        this.f70666l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!(C39741c.this.f70665k == null || dVar == null)) {
                    dVar.mo50347a(view, (Aweme) C39741c.this.f70665k, C39741c.this.f101449b);
                }
            }
        });
        this.f70666l.setAnimationListener(this.f70660j);
        this.f101463v = view.findViewById(R.id.f6n);
        this.f101452e = view.findViewById(R.id.ehs);
    }

    /* renamed from: a */
    private static boolean m88461a(Aweme aweme, View view, TextView textView) {
        view.setVisibility(8);
        if (!C23198ae.m56880p(aweme)) {
            return false;
        }
        AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
        if (starAtlasInfo == null) {
            return false;
        }
        Context context = view.getContext();
        int reviewStatus = starAtlasInfo.getReviewStatus();
        String str = "";
        switch (reviewStatus) {
            case 1:
                str = context.getString(R.string.dqd);
                break;
            case 2:
                str = context.getString(R.string.dqk);
                break;
            case 3:
                str = context.getString(R.string.dqi);
                break;
            case 4:
                str = context.getString(R.string.dq7);
                break;
            case 6:
                str = context.getString(R.string.dq5);
                break;
            case 7:
                str = context.getString(R.string.dq9);
                break;
        }
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
            return false;
        }
        C26890h.m65011a("starmap_cover_review_show", C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a("enter_from", "personal_homepage").mo47829a("tag_label", C25944j.m62908a().getAdDataUtilsService().mo54129a(reviewStatus)).f61491a);
        view.setVisibility(0);
        textView.setText(str);
        return true;
    }

    /* renamed from: a */
    private void m88460a(Aweme aweme, boolean z, int i, boolean z2) {
        if (!z2 || (((!z || i != 0) && !C31190f.m72831a(aweme)) || aweme.getStatus().getPrivateStatus() == 0)) {
            this.f101456o.setVisibility(8);
        } else {
            this.f101456o.setVisibility(0);
            if (aweme.getStatus().getPrivateStatus() == 1) {
                this.f101456o.setImageResource(R.drawable.dqc);
            } else if (aweme.getStatus().getPrivateStatus() == 2) {
                this.f101456o.setImageResource(R.drawable.dq_);
            }
            if (ShowPrivateAlbumExp.m88630a()) {
                this.f101457p.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private static void m88459a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (textView != null) {
            if (VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo80836a(Aweme aweme, int i, boolean z, String str, boolean z2, int i2) {
        Aweme aweme2 = aweme;
        boolean z3 = z2;
        int i3 = i2;
        if (aweme2 != null) {
            this.f70665k = aweme2;
            m88462k();
            if (((Aweme) this.f70665k).isProhibited() && C23198ae.m56880p((Aweme) this.f70665k)) {
                this.f101458q.setVisibility(0);
                this.f101459r.setVisibility(8);
                this.f101460s.setVisibility(0);
                this.f101458q.setFontType(C10751d.f28903b);
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (aweme.getIsTop() == 1 && i3 == 0) {
                this.f101453f.setVisibility(0);
            } else {
                this.f101453f.setVisibility(8);
            }
            String starRecommendTag = aweme.getStarRecommendTag();
            if (!TextUtils.isEmpty(starRecommendTag)) {
                this.f101454g.setVisibility(0);
                this.f101455h.setText(starRecommendTag);
            }
            boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo47782d()).booleanValue();
            long j = 0;
            if (z3 && i3 == 0) {
                this.f101457p.setVisibility(0);
                if (statistics != null) {
                    j = statistics.getPlayCount();
                }
                String a = C33095b.m76068a(j);
                if (this.f101465x == null) {
                    this.f101465x = C0726c.m2091a(this.f101448a, (int) R.drawable.dqb);
                }
                m88459a(this.f101457p, this.f101465x, null, null, null);
                this.f101457p.setText(a);
                this.f101457p.setTextColor(this.f101448a.getResources().getColor(R.color.w2));
                this.f101457p.setContentDescription(this.f101448a.getString(R.string.cyu, new Object[]{a}));
            } else if (z3 || i3 != 0 || C29506g.m69645a() <= 0) {
                this.f101457p.setVisibility(0);
                m88459a(this.f101457p, C0726c.m2091a(this.f101448a, (int) R.drawable.dqb), null, null, null);
                if (statistics != null) {
                    j = statistics.getPlayCount();
                }
                String a2 = C33095b.m76068a(j);
                this.f101457p.setText(a2);
                this.f101457p.setContentDescription(this.f101448a.getString(R.string.cyu, new Object[]{a2}));
            } else {
                this.f101457p.setVisibility(0);
                m88459a(this.f101457p, C0726c.m2091a(this.f101448a, (int) R.drawable.dqb), null, null, null);
                if (statistics != null) {
                    j = statistics.getPlayCount();
                }
                String a3 = C33095b.m76068a(j);
                this.f101457p.setText(a3);
                this.f101457p.setContentDescription(this.f101448a.getString(R.string.cyu, new Object[]{a3}));
            }
            m88460a(aweme2, z3, i3, booleanValue);
            if (m88461a((Aweme) this.f70665k, this.f101461t, this.f101462u) || C36330a.m81964a(aweme)) {
                this.f101457p.setVisibility(4);
            }
            if (z) {
                mo50301a();
                if (!C26065bb.m63156a().mo53554a(aweme.getAid())) {
                    C26065bb.m63156a().mo53555b(aweme.getAid());
                    m88458a(this.f101448a, aweme2);
                }
            }
            this.f70666l.setContentDescription(this.f101448a.getString(R.string.cyv, new Object[]{Integer.valueOf(i + 1)}));
            if (VERSION.SDK_INT >= 23) {
                this.f70666l.setForeground(this.itemView.getContext().getDrawable(R.drawable.dmc));
            } else {
                C38446k.m85764a(this.f70666l);
            }
            if (VERSION.SDK_INT >= 23) {
                this.f70666l.setForeground(this.itemView.getContext().getDrawable(R.drawable.dmc));
            } else {
                C38446k.m85764a(this.f70666l);
            }
            if (C47935p.m103712e((Aweme) this.f70665k)) {
                this.f101463v.setVisibility(0);
            } else {
                this.f101463v.setVisibility(8);
            }
        }
    }
}

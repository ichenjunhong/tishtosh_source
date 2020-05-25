package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.experiment.AnimationOptAB;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.eh */
public final class C30940eh extends C31010i implements C0199s<C23274a> {

    /* renamed from: r */
    SmartCircleImageView f81021r;

    /* renamed from: s */
    SmartCircleImageView f81022s;

    /* renamed from: t */
    PeriscopeLayout f81023t;

    /* renamed from: u */
    FrameLayout f81024u;

    /* renamed from: v */
    public ValueAnimator f81025v;

    /* renamed from: w */
    public long f81026w;

    /* renamed from: x */
    private boolean f81027x = false;

    /* renamed from: y */
    private boolean f81028y = C10181b.m20511a().mo18172a(AnimationOptAB.class, true, "anim_opt", 31744, true);

    /* renamed from: c */
    public final void mo60596c() {
        super.mo60596c();
        m72473l();
    }

    /* renamed from: k */
    private boolean m72472k() {
        if (!C23337c.m57400c() || !this.f81028y) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m72473l() {
        if (this.f81027x && !m72472k()) {
            this.f81027x = false;
            C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                public final void run() {
                    C30940eh ehVar = C30940eh.this;
                    if (ehVar.f81023t != null) {
                        ehVar.f81023t.mo64098a();
                    }
                    if (C30940eh.this.f81024u != null && C30940eh.this.f81025v != null) {
                        C30940eh.this.f81025v.end();
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo63700j() {
        if (this.f81027x && !m72472k()) {
            this.f81027x = false;
            C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                public final void run() {
                    if (!(C30940eh.this.f81024u == null || C30940eh.this.f81025v == null)) {
                        C30940eh.this.f81025v.end();
                    }
                    C30940eh ehVar = C30940eh.this;
                    if (ehVar.f81023t != null) {
                        ehVar.f81023t.mo64101b();
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public final void mo60587a(VideoItemParams videoItemParams) {
        super.mo60587a(videoItemParams);
    }

    public C30940eh(View view) {
        super(view, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
    }

    /* renamed from: a */
    public final void mo60586a(DataCenter dataCenter) {
        dataCenter.mo48226a("stopPlayAnimation", (C0199s<C23274a>) this.f79009b).mo48226a("startPlayAnimation", (C0199s<C23274a>) this.f79009b).mo48226a("pausePlayAnimation", (C0199s<C23274a>) this.f79009b);
    }

    /* renamed from: b */
    public final C23274a mo60590b(C23274a aVar) {
        if (aVar == null) {
            return null;
        }
        super.mo60590b(aVar);
        if (!TextUtils.equals(aVar.f62242a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C23274a aVar2 = new C23274a("ui_state", hashMap);
        hashMap.put("aweme_state", this.f79011d);
        hashMap.put("event_type_state", this.f79012e);
        hashMap.put("enter_method_state", this.f79020m);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo60585a(View view) {
        super.mo60585a(view);
        this.f79019l = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f79017j, R.layout.b6p);
        this.f81024u = (FrameLayout) this.f79019l.findViewById(R.id.bo3);
        this.f81022s = (SmartCircleImageView) this.f79019l.findViewById(R.id.bo2);
        this.f81021r = (SmartCircleImageView) this.f79019l.findViewById(R.id.bvb);
        this.f81023t = (PeriscopeLayout) this.f79019l.findViewById(R.id.bro);
        this.f81022s.setOnTouchListener(new C10721b(0.5f, 1.0f));
    }

    /* renamed from: e */
    public final void mo60600e(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2058685350) {
                if (hashCode != -1661876786) {
                    if (hashCode == 307897710 && str.equals("startPlayAnimation")) {
                        c = 0;
                    }
                } else if (str.equals("stopPlayAnimation")) {
                    c = 2;
                }
            } else if (str.equals("pausePlayAnimation")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (!this.f81027x && !m72472k()) {
                        this.f81027x = true;
                        C30255o.f79039a.mo60617a(new C30256p(false, new Runnable() {
                            public final void run() {
                                C30940eh ehVar = C30940eh.this;
                                if (ehVar.f81024u != null) {
                                    if (ehVar.f81025v != null) {
                                        ehVar.f81025v.end();
                                    } else {
                                        ehVar.f81025v = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
                                        ehVar.f81025v.setDuration(8000);
                                        ehVar.f81025v.setRepeatMode(1);
                                        ehVar.f81025v.setInterpolator(new LinearInterpolator());
                                        ehVar.f81025v.setRepeatCount(-1);
                                        ehVar.f81025v.addUpdateListener(new AnimatorUpdateListener() {
                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                if (System.currentTimeMillis() - C30940eh.this.f81026w > 64) {
                                                    C30940eh.this.f81026w = System.currentTimeMillis();
                                                    C30940eh.this.f81024u.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                                }
                                            }
                                        });
                                    }
                                    ehVar.f81025v.start();
                                }
                                C30940eh ehVar2 = C30940eh.this;
                                if (ehVar2.f81023t != null) {
                                    ehVar2.f81023t.mo64099a(800, 3000);
                                }
                            }
                        }));
                        return;
                    }
                case 1:
                    m72473l();
                    return;
                case 2:
                    mo63700j();
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m72470a(SmartImageView smartImageView, int i) {
        C12203q.m24642a((int) R.drawable.dfe).mo23116a((C12197k) smartImageView).mo23121a();
    }

    /* renamed from: a */
    public final void mo60584a(int i, C23274a aVar) {
        int i2;
        int i3;
        if (!this.f79010c) {
            this.f79010c = true;
            if (this.f79018k instanceof FrameLayout) {
                ((FrameLayout) this.f79018k).addView(this.f79019l);
            }
        }
        if (aVar != null) {
            Aweme aweme = (Aweme) ((HashMap) aVar.mo48246a()).get("aweme_state");
            if (!(this.f79018k == null || this.f79017j == null)) {
                boolean b = C26235d.m63571b(aweme);
                View view = this.f79018k;
                if (b) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
                LayoutParams layoutParams = this.f79018k.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    if (b) {
                        i3 = (int) (-(this.f79017j.getResources().getDimension(R.dimen.yr) + this.f79017j.getResources().getDimension(R.dimen.yq)));
                    } else {
                        i3 = 0;
                    }
                    marginLayoutParams.bottomMargin = i3;
                    this.f79018k.setLayoutParams(layoutParams);
                }
            }
            Music music = aweme.getMusic();
            aweme.getAuthor();
            if (music == null || music.getCoverThumb() == null) {
                m72470a((SmartImageView) this.f81022s, (int) R.drawable.dfe);
                this.f81021r.setVisibility(8);
            } else if (TextUtils.isEmpty(music.getOwnerId())) {
                m72471a(this.f81022s, music.getCoverThumb(), C23728o.m58241a(49.0d), C23728o.m58241a(49.0d));
                this.f81021r.setVisibility(8);
            } else {
                this.f81021r.setVisibility(0);
                m72471a(this.f81021r, music.getCoverThumb(), C23728o.m58241a(27.0d), C23728o.m58241a(27.0d));
                m72470a((SmartImageView) this.f81022s, (int) R.drawable.dfe);
            }
            this.f81024u.setRotation(0.0f);
            this.f81022s.setOnClickListener(this.f81204q);
        }
    }

    /* renamed from: a */
    private static void m72471a(SmartImageView smartImageView, UrlModel urlModel, int i, int i2) {
        C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23111a(i, i2).mo23127c(true).mo23118a("VideoMusicCoverView").mo23116a((C12197k) smartImageView).mo23121a();
    }
}

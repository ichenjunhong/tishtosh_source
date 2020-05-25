package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
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
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ei */
public final class C30945ei extends C30806bl implements C0199s<C23274a> {

    /* renamed from: c */
    SmartCircleImageView f81033c;

    /* renamed from: d */
    SmartCircleImageView f81034d;

    /* renamed from: e */
    PeriscopeLayout f81035e;

    /* renamed from: f */
    FrameLayout f81036f;

    /* renamed from: g */
    public long f81037g;

    /* renamed from: h */
    private ValueAnimator f81038h;

    /* renamed from: i */
    private boolean f81039i;

    /* renamed from: j */
    private boolean f81040j = C10181b.m20511a().mo18172a(AnimationOptAB.class, true, "anim_opt", 31744, true);

    /* renamed from: h */
    public final void mo63316h() {
        super.mo63316h();
        m72485k();
    }

    /* renamed from: j */
    private boolean m72484j() {
        if (!C23337c.m57400c() || !this.f81040j) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m72485k() {
        if (this.f81039i && !m72484j()) {
            this.f81039i = false;
            if (this.f81035e != null) {
                this.f81035e.mo64098a();
            }
            if (!(this.f81036f == null || this.f81038h == null)) {
                this.f81038h.end();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo63523e() {
        if (this.f81039i && !m72484j()) {
            this.f81039i = false;
            if (!(this.f81036f == null || this.f81038h == null)) {
                this.f81038h.end();
            }
            if (this.f81035e != null) {
                this.f81035e.mo64101b();
            }
        }
    }

    public C30945ei(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        dataCenter.mo48226a("stopPlayAnimation", (C0199s<C23274a>) this).mo48226a("startPlayAnimation", (C0199s<C23274a>) this).mo48226a("pausePlayAnimation", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        super.mo49783a(view);
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6p);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f81036f = (FrameLayout) view2.findViewById(R.id.bo3);
        this.f81034d = (SmartCircleImageView) view2.findViewById(R.id.bo2);
        this.f81033c = (SmartCircleImageView) view2.findViewById(R.id.bvb);
        this.f81035e = (PeriscopeLayout) view2.findViewById(R.id.bro);
        this.f81034d.setOnTouchListener(new C10721b(0.5f, 1.0f));
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        int i;
        int i2;
        super.mo58323a(videoItemParams);
        if (!(this.f81199s == null || this.f81198r == null)) {
            boolean b = C26235d.m63571b(this.f81192l);
            View view = this.f81199s;
            if (b) {
                i = 4;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            LayoutParams layoutParams = this.f81199s.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (b) {
                    i2 = (int) (-(this.f81198r.getResources().getDimension(R.dimen.yr) + this.f81198r.getResources().getDimension(R.dimen.yq)));
                } else {
                    i2 = 0;
                }
                marginLayoutParams.bottomMargin = i2;
                this.f81199s.setLayoutParams(layoutParams);
            }
        }
        Music music = this.f81192l.getMusic();
        this.f81192l.getAuthor();
        if (music == null || music.getCoverThumb() == null) {
            m72482a(this.f81034d, R.drawable.dfe);
            this.f81033c.setVisibility(8);
        } else if (TextUtils.isEmpty(music.getOwnerId())) {
            m72483a(this.f81034d, music.getCoverThumb(), C23728o.m58241a(49.0d), C23728o.m58241a(49.0d));
            this.f81033c.setVisibility(8);
        } else {
            this.f81033c.setVisibility(0);
            m72483a(this.f81033c, music.getCoverThumb(), C23728o.m58241a(27.0d), C23728o.m58241a(27.0d));
            m72482a(this.f81034d, R.drawable.dfe);
        }
        this.f81036f.setRotation(0.0f);
        this.f81034d.setOnClickListener(this.f80703b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r6 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r6
            if (r6 == 0) goto L_0x00a6
            java.lang.String r6 = r6.f62242a
            int r0 = r6.hashCode()
            r1 = -2058685350(0xffffffff854af45a, float:-9.542875E-36)
            r2 = 2
            r3 = -1
            r4 = 1
            if (r0 == r1) goto L_0x0031
            r1 = -1661876786(0xffffffff9cf1c5ce, float:-1.5999174E-21)
            if (r0 == r1) goto L_0x0027
            r1 = 307897710(0x125a256e, float:6.8834807E-28)
            if (r0 == r1) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r0 = "startPlayAnimation"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003b
            r6 = 0
            goto L_0x003c
        L_0x0027:
            java.lang.String r0 = "stopPlayAnimation"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003b
            r6 = 2
            goto L_0x003c
        L_0x0031:
            java.lang.String r0 = "pausePlayAnimation"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = -1
        L_0x003c:
            switch(r6) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0044;
                case 2: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x00a6
        L_0x0040:
            r5.mo63523e()
            goto L_0x00a6
        L_0x0044:
            r5.m72485k()
            return
        L_0x0048:
            boolean r6 = r5.f81039i
            if (r6 != 0) goto L_0x00a6
            boolean r6 = r5.m72484j()
            if (r6 == 0) goto L_0x0053
            goto L_0x00a6
        L_0x0053:
            r5.f81039i = r4
            android.widget.FrameLayout r6 = r5.f81036f
            if (r6 == 0) goto L_0x0098
            android.animation.ValueAnimator r6 = r5.f81038h
            if (r6 == 0) goto L_0x0063
            android.animation.ValueAnimator r6 = r5.f81038h
            r6.end()
            goto L_0x0093
        L_0x0063:
            float[] r6 = new float[r2]
            r6 = {0, 1135869952} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            r5.f81038h = r6
            android.animation.ValueAnimator r6 = r5.f81038h
            r0 = 8000(0x1f40, double:3.9525E-320)
            r6.setDuration(r0)
            android.animation.ValueAnimator r6 = r5.f81038h
            r6.setRepeatMode(r4)
            android.animation.ValueAnimator r6 = r5.f81038h
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r6.setInterpolator(r0)
            android.animation.ValueAnimator r6 = r5.f81038h
            r6.setRepeatCount(r3)
            android.animation.ValueAnimator r6 = r5.f81038h
            com.ss.android.ugc.aweme.feed.ui.ei$1 r0 = new com.ss.android.ugc.aweme.feed.ui.ei$1
            r0.<init>()
            r6.addUpdateListener(r0)
        L_0x0093:
            android.animation.ValueAnimator r6 = r5.f81038h
            r6.start()
        L_0x0098:
            com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout r6 = r5.f81035e
            if (r6 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout r6 = r5.f81035e
            r0 = 800(0x320, float:1.121E-42)
            r1 = 3000(0xbb8, float:4.204E-42)
            r6.mo64099a(r0, r1)
        L_0x00a5:
            return
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30945ei.onChanged(java.lang.Object):void");
    }

    /* renamed from: a */
    private static void m72482a(SmartImageView smartImageView, int i) {
        C12203q.m24642a((int) R.drawable.dfe).mo23116a((C12197k) smartImageView).mo23121a();
    }

    /* renamed from: a */
    private static void m72483a(SmartImageView smartImageView, UrlModel urlModel, int i, int i2) {
        C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23111a(i, i2).mo23127c(true).mo23118a("VideoMusicCoverView").mo23116a((C12197k) smartImageView).mo23121a();
    }
}

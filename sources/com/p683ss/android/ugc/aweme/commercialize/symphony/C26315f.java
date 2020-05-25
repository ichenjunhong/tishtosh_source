package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p132d.p133a.C2717a;
import com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C26276b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30014ae;
import com.p683ss.android.ugc.aweme.feed.adapter.C30077d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1382aq.C23243m;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.f */
public final class C26315f extends C30077d implements C2717a, C26276b {

    /* renamed from: a */
    public final int f69447a;

    /* renamed from: b */
    public final View f69448b;

    /* renamed from: c */
    public final C30313ae<C30332aw> f69449c;

    /* renamed from: d */
    public final String f69450d;

    /* renamed from: e */
    public final OnTouchListener f69451e;

    /* renamed from: f */
    public final Fragment f69452f;

    /* renamed from: g */
    public final int f69453g;

    /* renamed from: k */
    private Aweme f69454k;

    /* renamed from: l */
    private boolean f69455l;

    /* renamed from: m */
    private final Context f69456m;

    /* renamed from: a */
    public final void mo46747a() {
    }

    /* renamed from: d */
    public final int mo53998d() {
        return 3;
    }

    /* renamed from: e */
    public final Aweme mo53999e() {
        return this.f69454k;
    }

    /* renamed from: g */
    public final void mo54001g() {
        this.f69454k = null;
    }

    /* renamed from: j */
    public final C30014ae mo54004j() {
        return null;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    /* renamed from: c */
    public final int mo53997c() {
        Aweme aweme = this.f69454k;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo54000f() {
        View view = this.f69448b;
        if (view != null) {
            ((SymphonyVideoView) view).mo53102b();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    /* renamed from: h */
    public final void mo54002h() {
        if (this.f69455l) {
            View view = this.f69448b;
            if (view != null) {
                C26317h.m63699a((SymphonyVideoView) view);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
        }
    }

    /* renamed from: i */
    public final void mo54003i() {
        this.f69455l = false;
        View view = this.f69448b;
        if (view != null) {
            SymphonyVideoView symphonyVideoView = (SymphonyVideoView) view;
            symphonyVideoView.mo53972c();
            if (C52711k.m112239a((Object) C26317h.m63700c(), (Object) symphonyVideoView)) {
                C26317h.m63699a(null);
            }
            C47718bf.m103288a(new C26318i());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    /* renamed from: b */
    public final void mo53947b() {
        String str;
        String str2;
        C23243m a = new C23243m().mo48110a(this.f69450d);
        Aweme aweme = this.f69454k;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C23243m b = a.mo48111b(str);
        Aweme aweme2 = this.f69454k;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        C23243m d = b.mo48112c(str2).mo48113d(this.f69450d);
        Aweme aweme3 = this.f69454k;
        if (aweme3 != null) {
            str3 = aweme3.getRequestId();
        }
        d.mo48114e(str3).mo48076e();
        C47718bf.m103288a(new C30338g(this.f69454k));
    }

    /* renamed from: a */
    public final void mo53996a(Aweme aweme) {
        this.f69454k = aweme;
    }

    /* renamed from: a */
    public final void mo53995a(int i) {
        int i2;
        this.f69455l = true;
        View view = this.f69448b;
        if (view != null) {
            SymphonyVideoView symphonyVideoView = (SymphonyVideoView) view;
            C2676c a = SymphonyAdManager.m63648a().mo53950a(mo53999e());
            C52711k.m112236a((Object) a, "SymphonyAdManager.getInstance().getNativeAd(aweme)");
            Aweme e = mo53999e();
            String str = "";
            AwemeRawAd k = C26512f.m64068k(mo53999e());
            if (k != null) {
                Music music = k.getMusic();
                if (music != null) {
                    str = music.getMusicName();
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                }
            }
            C52711k.m112236a((Object) str, "AdDataUtils.getSymphonyMusicDesc(aweme)");
            String str2 = "";
            AwemeRawAd k2 = C26512f.m64068k(mo53999e());
            if (k2 != null) {
                AwemeTextLabelModel label = k2.getLabel();
                if (label != null) {
                    str2 = label.getLabelName();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                }
            }
            C52711k.m112236a((Object) str2, "AdDataUtils.getSymphonyLabel(aweme)");
            C2717a aVar = this;
            C26276b bVar = this;
            AwemeRawAd k3 = C26512f.m64068k(mo53999e());
            if (k3 == null) {
                i2 = 2;
            } else {
                i2 = k3.getShowMaskTimes();
            }
            symphonyVideoView.mo53971a(a, e, str, str2, aVar, bVar, i2);
            C26317h.m63699a(symphonyVideoView);
            C47718bf.m103288a(new C26318i());
            if (this.f69456m instanceof MainActivity) {
                C47718bf.m103288a(new C30315ag(this.f69454k));
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    public C26315f(Context context, int i, View view, C30313ae<C30332aw> aeVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(onTouchListener, "tapTouchListener");
        C52711k.m112240b(fragment, "fragment");
        this.f69456m = context;
        this.f69447a = i;
        this.f69448b = view;
        this.f69449c = aeVar;
        this.f69450d = str;
        this.f69451e = onTouchListener;
        this.f69452f = fragment;
        this.f69453g = i2;
    }
}

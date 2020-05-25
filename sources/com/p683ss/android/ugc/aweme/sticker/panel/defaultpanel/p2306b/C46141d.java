package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p683ss.android.ugc.aweme.sticker.C46410r;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46085a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.d */
public class C46141d extends C1352v implements C45874b, C45875c {

    /* renamed from: a */
    public C46085a f116448a;

    /* renamed from: b */
    protected StickerWrapper f116449b;

    /* renamed from: c */
    public AVDmtImageTextView f116450c;

    /* renamed from: d */
    public Context f116451d;

    /* renamed from: e */
    public int f116452e;

    /* renamed from: f */
    public View f116453f;

    /* renamed from: g */
    public final C46354l f116454g;

    /* renamed from: h */
    public final C45814b f116455h;

    /* renamed from: i */
    public List<? extends StickerWrapper> f116456i;

    /* renamed from: a */
    public void mo92255a() {
    }

    /* renamed from: b */
    public void mo92256b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final StickerWrapper mo92840c() {
        StickerWrapper stickerWrapper = this.f116449b;
        if (stickerWrapper == null) {
            C52711k.m112237a("stickerWrapper");
        }
        return stickerWrapper;
    }

    /* renamed from: d */
    public final void mo92841d() {
        AVDmtImageTextView aVDmtImageTextView = this.f116450c;
        StickerWrapper stickerWrapper = this.f116449b;
        if (stickerWrapper == null) {
            C52711k.m112237a("stickerWrapper");
        }
        int i = stickerWrapper.f115781c;
        StickerWrapper stickerWrapper2 = this.f116449b;
        if (stickerWrapper2 == null) {
            C52711k.m112237a("stickerWrapper");
        }
        aVDmtImageTextView.mo93966a(i, stickerWrapper2.f115783e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92837a(StickerWrapper stickerWrapper) {
        C52711k.m112240b(stickerWrapper, "<set-?>");
        this.f116449b = stickerWrapper;
    }

    /* renamed from: a */
    public final void mo92838a(boolean z) {
        this.f116450c.mo93970a(z);
    }

    /* renamed from: a */
    public void mo92251a(Effect effect) {
        C52711k.m112240b(effect, "effect");
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper = this.f116449b;
        if (stickerWrapper == null) {
            C52711k.m112237a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            StickerWrapper stickerWrapper2 = this.f116449b;
            if (stickerWrapper2 == null) {
                C52711k.m112237a("stickerWrapper");
            }
            stickerWrapper2.f115782d = true;
            StickerWrapper stickerWrapper3 = this.f116449b;
            if (stickerWrapper3 == null) {
                C52711k.m112237a("stickerWrapper");
            }
            stickerWrapper3.f115781c = 1;
            this.f116450c.mo93963a();
        }
    }

    /* renamed from: b */
    public final void mo92839b(StickerWrapper stickerWrapper) {
        if (stickerWrapper != null) {
            StickerWrapper stickerWrapper2 = this.f116449b;
            if (stickerWrapper2 == null) {
                C52711k.m112237a("stickerWrapper");
            }
            stickerWrapper2.f115781c = stickerWrapper.f115781c;
            mo92841d();
            C46354l lVar = this.f116454g;
            StickerWrapper stickerWrapper3 = this.f116449b;
            if (stickerWrapper3 == null) {
                C52711k.m112237a("stickerWrapper");
            }
            if (C45859b.m99701b(lVar, stickerWrapper3.f115779a)) {
                StickerWrapper stickerWrapper4 = this.f116449b;
                if (stickerWrapper4 == null) {
                    C52711k.m112237a("stickerWrapper");
                }
                if (!C46059g.m100095s(stickerWrapper4.f115779a)) {
                    mo92838a(true);
                    return;
                }
            }
            mo92838a(false);
        }
    }

    /* renamed from: b */
    public void mo92254b(Effect effect) {
        C52711k.m112240b(effect, "effect");
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper = this.f116449b;
        if (stickerWrapper == null) {
            C52711k.m112237a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            StickerWrapper stickerWrapper2 = this.f116449b;
            if (stickerWrapper2 == null) {
                C52711k.m112237a("stickerWrapper");
            }
            stickerWrapper2.f115781c = 2;
            StickerImageView stickerImageView = this.f116450c.f118163a;
            if (stickerImageView == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView.mo90451b();
        }
    }

    /* renamed from: a */
    public void mo92253a(Effect effect, C48649d dVar) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(dVar, "e");
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper = this.f116449b;
        if (stickerWrapper == null) {
            C52711k.m112237a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper.f115779a;
        C52711k.m112236a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            StickerWrapper stickerWrapper2 = this.f116449b;
            if (stickerWrapper2 == null) {
                C52711k.m112237a("stickerWrapper");
            }
            stickerWrapper2.f115781c = 3;
            this.f116450c.mo93972b();
        }
    }

    /* renamed from: a */
    public void mo92252a(Effect effect, int i) {
        C52711k.m112240b(effect, "effect");
        StickerWrapper stickerWrapper = this.f116449b;
        if (stickerWrapper == null) {
            C52711k.m112237a("stickerWrapper");
        }
        stickerWrapper.f115781c = 5;
        StickerWrapper stickerWrapper2 = this.f116449b;
        if (stickerWrapper2 == null) {
            C52711k.m112237a("stickerWrapper");
        }
        stickerWrapper2.f115783e = i;
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper3 = this.f116449b;
        if (stickerWrapper3 == null) {
            C52711k.m112237a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper3.f115779a;
        C52711k.m112236a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            this.f116450c.mo93965a(i);
        }
    }

    public C46141d(View view, C46354l lVar, C45814b bVar, List<? extends StickerWrapper> list) {
        C52711k.m112240b(view, "mItemView");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "selectedController");
        super(view);
        this.f116453f = view;
        this.f116454g = lVar;
        this.f116455h = bVar;
        this.f116456i = list;
        View findViewById = this.f116453f.findViewById(R.id.ct2);
        C52711k.m112236a((Object) findViewById, "mItemView.findViewById(R.id.sticker_img_view)");
        this.f116450c = (AVDmtImageTextView) findViewById;
        Context context = this.f116453f.getContext();
        C52711k.m112236a((Object) context, "mItemView.context");
        this.f116451d = context;
        this.f116450c.setShowDownloadIcon(true);
        this.f116453f.setOnTouchListener(new C46410r(1.1f, 100, this.f116450c));
    }
}

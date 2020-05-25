package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12187e;
import com.bytedance.lighten.p766a.C12187e.C12189a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.views.CircleDraweeView;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView */
public final class StickerImageView extends FrameLayout {

    /* renamed from: a */
    public CircleDraweeView f112645a;

    /* renamed from: b */
    public final boolean f112646b;

    /* renamed from: c */
    private SmartImageView f112647c;

    /* renamed from: d */
    private ImageView f112648d;

    /* renamed from: e */
    private AVCircleProgressView f112649e;

    /* renamed from: f */
    private boolean f112650f;

    /* renamed from: g */
    private View f112651g;

    /* renamed from: h */
    private Drawable f112652h;

    /* renamed from: i */
    private final boolean f112653i;

    /* renamed from: j */
    private final boolean f112654j;

    public StickerImageView(Context context) {
        this(context, null, false, false, false, 30, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, false, false, 28, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet, boolean z) {
        this(context, attributeSet, z, false, false, 24, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        this(context, attributeSet, z, z2, false, 16, null);
    }

    /* renamed from: d */
    private static C12187e m97403d() {
        C12187e a = new C12189a().mo23105a(true).mo23106a();
        C52711k.m112236a((Object) a, "builder.build()");
        return a;
    }

    /* renamed from: e */
    private final void m97404e() {
        ImageView imageView = this.f112648d;
        if (imageView == null) {
            C52711k.m112237a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f112649e;
        if (aVCircleProgressView == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo90443a() {
        ImageView imageView = this.f112648d;
        if (imageView == null) {
            C52711k.m112237a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f112649e;
        if (aVCircleProgressView == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    /* renamed from: b */
    public final void mo90451b() {
        ImageView imageView = this.f112648d;
        if (imageView == null) {
            C52711k.m112237a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f112649e;
        if (aVCircleProgressView == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView.setVisibility(0);
        AVCircleProgressView aVCircleProgressView2 = this.f112649e;
        if (aVCircleProgressView2 == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView2.setProgress(0);
    }

    /* renamed from: c */
    public final void mo90452c() {
        if (this.f112650f) {
            ImageView imageView = this.f112648d;
            if (imageView == null) {
                C52711k.m112237a("downloadImg");
            }
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f112648d;
            if (imageView2 == null) {
                C52711k.m112237a("downloadImg");
            }
            imageView2.setVisibility(4);
        }
        AVCircleProgressView aVCircleProgressView = this.f112649e;
        if (aVCircleProgressView == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f112650f = z;
    }

    /* renamed from: a */
    public final void mo90444a(int i) {
        ImageView imageView = this.f112648d;
        if (imageView == null) {
            C52711k.m112237a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f112649e;
        if (aVCircleProgressView == null) {
            C52711k.m112237a("progressView");
        }
        if (aVCircleProgressView.getVisibility() != 0) {
            AVCircleProgressView aVCircleProgressView2 = this.f112649e;
            if (aVCircleProgressView2 == null) {
                C52711k.m112237a("progressView");
            }
            aVCircleProgressView2.setVisibility(0);
        }
        AVCircleProgressView aVCircleProgressView3 = this.f112649e;
        if (aVCircleProgressView3 == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView3.setProgress(i);
    }

    public final void setIconImageViewScaleType(C13818b bVar) {
        if (this.f112646b) {
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            C13833a aVar = (C13833a) smartImageView.getHierarchy();
            C52711k.m112236a((Object) aVar, "smartImageView.hierarchy");
            aVar.mo25898a(bVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f112645a;
        if (circleDraweeView == null) {
            C52711k.m112237a("iconImageView");
        }
        C13833a aVar2 = (C13833a) circleDraweeView.getHierarchy();
        C52711k.m112236a((Object) aVar2, "iconImageView.hierarchy");
        aVar2.mo25898a(bVar);
    }

    public final void setImageHierarchy(C13833a aVar) {
        if (this.f112646b) {
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            smartImageView.setHierarchy(aVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f112645a;
        if (circleDraweeView == null) {
            C52711k.m112237a("iconImageView");
        }
        circleDraweeView.setHierarchy(aVar);
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.f112646b) {
                SmartImageView smartImageView = this.f112647c;
                if (smartImageView == null) {
                    C52711k.m112237a("smartImageView");
                }
                smartImageView.clearColorFilter();
                return;
            }
            CircleDraweeView circleDraweeView = this.f112645a;
            if (circleDraweeView == null) {
                C52711k.m112237a("iconImageView");
            }
            circleDraweeView.clearColorFilter();
        } else if (this.f112646b) {
            SmartImageView smartImageView2 = this.f112647c;
            if (smartImageView2 == null) {
                C52711k.m112237a("smartImageView");
            }
            smartImageView2.setColorFilter(R.color.aw5, Mode.DST_IN);
        } else {
            CircleDraweeView circleDraweeView2 = this.f112645a;
            if (circleDraweeView2 == null) {
                C52711k.m112237a("iconImageView");
            }
            circleDraweeView2.setColorFilter(R.color.aw5, Mode.DST_IN);
        }
    }

    /* renamed from: a */
    public final void mo90446a(Drawable drawable) {
        if (this.f112646b) {
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            smartImageView.setImageDrawable(drawable);
            return;
        }
        CircleDraweeView circleDraweeView = this.f112645a;
        if (circleDraweeView == null) {
            C52711k.m112237a("iconImageView");
        }
        circleDraweeView.setImageDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo90447a(UrlModel urlModel) {
        if (!this.f112646b) {
            CircleDraweeView circleDraweeView = this.f112645a;
            if (circleDraweeView == null) {
                C52711k.m112237a("iconImageView");
            }
            C50181a.m108287a((SimpleDraweeView) circleDraweeView, urlModel);
        } else if (urlModel != null) {
            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23115a(m97403d());
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            a.mo23116a((C12197k) smartImageView).mo23121a();
        }
    }

    /* renamed from: a */
    public final void mo90448a(String str) {
        if (!this.f112646b) {
            CircleDraweeView circleDraweeView = this.f112645a;
            if (circleDraweeView == null) {
                C52711k.m112237a("iconImageView");
            }
            C50181a.m108292a((SimpleDraweeView) circleDraweeView, str);
        } else if (str != null) {
            C12208t a = C12203q.m24646a(str).mo23115a(m97403d());
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            a.mo23116a((C12197k) smartImageView).mo23121a();
        }
    }

    /* renamed from: a */
    public final void mo90450a(boolean z) {
        int i;
        ImageView imageView = this.f112648d;
        if (imageView == null) {
            C52711k.m112237a("downloadImg");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo90445a(int i, int i2) {
        switch (i) {
            case 1:
                mo90443a();
                return;
            case 2:
                mo90451b();
                return;
            case 3:
                mo90452c();
                return;
            case 4:
                m97404e();
                break;
            case 5:
                mo90444a(i2);
                return;
        }
    }

    /* renamed from: a */
    public final void mo90449a(String str, Config config) {
        if (!this.f112646b) {
            CircleDraweeView circleDraweeView = this.f112645a;
            if (circleDraweeView == null) {
                C52711k.m112237a("iconImageView");
            }
            circleDraweeView.mo95451a(str, config);
        } else if (str != null) {
            C12208t b = C12203q.m24646a(str).mo23119a(true).mo23124b(true);
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            b.mo23116a((C12197k) smartImageView).mo23121a();
        }
    }

    public StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        int i;
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        this.f112653i = z;
        this.f112654j = z2;
        this.f112646b = z3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            this.f112652h = obtainStyledAttributes.getDrawable(29);
            obtainStyledAttributes.recycle();
        }
        if (this.f112653i) {
            i = R.layout.a1l;
        } else if (this.f112654j) {
            i = R.layout.a1k;
        } else {
            i = R.layout.a1j;
        }
        View inflate = LayoutInflater.from(context).inflate(i, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…).inflate(layoutId, null)");
        this.f112651g = inflate;
        View view = this.f112651g;
        if (view == null) {
            C52711k.m112237a("mRootView");
        }
        View findViewById = view.findViewById(R.id.at4);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.img_sticker_icon)");
        this.f112645a = (CircleDraweeView) findViewById;
        View view2 = this.f112651g;
        if (view2 == null) {
            C52711k.m112237a("mRootView");
        }
        View findViewById2 = view2.findViewById(R.id.ew4);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.siv_sticker_icon)");
        this.f112647c = (SmartImageView) findViewById2;
        C13833a a = new C13834b(getResources()).mo25912a();
        a.mo25904b(this.f112652h);
        a.mo25909c(this.f112652h);
        if (this.f112646b) {
            SmartImageView smartImageView = this.f112647c;
            if (smartImageView == null) {
                C52711k.m112237a("smartImageView");
            }
            smartImageView.setVisibility(0);
            CircleDraweeView circleDraweeView = this.f112645a;
            if (circleDraweeView == null) {
                C52711k.m112237a("iconImageView");
            }
            circleDraweeView.setVisibility(8);
            SmartImageView smartImageView2 = this.f112647c;
            if (smartImageView2 == null) {
                C52711k.m112237a("smartImageView");
            }
            smartImageView2.setHierarchy(a);
        } else {
            SmartImageView smartImageView3 = this.f112647c;
            if (smartImageView3 == null) {
                C52711k.m112237a("smartImageView");
            }
            smartImageView3.setVisibility(8);
            CircleDraweeView circleDraweeView2 = this.f112645a;
            if (circleDraweeView2 == null) {
                C52711k.m112237a("iconImageView");
            }
            circleDraweeView2.setVisibility(0);
            CircleDraweeView circleDraweeView3 = this.f112645a;
            if (circleDraweeView3 == null) {
                C52711k.m112237a("iconImageView");
            }
            circleDraweeView3.setHierarchy(a);
        }
        View view3 = this.f112651g;
        if (view3 == null) {
            C52711k.m112237a("mRootView");
        }
        View findViewById3 = view3.findViewById(R.id.at6);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById(R.id.img_sticker_loading)");
        this.f112648d = (ImageView) findViewById3;
        View view4 = this.f112651g;
        if (view4 == null) {
            C52711k.m112237a("mRootView");
        }
        View findViewById4 = view4.findViewById(R.id.b25);
        C52711k.m112236a((Object) findViewById4, "mRootView.findViewById(R.id.iv_loading)");
        this.f112649e = (AVCircleProgressView) findViewById4;
        AVCircleProgressView aVCircleProgressView = this.f112649e;
        if (aVCircleProgressView == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView.setBgCircleColor(getResources().getColor(R.color.aw9));
        AVCircleProgressView aVCircleProgressView2 = this.f112649e;
        if (aVCircleProgressView2 == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView2.setProgressColor(-1);
        AVCircleProgressView aVCircleProgressView3 = this.f112649e;
        if (aVCircleProgressView3 == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView3.setMaxProgress(100);
        AVCircleProgressView aVCircleProgressView4 = this.f112649e;
        if (aVCircleProgressView4 == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView4.setCircleWidth((int) C9432q.m18687b(context, 2.0f));
        AVCircleProgressView aVCircleProgressView5 = this.f112649e;
        if (aVCircleProgressView5 == null) {
            C52711k.m112237a("progressView");
        }
        aVCircleProgressView5.setBgCircleWidth((int) C9432q.m18687b(context, 3.0f));
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        View view5 = this.f112651g;
        if (view5 == null) {
            C52711k.m112237a("mRootView");
        }
        view5.setLayoutParams(layoutParams);
        View view6 = this.f112651g;
        if (view6 == null) {
            C52711k.m112237a("mRootView");
        }
        addView(view6);
    }

    public /* synthetic */ StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, int i, C52707g gVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        AttributeSet attributeSet2 = attributeSet;
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 16) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        this(context, attributeSet2, z4, z5, z6);
    }
}

package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView */
public final class AVDmtImageTextView extends FrameLayout {

    /* renamed from: K */
    private static final int f118149K = C46788b.f118234c;

    /* renamed from: L */
    private static final int f118150L = C46788b.f118233b;

    /* renamed from: M */
    private static final int f118151M = Color.parseColor("#80000000");

    /* renamed from: c */
    public static final C46782a f118152c = new C46782a(null);

    /* renamed from: A */
    private String f118153A;

    /* renamed from: B */
    private int f118154B;

    /* renamed from: C */
    private Drawable f118155C;

    /* renamed from: D */
    private Drawable f118156D;

    /* renamed from: E */
    private boolean f118157E;

    /* renamed from: F */
    private boolean f118158F;

    /* renamed from: G */
    private int f118159G;

    /* renamed from: H */
    private int f118160H;

    /* renamed from: I */
    private int f118161I;

    /* renamed from: J */
    private LinearLayout f118162J;

    /* renamed from: a */
    public StickerImageView f118163a;

    /* renamed from: b */
    public View f118164b;

    /* renamed from: d */
    private AVDmtTextView f118165d;

    /* renamed from: e */
    private LinearLayout f118166e;

    /* renamed from: f */
    private ImageView f118167f;

    /* renamed from: g */
    private View f118168g;

    /* renamed from: h */
    private FrameLayout f118169h;

    /* renamed from: i */
    private ImageView f118170i;

    /* renamed from: j */
    private int f118171j;

    /* renamed from: k */
    private int f118172k;

    /* renamed from: l */
    private boolean f118173l;

    /* renamed from: m */
    private boolean f118174m;

    /* renamed from: n */
    private int f118175n;

    /* renamed from: o */
    private boolean f118176o;

    /* renamed from: p */
    private boolean f118177p;

    /* renamed from: q */
    private boolean f118178q;

    /* renamed from: r */
    private boolean f118179r;

    /* renamed from: s */
    private int f118180s;

    /* renamed from: t */
    private boolean f118181t;

    /* renamed from: u */
    private boolean f118182u;

    /* renamed from: v */
    private boolean f118183v;

    /* renamed from: w */
    private Animation f118184w;

    /* renamed from: x */
    private boolean f118185x;

    /* renamed from: y */
    private boolean f118186y;

    /* renamed from: z */
    private Drawable f118187z;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView$a */
    public static final class C46782a {
        private C46782a() {
        }

        public /* synthetic */ C46782a(C52707g gVar) {
            this();
        }
    }

    public AVDmtImageTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtImageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo93963a() {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.mo90443a();
    }

    /* renamed from: b */
    public final void mo93972b() {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.mo90452c();
    }

    public final void setShowDownloadIcon(boolean z) {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.setShowDownloadIcon(z);
    }

    public final void setShowDownloadStateIcon(boolean z) {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.mo90450a(z);
    }

    /* renamed from: a */
    public final void mo93964a(float f) {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.setAlpha(f);
    }

    /* renamed from: c */
    public final void mo93974c(boolean z) {
        int i;
        View view = this.f118164b;
        if (view == null) {
            C52711k.m112237a("dotView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: d */
    public final void mo93975d(boolean z) {
        int i;
        FrameLayout frameLayout = this.f118169h;
        if (frameLayout == null) {
            C52711k.m112237a("bottomDotLayout");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo93965a(int i) {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.mo90444a(i);
    }

    public final void setEnableUI(boolean z) {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.setEnableUI(z);
        AVDmtTextView aVDmtTextView = this.f118165d;
        if (aVDmtTextView == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView.setEnableUI(z);
        if (z) {
            ImageView imageView = this.f118170i;
            if (imageView == null) {
                C52711k.m112237a("bottomDotView");
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView2 = this.f118170i;
        if (imageView2 == null) {
            C52711k.m112237a("bottomDotView");
        }
        imageView2.setColorFilter(R.color.aw5, Mode.DST_IN);
    }

    /* renamed from: b */
    public final void mo93973b(boolean z) {
        if (z) {
            ImageView imageView = this.f118167f;
            if (imageView == null) {
                C52711k.m112237a("loadingImageView");
            }
            imageView.clearAnimation();
            ImageView imageView2 = this.f118167f;
            if (imageView2 == null) {
                C52711k.m112237a("loadingImageView");
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f118167f;
            if (imageView3 == null) {
                C52711k.m112237a("loadingImageView");
            }
            imageView3.startAnimation(this.f118184w);
            return;
        }
        ImageView imageView4 = this.f118167f;
        if (imageView4 == null) {
            C52711k.m112237a("loadingImageView");
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.f118167f;
        if (imageView5 == null) {
            C52711k.m112237a("loadingImageView");
        }
        imageView5.clearAnimation();
    }

    public final void setClickStatusColor(int i) {
        Drawable drawable;
        int i2;
        if (this.f118173l) {
            drawable = C42430at.m93195a(i, 0, this.f118180s);
            C52711k.m112236a((Object) drawable, "DmtDesignDrawableFactory…TRANSPARENT, borderWidth)");
        } else {
            if (this.f118182u) {
                i2 = this.f118175n + this.f118180s;
            } else {
                i2 = this.f118175n;
            }
            drawable = C42430at.m93196a(i, 0, this.f118180s, i2);
            C52711k.m112236a((Object) drawable, "DmtDesignDrawableFactory…orderWidth, borderRadius)");
        }
        View view = this.f118168g;
        if (view == null) {
            C52711k.m112237a("borderView");
        }
        view.setBackground(drawable);
        AVDmtTextView aVDmtTextView = this.f118165d;
        if (aVDmtTextView == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView.setStatusTextColor(i);
    }

    /* renamed from: a */
    public final void mo93967a(Drawable drawable) {
        if (drawable != null) {
            StickerImageView stickerImageView = this.f118163a;
            if (stickerImageView == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView.mo90446a(drawable);
        }
    }

    public final void setText(CharSequence charSequence) {
        boolean z;
        int i;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AVDmtTextView aVDmtTextView = this.f118165d;
            if (aVDmtTextView == null) {
                C52711k.m112237a("dmtTextView");
            }
            int measureText = (int) aVDmtTextView.getPaint().measureText(charSequence, 0, charSequence.length());
            if (this.f118179r) {
                i = (int) C46786a.f118224c.mo94006c();
            } else {
                i = this.f118171j;
            }
            if (measureText <= i) {
                AVDmtTextView aVDmtTextView2 = this.f118165d;
                if (aVDmtTextView2 == null) {
                    C52711k.m112237a("dmtTextView");
                }
                aVDmtTextView2.setGravity(17);
            } else if (this.f118157E) {
                AVDmtTextView aVDmtTextView3 = this.f118165d;
                if (aVDmtTextView3 == null) {
                    C52711k.m112237a("dmtTextView");
                }
                aVDmtTextView3.setGravity(8388611);
            } else {
                AVDmtTextView aVDmtTextView4 = this.f118165d;
                if (aVDmtTextView4 == null) {
                    C52711k.m112237a("dmtTextView");
                }
                aVDmtTextView4.setGravity(17);
            }
            LinearLayout linearLayout = this.f118166e;
            if (linearLayout == null) {
                C52711k.m112237a("textLayout");
            }
            linearLayout.setVisibility(0);
            AVDmtTextView aVDmtTextView5 = this.f118165d;
            if (aVDmtTextView5 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView5.setVisibility(0);
            AVDmtTextView aVDmtTextView6 = this.f118165d;
            if (aVDmtTextView6 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView6.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo93968a(UrlModel urlModel) {
        if (urlModel != null) {
            StickerImageView stickerImageView = this.f118163a;
            if (stickerImageView == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView.mo90447a(urlModel);
        }
    }

    /* renamed from: a */
    public final void mo93969a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StickerImageView stickerImageView = this.f118163a;
            if (stickerImageView == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView.mo90448a(str);
        }
    }

    /* renamed from: a */
    public final void mo93970a(boolean z) {
        int i;
        if (this.f118177p) {
            AVDmtTextView aVDmtTextView = this.f118165d;
            if (aVDmtTextView == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView.mo93997a(z);
            AVDmtTextView aVDmtTextView2 = this.f118165d;
            if (aVDmtTextView2 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView2.setSelected(z);
        }
        if (this.f118176o) {
            View view = this.f118168g;
            if (view == null) {
                C52711k.m112237a("borderView");
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        if (!z || !this.f118157E) {
            AVDmtTextView aVDmtTextView3 = this.f118165d;
            if (aVDmtTextView3 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView3.setEllipsize(null);
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f118165d;
        if (aVDmtTextView4 == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView4.setEllipsize(TruncateAt.MARQUEE);
    }

    /* renamed from: a */
    public final void mo93966a(int i, int i2) {
        StickerImageView stickerImageView = this.f118163a;
        if (stickerImageView == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView.mo90445a(i, i2);
    }

    /* renamed from: a */
    public final void mo93971a(boolean z, int i) {
        ImageView imageView = this.f118167f;
        if (imageView == null) {
            C52711k.m112237a("loadingImageView");
        }
        LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388693;
            layoutParams2.rightMargin = (int) C9432q.m18687b(getContext(), 4.0f);
            layoutParams2.bottomMargin = (int) C9432q.m18687b(getContext(), 4.0f);
            layoutParams2.topMargin = (int) C9432q.m18687b(getContext(), 4.0f);
            layoutParams2.leftMargin = (int) C9432q.m18687b(getContext(), 4.0f);
            if (z) {
                ImageView imageView2 = this.f118167f;
                if (imageView2 == null) {
                    C52711k.m112237a("loadingImageView");
                }
                if (imageView2.getVisibility() != 0) {
                    ImageView imageView3 = this.f118167f;
                    if (imageView3 == null) {
                        C52711k.m112237a("loadingImageView");
                    }
                    imageView3.clearAnimation();
                    ImageView imageView4 = this.f118167f;
                    if (imageView4 == null) {
                        C52711k.m112237a("loadingImageView");
                    }
                    imageView4.setVisibility(0);
                    ImageView imageView5 = this.f118167f;
                    if (imageView5 == null) {
                        C52711k.m112237a("loadingImageView");
                    }
                    imageView5.startAnimation(this.f118184w);
                    return;
                }
            }
            ImageView imageView6 = this.f118167f;
            if (imageView6 == null) {
                C52711k.m112237a("loadingImageView");
            }
            imageView6.setVisibility(8);
            ImageView imageView7 = this.f118167f;
            if (imageView7 == null) {
                C52711k.m112237a("loadingImageView");
            }
            imageView7.clearAnimation();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public AVDmtImageTextView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        LinearLayout.LayoutParams layoutParams;
        Drawable drawable;
        int i4;
        int i5;
        boolean z;
        int i6;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C52711k.m112240b(context2, "context");
        super(context, attributeSet, i);
        this.f118186y = true;
        this.f118157E = true;
        this.f118180s = (int) C9432q.m18687b(context2, 2.0f);
        this.f118184w = AnimationUtils.loadAnimation(context2, R.anim.fu);
        int i7 = 8;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            this.f118171j = (int) obtainStyledAttributes.getDimension(19, 0.0f);
            this.f118172k = (int) obtainStyledAttributes.getDimension(18, 0.0f);
            this.f118173l = obtainStyledAttributes.getBoolean(8, false);
            this.f118174m = obtainStyledAttributes.getBoolean(9, this.f118173l);
            this.f118175n = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            this.f118176o = obtainStyledAttributes.getBoolean(12, true);
            this.f118177p = obtainStyledAttributes.getBoolean(16, true);
            this.f118178q = obtainStyledAttributes.getBoolean(13, false);
            this.f118185x = obtainStyledAttributes.getBoolean(15, true);
            this.f118186y = obtainStyledAttributes.getBoolean(14, true);
            this.f118153A = obtainStyledAttributes.getString(41);
            this.f118187z = obtainStyledAttributes.getDrawable(24);
            this.f118154B = (int) obtainStyledAttributes.getDimension(28, 0.0f);
            this.f118181t = obtainStyledAttributes.getBoolean(27, false);
            this.f118182u = obtainStyledAttributes.getBoolean(26, false);
            this.f118183v = obtainStyledAttributes.getBoolean(25, false);
            this.f118157E = obtainStyledAttributes.getBoolean(37, true);
            this.f118158F = obtainStyledAttributes.getBoolean(35, false);
            this.f118155C = obtainStyledAttributes.getDrawable(29);
            this.f118155C = C46788b.m101632a(this.f118155C, C46788b.m101630a(this.f118181t));
            if (this.f118182u) {
                i6 = f118151M;
            } else {
                i6 = f118150L;
            }
            this.f118161I = obtainStyledAttributes.getColor(30, i6);
            this.f118179r = obtainStyledAttributes.getBoolean(43, false);
            this.f118159G = (int) obtainStyledAttributes.getDimension(38, C9432q.m18687b(context2, 4.0f));
            this.f118160H = (int) obtainStyledAttributes.getDimension(1, C9432q.m18687b(context2, 4.0f));
            obtainStyledAttributes.recycle();
        }
        this.f118162J = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = this.f118162J;
        if (linearLayout == null) {
            C52711k.m112237a("rootViewLayout");
        }
        linearLayout.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = this.f118162J;
        if (linearLayout2 == null) {
            C52711k.m112237a("rootViewLayout");
        }
        linearLayout2.setOrientation(1);
        Context context3 = context;
        StickerImageView stickerImageView = new StickerImageView(context3, null, this.f118182u, this.f118183v, this.f118179r);
        this.f118163a = stickerImageView;
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context3, null, 0, 6, null);
        this.f118165d = aVDmtTextView;
        this.f118168g = new View(context2);
        FrameLayout frameLayout = new FrameLayout(context2);
        if (this.f118176o) {
            i3 = (this.f118180s * 2) + this.f118171j;
            i2 = (this.f118180s * 2) + this.f118172k;
        } else {
            i3 = this.f118171j;
            i2 = this.f118172k;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i3, i2);
        layoutParams3.gravity = 1;
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.f118171j, this.f118172k);
        layoutParams4.gravity = 17;
        StickerImageView stickerImageView2 = this.f118163a;
        if (stickerImageView2 == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView2.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i3, i2);
        View view = this.f118168g;
        if (view == null) {
            C52711k.m112237a("borderView");
        }
        view.setLayoutParams(layoutParams5);
        this.f118167f = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        ImageView imageView = this.f118167f;
        if (imageView == null) {
            C52711k.m112237a("loadingImageView");
        }
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.a0b));
        ImageView imageView2 = this.f118167f;
        if (imageView2 == null) {
            C52711k.m112237a("loadingImageView");
        }
        imageView2.setLayoutParams(layoutParams6);
        StickerImageView stickerImageView3 = this.f118163a;
        if (stickerImageView3 == null) {
            C52711k.m112237a("imageView");
        }
        frameLayout.addView(stickerImageView3);
        View view2 = this.f118168g;
        if (view2 == null) {
            C52711k.m112237a("borderView");
        }
        frameLayout.addView(view2);
        ImageView imageView3 = this.f118167f;
        if (imageView3 == null) {
            C52711k.m112237a("loadingImageView");
        }
        frameLayout.addView(imageView3);
        if (this.f118179r) {
            layoutParams = new LinearLayout.LayoutParams((int) C46786a.f118224c.mo94006c(), -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(this.f118171j, -2);
        }
        layoutParams.gravity = 1;
        layoutParams.topMargin = this.f118159G;
        this.f118166e = new LinearLayout(context2);
        LinearLayout linearLayout3 = this.f118166e;
        if (linearLayout3 == null) {
            C52711k.m112237a("textLayout");
        }
        linearLayout3.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.weight = 1.0f;
        layoutParams7.gravity = 1;
        AVDmtTextView aVDmtTextView2 = this.f118165d;
        if (aVDmtTextView2 == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView2.setLayoutParams(layoutParams7);
        AVDmtTextView aVDmtTextView3 = this.f118165d;
        if (aVDmtTextView3 == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView3.setGravity(17);
        LinearLayout linearLayout4 = this.f118166e;
        if (linearLayout4 == null) {
            C52711k.m112237a("textLayout");
        }
        AVDmtTextView aVDmtTextView4 = this.f118165d;
        if (aVDmtTextView4 == null) {
            C52711k.m112237a("dmtTextView");
        }
        linearLayout4.addView(aVDmtTextView4);
        this.f118164b = new View(context2);
        int b = (int) C9432q.m18687b(context2, 6.0f);
        if (this.f118186y) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(b, b);
            layoutParams8.gravity = 8388661;
            if (this.f118182u) {
                int b2 = (int) C9432q.m18687b(context2, 4.0f);
                View view3 = this.f118164b;
                if (view3 == null) {
                    C52711k.m112237a("dotView");
                }
                if (view3 != null && C1056u.m3055f(view3) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    layoutParams8.leftMargin = b2;
                } else {
                    layoutParams8.rightMargin = b2;
                }
                layoutParams8.topMargin = b2;
                View view4 = this.f118164b;
                if (view4 == null) {
                    C52711k.m112237a("dotView");
                }
                view4.setLayoutParams(layoutParams8);
                StickerImageView stickerImageView4 = this.f118163a;
                if (stickerImageView4 == null) {
                    C52711k.m112237a("imageView");
                }
                View view5 = this.f118164b;
                if (view5 == null) {
                    C52711k.m112237a("dotView");
                }
                stickerImageView4.addView(view5);
            } else {
                View view6 = this.f118164b;
                if (view6 == null) {
                    C52711k.m112237a("dotView");
                }
                view6.setLayoutParams(layoutParams8);
                View view7 = this.f118164b;
                if (view7 == null) {
                    C52711k.m112237a("dotView");
                }
                frameLayout.addView(view7);
            }
        } else {
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(b, b);
            layoutParams9.gravity = 8388661;
            layoutParams9.weight = 0.0f;
            View view8 = this.f118164b;
            if (view8 == null) {
                C52711k.m112237a("dotView");
            }
            view8.setLayoutParams(layoutParams9);
            LinearLayout linearLayout5 = this.f118166e;
            if (linearLayout5 == null) {
                C52711k.m112237a("textLayout");
            }
            View view9 = this.f118164b;
            if (view9 == null) {
                C52711k.m112237a("dotView");
            }
            linearLayout5.addView(view9);
        }
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(this.f118171j, -2);
        layoutParams10.gravity = 1;
        layoutParams10.topMargin = this.f118160H;
        this.f118169h = new FrameLayout(context2);
        FrameLayout frameLayout2 = this.f118169h;
        if (frameLayout2 == null) {
            C52711k.m112237a("bottomDotLayout");
        }
        frameLayout2.setLayoutParams(layoutParams10);
        this.f118170i = new ImageView(context2);
        ImageView imageView4 = this.f118170i;
        if (imageView4 == null) {
            C52711k.m112237a("bottomDotView");
        }
        imageView4.setImageResource(R.drawable.ccm);
        int b3 = (int) C9432q.m18687b(context2, 4.0f);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(b3, b3);
        layoutParams11.gravity = 1;
        ImageView imageView5 = this.f118170i;
        if (imageView5 == null) {
            C52711k.m112237a("bottomDotView");
        }
        imageView5.setLayoutParams(layoutParams11);
        FrameLayout frameLayout3 = this.f118169h;
        if (frameLayout3 == null) {
            C52711k.m112237a("bottomDotLayout");
        }
        ImageView imageView6 = this.f118170i;
        if (imageView6 == null) {
            C52711k.m112237a("bottomDotView");
        }
        frameLayout3.addView(imageView6);
        LinearLayout linearLayout6 = this.f118162J;
        if (linearLayout6 == null) {
            C52711k.m112237a("rootViewLayout");
        }
        linearLayout6.addView(frameLayout);
        LinearLayout linearLayout7 = this.f118162J;
        if (linearLayout7 == null) {
            C52711k.m112237a("rootViewLayout");
        }
        LinearLayout linearLayout8 = this.f118166e;
        if (linearLayout8 == null) {
            C52711k.m112237a("textLayout");
        }
        linearLayout7.addView(linearLayout8);
        LinearLayout linearLayout9 = this.f118162J;
        if (linearLayout9 == null) {
            C52711k.m112237a("rootViewLayout");
        }
        FrameLayout frameLayout4 = this.f118169h;
        if (frameLayout4 == null) {
            C52711k.m112237a("bottomDotLayout");
        }
        linearLayout9.addView(frameLayout4);
        LinearLayout linearLayout10 = this.f118162J;
        if (linearLayout10 == null) {
            C52711k.m112237a("rootViewLayout");
        }
        addView(linearLayout10);
        C13837e eVar = new C13837e();
        C13833a a = new C13834b(getResources()).mo25912a();
        int i8 = this.f118161I;
        int color = getResources().getColor(R.color.a3_);
        if (this.f118173l) {
            eVar.mo25937a(true);
            C52711k.m112236a((Object) a, "hierarchy");
            a.mo25899a(eVar);
            if (this.f118155C == null) {
                this.f118155C = C42430at.m93195a(i8, i8, 0);
            }
        } else {
            eVar.mo25937a(false);
            eVar.mo25932a((float) this.f118175n);
            if (this.f118155C == null) {
                this.f118155C = C42430at.m93196a(i8, i8, 0, this.f118175n);
            }
        }
        if (this.f118174m) {
            drawable = C42430at.m93195a(color, 0, this.f118180s);
            C52711k.m112236a((Object) drawable, "DmtDesignDrawableFactory…TRANSPARENT, borderWidth)");
            this.f118156D = C42430at.m93195a(i8, i8, 0);
        } else {
            if (this.f118182u) {
                i5 = this.f118175n + this.f118180s;
            } else {
                i5 = this.f118175n;
            }
            drawable = C42430at.m93196a(color, 0, this.f118180s, i5);
            C52711k.m112236a((Object) drawable, "DmtDesignDrawableFactory…orderWidth, borderRadius)");
            this.f118156D = C42430at.m93196a(i8, i8, 0, this.f118175n);
        }
        C52711k.m112236a((Object) a, "hierarchy");
        a.mo25899a(eVar);
        a.mo25904b(this.f118155C);
        a.mo25909c(this.f118155C);
        StickerImageView stickerImageView5 = this.f118163a;
        if (stickerImageView5 == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView5.setImageHierarchy(a);
        StickerImageView stickerImageView6 = this.f118163a;
        if (stickerImageView6 == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView6.mo90450a(this.f118185x);
        StickerImageView stickerImageView7 = this.f118163a;
        if (stickerImageView7 == null) {
            C52711k.m112237a("imageView");
        }
        stickerImageView7.setPadding(this.f118154B, this.f118154B, this.f118154B, this.f118154B);
        if (this.f118158F) {
            StickerImageView stickerImageView8 = this.f118163a;
            if (stickerImageView8 == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView8.setBackground(this.f118156D);
        }
        View view10 = this.f118168g;
        if (view10 == null) {
            C52711k.m112237a("borderView");
        }
        view10.setBackground(drawable);
        View view11 = this.f118168g;
        if (view11 == null) {
            C52711k.m112237a("borderView");
        }
        view11.setVisibility(8);
        ImageView imageView7 = this.f118167f;
        if (imageView7 == null) {
            C52711k.m112237a("loadingImageView");
        }
        imageView7.setVisibility(8);
        LinearLayout linearLayout11 = this.f118166e;
        if (linearLayout11 == null) {
            C52711k.m112237a("textLayout");
        }
        if (this.f118177p) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        linearLayout11.setVisibility(i4);
        AVDmtTextView aVDmtTextView5 = this.f118165d;
        if (aVDmtTextView5 == null) {
            C52711k.m112237a("dmtTextView");
        }
        if (this.f118177p) {
            i7 = 0;
        }
        aVDmtTextView5.setVisibility(i7);
        if (this.f118157E) {
            this.f118157E = true;
            AVDmtTextView aVDmtTextView6 = this.f118165d;
            if (aVDmtTextView6 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView6.setSingleLine();
            AVDmtTextView aVDmtTextView7 = this.f118165d;
            if (aVDmtTextView7 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView7.setHorizontalFadingEdgeEnabled(true);
            AVDmtTextView aVDmtTextView8 = this.f118165d;
            if (aVDmtTextView8 == null) {
                C52711k.m112237a("dmtTextView");
            }
            aVDmtTextView8.setFadingEdgeLength((int) C9432q.m18687b(getContext(), 4.0f));
        }
        AVDmtTextView aVDmtTextView9 = this.f118165d;
        if (aVDmtTextView9 == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView9.mo1037a();
        AVDmtTextView aVDmtTextView10 = this.f118165d;
        if (aVDmtTextView10 == null) {
            C52711k.m112237a("dmtTextView");
        }
        aVDmtTextView10.setOldPanelStyle(this.f118181t);
        Drawable a2 = C42430at.m93195a(color, color, this.f118180s);
        View view12 = this.f118164b;
        if (view12 == null) {
            C52711k.m112237a("dotView");
        }
        view12.setBackground(a2);
        mo93974c(false);
        if (this.f118187z != null) {
            this.f118187z = C46788b.f118235d.mo94010a(this.f118187z, this.f118181t);
            StickerImageView stickerImageView9 = this.f118163a;
            if (stickerImageView9 == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView9.setIconImageViewScaleType(C13818b.f36067g);
            StickerImageView stickerImageView10 = this.f118163a;
            if (stickerImageView10 == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView10.mo90446a(this.f118187z);
            StickerImageView stickerImageView11 = this.f118163a;
            if (stickerImageView11 == null) {
                C52711k.m112237a("imageView");
            }
            stickerImageView11.setBackground(this.f118156D);
        }
        if (!TextUtils.isEmpty(this.f118153A)) {
            setText(this.f118153A);
        }
        mo93975d(this.f118178q);
    }

    public /* synthetic */ AVDmtImageTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

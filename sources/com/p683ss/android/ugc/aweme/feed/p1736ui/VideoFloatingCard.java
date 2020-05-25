package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard */
public final class VideoFloatingCard extends LinearLayout {

    /* renamed from: a */
    private TextView f80527a;

    /* renamed from: b */
    private TextView f80528b;

    /* renamed from: c */
    private RemoteImageView f80529c;

    /* renamed from: d */
    private ImageView f80530d;

    /* renamed from: e */
    private FrameLayout f80531e;

    /* renamed from: f */
    private TextView f80532f;

    /* renamed from: g */
    private ImageView f80533g;

    /* renamed from: h */
    private RemoteImageView f80534h;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$a */
    static final class C30730a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f80535a;

        C30730a(Runnable runnable) {
            this.f80535a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f80535a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$b */
    static final class C30731b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f80536a;

        C30731b(Runnable runnable) {
            this.f80536a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f80536a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$c */
    public static final class C30732c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f80537a;

        public C30732c(Runnable runnable) {
            this.f80537a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f80537a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard$d */
    public static final class C30733d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f80538a;

        public C30733d(Runnable runnable) {
            this.f80538a = runnable;
        }

        public final void run() {
            Runnable runnable = this.f80538a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final FrameLayout getButton() {
        FrameLayout frameLayout = this.f80531e;
        if (frameLayout == null) {
            C52711k.m112237a("actionButton");
        }
        return frameLayout;
    }

    public final ImageView getCloseView() {
        ImageView imageView = this.f80530d;
        if (imageView == null) {
            C52711k.m112237a("closeView");
        }
        return imageView;
    }

    public VideoFloatingCard(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public final void setButtonBackground(UrlModel urlModel) {
        RemoteImageView remoteImageView = this.f80534h;
        if (remoteImageView == null) {
            C52711k.m112237a("ivButtonBackground");
        }
        C23515d.m57669a(remoteImageView, urlModel);
    }

    public final void setButtonText(CharSequence charSequence) {
        TextView textView = this.f80532f;
        if (textView == null) {
            C52711k.m112237a("actionTitleView");
        }
        textView.setText(charSequence);
    }

    public final void setDesc(CharSequence charSequence) {
        TextView textView = this.f80528b;
        if (textView == null) {
            C52711k.m112237a("descView");
        }
        textView.setText(charSequence);
    }

    public final void setIcon(UrlModel urlModel) {
        RemoteImageView remoteImageView = this.f80529c;
        if (remoteImageView == null) {
            C52711k.m112237a("iconView");
        }
        C23515d.m57669a(remoteImageView, urlModel);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.f80527a;
        if (textView == null) {
            C52711k.m112237a("titleView");
        }
        textView.setText(charSequence);
    }

    public final void setButtonBackgroundColors(int[] iArr) {
        C52711k.m112240b(iArr, "colors");
        GradientDrawable gradientDrawable = new GradientDrawable();
        float a = (float) C23728o.m58241a(2.0d);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a, a, a, a});
        gradientDrawable.setOrientation(Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(iArr);
        FrameLayout frameLayout = this.f80531e;
        if (frameLayout == null) {
            C52711k.m112237a("actionButton");
        }
        frameLayout.setBackground(gradientDrawable);
    }

    public VideoFloatingCard(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.b7e, this, true);
        View findViewById = findViewById(R.id.dhb);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.tv_title)");
        this.f80527a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.d98);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.tv_desc)");
        this.f80528b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.b1k);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.iv_icon)");
        this.f80529c = (RemoteImageView) findViewById3;
        View findViewById4 = findViewById(R.id.az9);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.iv_close)");
        this.f80530d = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.nc);
        C52711k.m112236a((Object) findViewById5, "findViewById(R.id.btn_action)");
        this.f80531e = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.d7b);
        C52711k.m112236a((Object) findViewById6, "findViewById(R.id.tv_btn_title)");
        this.f80532f = (TextView) findViewById6;
        View findViewById7 = findViewById(R.id.ay_);
        C52711k.m112236a((Object) findViewById7, "findViewById(R.id.iv_background)");
        this.f80533g = (ImageView) findViewById7;
        View findViewById8 = findViewById(R.id.ayo);
        C52711k.m112236a((Object) findViewById8, "findViewById(R.id.iv_button_bg)");
        this.f80534h = (RemoteImageView) findViewById8;
    }

    /* renamed from: a */
    public final void mo63406a(long j, Runnable runnable, Runnable runnable2) {
        animate().translationX(-((float) C23729p.m58268c((View) this).right)).alpha(0.0f).withStartAction(new C30730a(null)).setDuration(j).withEndAction(new C30731b(runnable2)).start();
    }
}

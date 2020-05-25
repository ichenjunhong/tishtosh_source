package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43908a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.c */
public final class C43096c extends Dialog {

    /* renamed from: a */
    public Animatable f108801a;

    /* renamed from: b */
    private final SimpleDraweeView f108802b;

    /* renamed from: c */
    private boolean f108803c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.c$a */
    public static final class C43097a extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C43096c f108804a;

        /* renamed from: b */
        final /* synthetic */ boolean f108805b;

        C43097a(C43096c cVar, boolean z) {
            this.f108804a = cVar;
            this.f108805b = z;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            this.f108804a.f108801a = animatable;
            if (this.f108805b && animatable != null) {
                animatable.start();
            }
        }
    }

    public final void dismiss() {
        this.f108802b.clearAnimation();
        Animatable animatable = this.f108801a;
        if (animatable != null) {
            animatable.stop();
        }
        this.f108803c = false;
        C43098d.m94417a(this);
    }

    public final void show() {
        if (!this.f108803c) {
            if (this.f108801a == null) {
                m94416a(true);
            } else {
                Animatable animatable = this.f108801a;
                if (animatable != null) {
                    animatable.start();
                }
            }
            this.f108803c = true;
        }
        super.show();
    }

    public C43096c(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.i5);
        setContentView(R.layout.a8d);
        View findViewById = findViewById(R.id.b15);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.iv_guide_animation)");
        this.f108802b = (SimpleDraweeView) findViewById;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        m94416a(false);
    }

    /* renamed from: a */
    private final void m94416a(boolean z) {
        C14229b[] a = C43908a.m96440a("asset:///stickpoint_switch_music_loading.gif", false, Config.ARGB_8888);
        C52711k.m112236a((Object) a, "AlphaFrescoHelper.create… Bitmap.Config.ARGB_8888)");
        this.f108802b.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25762c(true)).mo25755a((REQUEST[]) a)).mo25751a((C13791d<? super INFO>) new C43097a<Object>(this, z))).mo25763d());
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aq */
public final class C43505aq extends Dialog {

    /* renamed from: a */
    private ImageView f110027a;

    public final void onBackPressed() {
    }

    public final void dismiss() {
        C43506ar.m95368a(this);
        m95367a(false);
    }

    public final void show() {
        super.show();
        m95367a(true);
    }

    public C43505aq(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.i5);
    }

    /* renamed from: a */
    private final void m95367a(boolean z) {
        Context context;
        if (z) {
            ImageView imageView = this.f110027a;
            if (imageView != null) {
                ImageView imageView2 = this.f110027a;
                if (imageView2 != null) {
                    context = imageView2.getContext();
                } else {
                    context = null;
                }
                imageView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.fu));
            }
        } else {
            ImageView imageView3 = this.f110027a;
            if (imageView3 != null) {
                imageView3.clearAnimation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bkk);
        this.f110027a = (ImageView) findViewById(R.id.b25);
        Window window = getWindow();
        if (window == null) {
            C52711k.m112234a();
        }
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C52711k.m112234a();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C52711k.m112236a((Object) paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C52711k.m112234a();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
    }
}

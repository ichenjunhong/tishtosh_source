package com.p683ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.views.q */
public final class C48219q extends Dialog {

    /* renamed from: a */
    private AVLoadingLayout f121349a;

    public final void dismiss() {
        C48220r.m104472a(this);
        if (this.f121349a != null) {
            AVLoadingLayout aVLoadingLayout = this.f121349a;
            if (aVLoadingLayout == null) {
                C52711k.m112234a();
            }
            aVLoadingLayout.setVisibility(8);
        }
    }

    public final void show() {
        super.show();
        if (this.f121349a != null) {
            AVLoadingLayout aVLoadingLayout = this.f121349a;
            if (aVLoadingLayout == null) {
                C52711k.m112234a();
            }
            aVLoadingLayout.setVisibility(0);
        }
    }

    public C48219q(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a8d);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a83);
        this.f121349a = (AVLoadingLayout) findViewById(R.id.bhy);
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

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C52711k.m112240b(keyEvent, "event");
        if (i == 4 && keyEvent.getAction() == 0) {
            C50203g.m108361b("SimpleLoadingDialog click back");
        }
        return false;
    }
}

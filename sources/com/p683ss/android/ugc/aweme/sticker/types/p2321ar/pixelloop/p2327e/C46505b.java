package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.b */
public final class C46505b extends Dialog {

    /* renamed from: a */
    private AVLoadingLayout f117343a;

    /* renamed from: b */
    private AVTextView f117344b;

    /* renamed from: c */
    private View f117345c;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.b$a */
    static final class C46506a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46505b f117346a;

        C46506a(C46505b bVar) {
            this.f117346a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C50275d.m108530a(this.f117346a.getContext(), (int) R.string.cp9).mo98174a();
        }
    }

    public final void dismiss() {
        C46507c.m100947a(this);
        if (this.f117343a != null) {
            AVLoadingLayout aVLoadingLayout = this.f117343a;
            if (aVLoadingLayout == null) {
                C52711k.m112234a();
            }
            aVLoadingLayout.setVisibility(8);
        }
    }

    public final void show() {
        super.show();
        if (this.f117343a != null) {
            AVLoadingLayout aVLoadingLayout = this.f117343a;
            if (aVLoadingLayout == null) {
                C52711k.m112234a();
            }
            aVLoadingLayout.setVisibility(0);
        }
    }

    public C46505b(Context context) {
        C52711k.m112240b(context, "context");
        super(context, R.style.i5);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a83);
        this.f117343a = (AVLoadingLayout) findViewById(R.id.bhy);
        this.f117344b = (AVTextView) findViewById(R.id.a03);
        this.f117345c = findViewById(R.id.c_z);
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
        View view = this.f117345c;
        if (view == null) {
            C52711k.m112234a();
        }
        view.setOnClickListener(new C46506a(this));
    }
}

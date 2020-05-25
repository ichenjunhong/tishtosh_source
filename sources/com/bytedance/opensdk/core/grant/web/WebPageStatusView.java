package com.bytedance.opensdk.core.grant.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class WebPageStatusView extends FrameLayout {

    /* renamed from: a */
    public static final C12522a f32882a = new C12522a(null);

    /* renamed from: b */
    private HashMap f32883b;

    /* renamed from: com.bytedance.opensdk.core.grant.web.WebPageStatusView$a */
    public static final class C12522a {
        private C12522a() {
        }

        public /* synthetic */ C12522a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    private View m25127b(int i) {
        if (this.f32883b == null) {
            this.f32883b = new HashMap();
        }
        View view = (View) this.f32883b.get(Integer.valueOf(R.id.bhk));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.bhk);
        this.f32883b.put(Integer.valueOf(R.id.bhk), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo23573a(int i) {
        switch (i) {
            case 0:
                setVisibility(0);
                LinearLayout linearLayout = (LinearLayout) m25127b(R.id.bhk);
                C52711k.m112236a((Object) linearLayout, "loading_layout");
                linearLayout.setVisibility(0);
                return;
            case 1:
                setVisibility(8);
                return;
            default:
                setVisibility(8);
                return;
        }
    }

    public WebPageStatusView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.r5, this);
    }

    public /* synthetic */ WebPageStatusView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}

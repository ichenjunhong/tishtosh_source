package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e */
public final class C43458e extends LinearLayout {

    /* renamed from: a */
    public static final C43459a f109845a = new C43459a(null);

    /* renamed from: b */
    private AVDmtTextView f109846b;

    /* renamed from: c */
    private SimpleDraweeView f109847c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e$a */
    public static final class C43459a {
        private C43459a() {
        }

        public /* synthetic */ C43459a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C43458e m95265a(Context context, int i, int i2) {
            C52711k.m112240b(context, "context");
            C43458e eVar = new C43458e(context);
            eVar.setText(i);
            eVar.setIcon(i2);
            return eVar;
        }
    }

    public final void setContentDescription(int i) {
        AVDmtTextView aVDmtTextView = this.f109846b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("mToolTv");
        }
        aVDmtTextView.setContentDescription(getContext().getString(i));
    }

    public final void setIcon(int i) {
        SimpleDraweeView simpleDraweeView = this.f109847c;
        if (simpleDraweeView == null) {
            C52711k.m112237a("mToolIv");
        }
        simpleDraweeView.setImageDrawable(getResources().getDrawable(i));
    }

    public final void setText(int i) {
        AVDmtTextView aVDmtTextView = this.f109846b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("mToolTv");
        }
        aVDmtTextView.setText(getContext().getString(i));
    }

    public final void setIcon(Drawable drawable) {
        C52711k.m112240b(drawable, "icon");
        SimpleDraweeView simpleDraweeView = this.f109847c;
        if (simpleDraweeView == null) {
            C52711k.m112237a("mToolIv");
        }
        simpleDraweeView.setImageDrawable(drawable);
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "text");
        AVDmtTextView aVDmtTextView = this.f109846b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("mToolTv");
        }
        aVDmtTextView.setText(str);
    }

    public C43458e(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.au_, this);
            View findViewById = findViewById(R.id.pd);
            C52711k.m112236a((Object) findViewById, "this.findViewById(R.id.btn_tool_tv)");
            this.f109846b = (AVDmtTextView) findViewById;
            View findViewById2 = findViewById(R.id.pb);
            C52711k.m112236a((Object) findViewById2, "this.findViewById(R.id.btn_tool_iv)");
            this.f109847c = (SimpleDraweeView) findViewById2;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}

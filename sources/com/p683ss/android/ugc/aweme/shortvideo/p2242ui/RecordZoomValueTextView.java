package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.RecordZoomValueTextView */
public final class RecordZoomValueTextView extends FrameLayout {

    /* renamed from: a */
    public final TextView f113686a;

    /* renamed from: b */
    public final TextView f113687b;

    /* renamed from: c */
    public final Runnable f113688c;

    /* renamed from: d */
    public float f113689d;

    /* renamed from: e */
    public int f113690e;

    /* renamed from: f */
    public int f113691f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.RecordZoomValueTextView$a */
    static final class C44911a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordZoomValueTextView f113692a;

        C44911a(RecordZoomValueTextView recordZoomValueTextView) {
            this.f113692a = recordZoomValueTextView;
        }

        public final void run() {
            this.f113692a.animate().alpha(0.0f).setDuration(10).start();
        }
    }

    public RecordZoomValueTextView(Context context) {
        this(context, null, 2, null);
    }

    public final void setDelayTime(int i) {
        this.f113690e = i;
    }

    public final void setOpType(int i) {
        this.f113691f = i;
    }

    public RecordZoomValueTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        this.f113688c = new C44911a(this);
        this.f113689d = -1.0f;
        this.f113690e = 2;
        this.f113691f = 6;
        LayoutInflater.from(context).inflate(R.layout.bk8, this);
        View findViewById = findViewById(R.id.elg);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.mode_text)");
        this.f113687b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.f8h);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.zoom_value_text)");
        this.f113686a = (TextView) findViewById2;
    }

    public /* synthetic */ RecordZoomValueTextView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}

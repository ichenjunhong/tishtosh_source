package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.feed.experiment.C30220a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFrameLayout */
public final class FeedFrameLayout extends FrameLayout {

    /* renamed from: a */
    public static final C30711a f80409a = new C30711a(null);

    /* renamed from: b */
    private final C52670a<String> f80410b;

    /* renamed from: c */
    private final C52670a<String> f80411c;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFrameLayout$a */
    public static final class C30711a {
        private C30711a() {
        }

        public /* synthetic */ C30711a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFrameLayout$b */
    static final class C30712b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C30712b f80412a = new C30712b();

        C30712b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return "FeedFrameLayout after draw";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFrameLayout$c */
    static final class C30713c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C30713c f80413a = new C30713c();

        C30713c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return "FeedFrameLayout before draw";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedFrameLayout$d */
    static final class C30714d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ int f80414a;

        C30714d(int i) {
            this.f80414a = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder("FeedFrameLayout setVisibility to ");
            sb.append(this.f80414a);
            return sb.toString();
        }
    }

    public FeedFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public FeedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        C30220a.f78947a.mo60569b(new C30714d(i));
    }

    public final void draw(Canvas canvas) {
        C30220a.f78947a.mo60568a(this.f80410b);
        super.draw(canvas);
        C30220a.f78947a.mo60568a(this.f80411c);
    }

    public FeedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f80410b = C30713c.f80413a;
        this.f80411c = C30712b.f80412a;
    }

    public /* synthetic */ FeedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

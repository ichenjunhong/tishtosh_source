package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout */
public final class AVDmtTabLayout extends TabLayout {

    /* renamed from: v */
    public static final C46784a f118202v = new C46784a(null);

    /* renamed from: u */
    public C44704c f118203u;

    /* renamed from: w */
    private int f118204w;

    /* renamed from: x */
    private int f118205x;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$a */
    public static final class C46784a {
        private C46784a() {
        }

        public /* synthetic */ C46784a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static AVDmtTabItemView m101614a(Context context) {
            if (context == null) {
                C52711k.m112234a();
            }
            return new AVDmtTabItemView(context, false);
        }

        /* renamed from: a */
        public static AVDmtTabItemView m101615a(Context context, boolean z) {
            if (context == null) {
                C52711k.m112234a();
            }
            return new AVDmtTabItemView(context, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout$b */
    public static final class C46785b implements C44704c {

        /* renamed from: a */
        final /* synthetic */ AVDmtTabLayout f118206a;

        C46785b(AVDmtTabLayout aVDmtTabLayout) {
            this.f118206a = aVDmtTabLayout;
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            C52711k.m112240b(fVar, "tab");
            if (this.f118206a.f118203u != null) {
                C44704c cVar = this.f118206a.f118203u;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                cVar.mo64263a(fVar);
            }
        }

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
            C52711k.m112240b(fVar, "tab");
            if (this.f118206a.f118203u != null) {
                C44704c cVar = this.f118206a.f118203u;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                cVar.mo64264b(fVar);
            }
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
            C52711k.m112240b(fVar, "tab");
            if (this.f118206a.f118203u != null) {
                C44704c cVar = this.f118206a.f118203u;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                cVar.mo64265c(fVar);
            }
        }
    }

    public AVDmtTabLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo90683a(C44704c cVar) {
        C52711k.m112240b(cVar, "listener");
        this.f118203u = cVar;
    }

    public final void setMaxTabModeForCount(int i) {
        if (i <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
        }
        if (i > 4 || i <= 1) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    /* renamed from: a */
    public final void mo93995a(int i, List<String> list) {
        float f;
        C52711k.m112240b(list, "nameList");
        setMaxTabModeForCount(i);
        if (!list.isEmpty()) {
            Paint paint = new Paint();
            paint.setTextSize(C9432q.m18687b(getContext(), 15.0f));
            int i2 = 0;
            for (String str : list) {
                if (str != null) {
                    f = paint.measureText(str);
                } else {
                    f = 0.0f;
                }
                if (f > ((float) i2)) {
                    i2 = (int) f;
                }
            }
            if (((float) i2) > C9432q.m18687b(getContext(), 50.0f) && i > 2) {
                setTabMode(0);
            }
        }
    }

    public AVDmtTabLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        boolean z = false;
        if (attributeSet != null) {
            z = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__}).getBoolean(27, false);
        }
        this.f118204w = C46788b.m101630a(z);
        this.f118205x = C46788b.m101629a(this.f118204w);
        setOverScrollMode(2);
        mo90681a(this.f118205x, this.f118204w);
        setSelectedTabIndicatorColor(this.f118204w);
        setTabMargin(16);
        super.mo90683a((C44704c) new C46785b(this));
    }

    public /* synthetic */ AVDmtTabLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

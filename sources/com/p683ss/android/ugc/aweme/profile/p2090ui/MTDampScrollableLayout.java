package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p683ss.android.ugc.aweme.experiment.ListParamOptExperiment;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MTDampScrollableLayout */
public final class MTDampScrollableLayout extends DampScrollableLayout {

    /* renamed from: O */
    public static final C40105a f102285O = new C40105a(null);

    /* renamed from: P */
    private boolean f102286P;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.MTDampScrollableLayout$a */
    public static final class C40105a {
        private C40105a() {
        }

        public /* synthetic */ C40105a(C52707g gVar) {
            this();
        }
    }

    public MTDampScrollableLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public MTDampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getMFlag3() {
        return this.f102286P;
    }

    /* renamed from: b */
    public final boolean mo55099b() {
        boolean z;
        boolean b = super.mo55099b();
        if (ListParamOptExperiment.m69616b() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!b) {
                this.f102286P = true;
            } else if (this.f102286P && this.f71152c != null) {
                Scroller scroller = this.f71152c;
                C52711k.m112236a((Object) scroller, "mScroller");
                float currVelocity = scroller.getCurrVelocity();
                if (currVelocity > 10000.0f) {
                    currVelocity = 10000.0f;
                }
                if (currVelocity > 0.0f) {
                    int i = (int) currVelocity;
                    View a = this.f71147M.mo55137a();
                    if (a instanceof ScrollView) {
                        ((ScrollView) a).fling(i);
                    } else if (a instanceof RecyclerView) {
                        ((RecyclerView) a).mo4820b(0, i);
                    } else if (a instanceof WebView) {
                        ((WebView) a).flingScroll(0, i);
                    }
                }
                this.f102286P = false;
            }
        }
        return b;
    }

    public final void setMFlag3(boolean z) {
        this.f102286P = z;
    }

    public MTDampScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ MTDampScrollableLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

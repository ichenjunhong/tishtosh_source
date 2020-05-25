package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SearchResultView */
public final class SearchResultView extends LinearLayout {

    /* renamed from: a */
    private C24976a f66127a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SearchResultView$a */
    public interface C24976a {
        /* renamed from: a */
        void mo50956a(MotionEvent motionEvent);
    }

    public SearchResultView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOnDispatchTouchEventListener(C24976a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f66127a = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        C24976a aVar = this.f66127a;
        if (aVar != null) {
            aVar.mo50956a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    public SearchResultView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ SearchResultView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

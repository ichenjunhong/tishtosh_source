package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView */
public class DiscoveryRecyclerView extends FpsRecyclerView {

    /* renamed from: N */
    double f75804N;

    /* renamed from: O */
    double f75805O;

    public DiscoveryRecyclerView(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f75804N = (double) motionEvent.getX();
            this.f75805O = (double) motionEvent.getY();
        } else if (action == 2) {
            double x = (double) motionEvent.getX();
            double d = this.f75804N;
            Double.isNaN(x);
            double abs = Math.abs(x - d);
            double y = (double) motionEvent.getY();
            double d2 = this.f75805O;
            Double.isNaN(y);
            double abs2 = Math.abs(y - d2);
            if (abs > ((double) ViewConfiguration.get(getContext()).getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

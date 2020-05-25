package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.support.p030v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.NestedWebScrollView */
public final class NestedWebScrollView extends NestedScrollView {

    /* renamed from: c */
    public boolean f74794c;

    /* renamed from: d */
    public boolean f74795d;

    /* renamed from: e */
    private float f74796e;

    /* renamed from: f */
    private WebView f74797f;

    /* renamed from: g */
    private final int f74798g;

    private final int getReactRootViewOrWebViewMeasureHeight() {
        Queue linkedList = new LinkedList();
        linkedList.offer(this);
        while (true) {
            int i = 0;
            if (linkedList.isEmpty()) {
                return 0;
            }
            Object poll = linkedList.poll();
            C52711k.m112236a(poll, "q.poll()");
            ViewGroup viewGroup = (ViewGroup) poll;
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i < childCount) {
                    View childAt = viewGroup.getChildAt(i);
                    C52711k.m112236a((Object) childAt, "child");
                    if (childAt.getVisibility() == 0) {
                        if (childAt instanceof WebView) {
                            WebView webView = (WebView) childAt;
                            if (webView.getId() == R.id.eu) {
                                return webView.getMeasuredHeight();
                            }
                        }
                        if (childAt instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) childAt;
                            if (viewGroup2.getId() == R.id.c9b) {
                                return viewGroup2.getMeasuredHeight();
                            }
                            linkedList.offer(childAt);
                        }
                    }
                    i++;
                }
            }
        }
    }

    public final void setTop(boolean z) {
        this.f74794c = z;
    }

    public final void setWebViewDisplaying(boolean z) {
        this.f74795d = z;
    }

    public NestedWebScrollView(Context context) {
        C52711k.m112240b(context, "context");
        super(context, null, 0);
        this.f74794c = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C52711k.m112236a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f74798g = viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: a */
    private final WebView m67545a(ViewGroup viewGroup) {
        if (this.f74797f != null) {
            return this.f74797f;
        }
        int i = 0;
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof WebView)) {
                    if (childAt instanceof ViewGroup) {
                        WebView a = m67545a((ViewGroup) childAt);
                        if (a instanceof WebView) {
                            return a;
                        }
                    }
                    if (i == childCount) {
                        break;
                    }
                    i++;
                } else {
                    return (WebView) childAt;
                }
            }
        }
        return null;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f74795d && this.f74797f == null) {
            int childCount = getChildCount();
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof WebView) {
                        this.f74797f = (WebView) childAt;
                        break;
                    }
                    if (childAt instanceof ViewGroup) {
                        WebView a = m67545a((ViewGroup) childAt);
                        if (a instanceof WebView) {
                            this.f74797f = a;
                            break;
                        }
                    }
                    if (i != childCount) {
                        i++;
                    }
                }
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            z = super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            z = false;
        }
        if (!this.f74795d) {
            return z;
        }
        if (motionEvent == null) {
            C52711k.m112234a();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f74796e = motionEvent.getRawY();
                break;
            case 1:
            case 3:
                this.f74796e = 0.0f;
                break;
            case 2:
                if (Math.abs(this.f74796e - motionEvent.getRawY()) < ((float) this.f74798g)) {
                    return z;
                }
                if (this.f74796e - motionEvent.getRawY() > 0.0f) {
                    this.f74794c = false;
                    break;
                } else if (!(!this.f74794c)) {
                    return true;
                }
                break;
        }
        return false;
    }

    public NestedWebScrollView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, 0);
        this.f74794c = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C52711k.m112236a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f74798g = viewConfiguration.getScaledTouchSlop();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            int reactRootViewOrWebViewMeasureHeight = getReactRootViewOrWebViewMeasureHeight();
            C52711k.m112236a((Object) childAt, "child");
            if (childAt.getMeasuredHeight() < measuredHeight && (reactRootViewOrWebViewMeasureHeight == 0 || childAt.getMeasuredHeight() < reactRootViewOrWebViewMeasureHeight)) {
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) layoutParams).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    public NestedWebScrollView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f74794c = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C52711k.m112236a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f74798g = viewConfiguration.getScaledTouchSlop();
    }

    public /* synthetic */ NestedWebScrollView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public /* synthetic */ NestedWebScrollView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

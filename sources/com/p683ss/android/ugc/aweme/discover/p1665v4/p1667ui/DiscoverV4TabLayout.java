package com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui;

import android.content.Context;
import android.graphics.Canvas;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ttve.utils.C20141b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4TabLayout */
public final class DiscoverV4TabLayout extends TabLayout {

    /* renamed from: a */
    public C28873f f75480a;

    /* renamed from: b */
    private int f75481b;

    /* renamed from: c */
    private int f75482c;

    /* renamed from: d */
    private int f75483d;

    /* renamed from: e */
    private LinearLayout f75484e;

    public final int getLeftPosition() {
        return this.f75481b;
    }

    public final int getRightPosition() {
        return this.f75482c;
    }

    public final int getScreenWidth() {
        return this.f75483d;
    }

    public final LinearLayout getViewGroup() {
        return this.f75484e;
    }

    public final C28873f getTabViewScrollListener() {
        C28873f fVar = this.f75480a;
        if (fVar == null) {
            C52711k.m112237a("tabViewScrollListener");
        }
        return fVar;
    }

    public final void setLeftPosition(int i) {
        this.f75481b = i;
    }

    public final void setRightPosition(int i) {
        this.f75482c = i;
    }

    public final void setScreenWidth(int i) {
        this.f75483d = i;
    }

    public final void setTabViewScrollListener(C28873f fVar) {
        C52711k.m112240b(fVar, "<set-?>");
        this.f75480a = fVar;
    }

    public final void setViewGroup(LinearLayout linearLayout) {
        C52711k.m112240b(linearLayout, "<set-?>");
        this.f75484e = linearLayout;
    }

    public DiscoverV4TabLayout(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f75482c == 0) {
            int[] iArr = new int[2];
            int childCount = this.f75484e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f75484e.getChildAt(i).getLocationOnScreen(iArr);
                if (iArr[0] < this.f75483d) {
                    this.f75482c = i;
                }
            }
            if (this.f75482c != 0) {
                C28873f fVar = this.f75480a;
                if (fVar == null) {
                    C52711k.m112237a("tabViewScrollListener");
                }
                fVar.mo58428a(this.f75481b, this.f75482c);
            }
        }
    }

    public DiscoverV4TabLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    public DiscoverV4TabLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f75483d = C20141b.m49697a(context);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f75484e = (LinearLayout) childAt;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        View childAt = this.f75484e.getChildAt(this.f75481b);
        View childAt2 = this.f75484e.getChildAt(this.f75482c);
        childAt.getLocationOnScreen(iArr);
        childAt2.getLocationOnScreen(iArr2);
        if (i3 < i) {
            if (iArr[0] + childAt.getWidth() < 0) {
                this.f75481b++;
                if (this.f75480a == null) {
                    C52711k.m112237a("tabViewScrollListener");
                }
            }
            if (iArr2[0] + childAt2.getWidth() < this.f75483d && this.f75482c < this.f75484e.getChildCount() - 1) {
                this.f75482c++;
                C28873f fVar = this.f75480a;
                if (fVar == null) {
                    C52711k.m112237a("tabViewScrollListener");
                }
                fVar.mo58427a(this.f75482c);
            }
        } else {
            if (iArr[0] > 0 && this.f75481b > 0) {
                this.f75481b--;
                C28873f fVar2 = this.f75480a;
                if (fVar2 == null) {
                    C52711k.m112237a("tabViewScrollListener");
                }
                fVar2.mo58427a(this.f75481b);
            }
            if (iArr2[0] > this.f75483d) {
                this.f75482c--;
                if (this.f75480a == null) {
                    C52711k.m112237a("tabViewScrollListener");
                }
            }
        }
    }
}

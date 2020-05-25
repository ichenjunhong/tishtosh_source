package com.p683ss.android.ugc.aweme.p2377ug.guide;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.common.widget.C26963a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout */
public final class SwipeUpGuideStrengthenLayout extends RelativeLayout {

    /* renamed from: a */
    private float f119686a;

    /* renamed from: b */
    private float f119687b;

    /* renamed from: c */
    private C26963a f119688c;

    /* renamed from: d */
    private final float f119689d;

    /* renamed from: e */
    private float f119690e;

    public SwipeUpGuideStrengthenLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final float getDensity() {
        return this.f119689d;
    }

    public final float getDisAmount() {
        return this.f119690e;
    }

    public final float getPreviousY() {
        return this.f119687b;
    }

    public final C26963a getViewPager() {
        return this.f119688c;
    }

    public final float getYDown() {
        return this.f119686a;
    }

    public final void setDisAmount(float f) {
        this.f119690e = f;
    }

    public final void setPreviousY(float f) {
        this.f119687b = f;
    }

    public final void setViewPager(C26963a aVar) {
        this.f119688c = aVar;
    }

    public final void setYDown(float f) {
        this.f119686a = f;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f119686a = motionEvent.getY();
                    this.f119687b = this.f119686a;
                    C26963a aVar = this.f119688c;
                    if (aVar != null) {
                        aVar.mo55010c();
                        break;
                    }
                    break;
                case 1:
                    C26963a aVar2 = this.f119688c;
                    if (aVar2 != null && aVar2.mo55009b()) {
                        C26963a aVar3 = this.f119688c;
                        if (aVar3 != null) {
                            aVar3.mo55014d();
                        }
                    }
                    this.f119686a = 0.0f;
                    this.f119690e = 0.0f;
                    break;
                case 2:
                    float y = motionEvent.getY() - this.f119687b;
                    this.f119687b = motionEvent.getY();
                    if (y < 0.0f || this.f119690e < 0.0f) {
                        C26963a aVar4 = this.f119688c;
                        if (aVar4 != null && !aVar4.mo55009b()) {
                            C26963a aVar5 = this.f119688c;
                            if (aVar5 != null) {
                                aVar5.mo55010c();
                            }
                        }
                        C26963a aVar6 = this.f119688c;
                        if (aVar6 != null) {
                            aVar6.mo55003a(y);
                        }
                        this.f119690e += y;
                        break;
                    }
                case 3:
                    C26963a aVar7 = this.f119688c;
                    if (aVar7 != null && aVar7.mo55009b()) {
                        C26963a aVar8 = this.f119688c;
                        if (aVar8 != null) {
                            aVar8.mo55014d();
                            break;
                        }
                    }
                    break;
            }
        }
        return true;
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        this.f119689d = resources.getDisplayMetrics().density;
    }

    public /* synthetic */ SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

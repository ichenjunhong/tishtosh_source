package com.p683ss.android.ugc.aweme.bullet.module.p1477ad.p1478ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView.C10611a;
import com.p683ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout */
public final class GradualChangeLinearLayout extends LinearLayout implements C10611a {

    /* renamed from: a */
    public Space f64508a;

    /* renamed from: b */
    public int f64509b;

    /* renamed from: c */
    public boolean f64510c;

    /* renamed from: d */
    private int f64511d;

    /* renamed from: e */
    private int f64512e;

    /* renamed from: f */
    private int f64513f;

    /* renamed from: g */
    private BulletCommonTitleBar f64514g;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.ui.GradualChangeLinearLayout$a */
    public static final class C24311a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f64515a;

        public final void onGlobalLayout() {
            this.f64515a.f64509b = GradualChangeLinearLayout.m59577a(this.f64515a).getHeight();
            GradualChangeLinearLayout.m59577a(this.f64515a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C24311a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f64515a = gradualChangeLinearLayout;
        }
    }

    public GradualChangeLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final BulletCommonTitleBar getTitleBar() {
        return this.f64514g;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.bpy);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.nav_bar_divide)");
        this.f64508a = (Space) findViewById;
        Space space = this.f64508a;
        if (space == null) {
            C52711k.m112237a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new C24311a(this));
    }

    public final void setTitleBar(BulletCommonTitleBar bulletCommonTitleBar) {
        this.f64514g = bulletCommonTitleBar;
    }

    /* renamed from: a */
    public static final /* synthetic */ Space m59577a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f64508a;
        if (space == null) {
            C52711k.m112237a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f64510c = z;
        Space space = this.f64508a;
        if (space == null) {
            C52711k.m112237a("space");
        }
        if (space.getHeight() != this.f64509b) {
            Space space2 = this.f64508a;
            if (space2 == null) {
                C52711k.m112237a("space");
            }
            LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f64509b;
            Space space3 = this.f64508a;
            if (space3 == null) {
                C52711k.m112237a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (!this.f64510c) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f64511d = (int) motionEvent.getY();
            this.f64512e = (int) motionEvent.getY();
        } else if (num != null && num.intValue() == 2) {
            int y = (int) motionEvent.getY();
            int i = y - this.f64512e;
            Space space = this.f64508a;
            if (space == null) {
                C52711k.m112237a("space");
            }
            int height = space.getHeight();
            this.f64512e = y;
            if (height > 0 && i < 0) {
                Space space2 = this.f64508a;
                if (space2 == null) {
                    C52711k.m112237a("space");
                }
                LayoutParams layoutParams = space2.getLayoutParams();
                layoutParams.height += i;
                if (layoutParams.height < 0) {
                    layoutParams.height = 0;
                }
                Space space3 = this.f64508a;
                if (space3 == null) {
                    C52711k.m112237a("space");
                }
                space3.setLayoutParams(layoutParams);
                BulletCommonTitleBar bulletCommonTitleBar = this.f64514g;
                if (bulletCommonTitleBar != null) {
                    bulletCommonTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f64509b));
                }
                return true;
            } else if (height < this.f64509b && this.f64513f == 0 && i > 0) {
                Space space4 = this.f64508a;
                if (space4 == null) {
                    C52711k.m112237a("space");
                }
                LayoutParams layoutParams2 = space4.getLayoutParams();
                layoutParams2.height += i;
                if (layoutParams2.height > this.f64509b) {
                    layoutParams2.height = this.f64509b;
                }
                BulletCommonTitleBar bulletCommonTitleBar2 = this.f64514g;
                if (bulletCommonTitleBar2 != null) {
                    bulletCommonTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f64509b));
                }
                Space space5 = this.f64508a;
                if (space5 == null) {
                    C52711k.m112237a("space");
                }
                space5.setLayoutParams(layoutParams2);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f64513f = i2;
    }

    public /* synthetic */ GradualChangeLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

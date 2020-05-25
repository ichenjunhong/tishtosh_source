package com.p683ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout */
public final class GradualChangeLinearLayout extends LinearLayout {

    /* renamed from: a */
    public Space f72012a;

    /* renamed from: b */
    public int f72013b;

    /* renamed from: c */
    public int f72014c;

    /* renamed from: d */
    public boolean f72015d;

    /* renamed from: e */
    private SingleWebView f72016e;

    /* renamed from: f */
    private CrossPlatformTitleBar f72017f;

    /* renamed from: g */
    private int f72018g;

    /* renamed from: h */
    private int f72019h;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout$a */
    public static final class C27296a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f72020a;

        public final void onGlobalLayout() {
            this.f72020a.f72013b = GradualChangeLinearLayout.m65790a(this.f72020a).getHeight();
            GradualChangeLinearLayout.m65790a(this.f72020a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C27296a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f72020a = gradualChangeLinearLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout$b */
    public static final class C27297b implements C27299b {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f72021a;

        C27297b(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f72021a = gradualChangeLinearLayout;
        }

        /* renamed from: a */
        public final void mo54645a(int i, int i2, int i3, int i4) {
            this.f72021a.f72014c = i2;
        }
    }

    public GradualChangeLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final CrossPlatformTitleBar getTitleBar() {
        return this.f72017f;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.bpy);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.nav_bar_divide)");
        this.f72012a = (Space) findViewById;
        Space space = this.f72012a;
        if (space == null) {
            C52711k.m112237a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new C27296a(this));
        View findViewById2 = findViewById(R.id.a2j);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.cross_react_view)");
        SingleWebView a = ((C27309j) ((CrossPlatformWebView) findViewById2).mo55670a(C27309j.class)).mo55729a();
        C52711k.m112236a((Object) a, "crossPlatformWebView.get…Wrap::class.java).webView");
        this.f72016e = a;
        SingleWebView singleWebView = this.f72016e;
        if (singleWebView == null) {
            C52711k.m112237a("webView");
        }
        singleWebView.setWebScrollListener(new C27297b(this));
    }

    public final void setTitleBar(CrossPlatformTitleBar crossPlatformTitleBar) {
        this.f72017f = crossPlatformTitleBar;
    }

    /* renamed from: a */
    public static final /* synthetic */ Space m65790a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f72012a;
        if (space == null) {
            C52711k.m112237a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f72015d = z;
        Space space = this.f72012a;
        if (space == null) {
            C52711k.m112237a("space");
        }
        if (space.getHeight() != this.f72013b) {
            Space space2 = this.f72012a;
            if (space2 == null) {
                C52711k.m112237a("space");
            }
            LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f72013b;
            Space space3 = this.f72012a;
            if (space3 == null) {
                C52711k.m112237a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (!this.f72015d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f72018g = (int) motionEvent.getY();
            this.f72019h = (int) motionEvent.getY();
        } else if (num != null && num.intValue() == 2) {
            int y = (int) motionEvent.getY();
            int i = y - this.f72019h;
            Space space = this.f72012a;
            if (space == null) {
                C52711k.m112237a("space");
            }
            int height = space.getHeight();
            this.f72019h = y;
            if (height > 0 && i < 0) {
                Space space2 = this.f72012a;
                if (space2 == null) {
                    C52711k.m112237a("space");
                }
                LayoutParams layoutParams = space2.getLayoutParams();
                layoutParams.height += i;
                if (layoutParams.height < 0) {
                    layoutParams.height = 0;
                }
                Space space3 = this.f72012a;
                if (space3 == null) {
                    C52711k.m112237a("space");
                }
                space3.setLayoutParams(layoutParams);
                CrossPlatformTitleBar crossPlatformTitleBar = this.f72017f;
                if (crossPlatformTitleBar != null) {
                    crossPlatformTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f72013b));
                }
                return true;
            } else if (height < this.f72013b && this.f72014c == 0 && i > 0) {
                Space space4 = this.f72012a;
                if (space4 == null) {
                    C52711k.m112237a("space");
                }
                LayoutParams layoutParams2 = space4.getLayoutParams();
                layoutParams2.height += i;
                if (layoutParams2.height > this.f72013b) {
                    layoutParams2.height = this.f72013b;
                }
                CrossPlatformTitleBar crossPlatformTitleBar2 = this.f72017f;
                if (crossPlatformTitleBar2 != null) {
                    crossPlatformTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f72013b));
                }
                Space space5 = this.f72012a;
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

package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1060v;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;

public class BannerSwipeRefreshLayout extends I18nSwipeRefreshLayout {

    /* renamed from: m */
    public ViewPager f18599m;

    /* renamed from: n */
    public View f18600n;

    /* renamed from: o */
    public RecyclerView f18601o;

    /* renamed from: p */
    private List<RecyclerView> f18602p = new ArrayList();

    /* renamed from: q */
    private int f18603q;

    /* renamed from: r */
    private boolean f18604r;

    /* renamed from: s */
    private float f18605s;

    /* renamed from: t */
    private float f18606t;

    /* renamed from: u */
    private float f18607u;

    /* renamed from: v */
    private float f18608v;

    /* renamed from: w */
    private int f18609w;

    /* renamed from: com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout$a */
    public interface C6792a {
        /* renamed from: a */
        void mo12920a(ViewPager viewPager, View view);

        /* renamed from: a */
        void mo12921a(RecyclerView recyclerView);
    }

    public BannerSwipeRefreshLayout(Context context) {
        super(context);
        m14219a(context);
    }

    /* renamed from: a */
    private void m14219a(Context context) {
        this.f18603q = C1060v.m3090a(ViewConfiguration.get(context));
        this.f18604r = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        try {
            if (!((this.f18599m == null || this.f18600n == null) && this.f18601o == null)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f18605s = motionEvent.getX();
                    this.f18607u = this.f18605s;
                    this.f18606t = motionEvent.getY();
                    this.f18608v = this.f18606t;
                    this.f18604r = false;
                    this.f18609w = C1044i.m2984b(motionEvent, 0);
                } else if (action == 2) {
                    if (this.f18604r) {
                        return false;
                    }
                    int a = C1044i.m2982a(motionEvent, this.f18609w);
                    float c = C1044i.m2985c(motionEvent, a);
                    float abs = Math.abs(c - this.f18607u);
                    float d = C1044i.m2986d(motionEvent, a);
                    float abs2 = Math.abs(d - this.f18608v);
                    if (this.f18599m == null || this.f18600n == null) {
                        if (this.f18601o != null) {
                            if ((c - this.f18607u <= 0.0f || this.f18601o.getScrollX() != 0) && abs > ((float) this.f18603q) && abs * 0.5f > abs2 && ((float) this.f18601o.getBottom()) > d) {
                                this.f18604r = true;
                                return false;
                            } else if (abs2 < ((float) (this.f18603q + 100))) {
                                return false;
                            } else {
                                if (c - this.f18605s > 0.0f) {
                                    f = this.f18605s + ((float) this.f18603q);
                                } else {
                                    f = this.f18605s - ((float) this.f18603q);
                                }
                                this.f18607u = f;
                                this.f18608v = d;
                            }
                        }
                    } else if ((c - this.f18607u <= 0.0f || this.f18599m.getCurrentItem() != 0) && abs > ((float) this.f18603q) && abs * 0.5f > abs2 && ((float) this.f18600n.getBottom()) > d) {
                        this.f18604r = true;
                        return false;
                    } else if (abs2 < ((float) (this.f18603q + 100))) {
                        return false;
                    } else {
                        if (c - this.f18605s > 0.0f) {
                            f2 = this.f18605s + ((float) this.f18603q);
                        } else {
                            f2 = this.f18605s - ((float) this.f18603q);
                        }
                        this.f18607u = f2;
                        this.f18608v = d;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14219a(context);
    }
}

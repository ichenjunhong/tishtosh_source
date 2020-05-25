package com.p683ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.common.p920d.C13689i;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator */
public class MusProfileNavigator extends RelativeLayout {

    /* renamed from: a */
    public LinearLayout f102002a;

    /* renamed from: b */
    public View f102003b;

    /* renamed from: c */
    public View f102004c;

    /* renamed from: d */
    boolean f102005d;

    /* renamed from: e */
    C0677p f102006e;

    /* renamed from: f */
    public boolean f102007f = true;

    /* renamed from: g */
    private int f102008g;

    /* renamed from: h */
    private C0997e f102009h;

    /* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator$a */
    public interface C40047a {
        /* renamed from: e */
        void mo82089e(int i);

        /* renamed from: f */
        void mo82090f(int i);
    }

    /* renamed from: a */
    private boolean m89018a() {
        if (this.f102008g == 1) {
            return true;
        }
        return false;
    }

    public int getTabCount() {
        return this.f102002a.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f102002a = (LinearLayout) findViewById(R.id.cwn);
        this.f102004c = findViewById(R.id.el6);
    }

    public void setScrollable(boolean z) {
        this.f102007f = z;
    }

    public MusProfileNavigator(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final View mo82079a(int i) {
        return this.f102002a.getChildAt(i);
    }

    public MusProfileNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusProfileNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo82080a(int i, float f, View view) {
        if (C23729p.m58262a(view)) {
            View a = mo82079a(i);
            View a2 = mo82079a(i + 1);
            if (a != null && a.getVisibility() == 0 && a2 != null && a2.getVisibility() == 0) {
                float x = (a.getX() + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f * (((a2.getX() + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (C23729p.m58262a(a)) {
                view.setX(((getX() + a.getX()) + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }

    /* renamed from: a */
    public final void mo82081a(final ViewPager viewPager, boolean z, boolean z2, final C40047a aVar) {
        int i;
        int i2;
        int i3;
        C13689i.m27652a(viewPager);
        C13689i.m27652a(viewPager.getAdapter());
        this.f102006e = (C0677p) viewPager.getAdapter();
        if (this.f102006e.getCount() > 0) {
            this.f102005d = z2;
            this.f102002a.removeAllViews();
            int count = this.f102006e.getCount();
            if (count == 4) {
                this.f102008g = 1;
            } else {
                this.f102008g = 0;
            }
            this.f102008g = 0;
            for (final int i4 = 0; i4 < count; i4++) {
                if (!z2 || !(this.f102006e instanceof C40320dc)) {
                    i = (int) this.f102006e.mo2310b(i4);
                } else {
                    i = ((C40320dc) this.f102006e).mo82578d(i4);
                }
                if (i != 3) {
                    int i5 = R.string.bwn;
                    if (i != 14) {
                        switch (i) {
                            case 0:
                                Context context = getContext();
                                int i6 = this.f102008g;
                                LinearLayout linearLayout = this.f102002a;
                                if (!m89018a()) {
                                    i3 = R.drawable.dp3;
                                } else {
                                    i3 = R.string.ffw;
                                }
                                MusProfileTabView a = C40051b.m89028a(context, i6, linearLayout, i3);
                                a.setOnClickListener(new OnClickListener() {
                                    public final void onClick(View view) {
                                        ClickInstrumentation.onClick(view);
                                        if (MusProfileNavigator.this.f102007f) {
                                            if (aVar != null) {
                                                aVar.mo82090f(0);
                                            }
                                            viewPager.setCurrentItem(i4);
                                        }
                                    }
                                });
                                a.setBackground(getContext().getResources().getDrawable(R.drawable.dlu));
                                this.f102002a.addView(a);
                                break;
                            case 1:
                                Context context2 = getContext();
                                int i7 = this.f102008g;
                                LinearLayout linearLayout2 = this.f102002a;
                                if (!m89018a()) {
                                    i5 = R.drawable.dp5;
                                }
                                MusProfileTabView a2 = C40051b.m89028a(context2, i7, linearLayout2, i5);
                                a2.setOnClickListener(new OnClickListener() {
                                    public final void onClick(View view) {
                                        ClickInstrumentation.onClick(view);
                                        if (MusProfileNavigator.this.f102007f) {
                                            if (aVar != null) {
                                                aVar.mo82090f(1);
                                            }
                                            viewPager.setCurrentItem(i4);
                                        }
                                    }
                                });
                                a2.setBackground(getContext().getResources().getDrawable(R.drawable.dlu));
                                this.f102002a.addView(a2);
                                break;
                            default:
                                StringBuilder sb = new StringBuilder("unknown aweme list type: ");
                                sb.append(i);
                                throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        Context context3 = getContext();
                        int i8 = this.f102008g;
                        LinearLayout linearLayout3 = this.f102002a;
                        if (!m89018a()) {
                            i5 = R.drawable.dp6;
                        }
                        MusProfileTabView a3 = C40051b.m89028a(context3, i8, linearLayout3, i5);
                        a3.setOnClickListener(new C40050a(this, aVar, viewPager, i4));
                        a3.setBackground(getContext().getResources().getDrawable(R.drawable.dlu));
                        this.f102002a.addView(a3);
                    }
                } else {
                    Context context4 = getContext();
                    int i9 = this.f102008g;
                    LinearLayout linearLayout4 = this.f102002a;
                    if (!m89018a()) {
                        i2 = R.drawable.dny;
                    } else {
                        i2 = R.string.cdj;
                    }
                    MusProfileTabView a4 = C40051b.m89028a(context4, i9, linearLayout4, i2);
                    this.f102003b = a4;
                    a4.setSelected(true);
                    a4.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            if (MusProfileNavigator.this.f102007f) {
                                if (aVar != null) {
                                    aVar.mo82090f(3);
                                }
                                viewPager.setCurrentItem(i4);
                            }
                        }
                    });
                    a4.setBackground(getContext().getResources().getDrawable(R.drawable.dlu));
                    this.f102002a.addView(a4);
                }
            }
            MusProfileTabView musProfileTabView = (MusProfileTabView) mo82079a(0);
            if (musProfileTabView != null) {
                this.f102003b = musProfileTabView;
                musProfileTabView.setSelected(true);
            }
            if (this.f102009h != null) {
                viewPager.removeOnPageChangeListener(this.f102009h);
            }
            this.f102009h = new C0997e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageSelected(int i) {
                    MusProfileNavigator.this.mo82080a(i, 0.0f, MusProfileNavigator.this.f102004c);
                    View childAt = MusProfileNavigator.this.f102002a.getChildAt(i);
                    int i2 = 0;
                    if (MusProfileNavigator.this.f102003b != null) {
                        MusProfileNavigator.this.f102003b.setSelected(false);
                    }
                    if (childAt != null) {
                        childAt.setSelected(true);
                        MusProfileNavigator.this.f102003b = childAt;
                    }
                    if (aVar != null) {
                        C40047a aVar = aVar;
                        MusProfileNavigator musProfileNavigator = MusProfileNavigator.this;
                        if (musProfileNavigator.f102006e != null && musProfileNavigator.f102006e.getCount() > i) {
                            i2 = (!musProfileNavigator.f102005d || !(musProfileNavigator.f102006e instanceof C40320dc)) ? (int) musProfileNavigator.f102006e.mo2310b(i) : ((C40320dc) musProfileNavigator.f102006e).mo82578d(i);
                        }
                        aVar.mo82089e(i2);
                    }
                }

                public final void onPageScrolled(int i, float f, int i2) {
                    MusProfileNavigator.this.mo82080a(i, f, MusProfileNavigator.this.f102004c);
                }
            };
            viewPager.addOnPageChangeListener(this.f102009h);
            final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                            MusProfileNavigator musProfileNavigator = MusProfileNavigator.this;
                            ViewPager viewPager = viewPager;
                            View view = MusProfileNavigator.this.f102004c;
                            if (viewPager != null && view != null) {
                                musProfileNavigator.mo82080a(viewPager.getCurrentItem(), 0.0f, view);
                            }
                        }
                    }
                });
            }
        }
    }
}

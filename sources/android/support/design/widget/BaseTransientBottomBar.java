package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.internal.C0456f;
import android.support.design.p022a.C0389a;
import android.support.design.p029g.C0433a;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.design.widget.SwipeDismissBehavior.C0516a;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1005b;
import android.support.p030v4.view.p041a.C1005b.C1006a;
import android.support.p030v4.view.p041a.C1005b.C1007b;
import android.support.p030v4.view.p041a.C1008c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.ss.android.ugc.trill.R;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f1588a = new Handler(Looper.getMainLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((BaseTransientBottomBar) message.obj).mo1233d();
                    return true;
                case 1:
                    BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                    int i = message.arg1;
                    if (!baseTransientBottomBar.mo1238h() || baseTransientBottomBar.f1592d.getVisibility() != 0) {
                        baseTransientBottomBar.mo1231b(i);
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(new int[]{0, baseTransientBottomBar.mo1236f()});
                        valueAnimator.setInterpolator(C0389a.f1268b);
                        valueAnimator.setDuration(250);
                        valueAnimator.addListener(new AnimatorListenerAdapter(i) {

                            /* renamed from: a */
                            final /* synthetic */ int f1604a;

                            public final void onAnimationEnd(Animator animator) {
                                BaseTransientBottomBar.this.mo1231b(this.f1604a);
                            }

                            public final void onAnimationStart(Animator animator) {
                                BaseTransientBottomBar.this.f1593e.mo1032b(0, NormalGiftView.ALPHA_180);
                            }

                            {
                                this.f1604a = r2;
                            }
                        });
                        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {

                            /* renamed from: b */
                            private int f1607b;

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                if (BaseTransientBottomBar.f1589b) {
                                    C1056u.m3058g(BaseTransientBottomBar.this.f1592d, intValue - this.f1607b);
                                } else {
                                    BaseTransientBottomBar.this.f1592d.setTranslationY((float) intValue);
                                }
                                this.f1607b = intValue;
                            }
                        });
                        valueAnimator.start();
                    }
                    return true;
                default:
                    return false;
            }
        }
    });

    /* renamed from: b */
    public static final boolean f1589b;

    /* renamed from: i */
    private static final int[] f1590i = {R.attr.a2j};

    /* renamed from: c */
    public final Context f1591c;

    /* renamed from: d */
    public final C0488d f1592d;

    /* renamed from: e */
    public final C0433a f1593e;

    /* renamed from: f */
    int f1594f;

    /* renamed from: g */
    public Behavior f1595g;

    /* renamed from: h */
    final C0565a f1596h = new C0565a() {
        /* renamed from: a */
        public final void mo1247a() {
            Handler handler = BaseTransientBottomBar.f1588a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void dismiss(int i) {
            Handler handler = BaseTransientBottomBar.f1588a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* renamed from: j */
    private final ViewGroup f1597j;

    /* renamed from: k */
    private List<Object<B>> f1598k;

    /* renamed from: l */
    private final AccessibilityManager f1599l;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: a */
        final C0485a f1615a = new C0485a(this);

        /* renamed from: a */
        public final boolean mo1254a(View view) {
            return view instanceof C0488d;
        }

        /* renamed from: b */
        public final boolean mo1255b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C0485a aVar = this.f1615a;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.mo1329a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0563o.m1554a().mo1760b(aVar.f1616a);
                            break;
                        }
                        break;
                    case 1:
                        break;
                }
            }
            C0563o.m1554a().mo1761c(aVar.f1616a);
            return super.mo1255b(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$a */
    public static class C0485a {

        /* renamed from: a */
        C0565a f1616a;

        public C0485a(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f1768f = SwipeDismissBehavior.m1381a(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f1769g = SwipeDismissBehavior.m1381a(0.0f, 0.6f, 1.0f);
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$b */
    protected interface C0486b {
        /* renamed from: a */
        void mo1251a(View view);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$c */
    protected interface C0487c {
        /* renamed from: a */
        void mo1253a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$d */
    public static class C0488d extends FrameLayout {

        /* renamed from: a */
        private final AccessibilityManager f1617a;

        /* renamed from: b */
        private final C1006a f1618b;

        /* renamed from: c */
        private C0487c f1619c;

        /* renamed from: d */
        private C0486b f1620d;

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C1056u.m3072r(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f1620d != null) {
                this.f1620d.mo1251a(this);
            }
            C1005b.m2883a(this.f1617a, this.f1618b);
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(C0486b bVar) {
            this.f1620d = bVar;
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(C0487c cVar) {
            this.f1619c = cVar;
        }

        protected C0488d(Context context) {
            this(context, null);
        }

        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        protected C0488d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.k_, R.attr.tr});
            if (obtainStyledAttributes.hasValue(1)) {
                C1056u.m3048c((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            this.f1617a = (AccessibilityManager) context.getSystemService("accessibility");
            this.f1618b = new C1006a() {
                /* renamed from: a */
                public final void mo1262a(boolean z) {
                    C0488d.this.setClickableOrFocusableBasedOnAccessibility(z);
                }
            };
            AccessibilityManager accessibilityManager = this.f1617a;
            C1006a aVar = this.f1618b;
            if (VERSION.SDK_INT >= 19 && aVar != null) {
                accessibilityManager.addTouchExplorationStateChangeListener(new C1007b(aVar));
            }
            setClickableOrFocusableBasedOnAccessibility(this.f1617a.isTouchExplorationEnabled());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f1619c != null) {
                this.f1619c.mo1253a(this, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public int mo1228a() {
        return this.f1594f;
    }

    public void dismiss() {
        mo1229a(3);
    }

    /* renamed from: c */
    public boolean mo1232c() {
        return C0563o.m1554a().mo1762d(this.f1596h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo1236f() {
        int height = this.f1592d.getHeight();
        LayoutParams layoutParams = this.f1592d.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            return height + ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo1237g() {
        C0563o.m1554a().mo1756a(this.f1596h);
        if (this.f1598k != null) {
            for (int size = this.f1598k.size() - 1; size >= 0; size--) {
                this.f1598k.get(size);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo1238h() {
        List enabledAccessibilityServiceList = this.f1599l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 16 || VERSION.SDK_INT > 19) {
            z = false;
        } else {
            z = true;
        }
        f1589b = z;
    }

    /* renamed from: b */
    public void mo1230b() {
        C0563o a = C0563o.m1554a();
        int a2 = mo1228a();
        C0565a aVar = this.f1596h;
        synchronized (a.f2046a) {
            if (a.mo1765f(aVar)) {
                a.f2048c.f2052b = a2;
                a.f2047b.removeCallbacksAndMessages(a.f2048c);
                a.mo1757a(a.f2048c);
                return;
            }
            if (a.mo1766g(aVar)) {
                a.f2049d.f2052b = a2;
            } else {
                a.f2049d = new C0566b(a2, aVar);
            }
            if (a.f2048c == null || !a.mo1758a(a.f2048c, 4)) {
                a.f2048c = null;
                a.mo1759b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1233d() {
        Behavior behavior;
        if (this.f1592d.getParent() == null) {
            LayoutParams layoutParams = this.f1592d.getLayoutParams();
            if (layoutParams instanceof C0505d) {
                C0505d dVar = (C0505d) layoutParams;
                if (this.f1595g == null) {
                    behavior = new Behavior();
                } else {
                    behavior = this.f1595g;
                }
                if (behavior instanceof Behavior) {
                    behavior.f1615a.f1616a = this.f1596h;
                }
                behavior.f1765c = new C0516a() {
                    /* renamed from: a */
                    public final void mo1250a(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.mo1229a(0);
                    }

                    /* renamed from: a */
                    public final void mo1249a(int i) {
                        switch (i) {
                            case 0:
                                C0563o.m1554a().mo1761c(BaseTransientBottomBar.this.f1596h);
                                break;
                            case 1:
                            case 2:
                                C0563o.m1554a().mo1760b(BaseTransientBottomBar.this.f1596h);
                                return;
                        }
                    }
                };
                dVar.mo1383a((android.support.design.widget.CoordinatorLayout.Behavior) behavior);
                dVar.f1699g = 80;
            }
            this.f1597j.addView(this.f1592d);
        }
        this.f1592d.setOnAttachStateChangeListener(new C0486b() {
            /* renamed from: a */
            public final void mo1251a(View view) {
                if (C0563o.m1554a().mo1764e(BaseTransientBottomBar.this.f1596h)) {
                    BaseTransientBottomBar.f1588a.post(new Runnable() {
                        public final void run() {
                            BaseTransientBottomBar.this.mo1231b(3);
                        }
                    });
                }
            }
        });
        if (!C1056u.m3079y(this.f1592d)) {
            this.f1592d.setOnLayoutChangeListener(new C0487c() {
                /* renamed from: a */
                public final void mo1253a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.f1592d.setOnLayoutChangeListener(null);
                    if (BaseTransientBottomBar.this.mo1238h()) {
                        BaseTransientBottomBar.this.mo1235e();
                    } else {
                        BaseTransientBottomBar.this.mo1237g();
                    }
                }
            });
        } else if (mo1238h()) {
            mo1235e();
        } else {
            mo1237g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo1235e() {
        final int f = mo1236f();
        if (f1589b) {
            C1056u.m3058g(this.f1592d, f);
        } else {
            this.f1592d.setTranslationY((float) f);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{f, 0});
        valueAnimator.setInterpolator(C0389a.f1268b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.mo1237g();
            }

            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.f1593e.mo1031a(70, NormalGiftView.ALPHA_180);
            }
        });
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {

            /* renamed from: c */
            private int f1603c = f;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.f1589b) {
                    C1056u.m3058g(BaseTransientBottomBar.this.f1592d, intValue - this.f1603c);
                } else {
                    BaseTransientBottomBar.this.f1592d.setTranslationY((float) intValue);
                }
                this.f1603c = intValue;
            }
        });
        valueAnimator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1229a(int i) {
        C0563o.m1554a().dismiss(this.f1596h, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1231b(int i) {
        C0563o a = C0563o.m1554a();
        C0565a aVar = this.f1596h;
        synchronized (a.f2046a) {
            if (a.mo1765f(aVar)) {
                a.f2048c = null;
                if (a.f2049d != null) {
                    a.mo1759b();
                }
            }
        }
        if (this.f1598k != null) {
            for (int size = this.f1598k.size() - 1; size >= 0; size--) {
                this.f1598k.get(size);
            }
        }
        ViewParent parent = this.f1592d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1592d);
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C0433a aVar) {
        boolean z;
        int i;
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f1597j = viewGroup;
            this.f1593e = aVar;
            this.f1591c = viewGroup.getContext();
            C0456f.m1108a(this.f1591c);
            LayoutInflater from = LayoutInflater.from(this.f1591c);
            TypedArray obtainStyledAttributes = this.f1591c.obtainStyledAttributes(f1590i);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = R.layout.aad;
            } else {
                i = R.layout.j2;
            }
            this.f1592d = (C0488d) from.inflate(i, this.f1597j, false);
            this.f1592d.addView(view);
            C1056u.m3054e(this.f1592d, 1);
            C1056u.m3043b((View) this.f1592d, 1);
            C1056u.m3045b((View) this.f1592d, true);
            C1056u.m3032a((View) this.f1592d, (C1051p) new C1051p() {
                /* renamed from: a */
                public final C1018ac mo1130a(View view, C1018ac acVar) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), acVar.mo3188d());
                    return acVar;
                }
            });
            C1056u.m3031a((View) this.f1592d, (C1002a) new C1002a() {
                /* renamed from: a */
                public final void mo1119a(View view, C1008c cVar) {
                    super.mo1119a(view, cVar);
                    cVar.mo3130a(1048576);
                    cVar.mo3166k(true);
                }

                /* renamed from: a */
                public final boolean mo1246a(View view, int i, Bundle bundle) {
                    if (i != 1048576) {
                        return super.mo1246a(view, i, bundle);
                    }
                    BaseTransientBottomBar.this.dismiss();
                    return true;
                }
            });
            this.f1599l = (AccessibilityManager) this.f1591c.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }
}

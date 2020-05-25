package com.bytedance.android.livesdk.p421v;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.support.p030v4.widget.C1112l;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.android.livesdk.p421v.C8368a;

/* renamed from: com.bytedance.android.livesdk.v.a */
public abstract class C8368a<T extends C8368a> implements OnDismissListener {

    /* renamed from: A */
    private int f22759A;

    /* renamed from: B */
    private int f22760B = 1;

    /* renamed from: a */
    public PopupWindow f22761a;

    /* renamed from: b */
    public int f22762b = -2;

    /* renamed from: c */
    public int f22763c = -2;

    /* renamed from: d */
    public View f22764d;

    /* renamed from: e */
    public int f22765e = 2;

    /* renamed from: f */
    public int f22766f = 1;

    /* renamed from: g */
    public int f22767g;

    /* renamed from: h */
    public int f22768h;

    /* renamed from: i */
    public boolean f22769i;

    /* renamed from: j */
    public boolean f22770j;

    /* renamed from: k */
    public boolean f22771k;

    /* renamed from: l */
    public C8372a f22772l;

    /* renamed from: m */
    private Context f22773m;

    /* renamed from: n */
    private View f22774n;

    /* renamed from: o */
    private int f22775o;

    /* renamed from: p */
    private boolean f22776p = true;

    /* renamed from: q */
    private boolean f22777q = true;

    /* renamed from: r */
    private int f22778r;

    /* renamed from: s */
    private OnDismissListener f22779s;

    /* renamed from: t */
    private boolean f22780t;

    /* renamed from: u */
    private float f22781u = 0.7f;

    /* renamed from: v */
    private int f22782v = -16777216;

    /* renamed from: w */
    private ViewGroup f22783w;

    /* renamed from: x */
    private Transition f22784x;

    /* renamed from: y */
    private Transition f22785y;

    /* renamed from: z */
    private boolean f22786z = true;

    /* renamed from: com.bytedance.android.livesdk.v.a$a */
    public interface C8372a {
    }

    /* renamed from: f */
    private T m16580f() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14567a(View view, T t);

    /* renamed from: d */
    public final View mo14574d() {
        if (this.f22761a != null) {
            return this.f22761a.getContentView();
        }
        return null;
    }

    public void dismiss() {
        if (this.f22761a != null) {
            C8373b.m16597a(this.f22761a);
        }
    }

    /* renamed from: e */
    public final boolean mo14577e() {
        if (this.f22761a == null || !this.f22761a.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo14570b() {
        mo14574d().getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT >= 16) {
                    C8368a.this.mo14574d().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    C8368a.this.mo14574d().getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                C8368a.this.f22762b = C8368a.this.mo14574d().getWidth();
                C8368a.this.f22763c = C8368a.this.mo14574d().getHeight();
                C8368a.this.f22770j = true;
                C8368a.this.f22769i = false;
                if (C8368a.this.f22772l != null) {
                    if (C8368a.this.f22764d != null) {
                        C8368a.this.f22764d.getWidth();
                    }
                    if (C8368a.this.f22764d != null) {
                        C8368a.this.f22764d.getHeight();
                    }
                }
                if (C8368a.this.mo14577e() && C8368a.this.f22771k) {
                    C8368a aVar = C8368a.this;
                    int i = C8368a.this.f22762b;
                    int i2 = C8368a.this.f22763c;
                    View view = C8368a.this.f22764d;
                    int i3 = C8368a.this.f22765e;
                    int i4 = C8368a.this.f22766f;
                    int i5 = C8368a.this.f22767g;
                    int i6 = C8368a.this.f22768h;
                    if (aVar.f22761a != null) {
                        aVar.f22761a.update(view, C8368a.m16579b(view, i4, i, i5), C8368a.m16576a(view, i3, i2, i6), i, i2);
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public void mo14573c() {
        if (VERSION.SDK_INT >= 18 && this.f22780t) {
            if (this.f22783w != null) {
                m16578a(this.f22783w);
                return;
            }
            if (!(mo14574d() == null || mo14574d().getContext() == null || !(mo14574d().getContext() instanceof Activity))) {
                m16577a((Activity) mo14574d().getContext());
            }
        }
    }

    public void onDismiss() {
        if (this.f22779s != null) {
            this.f22779s.onDismiss();
        }
        if (VERSION.SDK_INT >= 18 && this.f22780t) {
            if (this.f22783w != null) {
                this.f22783w.getOverlay().clear();
            } else if (mo14574d() != null) {
                Activity activity = (Activity) mo14574d().getContext();
                if (activity != null) {
                    ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
                }
            }
        }
        if (this.f22761a != null && this.f22761a.isShowing()) {
            C8373b.m16597a(this.f22761a);
        }
    }

    /* renamed from: a */
    public final T mo14561a() {
        if (this.f22761a == null) {
            this.f22761a = new PopupWindow();
        }
        if (this.f22774n == null) {
            if (this.f22775o == 0 || this.f22773m == null) {
                StringBuilder sb = new StringBuilder("The content view is null,the layoutId=");
                sb.append(this.f22775o);
                sb.append(",appContext=");
                sb.append(this.f22773m);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f22774n = LayoutInflater.from(this.f22773m).inflate(this.f22775o, null);
        }
        this.f22761a.setContentView(this.f22774n);
        if (this.f22762b > 0 || this.f22762b == -2 || this.f22762b == -1) {
            this.f22761a.setWidth(this.f22762b);
        } else {
            this.f22761a.setWidth(-2);
        }
        if (this.f22763c > 0 || this.f22763c == -2 || this.f22763c == -1) {
            this.f22761a.setHeight(this.f22763c);
        } else {
            this.f22761a.setHeight(-2);
        }
        View d = mo14574d();
        if (this.f22762b <= 0 || this.f22763c <= 0) {
            d.measure(0, 0);
            if (this.f22762b <= 0) {
                this.f22762b = d.getMeasuredWidth();
            }
            if (this.f22763c <= 0) {
                this.f22763c = d.getMeasuredHeight();
            }
        }
        mo14570b();
        this.f22761a.setInputMethodMode(this.f22759A);
        this.f22761a.setSoftInputMode(this.f22760B);
        mo14567a(this.f22774n, m16580f());
        if (this.f22778r != 0) {
            this.f22761a.setAnimationStyle(this.f22778r);
        }
        if (!this.f22786z) {
            this.f22761a.setFocusable(true);
            this.f22761a.setOutsideTouchable(false);
            this.f22761a.setBackgroundDrawable(null);
            this.f22761a.getContentView().setFocusable(true);
            this.f22761a.getContentView().setFocusableInTouchMode(true);
            this.f22761a.getContentView().setOnKeyListener(new OnKeyListener() {
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    C8368a.this.f22761a.dismiss();
                    return true;
                }
            });
            this.f22761a.setTouchInterceptor(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if ((motionEvent.getAction() != 0 || (x >= 0 && x < C8368a.this.f22762b && y >= 0 && y < C8368a.this.f22763c)) && motionEvent.getAction() != 4) {
                        return false;
                    }
                    return true;
                }
            });
        } else {
            this.f22761a.setFocusable(this.f22776p);
            this.f22761a.setOutsideTouchable(this.f22777q);
            this.f22761a.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.f22761a.setOnDismissListener(this);
        if (VERSION.SDK_INT >= 23) {
            if (this.f22784x != null) {
                this.f22761a.setEnterTransition(this.f22784x);
            }
            if (this.f22785y != null) {
                this.f22761a.setExitTransition(this.f22785y);
            }
        }
        return m16580f();
    }

    /* renamed from: a */
    public final T mo14563a(Context context) {
        this.f22773m = context;
        return m16580f();
    }

    /* renamed from: b */
    public final T mo14568b(int i) {
        this.f22762b = i;
        return m16580f();
    }

    /* renamed from: c */
    public final T mo14571c(int i) {
        this.f22763c = i;
        return m16580f();
    }

    /* renamed from: a */
    public final T mo14562a(int i) {
        this.f22774n = null;
        this.f22775o = i;
        return m16580f();
    }

    /* renamed from: b */
    public final T mo14569b(boolean z) {
        this.f22777q = false;
        return m16580f();
    }

    /* renamed from: c */
    public final T mo14572c(boolean z) {
        this.f22786z = true;
        return m16580f();
    }

    /* renamed from: a */
    public final T mo14564a(View view) {
        this.f22774n = view;
        this.f22775o = 0;
        return m16580f();
    }

    /* renamed from: d */
    public void mo14575d(boolean z) {
        if (this.f22771k != z) {
            this.f22771k = z;
        }
        if (this.f22761a == null) {
            mo14561a();
        }
    }

    /* renamed from: a */
    private void m16577a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.f22782v);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f22781u * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* renamed from: a */
    private void m16578a(ViewGroup viewGroup) {
        ColorDrawable colorDrawable = new ColorDrawable(this.f22782v);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f22781u * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* renamed from: a */
    public final T mo14565a(boolean z) {
        this.f22776p = false;
        return m16580f();
    }

    /* renamed from: a */
    static int m16576a(View view, int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i3 - ((view.getHeight() / 2) + (i2 / 2));
            case 1:
                return i3 - (i2 + view.getHeight());
            case 3:
                return i3 - view.getHeight();
            case 4:
                return i3 - i2;
            default:
                return i3;
        }
    }

    /* renamed from: b */
    static int m16579b(View view, int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i3 + ((view.getWidth() / 2) - (i2 / 2));
            case 1:
                return i3 - i2;
            case 2:
                return i3 + view.getWidth();
            case 4:
                return i3 - (i2 - view.getWidth());
            default:
                return i3;
        }
    }

    /* renamed from: a */
    public final void mo14566a(View view, int i, int i2, int i3, int i4) {
        if (this.f22773m != null) {
            if (!(this.f22773m instanceof Activity) || !((Activity) this.f22773m).isFinishing()) {
                mo14575d(true);
                this.f22764d = view;
                this.f22767g = i3;
                this.f22768h = i4;
                this.f22765e = 1;
                this.f22766f = i2;
                mo14573c();
                int b = m16579b(view, i2, this.f22762b, this.f22767g);
                int a = m16576a(view, 1, this.f22763c, this.f22768h);
                if (this.f22769i) {
                    mo14570b();
                }
                C1112l.m3247a(this.f22761a, view, b, a, 0);
            }
        }
    }
}

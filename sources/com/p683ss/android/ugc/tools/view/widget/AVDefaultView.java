package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.tools.view.p2511d.C50223a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVDefaultView */
public class AVDefaultView extends ScrollView implements C50223a, C50288l {

    /* renamed from: A */
    private boolean f125890A;

    /* renamed from: a */
    private C50273c f125891a;

    /* renamed from: b */
    private int f125892b;

    /* renamed from: c */
    private int f125893c;

    /* renamed from: d */
    private LinearLayout f125894d;

    /* renamed from: e */
    private ImageView f125895e;

    /* renamed from: f */
    private AVTextView f125896f;

    /* renamed from: g */
    private AVTextView f125897g;

    /* renamed from: h */
    private View f125898h;

    /* renamed from: i */
    private AVTextView f125899i;

    /* renamed from: j */
    private int f125900j;

    /* renamed from: k */
    private int f125901k;

    /* renamed from: l */
    private int f125902l;

    /* renamed from: m */
    private int f125903m;

    /* renamed from: n */
    private int f125904n;

    /* renamed from: o */
    private int f125905o;

    /* renamed from: p */
    private int f125906p;

    /* renamed from: q */
    private int f125907q;

    /* renamed from: r */
    private int f125908r;

    /* renamed from: s */
    private int f125909s;

    /* renamed from: t */
    private boolean f125910t;

    /* renamed from: u */
    private boolean f125911u;

    /* renamed from: v */
    private OnClickListener f125912v;

    /* renamed from: w */
    private int f125913w;

    /* renamed from: x */
    private boolean f125914x;

    /* renamed from: y */
    private int f125915y;

    /* renamed from: z */
    private int f125916z;

    /* renamed from: b */
    private void m108439b() {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f125892b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    /* renamed from: d */
    private void m108441d() {
        if (C1056u.m3055f(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f125894d.setLayoutDirection(1);
        }
    }

    /* renamed from: f */
    private void m108443f() {
        this.f125897g = (AVTextView) findViewById(R.id.d98);
        if (this.f125891a.f126134l) {
            this.f125897g.setText(this.f125891a.f126125c);
        }
    }

    /* renamed from: e */
    private void m108442e() {
        this.f125896f = (AVTextView) findViewById(R.id.dhb);
        if (this.f125891a.f126133k) {
            this.f125896f.setText(this.f125891a.f126124b);
        }
        if (this.f125891a.f126135m) {
            this.f125898h = m108434a(this.f125891a, this.f125894d);
        }
        m108443f();
    }

    /* renamed from: c */
    private void m108440c() {
        m108439b();
        removeAllViews();
        setScrollY(0);
        if (this.f125914x) {
            this.f125892b = C43303dy.m94967a(getContext()) - this.f125916z;
        }
        if (this.f125891a == null || this.f125892b < this.f125900j) {
            this.f125911u = false;
            return;
        }
        if (this.f125891a.f126132j) {
            LayoutInflater.from(getContext()).inflate(R.layout.bv6, this, true);
            this.f125894d = (LinearLayout) findViewById(R.id.b8q);
            this.f125895e = (ImageView) findViewById(R.id.b0d);
            this.f125895e.setImageDrawable(this.f125891a.f126123a);
            m108442e();
            if (this.f125891a.f126137o) {
                this.f125899i = m108438b(this.f125891a, this.f125894d);
            }
            m108437a(this.f125894d);
        } else if (this.f125891a.f126133k) {
            LayoutInflater.from(getContext()).inflate(R.layout.bv5, this, true);
            this.f125894d = (LinearLayout) findViewById(R.id.b8q);
            m108442e();
            m108437a(this.f125894d);
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.bv2, this, true);
            this.f125894d = (LinearLayout) findViewById(R.id.b8q);
            m108443f();
            m108437a(this.f125894d);
        }
        if (this.f125912v != null) {
            this.f125894d.setOnClickListener(this.f125912v);
        }
        this.f125910t = true;
        m108445h();
        if (this.f125890A) {
            this.f125894d.setVisibility(4);
        }
        m108441d();
        m108444g();
    }

    /* renamed from: g */
    private void m108444g() {
        m108439b();
        this.f125911u = false;
        if (this.f125914x) {
            this.f125892b = C43303dy.m94967a(getContext()) - this.f125916z;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f125915y = iArr[1];
        }
        if (this.f125891a == null || this.f125892b < this.f125900j) {
            this.f125911u = true;
            return;
        }
        if (this.f125891a.f126132j) {
            int i = (int) ((((float) this.f125892b) * 0.2f) + 0.5f);
            if (this.f125914x) {
                i -= this.f125915y;
            }
            m108436a((View) this.f125895e, i);
            if (this.f125891a.f126135m) {
                if (this.f125891a.f126137o) {
                    m108436a(this.f125898h, this.f125907q);
                } else {
                    int a = (((((((this.f125892b - i) - this.f125909s) - this.f125901k) - m108433a((TextView) this.f125896f)) - this.f125902l) - m108433a((TextView) this.f125897g)) - this.f125904n) - this.f125903m;
                    if (this.f125914x) {
                        a -= this.f125915y;
                    }
                    setButtonMargin(a);
                }
            }
        } else if (this.f125891a.f126133k) {
            int i2 = (int) ((((float) this.f125892b) * 0.3f) + 0.5f);
            if (this.f125914x) {
                i2 -= this.f125915y;
            }
            m108436a((View) this.f125896f, i2);
            if (this.f125891a.f126135m) {
                int a2 = (((((this.f125892b - i2) - m108433a((TextView) this.f125896f)) - this.f125902l) - m108433a((TextView) this.f125897g)) - this.f125904n) - this.f125903m;
                if (this.f125914x) {
                    a2 -= this.f125915y;
                }
                setButtonMargin(a2);
            }
        } else {
            int i3 = (int) ((((float) this.f125892b) * 0.3f) + 0.5f);
            if (this.f125914x) {
                i3 -= this.f125915y;
            }
            m108436a((View) this.f125897g, i3);
        }
        this.f125897g.requestLayout();
        if (this.f125915y != 0 && this.f125890A) {
            this.f125894d.setVisibility(0);
        }
        this.f125911u = true;
    }

    /* renamed from: h */
    private void m108445h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f125894d != null && this.f125891a != null) {
            Resources resources = getResources();
            if (this.f125896f != null) {
                AVTextView aVTextView = this.f125896f;
                if (this.f125913w == 0) {
                    i6 = resources.getColor(R.color.b2c);
                } else {
                    i6 = resources.getColor(R.color.b2b);
                }
                aVTextView.setTextColor(i6);
            }
            if (this.f125897g != null) {
                AVTextView aVTextView2 = this.f125897g;
                if (this.f125913w == 0) {
                    i5 = R.color.b2g;
                } else {
                    i5 = R.color.b2f;
                }
                aVTextView2.setTextColor(resources.getColor(i5));
            }
            if (this.f125898h != null) {
                if (this.f125898h instanceof AVIconButton) {
                    ((AVIconButton) this.f125898h).mo97996a(this.f125913w);
                    return;
                }
                AVTextView aVTextView3 = (AVTextView) this.f125898h;
                if (this.f125891a.f126126d == C50285i.SOLID) {
                    if (this.f125913w == 0) {
                        i3 = R.drawable.dyd;
                    } else {
                        i3 = R.drawable.dyc;
                    }
                    aVTextView3.setBackgroundResource(i3);
                    if (this.f125913w == 0) {
                        i4 = R.color.b29;
                    } else {
                        i4 = R.color.b28;
                    }
                    aVTextView3.setTextColor(resources.getColor(i4));
                    return;
                }
                if (this.f125913w == 0) {
                    i = R.drawable.dyb;
                } else {
                    i = R.drawable.dya;
                }
                aVTextView3.setBackgroundResource(i);
                if (this.f125913w == 0) {
                    i2 = resources.getColor(R.color.b2c);
                } else {
                    i2 = resources.getColor(R.color.b2b);
                }
                aVTextView3.setTextColor(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo98077a() {
        if (this.f125891a != null) {
            if (this.f125910t) {
                m108444g();
                return;
            }
            m108440c();
        }
    }

    public void setSupportDelayVisible(boolean z) {
        this.f125890A = z;
    }

    public AVDefaultView(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f125912v = onClickListener;
        if (this.f125894d != null) {
            this.f125894d.setOnClickListener(this.f125912v);
        }
    }

    public void setUseScreenHeight(int i) {
        this.f125914x = true;
        this.f125916z = i;
        mo98077a();
    }

    /* renamed from: a */
    private int m108433a(TextView textView) {
        textView.measure(MeasureSpec.makeMeasureSpec(this.f125893c - (this.f125908r * 2), DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    /* renamed from: a */
    private AVTextView m108435a(C50273c cVar) {
        if (!cVar.f126135m) {
            return null;
        }
        if (cVar.f126126d == C50285i.SOLID) {
            return new AVTextView(new ContextThemeWrapper(getContext(), R.style.a8g));
        }
        return new AVTextView(new ContextThemeWrapper(getContext(), R.style.a8f));
    }

    private void setButtonMargin(int i) {
        if (i >= this.f125903m) {
            int i2 = (int) ((((float) this.f125892b) * 0.2f) + 0.5f);
            if (i2 < this.f125903m) {
                m108436a(this.f125898h, i);
                return;
            }
            int i3 = i - (i2 - this.f125903m);
            if (i3 > this.f125903m) {
                m108436a(this.f125898h, i3);
                return;
            }
        }
        m108436a(this.f125898h, this.f125903m);
    }

    /* renamed from: a */
    private void m108437a(LinearLayout linearLayout) {
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f125903m));
    }

    public void setStatus(C50273c cVar) {
        if (cVar != null) {
            this.f125891a = cVar;
            if (!this.f125891a.f126135m || (this.f125891a.f126133k && this.f125891a.f126134l)) {
                if (this.f125891a.f126137o) {
                    if (TextUtils.isEmpty(this.f125891a.f126130h)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f125891a.f126132j || !this.f125891a.f126133k || !this.f125891a.f126134l || !this.f125891a.f126135m) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f125891a.f126133k) {
                    if (TextUtils.isEmpty(this.f125891a.f126124b)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    } else if (!this.f125891a.f126134l) {
                        throw new IllegalArgumentException("title text must have a description!");
                    }
                } else if (this.f125891a.f126134l) {
                    if (TextUtils.isEmpty(this.f125891a.f126125c)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f125891a.f126132j) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.f125910t = false;
                this.f125911u = false;
                if (this.f125892b > 0) {
                    m108440c();
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    /* renamed from: a */
    public final void mo97996a(int i) {
        if (this.f125913w != i) {
            this.f125913w = i;
            m108445h();
        }
    }

    public AVDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static void m108436a(View view, int i) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i;
    }

    /* renamed from: b */
    private AVTextView m108438b(C50273c cVar, LinearLayout linearLayout) {
        AVTextView aVTextView = new AVTextView(new ContextThemeWrapper(getContext(), R.style.a8i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f125906p;
        linearLayout.addView(aVTextView, layoutParams);
        aVTextView.setText(cVar.f126130h);
        aVTextView.setOnClickListener(this.f125891a.f126131i);
        return aVTextView;
    }

    /* renamed from: a */
    private View m108434a(C50273c cVar, LinearLayout linearLayout) {
        if (cVar.f126136n) {
            AVIconButton aVIconButton = new AVIconButton(getContext());
            aVIconButton.mo98089a(cVar.f126126d, cVar.f126127e, cVar.f126128f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f125905o, this.f125904n);
            layoutParams.gravity = 1;
            linearLayout.addView(aVIconButton, layoutParams);
            aVIconButton.setOnClickListener(this.f125891a.f126129g);
            return aVIconButton;
        }
        AVTextView a = m108435a(cVar);
        if (a == null) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f125905o, this.f125904n);
        layoutParams2.gravity = 1;
        linearLayout.addView(a, layoutParams2);
        a.setText(cVar.f126128f);
        a.setOnClickListener(cVar.f126129g);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AVDefaultView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.bn r5 = r5.mo58564B()
            int r5 = r5.mo74262a()
            r4.f125913w = r5
            r4.m108439b()
            if (r6 == 0) goto L_0x0098
            android.content.Context r5 = r4.getContext()
            r7 = 6
            int[] r7 = new int[r7]
            r7 = {2131361896, 2131361897, 2131361898, 2131361899, 2131361900, 2131361901} // fill-array
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r7)
            if (r6 == 0) goto L_0x0098
            com.ss.android.ugc.tools.view.widget.c r7 = new com.ss.android.ugc.tools.view.widget.c
            r7.<init>()
            r0 = 4
            boolean r1 = r6.hasValue(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0044
            android.content.res.Resources r5 = r5.getResources()
            int r0 = r6.getResourceId(r0, r2)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r0)
            r7.f126123a = r5
            r7.f126132j = r3
        L_0x0044:
            boolean r5 = r6.hasValue(r3)
            if (r5 == 0) goto L_0x0052
            java.lang.String r5 = r6.getString(r3)
            r7.f126128f = r5
            r7.f126135m = r3
        L_0x0052:
            boolean r5 = r6.hasValue(r2)
            if (r5 == 0) goto L_0x0067
            int r5 = r6.getInt(r2, r3)
            if (r5 != r3) goto L_0x0061
            com.ss.android.ugc.tools.view.widget.i r5 = com.p683ss.android.ugc.tools.view.widget.C50285i.SOLID
            goto L_0x0063
        L_0x0061:
            com.ss.android.ugc.tools.view.widget.i r5 = com.p683ss.android.ugc.tools.view.widget.C50285i.BORDER
        L_0x0063:
            r7.f126126d = r5
            r7.f126135m = r3
        L_0x0067:
            r5 = 5
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x0076
            java.lang.String r5 = r6.getString(r5)
            r7.f126124b = r5
            r7.f126133k = r3
        L_0x0076:
            r5 = 2
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x0085
            java.lang.String r5 = r6.getString(r5)
            r7.f126125c = r5
            r7.f126134l = r3
        L_0x0085:
            r5 = 3
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x0094
            java.lang.String r5 = r6.getString(r5)
            r7.f126130h = r5
            r7.f126137o = r3
        L_0x0094:
            r6.recycle()
            goto L_0x0099
        L_0x0098:
            r7 = 0
        L_0x0099:
            android.content.Context r5 = r4.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131886206(0x7f12007e, float:1.9406984E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125900j = r6
            r6 = 2131886209(0x7f120081, float:1.940699E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125901k = r6
            r6 = 2131886201(0x7f120079, float:1.9406974E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125902l = r6
            r6 = 2131886207(0x7f12007f, float:1.9406986E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125903m = r6
            r6 = 2131886200(0x7f120078, float:1.9406972E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125905o = r6
            r6 = 2131886198(0x7f120076, float:1.9406968E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125904n = r6
            r6 = 2131886202(0x7f12007a, float:1.9406976E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125906p = r6
            r6 = 2131886199(0x7f120077, float:1.940697E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125907q = r6
            r6 = 2131886210(0x7f120082, float:1.9406992E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f125908r = r6
            r6 = 2131886203(0x7f12007b, float:1.9406978E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.f125909s = r5
            if (r7 == 0) goto L_0x0114
            boolean r5 = r7.f126132j
            if (r5 != 0) goto L_0x0111
            boolean r5 = r7.f126135m
            if (r5 != 0) goto L_0x0111
            boolean r5 = r7.f126133k
            if (r5 != 0) goto L_0x0111
            boolean r5 = r7.f126134l
            if (r5 != 0) goto L_0x0111
            boolean r5 = r7.f126137o
            if (r5 == 0) goto L_0x0114
        L_0x0111:
            r4.setStatus(r7)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.tools.view.widget.AVDefaultView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(this.f125892b == i2 && this.f125893c == i)) {
            this.f125893c = i;
            this.f125892b = i2;
            if (this.f125894d == null) {
                mo98077a();
                return;
            }
            this.f125894d.post(new Runnable() {
                public final void run() {
                    AVDefaultView.this.mo98077a();
                }
            });
        }
    }
}

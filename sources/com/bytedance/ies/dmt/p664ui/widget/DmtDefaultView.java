package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1115o;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
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
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.p669e.C10704b;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtDefaultView */
public class DmtDefaultView extends ScrollView implements C10682e, C10725e, C10726f {

    /* renamed from: A */
    private boolean f28606A;

    /* renamed from: a */
    private C10722c f28607a;

    /* renamed from: b */
    private int f28608b;

    /* renamed from: c */
    private int f28609c;

    /* renamed from: d */
    private LinearLayout f28610d;

    /* renamed from: e */
    private ImageView f28611e;

    /* renamed from: f */
    private DmtTextView f28612f;

    /* renamed from: g */
    private DmtTextView f28613g;

    /* renamed from: h */
    private View f28614h;

    /* renamed from: i */
    private DmtTextView f28615i;

    /* renamed from: j */
    private int f28616j;

    /* renamed from: k */
    private int f28617k;

    /* renamed from: l */
    private int f28618l;

    /* renamed from: m */
    private int f28619m;

    /* renamed from: n */
    private int f28620n;

    /* renamed from: o */
    private int f28621o;

    /* renamed from: p */
    private int f28622p;

    /* renamed from: q */
    private int f28623q;

    /* renamed from: r */
    private int f28624r;

    /* renamed from: s */
    private int f28625s;

    /* renamed from: t */
    private boolean f28626t;

    /* renamed from: u */
    private boolean f28627u;

    /* renamed from: v */
    private OnClickListener f28628v;

    /* renamed from: w */
    private int f28629w;

    /* renamed from: x */
    private boolean f28630x;

    /* renamed from: y */
    private int f28631y;

    /* renamed from: z */
    private int f28632z;

    /* renamed from: b */
    private void m21640b() {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f28608b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    /* renamed from: d */
    private void m21642d() {
        if (C1056u.m3055f(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f28610d.setLayoutDirection(1);
        }
    }

    /* renamed from: e */
    private void m21643e() {
        this.f28612f = (DmtTextView) findViewById(R.id.dhb);
        if (this.f28607a.f28703k) {
            this.f28612f.setText(this.f28607a.f28694b);
        }
        if (this.f28607a.f28706n) {
            C1115o.m3256a((TextView) this.f28612f, (int) R.style.tf);
        }
        if (this.f28607a.f28707o) {
            this.f28614h = m21635a(this.f28607a, this.f28610d);
        }
        m21644f();
    }

    /* renamed from: f */
    private void m21644f() {
        this.f28613g = (DmtTextView) findViewById(R.id.d98);
        if (this.f28607a.f28704l) {
            this.f28613g.setText(this.f28607a.f28695c);
            if (this.f28607a.f28705m) {
                this.f28613g.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* renamed from: c */
    private void m21641c() {
        m21640b();
        removeAllViews();
        setScrollY(0);
        if (this.f28630x) {
            this.f28608b = C10704b.m21578b(getContext()) - this.f28632z;
        }
        if (this.f28607a == null || this.f28608b < this.f28616j) {
            this.f28627u = false;
            return;
        }
        if (this.f28607a.f28702j) {
            LayoutInflater.from(getContext()).inflate(R.layout.a2i, this, true);
            this.f28610d = (LinearLayout) findViewById(R.id.b8q);
            this.f28611e = (ImageView) findViewById(R.id.b0d);
            this.f28611e.setImageDrawable(this.f28607a.f28693a);
            m21643e();
            if (this.f28607a.f28709q) {
                this.f28615i = m21639b(this.f28607a, this.f28610d);
            }
            m21638a(this.f28610d);
        } else if (this.f28607a.f28703k) {
            LayoutInflater.from(getContext()).inflate(R.layout.a2h, this, true);
            this.f28610d = (LinearLayout) findViewById(R.id.b8q);
            m21643e();
            m21638a(this.f28610d);
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.a2g, this, true);
            this.f28610d = (LinearLayout) findViewById(R.id.b8q);
            m21644f();
            m21638a(this.f28610d);
        }
        if (this.f28628v != null) {
            this.f28610d.setOnClickListener(this.f28628v);
        }
        this.f28626t = true;
        m21646h();
        if (this.f28606A) {
            this.f28610d.setVisibility(4);
        }
        m21642d();
        m21645g();
    }

    /* renamed from: g */
    private void m21645g() {
        m21640b();
        this.f28627u = false;
        if (this.f28630x) {
            this.f28608b = C10704b.m21578b(getContext()) - this.f28632z;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f28631y = iArr[1];
        }
        if (this.f28607a == null || this.f28608b < this.f28616j) {
            this.f28627u = true;
            return;
        }
        if (this.f28607a.f28702j) {
            int i = (int) ((((float) this.f28608b) * 0.2f) + 0.5f);
            if (this.f28630x) {
                i -= this.f28631y;
            }
            m21637a((View) this.f28611e, i);
            if (this.f28607a.f28707o) {
                if (this.f28607a.f28709q) {
                    m21637a(this.f28614h, this.f28623q);
                } else {
                    int a = (((((((this.f28608b - i) - this.f28625s) - this.f28617k) - m21634a((TextView) this.f28612f)) - this.f28618l) - m21634a((TextView) this.f28613g)) - this.f28620n) - this.f28619m;
                    if (this.f28630x) {
                        a -= this.f28631y;
                    }
                    setButtonMargin(a);
                }
            }
        } else if (this.f28607a.f28703k) {
            int i2 = (int) ((((float) this.f28608b) * 0.3f) + 0.5f);
            if (this.f28630x) {
                i2 -= this.f28631y;
            }
            m21637a((View) this.f28612f, i2);
            if (this.f28607a.f28707o) {
                int a2 = (((((this.f28608b - i2) - m21634a((TextView) this.f28612f)) - this.f28618l) - m21634a((TextView) this.f28613g)) - this.f28620n) - this.f28619m;
                if (this.f28630x) {
                    a2 -= this.f28631y;
                }
                setButtonMargin(a2);
            }
        } else {
            int i3 = (int) ((((float) this.f28608b) * 0.3f) + 0.5f);
            if (this.f28630x) {
                i3 -= this.f28631y;
            }
            m21637a((View) this.f28613g, i3);
        }
        this.f28613g.requestLayout();
        if (this.f28631y != 0 && this.f28606A) {
            this.f28610d.setVisibility(0);
        }
        this.f28627u = true;
    }

    /* renamed from: h */
    private void m21646h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f28610d != null && this.f28607a != null) {
            Resources resources = getResources();
            DmtTextView dmtTextView = this.f28612f;
            int i7 = R.color.arn;
            if (dmtTextView != null) {
                if (this.f28607a.f28706n) {
                    DmtTextView dmtTextView2 = this.f28612f;
                    if (this.f28629w == 0) {
                        i6 = resources.getColor(R.color.arn);
                    } else {
                        i6 = resources.getColor(R.color.arm);
                    }
                    dmtTextView2.setTextColor(i6);
                } else {
                    DmtTextView dmtTextView3 = this.f28612f;
                    if (this.f28629w == 0) {
                        i5 = resources.getColor(R.color.arj);
                    } else {
                        i5 = resources.getColor(R.color.ari);
                    }
                    dmtTextView3.setTextColor(i5);
                }
            }
            if (this.f28613g != null) {
                DmtTextView dmtTextView4 = this.f28613g;
                if (this.f28629w != 0) {
                    i7 = R.color.b50;
                }
                dmtTextView4.setTextColor(resources.getColor(i7));
            }
            if (this.f28614h != null) {
                if (this.f28614h instanceof DmtIconButton) {
                    ((DmtIconButton) this.f28614h).mo19029a(this.f28629w);
                    return;
                }
                DmtTextView dmtTextView5 = (DmtTextView) this.f28614h;
                if (this.f28607a.f28696d == C10720a.SOLID) {
                    if (this.f28629w == 0) {
                        i3 = R.drawable.c9t;
                    } else {
                        i3 = R.drawable.c9s;
                    }
                    dmtTextView5.setBackgroundResource(i3);
                    if (this.f28629w == 0) {
                        i4 = R.color.arf;
                    } else {
                        i4 = R.color.are;
                    }
                    dmtTextView5.setTextColor(resources.getColor(i4));
                    return;
                }
                if (this.f28629w == 0) {
                    i = R.drawable.c9r;
                } else {
                    i = R.drawable.c9q;
                }
                dmtTextView5.setBackgroundResource(i);
                if (this.f28629w == 0) {
                    i2 = resources.getColor(R.color.arj);
                } else {
                    i2 = resources.getColor(R.color.ari);
                }
                dmtTextView5.setTextColor(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo19191a() {
        if (this.f28607a != null) {
            if (this.f28626t) {
                m21645g();
                return;
            }
            m21641c();
        }
    }

    public void setSupportDelayVisible(boolean z) {
        this.f28606A = z;
    }

    public DmtDefaultView(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f28628v = onClickListener;
        if (this.f28610d != null) {
            this.f28610d.setOnClickListener(this.f28628v);
        }
    }

    public void setUseScreenHeight(int i) {
        this.f28630x = true;
        this.f28632z = i;
        mo19191a();
    }

    /* renamed from: a */
    private int m21634a(TextView textView) {
        textView.measure(MeasureSpec.makeMeasureSpec(this.f28609c - (this.f28624r * 2), DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    /* renamed from: a */
    private DmtTextView m21636a(C10722c cVar) {
        if (!cVar.f28707o) {
            return null;
        }
        if (cVar.f28696d == C10720a.SOLID) {
            return new DmtTextView(new ContextThemeWrapper(getContext(), R.style.te));
        }
        return new DmtTextView(new ContextThemeWrapper(getContext(), R.style.td));
    }

    private void setButtonMargin(int i) {
        if (i >= this.f28619m) {
            int i2 = (int) ((((float) this.f28608b) * 0.2f) + 0.5f);
            if (i2 < this.f28619m) {
                m21637a(this.f28614h, i);
                return;
            }
            int i3 = i - (i2 - this.f28619m);
            if (i3 > this.f28619m) {
                m21637a(this.f28614h, i3);
                return;
            }
        }
        m21637a(this.f28614h, this.f28619m);
    }

    /* renamed from: a */
    private void m21638a(LinearLayout linearLayout) {
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f28619m));
    }

    public void setStatus(C10722c cVar) {
        if (cVar != null) {
            this.f28607a = cVar;
            if (!this.f28607a.f28707o || (this.f28607a.f28703k && this.f28607a.f28704l)) {
                if (this.f28607a.f28709q) {
                    if (TextUtils.isEmpty(this.f28607a.f28700h)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f28607a.f28702j || !this.f28607a.f28703k || !this.f28607a.f28704l || !this.f28607a.f28707o) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f28607a.f28703k) {
                    if (TextUtils.isEmpty(this.f28607a.f28694b)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    }
                } else if (this.f28607a.f28704l) {
                    if (TextUtils.isEmpty(this.f28607a.f28695c)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f28607a.f28702j) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.f28626t = false;
                this.f28627u = false;
                if (this.f28608b > 0) {
                    m21641c();
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        if (this.f28629w != i) {
            this.f28629w = i;
            m21646h();
        }
    }

    public DmtDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static void m21637a(View view, int i) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i;
    }

    /* renamed from: b */
    private DmtTextView m21639b(C10722c cVar, LinearLayout linearLayout) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tg));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f28622p;
        linearLayout.addView(dmtTextView, layoutParams);
        dmtTextView.setText(cVar.f28700h);
        dmtTextView.setOnClickListener(this.f28607a.f28701i);
        return dmtTextView;
    }

    /* renamed from: a */
    private View m21635a(C10722c cVar, LinearLayout linearLayout) {
        if (cVar.f28708p) {
            DmtIconButton dmtIconButton = new DmtIconButton(getContext());
            dmtIconButton.mo19199a(cVar.f28696d, cVar.f28697e, cVar.f28698f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f28621o, this.f28620n);
            layoutParams.gravity = 1;
            linearLayout.addView(dmtIconButton, layoutParams);
            dmtIconButton.setOnClickListener(this.f28607a.f28699g);
            return dmtIconButton;
        }
        DmtTextView a = m21636a(cVar);
        if (a == null) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f28621o, this.f28620n);
        layoutParams2.gravity = 1;
        linearLayout.addView(a, layoutParams2);
        a.setText(cVar.f28698f);
        a.setOnClickListener(cVar.f28699g);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DmtDefaultView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            com.bytedance.ies.dmt.ui.common.b r5 = com.bytedance.ies.dmt.p664ui.common.C10675b.m21494a()
            int r5 = r5.f28434a
            r4.f28629w = r5
            r4.m21640b()
            if (r6 == 0) goto L_0x0092
            android.content.Context r5 = r4.getContext()
            r7 = 6
            int[] r7 = new int[r7]
            r7 = {2131362160, 2131362161, 2131362162, 2131362166, 2131362167, 2131362169} // fill-array
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r7)
            if (r6 == 0) goto L_0x0092
            com.bytedance.ies.dmt.ui.widget.c r7 = new com.bytedance.ies.dmt.ui.widget.c
            r7.<init>()
            r0 = 4
            boolean r1 = r6.hasValue(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003e
            android.content.res.Resources r5 = r5.getResources()
            int r0 = r6.getResourceId(r0, r2)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r0)
            r7.f28693a = r5
            r7.f28702j = r3
        L_0x003e:
            boolean r5 = r6.hasValue(r3)
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = r6.getString(r3)
            r7.f28698f = r5
            r7.f28707o = r3
        L_0x004c:
            boolean r5 = r6.hasValue(r2)
            if (r5 == 0) goto L_0x0061
            int r5 = r6.getInt(r2, r3)
            if (r5 != r3) goto L_0x005b
            com.bytedance.ies.dmt.ui.widget.a r5 = com.bytedance.ies.dmt.p664ui.widget.C10720a.SOLID
            goto L_0x005d
        L_0x005b:
            com.bytedance.ies.dmt.ui.widget.a r5 = com.bytedance.ies.dmt.p664ui.widget.C10720a.BORDER
        L_0x005d:
            r7.f28696d = r5
            r7.f28707o = r3
        L_0x0061:
            r5 = 5
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x0070
            java.lang.String r5 = r6.getString(r5)
            r7.f28694b = r5
            r7.f28703k = r3
        L_0x0070:
            r5 = 2
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x007f
            java.lang.String r5 = r6.getString(r5)
            r7.f28695c = r5
            r7.f28704l = r3
        L_0x007f:
            r5 = 3
            boolean r0 = r6.hasValue(r5)
            if (r0 == 0) goto L_0x008e
            java.lang.String r5 = r6.getString(r5)
            r7.f28700h = r5
            r7.f28709q = r3
        L_0x008e:
            r6.recycle()
            goto L_0x0093
        L_0x0092:
            r7 = 0
        L_0x0093:
            android.content.Context r5 = r4.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131886364(0x7f12011c, float:1.9407305E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28616j = r6
            r6 = 2131886367(0x7f12011f, float:1.940731E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28617k = r6
            r6 = 2131886356(0x7f120114, float:1.9407289E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28618l = r6
            r6 = 2131886365(0x7f12011d, float:1.9407307E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28619m = r6
            r6 = 2131886354(0x7f120112, float:1.9407284E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28621o = r6
            r6 = 2131886352(0x7f120110, float:1.940728E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28620n = r6
            r6 = 2131886357(0x7f120115, float:1.940729E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28622p = r6
            r6 = 2131886353(0x7f120111, float:1.9407282E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28623q = r6
            r6 = 2131886445(0x7f12016d, float:1.940747E38)
            int r6 = r5.getDimensionPixelSize(r6)
            r4.f28624r = r6
            r6 = 2131886359(0x7f120117, float:1.9407295E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.f28625s = r5
            if (r7 == 0) goto L_0x010e
            boolean r5 = r7.f28702j
            if (r5 != 0) goto L_0x010b
            boolean r5 = r7.f28707o
            if (r5 != 0) goto L_0x010b
            boolean r5 = r7.f28703k
            if (r5 != 0) goto L_0x010b
            boolean r5 = r7.f28704l
            if (r5 != 0) goto L_0x010b
            boolean r5 = r7.f28709q
            if (r5 == 0) goto L_0x010e
        L_0x010b:
            r4.setStatus(r7)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(this.f28608b == i2 && this.f28609c == i)) {
            this.f28609c = i;
            this.f28608b = i2;
            if (this.f28610d == null) {
                mo19191a();
                return;
            }
            this.f28610d.post(new Runnable() {
                public final void run() {
                    DmtDefaultView.this.mo19191a();
                }
            });
        }
    }
}

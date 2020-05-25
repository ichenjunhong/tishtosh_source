package com.bytedance.ies.dmt.p664ui.common.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.view.p041a.C1008c;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.common.views.C10688a.C10689a;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.ies.dmt.p664ui.widget.setting.checkable.DmtSettingSwitch.C10733a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.CommonItemView */
public class CommonItemView extends RelativeLayout {

    /* renamed from: a */
    public TextView f28447a;

    /* renamed from: b */
    public SimpleDraweeView f28448b;

    /* renamed from: c */
    public BadgeView f28449c;

    /* renamed from: d */
    public boolean f28450d;

    /* renamed from: e */
    public int f28451e;

    /* renamed from: f */
    private boolean f28452f;

    /* renamed from: g */
    private boolean f28453g;

    /* renamed from: h */
    private TextView f28454h;

    /* renamed from: i */
    private TextView f28455i;

    /* renamed from: j */
    private ImageView f28456j;

    /* renamed from: k */
    private ViewGroup f28457k;

    /* renamed from: l */
    private ViewGroup f28458l;

    /* renamed from: m */
    private DmtSettingSwitch f28459m;

    /* renamed from: n */
    private CharSequence f28460n;

    /* renamed from: o */
    private CharSequence f28461o;

    /* renamed from: p */
    private CharSequence f28462p;

    /* renamed from: q */
    private CharSequence f28463q;

    /* renamed from: r */
    private boolean f28464r;

    /* renamed from: s */
    private boolean f28465s;

    /* renamed from: t */
    private boolean f28466t;

    /* renamed from: u */
    private int f28467u;

    /* renamed from: v */
    private int f28468v;

    /* renamed from: w */
    private int f28469w;

    /* renamed from: x */
    private int f28470x;

    /* renamed from: y */
    private int f28471y;

    /* renamed from: z */
    private int f28472z;

    public SimpleDraweeView getIvwLeft() {
        return this.f28448b;
    }

    public ImageView getIvwRight() {
        return this.f28456j;
    }

    public int getResLeft() {
        return this.f28468v;
    }

    public int getResRight() {
        return this.f28469w;
    }

    public CharSequence getTextDesc() {
        return this.f28462p;
    }

    public CharSequence getTextLeft() {
        return this.f28460n;
    }

    public CharSequence getTextRight() {
        return this.f28461o;
    }

    public TextView getTvwDesc() {
        return this.f28455i;
    }

    public TextView getTvwLeft() {
        return this.f28447a;
    }

    public TextView getTvwRight() {
        return this.f28454h;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo19040c() {
        if (this.f28459m == null) {
            return false;
        }
        return this.f28459m.f28772b;
    }

    /* renamed from: g */
    private boolean m21527g() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo19039b() {
        this.f28450d = false;
        if (this.f28449c != null) {
            this.f28449c.setVisibility(8);
            if ((this.f28451e == 3 || this.f28451e == 2) && this.f28454h != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28454h.getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                }
                this.f28452f = true;
            }
        }
    }

    /* renamed from: d */
    private void m21524d() {
        if (this.f28462p == null) {
            if (this.f28455i != null) {
                this.f28455i.setVisibility(8);
            }
            return;
        }
        if (this.f28455i == null) {
            this.f28455i = new DmtTextView(getContext());
            this.f28455i.setLineSpacing(C9432q.m18687b(getContext(), 2.0f), 1.0f);
            this.f28455i.setTextSize(1, 13.0f);
            this.f28455i.setTextColor(this.f28472z);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.topMargin = (int) C9432q.m18687b(getContext(), 6.0f);
            layoutParams.addRule(3, R.id.bgx);
            addView(this.f28455i, layoutParams);
            if (VERSION.SDK_INT >= 23) {
                this.f28455i.setBreakStrategy(0);
            }
        }
        this.f28455i.setText(this.f28462p);
        this.f28455i.setVisibility(0);
        this.f28453g = true;
    }

    /* renamed from: f */
    private void m21526f() {
        Context context;
        int i;
        if (m21527g()) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f28460n)) {
                sb.append(this.f28460n);
            }
            if (!TextUtils.isEmpty(this.f28461o)) {
                sb.append(this.f28461o);
            }
            if (this.f28459m != null && this.f28459m.getVisibility() == 0) {
                if (this.f28459m.f28772b) {
                    context = getContext();
                    i = R.string.clh;
                } else {
                    context = getContext();
                    i = R.string.clb;
                }
                sb.append(context.getString(i));
            }
            if (!TextUtils.isEmpty(this.f28462p)) {
                sb.append(this.f28462p);
            }
            this.f28463q = sb.toString();
            setContentDescription(this.f28463q);
        }
    }

    /* renamed from: e */
    private void m21525e() {
        if (this.f28459m != null) {
            this.f28459m.setVisibility(8);
        }
        if (this.f28461o == null && this.f28469w == 0) {
            this.f28457k.setVisibility(8);
            return;
        }
        if (!this.f28466t && this.f28456j == null) {
            this.f28456j = new AutoRTLImageView(getContext());
            this.f28456j.setId(R.id.b5m);
            int b = (int) C9432q.m18687b(getContext(), 20.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
            } else {
                layoutParams.addRule(11);
            }
            this.f28457k.addView(this.f28456j, layoutParams);
        }
        if (!this.f28466t && this.f28456j != null) {
            if (this.f28469w != 0) {
                this.f28456j.setImageResource(this.f28469w);
                this.f28456j.setVisibility(0);
            } else {
                this.f28456j.setVisibility(8);
            }
        }
        if (this.f28461o != null && this.f28454h == null) {
            this.f28454h = new DmtTextView(getContext());
            this.f28454h.setId(R.id.dir);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.addRule(16, R.id.b5m);
            } else {
                layoutParams2.addRule(0, R.id.b5m);
            }
            this.f28454h.setTextColor(this.f28471y);
            this.f28454h.setEllipsize(TruncateAt.END);
            this.f28454h.setMaxLines(1);
            this.f28454h.setTextSize(1, 15.0f);
            this.f28457k.addView(this.f28454h, layoutParams2);
        }
        if (this.f28461o != null) {
            this.f28454h.setText(this.f28461o);
            this.f28454h.setVisibility(0);
        } else if (this.f28454h != null) {
            this.f28454h.setVisibility(8);
        }
        this.f28457k.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo19038a() {
        if (this.f28449c == null) {
            this.f28449c = new BadgeView(getContext());
            addView(this.f28449c, new LayoutParams(-2, -2));
        }
        if (this.f28451e == 3 || this.f28451e == 2) {
            LayoutParams layoutParams = (LayoutParams) this.f28449c.getLayoutParams();
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
            } else {
                layoutParams.addRule(11);
            }
            layoutParams.addRule(10);
            int measuredHeight = this.f28457k.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = this.f28447a.getLineHeight();
            }
            if (this.f28451e == 3) {
                layoutParams.topMargin = (measuredHeight - this.f28449c.getMeasuredHeight()) / 2;
            } else {
                layoutParams.topMargin = 0;
            }
            if (this.f28467u == 1) {
                layoutParams.rightMargin = (int) (((float) m21521a(this.f28457k)) + C9432q.m18687b(getContext(), 8.0f));
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
            } else {
                if (this.f28456j == null || this.f28456j.getVisibility() != 0) {
                    layoutParams.rightMargin = 0;
                } else {
                    layoutParams.rightMargin = this.f28456j.getMeasuredWidth();
                }
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(layoutParams.rightMargin);
                }
                if (this.f28454h != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28454h.getLayoutParams();
                    marginLayoutParams.rightMargin = (int) C9432q.m18687b(getContext(), 10.0f);
                    if (VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                    }
                    this.f28452f = true;
                }
            }
        } else if (!this.f28460n.equals(this.f28447a.getText())) {
            this.f28449c.setVisibility(0);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28460n);
            spannableStringBuilder.append(" ");
            C10688a aVar = new C10688a();
            aVar.f28474a = new C10689a() {
                /* renamed from: a */
                public final void mo19061a(int i, int i2) {
                    int i3;
                    if (CommonItemView.this.f28450d) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) CommonItemView.this.f28449c.getLayoutParams();
                        int b = (int) C9432q.m18687b(CommonItemView.this.getContext(), 1.0f);
                        Layout layout = CommonItemView.this.f28447a.getLayout();
                        if (layout != null && layout.getLineCount() > 0) {
                            i = (int) layout.getLineWidth(layout.getLineCount() - 1);
                        }
                        if (CommonItemView.this.f28451e == 1) {
                            i2 += (CommonItemView.this.f28447a.getLineHeight() - CommonItemView.this.f28449c.getMeasuredHeight()) / 2;
                            i = (int) (((float) i) + C9432q.m18687b(CommonItemView.this.getContext(), 4.0f));
                        }
                        if (CommonItemView.this.f28448b.getVisibility() == 0) {
                            if (VERSION.SDK_INT >= 17) {
                                i3 = i + ((MarginLayoutParams) CommonItemView.this.f28448b.getLayoutParams()).getMarginEnd();
                            } else {
                                i3 = i + ((MarginLayoutParams) CommonItemView.this.f28448b.getLayoutParams()).rightMargin;
                            }
                            i = i3 + CommonItemView.this.f28448b.getMeasuredWidth();
                        }
                        marginLayoutParams.leftMargin = i + b;
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                        }
                        marginLayoutParams.topMargin = (int) (CommonItemView.this.f28447a.getY() + ((float) i2));
                        CommonItemView.this.f28449c.requestLayout();
                    }
                }
            };
            spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            this.f28447a.setText(spannableStringBuilder);
        }
        this.f28450d = true;
    }

    public CommonItemView(Context context) {
        this(context, null);
    }

    public void setLeftIcon(int i) {
        m21522a(this.f28460n, i);
    }

    public void setLeftText(CharSequence charSequence) {
        m21522a(charSequence, this.f28468v);
    }

    public void setOnCheckedChangeListener(C10733a aVar) {
        this.f28459m.setOnCheckedChangeListener(aVar);
    }

    public void setRightIconRes(int i) {
        m21523b(this.f28461o, i);
    }

    public void setRightText(CharSequence charSequence) {
        m21523b(charSequence, this.f28469w);
    }

    public void setDesc(CharSequence charSequence) {
        this.f28462p = charSequence;
        m21524d();
        m21526f();
    }

    public void setLeftIconImageUrl(String str) {
        this.f28448b.setVisibility(0);
        this.f28448b.setImageURI(str);
        this.f28452f = true;
    }

    /* renamed from: a */
    private static int m21521a(ViewGroup viewGroup) {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = i3 + childAt.getMeasuredWidth();
            if (VERSION.SDK_INT >= 17) {
                i2 = marginLayoutParams.getMarginStart();
                i = marginLayoutParams.getMarginEnd();
            } else {
                i2 = marginLayoutParams.leftMargin;
                i = marginLayoutParams.rightMargin;
            }
            i3 = measuredWidth + i2 + i;
        }
        return i3;
    }

    public void setChecked(boolean z) {
        if (this.f28459m != null) {
            boolean z2 = this.f28459m.f28772b;
            this.f28459m.setChecked(z);
            m21526f();
            if (z2 != z && m21527g()) {
                if (VERSION.SDK_INT < 21) {
                    AccessibilityNodeInfo createAccessibilityNodeInfo = createAccessibilityNodeInfo();
                    if (createAccessibilityNodeInfo != null && C1008c.m2886a(createAccessibilityNodeInfo).mo3152e()) {
                        this.f28459m.announceForAccessibility(this.f28463q);
                    }
                } else if (isAccessibilityFocused()) {
                    this.f28459m.announceForAccessibility(this.f28463q);
                }
            }
        }
    }

    public CommonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m21520a(Context context, int i) {
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    private void m21523b(CharSequence charSequence, int i) {
        this.f28461o = charSequence;
        this.f28469w = i;
        if (this.f28467u != 1) {
            m21525e();
            this.f28452f = true;
            m21526f();
        }
    }

    /* renamed from: a */
    private void m21522a(CharSequence charSequence, int i) {
        this.f28468v = i;
        this.f28448b.setImageResource(this.f28468v);
        if (!(this.f28468v == 0 || this.f28448b.getVisibility() == 0)) {
            this.f28448b.setVisibility(0);
        }
        this.f28460n = charSequence;
        this.f28447a.setText(this.f28460n);
        if (this.f28450d) {
            mo19038a();
        }
        this.f28452f = true;
        m21526f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f28452f || this.f28453g) {
            if (this.f28452f) {
                if (this.f28457k.getVisibility() == 8) {
                    this.f28458l.getLayoutParams().width = -1;
                } else {
                    int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                    if (this.f28467u == 1) {
                        this.f28457k.measure(MeasureSpec.makeMeasureSpec(size, DynamicTabYellowPointVersion.DEFAULT), i2);
                        this.f28458l.getLayoutParams().width = size - m21521a(this.f28457k);
                    } else {
                        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, DynamicTabYellowPointVersion.DEFAULT);
                        this.f28458l.measure(makeMeasureSpec, i2);
                        this.f28457k.measure(makeMeasureSpec, i2);
                        int measuredWidth = this.f28458l.getMeasuredWidth();
                        int a = m21521a(this.f28457k);
                        if (measuredWidth + a <= size) {
                            this.f28458l.getLayoutParams().width = measuredWidth;
                            this.f28457k.getLayoutParams().width = size - measuredWidth;
                        } else {
                            double d = (double) size;
                            Double.isNaN(d);
                            int i3 = (int) (0.204d * d);
                            if (a <= i3) {
                                this.f28457k.getLayoutParams().width = i3;
                                this.f28458l.getLayoutParams().width = size - i3;
                            } else if (measuredWidth <= i3) {
                                this.f28457k.getLayoutParams().width = size - i3;
                                this.f28458l.getLayoutParams().width = i3;
                            } else {
                                Double.isNaN(d);
                                int i4 = (int) (0.372d * d);
                                if (measuredWidth <= i4) {
                                    this.f28458l.getLayoutParams().width = i4;
                                    this.f28457k.getLayoutParams().width = size - i4;
                                } else if (a <= i4) {
                                    this.f28458l.getLayoutParams().width = size - i4;
                                    this.f28457k.getLayoutParams().width = i4;
                                } else {
                                    Double.isNaN(d);
                                    int i5 = (int) (d * 0.29d);
                                    this.f28458l.getLayoutParams().width = size - i5;
                                    this.f28457k.getLayoutParams().width = i5;
                                }
                            }
                        }
                    }
                }
                this.f28452f = false;
            }
            if (!(!this.f28453g || this.f28455i == null || this.f28455i.getVisibility() == 8)) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28455i.getLayoutParams();
                if (this.f28448b.getVisibility() != 0) {
                    marginLayoutParams.leftMargin = 0;
                } else {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f28448b.getLayoutParams();
                    marginLayoutParams.leftMargin = marginLayoutParams2.rightMargin + marginLayoutParams2.width;
                }
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                }
                this.f28453g = false;
            }
            if (this.f28450d) {
                mo19038a();
            }
        } else if (this.f28450d) {
            mo19038a();
        }
        super.onMeasure(i, i2);
    }

    public CommonItemView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        super(context, attributeSet, i);
        this.f28452f = true;
        this.f28453g = true;
        this.f28464r = true;
        this.f28465s = true;
        this.f28467u = -1;
        LayoutInflater.from(context).inflate(R.layout.asz, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jl, R.attr.jm, R.attr.nb, R.attr.s8, R.attr.s9, R.attr.s_, R.attr.zf, R.attr.zg, R.attr.zh, R.attr.zi, R.attr.a29, R.attr.a_b, R.attr.a_c, R.attr.aaq});
        this.f28460n = obtainStyledAttributes.getString(4);
        this.f28461o = obtainStyledAttributes.getString(7);
        this.f28462p = obtainStyledAttributes.getString(0);
        this.f28468v = obtainStyledAttributes.getResourceId(3, 0);
        if (C10675b.m21498b(context)) {
            i2 = R.drawable.c_e;
        } else {
            i2 = R.drawable.c_f;
        }
        this.f28469w = obtainStyledAttributes.getResourceId(6, i2);
        Context context2 = getContext();
        if (C10675b.m21498b(context2)) {
            i3 = R.color.aof;
        } else {
            i3 = R.color.aoe;
        }
        this.f28470x = obtainStyledAttributes.getColor(5, m21520a(context2, i3));
        Context context3 = getContext();
        boolean b = C10675b.m21498b(context3);
        int i6 = R.color.jm;
        if (b) {
            i4 = R.color.aoh;
        } else {
            i4 = R.color.jm;
        }
        this.f28471y = obtainStyledAttributes.getColor(8, m21520a(context3, i4));
        Context context4 = getContext();
        if (C10675b.m21498b(context4)) {
            i6 = R.color.aoh;
        }
        this.f28472z = obtainStyledAttributes.getColor(1, m21520a(context4, i6));
        this.f28464r = obtainStyledAttributes.getBoolean(12, true);
        this.f28465s = obtainStyledAttributes.getBoolean(11, true);
        this.f28450d = obtainStyledAttributes.getBoolean(10, false);
        this.f28466t = obtainStyledAttributes.getBoolean(2, false);
        this.f28467u = obtainStyledAttributes.getInt(9, 0);
        this.f28451e = obtainStyledAttributes.getInt(13, 0);
        obtainStyledAttributes.recycle();
        if (this.f28464r) {
            int b2 = (int) C9432q.m18687b(context, 16.0f);
            setPadding(b2, b2, b2, b2);
        }
        if (this.f28465s) {
            setBackground(C10678c.m21505e(context));
        }
        this.f28458l = (ViewGroup) findViewById(R.id.bgx);
        this.f28457k = (ViewGroup) findViewById(R.id.bgz);
        this.f28447a = (TextView) this.f28458l.findViewById(R.id.dis);
        this.f28448b = (SimpleDraweeView) this.f28458l.findViewById(R.id.b5l);
        if (VERSION.SDK_INT >= 23) {
            this.f28447a.setBreakStrategy(0);
        }
        if (this.f28467u == 1) {
            if (this.f28456j != null) {
                this.f28456j.setVisibility(8);
            }
            if (this.f28454h != null) {
                this.f28454h.setVisibility(8);
            }
            if (this.f28459m == null) {
                this.f28459m = new DmtSettingSwitch(getContext());
                this.f28459m.setId(R.id.cvs);
                LayoutParams layoutParams = new LayoutParams((int) C9432q.m18687b(getContext(), 36.0f), -2);
                layoutParams.addRule(15);
                this.f28459m.setTrackRadius((int) C9432q.m18687b(getContext(), 42.0f));
                this.f28459m.setEnableTouch(false);
                this.f28459m.setTrackPadding((int) C9432q.m18687b(getContext(), 3.0f));
                this.f28459m.setThumbDrawable(getResources().getDrawable(R.drawable.cao));
                DmtSettingSwitch dmtSettingSwitch = this.f28459m;
                Context context5 = getContext();
                Resources resources = context5.getResources();
                if (C10675b.m21498b(context5)) {
                    i5 = R.color.hb;
                } else {
                    i5 = R.color.ha;
                }
                dmtSettingSwitch.setTrackTintList(resources.getColorStateList(i5));
                this.f28457k.addView(this.f28459m, layoutParams);
            }
            this.f28457k.setVisibility(0);
            this.f28459m.setVisibility(0);
        } else {
            m21525e();
        }
        if (this.f28468v == 0) {
            this.f28448b.setVisibility(8);
        } else {
            this.f28448b.setVisibility(0);
            this.f28448b.setImageResource(this.f28468v);
        }
        this.f28447a.setText(this.f28460n);
        this.f28447a.setTextColor(this.f28470x);
        m21524d();
    }
}

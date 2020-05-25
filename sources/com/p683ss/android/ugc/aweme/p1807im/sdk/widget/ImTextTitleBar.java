package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImActiveStateEnhanceExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar */
public class ImTextTitleBar extends FrameLayout {

    /* renamed from: a */
    public C35356a f90791a;

    /* renamed from: b */
    private boolean f90792b;

    /* renamed from: c */
    private String f90793c;

    /* renamed from: d */
    private String f90794d;

    /* renamed from: e */
    private String f90795e;

    /* renamed from: f */
    private String f90796f;

    /* renamed from: g */
    private Drawable f90797g;

    /* renamed from: h */
    private Drawable f90798h;

    /* renamed from: i */
    private float f90799i;

    /* renamed from: j */
    private float f90800j;

    /* renamed from: k */
    private float f90801k;

    /* renamed from: l */
    private int f90802l;

    /* renamed from: m */
    private int f90803m;

    /* renamed from: n */
    private int f90804n;

    /* renamed from: o */
    private DmtTextView f90805o;

    /* renamed from: p */
    private DmtTextView f90806p;

    /* renamed from: q */
    private View f90807q;

    /* renamed from: r */
    private DmtTextView f90808r;

    /* renamed from: s */
    private DmtTextView f90809s;

    /* renamed from: t */
    private View f90810t;

    /* renamed from: u */
    private DmtTextView f90811u;

    /* renamed from: v */
    private AutoRTLImageView f90812v;

    /* renamed from: w */
    private AutoRTLImageView f90813w;

    /* renamed from: x */
    private ViewGroup f90814x;

    /* renamed from: y */
    private ViewGroup f90815y;

    /* renamed from: z */
    private ImageView f90816z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar$a */
    public interface C35356a {
        /* renamed from: a */
        void mo70669a();

        /* renamed from: b */
        void mo70670b();

        /* renamed from: c */
        void mo70671c();
    }

    public DmtTextView getLeftTextView() {
        return this.f90805o;
    }

    public View getLeftView() {
        return this.f90814x;
    }

    public DmtTextView getRightTexView() {
        return this.f90806p;
    }

    public View getRightView() {
        return this.f90815y;
    }

    public View getStartCallView() {
        return this.f90816z;
    }

    /* renamed from: a */
    private void m79981a() {
        int i;
        int i2;
        int i3;
        int a = C9432q.m18670a(getContext());
        if (this.f90814x.getVisibility() == 8 && this.f90815y.getVisibility() == 8) {
            i = a - ((int) C9432q.m18687b(getContext(), 32.0f));
        } else {
            int i4 = 0;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            if (this.f90814x.getVisibility() != 8) {
                this.f90814x.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = this.f90814x.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            if (this.f90815y.getVisibility() != 8) {
                this.f90815y.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = this.f90815y.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            if (this.f90816z.getVisibility() != 8) {
                this.f90816z.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 = this.f90816z.getMeasuredWidth() + C23728o.m58241a(7.0d);
            }
            i = (a - (Math.max(i2, i3) * 2)) - (i4 * 2);
        }
        if (this.f90809s.getVisibility() == 0) {
            LayoutParams layoutParams = this.f90807q.getLayoutParams();
            layoutParams.width = i;
            this.f90807q.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = this.f90808r.getLayoutParams();
            layoutParams2.width = -2;
            this.f90808r.setLayoutParams(layoutParams2);
            return;
        }
        LayoutParams layoutParams3 = this.f90808r.getLayoutParams();
        layoutParams3.width = i;
        this.f90808r.setLayoutParams(layoutParams3);
    }

    public void setOnTitlebarClickListener(C35356a aVar) {
        this.f90791a = aVar;
    }

    public ImTextTitleBar(Context context) {
        this(context, null);
    }

    public void setTitle(String str) {
        this.f90795e = str;
        this.f90808r.setText(str);
    }

    public void setLeftIcon(int i) {
        setLeftIcon(getContext().getResources().getDrawable(i));
    }

    public void setLeftText(int i) {
        setLeftText(C11010c.m22280a().getResources().getString(i));
    }

    public void setLeftTextColor(int i) {
        this.f90802l = i;
        if (this.f90805o != null) {
            this.f90805o.setTextColor(this.f90802l);
        }
    }

    public void setRightIcon(int i) {
        setRightIcon(getContext().getResources().getDrawable(i));
    }

    public void setRightText(int i) {
        setRightText(C11010c.m22280a().getResources().getString(i));
    }

    public void setRightTextColor(int i) {
        this.f90803m = i;
        if (this.f90806p != null) {
            this.f90806p.setTextColor(this.f90803m);
        }
    }

    public void setTitle(int i) {
        setTitle(C11010c.m22280a().getResources().getString(i));
    }

    public void setTitleTextColor(int i) {
        this.f90804n = i;
        this.f90808r.setTextColor(this.f90804n);
    }

    public void setTitleTextSize(float f) {
        this.f90801k = f;
        this.f90808r.setTextSize(0, f);
    }

    public void setLeftTextSize(float f) {
        this.f90799i = f;
        if (this.f90805o != null) {
            this.f90805o.setTextSize(0, this.f90799i);
            m79981a();
        }
    }

    public void setRightTextSize(float f) {
        this.f90800j = f;
        if (this.f90806p != null) {
            this.f90806p.setTextSize(0, this.f90800j);
            m79981a();
        }
    }

    public void setStartCallView(int i) {
        this.f90816z.setImageDrawable(getContext().getResources().getDrawable(i));
        this.f90816z.setVisibility(0);
        m79981a();
    }

    public void setTitle(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        this.f90795e = str;
        this.f90808r.setText(charSequence);
    }

    public void setTitleCount(String str) {
        if (this.f90809s.getVisibility() != 0) {
            this.f90809s.setVisibility(0);
        }
        this.f90809s.setText(str);
        m79981a();
    }

    public void setHint(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!ImActiveStateEnhanceExperiment.m76317a() || !TextUtils.equals(str, getContext().getString(R.string.ft7))) {
                this.f90810t.setVisibility(8);
                this.f90811u.setTextColor(C0726c.m2098c(getContext(), R.color.azl));
            } else {
                this.f90810t.setVisibility(0);
                this.f90811u.setTextColor(C0726c.m2098c(getContext(), R.color.azm));
            }
            this.f90811u.setText(str);
            this.f90811u.setVisibility(0);
            return;
        }
        this.f90811u.setVisibility(8);
    }

    public void setLeftIcon(Drawable drawable) {
        this.f90797g = drawable;
        if (this.f90805o != null) {
            this.f90805o.setVisibility(8);
        }
        if (this.f90812v == null) {
            this.f90812v = new AutoRTLImageView(getContext());
            this.f90812v.setScaleType(ScaleType.CENTER_INSIDE);
            this.f90814x.addView(this.f90812v);
            this.f90814x.setVisibility(0);
        } else {
            this.f90812v.setVisibility(0);
        }
        this.f90814x.setContentDescription(getContext().getResources().getString(R.string.pc));
        this.f90812v.setImageDrawable(this.f90797g);
        m79981a();
    }

    public void setLeftText(String str) {
        this.f90793c = str;
        if (this.f90812v != null) {
            this.f90812v.setVisibility(8);
        }
        if (this.f90805o == null) {
            this.f90805o = new DmtTextView(getContext());
            this.f90814x.addView(this.f90805o);
            this.f90814x.setVisibility(0);
            this.f90805o.setTextColor(this.f90802l);
            this.f90805o.setTextSize(0, this.f90799i);
        } else {
            this.f90805o.setVisibility(0);
        }
        this.f90805o.setText(this.f90793c);
        this.f90814x.setContentDescription(this.f90793c);
        m79981a();
    }

    public void setRightIcon(Drawable drawable) {
        this.f90798h = drawable;
        if (this.f90806p != null) {
            this.f90806p.setVisibility(8);
        }
        if (this.f90813w == null) {
            this.f90813w = new AutoRTLImageView(getContext());
            this.f90813w.setScaleType(ScaleType.CENTER_INSIDE);
            this.f90815y.addView(this.f90813w);
            this.f90815y.setVisibility(0);
        } else {
            this.f90813w.setVisibility(0);
        }
        this.f90815y.setContentDescription(getContext().getResources().getString(R.string.bkw));
        this.f90813w.setImageDrawable(this.f90798h);
        m79981a();
    }

    public void setRightText(String str) {
        this.f90794d = str;
        if (this.f90813w != null) {
            this.f90813w.setVisibility(8);
        }
        if (this.f90806p == null) {
            this.f90806p = new DmtTextView(getContext());
            this.f90815y.addView(this.f90806p);
            this.f90815y.setVisibility(0);
            this.f90806p.setTextSize(0, this.f90800j);
            this.f90806p.setTextColor(this.f90803m);
        } else {
            this.f90806p.setVisibility(0);
        }
        this.f90815y.setContentDescription(this.f90794d);
        this.f90806p.setText(this.f90794d);
        m79981a();
    }

    public ImTextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImTextTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90792b = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acf, R.attr.nx, R.attr.ny, R.attr.nz, R.attr.o0, R.attr.o1, R.attr.o2, R.attr.o3, R.attr.o4, R.attr.o5, R.attr.o6, R.attr.o7, R.attr.o8});
        this.f90792b = obtainStyledAttributes.getBoolean(12, true);
        this.f90793c = obtainStyledAttributes.getString(3);
        this.f90794d = obtainStyledAttributes.getString(7);
        this.f90795e = obtainStyledAttributes.getString(9);
        this.f90796f = obtainStyledAttributes.getString(0);
        if (TextUtils.isEmpty(this.f90793c)) {
            this.f90797g = obtainStyledAttributes.getDrawable(2);
        }
        this.f90802l = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.sf));
        this.f90799i = obtainStyledAttributes.getDimension(4, C9432q.m18687b(context, 16.0f));
        if (TextUtils.isEmpty(this.f90794d)) {
            this.f90798h = obtainStyledAttributes.getDrawable(6);
        }
        this.f90803m = obtainStyledAttributes.getColor(5, context.getResources().getColor(R.color.sf));
        this.f90800j = obtainStyledAttributes.getDimension(8, C9432q.m18687b(context, 16.0f));
        this.f90804n = obtainStyledAttributes.getColor(10, context.getResources().getColor(R.color.sd));
        this.f90801k = obtainStyledAttributes.getDimension(11, C9432q.m18687b(context, 17.0f));
        obtainStyledAttributes.recycle();
        inflate(context, R.layout.bg1, this);
        this.f90814x = (ViewGroup) findViewById(R.id.b_y);
        this.f90815y = (ViewGroup) findViewById(R.id.cch);
        this.f90807q = findViewById(R.id.d1b);
        this.f90808r = (DmtTextView) findViewById(R.id.d1l);
        this.f90809s = (DmtTextView) findViewById(R.id.a1a);
        this.f90810t = findViewById(R.id.eaq);
        this.f90811u = (DmtTextView) findViewById(R.id.ear);
        this.f90816z = (ImageView) findViewById(R.id.efz);
        if (!TextUtils.isEmpty(this.f90793c)) {
            setLeftText(this.f90793c);
            setLeftTextColor(this.f90802l);
            setLeftTextSize(this.f90799i);
        } else if (this.f90797g != null) {
            setLeftIcon(this.f90797g);
        } else if (this.f90792b) {
            setLeftIcon(getContext().getResources().getDrawable(R.drawable.c_p));
        }
        if (!TextUtils.isEmpty(this.f90794d)) {
            setRightText(this.f90794d);
            setRightTextColor(this.f90803m);
            setRightTextSize(this.f90800j);
        } else if (this.f90798h != null) {
            setRightIcon(this.f90798h);
        }
        if (!TextUtils.isEmpty(this.f90795e)) {
            setTitle(this.f90795e);
            setTitleTextColor(this.f90804n);
            setTitleTextSize(this.f90801k);
        }
        if (!TextUtils.isEmpty(this.f90796f)) {
            setHint(this.f90796f);
        }
        this.f90814x.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImTextTitleBar.this.f90791a != null) {
                    ImTextTitleBar.this.f90791a.mo70669a();
                }
            }
        });
        this.f90815y.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImTextTitleBar.this.f90791a != null) {
                    ImTextTitleBar.this.f90791a.mo70670b();
                }
            }
        });
        this.f90816z.setOnClickListener(new C35411m(this));
        C35221bc.m79614a(this.f90814x);
        C35221bc.m79614a(this.f90815y);
        C35221bc.m79614a(this.f90816z);
    }
}

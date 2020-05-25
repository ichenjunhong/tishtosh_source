package com.bytedance.ies.dmt.p664ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItemBase */
public abstract class EffectiveSettingItemBase extends ConstraintLayout {

    /* renamed from: A */
    protected View f28732A;

    /* renamed from: B */
    protected ImageView f28733B;

    /* renamed from: C */
    protected C10729a f28734C;

    /* renamed from: m */
    protected String f28735m;

    /* renamed from: n */
    protected String f28736n;

    /* renamed from: o */
    protected float f28737o;

    /* renamed from: p */
    protected int f28738p;

    /* renamed from: q */
    protected String f28739q;

    /* renamed from: r */
    protected float f28740r;

    /* renamed from: s */
    protected int f28741s;

    /* renamed from: t */
    protected int f28742t;

    /* renamed from: u */
    protected boolean f28743u;

    /* renamed from: v */
    protected boolean f28744v;

    /* renamed from: w */
    protected FrameLayout f28745w;

    /* renamed from: x */
    protected FrameLayout f28746x;

    /* renamed from: y */
    protected TextView f28747y;

    /* renamed from: z */
    protected TextView f28748z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItemBase$a */
    public interface C10729a {
        /* renamed from: a */
        void mo19301a(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19286a(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo19287b();

    public FrameLayout getDecorLayout() {
        return this.f28746x;
    }

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return -1;
    }

    public TextView getTxtRight() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        setBackground(C10678c.m21505e(getContext()));
        this.f28747y = (TextView) findViewById(R.id.db4);
        this.f28748z = (TextView) findViewById(R.id.db3);
        this.f28746x = (FrameLayout) findViewById(R.id.ah8);
        this.f28733B = (ImageView) findViewById(R.id.b1t);
        this.f28732A = findViewById(R.id.dl9);
        this.f28745w = (FrameLayout) findViewById(R.id.ccj);
        this.f28747y.setText(this.f28736n);
        this.f28747y.setTextSize(this.f28737o);
        this.f28747y.setTextColor(this.f28738p);
        if (!TextUtils.isEmpty(this.f28739q)) {
            this.f28748z.setText(this.f28739q);
            this.f28747y.setMaxLines(1);
            if (getLayoutParams() != null) {
                getLayoutParams().height = (int) C9432q.m18687b(getContext(), 70.0f);
            }
        } else {
            this.f28748z.setVisibility(8);
        }
        this.f28748z.setTextSize(this.f28740r);
        this.f28748z.setTextColor(this.f28741s);
        if (this.f28742t != -1) {
            m21711a(this.f28733B, this.f28742t);
        } else {
            this.f28733B.setVisibility(8);
        }
        if (!this.f28743u) {
            this.f28732A.setVisibility(8);
        }
        this.f28732A.setBackgroundColor(C10678c.m21504d(getContext()));
        int rightLayoutId = getRightLayoutId();
        if (-1 != rightLayoutId) {
            this.f28745w.removeAllViews();
            LayoutInflater.from(getContext()).inflate(rightLayoutId, this.f28745w, true);
        }
        if (this.f28744v) {
            this.f28745w.setVisibility(8);
        }
        mo19287b();
    }

    public void setRightTxt(String str) {
        this.f28735m = str;
    }

    public EffectiveSettingItemBase(Context context) {
        this(context, null);
    }

    public void setRightLayoutVisibility(int i) {
        this.f28745w.setVisibility(i);
    }

    public void setStartText(String str) {
        this.f28747y.setText(str);
    }

    public void setOnSettingItemClickListener(C10729a aVar) {
        this.f28734C = aVar;
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (EffectiveSettingItemBase.this.f28734C != null) {
                    EffectiveSettingItemBase.this.f28734C.mo19301a(EffectiveSettingItemBase.this);
                }
            }
        });
    }

    public void setSubText(String str) {
        this.f28748z.setVisibility(0);
        this.f28748z.setText(str);
    }

    public void setStartIcon(int i) {
        if (getContext() != null && getContext().getResources() != null) {
            m21711a(this.f28733B, i);
        }
    }

    public void setStartTextColor(int i) {
        if (getContext() != null) {
            this.f28747y.setTextColor(C0726c.m2098c(getContext(), i));
        }
    }

    public void setSubTextColor(int i) {
        if (getContext() != null) {
            this.f28748z.setTextColor(C0726c.m2098c(getContext(), i));
        }
    }

    /* renamed from: a */
    private static void m21711a(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    public EffectiveSettingItemBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EffectiveSettingItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28742t = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.km, R.attr.kn, R.attr.n_, R.attr.p9, R.attr.a36, R.attr.a38, R.attr.a39, R.attr.a3r, R.attr.a3s, R.attr.a67, R.attr.a6e});
        this.f28736n = obtainStyledAttributes.getString(6);
        this.f28737o = obtainStyledAttributes.getDimension(10, 15.0f);
        this.f28738p = obtainStyledAttributes.getColor(9, C10678c.m21500a(context));
        this.f28739q = obtainStyledAttributes.getString(5);
        this.f28740r = obtainStyledAttributes.getDimension(8, 13.0f);
        this.f28741s = obtainStyledAttributes.getColor(7, C10678c.m21503c(context));
        if (obtainStyledAttributes.hasValue(4)) {
            this.f28742t = obtainStyledAttributes.getResourceId(4, -1);
        }
        this.f28743u = obtainStyledAttributes.getBoolean(3, false);
        this.f28735m = obtainStyledAttributes.getString(1);
        this.f28744v = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        mo19286a(context, attributeSet);
    }
}

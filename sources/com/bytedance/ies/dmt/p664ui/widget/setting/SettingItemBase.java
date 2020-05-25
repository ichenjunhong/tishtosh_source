package com.bytedance.ies.dmt.p664ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItemBase */
public abstract class SettingItemBase extends RelativeLayout {

    /* renamed from: a */
    private boolean f28754a;

    /* renamed from: e */
    protected String f28755e;

    /* renamed from: f */
    protected View f28756f;

    /* renamed from: g */
    protected RelativeLayout f28757g;

    /* renamed from: h */
    protected FrameLayout f28758h;

    /* renamed from: i */
    protected ViewGroup f28759i;

    /* renamed from: j */
    protected FrameLayout f28760j;

    /* renamed from: k */
    protected TextView f28761k;

    /* renamed from: l */
    protected TextView f28762l;

    /* renamed from: m */
    protected View f28763m;

    /* renamed from: n */
    protected ImageView f28764n;

    /* renamed from: o */
    protected C10731a f28765o;

    /* renamed from: p */
    protected int f28766p;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItemBase$a */
    public interface C10731a {
        void OnSettingItemClick(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19303a(Context context, AttributeSet attributeSet) {
    }

    public FrameLayout getDecorLayout() {
        return this.f28760j;
    }

    /* access modifiers changed from: protected */
    public abstract int getRightLayoutId();

    public TextView getTxtRight() {
        return null;
    }

    public void setRightTxt(String str) {
        this.f28755e = str;
    }

    public SettingItemBase(Context context) {
        this(context, null);
    }

    public void setStartText(String str) {
        this.f28761k.setText(str);
    }

    public void setOnSettingItemClickListener(C10731a aVar) {
        this.f28765o = aVar;
        this.f28757g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (SettingItemBase.this.f28765o != null) {
                    SettingItemBase.this.f28765o.OnSettingItemClick(SettingItemBase.this.f28756f);
                }
            }
        });
    }

    public void setRightLayoutVisibility(int i) {
        ((ViewGroup) findViewById(R.id.ccj)).setVisibility(i);
    }

    public void setSubText(String str) {
        this.f28762l.setVisibility(0);
        this.f28762l.setText(str);
    }

    public void setStartIcon(int i) {
        if (getContext() != null && getContext().getResources() != null) {
            m21717a(this.f28764n, i);
        }
    }

    public void setStartTextColor(int i) {
        if (getContext() != null) {
            this.f28761k.setTextColor(C0726c.m2098c(getContext(), i));
        }
    }

    public void setSubTextColor(int i) {
        if (getContext() != null) {
            this.f28762l.setTextColor(C0726c.m2098c(getContext(), i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19302a(Context context) {
        this.f28756f = View.inflate(context, R.layout.at4, this);
        this.f28757g = (RelativeLayout) this.f28756f.findViewById(R.id.cfg);
        this.f28761k = (TextView) this.f28756f.findViewById(R.id.db4);
        this.f28762l = (TextView) this.f28756f.findViewById(R.id.db3);
        this.f28759i = (ViewGroup) this.f28756f.findViewById(R.id.ce4);
        this.f28760j = (FrameLayout) this.f28756f.findViewById(R.id.ah8);
        this.f28764n = (ImageView) this.f28756f.findViewById(R.id.b1t);
        this.f28763m = this.f28756f.findViewById(R.id.dl9);
        this.f28758h = (FrameLayout) findViewById(R.id.ccg);
        int rightLayoutId = getRightLayoutId();
        if (rightLayoutId != 0) {
            LayoutInflater.from(context).inflate(rightLayoutId, this.f28758h, true);
        }
    }

    /* renamed from: a */
    private static void m21717a(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    public SettingItemBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19308b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.km, R.attr.kn, R.attr.n_, R.attr.p9, R.attr.a36, R.attr.a38, R.attr.a39, R.attr.a3r, R.attr.a3s, R.attr.a67, R.attr.a6e});
        this.f28757g.setBackground(C10678c.m21505e(context));
        this.f28761k.setText(obtainStyledAttributes.getString(6));
        this.f28761k.setTextColor(obtainStyledAttributes.getColor(9, C10678c.m21500a(context)));
        String string = obtainStyledAttributes.getString(5);
        if (!TextUtils.isEmpty(string)) {
            this.f28762l.setText(string);
            this.f28761k.setMaxLines(1);
            this.f28757g.getLayoutParams().height = (int) C9432q.m18687b(getContext(), 70.0f);
        } else {
            this.f28762l.setVisibility(8);
        }
        this.f28766p = obtainStyledAttributes.getColor(7, C10678c.m21503c(context));
        this.f28762l.setTextColor(this.f28766p);
        if (obtainStyledAttributes.hasValue(4)) {
            m21717a(this.f28764n, obtainStyledAttributes.getResourceId(4, -1));
        } else {
            this.f28764n.setVisibility(8);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28759i.getLayoutParams();
            int b = (int) C9432q.m18687b(context, 16.0f);
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(b);
            } else {
                marginLayoutParams.leftMargin = b;
            }
        }
        int i = 0;
        if (!obtainStyledAttributes.getBoolean(3, false)) {
            this.f28763m.setVisibility(8);
        }
        this.f28763m.setBackgroundColor(C10678c.m21504d(context));
        this.f28755e = obtainStyledAttributes.getString(1);
        this.f28754a = obtainStyledAttributes.getBoolean(2, false);
        if (this.f28754a) {
            i = 8;
        }
        setRightLayoutVisibility(i);
        obtainStyledAttributes.recycle();
    }

    public SettingItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo19302a(context);
        mo19308b(context, attributeSet);
        mo19303a(context, attributeSet);
    }
}

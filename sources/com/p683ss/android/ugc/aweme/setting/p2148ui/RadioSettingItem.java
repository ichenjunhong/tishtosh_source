package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.MaterialRippleLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.RadioSettingItem */
public class RadioSettingItem extends MaterialRippleLayout {

    /* renamed from: m */
    C41773a f105759m;

    /* renamed from: n */
    private TextView f105760n;

    /* renamed from: o */
    private TextView f105761o;

    /* renamed from: p */
    private View f105762p;

    /* renamed from: q */
    private ImageView f105763q;

    /* renamed from: r */
    private RadioSettingGroup f105764r;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.RadioSettingItem$a */
    public interface C41773a {
        /* renamed from: a */
        boolean mo47209a(View view);
    }

    /* renamed from: c */
    public final boolean mo85676c() {
        return this.f105763q.isSelected();
    }

    /* renamed from: d */
    private void m91755d() {
        if (this.f105764r == null && (getParent() instanceof RadioSettingGroup)) {
            this.f105764r = (RadioSettingGroup) getParent();
        }
    }

    public void setOnSettingItemClickListener(C41773a aVar) {
        this.f105759m = aVar;
    }

    public RadioSettingItem(Context context) {
        this(context, null);
    }

    public void setStartText(String str) {
        this.f105760n.setText(str);
    }

    public void setStartSubText(String str) {
        if (this.f105761o != null) {
            this.f105761o.setVisibility(0);
            this.f105761o.setText(str);
        }
    }

    public void setStartSubTextColor(int i) {
        if (this.f105761o != null) {
            this.f105761o.setTextColor(i);
        }
    }

    public void setStartTextColor(int i) {
        if (this.f105760n != null) {
            this.f105760n.setTextColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public void setSelfChecked(boolean z) {
        this.f105763q.setSelected(z);
        if (z) {
            this.f105763q.setImageDrawable(C23723j.m58217a().getDrawable(R.drawable.a8l));
            return;
        }
        this.f105763q.setImageDrawable(null);
    }

    public void setChecked(boolean z) {
        boolean z2;
        if (!mo85676c()) {
            m91755d();
            if (this.f105764r != null) {
                for (int i = 0; i < this.f105764r.getChildCount(); i++) {
                    if (this.f105764r.getChildAt(i) instanceof RadioSettingItem) {
                        RadioSettingItem radioSettingItem = (RadioSettingItem) this.f105764r.getChildAt(i);
                        if (equals(radioSettingItem)) {
                            z2 = z;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        radioSettingItem.setSelfChecked(z2);
                    }
                }
                return;
            }
            setSelfChecked(z);
        }
    }

    public RadioSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadioSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.aeo, this);
        this.f105762p = inflate.findViewById(R.id.cfg);
        this.f105760n = (TextView) inflate.findViewById(R.id.db4);
        this.f105763q = (ImageView) inflate.findViewById(R.id.ba7);
        this.f105761o = (TextView) inflate.findViewById(R.id.db3);
        m91755d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.km, R.attr.kn, R.attr.n_, R.attr.p9, R.attr.a36, R.attr.a38, R.attr.a39, R.attr.a3r, R.attr.a3s, R.attr.a67, R.attr.a6e});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 6) {
                this.f105760n.setText(obtainStyledAttributes.getString(index));
            } else if (index == 10) {
                this.f105760n.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics())));
            } else if (index == 9) {
                this.f105760n.setTextColor(obtainStyledAttributes.getColor(index, C0726c.m2098c(getContext(), R.color.a7w)));
            }
        }
        obtainStyledAttributes.recycle();
        this.f105762p.setOnClickListener(new C41849ad(this));
    }
}

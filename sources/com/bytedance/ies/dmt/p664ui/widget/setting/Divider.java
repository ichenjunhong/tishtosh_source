package com.bytedance.ies.dmt.p664ui.widget.setting;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.Divider */
public class Divider extends LinearLayout {

    /* renamed from: a */
    private View f28724a;

    /* renamed from: b */
    private TextView f28725b;

    /* renamed from: c */
    private View f28726c;

    public TextView getTxtLeft() {
        return this.f28725b;
    }

    public Divider(Context context) {
        this(context, null);
    }

    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Divider(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.f28724a = View.inflate(context, R.layout.at1, this);
        this.f28725b = (TextView) this.f28724a.findViewById(R.id.db4);
        this.f28726c = this.f28724a.findViewById(R.id.dl9);
        this.f28724a.setBackgroundColor(C10678c.m21502b(getContext()));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.n5, R.attr.a39});
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f28726c.setVisibility(8);
        }
        this.f28726c.setBackgroundColor(C10678c.m21504d(context));
        this.f28724a.setBackgroundColor(C10678c.m21502b(context));
        String string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string)) {
            this.f28725b.setText(string);
        } else {
            this.f28725b.setVisibility(8);
            ((MarginLayoutParams) this.f28726c.getLayoutParams()).bottomMargin = (int) C9432q.m18687b(getContext(), 8.0f);
        }
        TextView textView = this.f28725b;
        Resources resources = context.getResources();
        if (C10675b.m21498b(context)) {
            i2 = R.color.aok;
        } else {
            i2 = R.color.ars;
        }
        textView.setTextColor(resources.getColor(i2));
        obtainStyledAttributes.recycle();
    }
}

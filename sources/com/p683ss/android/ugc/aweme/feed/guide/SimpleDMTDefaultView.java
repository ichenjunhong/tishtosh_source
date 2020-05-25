package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.SimpleDMTDefaultView */
public class SimpleDMTDefaultView extends FrameLayout {

    /* renamed from: a */
    AutoCenterDmtIconButton f79109a;

    /* renamed from: b */
    ImageView f79110b;

    /* renamed from: c */
    private DmtTextView f79111c;

    /* renamed from: d */
    private DmtTextView f79112d;

    /* renamed from: a */
    public final SimpleDMTDefaultView mo60669a() {
        this.f79109a.mo60628a(C10720a.SOLID, -1, "");
        this.f79109a.setVisibility(8);
        return this;
    }

    public SimpleDMTDefaultView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo60671a(OnClickListener onClickListener) {
        this.f79109a.setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: b */
    public final SimpleDMTDefaultView mo60674b(int i) {
        this.f79109a.setMinimumWidth(i);
        return this;
    }

    /* renamed from: c */
    public final SimpleDMTDefaultView mo60675c(int i) {
        this.f79111c.setText(i);
        return this;
    }

    /* renamed from: d */
    public final SimpleDMTDefaultView mo60676d(int i) {
        this.f79112d.setText(i);
        return this;
    }

    /* renamed from: e */
    public final SimpleDMTDefaultView mo60677e(int i) {
        setPadding(0, i, 0, 0);
        return this;
    }

    /* renamed from: g */
    public final SimpleDMTDefaultView mo60679g(int i) {
        this.f79111c.setTextSize(20.0f);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo60670a(int i) {
        this.f79110b.setImageResource(R.drawable.arb);
        this.f79110b.setVisibility(0);
        return this;
    }

    /* renamed from: f */
    public final SimpleDMTDefaultView mo60678f(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f79112d.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.f79112d.setLayoutParams(marginLayoutParams);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo60673a(String str) {
        this.f79111c.setText(str);
        return this;
    }

    public SimpleDMTDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleDMTDefaultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.a7s, this, true);
        this.f79111c = (DmtTextView) findViewById(R.id.dhb);
        this.f79112d = (DmtTextView) findViewById(R.id.d98);
        this.f79109a = (AutoCenterDmtIconButton) findViewById(R.id.aq2);
        this.f79110b = (ImageView) findViewById(R.id.as_);
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo60672a(C10720a aVar, int i, int i2) {
        this.f79109a.setVisibility(0);
        this.f79109a.mo60627a(aVar, i, i2);
        return this;
    }
}

package com.bytedance.ies.dmt.p664ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar */
public class ButtonTitleBar extends AbstractTitleBar implements OnClickListener {

    /* renamed from: c */
    private ImageView f28547c;

    /* renamed from: d */
    private DmtTextView f28548d;

    /* renamed from: e */
    private C10713a f28549e;

    /* renamed from: f */
    private Drawable f28550f;

    /* renamed from: g */
    private View f28551g;

    /* renamed from: h */
    private int f28552h;

    public DmtTextView getEndBtn() {
        return this.f28548d;
    }

    public ImageView getStartBtn() {
        return this.f28547c;
    }

    public void setOnTitleBarClickListener(C10713a aVar) {
        this.f28549e = aVar;
    }

    public ButtonTitleBar(Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(int i) {
        this.f28551g.setBackgroundColor(i);
    }

    /* renamed from: a */
    public final void mo19128a(boolean z) {
        int i;
        View view = this.f28551g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        int i2;
        ImageView imageView = this.f28547c;
        if (C10675b.m21495a(i)) {
            i2 = R.drawable.c_p;
        } else {
            i2 = R.drawable.c_q;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f28549e != null) {
            if (view.getId() == R.id.ik) {
                this.f28549e.mo19166a(view);
            } else if (view.getId() == R.id.ccd) {
                this.f28549e.mo19167b(view);
            }
        }
    }

    public ButtonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonTitleBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        inflate(context, R.layout.aua, this);
        this.f28547c = (ImageView) findViewById(R.id.ik);
        this.f28545a = (DmtTextView) findViewById(R.id.title);
        this.f28548d = (DmtTextView) findViewById(R.id.ccd);
        this.f28551g = findViewById(R.id.bas);
        this.f28547c.setOnClickListener(this);
        this.f28548d.setOnClickListener(this);
        C10721b bVar = new C10721b(0.5f, 1.0f);
        this.f28547c.setOnTouchListener(bVar);
        this.f28548d.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kc, R.attr.kd, R.attr.ke, R.attr.kf, R.attr.kg, R.attr.kh, R.attr.sf, R.attr.sj, R.attr.a72, R.attr.a74, R.attr.a75});
            String string = obtainStyledAttributes.getString(8);
            float dimension = obtainStyledAttributes.getDimension(10, C9432q.m18687b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(9, -15329245);
            this.f28545a.setText(string);
            this.f28545a.setTextSize(0, dimension);
            this.f28545a.setTextColor(color);
            String string2 = obtainStyledAttributes.getString(0);
            int i3 = obtainStyledAttributes.getInt(4, 1);
            float dimension2 = obtainStyledAttributes.getDimension(3, C9432q.m18687b(context, 17.0f));
            int color2 = obtainStyledAttributes.getColor(2, 0);
            this.f28550f = obtainStyledAttributes.getDrawable(1);
            int i4 = obtainStyledAttributes.getInt(5, 0);
            this.f28548d.setText(string2);
            if (i3 == 1) {
                this.f28548d.setTypeface(Typeface.defaultFromStyle(1));
                this.f28548d.setTextColor(getResources().getColor(R.color.ao7));
            } else {
                this.f28548d.setTypeface(Typeface.defaultFromStyle(0));
                this.f28548d.setTextColor(getResources().getColor(R.color.ar1));
            }
            this.f28548d.setTextSize(0, dimension2);
            if (color2 != 0) {
                this.f28548d.setTextColor(color2);
            }
            if (this.f28550f != null) {
                this.f28548d.setBackground(this.f28550f);
            }
            this.f28548d.setVisibility(i4);
            this.f28551g.setVisibility(obtainStyledAttributes.getInt(7, 0));
            Resources resources = getResources();
            if (C10675b.m21499c()) {
                i2 = R.color.aql;
            } else {
                i2 = R.color.aqk;
            }
            this.f28552h = obtainStyledAttributes.getColor(6, resources.getColor(i2));
            this.f28551g.setBackgroundColor(this.f28552h);
            obtainStyledAttributes.recycle();
        }
        setColorMode(C10675b.m21494a().f28434a);
    }
}

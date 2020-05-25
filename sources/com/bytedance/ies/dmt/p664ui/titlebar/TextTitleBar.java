package com.bytedance.ies.dmt.p664ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
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

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.TextTitleBar */
public class TextTitleBar extends AbstractTitleBar implements OnClickListener {

    /* renamed from: c */
    public boolean f28560c;

    /* renamed from: d */
    private DmtTextView f28561d;

    /* renamed from: e */
    private DmtTextView f28562e;

    /* renamed from: f */
    private C10713a f28563f;

    /* renamed from: g */
    private ImageView f28564g;

    /* renamed from: h */
    private View f28565h;

    /* renamed from: i */
    private int f28566i;

    public ImageView getBackBtn() {
        return this.f28564g;
    }

    public DmtTextView getEndText() {
        return this.f28562e;
    }

    public DmtTextView getStartText() {
        return this.f28561d;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28545a.setMaxWidth((int) Math.max((float) (((C9432q.m18670a(getContext()) / 2) - Math.max(this.f28561d.getMeasuredWidth(), this.f28562e.getMeasuredWidth())) * 2), C9432q.m18687b(getContext(), 112.0f)));
    }

    public void setOnTitleBarClickListener(C10713a aVar) {
        this.f28563f = aVar;
    }

    public TextTitleBar(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void mo19149b(boolean z) {
        this.f28565h.setVisibility(8);
    }

    public void setDividerLineBackground(int i) {
        this.f28565h.setBackgroundColor(i);
    }

    public void setEndText(int i) {
        this.f28562e.setText(i);
    }

    public void setEndTextColor(int i) {
        this.f28562e.setTextColor(i);
    }

    public void setEndTextSize(float f) {
        this.f28562e.setTextSize(f);
    }

    public void setLineBackground(int i) {
        this.f28565h.setBackgroundColor(i);
    }

    public void setStartText(int i) {
        this.f28561d.setText(i);
    }

    public void setStartTextColor(int i) {
        this.f28561d.setTextColor(i);
    }

    public void setStartTextSize(float f) {
        this.f28561d.setTextSize(f);
    }

    /* renamed from: a */
    public final void mo19128a(boolean z) {
        int i;
        View view = this.f28565h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setEndText(CharSequence charSequence) {
        this.f28562e.setText(charSequence);
    }

    public void setStartText(CharSequence charSequence) {
        this.f28561d.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        int i2;
        ImageView imageView = this.f28564g;
        if (C10675b.m21495a(i)) {
            i2 = R.drawable.c_p;
        } else {
            i2 = R.drawable.c_q;
        }
        imageView.setImageResource(i2);
    }

    public void onClick(View view) {
        if (this.f28563f != null) {
            if (view.getId() == R.id.ik || view.getId() == R.id.cyr) {
                this.f28563f.mo19166a(view);
            } else if (view.getId() == R.id.cz3) {
                this.f28563f.mo19167b(view);
            }
        }
    }

    public void setUseBackIcon(boolean z) {
        int i;
        if (this.f28560c != z) {
            this.f28560c = z;
            ImageView imageView = this.f28564g;
            int i2 = 8;
            if (this.f28560c) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            DmtTextView dmtTextView = this.f28561d;
            if (!this.f28560c) {
                i2 = 0;
            }
            dmtTextView.setVisibility(i2);
        }
    }

    public TextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextTitleBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        inflate(context, R.layout.avz, this);
        this.f28561d = (DmtTextView) findViewById(R.id.cyr);
        this.f28545a = (DmtTextView) findViewById(R.id.title);
        this.f28562e = (DmtTextView) findViewById(R.id.cz3);
        this.f28564g = (ImageView) findViewById(R.id.ik);
        this.f28565h = findViewById(R.id.bas);
        this.f28564g.setOnClickListener(this);
        this.f28561d.setOnClickListener(this);
        this.f28562e.setOnClickListener(this);
        C10721b bVar = new C10721b(0.5f, 1.0f);
        this.f28564g.setOnTouchListener(bVar);
        this.f28561d.setOnTouchListener(bVar);
        this.f28562e.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kn, R.attr.ko, R.attr.kp, R.attr.kq, R.attr.sf, R.attr.sj, R.attr.a39, R.attr.a3_, R.attr.a3a, R.attr.a72, R.attr.a74, R.attr.a75, R.attr.a_7});
            String string = obtainStyledAttributes.getString(10);
            float dimension = obtainStyledAttributes.getDimension(12, C9432q.m18687b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(11, -15329245);
            this.f28545a.setText(string);
            this.f28545a.setTextSize(0, dimension);
            this.f28545a.setTextColor(color);
            this.f28560c = obtainStyledAttributes.getBoolean(13, false);
            if (this.f28560c) {
                this.f28564g.setVisibility(0);
                this.f28561d.setVisibility(8);
            } else {
                String string2 = obtainStyledAttributes.getString(7);
                float dimension2 = obtainStyledAttributes.getDimension(9, C9432q.m18687b(context, 15.0f));
                int color2 = obtainStyledAttributes.getColor(8, -15329245);
                this.f28564g.setVisibility(8);
                this.f28561d.setVisibility(0);
                this.f28561d.setText(string2);
                this.f28561d.setTextSize(0, dimension2);
                this.f28561d.setTextColor(color2);
            }
            String string3 = obtainStyledAttributes.getString(1);
            float dimension3 = obtainStyledAttributes.getDimension(3, C9432q.m18687b(context, 15.0f));
            int color3 = obtainStyledAttributes.getColor(2, -15329245);
            int i3 = obtainStyledAttributes.getInt(4, 0);
            this.f28562e.setText(string3);
            this.f28562e.setTextSize(0, dimension3);
            this.f28562e.setTextColor(color3);
            this.f28562e.setVisibility(i3);
            if (obtainStyledAttributes.getInt(0, 1) == 1) {
                this.f28562e.setTypeface(Typeface.defaultFromStyle(1));
                this.f28562e.setTextColor(getResources().getColor(R.color.ao7));
            } else {
                this.f28562e.setTypeface(Typeface.defaultFromStyle(0));
                this.f28562e.setTextColor(getResources().getColor(R.color.ar1));
            }
            this.f28565h.setVisibility(obtainStyledAttributes.getInt(6, 0));
            Resources resources = getResources();
            if (C10675b.m21499c()) {
                i2 = R.color.aql;
            } else {
                i2 = R.color.aqk;
            }
            this.f28566i = obtainStyledAttributes.getColor(5, resources.getColor(i2));
            this.f28565h.setBackgroundColor(this.f28566i);
            obtainStyledAttributes.recycle();
        }
        setColorMode(C10675b.m21494a().f28434a);
    }
}

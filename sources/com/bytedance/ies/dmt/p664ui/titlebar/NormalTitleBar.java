package com.bytedance.ies.dmt.p664ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar */
public class NormalTitleBar extends AbstractTitleBar implements OnClickListener {

    /* renamed from: c */
    private ImageView f28553c;

    /* renamed from: d */
    private ImageView f28554d;

    /* renamed from: e */
    private C10713a f28555e;

    /* renamed from: f */
    private Drawable f28556f;

    /* renamed from: g */
    private View f28557g;

    /* renamed from: h */
    private int f28558h;

    /* renamed from: i */
    private DmtTextView f28559i;

    public ImageView getEndBtn() {
        return this.f28554d;
    }

    public ImageView getStartBtn() {
        return this.f28553c;
    }

    public void setOnTitleBarClickListener(C10713a aVar) {
        this.f28555e = aVar;
    }

    public NormalTitleBar(Context context) {
        this(context, null);
    }

    public void setDividerLineBackground(int i) {
        this.f28557g.setBackgroundColor(i);
    }

    public void setEndBtnIcon(int i) {
        this.f28554d.setImageResource(i);
    }

    public void setStartBtnIcon(int i) {
        this.f28553c.setImageResource(i);
    }

    public void setStartTextSize(float f) {
        this.f28559i.setTextSize(0, f);
    }

    /* renamed from: a */
    public final void mo19128a(boolean z) {
        int i;
        View view = this.f28557g;
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
        ImageView imageView = this.f28553c;
        if (C10675b.m21495a(i)) {
            i2 = R.drawable.c_p;
        } else {
            i2 = R.drawable.c_q;
        }
        imageView.setImageResource(i2);
    }

    public void setStartText(String str) {
        this.f28553c.setVisibility(8);
        this.f28559i.setVisibility(0);
        this.f28559i.setText(str);
    }

    public void onClick(View view) {
        if (this.f28555e != null) {
            if (view.getId() == R.id.ik || view.getId() == R.id.cyr) {
                this.f28555e.mo19166a(view);
            } else if (view.getId() == R.id.ccd) {
                this.f28555e.mo19167b(view);
            }
        }
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NormalTitleBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        inflate(context, R.layout.av9, this);
        this.f28553c = (ImageView) findViewById(R.id.ik);
        this.f28545a = (DmtTextView) findViewById(R.id.title);
        this.f28554d = (ImageView) findViewById(R.id.ccd);
        this.f28557g = findViewById(R.id.bas);
        this.f28559i = (DmtTextView) findViewById(R.id.cyr);
        this.f28553c.setOnClickListener(this);
        this.f28554d.setOnClickListener(this);
        this.f28559i.setOnClickListener(this);
        C10721b bVar = new C10721b(0.5f, 1.0f);
        this.f28553c.setOnTouchListener(bVar);
        this.f28554d.setOnTouchListener(bVar);
        this.f28559i.setOnTouchListener(bVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kj, R.attr.sf, R.attr.sj, R.attr.a72, R.attr.a74, R.attr.a75});
            String string = obtainStyledAttributes.getString(3);
            float dimension = obtainStyledAttributes.getDimension(5, C9432q.m18687b(context, 17.0f));
            int color = obtainStyledAttributes.getColor(4, -15329245);
            this.f28545a.setText(string);
            this.f28545a.setTextSize(0, dimension);
            this.f28545a.setTextColor(color);
            this.f28556f = obtainStyledAttributes.getDrawable(0);
            if (this.f28556f != null) {
                this.f28554d.setImageDrawable(this.f28556f);
            }
            this.f28557g.setVisibility(obtainStyledAttributes.getInt(2, 0));
            Resources resources = getResources();
            if (C10675b.m21499c()) {
                i2 = R.color.aql;
            } else {
                i2 = R.color.aqk;
            }
            this.f28558h = obtainStyledAttributes.getColor(1, resources.getColor(i2));
            this.f28557g.setBackgroundColor(this.f28558h);
            obtainStyledAttributes.recycle();
        }
        setColorMode(C10675b.m21494a().f28434a);
    }
}

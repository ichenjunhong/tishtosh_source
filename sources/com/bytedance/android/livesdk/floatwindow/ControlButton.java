package com.bytedance.android.livesdk.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class ControlButton extends LinearLayout {

    /* renamed from: a */
    public boolean f19457a;

    /* renamed from: b */
    public C7168a f19458b;

    /* renamed from: c */
    private View f19459c;

    /* renamed from: d */
    private int f19460d;

    /* renamed from: e */
    private int f19461e;

    /* renamed from: f */
    private int f19462f;

    /* renamed from: g */
    private int f19463g;

    /* renamed from: h */
    private int f19464h;

    /* renamed from: i */
    private int f19465i;

    /* renamed from: j */
    private ImageView f19466j;

    /* renamed from: k */
    private TextView f19467k;

    /* renamed from: com.bytedance.android.livesdk.floatwindow.ControlButton$a */
    public interface C7168a {
        /* renamed from: a */
        void mo9162a();
    }

    private int getLayoutId() {
        return R.layout.apl;
    }

    /* renamed from: b */
    private void m14864b() {
        inflate(getContext(), getLayoutId(), this);
        this.f19459c = findViewById(R.id.zb);
        this.f19466j = (ImageView) findViewById(R.id.b1k);
        this.f19467k = (TextView) findViewById(R.id.d98);
        this.f19459c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ControlButton.this.f19457a = !ControlButton.this.f19457a;
                ControlButton.this.mo13294a();
                if (ControlButton.this.f19458b != null) {
                    ControlButton.this.f19458b.mo9162a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo13294a() {
        if (this.f19457a) {
            this.f19466j.setImageResource(this.f19461e);
            this.f19467k.setTextColor(getResources().getColor(this.f19463g));
            this.f19467k.setText(this.f19465i);
            return;
        }
        this.f19466j.setImageResource(this.f19460d);
        this.f19467k.setTextColor(getResources().getColor(this.f19462f));
        this.f19467k.setText(this.f19464h);
    }

    public void setOnViewClickListener(C7168a aVar) {
        this.f19458b = aVar;
    }

    public ControlButton(Context context) {
        super(context);
        m14864b();
    }

    public void setChecked(boolean z) {
        this.f19457a = z;
        mo13294a();
    }

    public ControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14864b();
    }

    public ControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14864b();
    }

    public ControlButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m14864b();
    }

    /* renamed from: a */
    public final void mo13295a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.f19460d = i;
        this.f19461e = i2;
        this.f19462f = R.color.alt;
        this.f19463g = i4;
        this.f19464h = i5;
        this.f19465i = i6;
        this.f19457a = z;
        mo13294a();
    }
}

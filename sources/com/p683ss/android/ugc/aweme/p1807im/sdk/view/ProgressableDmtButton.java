package com.p683ss.android.ugc.aweme.p1807im.sdk.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.view.ProgressableDmtButton */
public class ProgressableDmtButton extends RelativeLayout {

    /* renamed from: a */
    private DmtButton f90732a;

    /* renamed from: b */
    private ProgressBar f90733b;

    /* renamed from: c */
    private TextView f90734c;

    /* renamed from: d */
    private int f90735d;

    /* renamed from: c */
    private void m79961c() {
        this.f90733b = (ProgressBar) findViewById(R.id.bwx);
    }

    /* renamed from: d */
    private void m79962d() {
        this.f90734c = (TextView) findViewById(R.id.d9l);
    }

    /* renamed from: b */
    private void m79960b() {
        this.f90732a = (DmtButton) findViewById(R.id.a7v);
        this.f90732a.setText(this.f90735d);
    }

    /* renamed from: e */
    private void m79963e() {
        this.f90732a.setVisibility(0);
        this.f90733b.setVisibility(8);
        this.f90734c.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo73515a() {
        this.f90732a.setVisibility(8);
        this.f90733b.setVisibility(0);
        this.f90734c.setVisibility(0);
    }

    public ProgressableDmtButton(Context context) {
        super(context);
        m79959a(context, null);
    }

    public void setButtonText(int i) {
        this.f90732a.setText(i);
    }

    public void setOnButtonClickListener(OnClickListener onClickListener) {
        this.f90732a.setOnClickListener(onClickListener);
    }

    public void setOnProgressBarClickListener(OnClickListener onClickListener) {
        this.f90734c.setOnClickListener(onClickListener);
    }

    public void setProgress(int i) {
        this.f90733b.setProgress(i);
    }

    public void setProgressText(String str) {
        this.f90734c.setText(str);
    }

    public void setButtonText(String str) {
        this.f90732a.setText(str);
    }

    public ProgressableDmtButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m79959a(context, attributeSet);
    }

    /* renamed from: a */
    private void m79959a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            inflate(context, R.layout.bg0, this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vg});
            this.f90735d = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            m79960b();
            m79961c();
            m79962d();
            m79963e();
            return;
        }
        throw new IllegalArgumentException("Only support xml declare!");
    }

    public ProgressableDmtButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m79959a(context, attributeSet);
    }
}

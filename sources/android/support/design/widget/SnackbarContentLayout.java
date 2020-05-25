package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.p029g.C0433a;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class SnackbarContentLayout extends LinearLayout implements C0433a {

    /* renamed from: a */
    private TextView f1759a;

    /* renamed from: b */
    private Button f1760b;

    /* renamed from: c */
    private int f1761c;

    /* renamed from: d */
    private int f1762d;

    public Button getActionView() {
        return this.f1760b;
    }

    public TextView getMessageView() {
        return this.f1759a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1759a = (TextView) findViewById(R.id.cq2);
        this.f1760b = (Button) findViewById(R.id.cq1);
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.k_, R.attr.tr});
        this.f1761c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1762d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1031a(int i, int i2) {
        this.f1759a.setAlpha(0.0f);
        this.f1759a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f1760b.getVisibility() == 0) {
            this.f1760b.setAlpha(0.0f);
            this.f1760b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    /* renamed from: b */
    public final void mo1032b(int i, int i2) {
        this.f1759a.setAlpha(1.0f);
        this.f1759a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f1760b.getVisibility() == 0) {
            this.f1760b.setAlpha(1.0f);
            this.f1760b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (m1378a(1, r0, r0 - r1) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (m1378a(0, r0, r0) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f1761c
            if (r0 <= 0) goto L_0x001a
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f1761c
            if (r0 <= r1) goto L_0x001a
            int r8 = r7.f1761c
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            super.onMeasure(r8, r9)
        L_0x001a:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131886405(0x7f120145, float:1.9407388E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131886404(0x7f120144, float:1.9407386E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f1759a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r2 == 0) goto L_0x005a
            int r5 = r7.f1762d
            if (r5 <= 0) goto L_0x005a
            android.widget.Button r5 = r7.f1760b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f1762d
            if (r5 <= r6) goto L_0x005a
            int r1 = r0 - r1
            boolean r0 = r7.m1378a(r4, r0, r1)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x005a:
            if (r2 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            boolean r0 = r7.m1378a(r3, r0, r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            super.onMeasure(r8, r9)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SnackbarContentLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private static void m1377a(View view, int i, int i2) {
        if (C1056u.m3075u(view)) {
            C1056u.m3044b(view, C1056u.m3061i(view), i, C1056u.m3063j(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m1378a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1759a.getPaddingTop() == i2 && this.f1759a.getPaddingBottom() == i3) {
            return z;
        }
        m1377a((View) this.f1759a, i2, i3);
        return true;
    }
}

package com.bytedance.ies.dmt.p664ui.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.BadgeView */
public class BadgeView extends DmtTextView {

    /* renamed from: b */
    private int f28443b;

    /* renamed from: c */
    private int f28444c;

    /* renamed from: d */
    private int f28445d;

    /* renamed from: e */
    private CharSequence f28446e;

    /* renamed from: a */
    private void m21514a() {
        int measuredHeight = getMeasuredHeight();
        if (this.f28445d != measuredHeight) {
            this.f28445d = measuredHeight;
            m21515a(this.f28445d, this.f28443b);
        }
    }

    /* renamed from: c */
    private void m21518c() {
        int i;
        int i2;
        if (this.f28444c == 2) {
            i2 = (int) C9432q.m18687b(getContext(), 4.0f);
            i = i2;
        } else {
            i2 = 0;
            i = 0;
        }
        super.setPadding(i2, 0, i, 0);
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21516b() {
        /*
            r3 = this;
            int r0 = r3.f28444c
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.Context r0 = r3.getContext()
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
        L_0x0010:
            r1 = r0
            goto L_0x0034
        L_0x0012:
            android.content.Context r0 = r3.getContext()
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            int r1 = r3.getMeasuredWidth()
            if (r1 >= r0) goto L_0x0024
            goto L_0x0010
        L_0x0024:
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0034
        L_0x0028:
            android.content.Context r0 = r3.getContext()
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            goto L_0x0010
        L_0x0034:
            r3.setMeasuredDimension(r0, r1)
            r3.m21514a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.common.views.BadgeView.m21516b():void");
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    public void setCount(int i) {
        setText(String.valueOf(i));
    }

    public void setBadgeColor(int i) {
        this.f28443b = i;
        m21515a(this.f28445d, this.f28443b);
    }

    /* renamed from: b */
    private void m21517b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.c1, R.attr.c2});
        this.f28443b = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.za));
        setMode(obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
    }

    public void setMode(int i) {
        if (this.f28444c != i) {
            this.f28444c = i;
            if (this.f28444c != 2) {
                this.f28446e = getText();
                setText("");
            } else if (TextUtils.isEmpty(getText()) && !TextUtils.isEmpty(this.f28446e)) {
                setText(this.f28446e);
            }
            m21518c();
            m21516b();
        }
    }

    /* renamed from: a */
    public final void mo19032a(AttributeSet attributeSet) {
        super.mo19032a(attributeSet);
        m21517b(attributeSet);
        setTextSize(1, 12.0f);
        setGravity(17);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m21516b();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(1, 12.0f);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m21515a(int i, int i2) {
        float b = (float) ((int) C9432q.m18687b(getContext(), (float) i));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{b, b, b, b, b, b, b, b}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        CharSequence charSequence2;
        if (this.f28444c != 2 || TextUtils.isEmpty(charSequence)) {
            this.f28446e = charSequence;
            charSequence2 = "";
        } else {
            try {
                Integer valueOf = Integer.valueOf(charSequence.toString());
                if (valueOf.intValue() > 99) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("99+");
                    spannableStringBuilder.setSpan(new C10690b("+"), 2, 3, 17);
                    charSequence2 = spannableStringBuilder;
                } else if (valueOf.intValue() < 0) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence;
                }
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("Excepted a int but get ");
                sb.append(charSequence);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        super.setText(charSequence2, bufferType);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28444c = -1;
        mo19032a(attributeSet);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        m21518c();
    }
}

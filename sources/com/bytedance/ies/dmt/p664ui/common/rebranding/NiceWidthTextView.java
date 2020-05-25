package com.bytedance.ies.dmt.p664ui.common.rebranding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a.C10684a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView */
public class NiceWidthTextView extends DmtTextView {

    /* renamed from: b */
    public C10685b f28439b;

    public NiceWidthTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final NiceWidthTextView mo19030a(C10685b bVar) {
        this.f28439b = bVar;
        return this;
    }

    public NiceWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f28439b != null) {
            C10684a a = C10683a.m21509a(this.f28439b.getClass());
            if (a == null || !a.f28441a) {
                i3 = this.f28439b.mo19031a(this);
                C10683a.m21511a(this.f28439b.getClass(), new C10684a(i3));
            } else {
                i3 = a.f28442b;
            }
            i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public NiceWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

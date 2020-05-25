package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.StateDmtTextView */
public class StateDmtTextView extends DmtTextView {

    /* renamed from: b */
    private C26649a f70249b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.StateDmtTextView$a */
    public interface C26649a {
        /* renamed from: a */
        void mo54482a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C26649a aVar = this.f70249b;
        if (aVar != null) {
            aVar.mo54482a();
        }
    }

    public StateDmtTextView(Context context) {
        super(context);
    }

    public void setOnStateChangedListener(C26649a aVar) {
        this.f70249b = aVar;
    }

    public StateDmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateDmtTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

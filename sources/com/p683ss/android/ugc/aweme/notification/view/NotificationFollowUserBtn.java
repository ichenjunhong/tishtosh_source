package com.p683ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.support.p030v4.widget.C1115o;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn */
public class NotificationFollowUserBtn extends FollowUserBtn {
    public NotificationFollowUserBtn(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final int mo19031a(TextView textView) {
        return C38432d.m85744a(textView.getContext());
    }

    /* renamed from: a */
    private void m85788a(int i) {
        if (this.f84041a != null) {
            C1115o.m3256a((TextView) this.f84041a, i);
            this.f84041a.setPadding(8, 0, 8, 0);
            this.f84041a.setFontType(C10751d.f28908g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (r8.measureText(getContext().getString(com.ss.android.ugc.trill.R.string.gfm)) >= 110.0f) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFollowButtonTextAndIcon(int r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r0) goto L_0x0069
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment> r2 = com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment.class
            r3 = 1
            java.lang.String r4 = "follow_to_follow_back_experiment"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            int r1 = r1.mo18168a(r2, r3, r4, r5, r6)
            int r2 = com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment.EXPERIMENT_TWO
            r3 = 0
            if (r1 != r2) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x0069
            android.content.res.Resources r8 = r7.getResources()
            if (r8 != 0) goto L_0x0024
            return
        L_0x0024:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r8 = r7.f84041a
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2132544752(0x7f1c0cf0, float:2.0742674E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            r8.setText(r1)
            android.content.Context r8 = r7.getContext()
            if (r8 == 0) goto L_0x005f
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            com.bytedance.ies.dmt.ui.widget.util.b r1 = com.bytedance.ies.dmt.p664ui.widget.util.C10749b.m21787a()
            java.lang.String r4 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            android.graphics.Typeface r1 = r1.mo19435a(r4)
            r8.setTypeface(r1)
            android.content.Context r1 = r7.getContext()
            java.lang.String r1 = r1.getString(r2)
            float r8 = r8.measureText(r1)
            r1 = 1121714176(0x42dc0000, float:110.0)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r0 == 0) goto L_0x0072
            r8 = 2132607827(0x7f1d0353, float:2.0870606E38)
            r7.m85788a(r8)
            return
        L_0x0069:
            super.setFollowButtonTextAndIcon(r8)
            r8 = 2132607833(0x7f1d0359, float:2.0870618E38)
            r7.m85788a(r8)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn.setFollowButtonTextAndIcon(int):void");
    }

    public NotificationFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo65360a(int i, int i2) {
        m85788a((int) R.style.un);
        super.mo65360a(i, i2);
    }

    public NotificationFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

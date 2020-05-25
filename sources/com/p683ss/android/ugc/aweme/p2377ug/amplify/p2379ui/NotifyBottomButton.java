package com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton */
public final class NotifyBottomButton extends RelativeLayout {

    /* renamed from: a */
    public DmtTextView f119660a;

    /* renamed from: b */
    public DmtTextView f119661b;

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a */
    static final class C47429a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NotifyBottomButton f119662a;

        /* renamed from: b */
        final /* synthetic */ String f119663b;

        /* renamed from: c */
        final /* synthetic */ String f119664c;

        /* renamed from: d */
        final /* synthetic */ C52671b f119665d;

        /* renamed from: e */
        final /* synthetic */ C52671b f119666e;

        C47429a(NotifyBottomButton notifyBottomButton, String str, String str2, C52671b bVar, C52671b bVar2) {
            this.f119662a = notifyBottomButton;
            this.f119663b = str;
            this.f119664c = str2;
            this.f119665d = bVar;
            this.f119666e = bVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00db A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton r0 = r7.f119662a
                java.lang.String r1 = r7.f119663b
                java.lang.String r2 = r7.f119664c
                r0.removeAllViews()
                android.content.Context r3 = r0.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r4 = r0
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r5 = 0
                r6 = 2132214469(0x7f1702c5, float:2.007278E38)
                android.view.View r3 = r3.inflate(r6, r4, r5)
                int r4 = r0.getMeasuredWidth()
                int r4 = r4 / 2
                r6 = 2132019516(0x7f14093c, float:1.967737E38)
                android.view.View r6 = r3.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
                r0.f119660a = r6
                r6 = 2132019517(0x7f14093d, float:1.9677371E38)
                android.view.View r6 = r3.findViewById(r6)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
                r0.f119661b = r6
                com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.f119660a
                if (r6 == 0) goto L_0x0041
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r6.setText(r1)
            L_0x0041:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f119661b
                if (r1 == 0) goto L_0x004a
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
            L_0x004a:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f119660a
                java.lang.Float r1 = com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.NotifyBottomButton.m102803a(r1)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f119661b
                java.lang.Float r2 = com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.NotifyBottomButton.m102803a(r2)
                r6 = 0
                if (r1 == 0) goto L_0x005e
                float r1 = r1.floatValue()
                goto L_0x005f
            L_0x005e:
                r1 = 0
            L_0x005f:
                float r4 = (float) r4
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 > 0) goto L_0x0074
                if (r2 == 0) goto L_0x006a
                float r6 = r2.floatValue()
            L_0x006a:
                int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x006f
                goto L_0x0074
            L_0x006f:
                r0.addView(r3)
                r0 = 1
                goto L_0x0075
            L_0x0074:
                r0 = 0
            L_0x0075:
                if (r0 != 0) goto L_0x00ba
                com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton r0 = r7.f119662a
                java.lang.String r1 = r7.f119663b
                java.lang.String r2 = r7.f119664c
                android.content.Context r3 = r0.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r4 = 2132214470(0x7f1702c6, float:2.0072783E38)
                r6 = r0
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                android.view.View r3 = r3.inflate(r4, r6, r5)
                r4 = 2132024458(0x7f141c8a, float:1.9687393E38)
                android.view.View r4 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
                r0.f119660a = r4
                r4 = 2132024459(0x7f141c8b, float:1.9687395E38)
                android.view.View r4 = r3.findViewById(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
                r0.f119661b = r4
                com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r0.f119660a
                if (r4 == 0) goto L_0x00ae
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r4.setText(r1)
            L_0x00ae:
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f119661b
                if (r1 == 0) goto L_0x00b7
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
            L_0x00b7:
                r0.addView(r3)
            L_0x00ba:
                com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton r0 = r7.f119662a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f119660a
                if (r0 == 0) goto L_0x00ca
                com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a$1 r1 = new com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a$1
                r1.<init>(r7)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
            L_0x00ca:
                com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton r0 = r7.f119662a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f119661b
                if (r0 == 0) goto L_0x00db
                com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a$2 r1 = new com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a$2
                r1.<init>(r7)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                return
            L_0x00db:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.NotifyBottomButton.C47429a.run():void");
        }
    }

    public NotifyBottomButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public NotifyBottomButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    static Float m102803a(DmtTextView dmtTextView) {
        if (dmtTextView != null) {
            TextPaint paint = dmtTextView.getPaint();
            if (paint != null) {
                return Float.valueOf(paint.measureText(dmtTextView.getText().toString()) + ((float) dmtTextView.getPaddingLeft()) + ((float) dmtTextView.getPaddingRight()));
            }
        }
        return null;
    }

    public NotifyBottomButton(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ NotifyBottomButton(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

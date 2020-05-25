package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.SpannableString;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.v */
final /* synthetic */ class C24762v implements OnClickListener {

    /* renamed from: a */
    private final ImageView f65549a;

    /* renamed from: b */
    private final ViewGroup f65550b;

    /* renamed from: c */
    private final TextView f65551c;

    /* renamed from: d */
    private final SpannableString f65552d;

    /* renamed from: e */
    private final Challenge f65553e;

    /* renamed from: f */
    private final boolean f65554f;

    /* renamed from: g */
    private final SpannableString f65555g;

    /* renamed from: h */
    private final TextView f65556h;

    C24762v(ImageView imageView, ViewGroup viewGroup, TextView textView, SpannableString spannableString, Challenge challenge, boolean z, SpannableString spannableString2, TextView textView2) {
        this.f65549a = imageView;
        this.f65550b = viewGroup;
        this.f65551c = textView;
        this.f65552d = spannableString;
        this.f65553e = challenge;
        this.f65554f = z;
        this.f65555g = spannableString2;
        this.f65556h = textView2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [android.view.ViewGroup]
      assigns: [android.view.ViewGroup, android.view.View]
      uses: [android.view.ViewGroup, ?[OBJECT, ARRAY], android.view.View]
      mth insns count: 75
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r12)
            android.widget.ImageView r12 = r11.f65549a
            android.view.ViewGroup r0 = r11.f65550b
            android.widget.TextView r1 = r11.f65551c
            android.text.SpannableString r2 = r11.f65552d
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r11.f65553e
            boolean r4 = r11.f65554f
            android.text.SpannableString r5 = r11.f65555g
            android.widget.TextView r6 = r11.f65556h
            boolean r7 = r12.isSelected()
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            if (r7 != 0) goto L_0x0065
            android.content.Context r9 = r1.getContext()
            java.lang.String r2 = r2.toString()
            java.lang.String r10 = r3.getCid()
            java.lang.String r3 = r3.getChallengeName()
            android.text.SpannableString r2 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24684f.m60189a(r9, r2, r10, r3)
            r1.setText(r2)
            com.ss.android.ugc.aweme.challenge.ui.header.e r2 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24681e.m60183a()
            r1.setOnTouchListener(r2)
            int r2 = com.p683ss.android.ugc.aweme.challenge.p1500ui.C24755p.m60284a(r7)
            r12.setImageResource(r2)
            if (r4 == 0) goto L_0x0054
            android.content.Context r2 = r12.getContext()
            r3 = 1101004800(0x41a00000, float:20.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r8.bottomMargin = r2
            goto L_0x0062
        L_0x0054:
            android.content.res.Resources r2 = r12.getResources()
            r3 = 2131886276(0x7f1200c4, float:1.9407126E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            r8.topMargin = r2
        L_0x0062:
            r0.setLayoutParams(r8)
        L_0x0065:
            if (r7 == 0) goto L_0x0090
            r1.setText(r5)
            int r2 = com.p683ss.android.ugc.aweme.challenge.p1500ui.C24755p.m60284a(r7)
            r12.setImageResource(r2)
            if (r4 == 0) goto L_0x0081
            android.content.Context r2 = r12.getContext()
            r3 = 1094713344(0x41400000, float:12.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r8.bottomMargin = r2
            goto L_0x008d
        L_0x0081:
            android.content.Context r2 = r12.getContext()
            r3 = 0
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r8.topMargin = r2
        L_0x008d:
            r0.setLayoutParams(r8)
        L_0x0090:
            android.content.Context r1 = r1.getContext()
            if (r7 == 0) goto L_0x009a
            r2 = 2132544746(0x7f1c0cea, float:2.0742662E38)
            goto L_0x009d
        L_0x009a:
            r2 = 2132544501(0x7f1c0bf5, float:2.0742165E38)
        L_0x009d:
            java.lang.String r1 = r1.getString(r2)
            r6.setText(r1)
            r1 = r7 ^ 1
            r12.setSelected(r1)
            if (r7 != 0) goto L_0x00cc
        L_0x00ab:
            boolean r12 = r0 instanceof android.view.View
            if (r12 == 0) goto L_0x00c2
            android.view.ViewParent r12 = r0.getParent()
            boolean r12 = r12 instanceof android.view.View
            if (r12 == 0) goto L_0x00c2
            android.view.ViewParent r12 = r0.getParent()
            r0 = r12
            android.view.View r0 = (android.view.View) r0
            boolean r12 = r0 instanceof com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
            if (r12 == 0) goto L_0x00ab
        L_0x00c2:
            boolean r12 = r0 instanceof com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
            if (r12 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r0 = (com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout) r0
            r12 = 0
            r0.scrollTo(r12, r12)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.C24762v.onClick(android.view.View):void");
    }
}

package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.x */
public final class C32552x extends C26844j {

    /* renamed from: a */
    public List<SummonFriendItem> f84765a = new ArrayList();

    /* renamed from: b */
    public int f84766b;

    /* renamed from: c */
    public String f84767c;

    /* renamed from: d */
    public C32554a f84768d;

    /* renamed from: e */
    private String f84769e;

    /* renamed from: f */
    private int f84770f;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.x$a */
    public interface C32554a {
        /* renamed from: a */
        String mo65853a();
    }

    /* renamed from: c */
    public final int mo48636c() {
        if (this.f84765a == null) {
            return 0;
        }
        return this.f84765a.size();
    }

    /* renamed from: a */
    public final void mo65852a(List<SummonFriendItem> list) {
        this.f84765a = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        return ((SummonFriendItem) this.f84765a.get(i)).type;
    }

    public C32552x(String str, int i) {
        this.f84769e = str;
        this.f84770f = i;
        registerAdapterDataObserver(new C1324c() {
            /* renamed from: a */
            public final void mo4984a() {
                C32552x.this.f84766b = C32552x.this.getItemCount();
            }

            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                C32552x.this.f84766b = C32552x.this.getItemCount();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                C32552x.this.f84766b = C32552x.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo4985a(int i, int i2) {
                C32552x.this.f84766b = C32552x.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo4986a(int i, int i2, int i3) {
                C32552x.this.f84766b = C32552x.this.getItemCount();
            }
        });
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return new C32556z(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0x, viewGroup, false), this.f84769e, this.f84770f);
        }
        return new C32555y(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0w, viewGroup, false));
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.text.SpannableString] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v19, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v14
      assigns: []
      uses: []
      mth insns count: 115
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.getItemViewType(r12)
            r1 = 2
            if (r0 == r1) goto L_0x0120
            com.ss.android.ugc.aweme.friends.adapter.z r11 = (com.p683ss.android.ugc.aweme.friends.adapter.C32556z) r11
            com.ss.android.ugc.aweme.friends.adapter.x$a r0 = r10.f84768d
            r11.f84778f = r0
            java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r0 = r10.f84765a
            java.lang.Object r12 = r0.get(r12)
            com.ss.android.ugc.aweme.friends.model.SummonFriendItem r12 = (com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem) r12
            java.lang.String r0 = r10.f84767c
            if (r12 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.profile.model.User r1 = r12.mUser
            if (r1 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.profile.model.User r1 = r12.mUser
            com.ss.android.ugc.aweme.services.IMainService r2 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r2 = (com.p683ss.android.ugc.aweme.services.IMainService) r2
            java.lang.String r3 = "Message"
            boolean r2 = r2.shouldChangeToHandle(r3)
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r1)
            if (r2 != 0) goto L_0x0036
            java.lang.String r2 = ""
            goto L_0x003a
        L_0x0036:
            java.lang.String r2 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r1)
        L_0x003a:
            java.lang.String r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103666o(r1)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ""
            goto L_0x0047
        L_0x0043:
            java.lang.String r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103666o(r1)
        L_0x0047:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r3)
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r3 = r12.segments
            if (r3 == 0) goto L_0x006f
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r3 = r12.segments
            java.util.Iterator r3 = r3.iterator()
        L_0x0056:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x006f
            java.lang.Object r5 = r3.next()
            com.ss.android.ugc.aweme.challenge.model.Segment r5 = (com.p683ss.android.ugc.aweme.challenge.model.Segment) r5
            if (r5 == 0) goto L_0x0056
            int r6 = r5.begin
            int r5 = r5.end
            int r5 = r5 + 1
            android.text.SpannableString r4 = r11.mo65854a(r4, r6, r5)
            goto L_0x0056
        L_0x006f:
            android.widget.TextView r3 = r11.f84774b
            r3.setText(r4)
            goto L_0x00cf
        L_0x0075:
            android.widget.TextView r2 = r11.f84774b
            java.lang.String r3 = r1.getSignature()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x008f
            android.widget.TextView r3 = r11.f84774b
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2132542050(0x7f1c0262, float:2.0737194E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0093
        L_0x008f:
            java.lang.String r3 = r1.getSignature()
        L_0x0093:
            r2.setText(r3)
            android.text.SpannableString r2 = new android.text.SpannableString
            com.ss.android.ugc.aweme.profile.model.User r3 = r12.mUser
            java.lang.String r3 = r3.getNickname()
            if (r3 != 0) goto L_0x00a3
            java.lang.String r3 = ""
            goto L_0x00a9
        L_0x00a3:
            com.ss.android.ugc.aweme.profile.model.User r3 = r12.mUser
            java.lang.String r3 = r3.getNickname()
        L_0x00a9:
            r2.<init>(r3)
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r3 = r12.segments
            if (r3 == 0) goto L_0x00cf
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r3 = r12.segments
            java.util.Iterator r3 = r3.iterator()
        L_0x00b6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00cf
            java.lang.Object r4 = r3.next()
            com.ss.android.ugc.aweme.challenge.model.Segment r4 = (com.p683ss.android.ugc.aweme.challenge.model.Segment) r4
            if (r4 == 0) goto L_0x00b6
            int r5 = r4.begin
            int r4 = r4.end
            int r4 = r4 + 1
            android.text.SpannableString r2 = r11.mo65854a(r2, r5, r4)
            goto L_0x00b6
        L_0x00cf:
            android.widget.TextView r3 = r11.f84773a
            r3.setText(r2)
            if (r1 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.utils.UserVerify r2 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarThumb()
            java.lang.String r6 = r1.getCustomVerify()
            java.lang.String r7 = r1.getEnterpriseVerifyReason()
            int r3 = r1.getVerificationType()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.String r9 = r1.getWeiboVerify()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r3 = r11.f84775c
            r3.setUserData(r2)
            if (r1 == 0) goto L_0x0115
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r2 = r11.f84775c
            r2.mo48964b()
            android.view.View r2 = r11.itemView
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = r1.getCustomVerify()
            java.lang.String r4 = r1.getEnterpriseVerifyReason()
            android.widget.TextView r5 = r11.f84773a
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r2, r3, r4, r5)
        L_0x0115:
            android.view.View r2 = r11.itemView
            com.ss.android.ugc.aweme.friends.adapter.z$1 r3 = new com.ss.android.ugc.aweme.friends.adapter.z$1
            r3.<init>(r12, r0, r1)
            r2.setOnClickListener(r3)
        L_0x011f:
            return
        L_0x0120:
            com.ss.android.ugc.aweme.friends.adapter.y r11 = (com.p683ss.android.ugc.aweme.friends.adapter.C32555y) r11
            java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r0 = r10.f84765a
            java.lang.Object r12 = r0.get(r12)
            com.ss.android.ugc.aweme.friends.model.SummonFriendItem r12 = (com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem) r12
            java.lang.String r12 = r12.label
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0137
            android.widget.TextView r11 = r11.f84772a
            r11.setText(r12)
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.adapter.C32552x.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}

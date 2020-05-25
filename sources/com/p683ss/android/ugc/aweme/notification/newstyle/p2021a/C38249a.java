package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38092f;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.a */
public final class C38249a extends C26840g<C38092f> {

    /* renamed from: a */
    public int f97353a = 36;

    /* renamed from: b */
    final C38266h f97354b;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.a$a */
    static final class C38250a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38249a f97355a;

        /* renamed from: b */
        final /* synthetic */ int f97356b;

        C38250a(C38249a aVar, int i) {
            this.f97355a = aVar;
            this.f97356b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C38249a aVar = this.f97355a;
            Object obj = this.f97355a.mo50673a().get(this.f97356b);
            C52711k.m112236a(obj, "data[position]");
            C38092f fVar = (C38092f) obj;
            aVar.f97353a = fVar.f96902a;
            aVar.notifyDataSetChanged();
            aVar.f97354b.mo78243a(fVar);
        }
    }

    public C38249a(C38266h hVar) {
        C52711k.m112240b(hVar, "listener");
        this.f97354b = hVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C52711k.m112234a();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b31, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C38251b(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38251b
            if (r0 == 0) goto L_0x00aa
            r0 = r9
            com.ss.android.ugc.aweme.notification.newstyle.a.b r0 = (com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38251b) r0
            java.util.List r1 = r8.mo50673a()
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r2 = "data[position]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.notice.repo.list.bean.f r1 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38092f) r1
            int r2 = r8.f97353a
            java.lang.String r3 = "groupFilterStruct"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            android.widget.ImageView r3 = r0.f97357a
            int r4 = r1.f96904c
            r3.setImageResource(r4)
            android.widget.TextView r3 = r0.f97358b
            android.view.View r4 = r0.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.content.Context r4 = r4.getContext()
            int r5 = r1.f96903b
            java.lang.String r4 = r4.getString(r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            int r3 = r1.f96902a
            r4 = 8
            r5 = 0
            if (r3 != r2) goto L_0x0055
            android.widget.ImageView r1 = r0.f97357a
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.f97358b
            r1.setAlpha(r2)
            android.widget.ImageView r1 = r0.f97359c
            r1.setVisibility(r5)
            goto L_0x0099
        L_0x0055:
            android.widget.ImageView r3 = r0.f97357a
            r6 = 1056964608(0x3f000000, float:0.5)
            r3.setAlpha(r6)
            android.widget.TextView r3 = r0.f97358b
            r3.setAlpha(r6)
            android.widget.ImageView r3 = r0.f97359c
            r3.setVisibility(r4)
            r3 = 36
            r6 = 1
            if (r2 != r3) goto L_0x006d
        L_0x006b:
            r1 = 0
            goto L_0x0091
        L_0x006d:
            int r7 = r1.f96902a
            if (r7 != r3) goto L_0x0087
            int[] r1 = new int[r6]
            r1[r5] = r2
            int r1 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r1)
            int[] r2 = new int[r6]
            r2[r5] = r3
            int r2 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r2)
            if (r2 <= 0) goto L_0x006b
            if (r2 <= r1) goto L_0x006b
            r1 = 1
            goto L_0x0091
        L_0x0087:
            int[] r2 = new int[r6]
            int r1 = r1.f96902a
            r2[r5] = r1
            boolean r1 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85102b(r2)
        L_0x0091:
            if (r1 == 0) goto L_0x0099
            android.widget.ImageView r0 = r0.f97360d
            r0.setVisibility(r5)
            goto L_0x009e
        L_0x0099:
            android.widget.ImageView r0 = r0.f97360d
            r0.setVisibility(r4)
        L_0x009e:
            android.view.View r9 = r9.itemView
            com.ss.android.ugc.aweme.notification.newstyle.a.a$a r0 = new com.ss.android.ugc.aweme.notification.newstyle.a.a$a
            r0.<init>(r8, r10)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r9.setOnClickListener(r0)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38249a.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}

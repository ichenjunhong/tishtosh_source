package com.p683ss.android.ugc.aweme.feed.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.p */
public final class C30106p extends C26840g<C30151i> {
    public C30106p() {
        mo54798c(false);
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C30107q) {
            ((C30107q) vVar).f78608g.mo63567d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.support.p043v7.widget.RecyclerView.C1352v r9) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            super.onViewAttachedToWindow(r9)
            boolean r0 = r9 instanceof com.p683ss.android.ugc.aweme.feed.adapter.C30107q
            if (r0 == 0) goto L_0x0083
            com.ss.android.ugc.aweme.feed.adapter.q r9 = (com.p683ss.android.ugc.aweme.feed.adapter.C30107q) r9
            com.ss.android.ugc.aweme.feed.ui.c r0 = r9.f78608g
            r0.mo63566c()
            com.ss.android.ugc.aweme.feed.api.i r0 = r9.f78606e
            if (r0 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            if (r0 == 0) goto L_0x0082
            long r0 = r0.roomId
            com.ss.android.ugc.aweme.feed.api.i r2 = r9.f78606e
            if (r2 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getUser()
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.getUid()
            if (r2 == 0) goto L_0x003a
            java.lang.Long r2 = p2628d.p2650m.C52830p.m112396d(r2)
            if (r2 == 0) goto L_0x003a
            long r2 = r2.longValue()
            goto L_0x003c
        L_0x003a:
            r2 = 0
        L_0x003c:
            com.ss.android.ugc.aweme.feed.api.i r9 = r9.f78606e
            if (r9 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.feed.model.LogPbBean r9 = r9.getLogPbBean()
            if (r9 == 0) goto L_0x004b
            java.lang.String r9 = r9.getImprId()
            goto L_0x004c
        L_0x004b:
            r9 = 0
        L_0x004c:
            java.lang.String r4 = "livesdk_live_show"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "enter_from_merge"
            java.lang.String r7 = "homepage_follow"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "enter_method"
            java.lang.String r7 = "live_cover"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "action_type"
            java.lang.String r7 = "click"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "anchor_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r5.mo47827a(r6, r2)
            java.lang.String r3 = "room_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47827a(r3, r0)
            java.lang.String r1 = "request_id"
            com.ss.android.ugc.aweme.app.f.d r9 = r0.mo47829a(r1, r9)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r9)
            goto L_0x0083
        L_0x0082:
            return
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30106p.onViewAttachedToWindow(android.support.v7.widget.RecyclerView$v):void");
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C52711k.m112234a();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bi_, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C30107q(inflate);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C30107q) {
            C30107q qVar = (C30107q) vVar;
            Object obj = this.f70670n.get(i);
            C52711k.m112236a(obj, "mItems[position]");
            C30151i iVar = (C30151i) obj;
            List a = mo50673a();
            C52711k.m112236a((Object) a, "data");
            Iterable iterable = a;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (((C30151i) next) instanceof C30151i) {
                    arrayList.add(next);
                }
            }
            Iterable<C30151i> iterable2 = (List) arrayList;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (C30151i iVar2 : iterable2) {
                if (iVar2 != null) {
                    arrayList2.add(iVar2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.api.FollowingInterestUser");
                }
            }
            List<C30151i> list = (List) arrayList2;
            C52711k.m112240b(iVar, "interestUser");
            C52711k.m112240b(list, "interestUsers");
            View view = qVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            view.setScaleX(1.0f);
            View view2 = qVar.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            view2.setScaleY(1.0f);
            qVar.f78606e = iVar;
            qVar.f78607f = list;
            C30151i iVar3 = qVar.f78606e;
            if (iVar3 != null) {
                User user = iVar3.getUser();
                if (user != null) {
                    C23515d.m57669a((RemoteImageView) qVar.f78602a, user.getAvatarThumb());
                    qVar.f78603b.setText(user.getUniqueId());
                }
            }
            qVar.mo60368a();
            qVar.f78605d.setVisibility(0);
            qVar.f78608g.mo63563a(null, qVar.getClass(), null);
        }
    }
}

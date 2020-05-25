package com.p683ss.android.ugc.aweme.feed.unread;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.a */
public final class C31167a extends C26840g<User> {
    public C31167a() {
        mo54798c(false);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.b_5, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…_sun_roof, parent, false)");
        return new C31172f(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r4, int r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.unread.f r4 = (com.p683ss.android.ugc.aweme.feed.unread.C31172f) r4
            if (r4 == 0) goto L_0x00a4
            java.util.List r0 = r3.f70670n
            java.lang.Object r5 = r0.get(r5)
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
            r4.f81591d = r5
            if (r5 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.getAvatarThumb()
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x0056
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 != 0) goto L_0x0056
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.getAvatarThumb()
            java.lang.String r2 = "user.avatarThumb"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.util.List r0 = r0.getUrlList()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24646a(r0)
            java.lang.String r1 = "UnReadSunRoofViewHolder"
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r1)
            com.bytedance.lighten.loader.SmartCircleImageView r1 = r4.f81588a
            com.bytedance.lighten.a.k r1 = (com.bytedance.lighten.p766a.C12197k) r1
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)
            r0.mo23121a()
            goto L_0x006e
        L_0x0056:
            r0 = 2131953301(0x7f130695, float:1.954307E38)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24642a(r0)
            java.lang.String r1 = "UnReadSunRoofViewHolder"
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r1)
            com.bytedance.lighten.loader.SmartCircleImageView r1 = r4.f81588a
            com.bytedance.lighten.a.k r1 = (com.bytedance.lighten.p766a.C12197k) r1
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)
            r0.mo23121a()
        L_0x006e:
            android.widget.TextView r0 = r4.f81589b
            r1 = 0
            if (r5 == 0) goto L_0x0078
            java.lang.String r2 = r5.getRemarkName()
            goto L_0x0079
        L_0x0078:
            r2 = r1
        L_0x0079:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x008a
            if (r5 == 0) goto L_0x0087
            java.lang.String r1 = r5.getNickname()
        L_0x0087:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0091
        L_0x008a:
            if (r5 == 0) goto L_0x0087
            java.lang.String r1 = r5.getRemarkName()
            goto L_0x0087
        L_0x0091:
            r0.setText(r1)
            com.ss.android.ugc.aweme.main.service.IUnReadVideoService$a r4 = r4.f81590c
            if (r4 == 0) goto L_0x00a3
            if (r5 == 0) goto L_0x009d
            r5.getUid()
        L_0x009d:
            if (r5 == 0) goto L_0x00a3
            r5.getUnReadVideoCount()
            goto L_0x00a4
        L_0x00a3:
            return
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.unread.C31167a.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}

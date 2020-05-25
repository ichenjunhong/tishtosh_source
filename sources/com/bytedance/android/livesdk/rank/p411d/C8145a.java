package com.bytedance.android.livesdk.rank.p411d;

import android.os.Bundle;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.livesdk.rank.C8212l;
import com.bytedance.android.livesdk.rank.view.UserRankListView;
import com.bytedance.android.livesdk.rank.view.UserRankListView.C8227a;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.ies.sdk.widgets.DataCenter;

/* renamed from: com.bytedance.android.livesdk.rank.d.a */
public final class C8145a extends C3846a {

    /* renamed from: a */
    public DataCenter f22230a;

    /* renamed from: b */
    public C8335g<C3009i> f22231b;

    /* renamed from: c */
    protected boolean f22232c;

    /* renamed from: d */
    protected long f22233d;

    /* renamed from: e */
    protected long f22234e;

    /* renamed from: f */
    public int f22235f;

    /* renamed from: g */
    public C8227a f22236g;

    /* renamed from: h */
    private int f22237h;

    /* renamed from: i */
    private UserRankListView f22238i;

    /* renamed from: j */
    private boolean f22239j;

    /* renamed from: k */
    private int f22240k;

    public final void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: b */
    public final void mo14345b() {
        if (this.f22238i != null) {
            this.f22238i.mo14392h();
        }
    }

    /* renamed from: a */
    public final void mo14344a() {
        if (!this.f22239j && this.f22238i != null) {
            C8212l.m16283a(hashCode(), this.f22237h);
            this.f22239j = true;
            this.f22238i.mo14391g();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22232c = arguments.getBoolean("broadcaster");
            this.f22233d = arguments.getLong("room_id");
            this.f22234e = arguments.getLong("owner_id");
            this.f22237h = arguments.getInt("rank_type");
            this.f22240k = arguments.getInt("tab_index", 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            int r3 = r2.f22237h
            r4 = 7
            r5 = -1
            if (r3 == r4) goto L_0x006a
            r4 = 9
            if (r3 == r4) goto L_0x006a
            r4 = 17
            if (r3 == r4) goto L_0x006a
            r4 = 22
            if (r3 == r4) goto L_0x006a
            switch(r3) {
                case -2: goto L_0x0060;
                case -1: goto L_0x001f;
                default: goto L_0x0015;
            }
        L_0x0015:
            com.bytedance.android.livesdk.rank.view.UserRankListView r3 = new com.bytedance.android.livesdk.rank.view.UserRankListView
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
            goto L_0x0073
        L_0x001f:
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r2.f22230a
            if (r3 == 0) goto L_0x0053
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r2.f22230a
            java.lang.String r4 = "data_xt_broadcast_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r3 = r3.get(r4, r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 3
            if (r3 == r4) goto L_0x0053
            com.bytedance.android.livesdk.ab.f r3 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.ab.d r3 = r3.mo10326g()
            java.lang.Class<com.bytedance.android.livesdk.u.d> r4 = com.bytedance.android.livesdk.p420u.C8318d.class
            java.lang.Object r3 = r3.mo10305a(r4)
            com.bytedance.android.livesdk.u.d r3 = (com.bytedance.android.livesdk.p420u.C8318d) r3
            if (r3 == 0) goto L_0x0053
            android.content.Context r4 = r2.getContext()
            com.bytedance.android.livesdk.rank.view.UserRankListView r3 = r3.mo14496a(r4)
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 != 0) goto L_0x0073
            android.view.View r3 = new android.view.View
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
            return r3
        L_0x0060:
            com.bytedance.android.livesdk.rank.view.NobleUserRankListView r3 = new com.bytedance.android.livesdk.rank.view.NobleUserRankListView
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
            goto L_0x0073
        L_0x006a:
            com.bytedance.android.livesdk.rank.view.UserRankListView r3 = new com.bytedance.android.livesdk.rank.view.UserRankListView
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
        L_0x0073:
            com.bytedance.ies.sdk.widgets.DataCenter r4 = r2.f22230a
            int r0 = r2.f22237h
            com.bytedance.android.livesdk.user.g<com.bytedance.android.live.base.model.user.i> r1 = r2.f22231b
            r3.mo14375a(r2, r4, r0, r1)
            r2.f22238i = r3
            int r4 = r2.f22235f
            int r0 = r2.f22240k
            if (r4 != r0) goto L_0x008e
            r2.mo14344a()
            com.bytedance.android.livesdk.rank.view.UserRankListView r4 = r2.f22238i
            com.bytedance.android.livesdk.rank.view.UserRankListView$a r0 = r2.f22236g
            r4.setFetchCompleteListener(r0)
        L_0x008e:
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r5, r5)
            r3.setLayoutParams(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.p411d.C8145a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: a */
    public static C8145a m16227a(long j, long j2, boolean z, int i, int i2, C8227a aVar) {
        C8145a aVar2 = new C8145a();
        Bundle bundle = new Bundle(4);
        bundle.putBoolean("broadcaster", z);
        bundle.putLong("room_id", j);
        bundle.putLong("owner_id", j2);
        bundle.putInt("rank_type", i);
        bundle.putInt("tab_index", i2);
        aVar2.setArguments(bundle);
        aVar2.f22236g = aVar;
        return aVar2;
    }
}

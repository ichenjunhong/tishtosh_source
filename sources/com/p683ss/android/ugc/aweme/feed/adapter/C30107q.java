package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.live.C36065d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.q */
public final class C30107q extends C1352v {

    /* renamed from: a */
    AnimatedImageView f78602a;

    /* renamed from: b */
    TextView f78603b;

    /* renamed from: c */
    Context f78604c;

    /* renamed from: d */
    LiveCircleView f78605d;

    /* renamed from: e */
    C30151i f78606e;

    /* renamed from: f */
    List<C30151i> f78607f;

    /* renamed from: g */
    C30828c f78608g = new C30828c(true, this.f78602a, this.f78602a, this.f78605d);

    /* renamed from: h */
    private TextView f78609h;

    /* renamed from: b */
    private static boolean m70654b() {
        try {
            ILiveOuterService a = C36173w.m81665a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
            C36065d live = a.getLive();
            C52711k.m112236a((Object) live, "ServiceManager.get().get…Service::class.java).live");
            return live.mo15062o().mo15065a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private final String m70655c() {
        try {
            ILiveOuterService a = C36173w.m81665a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
            C36065d live = a.getLive();
            C52711k.m112236a((Object) live, "ServiceManager.get().get…Service::class.java).live");
            String a2 = live.mo15061n().mo15022a(this.f78604c);
            C52711k.m112236a((Object) a2, "ServiceManager.get().get…getLiveTagString(context)");
            return a2;
        } catch (Exception unused) {
            return "LIVE";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60368a() {
        String str;
        try {
            if (m70654b()) {
                str = m70655c();
            } else {
                str = "LIVE";
            }
            this.f78609h.setText(str);
            m70653a(str, 10.0f, 12.0f);
        } catch (Exception unused) {
            String str2 = "LIVE";
            this.f78609h.setText(str2);
            m70653a(str2, 10.0f, 12.0f);
        }
    }

    public C30107q(final View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.azj);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_cover)");
        this.f78602a = (AnimatedImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.dcn);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.f78603b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.aqv);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.icon_tag)");
        this.f78609h = (TextView) findViewById3;
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f78604c = context;
        View findViewById4 = view.findViewById(R.id.ef6);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.iv_live_circle)");
        this.f78605d = (LiveCircleView) findViewById4;
        this.f78602a.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C30107q f78610a;

            {
                this.f78610a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r10) {
                /*
                    r9 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
                    android.view.View r10 = r6
                    boolean r10 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r10)
                    if (r10 != 0) goto L_0x010d
                    com.ss.android.ugc.aweme.feed.adapter.q r10 = r9.f78610a
                    com.ss.android.ugc.aweme.feed.api.i r0 = r10.f78606e
                    if (r0 == 0) goto L_0x010c
                    com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
                    if (r0 == 0) goto L_0x010c
                    long r3 = r0.roomId
                    com.ss.android.ugc.aweme.feed.api.i r0 = r10.f78606e
                    if (r0 == 0) goto L_0x010b
                    com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
                    if (r0 == 0) goto L_0x010b
                    java.lang.String r5 = r0.roomData
                    if (r5 != 0) goto L_0x0029
                    goto L_0x010b
                L_0x0029:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.List<com.ss.android.ugc.aweme.feed.api.i> r0 = r10.f78607f
                    if (r0 == 0) goto L_0x0052
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x0038:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x0052
                    java.lang.Object r1 = r0.next()
                    com.ss.android.ugc.aweme.feed.api.i r1 = (com.p683ss.android.ugc.aweme.feed.api.C30151i) r1
                    com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
                    long r1 = r1.roomId
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r8.add(r1)
                    goto L_0x0038
                L_0x0052:
                    android.graphics.Rect r0 = new android.graphics.Rect
                    r0.<init>()
                    r1 = 2
                    java.lang.Integer[] r1 = new java.lang.Integer[r1]
                    r2 = 0
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                    r1[r2] = r6
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                    r7 = 1
                    r1[r7] = r6
                    int[] r1 = p2628d.p2629a.C52568f.m112078a(r1)
                    android.view.View r6 = r10.itemView
                    r6.getLocationOnScreen(r1)
                    r6 = r1[r2]
                    r0.left = r6
                    r6 = r1[r7]
                    r0.top = r6
                    r2 = r1[r2]
                    com.ss.android.ugc.aweme.base.ui.AnimatedImageView r6 = r10.f78602a
                    int r6 = r6.getMeasuredWidth()
                    int r2 = r2 + r6
                    r0.right = r2
                    r1 = r1[r7]
                    com.ss.android.ugc.aweme.base.ui.AnimatedImageView r2 = r10.f78602a
                    int r2 = r2.getMeasuredHeight()
                    int r1 = r1 + r2
                    r0.bottom = r1
                    android.os.Bundle r6 = new android.os.Bundle
                    r6.<init>()
                    java.lang.String r1 = "live.intent.extra.SOURCE_POSITION"
                    android.os.Parcelable r0 = (android.os.Parcelable) r0
                    r6.putParcelable(r1, r0)
                    java.lang.String r0 = "live.intent.extra.ENTER_ROOM_IDS"
                    r1 = r8
                    java.util.Collection r1 = (java.util.Collection) r1
                    long[] r1 = p2628d.p2629a.C52575l.m112136d(r1)
                    r6.putLongArray(r0, r1)
                    java.lang.String r0 = "enter_method"
                    java.lang.String r1 = "live_cover"
                    r6.putString(r0, r1)
                    java.lang.String r0 = "anchor_id"
                    com.ss.android.ugc.aweme.feed.api.i r1 = r10.f78606e
                    if (r1 == 0) goto L_0x00cb
                    com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
                    if (r1 == 0) goto L_0x00cb
                    java.lang.String r1 = r1.getUid()
                    if (r1 == 0) goto L_0x00cb
                    java.lang.Long r1 = p2628d.p2650m.C52830p.m112396d(r1)
                    if (r1 == 0) goto L_0x00cb
                    long r1 = r1.longValue()
                    goto L_0x00cd
                L_0x00cb:
                    r1 = 0
                L_0x00cd:
                    r6.putLong(r0, r1)
                    java.lang.String r0 = "live.intent.extra.ENTER_TYPE"
                    java.lang.String r1 = "click"
                    r6.putString(r0, r1)
                    java.lang.String r0 = "live.intent.extra.REQUEST_ID"
                    com.ss.android.ugc.aweme.feed.api.i r1 = r10.f78606e
                    if (r1 == 0) goto L_0x00e8
                    com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = r1.getLogPbBean()
                    if (r1 == 0) goto L_0x00e8
                    java.lang.String r1 = r1.getImprId()
                    goto L_0x00e9
                L_0x00e8:
                    r1 = 0
                L_0x00e9:
                    r6.putString(r0, r1)
                    com.ss.android.ugc.aweme.story.live.b r1 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getLiveAllService()
                    android.content.Context r2 = r10.f78604c
                    java.lang.String r7 = "homepage_follow"
                    r1.mo74805a(r2, r3, r5, r6, r7, r8)
                    java.lang.String r10 = "click_play_following_window"
                    com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                    java.lang.String r1 = "is_live"
                    java.lang.String r2 = "1"
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                    java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r0)
                    goto L_0x010d
                L_0x010b:
                    return
                L_0x010c:
                    return
                L_0x010d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30107q.C301081.onClick(android.view.View):void");
            }
        });
    }

    /* renamed from: a */
    private final void m70653a(String str, float f, float f2) {
        do {
            this.f78609h.setTextSize(1, f2);
            if (this.f78609h.getPaint().measureText(str) > C9432q.m18687b(this.f78604c, 46.0f)) {
                f2 -= 1.0f;
            } else {
                return;
            }
        } while (f2 >= f);
    }
}

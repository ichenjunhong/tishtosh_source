package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.a */
public final class C35150a extends C1352v {

    /* renamed from: d */
    public static final C35152a f90403d = new C35152a(null);

    /* renamed from: a */
    public final AvatarImageView f90404a;

    /* renamed from: b */
    public final int f90405b = R.drawable.d9o;

    /* renamed from: c */
    public IMContact f90406c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.a$a */
    public static final class C35152a {
        private C35152a() {
        }

        public /* synthetic */ C35152a(C52707g gVar) {
            this();
        }
    }

    public C35150a(View view, final SharePanelViewModel sharePanelViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(sharePanelViewModel, "viewModel");
        super(view);
        View findViewById = view.findViewById(R.id.ti);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.civ)");
        this.f90404a = (AvatarImageView) findViewById;
        this.f90404a.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C35150a f90407a;

            {
                this.f90407a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0049  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r3) {
                /*
                    r2 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r3)
                    com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                    java.lang.String r0 = "AwemeImManager.instance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                    com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                    if (r3 == 0) goto L_0x0045
                    com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                    java.lang.String r0 = "AwemeImManager.instance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                    com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                    java.lang.String r0 = "AwemeImManager.instance().proxy"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                    com.ss.android.ugc.aweme.im.service.m r3 = r3.getUnder16Proxy()
                    if (r3 == 0) goto L_0x0045
                    com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                    java.lang.String r0 = "AwemeImManager.instance()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                    com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                    java.lang.String r0 = "AwemeImManager.instance().proxy"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                    com.ss.android.ugc.aweme.im.service.m r3 = r3.getUnder16Proxy()
                    boolean r0 = r3.mo70449c()
                    goto L_0x0047
                L_0x0045:
                    r0 = 0
                    r3 = 0
                L_0x0047:
                    if (r0 == 0) goto L_0x0050
                    if (r3 == 0) goto L_0x004f
                    r3.mo70454h()
                    return
                L_0x004f:
                    return
                L_0x0050:
                    com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r3 = r3
                    com.ss.android.ugc.aweme.im.sdk.share.panel.d.a r0 = r2.f90407a
                    com.ss.android.ugc.aweme.im.service.model.IMContact r0 = r0.f90406c
                    if (r0 != 0) goto L_0x005b
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x005b:
                    r1 = 1
                    r3.mo73281a(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35150a.C351511.onClick(android.view.View):void");
            }
        });
    }
}

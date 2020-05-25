package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.b */
public final class C29668b extends C26840g<C36966e> {

    /* renamed from: a */
    public final Context f77556a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.b$a */
    static final class C29669a extends C1352v {

        /* renamed from: a */
        public RemoteImageView f77557a;

        /* renamed from: b */
        public DmtTextView f77558b;

        public C29669a(View view) {
            C52711k.m112240b(view, "view");
            super(view);
            this.f77557a = (RemoteImageView) view.findViewById(R.id.bln);
            this.f77558b = (DmtTextView) view.findViewById(R.id.blp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.b$b */
    public static final class C29670b extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C29668b f77559a;

        /* renamed from: b */
        final /* synthetic */ int f77560b;

        /* renamed from: a */
        public final void mo59929a(View view) {
            C36983a b = C36983a.m83185b();
            C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
            IMiniAppService a = b.mo76294a();
            if (a != null) {
                a.openMiniApp(this.f77559a.f77556a, (C36966e) this.f77559a.f70670n.get(this.f77560b), new C36961a().mo76222b("setting_page").mo76220a("recently").mo76223c("021001").mo76221a());
            }
        }

        C29670b(C29668b bVar, int i) {
            this.f77559a = bVar;
            this.f77560b = i;
        }
    }

    public C29668b(Context context) {
        this.f77556a = context;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f77556a).inflate(R.layout.vz, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…           parent, false)");
        return new C29669a(inflate);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        String str;
        if (i >= 0) {
            List list = this.f70670n;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i < i2) {
                String str2 = null;
                if (!(vVar instanceof C29669a)) {
                    vVar = null;
                }
                C29669a aVar = (C29669a) vVar;
                if (aVar != null) {
                    RemoteImageView remoteImageView = aVar.f77557a;
                    if (remoteImageView != null) {
                        C36966e eVar = (C36966e) this.f70670n.get(i);
                        if (eVar != null) {
                            str = eVar.getIcon();
                        } else {
                            str = null;
                        }
                        remoteImageView.setImageURI(str);
                    }
                    DmtTextView dmtTextView = aVar.f77558b;
                    if (dmtTextView != null) {
                        C36966e eVar2 = (C36966e) this.f70670n.get(i);
                        if (eVar2 != null) {
                            str2 = eVar2.getName();
                        }
                        dmtTextView.setText(str2);
                        dmtTextView.setTypeface(dmtTextView.getTypeface(), 1);
                    }
                    C36983a b = C36983a.m83185b();
                    C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
                    IMiniAppService a = b.mo76294a();
                    if (a != null) {
                        Object obj = this.f70670n.get(i);
                        C52711k.m112236a(obj, "mItems[position]");
                        String appId = ((C36966e) obj).getAppId();
                        Object obj2 = this.f70670n.get(i);
                        C52711k.m112236a(obj2, "mItems[position]");
                        a.preloadMiniApp(appId, ((C36966e) obj2).getType());
                    }
                    aVar.itemView.setOnClickListener(new C29670b(this, i));
                }
            }
        }
    }
}

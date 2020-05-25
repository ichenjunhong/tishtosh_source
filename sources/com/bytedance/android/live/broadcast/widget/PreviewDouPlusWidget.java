package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

public final class PreviewDouPlusWidget extends LiveWidget {

    /* renamed from: a */
    public C2964a f10471a = C2964a.defaultOne();

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget$a */
    static final class C3685a<T> implements C4641g<C2964a> {

        /* renamed from: a */
        final /* synthetic */ PreviewDouPlusWidget f10472a;

        C3685a(PreviewDouPlusWidget previewDouPlusWidget) {
            this.f10472a = previewDouPlusWidget;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo9061a(Object obj) {
            int i;
            C2964a aVar = (C2964a) obj;
            if (aVar != null) {
                this.f10472a.f10471a = aVar;
                if (this.f10472a.isViewValid()) {
                    View view = this.f10472a.contentView;
                    C52711k.m112236a((Object) view, "contentView");
                    ImageView imageView = (ImageView) view.findViewById(R.id.e5z);
                    C52711k.m112236a((Object) imageView, "contentView.dou_plus_entry");
                    if (this.f10472a.f10471a.hasDouPlusEntry) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    View view2 = this.f10472a.contentView;
                    C52711k.m112236a((Object) view2, "contentView");
                    ImageView imageView2 = (ImageView) view2.findViewById(R.id.e5z);
                    C52711k.m112236a((Object) imageView2, "contentView.dou_plus_entry");
                    if (imageView2.getVisibility() == 0) {
                        if (C4116c.m10249a(C8612a.class) == null) {
                            C52711k.m112234a();
                        }
                        C8066a a = C8066a.m16007a().mo14221a("entrance_type", "live_before").mo14221a("pay_mode", "dou_not_iap").mo14221a("serving_type", "my_group");
                        String str = "anchor_id";
                        C2952b a2 = C4116c.m10249a(C4282a.class);
                        if (a2 == null) {
                            C52711k.m112234a();
                        }
                        C8333e user = ((C4282a) a2).user();
                        C52711k.m112236a((Object) user, "ServiceManager.getServic…ice::class.java)!!.user()");
                        a.mo14221a(str, String.valueOf(user.mo14529b()));
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget$b */
    static final class C3686b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewDouPlusWidget f10473a;

        C3686b(PreviewDouPlusWidget previewDouPlusWidget) {
            this.f10473a = previewDouPlusWidget;
        }

        public final void onClick(View view) {
            if (this.f10473a.isViewValid()) {
                C2952b a = C4116c.m10249a(C4282a.class);
                if (a == null) {
                    C52711k.m112234a();
                }
                C8333e user = ((C4282a) a).user();
                C52711k.m112236a((Object) user, "ServiceManager.getServic…ice::class.java)!!.user()");
                C3009i a2 = user.mo14521a();
                C52711k.m112236a((Object) a2, "ServiceManager.getServic…ava)!!.user().currentUser");
                a2.getSecUid();
                if (C4116c.m10249a(C8612a.class) == null) {
                    C52711k.m112234a();
                }
                C8066a a3 = C8066a.m16007a().mo14221a("entrance_type", "live_before").mo14221a("pay_mode", "dou_not_iap").mo14221a("serving_type", "my_group");
                String str = "anchor_id";
                C2952b a4 = C4116c.m10249a(C4282a.class);
                if (a4 == null) {
                    C52711k.m112234a();
                }
                C8333e user2 = ((C4282a) a4).user();
                C52711k.m112236a((Object) user2, "ServiceManager.getServic…ice::class.java)!!.user()");
                C3009i a5 = user2.mo14521a();
                C52711k.m112236a((Object) a5, "ServiceManager.getServic…ava)!!.user().currentUser");
                a3.mo14221a(str, String.valueOf(a5.getId()));
                if (C4116c.m10249a(C8612a.class) == null) {
                    C52711k.m112234a();
                }
            }
        }
    }

    public final int getLayoutId() {
        return R.layout.bvs;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onCreate() {
        super.onCreate();
        C2952b a = C4116c.m10249a(C4282a.class);
        if (a == null) {
            C52711k.m112234a();
        }
        C8333e user = ((C4282a) a).user();
        C52711k.m112236a((Object) user, "ServiceManager.getServic…ice::class.java)!!.user()");
        C3009i a2 = user.mo14521a();
        C52711k.m112236a((Object) a2, "ServiceManager.getServic…ava)!!.user().currentUser");
        a2.getSecUid();
        if (C4116c.m10249a(C8612a.class) == null) {
            C52711k.m112234a();
        }
        new C3685a(this);
        View view = this.contentView;
        C52711k.m112236a((Object) view, "contentView");
        ((ImageView) view.findViewById(R.id.e5z)).setOnClickListener(new C3686b(this));
    }
}

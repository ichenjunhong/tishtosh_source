package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.live.core.rxutils.C4067n;
import com.bytedance.android.livesdk.C4642b;
import com.bytedance.android.livesdk.chatroom.widget.C6669b;
import com.bytedance.android.livesdk.message.model.C8004p;
import com.bytedance.android.livesdk.p267a.C4487b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8394d;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8395e;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8397g;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8399i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

public final class CommonGuideWidget extends LiveWidget implements C0212b {

    /* renamed from: a */
    public CommonGuideViewModel f16854a;

    /* renamed from: b */
    public C8004p f16855b;

    /* renamed from: c */
    private C6669b f16856c;

    /* renamed from: d */
    private Room f16857d;

    /* renamed from: e */
    private final C1689b f16858e = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget$a */
    static final class C6259a<T> implements C1710e<C52847n<? extends C8399i, ? extends C8399i>> {

        /* renamed from: a */
        final /* synthetic */ CommonGuideWidget f16859a;

        C6259a(CommonGuideWidget commonGuideWidget) {
            this.f16859a = commonGuideWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C52847n nVar = (C52847n) obj;
            this.f16859a.mo12326a((C8399i) nVar.component1(), (C8399i) nVar.component2());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget$b */
    static final class C6260b implements OnDismissListener {

        /* renamed from: a */
        public static final C6260b f16860a = new C6260b();

        C6260b() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C4642b.m11130a().mo10429c();
        }
    }

    /* renamed from: a */
    private final void m13445a() {
        C6669b bVar = this.f16856c;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
        this.f16856c = null;
    }

    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            this.f16857d = (Room) dataCenter.get("data_room", null);
        }
        this.f16854a = (CommonGuideViewModel) getViewModel(CommonGuideViewModel.class, this);
        CommonGuideViewModel commonGuideViewModel = this.f16854a;
        if (commonGuideViewModel != null) {
            this.f16858e.mo6181a(C4067n.m10192a(commonGuideViewModel.f22828a.mo14605a()).mo6545f((C1710e<? super T>) new C6259a<Object>(this)));
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C6669b bVar = this.f16856c;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
        if (!this.f16858e.isDisposed()) {
            this.f16858e.dispose();
        }
        this.f16856c = null;
        this.f16854a = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.String> m13446b() {
        /*
            r6 = this;
            r0 = 4
            d.n[] r0 = new p2628d.C52847n[r0]
            java.lang.String r1 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r6.f16857d
            r3 = 0
            if (r2 == 0) goto L_0x0013
            long r4 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x0014
        L_0x0013:
            r2 = r3
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            d.n r1 = p2628d.C52856t.m112465a(r1, r2)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.String r2 = "user_id"
            java.lang.Class<com.bytedance.android.live.user.a> r4 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.user.a r4 = (com.bytedance.android.live.user.C4282a) r4
            if (r4 == 0) goto L_0x003b
            com.bytedance.android.livesdk.user.e r4 = r4.user()
            if (r4 == 0) goto L_0x003b
            long r4 = r4.mo14529b()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            d.n r2 = p2628d.C52856t.m112465a(r2, r4)
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r6.f16857d
            if (r4 == 0) goto L_0x0056
            long r4 = r4.getOwnerUserId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0057
        L_0x0056:
            r4 = r3
        L_0x0057:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            d.n r2 = p2628d.C52856t.m112465a(r2, r4)
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "message_type"
            com.bytedance.android.livesdk.message.model.p r4 = r6.f16855b
            if (r4 == 0) goto L_0x006e
            int r3 = r4.f21883a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x006e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            d.n r2 = p2628d.C52856t.m112465a(r2, r3)
            r0[r1] = r2
            java.util.Map r0 = p2628d.p2629a.C52550ab.m112050a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget.m13446b():java.util.Map");
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        C52711k.m112240b(cls, "modelClass");
        return (C0209x) new CommonGuideViewModel();
    }

    /* renamed from: a */
    public final void mo12326a(C8399i iVar, C8399i iVar2) {
        if (iVar2 instanceof C8397g) {
            m13445a();
            this.f16856c = new C6669b(this.context, this.f16854a);
            C6669b bVar = this.f16856c;
            if (bVar != null) {
                bVar.show();
            }
            C4642b.m11130a().mo10428b();
            C6669b bVar2 = this.f16856c;
            if (bVar2 != null) {
                bVar2.setOnDismissListener(C6260b.f16860a);
            }
            C8049c.m15979a().mo14202a("commonguide_show", m13446b(), Room.class, C8059j.class);
        } else if (iVar2 instanceof C8394d) {
            m13445a();
            C4487b.m10802a().mo10287a(((C8394d) iVar2).f22834a);
            C8049c.m15979a().mo14202a("commonguide_click", m13446b(), Room.class, C8059j.class);
        } else {
            if (iVar2 instanceof C8395e) {
                m13445a();
            }
        }
    }
}

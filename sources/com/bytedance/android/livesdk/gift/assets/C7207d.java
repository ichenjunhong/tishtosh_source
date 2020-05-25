package com.bytedance.android.livesdk.gift.assets;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.p310f.C5212b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.C7211h.C7212a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4603m;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.C51588f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.assets.d */
final /* synthetic */ class C7207d implements C1710e {

    /* renamed from: a */
    private final C7203c f19585a;

    /* renamed from: b */
    private final int f19586b;

    /* renamed from: c */
    private final boolean f19587c;

    C7207d(C7203c cVar, int i, boolean z) {
        this.f19585a = cVar;
        this.f19586b = i;
        this.f19587c = z;
    }

    public final void accept(Object obj) {
        C7203c cVar = this.f19585a;
        int i = this.f19586b;
        boolean z = this.f19587c;
        cVar.f19574c = ((C7202b) ((C4177d) obj).data).f19571a;
        List<AssetsModel> list = cVar.f19574c;
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : list) {
            if ((((double) (currentTimeMillis - ((Long) cVar.f19573b.mo2488a(assetsModel.getId(), Long.valueOf(0))).longValue())) > 150000.0d) && (assetsModel.getResourceType() == 1 || assetsModel.getResourceType() == 2)) {
                cVar.mo13429a(assetsModel, i);
                cVar.f19573b.mo2493b(assetsModel.getId(), Long.valueOf(currentTimeMillis));
            }
        }
        List<AssetsModel> list2 = cVar.f19574c;
        long currentTimeMillis2 = System.currentTimeMillis();
        for (AssetsModel assetsModel2 : list2) {
            if (!(!(((double) (currentTimeMillis2 - ((Long) cVar.f19573b.mo2488a(assetsModel2.getId(), Long.valueOf(0))).longValue())) > 150000.0d) || assetsModel2.getDownloadType() == 2 || assetsModel2.getResourceType() == 5)) {
                cVar.mo13429a(assetsModel2, i);
                cVar.f19573b.mo2493b(assetsModel2.getId(), Long.valueOf(currentTimeMillis2));
            }
        }
        if (z) {
            List<AssetsModel> list3 = cVar.f19574c;
            long currentTimeMillis3 = System.currentTimeMillis();
            for (AssetsModel assetsModel3 : list3) {
                if ((((double) (currentTimeMillis3 - ((Long) cVar.f19573b.mo2488a(assetsModel3.getId(), Long.valueOf(0))).longValue())) > 150000.0d) && assetsModel3.getResourceType() == 5) {
                    cVar.mo13429a(assetsModel3, i);
                    cVar.f19573b.mo2493b(assetsModel3.getId(), Long.valueOf(currentTimeMillis3));
                }
            }
        }
        List<AssetsModel> list4 = cVar.f19574c;
        if (!C9414h.m18630a(list4)) {
            long longValue = ((Long) C4525b.f12431e.mo10345a()).longValue();
            String str = (String) C4525b.f12430d.mo10345a();
            if (!((Boolean) LiveSettingKeys.ENABLE_ASSETS_DELETE_TIME_LIMIT.mo9431a()).booleanValue() || System.currentTimeMillis() - longValue >= FbUploadTokenTime.group0) {
                C17971f a = C2942b.m8369a();
                if (longValue == 0 || C9431p.m18664a(str)) {
                    C4525b.f12431e.mo10346a(Long.valueOf(System.currentTimeMillis()));
                    C4525b.f12430d.mo10346a(a.mo34889b(list4));
                } else {
                    List<AssetsModel> list5 = (List) a.mo34885a(str, new C17956a<List<AssetsModel>>() {
                    }.f49843c);
                    ArrayList arrayList = new ArrayList();
                    for (AssetsModel assetsModel4 : list5) {
                        if (!list4.contains(assetsModel4)) {
                            arrayList.add(assetsModel4);
                        }
                    }
                    C4525b.f12431e.mo10346a(Long.valueOf(System.currentTimeMillis()));
                    C4525b.f12430d.mo10346a(a.mo34889b(list4));
                    if (!C9414h.m18630a(arrayList)) {
                        new C9393e(arrayList, list4, a) {

                            /* renamed from: a */
                            final /* synthetic */ List f19581a;

                            /* renamed from: b */
                            final /* synthetic */ List f19582b;

                            /* renamed from: c */
                            final /* synthetic */ C17971f f19583c;

                            public final void run() {
                                Iterator it = this.f19581a.iterator();
                                while (it.hasNext()) {
                                    C51568c a = C5212b.m11809a((AssetsModel) it.next());
                                    if (a != null) {
                                        File file = new File(C51588f.m110738a().f128857c.f128841a.mo13424a(a));
                                        if (!file.exists()) {
                                            it.remove();
                                        } else if (C4603m.m11049a(file)) {
                                            it.remove();
                                        }
                                    }
                                }
                                if (!this.f19581a.isEmpty()) {
                                    this.f19582b.addAll(this.f19581a);
                                    C4525b.f12430d.mo10346a(this.f19583c.mo34889b(this.f19582b));
                                }
                            }

                            {
                                this.f19581a = r2;
                                this.f19582b = r3;
                                this.f19583c = r4;
                            }
                        }.start();
                    }
                }
            }
        }
        C7203c.m14948a(cVar.f19574c, i);
        for (int size = cVar.f19572a.size() - 1; size >= 0; size--) {
            ((C7212a) cVar.f19572a.get(size)).mo13439a(cVar.f19574c);
        }
        if (cVar.f19575d != null && !cVar.f19575d.isDisposed()) {
            cVar.f19575d.dispose();
            cVar.f19575d = null;
        }
    }
}

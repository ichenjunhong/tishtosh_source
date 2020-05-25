package com.bytedance.android.livesdk.gift.assets;

import android.support.p030v4.p038f.C0785g;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.chatroom.p310f.C5212b;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.assets.C7211h.C7212a;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.common.utility.C9414h;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.C51574d;
import com.p683ss.ugc.live.p2595a.p2596a.C51588f;
import com.p683ss.ugc.live.p2595a.p2596a.C51593g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.gift.assets.c */
public class C7203c implements C7211h {

    /* renamed from: a */
    final List<C7212a> f19572a = new ArrayList();

    /* renamed from: b */
    final C0785g<Long> f19573b = new C0785g<>();

    /* renamed from: c */
    List<AssetsModel> f19574c = new ArrayList();

    /* renamed from: d */
    C1690c f19575d;

    /* renamed from: e */
    private final String f19576e;

    /* renamed from: f */
    private final List<Object> f19577f = new ArrayList();

    /* renamed from: a */
    public final void mo13425a() {
        C51588f.m110738a().f128856b.clear();
    }

    /* renamed from: a */
    public final void mo13426a(int i) {
        mo13427a(i, false);
    }

    /* renamed from: b */
    public final void mo13433b(C7212a aVar) {
        if (aVar != null && this.f19572a.contains(aVar)) {
            this.f19572a.remove(aVar);
        }
    }

    /* renamed from: c */
    public final AssetsModel mo13434c(long j) {
        for (AssetsModel assetsModel : this.f19574c) {
            if (assetsModel.getId() == j) {
                return assetsModel;
            }
        }
        return null;
    }

    C7203c(String str) {
        this.f19576e = str;
    }

    /* renamed from: b */
    public final String mo13432b(long j) {
        C51568c a = C5212b.m11809a(mo13434c(j));
        if (a == null) {
            return null;
        }
        C51588f a2 = C51588f.m110738a();
        if (a != null) {
            if (a2.mo105509b(a)) {
                return a2.mo105511d(a);
            }
            long j2 = a.f128817a;
            if (!a2.f128856b.containsKey(Long.valueOf(j2))) {
                a2.f128856b.put(Long.valueOf(j2), new C51593g(a));
                a.mo105499c();
                a2.mo105510c(a);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo13430a(C7212a aVar) {
        if (aVar != null && !this.f19572a.contains(aVar)) {
            this.f19572a.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo13431a(long j) {
        C51568c a = C5212b.m11809a(mo13434c(j));
        if (a == null || !C51588f.m110738a().mo105509b(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo13427a(int i, boolean z) {
        this.f19575d = ((AssetsApi) C4157e.m10322a().mo9550a(AssetsApi.class)).getAssets(this.f19576e, i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7207d<Object>(this, i, z), (C1710e<? super Throwable>) new C7208e<Object>(this));
    }

    /* renamed from: a */
    static void m14948a(List<AssetsModel> list, int i) {
        if (i != 1) {
            ArrayList arrayList = new ArrayList();
            for (AssetsModel assetsModel : list) {
                if (assetsModel.getDownloadType() == 2) {
                    arrayList.add(Long.valueOf(assetsModel.getId()));
                }
            }
            if (C9414h.m18630a(arrayList)) {
                HashMap hashMap = new HashMap();
                hashMap.put("source_type", Integer.valueOf(i));
                C3837e.m9743a(C7647s.m15643a("ttlive_gift_asset_download_list_status"), 0, (Map<String, Object>) hashMap);
                return;
            }
            String obj = arrayList.toString();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error_msg", obj);
            hashMap2.put("source_type", Integer.valueOf(i));
            C3837e.m9743a(C7647s.m15643a("ttlive_gift_asset_download_list_status"), 1, (Map<String, Object>) hashMap2);
            C3837e.m9743a(C7647s.m15652b("ttlive_gift_asset_download_list_status"), 1, (Map<String, Object>) hashMap2);
            C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_asset_download_list_status", 1, (Map) hashMap2);
        }
    }

    /* renamed from: a */
    public final void mo13429a(AssetsModel assetsModel, int i) {
        m14947a(assetsModel, (C7210g) null, i);
    }

    /* renamed from: a */
    public final void mo13428a(long j, C7210g gVar, int i) {
        m14947a(mo13434c(j), gVar, i);
    }

    /* renamed from: a */
    private void m14947a(AssetsModel assetsModel, final C7210g gVar, int i) {
        boolean z;
        C51568c a = C5212b.m11810a(assetsModel, i);
        if (a == null) {
            if (gVar != null) {
                gVar.mo8669a((Throwable) new Exception("AssetsManager.downloadAssets: GetResourceRequest is null"));
            }
            return;
        }
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        a.f128822f = z;
        if (gVar == null) {
            C51588f.m110738a().mo105506a(a);
        } else {
            C51588f.m110738a().mo105507a(a, (C51574d) new C51574d() {
                /* renamed from: a */
                public final void mo13435a(long j) {
                    gVar.mo8667a(j);
                }

                /* renamed from: a */
                public final void mo13437a(Throwable th) {
                    gVar.mo8669a(th);
                }

                /* renamed from: a */
                public final void mo13436a(long j, String str) {
                    gVar.mo8668a(j, str);
                }
            });
        }
        if (!C51588f.m110738a().mo105509b(a)) {
            C7647s.m15645a(assetsModel.getId(), i);
        }
    }
}

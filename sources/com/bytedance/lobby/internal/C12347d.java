package com.bytedance.lobby.internal;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0794k;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.lobby.auth.C12318c;
import com.bytedance.lobby.auth.C12321d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lobby.internal.d */
public final class C12347d {

    /* renamed from: a */
    private static volatile C12347d f32543a;

    /* renamed from: b */
    private Map<String, C12321d> f32544b = new C0777a();

    private C12347d() {
    }

    /* renamed from: a */
    public static C12347d m24857a() {
        if (f32543a == null) {
            synchronized (C12347d.class) {
                if (f32543a == null) {
                    f32543a = new C12347d();
                }
            }
        }
        return f32543a;
    }

    /* renamed from: a */
    public final boolean mo23348a(String str) {
        C12321d b = mo23349b(str);
        if (b == null || !b.mo23333c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized C12321d mo23349b(String str) {
        C12321d dVar = (C12321d) this.f32544b.get(str);
        if (dVar == null) {
            return null;
        }
        dVar.mo23340f();
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo23347a(C12321d dVar) {
        this.f32544b.put(dVar.mo23339e().f32487b, dVar);
    }

    /* renamed from: a */
    public static void m24858a(C12318c cVar) {
        Bundle bundle;
        if (cVar.f32475d == null) {
            bundle = new Bundle();
        } else {
            bundle = cVar.f32475d;
        }
        bundle.putString("provider_id", cVar.f32473b);
        bundle.putInt("action_type", 1);
        if (cVar.f32474c != null) {
            C12341a a = C12341a.m24846a();
            String str = cVar.f32473b;
            C12316a aVar = cVar.f32474c;
            synchronized (a.f32536a) {
                C0794k kVar = new C0794k(str, Integer.valueOf(1));
                List list = (List) a.f32536a.get(kVar);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    a.f32536a.put(kVar, arrayList);
                } else if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
        Intent intent = new Intent(cVar.f32472a, LobbyInvisibleActivity.class);
        intent.putExtras(bundle);
        cVar.f32472a.startActivityForResult(intent, BaseNotice.HASHTAG);
    }
}

package com.bytedance.android.livesdk.gift.effect.normal.p369a;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b;
import com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b.C7422a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.a.a */
public final class C7415a {
    /* renamed from: a */
    public final C7421b mo13700a(Object... objArr) {
        String str;
        boolean z;
        C7422a aVar;
        boolean z2 = false;
        C7810ao aoVar = objArr[0];
        C7505d dVar = objArr[1];
        User user = objArr[2];
        String str2 = dVar.f20542c;
        int i = aoVar.f21499h;
        int i2 = aoVar.f21500i;
        String str3 = null;
        if (aoVar.f21498g == 1) {
            str3 = C2942b.m8369a().mo34889b(aoVar.f21492a);
            str = aoVar.baseMessage.f24135f;
            if (str != null) {
                String[] split = str.split(":");
                if (split.length > 1) {
                    str = split[1];
                }
            }
        } else {
            str = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (aoVar.f21493b == null || aoVar.f21493b.getId() <= 0 || (user != null && aoVar.f21493b.getId() == user.getId())) {
            z = true;
        } else {
            user = aoVar.f21493b;
            str2 = C3922z.m9915e().getResources().getString(R.string.ecf, new Object[]{user.getNickName()});
            z = false;
        }
        long j = aoVar.baseMessage.f24133d;
        if (aoVar.f21500i > 1) {
            aVar = C7422a.group;
        } else {
            aVar = C7422a.normal;
        }
        boolean z3 = dVar.f20539H;
        C7505d dVar2 = dVar;
        C7421b bVar = new C7421b(j, aoVar.f21494c);
        bVar.f20331h = str3;
        bVar.f20330g = str;
        if (aoVar.f21498g == 1) {
            z2 = true;
        }
        bVar.f20329f = z2;
        bVar.f20326c = i;
        bVar.f20324a = i2;
        bVar.f20325b = aoVar.f21501j;
        C7505d dVar3 = dVar2;
        bVar.f20328e = dVar3.f20541b;
        bVar.f20319k = str2;
        bVar.f20320l = aoVar.f21492a;
        bVar.f20321m = user;
        bVar.f20323o = dVar3.f20545f;
        bVar.f20322n = z;
        bVar.f20334r = aVar;
        bVar.f20332p = dVar3.f20557r;
        bVar.f20333q = aoVar;
        bVar.f20335s = z3;
        return bVar;
    }
}

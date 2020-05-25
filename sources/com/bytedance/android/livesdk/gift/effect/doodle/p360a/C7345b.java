package com.bytedance.android.livesdk.gift.effect.doodle.p360a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.C7191a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.doodle.p362c.C7350a;
import com.bytedance.android.livesdk.gift.effect.doodle.p362c.C7351b;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.model.C7794aa;
import com.bytedance.android.livesdk.message.model.C7795ab;
import com.bytedance.android.livesdk.message.model.C8017z;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.a.b */
public final class C7345b {
    /* renamed from: a */
    public static C7351b m15191a(Object... objArr) {
        C8017z zVar = objArr[0];
        C7794aa aaVar = zVar.f21950g;
        User user = null;
        if (aaVar == null || aaVar.f21433a == null || aaVar.f21433a.isEmpty()) {
            return null;
        }
        C7351b bVar = new C7351b(zVar.baseMessage.f24133d);
        float f = (float) aaVar.f21435c;
        bVar.f20052a = (float) aaVar.f21434b;
        bVar.f20053b = f;
        List<C7795ab> list = aaVar.f21433a;
        float a = (float) ((C7795ab) list.get(0)).mo14139a();
        float b = (float) ((C7795ab) list.get(0)).mo14140b();
        float b2 = (float) ((C7795ab) list.get(0)).mo14140b();
        float a2 = (float) ((C7795ab) list.get(0)).mo14139a();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C7795ab abVar = (C7795ab) list.get(i2);
            int a3 = abVar.mo14139a();
            int b3 = abVar.mo14140b();
            String a4 = C7191a.m14934a(abVar.f21438c);
            if (a4 != null) {
                bVar.f20054c.add(new C7350a(a3, b3, a4));
            }
            if (((float) abVar.mo14139a()) > a) {
                a = (float) abVar.mo14139a();
            } else if (((float) abVar.mo14139a()) < a2) {
                a2 = (float) abVar.mo14139a();
            }
            if (((float) abVar.mo14140b()) > b) {
                b = (float) abVar.mo14140b();
            } else if (((float) abVar.mo14140b()) < b2) {
                b2 = (float) abVar.mo14140b();
            }
            C7505d findGiftById = GiftManager.inst().findGiftById(abVar.f21438c);
            if (findGiftById != null && findGiftById.f20545f > 0) {
                i += findGiftById.f20545f;
            }
        }
        bVar.f20059h = i;
        if (zVar.f21945b != null && zVar.f21945b.getId() > 0) {
            user = zVar.f21945b;
        }
        float f2 = a - a2;
        if (f2 > 0.0f) {
            bVar.f20055d = f2;
        }
        float f3 = b - b2;
        if (f3 > 0.0f) {
            bVar.f20056e = f3;
        }
        bVar.f20057f = a2;
        bVar.f20058g = b2;
        bVar.f20319k = zVar.baseMessage.f24135f;
        bVar.f20320l = zVar.f21944a;
        bVar.f20321m = user;
        return bVar;
    }
}

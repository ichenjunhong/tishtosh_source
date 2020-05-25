package com.p683ss.android.ugc.aweme.sticker.types.unlock;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.a */
public class C46602a {

    /* renamed from: a */
    private static volatile C46602a f117580a;

    /* renamed from: c */
    private static SharedPreferences f117581c;

    /* renamed from: b */
    private List<String> f117582b;

    /* renamed from: d */
    private C17971f f117583d = C39629l.m88232a().mo58566D();

    private C46602a() {
    }

    /* renamed from: b */
    public final List<String> mo93412b() {
        if (this.f117582b == null) {
            this.f117582b = m101159c();
        }
        return this.f117582b;
    }

    /* renamed from: a */
    public static C46602a m101158a() {
        if (f117580a == null) {
            synchronized (C46602a.class) {
                f117581c = C35807d.m80935a(C39629l.m88233b(), "commerce_sticker_unlock", 0);
                f117580a = new C46602a();
            }
        }
        return f117580a;
    }

    /* renamed from: c */
    private List<String> m101159c() {
        ArrayList arrayList = new ArrayList();
        try {
            String string = f117581c.getString("sticker_id_info", null);
            if (TextUtils.isEmpty(string)) {
                return arrayList;
            }
            List list = (List) this.f117583d.mo34885a(string, new C17956a<List<String>>() {
            }.f49843c);
            if (list != null) {
                arrayList.addAll(list);
            }
            return arrayList;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo93411a(Effect effect) {
        if (C46059g.m100086j(effect)) {
            String effectId = effect.getEffectId();
            if (!mo93412b().contains(effectId)) {
                mo93412b().add(effectId);
                f117581c.edit().putString("sticker_id_info", this.f117583d.mo34889b(mo93412b())).apply();
            }
        }
    }
}

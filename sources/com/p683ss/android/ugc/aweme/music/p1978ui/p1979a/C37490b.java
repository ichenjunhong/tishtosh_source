package com.p683ss.android.ugc.aweme.music.p1978ui.p1979a;

import android.support.p043v7.p051e.C1208c.C1212c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d;
import java.util.Objects;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a.b */
public final class C37490b extends C1212c<C37682d> {
    /* renamed from: a */
    public final /* synthetic */ boolean mo3932a(Object obj, Object obj2) {
        Object obj3;
        C37682d dVar = (C37682d) obj;
        C37682d dVar2 = (C37682d) obj2;
        C52711k.m112240b(dVar, "p0");
        C52711k.m112240b(dVar2, "p1");
        Music music = dVar.f96090a;
        String str = null;
        if (music != null) {
            obj3 = music.getMid();
        } else {
            obj3 = null;
        }
        Music music2 = dVar2.f96090a;
        if (music2 != null) {
            str = music2.getMid();
        }
        return Objects.equals(obj3, str);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo3933b(Object obj, Object obj2) {
        Object obj3;
        C37682d dVar = (C37682d) obj;
        C37682d dVar2 = (C37682d) obj2;
        C52711k.m112240b(dVar, "p0");
        C52711k.m112240b(dVar2, "p1");
        Music music = dVar.f96090a;
        String str = null;
        if (music != null) {
            obj3 = music.getMid();
        } else {
            obj3 = null;
        }
        Music music2 = dVar2.f96090a;
        if (music2 != null) {
            str = music2.getMid();
        }
        return Objects.equals(obj3, str);
    }
}

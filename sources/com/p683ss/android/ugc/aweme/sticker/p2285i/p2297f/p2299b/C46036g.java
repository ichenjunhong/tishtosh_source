package com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.f.b.g */
public final class C46036g {
    /* renamed from: a */
    private static final boolean m100021a(Effect effect) {
        if (effect == null) {
            return false;
        }
        if ((C39629l.m88232a().mo58593x().mo74282b() || !C44518a.m97418b(effect)) && (!C39629l.m88232a().mo58593x().mo74280a() || !C44518a.m97418b(effect))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final List<Effect> m100019a(List<? extends StickerWrapper> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            list = null;
        }
        if (list == null) {
            return new ArrayList<>();
        }
        Iterable<StickerWrapper> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (StickerWrapper stickerWrapper : iterable) {
            arrayList.add(stickerWrapper.f115779a);
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final List<StickerWrapper> m100020a(List<? extends Effect> list, String str) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            list = null;
        }
        if (list == null) {
            return new ArrayList<>();
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (m100021a((Effect) next)) {
                arrayList.add(next);
            }
        }
        Iterable<Effect> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (Effect stickerWrapper : iterable2) {
            arrayList2.add(new StickerWrapper(stickerWrapper, str, 3));
        }
        return (List) arrayList2;
    }
}

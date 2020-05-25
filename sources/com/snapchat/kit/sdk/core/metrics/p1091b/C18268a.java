package com.snapchat.kit.sdk.core.metrics.p1091b;

import android.util.Base64;
import com.google.gson.C17971f;
import com.google.gson.C18086p;
import com.google.gson.p1077b.C17956a;
import com.snapchat.kit.sdk.core.metrics.C18267b;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.a */
public final class C18268a {

    /* renamed from: a */
    private static final Type f50451a = new C17956a<List<C18267b<String>>>() {
    }.f49843c;

    /* renamed from: b */
    private final C17971f f50452b;

    C18268a(C17971f fVar) {
        this.f50452b = fVar;
    }

    /* renamed from: a */
    public final <T extends Message> String mo36431a(List<C18267b<T>> list) {
        try {
            return this.f50452b.mo34890b(m44484b(list), f50451a);
        } catch (C18086p unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static <T extends Message> List<C18267b<String>> m44484b(List<C18267b<T>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C18267b bVar : list) {
            try {
                arrayList.add(new C18267b(Base64.encodeToString(((Message) bVar.f50450b).encode(), 0), bVar.f50449a));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final <T extends Message> List<C18267b<T>> mo36432a(ProtoAdapter<T> protoAdapter, String str) {
        try {
            List list = (List) this.f50452b.mo34885a(str, f50451a);
            if (list == null) {
                return null;
            }
            return m44483a(protoAdapter, list);
        } catch (C18086p unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T extends Message> List<C18267b<T>> m44483a(ProtoAdapter<T> protoAdapter, List<C18267b<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C18267b bVar : list) {
            String str = (String) bVar.f50450b;
            if (str != null) {
                try {
                    arrayList.add(new C18267b((Message) protoAdapter.decode(Base64.decode(str, 0)), bVar.f50449a));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}

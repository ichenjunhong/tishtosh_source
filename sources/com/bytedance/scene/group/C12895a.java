package com.bytedance.scene.group;

import com.bytedance.scene.C12924i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.scene.group.a */
final class C12895a {

    /* renamed from: a */
    List<GroupRecord> f33753a = new ArrayList();

    /* renamed from: b */
    final Map<C12924i, GroupRecord> f33754b = new HashMap();

    /* renamed from: c */
    final Map<String, GroupRecord> f33755c = new HashMap();

    /* renamed from: b */
    public final List<GroupRecord> mo24383b() {
        return Collections.unmodifiableList(this.f33753a);
    }

    C12895a() {
    }

    /* renamed from: a */
    public final List<C12924i> mo24382a() {
        ArrayList arrayList = new ArrayList();
        for (GroupRecord groupRecord : this.f33753a) {
            arrayList.add(groupRecord.f33742b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final GroupRecord mo24380a(C12924i iVar) {
        return (GroupRecord) this.f33754b.get(iVar);
    }

    /* renamed from: a */
    public final GroupRecord mo24381a(String str) {
        return (GroupRecord) this.f33755c.get(str);
    }
}

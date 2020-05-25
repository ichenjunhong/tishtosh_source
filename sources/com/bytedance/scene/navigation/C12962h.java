package com.bytedance.scene.navigation;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.navigation.h */
final class C12962h {

    /* renamed from: a */
    List<Record> f33947a = new ArrayList();

    /* renamed from: c */
    public final List<Record> mo24559c() {
        return new ArrayList(this.f33947a);
    }

    C12962h() {
    }

    /* renamed from: b */
    public final boolean mo24558b() {
        if (this.f33947a.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Record mo24556a() {
        if (this.f33947a.size() > 0) {
            return (Record) this.f33947a.get(this.f33947a.size() - 1);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo24557a(Record record) {
        this.f33947a.remove(record);
    }
}

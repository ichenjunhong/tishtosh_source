package com.bytedance.p879t.p881b;

import com.bytedance.p879t.C13232b;
import com.bytedance.p879t.C13240c;
import com.bytedance.p879t.C13249d;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.t.b.f */
public final class C13238f implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<C13233a> adVerificationList;
    public List<C13234b> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    public final Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new C13249d(this).mo24839b(str, i));
    }

    public final Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new C13249d(this).mo24838a(str, i));
    }

    public final Boolean parseContent(String str, int i, C13232b bVar) {
        return Boolean.valueOf(new C13249d(this, bVar).mo24839b(str, i));
    }

    public final Boolean parseUri(String str, int i, C13232b bVar) {
        return Boolean.valueOf(new C13249d(this, bVar).mo24838a(str, i));
    }

    public final Boolean parseContent(String str, int i, C13232b bVar, C13240c cVar) {
        return Boolean.valueOf(new C13249d(this, bVar, cVar).mo24839b(str, i));
    }

    public final Boolean parseUri(String str, int i, C13232b bVar, C13240c cVar) {
        return Boolean.valueOf(new C13249d(this, bVar, cVar).mo24838a(str, i));
    }
}

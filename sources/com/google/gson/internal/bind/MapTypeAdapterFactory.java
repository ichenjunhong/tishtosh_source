package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18082l;
import com.google.gson.C18088r;
import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C17986b;
import com.google.gson.internal.C18043c;
import com.google.gson.internal.C18059e;
import com.google.gson.internal.C18069h;
import com.google.gson.internal.C18072k;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public final class MapTypeAdapterFactory implements C18097x {

    /* renamed from: a */
    final boolean f49947a;

    /* renamed from: b */
    private final C18043c f49948b;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    final class C17991a<K, V> extends C18095w<Map<K, V>> {

        /* renamed from: b */
        private final C18095w<K> f49950b;

        /* renamed from: c */
        private final C18095w<V> f49951c;

        /* renamed from: d */
        private final C18069h<? extends Map<K, V>> f49952d;

        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            C17960b f = aVar.mo34843f();
            if (f == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            Map map = (Map) this.f49952d.mo34956a();
            if (f == C17960b.BEGIN_ARRAY) {
                aVar.mo34837a();
                while (aVar.mo34842e()) {
                    aVar.mo34837a();
                    Object read = this.f49950b.read(aVar);
                    if (map.put(read, this.f49951c.read(aVar)) == null) {
                        aVar.mo34838b();
                    } else {
                        StringBuilder sb = new StringBuilder("duplicate key: ");
                        sb.append(read);
                        throw new C18091u(sb.toString());
                    }
                }
                aVar.mo34838b();
            } else {
                aVar.mo34839c();
                while (aVar.mo34842e()) {
                    C18059e.f50107a.mo34856a(aVar);
                    Object read2 = this.f49950b.read(aVar);
                    if (map.put(read2, this.f49951c.read(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder("duplicate key: ");
                        sb2.append(read2);
                        throw new C18091u(sb2.toString());
                    }
                }
                aVar.mo34841d();
            }
            return map;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                cVar.mo34870f();
            } else if (!MapTypeAdapterFactory.this.f49947a) {
                cVar.mo34868d();
                for (Entry entry : map.entrySet()) {
                    cVar.mo34861a(String.valueOf(entry.getKey()));
                    this.f49951c.write(cVar, entry.getValue());
                }
                cVar.mo34869e();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Entry entry2 : map.entrySet()) {
                    C18082l jsonTree = this.f49950b.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (jsonTree.mo35005i() || jsonTree.mo35006j()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    cVar.mo34863b();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo34863b();
                        C18072k.m44267a((C18082l) arrayList.get(i), cVar);
                        this.f49951c.write(cVar, arrayList2.get(i));
                        cVar.mo34865c();
                        i++;
                    }
                    cVar.mo34865c();
                    return;
                }
                cVar.mo34868d();
                int size2 = arrayList.size();
                while (i < size2) {
                    C18082l lVar = (C18082l) arrayList.get(i);
                    if (lVar.mo35007k()) {
                        C18088r o = lVar.mo35011o();
                        if (o.mo35033q()) {
                            str = String.valueOf(o.mo34904b());
                        } else if (o.mo35030a()) {
                            str = Boolean.toString(o.mo34911h());
                        } else if (o.mo35034r()) {
                            str = o.mo34905c();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (lVar.mo35008l()) {
                        str = TEVideoRecorder.FACE_BEAUTY_NULL;
                    } else {
                        throw new AssertionError();
                    }
                    cVar.mo34861a(str);
                    this.f49951c.write(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo34869e();
            }
        }

        public C17991a(C17971f fVar, Type type, C18095w<K> wVar, Type type2, C18095w<V> wVar2, C18069h<? extends Map<K, V>> hVar) {
            this.f49950b = new C18011i(fVar, wVar, type);
            this.f49951c = new C18011i(fVar, wVar2, type2);
            this.f49952d = hVar;
        }
    }

    public MapTypeAdapterFactory(C18043c cVar, boolean z) {
        this.f49948b = cVar;
        this.f49947a = z;
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Type[] typeArr;
        C18095w<Boolean> wVar;
        Type type = aVar.f49843c;
        if (!Map.class.isAssignableFrom(aVar.f49842b)) {
            return null;
        }
        Class b = C17986b.m44149b(type);
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type a = C17986b.m44145a(type, b, Map.class);
            typeArr = a instanceof ParameterizedType ? ((ParameterizedType) a).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            wVar = C18012j.f50057f;
        } else {
            wVar = fVar.mo34877a(C17956a.m44007a(type2));
        }
        C17991a aVar2 = new C17991a(fVar, typeArr[0], wVar, typeArr[1], fVar.mo34877a(C17956a.m44007a(typeArr[1])), this.f49948b.mo34954a(aVar));
        return aVar2;
    }
}

package com.p683ss.android.ugc.aweme.search.gson;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C17986b;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory */
public final class SearchMixFeedCollectionTypeAdapterFactory implements C18097x {

    /* renamed from: a */
    public static boolean f104995a;

    /* renamed from: com.ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory$a */
    static final class C41426a<E> extends C18095w<Collection<E>> {

        /* renamed from: a */
        private final C18095w<E> f104996a;

        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            aVar.mo34837a();
            int i = 3;
            boolean z = SearchMixFeedCollectionTypeAdapterFactory.f104995a;
            boolean z2 = false;
            int i2 = 0;
            while (aVar.mo34842e()) {
                if (!z || !z2 || arrayList.size() < i) {
                    Object read = this.f104996a.read(aVar);
                    if (read instanceof C28333l) {
                        C28333l lVar = (C28333l) read;
                        if (arrayList.isEmpty() && lVar.getFeedType() == 65280) {
                            i = 4;
                        }
                        if (z) {
                            lVar.f74343I = true;
                        }
                        z2 = true;
                    }
                    arrayList.add(read);
                } else {
                    aVar.mo34851o();
                }
                i2++;
            }
            aVar.mo34838b();
            if (!arrayList.isEmpty()) {
                for (Object next : arrayList) {
                    if (next instanceof C28333l) {
                        ((C28333l) next).f74344J = i2;
                    }
                }
            }
            return arrayList;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.mo34870f();
                return;
            }
            cVar.mo34863b();
            for (Object write : collection) {
                this.f104996a.write(cVar, write);
            }
            cVar.mo34865c();
        }

        C41426a(C17971f fVar, Type type, C18095w<E> wVar) {
            this.f104996a = new C41427a(fVar, wVar, type);
        }
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Type type = aVar.f49843c;
        Class<? super T> cls = aVar.f49842b;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = C17986b.m44144a(type, cls);
        if (!C28333l.class.equals(a)) {
            return null;
        }
        return new C41426a(fVar, a, fVar.mo34877a(C17956a.m44007a(a)));
    }
}

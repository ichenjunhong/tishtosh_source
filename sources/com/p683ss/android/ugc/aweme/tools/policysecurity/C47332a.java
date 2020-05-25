package com.p683ss.android.ugc.aweme.tools.policysecurity;

import android.content.Context;
import com.p683ss.android.ugc.aweme.tools.policysecurity.C47334b.C47335a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a */
public final class C47332a {

    /* renamed from: a */
    public static final C47333a f119486a = new C47333a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a$a */
    public static final class C47333a {
        private C47333a() {
        }

        public /* synthetic */ C47333a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String[] m102700a(Context context) {
            C52711k.m112240b(context, "context");
            Iterable<OriginalSoundUploadTask> a = C47335a.m102704a(context).mo94618a();
            Collection arrayList = new ArrayList(C52575l.m112104a(a, 10));
            for (OriginalSoundUploadTask originalSoundUploadTask : a) {
                arrayList.add(originalSoundUploadTask.f119484d);
            }
            Object[] array = ((List) arrayList).toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}

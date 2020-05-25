package com.aweme.storage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.aweme.storage.m */
class C2573m {

    /* renamed from: a */
    private static volatile StorageDatabase f7971a;

    C2573m() {
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.aweme.storage.C2568k m7520a(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.aweme.storage.StorageDatabase r1 = f7971a
            if (r1 != 0) goto L_0x0022
            java.lang.Class<com.aweme.storage.m> r1 = com.aweme.storage.C2573m.class
            monitor-enter(r1)
            java.lang.Class<com.aweme.storage.StorageDatabase> r2 = com.aweme.storage.StorageDatabase.class
            java.lang.String r3 = "storage_db"
            android.arch.c.b.f$a r4 = android.arch.p011c.p014b.C0141e.m302a(r4, r2, r3)     // Catch:{ Exception -> 0x001e }
            android.arch.c.b.f r4 = r4.mo252b()     // Catch:{ Exception -> 0x001e }
            com.aweme.storage.StorageDatabase r4 = (com.aweme.storage.StorageDatabase) r4     // Catch:{ Exception -> 0x001e }
            f7971a = r4     // Catch:{ Exception -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            goto L_0x0020
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x0022
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r4
        L_0x0022:
            com.aweme.storage.StorageDatabase r4 = f7971a
            if (r4 == 0) goto L_0x002d
            com.aweme.storage.StorageDatabase r4 = f7971a
            com.aweme.storage.k r4 = r4.mo7058g()
            return r4
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2573m.m7520a(android.content.Context):com.aweme.storage.k");
    }

    /* renamed from: a */
    static void m7521a(Context context, List<C2575n> list, int i) {
        if (context != null) {
            C2568k a = m7520a(context);
            if (a != null) {
                List<C2575n> a2 = a.mo7077a();
                ArrayList arrayList = new ArrayList();
                if (a2.size() > 0) {
                    C2575n[] nVarArr = new C2575n[a2.size()];
                    a2.toArray(nVarArr);
                    a.mo7079b(nVarArr);
                    for (C2575n nVar : a2) {
                        if (!(nVar == null || nVar.f7973b == null || !new File(nVar.f7973b).exists())) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= list.size()) {
                                    break;
                                }
                                C2575n nVar2 = (C2575n) list.get(i2);
                                if (nVar2 != null && nVar2.f7973b != null && nVar2.f7973b.equals(nVar.f7973b)) {
                                    nVar2.f7976e = nVar.f7976e + 1;
                                    nVar2.f7975d = nVar.f7975d;
                                    break;
                                }
                                i2++;
                            }
                            if (i2 >= list.size()) {
                                nVar.f7976e++;
                                arrayList.add(nVar);
                            }
                        }
                    }
                }
                list.addAll(arrayList);
                Collections.sort(list, new Comparator<C2575n>() {
                    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                        long j;
                        C2575n nVar = (C2575n) obj2;
                        long j2 = ((C2575n) obj).f7974c;
                        if (nVar == null) {
                            j = 0;
                        } else {
                            j = nVar.f7974c;
                        }
                        if (j2 < j) {
                            return 1;
                        }
                        if (j2 == j) {
                            return 0;
                        }
                        return -1;
                    }
                });
                if (list.size() > i) {
                    list = list.subList(0, i);
                }
                C2575n[] nVarArr2 = new C2575n[list.size()];
                list.toArray(nVarArr2);
                a.mo7078a(nVarArr2);
            }
        }
    }
}

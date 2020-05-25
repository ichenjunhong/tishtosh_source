package com.p683ss.android.ugc.aweme.p1361ap.p1362a;

import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22817e;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22797b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.ap.a.e */
final /* synthetic */ class C22800e implements C0011g {

    /* renamed from: a */
    private final C22795c f61082a;

    /* renamed from: b */
    private final int f61083b;

    /* renamed from: c */
    private final int f61084c;

    /* renamed from: d */
    private final C22817e f61085d;

    C22800e(C22795c cVar, int i, int i2, C22817e eVar) {
        this.f61082a = cVar;
        this.f61083b = i;
        this.f61084c = i2;
        this.f61085d = eVar;
    }

    public final Object then(C0013i iVar) {
        C22795c cVar = this.f61082a;
        int i = this.f61083b;
        int i2 = this.f61084c;
        C22817e eVar = this.f61085d;
        if (iVar.mo31c() || iVar.mo33d()) {
            if (i == 0) {
                for (C22797b a : cVar.f61076f) {
                    a.mo47279a(false, i2, null);
                }
            } else if (i == 2 && eVar != null) {
                eVar.mo47292a(false, i2, null);
            }
            return null;
        }
        if (i != 2) {
            Collection<MediaModel> collection = (Collection) iVar.mo34e();
            if (collection != null) {
                List<MediaModel> list = (List) cVar.f61073c.get(Integer.valueOf(i2));
                if (list == null) {
                    list = new ArrayList<>();
                    cVar.f61073c.put(Integer.valueOf(i2), list);
                }
                for (MediaModel mediaModel : list) {
                    cVar.f61072b.remove(mediaModel.f95383b);
                }
                list.clear();
                for (MediaModel mediaModel2 : collection) {
                    if (mediaModel2 != null) {
                        String str = mediaModel2.f95383b;
                        if (!cVar.f61072b.containsKey(str)) {
                            cVar.f61072b.put(str, mediaModel2);
                        }
                    }
                }
                list.addAll(collection);
                if (i == 1) {
                    cVar.mo47266a(i2);
                }
                Iterator it = cVar.f61074d.iterator();
                while (it.hasNext()) {
                    if (!cVar.f61072b.containsKey(((MediaModel) it.next()).f95383b)) {
                        it.remove();
                    }
                }
                cVar.mo47273b();
            }
            if (i == 0) {
                for (C22797b a2 : cVar.f61076f) {
                    a2.mo47279a(true, i2, (List) iVar.mo34e());
                }
            }
        } else if (eVar != null) {
            eVar.mo47292a(true, i2, (List) iVar.mo34e());
        }
        return null;
    }
}

package com.p683ss.android.ugc.aweme.share.more.p2167b;

import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.more.b.a */
public interface C42214a {

    /* renamed from: com.ss.android.ugc.aweme.share.more.b.a$a */
    public static final class C42215a implements C42214a {

        /* renamed from: a */
        public static final C42215a f106730a = new C42215a();

        /* renamed from: b */
        private static final List<String> f106731b = C52575l.m112099b((Object[]) new String[]{"report", "dislike", "save", "favorite", "live_photo"});

        private C42215a() {
        }

        /* renamed from: a */
        public final List<C42357g> mo86168a(List<? extends C42357g> list) {
            C52711k.m112240b(list, "actions");
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (f106731b.contains(((C42357g) next).mo49954c())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }

        /* renamed from: b */
        public final List<C42357g> mo86169b(List<? extends C42357g> list) {
            C52711k.m112240b(list, "actions");
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (!f106731b.contains(((C42357g) next).mo49954c())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.b.a$b */
    public static final class C42216b implements C42214a {

        /* renamed from: a */
        public static final C42216b f106732a = new C42216b();

        /* renamed from: b */
        private static final List<String> f106733b = C52575l.m112099b((Object[]) new String[]{"duet", "react", "reuse_sticker", "reuse_mv_template", "stitch", "delete"});

        private C42216b() {
        }

        /* renamed from: a */
        public final List<C42357g> mo86168a(List<? extends C42357g> list) {
            C52711k.m112240b(list, "actions");
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (f106733b.contains(((C42357g) next).mo49954c())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }

        /* renamed from: b */
        public final List<C42357g> mo86169b(List<? extends C42357g> list) {
            C52711k.m112240b(list, "actions");
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (!f106733b.contains(((C42357g) next).mo49954c())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: a */
    List<C42357g> mo86168a(List<? extends C42357g> list);

    /* renamed from: b */
    List<C42357g> mo86169b(List<? extends C42357g> list);
}

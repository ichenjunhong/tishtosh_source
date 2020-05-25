package com.p683ss.android.ugc.aweme.share.improve;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.setting.C41579ba;
import com.p683ss.android.ugc.aweme.share.p2154e.C42006a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d */
public final class C42155d implements Comparator<C42357g> {

    /* renamed from: a */
    public static final C42156a f106621a = new C42156a(null);

    /* renamed from: b */
    private final int f106622b = 1000;

    /* renamed from: c */
    private final List<C41579ba> f106623c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d$a */
    public static final class C42156a {
        private C42156a() {
        }

        public /* synthetic */ C42156a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    private static String m92525a(String str) {
        return str;
    }

    public C42155d() {
        C42006a a = C42006a.m91978a();
        C52711k.m112236a((Object) a, "I18nShareOrderUtil.getInstance()");
        this.f106623c = a.f106327b;
    }

    /* renamed from: a */
    private final int m92524a(String str, List<? extends C41579ba> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(((C41579ba) list.get(i)).f105302a, str)) {
                return i;
            }
        }
        return this.f106622b;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C42357g gVar = (C42357g) obj;
        C42357g gVar2 = (C42357g) obj2;
        if (gVar == null) {
            return -1;
        }
        boolean z = true;
        if (gVar2 == null) {
            return 1;
        }
        Collection collection = this.f106623c;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (z) {
            return 0;
        }
        return m92524a(m92525a(gVar.mo49954c()), this.f106623c) - m92524a(m92525a(gVar2.mo49954c()), this.f106623c);
    }
}

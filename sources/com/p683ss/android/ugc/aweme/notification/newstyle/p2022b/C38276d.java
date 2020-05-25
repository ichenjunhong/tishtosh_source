package com.p683ss.android.ugc.aweme.notification.newstyle.p2022b;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.d */
public interface C38276d {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.d$a */
    public static final class C38277a {
        /* renamed from: b */
        public static String m85523b(C38276d dVar) {
            return "";
        }

        /* renamed from: a */
        public static String m85522a(C38276d dVar) {
            String string = C11010c.m22280a().getString(R.string.bx4);
            C52711k.m112236a((Object) string, "AppContextManager.getApp…ring(R.string.list_empty)");
            return string;
        }
    }

    /* renamed from: a */
    C1352v mo78246a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    String mo78247a();

    /* renamed from: a */
    List<BaseNotice> mo78248a(List<BaseNotice> list);

    /* renamed from: a */
    void mo78249a(C1352v vVar, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap, boolean z);

    /* renamed from: b */
    String mo78250b();

    /* renamed from: c */
    String mo78251c();
}

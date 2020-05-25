package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.r */
public final class C42673r {

    /* renamed from: a */
    public static final C42674a f107974a = new C42674a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.r$a */
    public static final class C42674a {
        private C42674a() {
        }

        /* renamed from: b */
        private static boolean m93657b() {
            if (C39629l.m88232a().mo58574e().mo83118b(C40796a.Enable1080pFastImport) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final String mo86990a() {
            String e = C39629l.m88232a().mo58583n().mo83107e(C40790a.FastImportResolutionLimit);
            C52711k.m112236a((Object) e, "resolution");
            if (!m93655a(e)) {
                e = "720*1280";
            }
            if (m93657b() || m93656b(e) < 1080) {
                return e;
            }
            return "720*1280";
        }

        public /* synthetic */ C42674a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m93655a(String str) {
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
            return new C52820l("[0-9]+\\*[0-9]*").matches(charSequence);
        }

        /* renamed from: b */
        private static int m93656b(String str) {
            int i;
            boolean z;
            Iterable b = C52830p.m112452b((CharSequence) str, new String[]{"*"}, false, 0, 6, (Object) null);
            Collection arrayList = new ArrayList();
            for (Object next : b) {
                if (((String) next).length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(next);
                }
            }
            Iterable<String> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
            for (String parseInt : iterable) {
                try {
                    i = Integer.parseInt(parseInt);
                } catch (Exception unused) {
                    i = 720;
                }
                arrayList2.add(Integer.valueOf(i));
            }
            Integer num = (Integer) C52575l.m112147j((List) arrayList2);
            if (num != null) {
                return num.intValue();
            }
            return 720;
        }
    }
}

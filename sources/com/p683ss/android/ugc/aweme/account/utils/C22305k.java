package com.p683ss.android.ugc.aweme.account.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.utils.k */
public final class C22305k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f60082a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22305k.class), "WHATSAPP_CODE_SETTINGS", "getWHATSAPP_CODE_SETTINGS()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C22305k f60083b = new C22305k();

    /* renamed from: c */
    private static final Set<String> f60084c = new LinkedHashSet();

    /* renamed from: d */
    private static final C52668f f60085d = C52732g.m112285a(C22306a.f60086a);

    /* renamed from: com.ss.android.ugc.aweme.account.utils.k$a */
    static final class C22306a extends C52712l implements C52670a<List<WhatsAppCodeItem>> {

        /* renamed from: a */
        public static final C22306a f60086a = new C22306a();

        C22306a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m55201a();
        }

        /* renamed from: a */
        private static List<WhatsAppCodeItem> m55201a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                List showWhatsappByCallingCode = b.getShowWhatsappByCallingCode();
                C52711k.m112236a((Object) showWhatsappByCallingCode, "it");
                if (!showWhatsappByCallingCode.isEmpty()) {
                    return showWhatsappByCallingCode;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private C22305k() {
    }

    /* renamed from: a */
    public static final boolean m55195a(String str) {
        if (f60083b.m55200f(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m55197c(String str) {
        C52711k.m112240b(str, "phone");
        f60084c.add(str);
    }

    /* renamed from: d */
    public static final void m55198d(String str) {
        C52711k.m112240b(str, "phone");
        f60084c.remove(str);
    }

    /* renamed from: e */
    public static final boolean m55199e(String str) {
        C52711k.m112240b(str, "phone");
        return f60084c.contains(str);
    }

    /* renamed from: b */
    public static final boolean m55196b(String str) {
        try {
            WhatsAppCodeItem f = f60083b.m55200f(str);
            if (f == null) {
                return true;
            }
            Boolean whatsappFirst = f.getWhatsappFirst();
            if (whatsappFirst != null) {
                return whatsappFirst.booleanValue();
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: f */
    private final WhatsAppCodeItem m55200f(String str) {
        WhatsAppCodeItem whatsAppCodeItem = null;
        if (str == null) {
            return null;
        }
        List list = (List) f60085d.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                boolean z = false;
                try {
                    String callingCode = ((WhatsAppCodeItem) next).getCallingCode();
                    C52711k.m112236a((Object) callingCode, "it.callingCode");
                    if (callingCode != null) {
                        String a = C52830p.m112401a(C52830p.m112447b(callingCode).toString(), "+", "", false, 4, (Object) null);
                        String a2 = C52830p.m112401a(C52830p.m112447b(str).toString(), "+", "", false, 4, (Object) null);
                        if (TextUtils.isEmpty(a)) {
                            continue;
                        } else {
                            z = TextUtils.equals(a, a2);
                            continue;
                        }
                        if (z) {
                            whatsAppCodeItem = next;
                            break;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } catch (Exception unused) {
                }
            }
            whatsAppCodeItem = whatsAppCodeItem;
        }
        return whatsAppCodeItem;
    }
}

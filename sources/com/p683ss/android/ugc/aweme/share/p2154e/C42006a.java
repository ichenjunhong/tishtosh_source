package com.p683ss.android.ugc.aweme.share.p2154e;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.setting.C41579ba;
import com.p683ss.android.ugc.aweme.share.C41978ap;
import com.p683ss.android.ugc.trill.share.data.C50448a;
import com.p683ss.android.ugc.trill.share.data.C50449b;
import com.p683ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.share.e.a */
public class C42006a {

    /* renamed from: c */
    private static volatile C42006a f106325c;

    /* renamed from: a */
    public List<C41978ap> f106326a;

    /* renamed from: b */
    public List<C41579ba> f106327b;

    /* renamed from: d */
    private ShareDatabase f106328d = ShareDatabase.m108764a(C11010c.m22280a());

    /* renamed from: e */
    private Integer f106329e;

    /* renamed from: f */
    private Integer f106330f;

    /* renamed from: a */
    public static C42006a m91978a() {
        if (f106325c == null) {
            synchronized (C42006a.class) {
                if (f106325c == null) {
                    f106325c = new C42006a();
                }
            }
        }
        return f106325c;
    }

    private C42006a() {
        boolean z;
        C32458a.m75150b("I18nShareOrderUtil", "Instantiating I18nShareOrderUtil");
        String str = "I18nShareOrderUtil";
        StringBuilder sb = new StringBuilder("I18nShareOrderUtil instantiated, ShareDatabase ready: ");
        if (this.f106328d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C32458a.m75150b(str, sb.toString());
    }

    /* renamed from: b */
    public String[] mo86086b() {
        String[] strArr;
        if (this.f106326a == null || this.f106326a.isEmpty()) {
            strArr = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(C11010c.m22280a()).mo70124d();
        } else {
            strArr = new String[this.f106326a.size()];
            for (int i = 0; i < this.f106326a.size(); i++) {
                strArr[i] = ((C41978ap) this.f106326a.get(i)).f106248a;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String add : strArr) {
            arrayList.add(add);
        }
        if (!C23794bh.m58394h().mo70344b()) {
            arrayList.remove("chat_merge");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: a */
    public long mo86082a(int i) {
        try {
            if (this.f106328d != null) {
                return this.f106328d.mo98359g().mo98364c(Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo86083a(String str, int i) {
        C0013i.m16a((Callable<TResult>) new C42008c<TResult>(this, str, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo86085b(String str, int i) throws Exception {
        if (TextUtils.equals("more", str)) {
            return null;
        }
        try {
            ShareDatabase shareDatabase = this.f106328d;
            if (shareDatabase != null) {
                C50449b g = shareDatabase.mo98359g();
                g.mo98362a(new C50448a(Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(i)));
                if (this.f106330f != null) {
                    g.mo98363b(this.f106330f);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public String[] mo86084a(String[] strArr, int i, int i2) {
        int i3;
        try {
            if (this.f106328d != null) {
                HashMap hashMap = new HashMap();
                for (String put : strArr) {
                    hashMap.put(put, Integer.valueOf(0));
                }
                List<C50448a> a = this.f106328d.mo98359g().mo98361a(Integer.valueOf(i), Integer.valueOf(100));
                if (a.size() >= 100) {
                    this.f106330f = Integer.valueOf(((C50448a) a.get(a.size() - 1)).f126500a);
                }
                if (a.size() > i2 && i2 <= 100) {
                    a = a.subList(0, i2);
                }
                for (C50448a aVar : a) {
                    Integer num = (Integer) hashMap.get(aVar.f126502c);
                    String str = aVar.f126502c;
                    if (num == null) {
                        i3 = 1;
                    } else {
                        i3 = num.intValue() + 1;
                    }
                    hashMap.put(str, Integer.valueOf(i3));
                }
                Arrays.sort(strArr, new C42007b(hashMap, a));
                this.f106329e = Integer.valueOf(i);
            }
        } catch (Exception unused) {
        }
        return strArr;
    }
}

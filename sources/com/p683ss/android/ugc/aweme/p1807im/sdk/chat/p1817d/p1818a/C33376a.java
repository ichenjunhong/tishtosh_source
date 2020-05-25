package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35183aa;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35183aa.C35185a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a.a */
public final class C33376a extends UrlModel {
    @C17952c(mo34828a = "oid")

    /* renamed from: a */
    String f86547a;
    @C17952c(mo34828a = "skey")

    /* renamed from: b */
    String f86548b;
    @C17952c(mo34828a = "md5")

    /* renamed from: c */
    String f86549c;

    public final String getMd5() {
        return this.f86549c;
    }

    public final String getOid() {
        return this.f86547a;
    }

    public final String getSkey() {
        return this.f86548b;
    }

    public final void setMd5(String str) {
        this.f86549c = str;
    }

    public final void setOid(String str) {
        this.f86547a = str;
    }

    public final void setSkey(String str) {
        this.f86548b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33376a)) {
            return false;
        }
        C33376a aVar = (C33376a) obj;
        if (!TextUtils.equals(this.f86547a, aVar.f86547a) || !TextUtils.equals(this.f86548b, aVar.f86548b) || !TextUtils.equals(this.f86549c, aVar.f86549c)) {
            return false;
        }
        return true;
    }

    public static UrlModel convert(C33376a aVar) {
        C35185a aVar2;
        String str = null;
        if (aVar == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        String str2 = aVar.f86547a;
        String str3 = aVar.f86548b;
        List<String> list = C34004b.m77717a().mo71949f().getIMSetting().f91150h;
        if (list == null || list.size() <= 0) {
            aVar2 = new C35185a(Arrays.asList(C35183aa.f90464a), str2, str3);
        } else {
            if (list.size() < 3) {
                int size = 3 - list.size();
                int i = 0;
                while (i < C35183aa.f90464a.length && i < size) {
                    list.add(C35183aa.f90464a[i]);
                    i++;
                }
            }
            aVar2 = new C35185a(list, str2, str3);
        }
        ArrayList arrayList = new ArrayList();
        String a = aVar2.mo73318a();
        if (aVar2.f90469a != null && aVar2.f90469a.size() > 0) {
            for (int i2 = 0; i2 < aVar2.f90469a.size(); i2++) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) aVar2.f90469a.get(i2));
                sb.append(a);
                arrayList.add(sb.toString());
            }
        }
        urlModel.setUrlList(arrayList);
        String a2 = aVar2.mo73318a();
        if (aVar2.f90469a != null && aVar2.f90469a.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) aVar2.f90469a.get(0));
            sb2.append(a2);
            str = sb2.toString();
        }
        urlModel.setUri(str);
        return urlModel;
    }
}

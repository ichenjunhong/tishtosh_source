package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.shortvideo.C43847fp;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.af */
public final class C45248af {

    /* renamed from: a */
    public final List<String> f114440a = new ArrayList();

    /* renamed from: b */
    public final void mo91538b() {
        m98728e();
        m98727d();
        m98726c();
        m98729f();
    }

    /* renamed from: c */
    private void m98726c() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
        String currentUserID = baseUserService_Monster.getCurrentUserID();
        C52711k.m112236a((Object) currentUserID, "ServiceManager.get().get…class.java).currentUserID");
        m98725a("uid", currentUserID);
    }

    /* renamed from: d */
    private void m98727d() {
        boolean z;
        String c = C19034d.m46323c();
        CharSequence charSequence = c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = "0";
        }
        m98725a("did", c);
    }

    /* renamed from: e */
    private void m98728e() {
        m98725a("appid", String.valueOf(C39629l.m88232a().mo58588s().mo74154b()));
    }

    /* renamed from: f */
    private final void m98729f() {
        m98725a("version_code", String.valueOf(C11010c.m22293n()));
        m98725a("update_version_code", String.valueOf(C11010c.m22286g()));
    }

    /* renamed from: a */
    public final String mo91535a() {
        if (this.f114440a.isEmpty()) {
            return "";
        }
        Iterator it = this.f114440a.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                String str = (String) it.next();
                String str2 = (String) next;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append('&');
                sb.append(str);
                next = sb.toString();
            }
            String str3 = (String) next;
            StringBuilder sb2 = new StringBuilder("UploaderServerParam: ");
            sb2.append(str3);
            C50203g.m108358a(sb2.toString());
            return str3;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: a */
    public final void mo91536a(C43847fp fpVar) {
        boolean z;
        C52711k.m112240b(fpVar, "config");
        String str = fpVar.f111040k;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m98725a("store_region", str);
        }
    }

    /* renamed from: a */
    public final void mo91537a(C43852fu fuVar) {
        boolean z;
        C52711k.m112240b(fuVar, "videoConfig");
        String str = fuVar.f111080p;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C39566ar arVar = C39618d.f101167h;
            C52711k.m112236a((Object) arVar, "AVEnv.LOCATION_SERVICE");
            str = arVar.mo74214a();
        }
        C52711k.m112236a((Object) str, "region");
        m98725a("region", str);
        String str2 = fuVar.f111062C;
        CharSequence charSequence2 = str2;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            m98725a("store_region", str2);
        }
    }

    /* renamed from: a */
    private void m98725a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        List<String> list = this.f114440a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('=');
        sb.append(str2);
        list.add(sb.toString());
    }
}

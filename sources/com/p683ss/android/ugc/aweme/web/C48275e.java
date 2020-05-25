package com.p683ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.geckoclient.C10897g;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.model.C10963j;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27125a.C27127b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.e */
public final class C48275e implements C10897g {
    /* renamed from: a */
    private static JSONObject m104580a(int i, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        if (i != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(i));
            } catch (JSONException unused) {
            }
        }
        if (exc != null) {
            jSONObject.put("errorDesc", exc.toString());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo19670a(int i, C10957d dVar) {
        C23131p.m57776a("aweme_service_gecko_download_rate", 0, m104580a(i, (Exception) null));
        if (dVar != null && dVar.f29410j != null) {
            long j = (long) i;
            C25944j.m62908a().getPreloadAdWebHelper().mo53218a(j, dVar.f29403c, dVar.f29410j.f29439e);
            C27127b.m65446a().mo55442a(j, dVar.f29403c);
        }
    }

    /* renamed from: b */
    public final void mo19675b(int i, C10957d dVar) {
        C23131p.m57776a("aweme_service_gecko_activate_rate", 0, m104580a(i, (Exception) null));
        long j = (long) i;
        C25944j.m62908a().getPreloadAdWebHelper().mo53217a(j, dVar.f29403c);
        TextUtils.equals(dVar.f29403c, "rn_base_android");
        C27127b.m65446a().mo55445b(j, dVar.f29403c);
    }

    /* renamed from: a */
    public final void mo19672a(C10957d dVar, boolean z) {
        C25944j.m62908a().getPreloadAdWebHelper().mo53223a(dVar.f29403c, z);
        C27127b.m65446a().mo55444a(dVar.f29403c, z);
    }

    /* renamed from: a */
    public final void mo19673a(List<C10957d> list, Exception exc) {
        C23131p.m57776a("aweme_service_gecko_check_update_rate", 1, m104580a(-1, exc));
        ArrayList arrayList = new ArrayList();
        if (!C23715d.m58202a((Collection<T>) list)) {
            for (C10957d dVar : list) {
                arrayList.add(new Pair(dVar.f29403c, Long.valueOf((long) dVar.f29401a)));
            }
        }
        C25944j.m62908a().getPreloadAdWebHelper().mo53225a((List<? extends Pair<String, Long>>) arrayList, false);
    }

    /* renamed from: a */
    public final void mo19674a(List<C10957d> list, List<C10963j> list2) {
        C23131p.m57776a("aweme_service_gecko_check_update_rate", 0, m104580a(-1, (Exception) null));
        ArrayList arrayList = new ArrayList();
        if (!C23715d.m58202a((Collection<T>) list)) {
            for (C10957d dVar : list) {
                arrayList.add(new Pair(dVar.f29403c, Long.valueOf((long) dVar.f29401a)));
            }
        }
        C25944j.m62908a().getPreloadAdWebHelper().mo53225a((List<? extends Pair<String, Long>>) arrayList, true);
    }

    /* renamed from: a */
    public final void mo19671a(int i, C10957d dVar, Exception exc) {
        C23131p.m57776a("aweme_service_gecko_download_rate", 1, m104580a(i, exc));
        if (dVar != null && dVar.f29410j != null) {
            long j = (long) i;
            C25944j.m62908a().getPreloadAdWebHelper().mo53219a(j, dVar.f29403c, dVar.f29410j.f29439e, exc);
            C27127b.m65446a().mo55443a(j, dVar.f29403c, (Throwable) exc);
        }
    }

    /* renamed from: b */
    public final void mo19676b(int i, C10957d dVar, Exception exc) {
        C23131p.m57776a("aweme_service_gecko_activate_rate", 1, m104580a(i, exc));
        long j = (long) i;
        C25944j.m62908a().getPreloadAdWebHelper().mo53220a(j, dVar.f29403c, (Throwable) exc);
        C27127b.m65446a().mo55446b(j, dVar.f29403c, (Throwable) exc);
    }
}

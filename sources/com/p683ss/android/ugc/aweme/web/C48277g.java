package com.p683ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p607f.C10105a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27125a.C27127b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.g */
public final class C48277g extends C10105a {
    /* renamed from: a */
    public final void mo18073a(UpdatePackage updatePackage) {
        super.mo18073a(updatePackage);
        C25944j.m62908a().getPreloadAdWebHelper().mo53223a(updatePackage.getChannel(), updatePackage.isPatchUpdate());
        C27127b.m65446a().mo55444a(updatePackage.getChannel(), updatePackage.isPatchUpdate());
    }

    /* renamed from: b */
    public final void mo18079b(UpdatePackage updatePackage) {
        super.mo18079b(updatePackage);
        C23131p.m57776a("aweme_service_gecko_activate_rate", 0, m104592a(updatePackage.getVersion(), (Throwable) null));
        C25944j.m62908a().getPreloadAdWebHelper().mo53217a(updatePackage.getVersion(), updatePackage.getChannel());
        TextUtils.equals(updatePackage.getChannel(), "rn_base_android");
        C27127b.m65446a().mo55445b(updatePackage.getVersion(), updatePackage.getChannel());
    }

    /* renamed from: c */
    public final void mo18081c(UpdatePackage updatePackage) {
        super.mo18081c(updatePackage);
        C23131p.m57776a("aweme_service_gecko_download_rate", 0, m104592a(updatePackage.getVersion(), (Throwable) null));
        C25944j.m62908a().getPreloadAdWebHelper().mo53218a(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength());
        C27127b.m65446a().mo55442a(updatePackage.getVersion(), updatePackage.getChannel());
    }

    /* renamed from: a */
    private static JSONObject m104592a(long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (j != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(j));
            } catch (JSONException unused) {
            }
        }
        if (th != null) {
            jSONObject.put("errorDesc", th.toString());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo18074a(UpdatePackage updatePackage, Throwable th) {
        super.mo18074a(updatePackage, th);
        C23131p.m57776a("aweme_service_gecko_activate_rate", 1, m104592a(updatePackage.getVersion(), th));
        C25944j.m62908a().getPreloadAdWebHelper().mo53220a(updatePackage.getVersion(), updatePackage.getChannel(), th);
        C27127b.m65446a().mo55446b(updatePackage.getVersion(), updatePackage.getChannel(), th);
    }

    /* renamed from: b */
    public final void mo18080b(UpdatePackage updatePackage, Throwable th) {
        super.mo18080b(updatePackage, th);
        C23131p.m57776a("aweme_service_gecko_download_rate", 1, m104592a(updatePackage.getVersion(), th));
        C25944j.m62908a().getPreloadAdWebHelper().mo53219a(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength(), th);
        C27127b.m65446a().mo55443a(updatePackage.getVersion(), updatePackage.getChannel(), th);
    }

    /* renamed from: a */
    public final void mo18077a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
        super.mo18077a(map, th);
        C23131p.m57776a("aweme_service_gecko_check_update_rate", 1, m104592a(-1, th));
        if (map != null && !map.isEmpty()) {
            for (Entry value : map.entrySet()) {
                C25944j.m62908a().getPreloadAdWebHelper().mo53225a((List) value.getValue(), false);
            }
        }
    }

    /* renamed from: a */
    public final void mo18078a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        super.mo18078a(map, map2);
        C23131p.m57776a("aweme_service_gecko_check_update_rate", 0, m104592a(-1, (Throwable) null));
        if (map2 != null && !map2.isEmpty()) {
            for (Entry value : map2.entrySet()) {
                List<UpdatePackage> list = (List) value.getValue();
                if (!C23715d.m58202a((Collection<T>) list)) {
                    ArrayList arrayList = new ArrayList();
                    for (UpdatePackage updatePackage : list) {
                        arrayList.add(new Pair(updatePackage.getChannel(), Long.valueOf(updatePackage.getVersion())));
                    }
                    C25944j.m62908a().getPreloadAdWebHelper().mo53225a((List<? extends Pair<String, Long>>) arrayList, true);
                }
            }
        }
    }
}

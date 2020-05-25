package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.sdk.activity.C19722a;
import com.p683ss.android.sdk.activity.p1208a.C19724b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.DownloadBusiness */
public class DownloadBusiness extends Business {

    /* renamed from: a */
    public int f71637a = 0;

    /* renamed from: b */
    public int f71638b = 0;

    /* renamed from: c */
    private String f71639c;

    /* renamed from: d */
    private C19724b f71640d = new C19724b();

    DownloadBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo55488a(Activity activity) {
        int i;
        if (this.f71637a == 0) {
            i = R.id.bk;
        } else {
            i = this.f71637a;
        }
        activity.findViewById(i);
    }

    /* renamed from: a */
    public final void mo55489a(Activity activity, C27309j jVar) {
        int i;
        int i2;
        if (this.f71637a == 0) {
            i = R.id.bk;
        } else {
            i = this.f71637a;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(i);
        if (this.f71638b == 0) {
            i2 = R.id.bm;
        } else {
            i2 = this.f71638b;
        }
        activity.findViewById(i2);
        if (this.f71633j.f71719b.f71749d && !TextUtils.isEmpty(this.f71633j.f71719b.f71750e) && this.f71633j.f71719b.f71759n) {
            C19555f.m47851a();
        }
        frameLayout.setVisibility(8);
        C19724b bVar = this.f71640d;
        Bundle bundle = this.f71633j.f71718a.f71705b;
        if (bundle != null) {
            bVar.f54341a = bundle.getString("aweme_creative_id", "");
            bVar.f54343c = bundle.getString("aweme_group_id", "");
            bVar.f54344d = bundle.getString("bundle_download_app_log_extra");
            bVar.f54345e = bundle.getString("aweme_package_name");
            bVar.f54347g = bundle.getString("bundle_download_url");
            bVar.f54346f = bundle.getString("bundle_download_app_name");
            bVar.f54348h = bundle.getInt("bundle_app_ad_from", 0);
            bVar.f54350j = bundle.getString("bundle_download_app_extra");
            bVar.f54353m = bundle.getInt("bundle_download_mode");
            bVar.f54354n = bundle.getBoolean("bundle_support_multiple_download");
            try {
                bVar.f54351k = new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception unused) {
            }
            bVar.f54352l = bundle.getString("bundle_ad_quick_app_url");
            bVar.f54349i = C19724b.m48221a(bVar.f54348h);
            try {
                bVar.f54342b = Long.parseLong(bVar.f54341a);
            } catch (Exception unused2) {
            }
        }
        frameLayout.setOnClickListener(C27175e.f71698a);
        jVar.mo55729a().setDownloadListener(new C27176f(this, jVar, activity));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55490a(C27309j jVar, Activity activity, String str, String str2, String str3, String str4, long j) {
        if (!C26540w.m64256d(this.f71634k, str)) {
            C22521l monitorSession = jVar.mo55729a().getMonitorSession();
            if (monitorSession != null) {
                C22524n nVar = (C22524n) monitorSession.mo46870a(C22524n.class);
                if (nVar != null) {
                    nVar.mo46857a(str, str3, str4, j);
                }
            }
            Activity activity2 = activity;
            String str5 = str;
            C19722a.m48220a(activity2, this.f71633j.f71719b.f71746a, this.f71633j.f71719b.f71754i, str5, jVar.mo55729a().getUrl(), jVar.mo55729a().getUrl());
            if (!this.f71633j.f71719b.f71757l) {
                C9431p.m18664a(str);
            }
            this.f71639c = str;
        }
    }
}

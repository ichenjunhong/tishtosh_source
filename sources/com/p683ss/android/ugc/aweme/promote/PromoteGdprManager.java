package com.p683ss.android.ugc.aweme.promote;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p831b.C12706h;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.PopupSettingManager;
import com.p683ss.android.ugc.aweme.setting.model.PopupSetting;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteGdprManager */
public class PromoteGdprManager implements C9382a {

    /* renamed from: a */
    static PromoteGdprRequestApi f103769a = ((PromoteGdprRequestApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f103770b).create(PromoteGdprRequestApi.class));

    /* renamed from: b */
    private static final String f103770b = Api.f61282b;

    /* renamed from: c */
    private static SharedPreferences f103771c;

    /* renamed from: d */
    private PopupSetting f103772d;

    /* renamed from: com.ss.android.ugc.aweme.promote.PromoteGdprManager$PromoteGdprRequestApi */
    interface PromoteGdprRequestApi {
        @C12706h(mo23876a = "/aweme/v1/user/agreement/status/")
        C17832m<C40740b> requestGdprState();
    }

    /* renamed from: c */
    private void m90135c() {
        m90134b();
    }

    /* renamed from: a */
    private static SharedPreferences m90133a() {
        if (f103771c == null) {
            f103771c = C35807d.m80935a(AwemeApplication.m56199a(), "aweme-gdpr-dialog", 0);
        }
        return f103771c;
    }

    /* renamed from: b */
    private boolean m90134b() {
        if (this.f103772d == null) {
            return false;
        }
        this.f103772d = null;
        String curUserId = C20902b.m53242a().getCurUserId();
        SharedPreferences a = m90133a();
        StringBuilder sb = new StringBuilder("last_pop_time_");
        sb.append(curUserId);
        if (DateUtils.isToday(a.getLong(sb.toString(), 0))) {
            return false;
        }
        try {
            Editor edit = m90133a().edit();
            StringBuilder sb2 = new StringBuilder("last_pop_time_");
            sb2.append(curUserId);
            edit.putLong(sb2.toString(), System.currentTimeMillis());
            edit.apply();
        } catch (Exception unused) {
        }
        return true;
    }

    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        Context a = C11010c.m22280a();
        if (obj instanceof C23459a) {
            C10691a.m21545b(a, ((C23459a) obj).getErrorMsg()).mo19066a();
        } else if (obj instanceof Exception) {
            C10691a.m21545b(a, a.getResources().getString(R.string.cg2)).mo19066a();
        } else {
            if (obj instanceof C40740b) {
                boolean z = true;
                if (i == 1) {
                    C40740b bVar = (C40740b) obj;
                    if (bVar != null) {
                        if (bVar.f103789a == null || !bVar.f103789a.booleanValue()) {
                            z = false;
                        }
                        String curUserId = C20902b.m53242a().getCurUserId();
                        Editor edit = m90133a().edit();
                        StringBuilder sb = new StringBuilder("joined_");
                        sb.append(curUserId);
                        edit.putBoolean(sb.toString(), z);
                        edit.apply();
                        m90135c();
                    }
                    return;
                }
            }
            if (i == 2) {
                this.f103772d = PopupSettingManager.m91328a().mo85285a("gdpr_popup");
                m90135c();
            }
        }
    }
}

package com.p683ss.android.ugc.aweme.setting;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.model.PopupResponse;
import com.p683ss.android.ugc.aweme.setting.model.PopupSetting;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.setting.PopupSettingManager */
public class PopupSettingManager implements C9382a {

    /* renamed from: a */
    static PopupSettingRequestApi f105183a = ((PopupSettingRequestApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f105184b).create(PopupSettingRequestApi.class));

    /* renamed from: b */
    private static final String f105184b = Api.f61282b;

    /* renamed from: c */
    private static PopupSettingManager f105185c;

    /* renamed from: d */
    private C9381g f105186d = new C9381g(this);

    /* renamed from: e */
    private Map<C9381g, Integer> f105187e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, PopupSetting> f105188f = new HashMap();

    /* renamed from: g */
    private volatile boolean f105189g = false;

    /* renamed from: com.ss.android.ugc.aweme.setting.PopupSettingManager$PopupSettingRequestApi */
    interface PopupSettingRequestApi {
        @C53075f(mo110603a = "/aweme/v1/user/popup/")
        C17832m<PopupResponse> requestPopupConfig();
    }

    private PopupSettingManager() {
    }

    /* renamed from: a */
    public static PopupSettingManager m91328a() {
        if (f105185c == null) {
            synchronized (PopupSettingManager.class) {
                if (f105185c == null) {
                    f105185c = new PopupSettingManager();
                }
            }
        }
        return f105185c;
    }

    /* renamed from: a */
    private void m91329a(C9381g gVar) {
        C23566n.m57766a().mo48750a(gVar, new Callable() {
            public final Object call() throws Exception {
                try {
                    return PopupSettingManager.f105183a.requestPopupConfig().get();
                } catch (ExecutionException e) {
                    throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: a */
    public final PopupSetting mo85285a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PopupSetting popupSetting = (PopupSetting) this.f105188f.get(str);
        this.f105188f.put(str, null);
        return popupSetting;
    }

    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        this.f105189g = false;
        if (obj instanceof C23459a) {
            C10691a.m21545b(C11010c.m22280a(), ((C23459a) obj).getErrorMsg()).mo19066a();
        } else if (obj instanceof Exception) {
            C10691a.m21545b(C11010c.m22280a(), C11010c.m22280a().getResources().getString(R.string.cg2)).mo19066a();
        } else {
            if ((obj instanceof PopupResponse) && i == 1) {
                PopupResponse popupResponse = (PopupResponse) obj;
                if (popupResponse != null) {
                    List<PopupSetting> list = popupResponse.popups;
                    if (list != null) {
                        for (PopupSetting popupSetting : list) {
                            if (popupSetting != null) {
                                try {
                                    String str = popupSetting.f105367id;
                                    if (!TextUtils.isEmpty(str)) {
                                        this.f105188f.put(str, popupSetting);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                        Iterator it = this.f105187e.entrySet().iterator();
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            ((C9381g) entry.getKey()).sendEmptyMessage(((Integer) entry.getValue()).intValue());
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo85286a(C9381g gVar, int i) {
        this.f105187e.put(gVar, Integer.valueOf(i));
        if (!this.f105189g) {
            synchronized (this) {
                this.f105189g = true;
                m91329a(this.f105186d);
            }
        }
    }
}

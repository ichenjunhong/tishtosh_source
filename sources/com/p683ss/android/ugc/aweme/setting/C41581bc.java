package com.p683ss.android.ugc.aweme.setting;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.google.gson.C17971f;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.model.ShareSettings;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.bc */
public class C41581bc implements C9382a {

    /* renamed from: d */
    private static C41581bc f105305d;

    /* renamed from: a */
    protected ShareSettingApi f105306a = ((ShareSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(ShareSettingApi.class));

    /* renamed from: b */
    protected C9381g f105307b = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: c */
    public ShareSettings f105308c;

    /* renamed from: b */
    public final void mo85361b() {
        C23566n.m57766a().mo48750a(this.f105307b, new Callable() {
            public final Object call() throws Exception {
                try {
                    return (ShareSettings) C41581bc.this.f105306a.queryRawSetting().get();
                } catch (ExecutionException e) {
                    throw C23453a.getCompatibleException(e);
                }
            }
        }, 0);
    }

    /* renamed from: c */
    public final C0013i<Boolean> mo85362c() {
        return C0013i.m16a((Callable<TResult>) new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() throws Exception {
                String string = C41585bd.f105313a.getString("share_setting_key", "");
                if (TextUtils.isEmpty(string)) {
                    return Boolean.valueOf(false);
                }
                try {
                    ShareSettings shareSettings = (ShareSettings) new C17971f().mo34884a(string, ShareSettings.class);
                    C41526ag shareSetting = C41979aq.m91947b().getShareSetting();
                    shareSetting.mo85308a(shareSettings.sharePlatforms);
                    shareSetting.mo85309b(shareSettings.shareGifPlatforms);
                    shareSetting.mo85310c(shareSettings.shareOrderList);
                    shareSetting.mo85311d(shareSettings.mutedSharePlatforms);
                    C41581bc.this.f105308c = shareSettings;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(true);
            }
        });
    }

    /* renamed from: a */
    public static C41581bc m91416a() {
        if (f105305d == null) {
            synchronized (C41581bc.class) {
                if (f105305d == null) {
                    f105305d = new C41581bc();
                }
            }
        }
        return f105305d;
    }

    protected C41581bc() {
        mo85362c();
    }

    public void handleMsg(Message message) {
        mo85360a(message.obj);
    }

    /* renamed from: a */
    private void m91417a(final ShareSettings shareSettings) {
        if (shareSettings != null) {
            C9376b.m18558a((Collection<T>) shareSettings.sharePlatforms);
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    String b = new C17971f().mo34889b(shareSettings);
                    C41585bd.f105313a.edit().putString("share_setting_key", b).commit();
                    C41585bd.f105313a.edit().putBoolean("key_has_setting", !TextUtils.isEmpty(b)).commit();
                    C41581bc.this.mo85362c();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo85360a(Object obj) {
        if (obj instanceof Exception) {
            mo85362c();
            ((Exception) obj).getMessage();
            return;
        }
        if (obj instanceof ShareSettings) {
            m91417a((ShareSettings) obj);
        }
    }
}

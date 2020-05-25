package com.p683ss.android.ugc.aweme.friends.api;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.gson.C17978g;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p683ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.api.UploadContactsApi */
public final class UploadContactsApi {

    /* renamed from: a */
    private static final UploadContactsService f84784a = ((UploadContactsService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(UploadContactsService.class));

    /* renamed from: com.ss.android.ugc.aweme.friends.api.UploadContactsApi$UploadContactsService */
    public interface UploadContactsService {
        @C12718t(mo23886a = "/aweme/v1/upload/contacts/")
        @C12705g
        C12690b<String> uploadContacts(@C12724z(mo23894a = "need_unregistered_user") String str, @C12704f Map<String, String> map);

        @C12718t(mo23886a = "/aweme/v1/upload/hashcontacts/")
        @C12705g
        C12690b<UploadContactsResult> uploadHashContacts(@C12724z(mo23894a = "need_unregistered_user") String str, @C12704f Map<String, String> map);
    }

    /* renamed from: a */
    public static UploadContactsResult m75335a(List<ContactModelV2> list, int i) throws Exception {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (!C9376b.m18558a((Collection<T>) list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList = new ArrayList(list.size());
            for (ContactModelV2 contactModelV2 : list) {
                for (String str3 : contactModelV2.phoneNumber) {
                    if (str3 != null) {
                        str = C9395d.m18572a(instance.digest(contactModelV2.nationalNumber(str3).getBytes("UTF-8")));
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(contactModelV2.name)) {
                        str2 = C9395d.m18572a(instance.digest(contactModelV2.name.getBytes("UTF-8")));
                    } else {
                        str2 = "";
                    }
                    arrayList.add(new ContactModel(str, str2));
                }
            }
            C17978g createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
            createAdapterGsonBuilder.f49902a = createAdapterGsonBuilder.f49902a.mo34914a();
            hashMap.put("contact", createAdapterGsonBuilder.mo34900d().mo34889b(arrayList));
        }
        NetUtil.putCommonParams(hashMap, true);
        return (UploadContactsResult) f84784a.uploadHashContacts("1", hashMap).execute().f33552b;
    }
}

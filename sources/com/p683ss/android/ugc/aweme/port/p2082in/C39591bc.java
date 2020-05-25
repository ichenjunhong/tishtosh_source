package com.p683ss.android.ugc.aweme.port.p2082in;

import android.app.Service;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.bc */
public interface C39591bc extends C39648y {

    /* renamed from: com.ss.android.ugc.aweme.port.in.bc$a */
    public interface C39592a {
        /* renamed from: a */
        void mo78632a(String str);

        /* renamed from: c */
        String mo78634c();

        /* renamed from: d */
        String mo78635d();

        /* renamed from: e */
        boolean mo78636e();

        /* renamed from: f */
        void mo78637f();
    }

    /* renamed from: a */
    C17832m<? extends C42421al> mo74304a(String str, LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: a */
    HashMap<String, String> mo74305a(Object obj);

    /* renamed from: a */
    List<C0794k<Class<?>, IAVPublishExtension<?>>> mo74306a(AVPublishContentType aVPublishContentType);

    /* renamed from: a */
    void mo74307a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap);

    /* renamed from: a */
    void mo74308a(BaseResponse baseResponse, int i);

    /* renamed from: a */
    void mo74309a(BaseResponse baseResponse, List<InteractStickerStruct> list);

    /* renamed from: a */
    void mo74310a(boolean z);

    /* renamed from: a */
    boolean mo74311a();

    /* renamed from: a */
    boolean mo74312a(FragmentActivity fragmentActivity, Intent intent, Class<? extends Service> cls, String str, String str2);

    /* renamed from: b */
    C17832m<? extends C42421al> mo74313b(String str, LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: b */
    List<C44370d> mo74314b();
}

package com.p683ss.android.ugc.aweme.p1706fe.method.commerce;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IEditService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.VideoMedia;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import java.lang.ref.WeakReference;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod */
public final class VideoPublishMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29877a f77979a = new C29877a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod$a */
    public static final class C29877a {
        private C29877a() {
        }

        public /* synthetic */ C29877a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod$b */
    public static final class C29878b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ String f77980a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishMethod f77981b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f77982c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f77983d;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            Context context;
            C52711k.m112240b(asyncAVService, "service");
            Builder builder = new Builder();
            VideoMedia videoMedia = new VideoMedia(this.f77980a);
            Bundle bundle = new Bundle();
            bundle.putString("cc_vid", this.f77982c.optString("vid"));
            bundle.putBoolean("edit_publish_session_end_together", true);
            videoMedia.setExtraBundle(bundle);
            Builder creationId = builder.mediaInfo(videoMedia).creationId(UUID.randomUUID().toString());
            String optString = this.f77982c.optString("vid");
            C52711k.m112236a((Object) optString, "params.optString(FIELD_VID)");
            Builder shootWay = creationId.ccvid(optString).shootWay("enterprise_service_center");
            IEditService editService = asyncAVService.uiService().editService();
            WeakReference weakReference = this.f77981b.f77793e;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            editService.startEdit(context, shootWay.build());
            this.f77983d.put("code", 1);
        }

        C29878b(String str, VideoPublishMethod videoPublishMethod, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f77980a = str;
            this.f77981b = videoPublishMethod;
            this.f77982c = jSONObject;
            this.f77983d = jSONObject2;
        }
    }

    public VideoPublishMethod() {
        this(null, 1, null);
    }

    public VideoPublishMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", -1);
        if (jSONObject != null) {
            String optString = jSONObject.optString(LeakCanaryFileProvider.f132050j);
            if (optString != null) {
                boolean a = C24678b.m60182a(optString);
                if (!a) {
                    jSONObject2.put("reason", "path should not be empty");
                }
                if (!a) {
                    optString = null;
                }
                if (optString != null) {
                    boolean a2 = C47723bk.m103311a(optString);
                    if (!a2) {
                        jSONObject2.put("reason", "filePath doesn't exists");
                    }
                    if (!a2) {
                        optString = null;
                    }
                    if (optString != null) {
                        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C29878b(optString, this, jSONObject, jSONObject2));
                    }
                }
            }
        }
        aVar.mo60041a(jSONObject2);
    }

    private /* synthetic */ VideoPublishMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}

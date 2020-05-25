package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.ttuploader.TTImageInfo;
import com.p683ss.ttuploader.TTImageUploaderListener;
import com.p683ss.ttuploader.UploadEventManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a.h */
final /* synthetic */ class C33390h implements TTImageUploaderListener {

    /* renamed from: a */
    private final C33380e f86579a;

    /* renamed from: b */
    private final C33445y f86580b;

    /* renamed from: c */
    private final int f86581c;

    /* renamed from: d */
    private final String f86582d;

    C33390h(C33380e eVar, C33445y yVar, int i, String str) {
        this.f86579a = eVar;
        this.f86580b = yVar;
        this.f86581c = i;
        this.f86582d = str;
    }

    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        C33380e eVar = this.f86579a;
        C33445y yVar = this.f86580b;
        int i2 = this.f86581c;
        String str = this.f86582d;
        switch (i) {
            case 0:
                C35459a.m80148a("UploadManager", "TTImageUploader.MsgIsComplete");
                JSONArray popAllImageEvents = UploadEventManager.instance.popAllImageEvents();
                if (popAllImageEvents != null) {
                    for (int i3 = 0; i3 < popAllImageEvents.length(); i3++) {
                        try {
                            JSONObject jSONObject = popAllImageEvents.getJSONObject(i3);
                            if (jSONObject != null) {
                                StringBuilder sb = new StringBuilder("uploadImageLog ");
                                sb.append(i3);
                                sb.append(":");
                                sb.append(jSONObject.toString());
                                C35459a.m80150b("UploadManager", sb.toString());
                                TeaAgent.recordMiscLog(C11010c.m22280a(), "image_upload", jSONObject);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (yVar != null) {
                    yVar.mo70783a((double) ((((float) j) * 1.0f) / 100.0f));
                    return;
                }
                break;
            case 3:
                if (yVar != null) {
                    if (i2 == 1) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri(tTImageInfo.mImageUri);
                        yVar.mo70787a(str, urlModel);
                        return;
                    } else if (i2 == 0) {
                        C33376a aVar = new C33376a();
                        aVar.setOid(tTImageInfo.mObjectId);
                        aVar.setMd5(tTImageInfo.mSourceMd5);
                        aVar.setSkey(tTImageInfo.mSecretKey);
                        yVar.mo70787a(str, aVar);
                        return;
                    }
                }
                break;
            case 4:
                long j2 = tTImageInfo.mErrcode;
                if ((j2 == 10401 || j2 == 10402 || j2 == 10403 || j2 == 10408) && eVar.f86561g < 2) {
                    eVar.f86561g++;
                    eVar.mo70771a(str, i2, yVar, true);
                    return;
                } else if (yVar != null) {
                    yVar.mo70784a(String.valueOf(j2));
                    return;
                }
                break;
        }
    }
}

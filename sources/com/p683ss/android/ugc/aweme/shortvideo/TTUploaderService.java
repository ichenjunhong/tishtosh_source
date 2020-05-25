package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.p1057b.p1065h.p1066a.C17819d;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.io.IOException;
import java.util.LinkedHashMap;
import p001a.C0013i;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService */
public final class TTUploaderService {

    /* renamed from: a */
    public int f107168a = 0;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService$RetrofitService */
    interface RetrofitService {
        @C53075f(mo110603a = "/aweme/v1/pre/post/check/")
        C17832m<C43216dj> getServerPrePostResult(@C53089t(mo110619a = "check_type") int i, @C53089t(mo110619a = "freq_limit") int i2);

        @C53084o(mo110612a = "/aweme/v1/upload/authkey/")
        @C53074e
        C17832m<C43846fo> getUploadAuthKeyConfig(@C53073d LinkedHashMap<String, String> linkedHashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService$a */
    static class C42381a implements C17824h<VideoCreation> {

        /* renamed from: a */
        private int f107170a;

        public final void onFailure(Throwable th) {
        }

        public C42381a(int i) {
            this.f107170a = i;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            boolean z;
            VideoCreation videoCreation = (VideoCreation) obj;
            if (videoCreation instanceof C43846fo) {
                C39629l.m88232a().mo58574e().mo83115a(TTUploaderService.m93070a(this.f107170a), C39629l.m88232a().mo58566D().mo34889b(videoCreation));
                C43846fo foVar = (C43846fo) videoCreation;
                if (foVar.f111027b != null) {
                    C40795l e = C39629l.m88232a().mo58574e();
                    C40796a aVar = C40796a.EnablePreUpload;
                    boolean z2 = false;
                    if (foVar.f111027b.f111058b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    e.mo83116a(aVar, z);
                    C39629l.m88232a().mo58574e().mo83113a(C40796a.PreUploadEncryptionMode, foVar.f111027b.f111059c);
                    C40795l e2 = C39629l.m88232a().mo58574e();
                    C40796a aVar2 = C40796a.WatermarkHardcode;
                    if (foVar.f111027b.f111057a == 0) {
                        z2 = true;
                    }
                    e2.mo83116a(aVar2, z2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m93071a() {
        C0013i.m16a(C43837fj.f110999a);
    }

    public TTUploaderService(int i) {
    }

    /* renamed from: a */
    public static C40796a m93070a(int i) {
        if (i == 0) {
            return C40796a.SdkV4AuthKey;
        }
        return C40796a.StorySdkV4AuthKey;
    }

    /* renamed from: a */
    public final C17832m<VideoCreation> mo86428a(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(0);
        }
        C17832m uploadAuthKeyConfig = ((RetrofitService) com.p683ss.android.ugc.aweme.services.RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI()).create(RetrofitService.class)).getUploadAuthKeyConfig(linkedHashMap);
        C17825i.m43740a(uploadAuthKeyConfig, new C42381a(this.f107168a), C17833n.m43743a());
        return C17825i.m43735a(uploadAuthKeyConfig, IOException.class, new C17819d<IOException, Object>() {
            /* renamed from: a */
            public final /* synthetic */ C17832m mo34644a(Object obj) throws Exception {
                IOException iOException = (IOException) obj;
                String e = C39629l.m88232a().mo58574e().mo83121e(TTUploaderService.m93070a(TTUploaderService.this.f107168a));
                if (TextUtils.isEmpty(e)) {
                    return C17825i.m43737a((Throwable) iOException);
                }
                return C17825i.m43736a(C39629l.m88232a().mo58566D().mo34884a(e, C43846fo.class));
            }
        }, C17833n.m43743a());
    }

    /* renamed from: a */
    public static C17832m<C43216dj> m93069a(int i, int i2) {
        return ((RetrofitService) C39629l.m88232a().mo58595z().retrofitCreate(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI(), RetrofitService.class)).getServerPrePostResult(i, i2);
    }
}

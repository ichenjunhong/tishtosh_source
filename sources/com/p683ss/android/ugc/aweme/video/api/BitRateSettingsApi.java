package com.p683ss.android.ugc.aweme.video.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.video.api.BitRateSettingsApi */
public final class BitRateSettingsApi {

    /* renamed from: a */
    private static final IRetrofit f120628a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e);

    /* renamed from: com.ss.android.ugc.aweme.video.api.BitRateSettingsApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/rate/settings/")
        C17832m<RateSettingsResponse> fetchRateSettings();
    }

    /* renamed from: a */
    public static RateSettingsResponse m103826a() throws Exception {
        try {
            return (RateSettingsResponse) ((RealApi) f120628a.create(RealApi.class)).fetchRateSettings().get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C23459a) {
                int errorCode = ((C23459a) e.getCause()).getErrorCode();
                if (errorCode == 9 || errorCode == 14) {
                    return null;
                }
            }
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        } catch (IncompatibleClassChangeError unused) {
            return null;
        }
    }
}

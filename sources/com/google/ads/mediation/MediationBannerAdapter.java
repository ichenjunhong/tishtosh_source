package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.C14853b;
import com.google.ads.mediation.C14871e;
import com.google.ads.mediation.C14874f;

public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C14874f, SERVER_PARAMETERS extends C14871e> extends C14861b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(C14862c cVar, Activity activity, SERVER_PARAMETERS server_parameters, C14853b bVar, C14860a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}

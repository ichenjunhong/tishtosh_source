package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C14871e;
import com.google.ads.mediation.C14874f;

public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C14874f, SERVER_PARAMETERS extends C14871e> extends C14861b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(C14870d dVar, Activity activity, SERVER_PARAMETERS server_parameters, C14860a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}

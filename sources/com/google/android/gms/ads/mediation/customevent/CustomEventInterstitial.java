package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C15050a;

public interface CustomEventInterstitial extends C15057a {
    void requestInterstitialAd(Context context, C15060d dVar, String str, C15050a aVar, Bundle bundle);

    void showInterstitial();
}

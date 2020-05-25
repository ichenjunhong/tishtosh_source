package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C15050a;
import com.google.android.gms.ads.mediation.C15051b;

public interface MediationRewardedVideoAdAdapter extends C15051b {
    void initialize(Context context, C15050a aVar, String str, C15083a aVar2, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(C15050a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}

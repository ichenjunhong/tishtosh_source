package com.p683ss.android.ugc.aweme.services.cutvideo;

import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.ICutViewInternal */
public interface ICutViewInternal {
    ICutVideo getProxy();

    void initInternal(ViewGroup viewGroup);

    void setProxy(ICutVideo iCutVideo);
}

package com.p683ss.android.ugc.aweme.services.external;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: com.ss.android.ugc.aweme.services.external.IAVTypeFaceService */
public interface IAVTypeFaceService {
    Typeface getTypefaceByFontName(String str);

    void prefetch(Context context);
}

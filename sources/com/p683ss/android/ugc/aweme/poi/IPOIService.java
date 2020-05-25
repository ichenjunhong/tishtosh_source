package com.p683ss.android.ugc.aweme.poi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.IPOIService */
public interface IPOIService {

    /* renamed from: com.ss.android.ugc.aweme.poi.IPOIService$a */
    public interface C38950a {
        /* renamed from: a */
        void mo74232a();

        /* renamed from: a */
        void mo74233a(C38952c cVar, PoiStruct poiStruct, String str);

        /* renamed from: b */
        void mo74234b();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.IPOIService$b */
    public interface C38951b {
        /* renamed from: a */
        void mo79003a(C38952c cVar, PoiStruct poiStruct, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.IPOIService$c */
    public enum C38952c {
        RESULT_DEFAULT,
        RESULT_MANUAL
    }

    Dialog getPOISearchDialog(Activity activity, Bundle bundle, C38951b bVar);
}

package com.p683ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.c */
public final class C45546c extends C45547d {
    private C45546c(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C45546c m99207a(Context context, String str) {
        if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return null;
        }
        C45546c cVar = new C45546c(context, 3);
        cVar.setCancelable(false);
        cVar.setIndeterminate(false);
        cVar.setMax(100);
        cVar.show();
        cVar.setContentView(R.layout.a26);
        cVar.setMessage(str);
        cVar.mo91828a();
        return cVar;
    }
}

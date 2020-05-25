package com.p683ss.android.ugc.aweme.port.p2082in;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.au */
public interface C39569au {

    /* renamed from: com.ss.android.ugc.aweme.port.in.au$a */
    public interface C39570a {
        /* renamed from: a */
        boolean mo74303a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.au$b */
    public interface C39571b {
        /* renamed from: a */
        void mo80659a(Exception exc, String str);

        /* renamed from: a */
        void mo80660a(List<C42482c> list, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.au$c */
    public interface C39572c {
        /* renamed from: a */
        void mo77052a();
    }

    /* renamed from: a */
    UrlModel mo74291a(Object obj);

    /* renamed from: a */
    C39570a mo74292a(C39571b bVar);

    /* renamed from: a */
    C39572c mo74293a(String str, String str2);

    /* renamed from: a */
    String mo74294a(String str);

    /* renamed from: a */
    void mo74295a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, Bundle bundle, String str2, String str3);

    /* renamed from: a */
    void mo74296a(String str, C39568at atVar);

    /* renamed from: a */
    boolean mo74297a(int i);

    /* renamed from: a */
    boolean mo74298a(C42482c cVar, Context context, boolean z);
}

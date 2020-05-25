package com.p683ss.android.ugc.aweme.services;

import android.app.Application;
import com.p683ss.android.ugc.aweme.common.p1590b.C26852a;
import com.p683ss.android.ugc.aweme.common.p1590b.C26853b;
import com.p683ss.android.ugc.aweme.common.p1590b.C26854c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import p2628d.p2638e.C52647c;
import p2628d.p2638e.C52666o;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.services.AndroidAssetServiceImpl */
public final class AndroidAssetServiceImpl implements C26853b {
    public final <T> T convertJsonToObject(String str, Class<T> cls) {
        C52711k.m112240b(str, "fileName");
        C52711k.m112240b(cls, "type");
        return convertJsonToObject(str, cls, new C26852a());
    }

    public final <T> T convertJsonToObject(String str, Class<T> cls, C26854c<String, T> cVar) {
        Throwable th;
        C52711k.m112240b(str, "fileName");
        C52711k.m112240b(cls, "type");
        C52711k.m112240b(cVar, "transformer");
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        InputStream open = b.getAssets().open(str);
        C52711k.m112236a((Object) open, "CameraClient.getApplicat…n().assets.open(fileName)");
        Closeable bufferedReader = new BufferedReader(new InputStreamReader(open, C52808d.f131043a), VideoCacheReadBuffersizeExperiment.DEFAULT);
        try {
            String b2 = C52666o.m112218b((BufferedReader) bufferedReader);
            C52647c.m112189a(bufferedReader, null);
            return cVar.mo54805a(b2, cls);
        } catch (Throwable th2) {
            C52647c.m112189a(bufferedReader, th);
            throw th2;
        }
    }
}

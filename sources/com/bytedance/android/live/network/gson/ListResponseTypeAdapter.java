package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import java.lang.reflect.Type;

public class ListResponseTypeAdapter extends AbsJsonDeserializer<C4176c> {
    public ListResponseTypeAdapter(C17971f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        C18085o m = lVar.mo35009m();
        int g = m.mo35022b("status_code").mo34910g();
        if (g == 0) {
            return (C4176c) this.f11348a.mo34882a(lVar, type);
        }
        C4176c cVar = new C4176c();
        cVar.f11364a = g;
        cVar.f11366c = (Extra) this.f11348a.mo34881a(m.mo35022b("extra"), Extra.class);
        cVar.f11367d = (RequestError) this.f11348a.mo34881a(m.mo35022b("data"), RequestError.class);
        return cVar;
    }
}

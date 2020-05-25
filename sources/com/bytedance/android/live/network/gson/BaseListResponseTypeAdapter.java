package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18082l;
import com.google.gson.C18086p;
import java.lang.reflect.Type;

public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<C4172a> {
    public BaseListResponseTypeAdapter(C17971f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        C4172a aVar = (C4172a) this.f11348a.mo34882a(lVar, type);
        if (aVar.f11364a != 0) {
            aVar.f11367d = (RequestError) this.f11348a.mo34881a(lVar.mo35009m().mo35022b("data"), RequestError.class);
        }
        return aVar;
    }
}

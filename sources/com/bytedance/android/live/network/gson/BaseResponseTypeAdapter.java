package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.RequestError;
import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18082l;
import com.google.gson.C18086p;
import java.lang.reflect.Type;

public class BaseResponseTypeAdapter extends AbsJsonDeserializer<C4175b> {
    public BaseResponseTypeAdapter(C17971f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        C4175b bVar = (C4175b) this.f11348a.mo34882a(lVar, type);
        if (bVar.statusCode != 0) {
            bVar.error = (RequestError) this.f11348a.mo34881a(lVar.mo35009m().mo35022b("data"), RequestError.class);
        }
        return bVar;
    }
}

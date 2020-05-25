package com.bytedance.android.livesdk.feed.network;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.feed.services.C7098b.C7101b;
import com.bytedance.android.livesdk.feed.services.C7098b.C7101b.C7102a;
import com.bytedance.android.livesdk.feed.services.FeedItemDeserializer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C17963d;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.google.gson.C18095w;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;

public final class GsonProvider implements C7101b<C17971f> {

    static abstract class AbsJsonDeserializer<T> implements C18081k<T> {

        /* renamed from: a */
        protected C17971f f19178a;

        public AbsJsonDeserializer(C17971f fVar) {
            this.f19178a = fVar;
        }
    }

    static class BaseListResponseDeserializer extends AbsJsonDeserializer<C4172a> {
        public BaseListResponseDeserializer(C17971f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            C18085o m = lVar.mo35009m();
            int g = m.mo35022b("status_code").mo34910g();
            if (g == 0) {
                return (C4172a) this.f19178a.mo34882a(lVar, type);
            }
            C4172a aVar = new C4172a();
            aVar.f11364a = g;
            aVar.f11367d = (RequestError) this.f19178a.mo34881a(m.mo35022b("data"), RequestError.class);
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length <= 1) {
                    aVar.f11366c = (Extra) this.f19178a.mo34881a(m.mo35022b("extra"), Extra.class);
                } else {
                    aVar.f11366c = (Extra) this.f19178a.mo34882a(m.mo35022b("extra"), actualTypeArguments[1]);
                }
            } else {
                aVar.f11366c = (Extra) this.f19178a.mo34881a(m.mo35022b("extra"), Extra.class);
            }
            return aVar;
        }
    }

    static class BaseResponseDeserializer extends AbsJsonDeserializer<C4175b> {
        BaseResponseDeserializer(C17971f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            C4175b bVar = (C4175b) this.f19178a.mo34882a(lVar, type);
            if (bVar.statusCode != 0) {
                bVar.error = (RequestError) this.f19178a.mo34881a(lVar.mo35009m().mo35022b("data"), RequestError.class);
            }
            return bVar;
        }
    }

    static class ListResponseDeserializer extends AbsJsonDeserializer<C4176c> {
        public ListResponseDeserializer(C17971f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            C18085o m = lVar.mo35009m();
            int g = m.mo35022b("status_code").mo34910g();
            if (g == 0) {
                return (C4176c) this.f19178a.mo34882a(lVar, type);
            }
            C4176c cVar = new C4176c();
            cVar.f11364a = g;
            cVar.f11366c = (Extra) this.f19178a.mo34881a(m.mo35022b("extra"), Extra.class);
            cVar.f11367d = (RequestError) this.f19178a.mo34881a(m.mo35022b("data"), RequestError.class);
            return cVar;
        }
    }

    static class ResponseDeserializer extends AbsJsonDeserializer<C4177d> {
        ResponseDeserializer(C17971f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            C4177d dVar = (C4177d) this.f19178a.mo34882a(lVar, type);
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) this.f19178a.mo34881a(lVar.mo35009m().mo35022b("data"), RequestError.class);
            }
            return dVar;
        }
    }

    static class RoomDeserializer implements C18081k<Room> {

        /* renamed from: a */
        private C17971f f19179a;

        private RoomDeserializer() {
            this.f19179a = C2942b.m8369a();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
            Room room = (Room) this.f19179a.mo34882a(lVar, type);
            room.init();
            return room;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.network.GsonProvider$a */
    static class C7029a extends C18095w<Boolean> {
        private C7029a() {
        }

        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            boolean z;
            C17960b f = aVar.mo34843f();
            switch (f) {
                case BOOLEAN:
                    return Boolean.valueOf(aVar.mo34846j());
                case NULL:
                    aVar.mo34847k();
                    return null;
                case NUMBER:
                    if (aVar.mo34850n() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                default:
                    StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                    sb.append(f);
                    throw new C18086p(sb.toString());
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                cVar.mo34870f();
            } else {
                cVar.mo34859a(bool);
            }
        }
    }

    /* renamed from: a */
    public final C7102a<C17971f> mo13186a(C7102a<C17971f> aVar) {
        C17978g a = new C17978g().mo34893a(C17963d.LOWER_CASE_WITH_UNDERSCORES);
        HashMap hashMap = new HashMap();
        hashMap.put(Room.class, new RoomDeserializer());
        hashMap.put(FeedItem.class, new FeedItemDeserializer());
        hashMap.put(Boolean.class, new C7029a());
        hashMap.put(Boolean.TYPE, new C7029a());
        for (Type type : hashMap.keySet()) {
            a.mo34896a(type, hashMap.get(type));
        }
        C17978g a2 = new C17978g().mo34893a(C17963d.LOWER_CASE_WITH_UNDERSCORES);
        for (Type type2 : hashMap.keySet()) {
            a2.mo34896a(type2, hashMap.get(type2));
        }
        C17971f d = a2.mo34900d();
        a.mo34896a((Type) C4175b.class, (Object) new BaseResponseDeserializer(d));
        a.mo34896a((Type) C4177d.class, (Object) new ResponseDeserializer(d));
        a.mo34896a((Type) C4172a.class, (Object) new BaseListResponseDeserializer(d));
        a.mo34896a((Type) C4176c.class, (Object) new ListResponseDeserializer(d));
        return aVar.mo13232a(a.mo34900d()).mo13231a();
    }
}

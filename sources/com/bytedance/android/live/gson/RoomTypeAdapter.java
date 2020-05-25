package com.bytedance.android.live.gson;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18086p;
import java.lang.reflect.Type;

public class RoomTypeAdapter implements C18081k<Room> {
    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        Room room = (Room) C2942b.m8370b().mo34882a(lVar, type);
        room.init();
        return room;
    }
}

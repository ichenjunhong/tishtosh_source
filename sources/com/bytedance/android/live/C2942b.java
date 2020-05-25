package com.bytedance.android.live;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.gson.C4130a;
import com.bytedance.android.live.gson.FeedItemTypeAdapter;
import com.bytedance.android.live.gson.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C17963d;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.b */
public final class C2942b {

    /* renamed from: com.bytedance.android.live.b$a */
    public static class C2943a {

        /* renamed from: a */
        public static final C17978g f8646a;

        /* renamed from: b */
        public static final C17971f f8647b;

        /* renamed from: c */
        public static final C17971f f8648c = new C17971f();

        static {
            C17978g a = new C17978g().mo34893a(C17963d.LOWER_CASE_WITH_UNDERSCORES).mo34896a((Type) Room.class, (Object) new RoomTypeAdapter()).mo34896a((Type) FeedItem.class, (Object) new FeedItemTypeAdapter()).mo34896a((Type) Boolean.class, (Object) new C4130a()).mo34896a((Type) Boolean.TYPE, (Object) new C4130a());
            f8646a = a;
            f8647b = a.mo34900d();
        }
    }

    /* renamed from: a */
    public static C17971f m8369a() {
        return C2943a.f8647b;
    }

    /* renamed from: b */
    public static C17971f m8370b() {
        return C2943a.f8648c;
    }
}

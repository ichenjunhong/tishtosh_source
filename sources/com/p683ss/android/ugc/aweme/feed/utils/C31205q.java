package com.p683ss.android.ugc.aweme.feed.utils;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.q */
public final class C31205q {

    /* renamed from: a */
    public static final List<C31207a> f81644a = new ArrayList();

    /* renamed from: b */
    public static boolean f81645b;

    /* renamed from: c */
    public static C12690b<C4175b<Room, Extra>> f81646c;

    /* renamed from: d */
    public static final Map<String, Room> f81647d = new HashMap();

    /* renamed from: e */
    public static final Map<String, Boolean> f81648e = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.feed.utils.q$a */
    public interface C31207a {
        /* renamed from: a */
        void mo60265a();

        /* renamed from: a */
        void mo60266a(Room room);

        /* renamed from: b */
        void mo60267b();
    }

    /* renamed from: a */
    private static boolean m72872a() {
        IESSettingsProxy b = C32816h.m75716b();
        if (b == null) {
            return true;
        }
        try {
            LiveCnySetting liveCnySettings = b.getLiveCnySettings();
            if (!(liveCnySettings == null || liveCnySettings.getForceUpdateRoom() == null)) {
                return liveCnySettings.getForceUpdateRoom().booleanValue();
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: a */
    private static Room m72866a(String str) {
        try {
            return (Room) C2942b.m8369a().mo34884a(str, Room.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m72867a(Aweme aweme) {
        if (!C26235d.m63571b(aweme) || aweme == null) {
            return "";
        }
        Room room = (Room) f81647d.get(aweme.getAid());
        if (room != null) {
            return String.valueOf(room.getOwnerUserId());
        }
        LiveAwesomeData g = C26235d.m63576g(aweme);
        if (g == null) {
            return "";
        }
        if (g.useRoomInfo) {
            return "";
        }
        return String.valueOf(g.uid);
    }

    /* renamed from: a */
    public static void m72868a(Aweme aweme, C31207a aVar) {
        m72869a(aweme, aVar, true);
    }

    /* renamed from: a */
    public static void m72870a(Aweme aweme, boolean z) {
        for (C31207a aVar : f81644a) {
            if (aVar != null) {
                aVar.mo60265a();
            }
        }
        f81644a.clear();
        if (!z) {
            return;
        }
        if (C26235d.m63572c(aweme) || (C26235d.m63570a(aweme) && C26235d.m63573d(aweme))) {
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.gc9).mo19066a();
        }
    }

    /* renamed from: a */
    public static void m72869a(Aweme aweme, C31207a aVar, boolean z) {
        if (C26235d.m63571b(aweme)) {
            Room room = (Room) f81647d.get(aweme.getAid());
            if (room != null) {
                aVar.mo60266a(room);
                m72871a(aweme, true, z);
                return;
            }
            LiveAwesomeData g = C26235d.m63576g(aweme);
            if (g != null) {
                if (g.useRoomInfo) {
                    Room a = m72866a(g.roomData);
                    if (a != null) {
                        f81647d.put(aweme.getAid(), a);
                        aVar.mo60266a(a);
                        m72871a(aweme, true, z);
                        return;
                    }
                }
                f81644a.add(aVar);
                m72871a(aweme, false, z);
            }
        }
    }

    /* renamed from: a */
    private static void m72871a(final Aweme aweme, boolean z, final boolean z2) {
        Boolean bool = (Boolean) f81648e.get(aweme.getAid());
        if (!z || (m72872a() && (bool == null || !bool.booleanValue()))) {
            LiveAwesomeData g = C26235d.m63576g(aweme);
            if (g != null && !f81645b) {
                f81645b = true;
                C12690b<C4175b<Room, Extra>> a = FeedLiveRoomApi.m70740a(g.uid, g.secUid);
                f81646c = a;
                a.enqueue(new C12743e<C4175b<Room, Extra>>() {
                    /* renamed from: a */
                    public final void mo19943a(C12690b<C4175b<Room, Extra>> bVar, Throwable th) {
                        String str;
                        String str2;
                        C31205q.f81645b = false;
                        C31205q.m72870a(aweme, z2);
                        Aweme aweme = aweme;
                        String str3 = "ttlive_cny_getroom_all";
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "request fail";
                        }
                        C31208r.m72883a(aweme, str3, false, str);
                        Aweme aweme2 = aweme;
                        String str4 = "ttlive_cny_getroom_error";
                        if (th != null) {
                            str2 = th.getMessage();
                        } else {
                            str2 = "request fail";
                        }
                        C31208r.m72883a(aweme2, str4, false, str2);
                    }

                    /* renamed from: a */
                    public final void mo19942a(C12690b<C4175b<Room, Extra>> bVar, C12799u<C4175b<Room, Extra>> uVar) {
                        String str;
                        C31205q.f81645b = false;
                        if (uVar == null || !uVar.mo23960c() || uVar.f33552b == null || ((C4175b) uVar.f33552b).data == null) {
                            C31205q.m72870a(aweme, z2);
                            if (uVar == null) {
                                str = "response is null";
                            } else if (uVar.mo23960c()) {
                                str = "Room data is null";
                            } else {
                                StringBuilder sb = new StringBuilder("response code:");
                                sb.append(uVar.mo23958a());
                                str = sb.toString();
                            }
                            C31208r.m72883a(aweme, "ttlive_cny_getroom_all", false, str);
                            C31208r.m72883a(aweme, "ttlive_cny_getroom_error", false, str);
                            return;
                        }
                        Room room = (Room) ((C4175b) uVar.f33552b).data;
                        room.init();
                        C31205q.f81647d.put(aweme.getAid(), room);
                        C31205q.f81648e.put(aweme.getAid(), Boolean.valueOf(true));
                        for (C31207a aVar : C31205q.f81644a) {
                            if (aVar != null) {
                                aVar.mo60266a(room);
                            }
                        }
                        C31205q.f81644a.clear();
                        C31208r.m72882a(aweme, "ttlive_cny_getroom_all", true);
                        C31208r.m72884a("ttlive_cny_room_info", (Object) room);
                    }
                });
            }
        }
    }
}

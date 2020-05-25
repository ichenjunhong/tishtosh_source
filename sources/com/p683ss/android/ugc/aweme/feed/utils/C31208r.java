package com.p683ss.android.ugc.aweme.feed.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.CNYLiveRightViewsExperiment;
import com.p683ss.android.ugc.aweme.feed.C30686s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31205q.C31207a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.r */
public final class C31208r {

    /* renamed from: a */
    public static boolean f81651a;

    /* renamed from: a */
    private static boolean m72885a() {
        try {
            if (!C10181b.m20511a().mo18172a(CNYLiveRightViewsExperiment.class, true, "live_hide_right_views", 31744, false)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m72886a(Aweme aweme) {
        if (!C26235d.m63571b(aweme) || aweme == null || TextUtils.equals(C31205q.m72867a(aweme), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m72880a(Aweme aweme, String str) {
        m72881a(aweme, str, "none");
    }

    /* renamed from: a */
    public static void m72878a(final Context context, final Aweme aweme) {
        if (C26235d.m63571b(aweme) && context != null && aweme != null && !f81651a) {
            f81651a = true;
            C31205q.m72868a(aweme, (C31207a) new C31207a() {
                /* renamed from: b */
                public final void mo60267b() {
                    C31208r.f81651a = false;
                }

                /* renamed from: a */
                public final void mo60265a() {
                    C31208r.f81651a = false;
                    C31208r.m72883a(aweme, "ttlive_cny_inroom_all", false, "enter room fail");
                    C31208r.m72883a(aweme, "ttlive_cny_inroom_error", false, "enter room fail");
                }

                /* renamed from: a */
                public final void mo60266a(Room room) {
                    C31208r.f81651a = false;
                    if (!C47915gg.m103651b()) {
                        User user = new User();
                        user.setUid(String.valueOf(room.getOwnerUserId()));
                        user.roomId = room.getId();
                        Bundle a = C8750a.m17218a(room);
                        a.putString("enter_method", "");
                        C30686s.m71965a(context, user, null, "topview", a);
                        C31208r.m72882a(aweme, "ttlive_cny_inroom_all", true);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m72884a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            C2201v.m6601a((C2205y<T>) new C31210s<T>(str, obj)).mo6529b(C2168a.m6521b()).mo6551j();
        }
    }

    /* renamed from: a */
    public static void m72882a(Aweme aweme, String str, boolean z) {
        m72883a(aweme, str, true, "");
    }

    /* renamed from: a */
    public static void m72881a(Aweme aweme, String str, String str2) {
        if (C26235d.m63571b(aweme) && aweme != null && aweme.getAuthor() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", C31205q.m72867a(aweme));
            hashMap.put("topview_video_id", aweme.getAid());
            if (!"none".equals(str2)) {
                hashMap.put("timing", str2);
            }
            C26890h.m65011a(str, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m72879a(Aweme aweme, View view, boolean z, boolean z2) {
        if (view != null) {
            int i = 0;
            if (C26235d.m63571b(aweme)) {
                boolean z3 = true;
                if (true != m72885a()) {
                    z3 = false;
                }
                if (!z3) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m72883a(Aweme aweme, String str, boolean z, String str2) {
        if (aweme != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_uid", C31205q.m72867a(aweme));
                jSONObject.put("video_id", aweme.getAid());
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("error_msg", str2);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tag", "ttlive_sdk");
                jSONObject2.put("ttlive_sdk_version", "1490");
                jSONObject2.put("extra", jSONObject);
                C23131p.m57776a(str, z ^ true ? 1 : 0, jSONObject2);
            } catch (Throwable unused) {
            }
        }
    }
}

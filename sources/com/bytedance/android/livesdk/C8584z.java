package com.bytedance.android.livesdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.livesdk.chatroom.p310f.C5225j;
import com.bytedance.android.livesdk.chatroom.p310f.C5226k;
import com.bytedance.android.livesdk.chatroom.p310f.C5227l;
import com.bytedance.android.livesdk.chatroom.p310f.C5228m;
import com.bytedance.android.livesdk.chatroom.p310f.C5229n;
import com.bytedance.android.livesdk.chatroom.p310f.C5230o;
import com.bytedance.android.livesdk.chatroom.p310f.C5231p;
import com.bytedance.android.livesdk.chatroom.p310f.C5232q;
import com.bytedance.android.livesdk.chatroom.p310f.C5233r;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.common.utility.C9431p;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.z */
public final class C8584z implements C4497a {
    /* renamed from: a */
    public final String mo10303a() {
        return "new_style";
    }

    /* renamed from: a */
    public final boolean mo10304a(Map<String, String> map) {
        int i;
        Map<String, String> map2 = map;
        String str = null;
        if (TextUtils.equals((String) map2.get("live.intent.extra.FROM_NEW_STYLE_SOURCE"), "homepage_hot")) {
            if (C5225j.f13949a) {
                return true;
            }
            C5225j.f13949a = true;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!(C8830k.m17331e() == null || C8830k.m17331e().mo13055q() == null)) {
                Map b = C8830k.m17331e().mo13055q().mo13239b(-1);
                if (b == null) {
                    C5225j.f13949a = false;
                    return true;
                } else if (b.get("feed_url") instanceof String) {
                    str = (String) b.get("feed_url");
                }
            }
            if (C9431p.m18664a(str)) {
                C5225j.f13949a = false;
                return true;
            }
            ((FeedApi) C4514j.m10883j().mo10321b().mo9550a(FeedApi.class)).feed(str, 0, "enter_auto_feed_draw_refresh", 0, -1, -1).mo6541d(C5230o.f13957a).mo6540d(C5231p.f13958a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5232q<Object>(str, elapsedRealtime, map2), C5233r.f13962a);
            C5225j.f13950b++;
            return true;
        } else if (C5225j.f13949a) {
            return true;
        } else {
            C5225j.f13949a = true;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!(C8830k.m17331e() == null || C8830k.m17331e().mo13055q() == null)) {
                Map a = C8830k.m17331e().mo13055q().mo13238a(-1);
                if (a == null) {
                    C5225j.f13949a = false;
                    return false;
                }
                if (a.get("feed_url") instanceof String) {
                    str = (String) a.get("feed_url");
                }
                if (a.get("feed_style") instanceof Integer) {
                    Integer num = (Integer) a.get("feed_style");
                    if (num != null) {
                        i = num.intValue();
                        if (!C9431p.m18664a(str) || i != 3) {
                            C5225j.f13949a = false;
                            return false;
                        }
                        ((FeedApi) C4514j.m10883j().mo10321b().mo9550a(FeedApi.class)).feed(str, 0, "enter_auto_feed_draw_refresh", 0, -1, -1).mo6541d(C5226k.f13951a).mo6540d(C5227l.f13952a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5228m<Object>(str, elapsedRealtime2, map2), C5229n.f13956a);
                        C5225j.f13950b++;
                        return true;
                    }
                }
            }
            i = 0;
            if (!C9431p.m18664a(str)) {
            }
            C5225j.f13949a = false;
            return false;
        }
    }
}

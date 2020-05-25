package com.p683ss.android.ugc.aweme.music.p1978ui.p1981c;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.aweme.ttsetting.C11043b;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a.C37376a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c.b */
public final class C37597b {

    /* renamed from: a */
    static ThirdMusicCoverItem f95891a;

    /* renamed from: b */
    static ThirdMusicCoverItem f95892b;

    /* renamed from: c */
    public static final C37597b f95893c = new C37597b();

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c.b$a */
    public static final class C37598a implements C11043b {
        /* renamed from: a */
        public final void mo19949a(Throwable th) {
            C52711k.m112240b(th, "throwable");
        }

        /* renamed from: a */
        public final void mo19950a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3 = null;
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("aweme_third_party_music_cover");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject != null) {
                jSONObject3 = jSONObject.optJSONObject("aweme_third_party_music_icon");
            }
            if (jSONObject2 != null) {
                try {
                    C37597b bVar = C37597b.f95893c;
                    C37597b.f95891a = (ThirdMusicCoverItem) new C17971f().mo34884a(jSONObject2.toString(), ThirdMusicCoverItem.class);
                    C37376a.m83687a("third_music_cover_info", jSONObject2.toString(), "music_sp");
                } catch (Throwable unused) {
                    String jSONObject4 = jSONObject2.toString();
                    C52711k.m112236a((Object) jSONObject4, "jsonObjectCover.toString()");
                    C37597b.m84036a(jSONObject4);
                }
            }
            if (jSONObject3 != null) {
                try {
                    C37597b bVar2 = C37597b.f95893c;
                    C37597b.f95892b = (ThirdMusicCoverItem) new C17971f().mo34884a(jSONObject3.toString(), ThirdMusicCoverItem.class);
                    C37376a.m83687a("third_music_icon_info", jSONObject3.toString(), "music_sp");
                } catch (Throwable unused2) {
                    String jSONObject5 = jSONObject3.toString();
                    C52711k.m112236a((Object) jSONObject5, "jsonObjectIcon.toString()");
                    C37597b.m84036a(jSONObject5);
                }
            }
        }
    }

    private C37597b() {
    }

    /* renamed from: b */
    public final ThirdMusicCoverItem mo77115b() {
        if (f95892b == null) {
            String a = C37376a.m83685a("third_music_icon_info", "", "music_sp");
            if (!TextUtils.isEmpty(a)) {
                try {
                    f95892b = (ThirdMusicCoverItem) new C17971f().mo34884a(a, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    m84036a(a);
                }
            }
        }
        return f95892b;
    }

    /* renamed from: a */
    public final ThirdMusicCoverItem mo77113a() {
        if (f95891a == null) {
            String a = C37376a.m83685a("third_music_cover_info", "", "music_sp");
            if (!TextUtils.isEmpty(a)) {
                try {
                    f95891a = (ThirdMusicCoverItem) new C17971f().mo34884a(a, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    m84036a(a);
                }
            }
        }
        return f95891a;
    }

    /* renamed from: a */
    public static void m84036a(String str) {
        C9951d.m19997a("third_music_json_parse_error", C23088c.m56631a().mo47824a("message", str).mo47825b());
    }

    /* renamed from: a */
    private static boolean m84037a(List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        if (C9376b.m18558a((Collection<T>) list)) {
            return false;
        }
        String str = null;
        if (list != null) {
            externalMusicInfo = (ExternalMusicInfo) list.get(0);
        } else {
            externalMusicInfo = null;
        }
        if (externalMusicInfo != null) {
            str = externalMusicInfo.getPartnerName();
        }
        return TextUtils.equals(str, "awa");
    }

    /* renamed from: a */
    public final void mo77114a(TextView textView, Music music, boolean z) {
        List list;
        int i;
        int i2;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (!m84037a(list)) {
            i = 0;
        } else if (z) {
            i = R.drawable.bd3;
        } else {
            i = R.drawable.bd4;
        }
        if (textView != null) {
            if (i > 0) {
                i2 = C23728o.m58241a(5.0d);
            } else {
                i2 = 0;
            }
            textView.setCompoundDrawablePadding(i2);
        }
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }
}

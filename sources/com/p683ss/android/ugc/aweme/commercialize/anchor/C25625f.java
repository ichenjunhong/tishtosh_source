package com.p683ss.android.ugc.aweme.commercialize.anchor;

import android.content.Context;
import com.C2240a;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a;
import java.util.Arrays;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.f */
public final class C25625f {
    /* renamed from: a */
    public static final void m62154a(Context context, WikipediaInfo wikipediaInfo, Map<String, String> map) {
        boolean z;
        boolean z2;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(wikipediaInfo, "info");
        C52711k.m112240b(map, "params");
        CharSequence lang = wikipediaInfo.getLang();
        if (lang == null || lang.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence keyword = wikipediaInfo.getKeyword();
            if (keyword == null || keyword.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                String wikipediaAnchorUrlPlaceholder = b.getWikipediaAnchorUrlPlaceholder();
                C52711k.m112236a((Object) wikipediaAnchorUrlPlaceholder, "SettingsReader.get().wikipediaAnchorUrlPlaceholder");
                String a = C2240a.m6772a(wikipediaAnchorUrlPlaceholder, Arrays.copyOf(new Object[]{wikipediaInfo.getLang(), wikipediaInfo.getKeyword()}, 2));
                C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                String str = "title";
                String keyword2 = wikipediaInfo.getKeyword();
                if (keyword2 == null) {
                    C52711k.m112234a();
                }
                map.put(str, keyword2);
                String str2 = "wiki_entry";
                String keyword3 = wikipediaInfo.getKeyword();
                if (keyword3 == null) {
                    C52711k.m112234a();
                }
                map.put(str2, keyword3);
                String str3 = "language";
                String lang2 = wikipediaInfo.getLang();
                if (lang2 == null) {
                    C52711k.m112234a();
                }
                map.put(str3, lang2);
                C48397a.m104727a(context, a, map);
            }
        }
    }
}

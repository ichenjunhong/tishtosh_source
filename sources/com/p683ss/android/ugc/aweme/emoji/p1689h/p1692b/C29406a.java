package com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.C29382a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.C29404b;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29383a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.C29397a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.b.a */
public final class C29406a implements C29382a {

    /* renamed from: a */
    public static C29406a f77018a;

    /* renamed from: b */
    public static final C29407a f77019b = new C29407a(null);

    /* renamed from: c */
    private C29382a f77020c;

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.b.a$a */
    public static final class C29407a {
        private C29407a() {
        }

        public /* synthetic */ C29407a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29406a m69339a(Context context) {
            C52711k.m112240b(context, "context");
            if (C29406a.f77018a == null) {
                synchronized (C29406a.class) {
                    if (C29406a.f77018a == null) {
                        C29406a.f77018a = new C29406a(context, null);
                    }
                }
            }
            C29406a aVar = C29406a.f77018a;
            if (aVar == null) {
                C52711k.m112234a();
            }
            return aVar;
        }
    }

    /* renamed from: b */
    public static final C29406a m69329b(Context context) {
        return C29407a.m69339a(context);
    }

    /* renamed from: a */
    public final int mo59398a() {
        return this.f77020c.mo59398a();
    }

    /* renamed from: b */
    public final String mo59405b() {
        return this.f77020c.mo59405b();
    }

    /* renamed from: a */
    public final Drawable mo59399a(Context context) {
        return this.f77020c.mo59399a(context);
    }

    private C29406a(Context context) {
        boolean z;
        C29382a aVar;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean disableOnlineSmallEmoji = b.getDisableOnlineSmallEmoji();
            C52711k.m112236a((Object) disableOnlineSmallEmoji, "SettingsReader.get().disableOnlineSmallEmoji");
            z = disableOnlineSmallEmoji.booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (z || !C29397a.m69317a().mo59467c()) {
            aVar = new C29404b(context);
        } else {
            aVar = new C29383a();
        }
        this.f77020c = aVar;
        StringBuilder sb = new StringBuilder("EmojiResHelper disableOnline=");
        sb.append(z);
        sb.append(", mAdapter=");
        sb.append(this.f77020c);
        C32458a.m75144a(sb.toString());
    }

    /* renamed from: a */
    public final LinkedHashMap<String, Integer> mo59470a(CharSequence charSequence) {
        Integer num;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        if (TextUtils.isEmpty(charSequence)) {
            return linkedHashMap;
        }
        Matcher matcher = C29408b.f77021a.matcher(charSequence);
        while (matcher.find()) {
            String group = matcher.group();
            if (mo59404a(group)) {
                Integer num2 = (Integer) linkedHashMap.get(group);
                if (num2 == null || num2.intValue() <= 0) {
                    num = Integer.valueOf(1);
                } else {
                    num = Integer.valueOf(num2.intValue() + 1);
                }
                Map map = linkedHashMap;
                C52711k.m112236a((Object) group, "emojiText");
                map.put(group, num);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final boolean mo59404a(String str) {
        return this.f77020c.mo59404a(str);
    }

    public /* synthetic */ C29406a(Context context, C52707g gVar) {
        this(context);
    }

    /* renamed from: a */
    public final Drawable mo59400a(Context context, String str) {
        return this.f77020c.mo59400a(context, str);
    }

    /* renamed from: a */
    public final List<C29285a> mo59401a(int i, int i2) {
        return this.f77020c.mo59401a(i, i2);
    }

    /* renamed from: a */
    public final List<C29285a> mo59402a(List<String> list, int i) {
        return this.f77020c.mo59402a(list, i);
    }

    /* renamed from: a */
    public final void mo59403a(RemoteImageView remoteImageView, C29285a aVar) {
        this.f77020c.mo59403a(remoteImageView, aVar);
    }
}

package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.share.improve.C42044a.C42045a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.as */
public enum C41985as {
    INSTAGRAM("instagram", "Instagram", R.drawable.qq, 2),
    INSTAGRAM_STORY("instagram_story", "Instagram", R.drawable.qu, 3),
    WHATSAPP("whatsapp", "Whatsapp", R.drawable.qv, 5),
    FACEBOOK("facebook", "Facebook", R.drawable.qp, 6),
    SMS("sms", "Sms", R.drawable.co9, 13),
    MESSENGER("messenger", "Messenger", R.drawable.qt, 7),
    VK("vk", "VK", R.drawable.coa, 9),
    SNAPCHAT("snapchat", "Snapchat", R.drawable.co_, 8),
    LINE("line", "Line", R.drawable.qs, 11),
    ZALO("zalo", "Zalo", R.drawable.qw, 10),
    KAKAOTALK("kakaotalk", "KakaoTalk", R.drawable.qr, 12);
    
    public static final C41986a Companion = null;

    /* renamed from: b */
    private final String f106276b;

    /* renamed from: c */
    private final String f106277c;

    /* renamed from: d */
    private final int f106278d;

    /* renamed from: e */
    private final int f106279e;

    /* renamed from: com.ss.android.ugc.aweme.share.as$a */
    public static final class C41986a {
        private C41986a() {
        }

        public /* synthetic */ C41986a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static List<C41985as> m91950a(Activity activity) {
            List list;
            Object obj;
            C52711k.m112240b(activity, "activity");
            if (!AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableSaveUploadVideo()) {
                return C52575l.m112097a();
            }
            List c = C52575l.m112101c(C41985as.WHATSAPP, C41985as.INSTAGRAM, C41985as.INSTAGRAM_STORY, C41985as.FACEBOOK, C41985as.SMS, C41985as.MESSENGER, C41985as.VK, C41985as.SNAPCHAT, C41985as.LINE, C41985as.ZALO, C41985as.KAKAOTALK);
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                List<ShareChannelSettings> silentShareList = b.getSilentShareList();
                list = new ArrayList();
                for (ShareChannelSettings shareChannelSettings : silentShareList) {
                    Iterator it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        String key = ((C41985as) obj).getKey();
                        C52711k.m112236a((Object) shareChannelSettings, "channel");
                        if (C52711k.m112239a((Object) key, (Object) shareChannelSettings.getId())) {
                            break;
                        }
                    }
                    C41985as asVar = (C41985as) obj;
                    if (asVar != null) {
                        list.add(asVar);
                    }
                }
            } catch (C10174a unused) {
                list = C52575l.m112129b((Iterable<? extends T>) c, 4);
            }
            List<C41985as> e = C52575l.m112139e((Collection<? extends T>) list);
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                C42307b a = C42045a.m92010a(((C41985as) it2.next()).getKey(), activity);
                if (a == null || !a.mo86141a(activity)) {
                    it2.remove();
                }
            }
            return e;
        }
    }

    public static final List<C41985as> supportChannels(Activity activity) {
        return C41986a.m91950a(activity);
    }

    public final int getIconRes() {
        return this.f106278d;
    }

    public final String getKey() {
        return this.f106276b;
    }

    public final String getLabel() {
        return this.f106277c;
    }

    public final int getSaveType() {
        return this.f106279e;
    }

    static {
        Companion = new C41986a(null);
    }

    private C41985as(String str, String str2, int i, int i2) {
        this.f106276b = str;
        this.f106277c = str2;
        this.f106278d = i;
        this.f106279e = i2;
    }
}

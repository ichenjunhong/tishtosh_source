package com.p683ss.android.ugc.aweme.profile.util;

import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40453o;
import java.text.SimpleDateFormat;

/* renamed from: com.ss.android.ugc.aweme.profile.util.aa */
public final class C40519aa {

    /* renamed from: a */
    private static final SimpleDateFormat f103415a = new SimpleDateFormat("yyyy-MM-dd", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCountryLocale());

    /* renamed from: com.ss.android.ugc.aweme.profile.util.aa$a */
    public interface C40520a extends C40453o {
    }

    /* renamed from: a */
    public static String m89927a(User user) {
        String str = "";
        if (user.getGeneralPermission() == null) {
            return str;
        }
        switch (user.getGeneralPermission().getFollowToastType()) {
            case 1:
                return "ban";
            case 2:
                return "suspend";
            case 3:
                return "viewmodeA";
            case 4:
                return "viewmodeB";
            default:
                return "";
        }
    }
}

package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22719d;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler */
public class TimeLockRuler {
    private static final String TAG = "TimeLockRuler";
    public static boolean sLastContentFilterState;
    private static TimeLockUserSetting setting;

    public static void clearCache() {
        setting = null;
    }

    public static boolean isTeenModeON() {
        return false;
    }

    public static boolean isTeenagerAbEnable() {
        return true;
    }

    public static boolean isInTeenagerModeNewVersion() {
        return isContentFilterOn();
    }

    public static void removeUserSetting() {
        C47718bf.m103288a(removeUserSettingWithoutNotify());
    }

    public static String getContentFilterFlagText() {
        return Integer.toString(getContentFilterFlag());
    }

    public static long getLastPasswordSetTime() {
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            return userSetting.getLastSetTime();
        }
        return 0;
    }

    public static String getPassword() {
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            return userSetting.getPassword();
        }
        return "";
    }

    public static int getTeenageModeStatus() {
        if (isInTeenagerModeNewVersion()) {
            return 1;
        }
        return 0;
    }

    public static int getContentFilterFlag() {
        if (!isContentFilterOn()) {
            return 0;
        }
        if (isTeenagerAbEnable()) {
            return 2;
        }
        return 1;
    }

    public static int getSelfTimeInMin() {
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null) {
            String userId = userSetting.getUserId();
            C47549c.m102974a();
            if (TextUtils.equals(userId, C47549c.m102979e())) {
                return userSetting.getLockTimeInMin();
            }
        }
        return 0;
    }

    private static C23051bf<String> getSharePrefCache() {
        C23183v a = C23183v.m56778a();
        if (a.f61624f == null) {
            a.f61624f = new C23051bf<>("users_time_lock_setting", "");
        }
        return a.f61624f;
    }

    public static boolean isSelfTimeLockOn() {
        if (C22721g.m55965e()) {
            return C22721g.f60930d.mo47167c();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting == null || !userSetting.isTimeLockOn()) {
            return false;
        }
        return true;
    }

    public static synchronized TimeLockUserSetting getUserSetting() {
        TimeLockUserSetting timeLockUserSetting;
        synchronized (TimeLockRuler.class) {
            if (setting == null) {
                Iterator it = getUserSettingList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        TimeLockUserSetting timeLockUserSetting2 = (TimeLockUserSetting) it.next();
                        try {
                            if (C20902b.m53242a().getCurUserId().equals(timeLockUserSetting2.getUserId())) {
                                setting = timeLockUserSetting2;
                                break;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            timeLockUserSetting = setting;
        }
        return timeLockUserSetting;
    }

    public static boolean isParentalPlatformContentFilterOn() {
        if ((C22714d.f60914a.mo47119b() == C22687a.CHILD || C22714d.f60914a.mo47119b() == C22687a.UNLINK_LOCKED) && C20902b.m53242a().isLogin() && C22714d.f60914a.mo47120c()) {
            return true;
        }
        return false;
    }

    public static boolean isParentalPlatformOn() {
        if (!C20902b.m53242a().isLogin() || (C22714d.f60914a.mo47119b() != C22687a.CHILD && C22714d.f60914a.mo47119b() != C22687a.PARENT && !C22714d.f60914a.mo47120c())) {
            return false;
        }
        return true;
    }

    public static boolean isSelfContentFilterOn() {
        if (C22721g.m55965e()) {
            return C22721g.f60930d.mo47166b();
        }
        TimeLockUserSetting userSetting = getUserSetting();
        if (userSetting != null && userSetting.isContentFilterOn()) {
            String userId = userSetting.getUserId();
            C47549c.m102974a();
            if (TextUtils.equals(userId, C47549c.m102979e())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTimeLockOn() {
        if (C22714d.f60914a.mo47119b() == C22687a.CHILD && C20902b.m53242a().isLogin()) {
            return C22714d.f60914a.mo47121d();
        }
        if (C22714d.f60914a.mo47119b() != C22687a.UNLINK_LOCKED || !C20902b.m53242a().isLogin() || !C22714d.f60914a.mo47121d()) {
            return isSelfTimeLockOn();
        }
        return true;
    }

    public static TimeLockUserSetting removeUserSettingWithoutNotify() {
        List userSettingList = getUserSettingList();
        TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
        timeLockUserSetting.setUserId(C20902b.m53242a().getCurUserId());
        userSettingList.remove(timeLockUserSetting);
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", getContentFilterFlag());
        AppLog.setCustomerHeader(bundle);
        getSharePrefCache().mo47776a(C47760cd.m103383a().mo34889b(userSettingList));
        clearCache();
        return timeLockUserSetting;
    }

    public static int getLockTimeInMin() {
        if ((C22714d.f60914a.mo47119b() == C22687a.CHILD || C22714d.f60914a.mo47119b() == C22687a.UNLINK_LOCKED) && C20902b.m53242a().isLogin()) {
            C22714d dVar = C22714d.f60914a;
            C41686c a = C22714d.m55950a();
            if (a != null) {
                return a.f105480W;
            }
            return 0;
        } else if (C22721g.m55965e()) {
            return C22721g.f60930d.mo47168d();
        } else {
            TimeLockUserSetting userSetting = getUserSetting();
            if (userSetting == null) {
                return 0;
            }
            return userSetting.getLockTimeInMin();
        }
    }

    public static boolean isContentFilterOn() {
        boolean z;
        if (C22714d.f60914a.mo47119b() == C22687a.CHILD && C20902b.m53242a().isLogin()) {
            z = C22714d.f60914a.mo47120c();
        } else if (C22714d.f60914a.mo47119b() != C22687a.UNLINK_LOCKED || !C20902b.m53242a().isLogin() || !C22714d.f60914a.mo47120c()) {
            z = isSelfContentFilterOn();
        } else {
            z = true;
        }
        sLastContentFilterState = z;
        if (z || ((Boolean) C23183v.m56778a().mo47912h().mo47782d()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean isRuleValid() {
        if ((((Boolean) C23183v.m56778a().mo47912h().mo47782d()).booleanValue() || C22714d.f60914a.mo47119b() == C22687a.CHILD || C22714d.f60914a.mo47119b() == C22687a.UNLINK_LOCKED) && C20902b.m53242a().isLogin()) {
            return true;
        }
        if (C22721g.m55965e()) {
            return C22721g.f60930d.mo47169f();
        }
        if (getUserSetting() != null) {
            return true;
        }
        return false;
    }

    public static void removeUnLoginUserSetting() {
        if (setting != null && TextUtils.equals(setting.getUserId(), "0") && setting.isContentFilterOn()) {
            List userSettingList = getUserSettingList();
            if (!C9376b.m18558a((Collection<T>) userSettingList)) {
                TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
                timeLockUserSetting.setUserId("0");
                userSettingList.remove(timeLockUserSetting);
                getSharePrefCache().mo47776a(C47760cd.m103383a().mo34889b(userSettingList));
            }
        }
    }

    public static List<TimeLockUserSetting> getUserSettingList() {
        String str = (String) getSharePrefCache().mo47782d();
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        C17971f a = C47760cd.m103383a();
        List list = (List) a.mo34885a(str, new C17956a<List<TimeLockUserSetting>>() {
        }.f49843c);
        if (list.size() != 0 && TextUtils.isEmpty(((TimeLockUserSetting) list.get(0)).getUserId())) {
            list.clear();
            try {
                for (C22719d dVar : (List) a.mo34885a(str, new C17956a<List<C22719d>>() {
                }.f49843c)) {
                    TimeLockUserSetting timeLockUserSetting = new TimeLockUserSetting();
                    timeLockUserSetting.setUserId(dVar.f60921a);
                    timeLockUserSetting.setLastSetTime(dVar.f60922b);
                    timeLockUserSetting.setPassword(dVar.f60923c);
                    timeLockUserSetting.setTimeLockOn(dVar.f60924d);
                    timeLockUserSetting.setContentFilterOn(dVar.f60925e);
                    list.add(timeLockUserSetting);
                }
                getSharePrefCache().mo47776a(a.mo34889b(list));
            } catch (Exception unused) {
                getSharePrefCache().mo47776a("");
            }
        }
        return list;
    }

    public static void disableStartActivityIfNeeded(Activity activity) {
        if (isTeenModeON() && activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public static boolean isEnableShowTeenageTip(int i) {
        if (!isTeenModeON()) {
            return false;
        }
        C10691a.m21548c(C11010c.m22280a(), i).mo19066a();
        return true;
    }

    public static void applyUserSetting(TimeLockUserSetting timeLockUserSetting) {
        List userSettingList = getUserSettingList();
        userSettingList.remove(timeLockUserSetting);
        userSettingList.add(timeLockUserSetting);
        getSharePrefCache().mo47776a(C47760cd.m103383a().mo34889b(userSettingList));
        setting = timeLockUserSetting;
        C47718bf.m103288a(timeLockUserSetting);
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", getContentFilterFlag());
        AppLog.setCustomerHeader(bundle);
    }

    public static void doTeenagerModeAction(Context context, String str, final Runnable runnable) {
        int i;
        if (isSelfContentFilterOn()) {
            C22722h.m55983a((C23706b<Boolean>) new C23706b<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo47089a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    runnable.run();
                }
            }, str);
        } else if (isParentalPlatformContentFilterOn()) {
            if (TextUtils.equals(str, "add_account")) {
                i = R.string.b0b;
            } else {
                i = R.string.b0c;
            }
            C10691a.m21548c(context, i).mo19066a();
        } else {
            runnable.run();
        }
    }
}

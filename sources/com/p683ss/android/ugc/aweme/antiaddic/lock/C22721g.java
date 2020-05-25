package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22718c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.MinorSettingData;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a.C22704a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a.C22704a.C22707c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h.C22773a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.ss.android.ugc.trill.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.g */
public final class C22721g {

    /* renamed from: a */
    public static TeenageModeSetting f60927a = m55969k();

    /* renamed from: b */
    public static String f60928b = "";

    /* renamed from: c */
    public static boolean f60929c;

    /* renamed from: d */
    public static final C22721g f60930d = new C22721g();

    /* renamed from: e */
    private static final C22718c f60931e;

    /* renamed from: f */
    private static final C22704a f60932f = new C22704a();

    private C22721g() {
    }

    /* renamed from: a */
    public static TeenageModeSetting m55962a() {
        return f60927a;
    }

    /* renamed from: e */
    public static boolean m55965e() {
        int i;
        TeenageModeSetting teenageModeSetting = f60927a;
        if (teenageModeSetting != null) {
            i = teenageModeSetting.getMinorControlType();
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m55966h() {
        TeenageModeSetting teenageModeSetting = f60927a;
        if (teenageModeSetting != null) {
            return teenageModeSetting.isMinor();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo47167c() {
        if (mo47168d() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo47166b() {
        boolean z;
        if (m55965e()) {
            TeenageModeSetting teenageModeSetting = f60927a;
            if (teenageModeSetting != null) {
                z = teenageModeSetting.isTeenageModeSelf();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int mo47168d() {
        if (m55965e()) {
            TeenageModeSetting teenageModeSetting = f60927a;
            if (teenageModeSetting != null) {
                return teenageModeSetting.getTimeLockSelfInMin();
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final boolean mo47169f() {
        if (mo47166b() || mo47167c()) {
            return true;
        }
        return false;
    }

    static {
        Object a = C23540d.m57713a(AwemeApplication.m56199a(), C22718c.class);
        C52711k.m112236a(a, "SharedPreferencesHelper.…ePreferences::class.java)");
        f60931e = (C22718c) a;
    }

    /* renamed from: i */
    private final boolean m55967i() {
        int i;
        boolean z;
        TeenageModeSetting k = m55969k();
        if (k != null) {
            i = k.getMinorControlType();
        } else {
            i = 0;
        }
        if (i != 1) {
            TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
            if (userSetting != null) {
                z = userSetting.isContentFilterOn();
            } else {
                z = false;
            }
            if (z || m55968j()) {
                return true;
            }
            return false;
        } else if (k != null) {
            return k.isTeenageModeSelf();
        } else {
            return false;
        }
    }

    /* renamed from: j */
    private static boolean m55968j() {
        TimeLockUserSetting timeLockUserSetting;
        Iterator it = TimeLockRuler.getUserSettingList().iterator();
        while (true) {
            if (!it.hasNext()) {
                timeLockUserSetting = null;
                break;
            }
            timeLockUserSetting = (TimeLockUserSetting) it.next();
            try {
                C52711k.m112236a((Object) timeLockUserSetting, "timeLockUserSetting");
                if (C52711k.m112239a((Object) timeLockUserSetting.getUserId(), (Object) "0")) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        if (timeLockUserSetting != null) {
            return timeLockUserSetting.isContentFilterOn();
        }
        return false;
    }

    /* renamed from: k */
    private static TeenageModeSetting m55969k() {
        String a = f60931e.mo47158a();
        C52711k.m112236a((Object) a, "mPreference.teenageModeSetting");
        if (!TextUtils.isEmpty(a)) {
            try {
                return (TeenageModeSetting) new C17971f().mo34884a(a, TeenageModeSetting.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void mo47170g() {
        boolean b = mo47166b();
        boolean i = m55967i();
        if (m55965e() && b != i) {
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            if (!curUser.isUserCancelled()) {
                C22722h.m55978a();
                C40869c.m90378c();
                return;
            }
            f60929c = true;
        }
    }

    /* renamed from: a */
    public static void m55964a(TeenageModeSetting teenageModeSetting) {
        f60931e.mo47159a(new C17971f().mo34889b(teenageModeSetting));
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", TimeLockRuler.getContentFilterFlag());
        AppLog.setCustomerHeader(bundle);
    }

    /* renamed from: a */
    public static String m55963a(String str) {
        C52711k.m112240b(str, "normalCode");
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int parseInt = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(parseInt * parseInt));
            sb.append("dmt");
            String sb2 = sb.toString();
            Charset forName = Charset.forName("UTF-8");
            C52711k.m112236a((Object) forName, "Charset.forName(charsetName)");
            if (sb2 != null) {
                byte[] bytes = sb2.getBytes(forName);
                C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                int length = bytes.length;
                for (int i = 0; i < length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                String a = C9395d.m18573a(bytes, 0, bytes.length);
                C52711k.m112236a((Object) a, "DigestUtils.toHexString(data, 0, data.size)");
                return a;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final void mo47165a(ComplianceSetting complianceSetting) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        C52711k.m112240b(complianceSetting, "settings");
        Boolean isMinor = complianceSetting.isMinor();
        if (isMinor != null) {
            z = isMinor.booleanValue();
        } else {
            z = false;
        }
        Integer minorControlType = complianceSetting.getMinorControlType();
        if (minorControlType != null) {
            i = minorControlType.intValue();
        } else {
            i = 0;
        }
        Boolean isTeenageModeSelf = complianceSetting.isTeenageModeSelf();
        if (isTeenageModeSelf != null) {
            z2 = isTeenageModeSelf.booleanValue();
        } else {
            z2 = false;
        }
        Integer timeLockSelfInMin = complianceSetting.getTimeLockSelfInMin();
        if (timeLockSelfInMin != null) {
            i2 = timeLockSelfInMin.intValue();
        } else {
            i2 = 0;
        }
        f60927a = new TeenageModeSetting(z, i, z2, i2);
        TeenageModeSetting teenageModeSetting = f60927a;
        if (teenageModeSetting != null) {
            i3 = teenageModeSetting.getMinorControlType();
        } else {
            i3 = 0;
        }
        if (i3 == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            TeenageModeApi teenageModeApi = f60932f.f60904a;
            boolean isSelfContentFilterOn = TimeLockRuler.isSelfContentFilterOn();
            int selfTimeInMin = TimeLockRuler.getSelfTimeInMin();
            String password = TimeLockRuler.getPassword();
            C52711k.m112236a((Object) password, "TimeLockRuler.getPassword()");
            teenageModeApi.syncMinorSettings(isSelfContentFilterOn ? 1 : 0, selfTimeInMin, m55963a(password), TimeLockRuler.getLastPasswordSetTime() / 1000).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C22707c<Object>());
        }
        mo47170g();
        m55964a(f60927a);
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin() || !m55966h() || TimeLockRuler.isContentFilterOn() || TimeLockRuler.isTimeLockOn() || TimeLockRuler.isParentalPlatformOn()) {
            IAccountUserService a2 = C20902b.m53242a();
            C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
            if (a2.isLogin() && TimeLockRuler.isContentFilterOn() && !m55966h()) {
                C23183v a3 = C23183v.m56778a();
                C52711k.m112236a((Object) a3, "CommonSharePrefCache.inst()");
                C23051bf h = a3.mo47912h();
                C52711k.m112236a((Object) h, "CommonSharePrefCache.inst().isForceMinor");
                Object d = h.mo47782d();
                C52711k.m112236a(d, "CommonSharePrefCache.inst().isForceMinor.cache");
                if (((Boolean) d).booleanValue()) {
                    C23183v a4 = C23183v.m56778a();
                    C52711k.m112236a((Object) a4, "CommonSharePrefCache.inst()");
                    C23051bf h2 = a4.mo47912h();
                    C52711k.m112236a((Object) h2, "CommonSharePrefCache.inst().isForceMinor");
                    h2.mo47776a(Boolean.valueOf(false));
                    C10691a.m21533a(C11010c.m22280a(), (int) R.string.d8d).mo19066a();
                    C22722h.m55978a();
                }
            }
            return;
        }
        C23183v a5 = C23183v.m56778a();
        C52711k.m112236a((Object) a5, "CommonSharePrefCache.inst()");
        C23051bf h3 = a5.mo47912h();
        C52711k.m112236a((Object) h3, "CommonSharePrefCache.inst().isForceMinor");
        h3.mo47776a(Boolean.valueOf(true));
        C23183v a6 = C23183v.m56778a();
        C52711k.m112236a((Object) a6, "CommonSharePrefCache.inst()");
        if (a6.f61626h == null) {
            a6.f61626h = new C23051bf<>("need_to_show_force_teens_mode_dialog", Boolean.valueOf(false));
        }
        C23051bf<Boolean> bfVar = a6.f61626h;
        C52711k.m112236a((Object) bfVar, "CommonSharePrefCache.ins…oShowForceTeensModeDialog");
        bfVar.mo47776a(Boolean.valueOf(true));
        C22722h.m55978a();
        C10691a.m21533a(C11010c.m22280a(), (int) R.string.d8g).mo19066a();
    }

    /* renamed from: a */
    public final void mo47164a(FragmentActivity fragmentActivity, int i, boolean z) {
        int i2;
        if (z) {
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.dyr).mo19066a();
        } else {
            if (i != 0) {
                C22720f.m55961a();
            } else if (fragmentActivity != null) {
                C10691a.m21533a(C11010c.m22280a(), (int) R.string.dyx).mo19066a();
                C0209x a = C0214z.m440a(fragmentActivity).mo359a(TimeLockOptionViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ionViewModel::class.java)");
                C0198r<C22773a> rVar = ((TimeLockOptionViewModel) a).f61036a;
                C52711k.m112236a((Object) rVar, "ViewModelProviders.of(ac…              .optionData");
                C22773a aVar = (C22773a) rVar.getValue();
                TeenageModeSetting teenageModeSetting = f60927a;
                int i3 = 0;
                if (teenageModeSetting != null) {
                    if (aVar != null) {
                        i2 = aVar.f61019b;
                    } else {
                        i2 = 0;
                    }
                    teenageModeSetting.setTimeLockSelfInMin(i2);
                }
                String str = "open_time_lock_finish";
                C23089d a2 = C23089d.m56640a();
                String str2 = "set_time";
                if (aVar != null) {
                    i3 = aVar.f61019b;
                }
                C26890h.m65011a(str, a2.mo47826a(str2, i3).f61491a);
            }
            m55964a(f60927a);
        }
        if (fragmentActivity != null) {
            C22722h.m55980a(fragmentActivity, i);
        }
    }

    /* renamed from: a */
    public final String mo47163a(int i, boolean z, String str, boolean z2, FragmentActivity fragmentActivity) {
        C52711k.m112240b(str, "password");
        C52711k.m112240b(fragmentActivity, "activity");
        if (z2) {
            String a = m55963a(str);
            MinorSettingData minorSettingData = new MinorSettingData();
            minorSettingData.setEventType(3);
            minorSettingData.setEventValue(a);
            minorSettingData.setPassword(m55963a(f60928b));
            String b = new C17971f().mo34889b(C52575l.m112092a(minorSettingData));
            C52711k.m112236a((Object) b, "Gson().toJson(settingList)");
            return b;
        } else if (i == 0) {
            String a2 = m55963a(str);
            MinorSettingData minorSettingData2 = new MinorSettingData();
            minorSettingData2.setEventType(2);
            int i2 = 0;
            if (z) {
                C0209x a3 = C0214z.m440a(fragmentActivity).mo359a(TimeLockOptionViewModel.class);
                C52711k.m112236a((Object) a3, "ViewModelProviders.of(ac…ionViewModel::class.java)");
                C0198r<C22773a> rVar = ((TimeLockOptionViewModel) a3).f61036a;
                C52711k.m112236a((Object) rVar, "ViewModelProviders.of(ac…              .optionData");
                C22773a aVar = (C22773a) rVar.getValue();
                if (aVar != null) {
                    i2 = aVar.f61019b;
                }
            }
            minorSettingData2.setEventValue(String.valueOf(i2));
            minorSettingData2.setPassword(a2);
            String b2 = new C17971f().mo34889b(C52575l.m112092a(minorSettingData2));
            C52711k.m112236a((Object) b2, "Gson().toJson(settingList)");
            return b2;
        } else {
            String a4 = m55963a(str);
            C52711k.m112240b(a4, "password");
            MinorSettingData minorSettingData3 = new MinorSettingData();
            minorSettingData3.setEventType(1);
            minorSettingData3.setEventValue(String.valueOf(z ? 1 : 0));
            minorSettingData3.setPassword(a4);
            List arrayList = new ArrayList();
            arrayList.add(minorSettingData3);
            String b3 = new C17971f().mo34889b(arrayList);
            C52711k.m112236a((Object) b3, "Gson().toJson(settingList)");
            return b3;
        }
    }
}

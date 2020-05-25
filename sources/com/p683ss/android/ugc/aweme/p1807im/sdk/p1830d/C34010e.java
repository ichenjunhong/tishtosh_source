package com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d;

import android.support.p030v4.p038f.C0786h;
import android.text.TextUtils;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34554k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53755c;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.e */
public class C34010e {

    /* renamed from: b */
    private static C34010e f87938b;

    /* renamed from: a */
    public Set<String> f87939a = new HashSet();

    /* renamed from: c */
    private C0786h<String, IMUser> f87940c = new C0786h<>(1000);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.e$a */
    public interface C34015a {
        /* renamed from: a */
        void mo71969a(IMUser iMUser);
    }

    /* renamed from: a */
    public final void mo71961a(final String str, String str2, final C34015a aVar) {
        if (!this.f87939a.contains(str) && !IMUser.isInvalidUser(str)) {
            this.f87939a.add(str);
            C35286u.f90624a.fetchUser(str, str2).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<UserStruct, Boolean>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    if (iVar.mo33d()) {
                        if ((iVar.mo35f() instanceof C23459a) && ((C23459a) iVar.mo35f()).getErrorCode() == 2065) {
                            C34387b.m78292a();
                            C34387b.m78294a(str);
                        }
                    } else if (iVar.mo26b() && iVar.mo34e() != null) {
                        User user = ((UserStruct) iVar.mo34e()).getUser();
                        if (user != null && !TextUtils.isEmpty(user.getUid())) {
                            C34010e.this.mo71959a(IMUser.fromUser(user));
                            return Boolean.valueOf(true);
                        }
                    }
                    return Boolean.valueOf(false);
                }
            }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C0013i<Boolean> iVar) {
                    C34010e.this.f87939a.remove(str);
                    if (iVar.mo26b() && ((Boolean) iVar.mo34e()).booleanValue()) {
                        C53755c.m114319a().mo112960d(new C34044o(str));
                        if (aVar != null) {
                            aVar.mo71969a(C34010e.this.mo71952a(str));
                        }
                    }
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo71963a(Map<String, String> map, C34043n nVar) {
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() != null && !this.f87939a.contains(entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    this.f87939a.add(entry.getKey());
                    sb.append("\"");
                    sb.append((String) entry.getValue());
                    sb.append("\",");
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(sb2.substring(0, sb2.lastIndexOf(",")));
                sb3.append("]");
                mo71962a(sb3.toString(), map, true, nVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo71962a(String str, Map<String, String> map, boolean z, C34043n nVar) {
        C34016f fVar = new C34016f(this, z, str, map, nVar);
        C35286u.m79859a(str, (C0011g<C34554k, List<IMUser>>) fVar).mo20a(C34017g.f87954a, C0013i.f25b);
    }

    /* renamed from: a */
    public final IMUser mo71956a(String str, boolean z) {
        return mo71955a(str, "", z, (C34015a) null);
    }

    /* renamed from: a */
    public final void mo71959a(IMUser iMUser) {
        if (iMUser != null) {
            C34387b.m78292a().mo72392a(iMUser);
            m77753b(iMUser);
        }
    }

    /* renamed from: a */
    public final void mo71960a(IMUser iMUser, boolean z) {
        if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
            String uid = iMUser.getUid();
            if (((IMUser) this.f87940c.mo2501a(uid)) != null) {
                if (iMUser.getFollowStatus() == 0 && iMUser.isHasUnreadStory()) {
                    iMUser.setHasUnreadStory(false);
                }
                this.f87940c.mo2507b(uid);
                this.f87940c.mo2502a(uid, iMUser);
                m77754b(iMUser, z);
            }
        }
    }

    /* renamed from: a */
    public final List<IMUser> mo71957a(List<IMUser> list, String str) {
        return mo71958a(list, str, false);
    }

    /* renamed from: a */
    public final List<IMUser> mo71958a(List<IMUser> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    break;
                } else if (C34839a.m78904a(str.charAt(i))) {
                    str = C34839a.m78908c(str).toLowerCase();
                    break;
                } else {
                    i++;
                }
            }
            for (IMUser iMUser : list) {
                if ((z || iMUser.getType() == 0 || iMUser.getType() == 3) && !C35265e.m79728a(iMUser)) {
                    if (!TextUtils.isEmpty(iMUser.getUniqueId())) {
                        if (m77755b(iMUser.getUniqueId(), lowerCase)) {
                            iMUser.setSearchType(1);
                            arrayList.add(iMUser);
                        }
                    } else if (m77755b(iMUser.getShortId(), lowerCase)) {
                        iMUser.setSearchType(1);
                        arrayList.add(iMUser);
                    }
                    if (!TextUtils.isEmpty(iMUser.getRemarkName()) && (m77755b(iMUser.getRemarkName(), lowerCase) || (!C35279p.m79763a() && (m77755b(iMUser.getRemarkInitial(), lowerCase) || m77752a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), lowerCase, str))))) {
                        iMUser.setSearchType(5);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getContactName()) && (m77755b(iMUser.getContactName(), lowerCase) || ((!C35279p.m79763a() && m77755b(iMUser.getContactNameInitial(), lowerCase)) || m77752a(iMUser.getContactName(), iMUser.getContactNamePinyin(), lowerCase, str)))) {
                        iMUser.setSearchType(2);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getNickName()) && (m77755b(iMUser.getNickName(), lowerCase) || (!C35279p.m79763a() && (m77755b(iMUser.getNickNameInitial(), lowerCase) || m77752a(iMUser.getNickName(), iMUser.getNickNamePinyin(), lowerCase, str))))) {
                        iMUser.setSearchType(3);
                        arrayList.add(iMUser);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<IMUser>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    int i;
                    IMUser iMUser = (IMUser) obj;
                    IMUser iMUser2 = (IMUser) obj2;
                    if (iMUser == null && iMUser2 == null) {
                        return 0;
                    }
                    if (iMUser != null && iMUser2 != null) {
                        i = Integer.compare(iMUser.getSearchType(), iMUser2.getSearchType());
                    } else if (iMUser != null) {
                        return 1;
                    } else {
                        i = -1;
                    }
                    return i;
                }
            });
        }
        return arrayList;
    }

    private C34010e() {
    }

    /* renamed from: a */
    public static C34010e m77748a() {
        if (f87938b == null) {
            synchronized (C34010e.class) {
                if (f87938b == null) {
                    f87938b = new C34010e();
                }
            }
        }
        return f87938b;
    }

    /* renamed from: b */
    public final void mo71965b() {
        this.f87940c.mo2503a();
    }

    /* renamed from: b */
    private void m77753b(IMUser iMUser) {
        mo71960a(iMUser, iMUser.isHasUnreadStory());
    }

    /* renamed from: a */
    public final IMUser mo71952a(String str) {
        return mo71956a(str, false);
    }

    /* renamed from: b */
    public final IMUser mo71964b(String str) {
        return mo71956a(str, true);
    }

    /* renamed from: c */
    public final void mo71966c(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (((IMUser) this.f87940c.mo2501a(str)) != null) {
                this.f87940c.mo2507b(str);
            }
            C34387b.m78292a();
            C34387b.m78294a(str);
        }
    }

    /* renamed from: a */
    public static IMUser m77749a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return (IMUser) iMContact;
        }
        if (!(iMContact instanceof IMConversation)) {
            return null;
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation.getConversationType() != C11170a.f30115a) {
            return null;
        }
        return m77748a().mo71964b(String.valueOf(C11190e.m22685a(iMConversation.getConversationId())));
    }

    /* renamed from: a */
    static final /* synthetic */ Void m77750a(C0013i iVar) throws Exception {
        List<IMUser> list = (List) iVar.mo34e();
        if (iVar.mo26b() && list != null && list.size() > 0) {
            for (IMUser iMUser : list) {
                if (iMUser != null && !TextUtils.isEmpty(iMUser.getUid())) {
                    C53755c.m114319a().mo112960d(new C34044o(iMUser.getUid()));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m77751a(String str, IMUser iMUser) {
        if (!TextUtils.isEmpty(str) && iMUser != null) {
            this.f87940c.mo2502a(str, iMUser);
        }
    }

    /* renamed from: b */
    private void m77754b(final IMUser iMUser, boolean z) {
        if (iMUser.isHasUnreadStory() != z) {
            C0013i.m18a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    C53755c.m114319a().mo112960d(new C34044o(iMUser.getUid()));
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: b */
    public static boolean m77755b(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final IMUser mo71953a(String str, C34015a aVar) {
        return mo71955a(str, "", true, aVar);
    }

    /* renamed from: a */
    public final IMUser mo71954a(String str, String str2) {
        return mo71955a(str, str2, true, (C34015a) null);
    }

    /* renamed from: a */
    public static boolean m77752a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str4)) {
            return false;
        }
        if (str2.contains(str3)) {
            return true;
        }
        if (!str2.contains(str4)) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (char a : str3.toCharArray()) {
            if (C34839a.m78904a(a)) {
                if (i > i2 && !str.contains(str3.substring(i2, i))) {
                    return false;
                }
                i++;
                i2 = i;
            } else if (i != str3.length() - 1) {
                i++;
            } else if (!str.contains(str3.substring(i2, i + 1))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final IMUser mo71955a(String str, String str2, boolean z, C34015a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        IMUser iMUser = (IMUser) this.f87940c.mo2501a(str);
        if (iMUser == null) {
            iMUser = C34387b.m78292a().mo72393b(str);
            if (iMUser != null) {
                m77751a(str, iMUser);
            } else if (z) {
                String b = C34030j.m77789b(str);
                if (!TextUtils.isEmpty(b) || TextUtils.isEmpty(str2)) {
                    str2 = b;
                }
                mo71961a(str, str2, aVar);
            }
        }
        return iMUser;
    }
}

package com.p683ss.android.ugc.aweme.user;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.p2380a.C47540a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.user.c */
public class C47549c implements C9382a {

    /* renamed from: a */
    public static final String f119964a;

    /* renamed from: f */
    private static volatile C47549c f119965f;

    /* renamed from: b */
    public boolean f119966b = false;

    /* renamed from: c */
    public boolean f119967c = false;

    /* renamed from: d */
    public long f119968d = -1;

    /* renamed from: e */
    public C9381g f119969e = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: g */
    private C47540a f119970g = new C47540a();

    /* renamed from: b */
    public static User m102975b() {
        return C47557d.f119986b.mo94863a(false);
    }

    /* renamed from: c */
    public static boolean m102978c() {
        return C47557d.f119986b.mo94873e();
    }

    /* renamed from: e */
    public static String m102979e() {
        return C47557d.m102992f();
    }

    /* renamed from: f */
    public static List<String> m102980f() {
        return C47557d.m102994h();
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        sb.append("/aweme/v1/check/in/");
        f119964a = sb.toString();
    }

    private C47549c() {
    }

    /* renamed from: a */
    public static final C47549c m102974a() {
        if (f119965f == null) {
            synchronized (C47549c.class) {
                if (f119965f == null) {
                    f119965f = new C47549c();
                }
            }
        }
        return f119965f;
    }

    /* renamed from: d */
    public void mo94856d() {
        C47557d.m102995i();
        m102976b(m102975b());
        C24514cb.m59921a(5, null, m102975b(), null);
    }

    /* renamed from: b */
    public static void m102977b(String str) {
        if (!C47557d.m102993f(str)) {
            C47557d.f119986b.mo94872e(str);
        }
    }

    /* renamed from: b */
    private static void m102976b(User user) {
        if (user != null) {
            C22282t.m55139a(user.getIsSyncToutiao() ? 1 : 0);
            PlatformInfo[] platformInfos = user.getPlatformInfos();
            boolean z = false;
            if (platformInfos != null && platformInfos.length > 0) {
                int length = platformInfos.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (TextUtils.equals("hotsoon", platformInfos[i].getPatformName())) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            C22282t.m55141a(z);
        }
    }

    /* renamed from: a */
    public final void mo94855a(String str) {
        if (!TextUtils.equals(m102975b().getUniqueId(), str)) {
            m102975b().setUniqueId(str);
            this.f119966b = true;
            C47557d.m102995i();
        }
    }

    public void handleMsg(Message message) {
        if (!(message.obj instanceof Exception)) {
            switch (message.what) {
                case 112:
                    mo94854a((User) message.obj);
                    break;
                case 113:
                    try {
                        Object obj = message.obj;
                        if (!(obj instanceof C23459a)) {
                            C24514cb.m59921a(11, null, null, null);
                            break;
                        } else {
                            ((C23459a) obj).getErrorCode();
                            throw new Exception("user check in fails");
                        }
                    } catch (Exception unused) {
                        return;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo94854a(User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            User b = m102975b();
            this.f119967c = false;
            this.f119968d = -1;
            this.f119966b = true;
            if (!TextUtils.isEmpty(user.getUid()) && !TextUtils.equals(C47557d.f119986b.mo94874g(), user.getUid())) {
                C47557d.f119986b.mo94867b(user.getUid());
            }
            C24514cb.m59921a(4, b, user, null);
            C47557d.f119986b.mo94864a(user);
            C47557d.m102990a(user.getUid());
            mo94856d();
            m102979e();
        }
    }
}

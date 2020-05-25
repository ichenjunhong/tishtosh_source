package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.C13855f;
import com.facebook.C13895g;
import com.facebook.C13904i;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14308d;
import com.facebook.internal.C14308d.C14309a;
import com.facebook.internal.C14308d.C14310b;
import com.facebook.internal.C14345q;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class LoginManager {

    /* renamed from: d */
    private static final Set<String> f37659d = Collections.unmodifiableSet(new HashSet<String>() {
        {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    });

    /* renamed from: e */
    private static volatile LoginManager f37660e;

    /* renamed from: a */
    public C14521d f37661a = C14521d.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public C14503a f37662b = C14503a.FRIENDS;

    /* renamed from: c */
    public String f37663c = "rerequest";

    /* renamed from: f */
    private final SharedPreferences f37664f;

    /* renamed from: com.facebook.login.LoginManager$a */
    static class C14497a implements C14528i {

        /* renamed from: a */
        private final Activity f37668a;

        /* renamed from: a */
        public final Activity mo26712a() {
            return this.f37668a;
        }

        C14497a(Activity activity) {
            C14283ab.m29306a((Object) activity, "activity");
            this.f37668a = activity;
        }

        /* renamed from: a */
        public final void mo26713a(Intent intent, int i) {
            this.f37668a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.LoginManager$b */
    static class C14498b implements C14528i {

        /* renamed from: a */
        private final C14345q f37669a;

        /* renamed from: a */
        public final Activity mo26712a() {
            return this.f37669a.mo26546a();
        }

        C14498b(C14345q qVar) {
            C14283ab.m29306a((Object) qVar, "fragment");
            this.f37669a = qVar;
        }

        /* renamed from: a */
        public final void mo26713a(Intent intent, int i) {
            this.f37669a.mo26547a(intent, i);
        }
    }

    /* renamed from: com.facebook.login.LoginManager$c */
    static class C14499c {

        /* renamed from: a */
        private static C14525f f37670a;

        /* renamed from: a */
        public static synchronized C14525f m29691a(Context context) {
            synchronized (C14499c.class) {
                if (context == null) {
                    context = C14533n.m29773g();
                }
                if (context == null) {
                    return null;
                }
                if (f37670a == null) {
                    f37670a = new C14525f(context, C14533n.m29777k());
                }
                C14525f fVar = f37670a;
                return fVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo26709a(C13855f fVar, final C13904i<C14526g> iVar) {
        if (fVar instanceof C14308d) {
            ((C14308d) fVar).mo26519b(C14310b.Login.toRequestCode(), new C14309a() {
                /* renamed from: a */
                public final boolean mo26520a(int i, Intent intent) {
                    return LoginManager.this.mo26710a(i, intent, iVar);
                }
            });
            return;
        }
        throw new C14457k("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26710a(int i, Intent intent, C13904i<C14526g> iVar) {
        Map map;
        C14491a aVar;
        boolean z;
        AccessToken accessToken;
        Request request;
        Request request2;
        Map map2;
        AccessToken accessToken2;
        int i2 = i;
        Intent intent2 = intent;
        C14491a aVar2 = C14491a.ERROR;
        C14457k kVar = null;
        boolean z2 = false;
        if (intent2 != null) {
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                Request request3 = result.f37651e;
                C14491a aVar3 = result.f37647a;
                if (i2 == -1) {
                    if (result.f37647a == C14491a.SUCCESS) {
                        accessToken2 = result.f37648b;
                    } else {
                        kVar = new C13895g(result.f37649c);
                        accessToken2 = null;
                    }
                } else if (i2 == 0) {
                    accessToken2 = null;
                    z2 = true;
                } else {
                    accessToken2 = null;
                }
                map2 = result.f37652f;
                C14491a aVar4 = aVar3;
                request2 = request3;
                aVar2 = aVar4;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            aVar = C14491a.CANCEL;
            request = null;
            accessToken = null;
            map = null;
            z = true;
        } else {
            aVar = aVar2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (kVar == null && accessToken == null && !z) {
            kVar = new C14457k("Unexpected call to LoginManager.onActivityResult");
        }
        m29669a(null, aVar, map, kVar, true, request);
        m29670a(accessToken, request, kVar, z, iVar);
        return true;
    }

    /* renamed from: a */
    public final LoginManager mo26705a(String str) {
        this.f37663c = str;
        return this;
    }

    /* renamed from: a */
    public final void mo26708a(Fragment fragment, Collection<String> collection) {
        m29671a(new C14345q(fragment), collection);
    }

    /* renamed from: a */
    public final void mo26707a(android.app.Fragment fragment, Collection<String> collection) {
        m29671a(new C14345q(fragment), collection);
    }

    /* renamed from: a */
    public final void mo26706a(Activity activity, Collection<String> collection) {
        m29672a((C14528i) new C14497a(activity), m29665a(collection));
    }

    /* renamed from: a */
    private void m29673a(boolean z) {
        Editor edit = this.f37664f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo26711b() {
        AccessToken.m27256a((AccessToken) null);
        Profile.m27313a(null);
        m29673a(false);
    }

    LoginManager() {
        C14283ab.m29303a();
        this.f37664f = C35807d.m80935a(C14533n.m29773g(), "com.facebook.loginManager", 0);
    }

    /* renamed from: a */
    public static LoginManager m29666a() {
        if (f37660e == null) {
            synchronized (LoginManager.class) {
                if (f37660e == null) {
                    f37660e = new LoginManager();
                }
            }
        }
        return f37660e;
    }

    /* renamed from: a */
    public final LoginManager mo26703a(C14503a aVar) {
        this.f37662b = aVar;
        return this;
    }

    /* renamed from: a */
    public final LoginManager mo26704a(C14521d dVar) {
        this.f37661a = dVar;
        return this;
    }

    /* renamed from: b */
    static boolean m29675b(String str) {
        if (str == null || (!str.startsWith("publish") && !str.startsWith("manage") && !f37659d.contains(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Request m29665a(Collection<String> collection) {
        HashSet hashSet;
        C14521d dVar = this.f37661a;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        Request request = new Request(dVar, Collections.unmodifiableSet(hashSet), this.f37662b, this.f37663c, C14533n.m29777k(), UUID.randomUUID().toString());
        request.f37643f = AccessToken.m27257b();
        return request;
    }

    /* renamed from: a */
    private static void m29668a(Context context, Request request) {
        C14525f a = C14499c.m29691a(context);
        if (a != null && request != null) {
            a.mo26771a(request);
        }
    }

    /* renamed from: a */
    private static C14526g m29667a(Request request, AccessToken accessToken) {
        Set<String> set = request.f37639b;
        HashSet hashSet = new HashSet(accessToken.f35173b);
        if (request.f37643f) {
            hashSet.retainAll(set);
        }
        HashSet hashSet2 = new HashSet(set);
        hashSet2.removeAll(hashSet);
        return new C14526g(accessToken, hashSet, hashSet2);
    }

    /* renamed from: b */
    private boolean m29674b(C14528i iVar, Request request) {
        boolean z;
        Intent intent = new Intent();
        intent.setClass(C14533n.m29773g(), FacebookActivity.class);
        intent.setAction(request.f37638a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (C14533n.m29773g().getPackageManager().resolveActivity(intent, 0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        try {
            iVar.mo26713a(intent, LoginClient.m29642b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m29671a(C14345q qVar, Collection<String> collection) {
        m29672a((C14528i) new C14498b(qVar), m29665a(collection));
    }

    /* renamed from: a */
    private void m29672a(C14528i iVar, Request request) throws C14457k {
        m29668a((Context) iVar.mo26712a(), request);
        C14308d.m29348a(C14310b.Login.toRequestCode(), new C14309a() {
            /* renamed from: a */
            public final boolean mo26520a(int i, Intent intent) {
                return LoginManager.this.mo26710a(i, intent, null);
            }
        });
        if (!m29674b(iVar, request)) {
            C14457k kVar = new C14457k("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m29669a(iVar.mo26712a(), C14491a.ERROR, null, kVar, false, request);
            throw kVar;
        }
    }

    /* renamed from: a */
    private void m29670a(AccessToken accessToken, Request request, C14457k kVar, boolean z, C13904i<C14526g> iVar) {
        C14526g gVar;
        if (accessToken != null) {
            AccessToken.m27256a(accessToken);
            Profile.m27314b();
        }
        if (iVar != null) {
            if (accessToken != null) {
                gVar = m29667a(request, accessToken);
            } else {
                gVar = null;
            }
            if (z || (gVar != null && gVar.f37740b.size() == 0)) {
                iVar.mo23330n_();
            } else if (kVar != null) {
                iVar.mo23328a(kVar);
            } else if (accessToken != null) {
                m29673a(true);
                iVar.mo23329a(gVar);
            }
        }
    }

    /* renamed from: a */
    private static void m29669a(Context context, C14491a aVar, Map<String, String> map, Exception exc, boolean z, Request request) {
        String str;
        C14525f a = C14499c.m29691a(context);
        if (a != null) {
            if (request == null) {
                a.mo26777c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            String str2 = "try_login_activity";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            a.mo26775a(request.f37642e, hashMap, aVar, map, exc);
        }
    }
}

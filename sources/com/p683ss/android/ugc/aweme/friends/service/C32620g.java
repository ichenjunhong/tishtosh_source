package com.p683ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyResultEvent;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyUserList;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ThirdPartyFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.service.IFriendsService.C32613b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.friends.service.g */
public final class C32620g implements C32613b, C32618e {

    /* renamed from: a */
    public static final C32621a f84869a = new C32621a(null);

    /* renamed from: b */
    private C32613b f84870b;

    /* renamed from: c */
    private Bundle f84871c;

    /* renamed from: d */
    private Activity f84872d;

    /* renamed from: e */
    private String f84873e = "";

    /* renamed from: f */
    private String f84874f = "";

    /* renamed from: g */
    private String f84875g = "";

    /* renamed from: h */
    private boolean f84876h;

    /* renamed from: com.ss.android.ugc.aweme.friends.service.g$a */
    public static final class C32621a {
        private C32621a() {
        }

        public /* synthetic */ C32621a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.g$b */
    static final class C32622b<TTaskResult, TContinuationResult> implements C0011g<ThirdPartyUserList, Object> {

        /* renamed from: a */
        final /* synthetic */ C32620g f84877a;

        C32622b(C32620g gVar) {
            this.f84877a = gVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (C47957v.m103770a(iVar)) {
                C52711k.m112236a((Object) iVar, "it");
                if (!C52830p.m112406a("error", ((ThirdPartyUserList) iVar.mo34e()).message, true)) {
                    if (!C9376b.m18558a((Collection<T>) ((ThirdPartyUserList) iVar.mo34e()).userList)) {
                        C53755c a = C53755c.m114319a();
                        List<User> list = ((ThirdPartyUserList) iVar.mo34e()).userList;
                        if (list == null) {
                            C52711k.m112234a();
                        }
                        a.mo112962f(new ThirdPartyResultEvent(list, ((ThirdPartyUserList) iVar.mo34e()).hasMore, ((ThirdPartyUserList) iVar.mo34e()).cursor));
                    } else {
                        C32620g.m75406a();
                    }
                    return C52860x.f131107a;
                }
            }
            C32620g.m75406a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static void m75406a() {
        C47718bf.m103288a(new ThirdPartyResultEvent(C52575l.m112097a(), false, 0));
    }

    /* renamed from: a */
    public final void mo49726a(Object obj) {
        if (this.f84870b != null) {
            C32613b bVar = this.f84870b;
            if (bVar != null) {
                bVar.mo49726a(obj);
            }
            this.f84870b = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66142a(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "thirdparty_token"
            java.lang.String r1 = ""
            java.lang.String r0 = r10.getString(r0, r1)
            java.lang.String r1 = "getString(LoginConstants.THIRDPARTY_TOKEN, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r9.f84874f = r0
            java.lang.String r0 = "thirdparty_token_secret"
            java.lang.String r1 = ""
            java.lang.String r0 = r10.getString(r0, r1)
            java.lang.String r1 = "getString(LoginConstants…RDPARTY_TOKEN_SECRET, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r9.f84875g = r0
            java.lang.String r0 = "thirdparty_is_new_user"
            r1 = 0
            boolean r0 = r10.getBoolean(r0, r1)
            r9.f84876h = r0
            java.lang.String r0 = "thirdparty_platform_name"
            java.lang.String r2 = ""
            java.lang.String r10 = r10.getString(r0, r2)
            java.lang.String r0 = "getString(LoginConstants…DPARTY_PLATFORM_NAME, \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            r9.f84873e = r10
            java.lang.String r10 = r9.f84873e
            int r0 = r10.hashCode()
            r2 = -916346253(0xffffffffc961aa73, float:-924327.2)
            if (r0 == r2) goto L_0x0057
            r2 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r0 == r2) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            java.lang.String r0 = "facebook"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0062
            r1 = 1
            r3 = 1
            goto L_0x0063
        L_0x0057:
            java.lang.String r0 = "twitter"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0062
            r1 = 2
            r3 = 2
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            java.lang.String r4 = r9.f84874f
            java.lang.String r5 = r9.f84875g
            boolean r10 = r9.f84876h
            if (r10 == 0) goto L_0x006e
            r10 = 5
            r6 = 5
            goto L_0x0070
        L_0x006e:
            r10 = 4
            r6 = 4
        L_0x0070:
            com.ss.android.ugc.aweme.friends.api.FriendApi r2 = com.p683ss.android.ugc.aweme.friends.api.C32558a.m75336a()
            r7 = 0
            r8 = 20
            a.i r10 = r2.thirdPartyRecommendUsers(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.friends.service.g$b r0 = new com.ss.android.ugc.aweme.friends.service.g$b
            r0.<init>(r9)
            a.g r0 = (p001a.C0011g) r0
            java.util.concurrent.ExecutorService r1 = p001a.C0013i.f24a
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r10.mo20a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.service.C32620g.mo66142a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo66141a(Activity activity, Bundle bundle, C32613b bVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "data");
        C52711k.m112240b(bVar, "result");
        this.f84870b = bVar;
        this.f84871c = bundle;
        this.f84872d = activity;
        Activity activity2 = this.f84872d;
        Bundle bundle2 = this.f84871c;
        if (activity2 != null) {
            Intent intent = new Intent(activity2, ThirdPartyFriendsActivity.class);
            intent.putExtras(bundle2);
            activity2.startActivity(intent);
        }
    }
}

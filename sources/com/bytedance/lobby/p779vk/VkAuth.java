package com.bytedance.lobby.p779vk;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.lobby.C12311a;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12315a;
import com.bytedance.lobby.auth.C12317b;
import com.bytedance.lobby.auth.C12321d;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.p2620vk.sdk.C52322a;
import com.p2620vk.sdk.C52419b;
import com.p2620vk.sdk.C52420c;
import com.p2620vk.sdk.VKSdk;
import com.p2620vk.sdk.VKServiceActivity;
import com.p2620vk.sdk.VKServiceActivity.C52321a;
import com.p2620vk.sdk.api.C52351b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.bytedance.lobby.vk.VkAuth */
public class VkAuth extends VkProvider<AuthResult> implements C12321d, C52419b<C52322a> {

    /* renamed from: c */
    private static final boolean f32569c = C12311a.f32450a;

    /* renamed from: d */
    private static final String[] f32570d = {"offline", "wall", "photos", "friends"};

    /* renamed from: e */
    private LobbyViewModel f32571e;

    /* renamed from: a */
    public final void mo23311a() {
    }

    /* renamed from: b */
    public final String mo23314b() {
        if (!VKSdk.m111766b()) {
            return null;
        }
        return C52322a.m111781b().f130298a;
    }

    public VkAuth(C12324c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private static boolean m24885a(String[] strArr) {
        boolean z = false;
        if (!VKSdk.m111766b()) {
            return false;
        }
        try {
            C52322a b = C52322a.m111781b();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (b.f130305h.get(strArr[i]) == null) {
                    break;
                }
                i++;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo23369a(C52322a aVar) {
        String str;
        long j;
        if (aVar == null || TextUtils.isEmpty(aVar.f130298a)) {
            StringBuilder sb = new StringBuilder();
            if (aVar != null) {
                str = "accessToken ";
            } else {
                str = "VKAccessToken ";
            }
            sb.append(str);
            sb.append("== null");
            this.f32571e.mo23338b(new C12315a(this.f32525b.f32487b, 1).mo23302a(false).mo23300a(new C12322b(3, sb.toString())).mo23303a());
            return;
        }
        C12315a b = new C12315a(this.f32525b.f32487b, 1).mo23302a(true).mo23304b(aVar.f130298a);
        if (aVar.f130299b > 0) {
            j = System.currentTimeMillis() + ((long) aVar.f130299b);
        } else {
            j = 0;
        }
        this.f32571e.mo23338b(b.mo23298a(j).mo23301a(aVar.f130300c).mo23303a());
    }

    /* renamed from: a */
    public final void mo23368a(C52351b bVar) {
        C12315a a = new C12315a(this.f32525b.f32487b, 1).mo23302a(false);
        if (bVar != null && bVar.f130350f == -102) {
            a.mo23300a(new C12322b(4, bVar.f130351g));
        } else if (bVar == null) {
            a.mo23300a(new C12322b(3, "VKCallback.onError called with null VKError parameter"));
        } else {
            a.mo23300a(new C12322b(bVar.f130350f, C2240a.m6773a(Locale.US, "errorMessage: %s, errorReason: %s", new Object[]{bVar.f130351g, bVar.f130352h})));
        }
        this.f32571e.mo23338b(a.mo23303a());
    }

    /* renamed from: b */
    public final void mo23315b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12317b.m24788a(this.f32571e, this.f32525b.f32487b);
    }

    /* renamed from: a */
    public final void mo23313a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32571e = LobbyViewModel.m24844a(fragmentActivity);
        if (!mo23333c()) {
            C12317b.m24789a(this.f32571e, this.f32525b.f32487b, 1);
        } else if (!m24885a(f32570d)) {
            String[] strArr = f32570d;
            if (strArr == null) {
                strArr = new String[0];
            }
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
            if (!arrayList.contains("offline")) {
                arrayList.add("offline");
            }
            VKSdk.f130276b = arrayList;
            Intent a = VKServiceActivity.m111772a(fragmentActivity.getApplicationContext(), C52321a.Authorization);
            a.putStringArrayListExtra("arg2", arrayList);
            fragmentActivity.startActivityForResult(a, C52321a.Authorization.getOuterCode());
        } else {
            mo23369a(C52322a.m111781b());
        }
    }

    /* renamed from: a */
    public final void mo23312a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (i != C52321a.Authorization.getOuterCode()) {
            return;
        }
        if (i2 == -1) {
            mo23369a(C52322a.m111781b());
        } else if (i2 == 0) {
            long j = 0;
            if (intent != null) {
                j = intent.getLongExtra("vk_extra_error_id", 0);
            }
            mo23368a((C52351b) C52420c.m111974a(j));
        }
    }
}

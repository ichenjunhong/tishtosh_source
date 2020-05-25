package com.bytedance.android.livesdk.user;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3013l;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import java.util.HashMap;
import p064c.p065a.C1680ad;
import p064c.p065a.C2149h;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.livesdk.user.e */
public interface C8333e {
    /* renamed from: a */
    C1680ad<User> mo14515a(HashMap<String, String> hashMap);

    /* renamed from: a */
    C2201v<C3009i> mo14516a(Context context, C8337i iVar);

    /* renamed from: a */
    C2201v<C8686a> mo14517a(C8325b bVar);

    /* renamed from: a */
    C2201v<C8686a> mo14518a(C8329d dVar);

    /* renamed from: a */
    C2201v<C8686a> mo14519a(C8341k kVar);

    /* renamed from: a */
    C2201v<C8686a> mo14520a(C8344l lVar);

    /* renamed from: a */
    C3009i mo14521a();

    /* renamed from: a */
    String mo14522a(long j);

    /* renamed from: a */
    void mo14523a(int i);

    /* renamed from: a */
    void mo14524a(C3009i iVar);

    /* renamed from: a */
    void mo14525a(C8686a aVar);

    /* renamed from: a */
    void mo14526a(String str, OnClickListener onClickListener, Context context, String str2, String str3, long j, boolean z);

    /* renamed from: a */
    void mo14527a(boolean z);

    /* renamed from: a */
    boolean mo14528a(C8336h hVar);

    /* renamed from: b */
    long mo14529b();

    /* renamed from: b */
    C1680ad<User> mo14530b(long j);

    /* renamed from: c */
    C2201v<C3009i> mo14531c(long j);

    /* renamed from: c */
    boolean mo14532c();

    /* renamed from: d */
    C2149h<C3013l> mo14533d();

    /* renamed from: d */
    C2201v<C8686a> mo14534d(long j);

    /* renamed from: e */
    C1680ad<C3009i> mo14535e();

    /* renamed from: f */
    C2201v<C3009i> mo14536f();

    /* renamed from: g */
    C2201v<C8686a> mo14537g();
}

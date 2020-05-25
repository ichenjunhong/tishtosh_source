package com.p683ss.android.sdk.app;

import android.app.Application;
import android.content.Context;
import android.support.p043v7.app.C1163d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.p558e.C9741d;
import com.bytedance.p558e.C9741d.C97421;
import com.bytedance.p558e.C9748i;
import com.bytedance.p558e.C9749j;
import com.bytedance.p558e.C9750k;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.google.gson.C17971f;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.C18488a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.setting.TiktokSkinHelper;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask */
public class AbTestSdkInitTask implements LegoTask {

    /* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask$AbTestApi */
    interface AbTestApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    static final /* synthetic */ String lambda$run$0$AbTestSdkInitTask(String str) {
        try {
            return (String) ((AbTestApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(AbTestApi.class)).doGet(str).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public void run(Context context) {
        C32458a.m75144a("AbTestSdkInitTask");
        C97421 r1 = new Runnable((Application) context, C18488a.f50914a.trim(), false, new C9748i() {

            /* renamed from: b */
            private C17971f f54357b = new C17971f();

            /* renamed from: a */
            public final <T> T mo17577a(String str, Type type) {
                return this.f54357b.mo34885a(str, type);
            }
        }, C19728a.f54358a, C19729b.f54359a, new C9749j() {
            /* renamed from: a */
            public final <T> T mo17578a(String str, Type type, T t) {
                return new C23051bf(str, type, null).mo47781c();
            }
        }) {

            /* renamed from: a */
            final /* synthetic */ Application f26527a;

            /* renamed from: b */
            final /* synthetic */ String f26528b;

            /* renamed from: c */
            final /* synthetic */ boolean f26529c;

            /* renamed from: d */
            final /* synthetic */ C9748i f26530d;

            /* renamed from: e */
            final /* synthetic */ C9746g f26531e;

            /* renamed from: f */
            final /* synthetic */ C9747h f26532f;

            /* renamed from: g */
            final /* synthetic */ C9749j f26533g;

            public final void run() {
                C9737b bVar = new C9737b(this.f26527a, this.f26528b, this.f26529c, this.f26530d, this.f26531e, this.f26532f);
                C9741d.f26522b = bVar;
                C9741d.f26521a = this.f26533g;
            }

            {
                this.f26527a = r1;
                this.f26528b = r2;
                this.f26529c = r3;
                this.f26530d = r4;
                this.f26531e = r5;
                this.f26532f = r6;
                this.f26533g = r7;
            }
        };
        C9741d.f26523c = C9750k.f26542a.submit(r1);
        C1163d.f3810a = 1;
        TiktokSkinHelper.m91332a(context.getResources());
        TiktokSkinHelper.f105191a = true;
    }
}

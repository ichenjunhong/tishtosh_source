package com.p683ss.android.ugc.aweme.shortvideo.messagecenter;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import java.util.concurrent.Callable;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel */
public final class MessageCenterViewModel extends C0209x {

    /* renamed from: a */
    public final C0198r<C43992a> f111405a = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel$a */
    public static final class C43991a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ MessageCenterViewModel f111406a;

        /* renamed from: b */
        final /* synthetic */ int f111407b;

        /* renamed from: c */
        final /* synthetic */ int f111408c;

        /* renamed from: d */
        final /* synthetic */ int f111409d;

        /* renamed from: e */
        final /* synthetic */ String f111410e;

        public C43991a(MessageCenterViewModel messageCenterViewModel, int i, int i2, int i3, String str) {
            this.f111406a = messageCenterViewModel;
            this.f111407b = i;
            this.f111408c = i2;
            this.f111409d = i3;
            this.f111410e = str;
        }

        public final /* synthetic */ Object call() {
            this.f111406a.f111405a.setValue(new C43992a(this.f111407b, this.f111408c, this.f111409d, this.f111410e));
            return C52860x.f131107a;
        }
    }
}

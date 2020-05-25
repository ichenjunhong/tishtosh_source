package com.bytedance.android.live.broadcast.p198b;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.bytedance.android.live.broadcast.api.AutoReplyApi;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.widget.C8543d;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.b.a */
public final class C3061a extends C8543d {

    /* renamed from: a */
    public static boolean f8939a;

    /* renamed from: com.bytedance.android.live.broadcast.b.a$a */
    static class C3063a implements C1710e<Object> {

        /* renamed from: a */
        private boolean f8940a;

        private C3063a(boolean z) {
            this.f8940a = z;
        }

        public final void accept(Object obj) {
            if (this.f8940a) {
                C4575an.m10981a((int) R.string.exk);
            }
            C4525b.f12330Z.mo10346a(Boolean.valueOf(this.f8940a));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.a$b */
    static class C3064b implements C1710e<Throwable> {

        /* renamed from: a */
        private WeakReference<ToggleButton> f8941a;

        private C3064b(ToggleButton toggleButton) {
            this.f8941a = new WeakReference<>(toggleButton);
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            if (this.f8941a.get() != null) {
                C3061a.f8939a = true;
                ((ToggleButton) this.f8941a.get()).setChecked(false);
                C3061a.f8939a = false;
            }
        }
    }

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.ahb;
    }

    public C3061a(Context context) {
        super(context);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.d1u);
        toggleButton.setChecked(((Boolean) C4525b.f12330Z.mo10345a()).booleanValue());
        toggleButton.setOnCheckedChangeListener(new C3065b(toggleButton));
    }

    /* renamed from: a */
    static final /* synthetic */ void m8550a(ToggleButton toggleButton, CompoundButton compoundButton, boolean z) {
        String str;
        if (!f8939a) {
            AutoReplyApi autoReplyApi = (AutoReplyApi) C3395f.m9156f().mo8742c().mo9018a(AutoReplyApi.class);
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            autoReplyApi.enableAutoReply(str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3063a<Object>(z), (C1710e<? super Throwable>) new C3064b<Object>(toggleButton));
        }
    }
}

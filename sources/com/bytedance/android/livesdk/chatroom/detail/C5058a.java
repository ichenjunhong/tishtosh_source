package com.bytedance.android.livesdk.chatroom.detail;

import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.room.C4179a;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.livesdk.p279af.C4597i;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8651a;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.a */
public final class C5058a implements C4179a {

    /* renamed from: a */
    public int f13531a;

    /* renamed from: b */
    public boolean f13532b = false;

    /* renamed from: c */
    public long f13533c = -1;

    /* renamed from: d */
    public Context f13534d;

    /* renamed from: e */
    public String f13535e;

    /* renamed from: f */
    private final OnAudioFocusChangeListener f13536f = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
            C5058a.this.f13531a = i;
            if (C5058a.this.f13532b) {
                if (i == -2 || i == -3) {
                    C5058a.this.f13533c = System.currentTimeMillis();
                    C5058a.this.mo10929a(true, C5058a.this.f13534d, C5058a.this.f13535e);
                } else if (i != 1) {
                    if (i == -1) {
                        C5058a.this.f13533c = System.currentTimeMillis();
                        C5058a.this.mo10929a(true, C5058a.this.f13534d, C5058a.this.f13535e);
                    }
                } else if (!(C5058a.this.f13534d instanceof FragmentActivity) || ((FragmentActivity) C5058a.this.f13534d).getLifecycle().mo323a().isAtLeast(C0178b.RESUMED)) {
                    C5058a.this.f13533c = -1;
                    C5058a.this.mo10929a(false, C5058a.this.f13534d, C5058a.this.f13535e);
                }
            }
        }
    };

    /* renamed from: g */
    private final C8649h f13537g;

    /* renamed from: a */
    public final void mo10924a() {
        C4597i.m11035b(this.f13536f);
    }

    /* renamed from: b */
    public final void mo10930b(Context context) {
        m11558b(context, C8651a.m17097a(context));
    }

    /* renamed from: a */
    public final void mo10925a(Context context) {
        mo10926a(context, C8651a.m17097a(context));
    }

    public C5058a(C8649h hVar) {
        this.f13537g = hVar;
    }

    /* renamed from: a */
    public final void mo10927a(String str) {
        m11558b(null, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10928a(boolean z) {
        this.f13532b = z;
        if (z && this.f13531a == -1) {
            this.f13533c = System.currentTimeMillis();
            mo10929a(true, this.f13534d, this.f13535e);
        }
    }

    /* renamed from: b */
    private void m11558b(Context context, String str) {
        mo10929a(true, context, str);
        mo10924a();
        C4597i.m11034b();
    }

    /* renamed from: a */
    public final void mo10926a(Context context, String str) {
        this.f13534d = context;
        this.f13535e = str;
        C4597i.m11033a(this.f13536f);
        boolean z = true;
        if (C4597i.m11032a() == 1) {
            this.f13533c = -1;
        } else if (this.f13532b) {
            this.f13533c = System.currentTimeMillis();
            mo10929a(z, context, str);
        } else {
            this.f13533c = -1;
        }
        z = false;
        mo10929a(z, context, str);
    }

    /* renamed from: a */
    public final void mo10929a(boolean z, Context context, String str) {
        if (this.f13537g != null) {
            if (this.f13537g instanceof C4189h) {
                ((C4189h) this.f13537g).mo9616a(z, str);
                return;
            }
            this.f13537g.mo14270a(z, context);
        }
    }
}

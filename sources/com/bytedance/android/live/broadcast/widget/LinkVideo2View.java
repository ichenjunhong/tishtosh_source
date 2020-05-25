package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.api.p195b.C3039b;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3051b;
import com.bytedance.android.live.broadcast.api.p197d.C3051b.C3052a;
import com.bytedance.android.live.broadcast.effect.C3197a;
import com.bytedance.android.live.broadcast.p202d.C3164c;
import com.bytedance.android.live.broadcast.p202d.C3165d;
import com.bytedance.android.live.broadcast.p202d.C3166e;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.C3430b;
import com.bytedance.android.live.broadcast.p213h.C3441c.C3442a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3413a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3419b;
import com.bytedance.android.live.broadcast.p213h.p214a.C3420c.C3421a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3417d;
import com.bytedance.android.live.broadcast.p213h.p216b.C3439a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3440b;
import com.bytedance.android.live.broadcast.p213h.p217c.C3443a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.interact.C5280an;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import java.io.FileNotFoundException;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LinkVideo2View extends SurfaceView implements C3051b, C5280an, C5281ao {

    /* renamed from: a */
    final C3052a f10403a;

    /* renamed from: b */
    C3197a f10404b;

    /* renamed from: c */
    public C3417d f10405c;

    /* renamed from: d */
    C3413a f10406d;

    /* renamed from: e */
    public boolean f10407e;

    /* renamed from: f */
    public C1690c f10408f;

    /* renamed from: g */
    C3039b f10409g;

    /* renamed from: h */
    private C3048a f10410h;

    /* renamed from: c */
    public final void mo9039c() {
    }

    /* renamed from: d */
    public final void mo9040d() {
    }

    /* renamed from: a_ */
    public final void mo8318a_() {
        this.f10406d.mo8762b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10410h.mo8303b();
    }

    /* renamed from: a */
    public final void mo9037a() {
        try {
            this.f10410h.mo8304c();
        } catch (NullPointerException e) {
            C3831a.m9706a(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    /* renamed from: b */
    public final void mo9038b() {
        try {
            this.f10410h.mo8303b();
        } catch (NullPointerException e) {
            C3831a.m9706a(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f10408f != null && !this.f10408f.isDisposed()) {
            this.f10408f.dispose();
        }
        C3395f.m9156f().mo8740a().mo8276c();
        this.f10406d.mo8757a();
        this.f10410h.mo8304c();
        this.f10410h.mo8305d();
        super.onDetachedFromWindow();
        if (this.f10408f != null && !this.f10408f.isDisposed()) {
            this.f10408f.dispose();
        }
    }

    public LinkVideo2View(Context context) {
        this(context, null, null);
    }

    /* renamed from: a */
    public final void mo8317a(int i) {
        if (this.f10404b != null) {
            this.f10404b.mo8539a(i);
        }
    }

    /* renamed from: a */
    public final Client mo9036a(InteractConfig interactConfig, Boolean bool) {
        return this.f10410h.mo8292a(interactConfig, bool);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public LinkVideo2View(Context context, C3052a aVar) {
        this(context, null, aVar);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet, C3052a aVar) {
        int i;
        super(context, attributeSet);
        this.f10409g = new C3039b() {
            /* renamed from: a */
            public final int mo8253a() {
                LinkVideo2View.this.f10405c.mo8787a();
                return 1;
            }

            /* renamed from: a */
            public final int mo8256a(boolean z) {
                LinkVideo2View.this.f10405c.mo8791a(z);
                return 1;
            }

            /* renamed from: a */
            public final int mo8257a(String[] strArr) {
                LinkVideo2View.this.f10405c.mo8792a(strArr);
                return 1;
            }

            /* renamed from: a */
            public final int mo8255a(String str, boolean z) {
                try {
                    LinkVideo2View.this.f10405c.mo8790a(str, z);
                    return 1;
                } catch (FileNotFoundException e) {
                    C3831a.m9714b("LinkVideo2View", (Throwable) e);
                    return -1;
                }
            }

            /* renamed from: a */
            public final int mo8258a(String[] strArr, String[] strArr2) {
                LinkVideo2View.this.f10405c.mo8793a(strArr, strArr2);
                return 1;
            }

            /* renamed from: a */
            public final int mo8254a(String str, String str2, float f) {
                try {
                    LinkVideo2View.this.f10405c.mo8788a(str, str2, f);
                    return 1;
                } catch (FileNotFoundException e) {
                    C3831a.m9714b("LinkVideo2View", (Throwable) e);
                    return -1;
                }
            }
        };
        this.f10403a = aVar;
        String modelFilePath = C3617q.INST.getModelFilePath();
        if (aVar == null || aVar.f8930c != 0) {
            i = 1;
        } else {
            i = 2;
        }
        this.f10410h = new C3430b(new C3442a(getContext()).mo8827a(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).mo8823a((C3439a) new C3165d()).mo8824a((C3440b) new C3166e()).mo8825a((C3443a) new C3164c()).mo8840j(i).mo8833c(modelFilePath).mo8826a((Object) C3617q.INST.getResourceFinder(getContext())).mo8821a(240, 320).mo8829a());
        this.f10406d = new C3419b(this, this.f10410h);
        this.f10406d.mo8759a((C3421a) new C3421a() {
            /* renamed from: a */
            public final void mo8798a(int i, int i2, String str) {
            }

            /* renamed from: b */
            public final void mo8799b(int i, int i2, String str) {
                if (!LinkVideo2View.this.f10407e) {
                    LinkVideo2View.this.f10408f = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3774i<Object>(this), C3775j.f10663a);
                }
            }
        });
    }
}

package dmt.p2652av.video;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback2;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnWindowFocusChangeListener;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50720o.C50747h;
import com.p683ss.android.vesdk.C50751p;

/* renamed from: dmt.av.video.VEEditorAutoStartStopArbiter */
public final class VEEditorAutoStartStopArbiter implements C0183j {

    /* renamed from: a */
    public boolean f131122a;

    /* renamed from: b */
    public boolean f131123b;

    /* renamed from: c */
    public boolean f131124c;

    /* renamed from: d */
    private Context f131125d;

    /* renamed from: e */
    private BroadcastReceiver f131126e;

    /* renamed from: f */
    private C20347c f131127f;

    /* renamed from: g */
    private boolean f131128g;

    /* renamed from: dmt.av.video.VEEditorAutoStartStopArbiter$a */
    public interface C52881a {
        /* renamed from: d */
        void mo91758d();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        this.f131125d.unregisterReceiver(this.f131126e);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        if (!this.f131123b && !this.f131124c) {
            mo110431a();
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        if (!this.f131123b && !this.f131124c && this.f131128g) {
            mo110434b();
        }
    }

    /* renamed from: a */
    public final void mo110431a() {
        if (!this.f131122a) {
            try {
                if (this.f131127f.mo43063g() != C50747h.PAUSED) {
                    this.f131127f.mo43087s();
                }
            } catch (C50751p e) {
                if (e.getRetCd() != -105) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo110434b() {
        if (!this.f131122a) {
            try {
                if (this.f131127f.mo43063g() != C50747h.STARTED) {
                    this.f131127f.mo43085r();
                }
            } catch (Exception e) {
                C50203g.m108361b(e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo110432a(boolean z) {
        mo110433a(z, false);
    }

    /* renamed from: a */
    public final void mo110433a(boolean z, boolean z2) {
        if (this.f131122a != z) {
            if (this.f131122a) {
                if (!z2) {
                    this.f131127f.mo43085r();
                }
                if (this.f131125d instanceof C52881a) {
                    ((C52881a) this.f131125d).mo91758d();
                }
            } else {
                this.f131127f.mo43087s();
            }
            this.f131122a = z;
        }
    }

    public VEEditorAutoStartStopArbiter(Context context, C0184k kVar, C20347c cVar, SurfaceView surfaceView) {
        this(context, kVar, cVar, surfaceView, true);
    }

    public VEEditorAutoStartStopArbiter(Context context, final C0184k kVar, C20347c cVar, SurfaceView surfaceView, final boolean z) {
        this.f131128g = z;
        this.f131125d = context;
        this.f131127f = cVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f131126e = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && !VEEditorAutoStartStopArbiter.this.f131123b && !VEEditorAutoStartStopArbiter.this.f131124c) {
                    VEEditorAutoStartStopArbiter.this.mo110431a();
                }
            }
        };
        if (VERSION.SDK_INT >= 18) {
            ((ViewGroup) surfaceView.getParent()).getViewTreeObserver().addOnWindowFocusChangeListener(new OnWindowFocusChangeListener() {
                public final void onWindowFocusChanged(boolean z) {
                    if (z && kVar.getLifecycle().mo323a().isAtLeast(C0178b.RESUMED) && !VEEditorAutoStartStopArbiter.this.f131123b && z) {
                        VEEditorAutoStartStopArbiter.this.mo110434b();
                    }
                }
            });
        }
        this.f131125d.registerReceiver(this.f131126e, intentFilter);
        surfaceView.getHolder().addCallback(new Callback2() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            }
        });
        kVar.getLifecycle().mo324a(this);
    }
}

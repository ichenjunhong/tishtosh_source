package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.medialib.camera.C19264d;
import com.p683ss.android.medialib.model.Enigma;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1185qr.ScanSettings;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.net.C26918a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p2375u.C47404a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.qrcode.BaseScanQRCodeActivity;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40924b;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40925c;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40931e;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40932f;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40933g;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40934h;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40935i;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40936j;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40937k;
import com.p683ss.android.ugc.aweme.qrcode.p2103ab.QRCodeABManager;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40945e;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40946f;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40955a;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.C409751;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40997p.C40998a;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40997p.C40999b;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.qrcode.view.C41048b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener;
import com.p683ss.android.ugc.aweme.settings.CouponVerificationListSettings;
import com.p683ss.android.ugc.aweme.share.p2150b.C41992b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2 */
public class ScanQRCodeActivityV2 extends BaseScanQRCodeActivity implements OnClickListener, C39978l, C40998a {

    /* renamed from: A */
    OnEnigmaScanListener f104287A = new OnEnigmaScanListener() {
        public final void onFail(int i) {
            if (ScanQRCodeActivityV2.this.f104312s && ScanQRCodeActivityV2.this.f104303j != null) {
                ScanQRCodeActivityV2.this.f104303j.mo83455a(ScanQRCodeActivityV2.this.f104308o, i, -1);
            }
            if (ScanQRCodeActivityV2.this.f104308o && ScanQRCodeActivityV2.this.f104302i != null) {
                ScanQRCodeActivityV2.this.f104302i.stopPicScan();
            }
            ScanQRCodeActivityV2.this.f104308o = false;
        }

        public final void onSuccess(EnigmaResult enigmaResult) {
            if (ScanQRCodeActivityV2.this.f104312s && !ScanQRCodeActivityV2.this.f104310q && ScanQRCodeActivityV2.this.f104303j != null) {
                if (enigmaResult != null && enigmaResult.getResult() != null && enigmaResult.getResult().length > 0) {
                    ScanQRCodeActivityV2.this.f104310q = true;
                    Enigma[] result = enigmaResult.getResult();
                    if (ScanQRCodeActivityV2.this.f104300g) {
                        Intent intent = new Intent();
                        intent.putExtra("scan_code_result", result[0].getText());
                        intent.putExtra("scan_code_type", result[0].getType());
                        ScanQRCodeActivityV2.this.setResult(-1, intent);
                        ScanQRCodeActivityV2.this.finish();
                        return;
                    }
                    ScanQRCodeActivityV2.this.f104303j.mo83456a(ScanQRCodeActivityV2.this.f104308o, result[0].getType(), result[0].getText(), ScanQRCodeActivityV2.this.f104128f);
                } else if (!(enigmaResult == null || ScanQRCodeActivityV2.this.f104302i == null)) {
                    ScanQRCodeActivityV2.this.f104302i.zoomByRatio(enigmaResult.zoomFactor);
                }
            }
            ScanQRCodeActivityV2.this.f104308o = false;
        }
    };

    /* renamed from: B */
    C2593a f104288B = new C41031c(this);

    /* renamed from: C */
    private C40974f f104289C;

    /* renamed from: D */
    private TextView f104290D;

    /* renamed from: E */
    private boolean f104291E;

    /* renamed from: F */
    private TextView f104292F;

    /* renamed from: G */
    private ImageView f104293G;

    /* renamed from: H */
    private TextView f104294H;

    /* renamed from: I */
    private TextView f104295I;

    /* renamed from: J */
    private TextView f104296J;

    /* renamed from: K */
    private FrameLayout f104297K;

    /* renamed from: L */
    private RelativeLayout f104298L;

    /* renamed from: M */
    private boolean f104299M;

    /* renamed from: g */
    public boolean f104300g;

    /* renamed from: h */
    SurfaceView f104301h;

    /* renamed from: i */
    public IQRCodeScanner f104302i;

    /* renamed from: j */
    public C40999b f104303j;

    /* renamed from: k */
    C40955a f104304k;

    /* renamed from: l */
    public C40946f f104305l;

    /* renamed from: m */
    public C40945e f104306m;

    /* renamed from: n */
    C39948a f104307n;

    /* renamed from: o */
    public boolean f104308o;

    /* renamed from: p */
    public boolean f104309p;

    /* renamed from: q */
    public boolean f104310q;

    /* renamed from: r */
    boolean f104311r;

    /* renamed from: s */
    public boolean f104312s;

    /* renamed from: t */
    public LinearLayout f104313t;

    /* renamed from: u */
    public RemoteImageView f104314u;

    /* renamed from: v */
    public GestureDetector f104315v;

    /* renamed from: w */
    public ScaleGestureDetector f104316w;

    /* renamed from: x */
    public GestureDetector f104317x;

    /* renamed from: y */
    public float f104318y = 1.0f;

    /* renamed from: z */
    C41048b f104319z;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2$a */
    class C41025a extends SimpleOnGestureListener {

        /* renamed from: b */
        private final float f104333b;

        /* renamed from: c */
        private long f104334c;

        private C41025a() {
            this.f104333b = 0.03f;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ScanQRCodeActivityV2.this.f104302i == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f104334c < 500) {
                return false;
            }
            this.f104334c = currentTimeMillis;
            if (ScanQRCodeActivityV2.this.f104318y > 1.0f) {
                while (ScanQRCodeActivityV2.this.f104318y > 1.0f) {
                    ScanQRCodeActivityV2.this.f104318y -= 0.03f;
                    ScanQRCodeActivityV2.this.f104302i.zoomByRatio(ScanQRCodeActivityV2.this.f104318y);
                }
            } else {
                while (ScanQRCodeActivityV2.this.f104318y < 3.0f) {
                    ScanQRCodeActivityV2.this.f104318y += 0.03f;
                    ScanQRCodeActivityV2.this.f104302i.zoomByRatio(ScanQRCodeActivityV2.this.f104318y);
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2$b */
    public interface C41026b {
        /* renamed from: a */
        void mo83536a();
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2$c */
    class C41027c implements OnScaleGestureListener {

        /* renamed from: b */
        private final float f104336b;

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        private C41027c() {
            this.f104336b = 0.05f;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (ScanQRCodeActivityV2.this.f104302i == null || scaleGestureDetector == null) {
                return false;
            }
            if (scaleGestureDetector.getScaleFactor() >= 1.0f && ScanQRCodeActivityV2.this.f104318y <= 3.0f) {
                ScanQRCodeActivityV2.this.f104318y += 0.05f;
            } else if (ScanQRCodeActivityV2.this.f104318y >= 1.0f) {
                ScanQRCodeActivityV2.this.f104318y -= 0.05f;
            }
            ScanQRCodeActivityV2.this.f104302i.zoomByRatio(ScanQRCodeActivityV2.this.f104318y);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2$d */
    class C41028d implements OnGestureListener {
        public final boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        private C41028d() {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ScanQRCodeActivityV2.this.f104302i.processTouchEvent(motionEvent.getX() / ((float) C23724k.m58224b(ScanQRCodeActivityV2.this)), motionEvent.getY() / ((float) C23724k.m58221a(ScanQRCodeActivityV2.this)));
            return true;
        }
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo83491a(boolean z) {
        int b = (int) C9432q.m18687b((Context) this, 21.0f);
        if (z) {
            this.f104124b.setTitle((int) R.string.d_x);
            this.f104124b.getEndText().setVisibility(8);
            this.f104294H.setText(R.string.d8p);
            C23515d.m57668a(this.f104314u, (int) R.drawable.at_);
            this.f104313t.setAlpha(0.0f);
            if (this.f104306m != null && !TextUtils.isEmpty(this.f104306m.f104173b)) {
                this.f104295I.setText(this.f104306m.f104173b);
            }
            this.f104295I.setVisibility(0);
            this.f104295I.setAlpha(0.0f);
            this.f104296J.setVisibility(4);
            this.f104123a.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f104297K, "scaleX", new float[]{1.0f, 1.16f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f104297K, "scaleY", new float[]{1.0f, 1.16f});
            ofFloat.addUpdateListener(new C41035g(this));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f104290D, "translationY", new float[]{0.0f, (float) b});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f104313t, "alpha", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f104295I, "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.play(ofFloat4).with(ofFloat5).after(ofFloat2);
            animatorSet.setDuration(300);
            animatorSet.start();
            return;
        }
        this.f104124b.setTitle((CharSequence) m90657l());
        this.f104124b.getEndText().setVisibility(0);
        this.f104294H.setText(R.string.b9_);
        if (this.f104306m == null || this.f104306m.f104172a == null) {
            C23515d.m57668a(this.f104314u, (int) R.drawable.acu);
        } else {
            C23515d.m57669a(this.f104314u, this.f104306m.f104172a);
        }
        this.f104313t.setAlpha(0.0f);
        this.f104295I.setVisibility(8);
        this.f104296J.setVisibility(0);
        this.f104123a.setVisibility(0);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f104297K, "scaleX", new float[]{1.16f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f104297K, "scaleY", new float[]{1.16f, 1.0f});
        ofFloat6.addUpdateListener(new C41036h(this));
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f104290D, "translationY", new float[]{(float) b, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f104313t, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat6).with(ofFloat7).with(ofFloat8);
        animatorSet2.play(ofFloat9).after(ofFloat7);
        animatorSet2.setDuration(200);
        animatorSet2.start();
    }

    /* renamed from: e */
    public final void mo83495e() {
        this.f104293G.clearAnimation();
    }

    /* renamed from: c */
    public final void mo83493c() {
        C0013i.m16a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.f104302i != null) {
                        ScanQRCodeActivityV2.this.f104302i.stop();
                    }
                }
                return null;
            }
        });
    }

    /* renamed from: i */
    public final void mo83500i() {
        C23727n.m58239a(new C41033e(this), 4000);
    }

    /* renamed from: l */
    private String m90657l() {
        if (this.f104128f != 3) {
            return getString(R.string.d_u);
        }
        return getString(R.string.hbq);
    }

    /* renamed from: m */
    private void m90658m() {
        this.f104303j.mo83458c();
        mo83520j();
        this.f104302i.enableCameraScan(true, this.f104303j.mo83450a());
    }

    /* renamed from: n */
    private void m90659n() {
        if (this.f104302i != null) {
            this.f104302i.closeLight();
        }
        this.f104291E = false;
        this.f104290D.setAlpha(0.8f);
        this.f104290D.setText(R.string.bwh);
    }

    /* renamed from: g */
    public final void mo83498g() {
        if (this.f104125c != null && this.f104125c.isShowing()) {
            this.f104125c.dismiss();
        }
    }

    /* renamed from: h */
    public final void mo83499h() {
        this.f104310q = false;
        this.f104311r = false;
        if (this.f104302i != null) {
            this.f104302i.enableCameraScan(true, this.f104303j.mo83450a());
        }
    }

    /* renamed from: d */
    public final void mo83494d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.f104293G.getHeight()), (float) (this.f104297K.getHeight() - C23728o.m58241a(20.0d)));
        translateAnimation.setDuration(2000);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.f104293G.startAnimation(translateAnimation);
    }

    /* renamed from: f */
    public final void mo83496f() {
        if (this.f104125c == null) {
            this.f104125c = C41047a.m90709a(this, "");
            this.f104125c.setIndeterminate(false);
            return;
        }
        if (!this.f104125c.isShowing()) {
            this.f104125c.show();
            this.f104125c.mo83562a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo83520j() {
        if (this.f104303j == this.f104289C) {
            this.f104302i.setScanListener(this.f104287A);
            MessageCenter.removeListener(this.f104288B);
            return;
        }
        if (this.f104303j == this.f104304k) {
            this.f104302i.setScanListener(null);
            MessageCenter.addListener(this.f104288B);
        }
    }

    /* renamed from: k */
    public final void mo83521k() {
        if (!this.f104299M) {
            C41048b bVar = new C41048b(this, (float) this.f104297K.getLeft(), (float) this.f104297K.getTop(), (float) this.f104297K.getRight(), (float) this.f104297K.getBottom());
            this.f104319z = bVar;
            this.f104298L.addView(this.f104319z, 2);
            this.f104299M = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f104303j != null) {
            this.f104303j.mo83457b();
        }
        if (this.f104307n != null) {
            this.f104307n.mo81848e();
            this.f104307n.f101827c = null;
        }
        this.f104303j = null;
        if (this.f104288B != null) {
            MessageCenter.removeListener(this.f104288B);
        }
        C0013i.m16a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                if (ScanQRCodeActivityV2.this.f104302i != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        if (ScanQRCodeActivityV2.this.f104302i != null) {
                            ScanQRCodeActivityV2.this.f104302i.stop();
                            ScanQRCodeActivityV2.this.f104302i.release();
                            ScanQRCodeActivityV2.this.f104302i.setScanListener(null);
                            ScanQRCodeActivityV2.this.f104302i = null;
                        }
                    }
                }
                return null;
            }
        });
        if (this.f104315v != null) {
            this.f104315v.setOnDoubleTapListener(null);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f104291E) {
            m90659n();
        }
        this.f104301h.setVisibility(4);
        if (this.f104304k != null && this.f104303j == this.f104304k) {
            C40955a aVar = this.f104304k;
            IQRCodeScanner iQRCodeScanner = aVar.f104184f;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.pauseEffectAudio(true);
            }
            aVar.f104179a = null;
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onResume", true);
        C41992b.m91956a(false);
        super.onResume();
        this.f104301h.setVisibility(0);
        if (this.f104304k != null && this.f104303j == this.f104304k) {
            C40955a aVar = this.f104304k;
            IQRCodeScanner iQRCodeScanner = aVar.f104184f;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.pauseEffectAudio(false);
            }
            aVar.mo83453a(aVar.f104181c);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onResume", false);
    }

    public final void bI_() {
        if (this.f104302i == null) {
            mo83518a((C41026b) null);
        }
        this.f104311r = false;
        final C19264d dVar = new C19264d(C11010c.m22280a(), 1);
        final ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        float b = (float) C23724k.m58224b(this);
        float a = (float) C23724k.m58221a(this);
        scanSettings.detectRectLeft = this.f104297K.getX() / b;
        scanSettings.detectRectTop = this.f104297K.getY() / a;
        scanSettings.detectRectWidth = ((float) this.f104297K.getWidth()) / b;
        scanSettings.detectRectHeight = ((float) this.f104297K.getHeight()) / a;
        scanSettings.detectRequirement = this.f104303j.mo83450a();
        scanSettings.buildChainFlag = 1;
        scanSettings.enableDetectRect = true;
        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.f104302i != null && ScanQRCodeActivityV2.this.f104309p) {
                        ScanQRCodeActivityV2.this.f104302i.startScan(ScanQRCodeActivityV2.this, dVar, ScanQRCodeActivityV2.this.f104301h.getHolder(), scanSettings);
                    }
                }
                return null;
            }
        }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Object, Object>() {
            public final Object then(C0013i<Object> iVar) throws Exception {
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.f104302i != null && !ScanQRCodeActivityV2.this.f104309p) {
                        ScanQRCodeActivityV2.this.f104302i.stop();
                    }
                }
                return null;
            }
        }, (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Object, Object>() {
            public final Object then(C0013i<Object> iVar) throws Exception {
                ScanQRCodeActivityV2.this.f104315v = new GestureDetector(ScanQRCodeActivityV2.this, new C41025a());
                ScanQRCodeActivityV2.this.f104316w = new ScaleGestureDetector(ScanQRCodeActivityV2.this, new C41027c());
                ScanQRCodeActivityV2.this.f104317x = new GestureDetector(ScanQRCodeActivityV2.this, new C41028d());
                return null;
            }
        }, C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo83398a() {
        super.mo83398a();
        this.f104300g = getIntent().getBooleanExtra("is_kill_self_after_scan", false);
        this.f104309p = false;
        this.f104301h = (SurfaceView) findViewById(R.id.cva);
        this.f104290D = (TextView) findViewById(R.id.db7);
        this.f104292F = (TextView) findViewById(R.id.d7u);
        this.f104293G = (ImageView) findViewById(R.id.ch7);
        this.f104313t = (LinearLayout) findViewById(R.id.bev);
        this.f104294H = (TextView) findViewById(R.id.d7s);
        this.f104314u = (RemoteImageView) findViewById(R.id.ayx);
        this.f104295I = (TextView) findViewById(R.id.dbs);
        this.f104296J = (TextView) findViewById(R.id.de9);
        this.f104297K = (FrameLayout) findViewById(R.id.ahh);
        this.f104298L = (RelativeLayout) findViewById(R.id.cfl);
        this.f104313t.setOnClickListener(this);
        this.f104124b.getBackBtn().setImageResource(R.drawable.a18);
        this.f104301h.getHolder().addCallback(new Callback() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo83529a() {
                if (ScanQRCodeActivityV2.this.f104303j != null) {
                    ScanQRCodeActivityV2.this.f104302i.enableCameraScan(true, ScanQRCodeActivityV2.this.f104303j.mo83450a());
                } else {
                    ScanQRCodeActivityV2.this.f104302i.enableCameraScan(true, 65536);
                }
                ScanQRCodeActivityV2.this.bI_();
                ScanQRCodeActivityV2.this.mo83494d();
                ScanQRCodeActivityV2.this.mo83521k();
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                synchronized (this) {
                    ScanQRCodeActivityV2.this.f104309p = true;
                }
                if (ScanQRCodeActivityV2.this.f104302i == null) {
                    ScanQRCodeActivityV2.this.mo83518a((C41026b) new C41039k(this));
                } else {
                    mo83529a();
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                ScanQRCodeActivityV2.this.mo83495e();
                synchronized (this) {
                    ScanQRCodeActivityV2.this.f104309p = false;
                }
                if (ScanQRCodeActivityV2.this.f104302i != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        if (ScanQRCodeActivityV2.this.f104302i != null) {
                            ScanQRCodeActivityV2.this.f104302i.stop();
                            ScanQRCodeActivityV2.this.f104302i.release();
                        }
                    }
                }
            }
        });
        this.f104124b.mo19149b(false);
        this.f104124b.getEndText().setTextColor(getResources().getColor(R.color.jf));
        C23729p.m58263b((Activity) this);
        if (VERSION.SDK_INT >= 19) {
            this.f104126d.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo83516a(Boolean bool) {
        if (this.f104303j == null) {
            return null;
        }
        if (bool.booleanValue()) {
            C10691a.m21543b((Context) this, (int) R.string.azh, 0).mo19066a();
            return null;
        }
        this.f104303j = this.f104304k;
        m90658m();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo83519b(String str) {
        ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        scanSettings.buildChainFlag = 1;
        scanSettings.detectModelDir = "";
        this.f104308o = true;
        this.f104302i.startPicScan(str, scanSettings, 1000);
    }

    /* renamed from: a */
    public final void mo83490a(int i) {
        if (this.f104301h != null) {
            this.f104301h.postDelayed(new Runnable() {
                public final void run() {
                    if (!ScanQRCodeActivityV2.this.isFinishing()) {
                        ScanQRCodeActivityV2.this.finish();
                    }
                }
            }, (long) i);
        }
    }

    @C53771m
    public void onNetStateChangeEvent(C26918a aVar) {
        if (isViewValid()) {
            if (C23718g.m58207b().mo49153d()) {
                this.f104292F.setVisibility(8);
                this.f104312s = true;
                return;
            }
            this.f104292F.setVisibility(0);
            this.f104312s = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f104315v != null && this.f104315v.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f104317x != null && this.f104317x.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f104316w == null || !this.f104316w.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        super.onClick(view);
        int id = view.getId();
        if (id != R.id.db7) {
            if (id == R.id.bev) {
                if (this.f104303j == this.f104289C) {
                    this.f104304k.mo83454a((C52671b<? super Boolean, C52860x>) new C41034f<Object,C52860x>(this));
                } else if (this.f104303j == this.f104304k) {
                    IQRCodeScanner iQRCodeScanner = this.f104304k.f104184f;
                    if (iQRCodeScanner != null) {
                        iQRCodeScanner.switchEffectWithTag("", 0, 0, "");
                    }
                    this.f104303j = this.f104289C;
                    m90658m();
                }
                if (this.f104291E) {
                    m90659n();
                }
            }
        } else if (this.f104291E) {
            m90659n();
        } else {
            if (this.f104302i != null) {
                this.f104302i.openLight();
            }
            this.f104291E = true;
            this.f104290D.setAlpha(1.0f);
            this.f104290D.setText(R.string.bwg);
        }
    }

    /* renamed from: a */
    public final void mo83399a(Bundle bundle) {
        String str;
        String str2;
        super.mo83399a(bundle);
        this.f104123a.setOnClickListener(this);
        TextView textView = this.f104123a;
        if (this.f104128f != 3) {
            str = getString(R.string.cfd);
        } else {
            str = getString(R.string.gws);
        }
        textView.setText(str);
        this.f104124b.setTitle((CharSequence) m90657l());
        TextTitleBar textTitleBar = this.f104124b;
        if (this.f104128f != 3) {
            str2 = getString(R.string.fm);
        } else {
            str2 = getString(R.string.hv8);
        }
        textTitleBar.setEndText((CharSequence) str2);
        this.f104124b.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                ScanQRCodeActivityV2.this.finish();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                if (ScanQRCodeActivityV2.this.f104128f != 3) {
                    ScanQRCodeActivityV2.this.f104307n.mo81846b(2);
                    return;
                }
                C41302w.m91042a().mo83861a(C10193n.m20607a().mo18203a(CouponVerificationListSettings.class, "coupon_verification_list", C10181b.m20511a().mo18175c().getCouponVerificationList(), "https://aweme.snssdk.com/coupon/aweme/Verification?hide_nav_bar=1"));
            }
        });
        mo83518a((C41026b) null);
        this.f104289C = new C40974f(this, this);
        C40974f fVar = this.f104289C;
        fVar.f104219i = new ArrayList();
        C409751 r2 = new C40923a() {
            /* renamed from: a */
            public final boolean mo83411a(int i, String str, String str2, int i2, Map<String, Object> map) {
                return C40974f.this.mo83474a(C40974f.this.f104211a, i, str, str2, "scan", i2, map);
            }
        };
        if (C47404a.m102782a()) {
            fVar.f104219i.add(new C40925c(r2));
        }
        fVar.f104219i.add(new C40933g(r2));
        fVar.f104219i.add(new C40924b(r2));
        fVar.f104219i.add(new C40932f(r2));
        fVar.f104219i.add(new C40934h(r2));
        fVar.f104219i.add(new C40935i(r2));
        fVar.f104220j = new ArrayList();
        fVar.f104220j.add(new C40936j());
        fVar.f104220j.add(new C40931e(r2));
        fVar.f104220j.add(new C40937k(fVar.f104211a));
        this.f104304k = new C40955a(this, this);
        if (this.f104302i != null) {
            this.f104304k.mo83452a(this.f104302i);
        }
        this.f104303j = this.f104289C;
        this.f104303j.mo83458c();
        this.f104307n = new C39948a();
        this.f104307n.f101827c = this;
        this.f104307n.mo80925b(this, null);
        this.f104290D.setOnClickListener(this);
        if (C23718g.m58207b().mo49153d()) {
            this.f104292F.setVisibility(8);
            this.f104312s = true;
        } else {
            this.f104312s = false;
        }
        if (this.f104128f != 3) {
            this.f104305l = new C40946f();
            this.f104305l.addNotifyListener(new C26874f() {
                /* renamed from: c_ */
                public final void mo44840c_(Exception exc) {
                }

                /* renamed from: b */
                public final void mo44838b() {
                    ScanQRCodeActivityV2.this.f104306m = (C40945e) ScanQRCodeActivityV2.this.f104305l.mData;
                    if (ScanQRCodeActivityV2.this.f104306m != null && ScanQRCodeActivityV2.this.f104306m.status_code == 0 && !TimeLockRuler.isTeenModeON()) {
                        ScanQRCodeActivityV2.this.f104313t.setVisibility(0);
                        if (ScanQRCodeActivityV2.this.f104306m.f104172a == null) {
                            C23515d.m57668a(ScanQRCodeActivityV2.this.f104314u, (int) R.drawable.acu);
                        } else {
                            C23515d.m57669a(ScanQRCodeActivityV2.this.f104314u, ScanQRCodeActivityV2.this.f104306m.f104172a);
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from", "qr_code_scan");
                        C26890h.m65011a("show_variable_entrance", (Map<String, String>) hashMap);
                    }
                }
            });
            this.f104305l.mo83434a();
        }
        MessageCenter.init();
    }

    /* renamed from: a */
    public final void mo83518a(C41026b bVar) {
        this.f104310q = false;
        this.f104311r = false;
        AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().cameraService().getScanner(C10181b.m20511a().mo18172a(QRCodeABManager.class, true, "update_enigma_scanner", 31744, false), this, this.f104301h.getHolder(), new C41032d(this, bVar));
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        if (this.f104302i == null) {
            mo83518a((C41026b) new C41037i(this, str));
        } else {
            mo83519b(str);
        }
    }

    /* renamed from: a */
    public static void m90656a(Context context, int i) {
        Intent intent = new Intent(context, ScanQRCodeActivityV2.class);
        intent.putExtra("scan_page_from", i);
        context.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f104303j != null) {
            this.f104303j.mo83451a(i, i2, intent);
        }
        if (!this.f104307n.mo80923a(i, i2, intent)) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo83517a(int i, int i2, int i3, String str) {
        long j = (long) i;
        boolean z = true;
        if (j == 53) {
            if (this.f104304k != null) {
                C40955a aVar = this.f104304k;
                C52711k.m112240b(str, "effectId");
                if (i2 == 2) {
                    aVar.mo83453a(aVar.f104181c);
                } else {
                    if (i2 == 1) {
                        Map map = aVar.f104182d;
                        if (map != null && !map.isEmpty()) {
                            z = false;
                        }
                        if (!z) {
                            HashMap<String, Effect> hashMap = aVar.f104182d;
                            if (hashMap == null) {
                                C52711k.m112234a();
                            }
                            aVar.mo83453a((Effect) hashMap.get(str));
                        }
                    }
                }
            }
        } else if (j == 26 && this.f104306m != null && !C9376b.m18558a((Collection<T>) this.f104306m.f104174c) && this.f104306m.f104174c.contains(str) && !this.f104311r && this.f104312s && this.f104303j != null) {
            this.f104303j.mo83456a(this.f104308o, i, str, this.f104128f);
            this.f104311r = true;
        }
    }
}

package com.bytedance.android.live.broadcast.preview;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p030v4.view.p042b.C1024c;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.effect.C3197a;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3366v;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
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
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f.C8684a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;
import java.io.FileNotFoundException;
import java.util.HashMap;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.bm */
public final class C3550bm extends C3846a implements C8684a {

    /* renamed from: m */
    private static int f10105m = 720;

    /* renamed from: n */
    private static int f10106n = 1280;

    /* renamed from: a */
    public C3413a f10107a;

    /* renamed from: b */
    public View f10108b;

    /* renamed from: c */
    public C3261l f10109c;

    /* renamed from: d */
    public C3197a f10110d;

    /* renamed from: e */
    public C3417d f10111e;

    /* renamed from: f */
    public GestureDetector f10112f;

    /* renamed from: g */
    C8682e f10113g;

    /* renamed from: h */
    public int f10114h = 1;

    /* renamed from: i */
    public boolean f10115i;

    /* renamed from: j */
    boolean f10116j;

    /* renamed from: k */
    public C1690c f10117k;

    /* renamed from: l */
    C8681d f10118l = new C8681d() {
        /* renamed from: a */
        public final void mo8945a(boolean z) {
        }

        /* renamed from: b */
        public final void mo8946b() {
        }

        /* renamed from: a */
        public final void mo8942a() {
            C3550bm.this.getActivity().finish();
        }

        /* renamed from: a */
        public final int mo8940a(String[] strArr) {
            if (C3550bm.this.f10111e != null) {
                C3550bm.this.f10111e.mo8792a(strArr);
            }
            return 0;
        }

        /* renamed from: b */
        public final void mo8947b(float f) {
            if (C3550bm.this.f10110d != null) {
                C3550bm.this.f10110d.mo8538a(f);
            }
        }

        /* renamed from: c */
        public final void mo8949c(float f) {
            if (C3550bm.this.f10110d != null) {
                C3550bm.this.f10110d.mo8540b(f);
            }
        }

        /* renamed from: d */
        public final void mo8950d(float f) {
            if (C3550bm.this.f10110d != null) {
                C3550bm.this.f10110d.mo8541c(f);
            }
        }

        /* renamed from: a */
        public final int mo8938a(String str) {
            try {
                if (C3550bm.this.f10111e != null) {
                    C3550bm.this.f10111e.mo8790a(str, false);
                }
                return 0;
            } catch (FileNotFoundException e) {
                C3831a.m9714b("StartLivePreviewFragment", (Throwable) e);
                return -1;
            }
        }

        /* renamed from: b */
        public final void mo8948b(int i) {
            boolean z;
            if (C3550bm.this.f10110d != null && C3550bm.this.f10109c != null) {
                int b = C3550bm.this.f10109c.mo8593b();
                float a = C3261l.m8929a(C3266p.m8943a().f9434b, i);
                if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
                    if (!C9414h.m18630a(C3266p.m8943a().f9434b) && i >= 0 && i < C3266p.m8943a().f9434b.size()) {
                        C8688c b2 = C3395f.m9156f().mo8741b().mo8551a().mo8649b(C3287f.m9014a("beautyTag", (FilterModel) C3266p.m8943a().f9434b.get(i)));
                        if (!(b2 == null || b2.f23749j == null)) {
                            C3040c a2 = C3395f.m9156f().mo8740a();
                            a2.mo8268a(C3037b.f8916d, b2);
                            Float c = a2.mo8275c(b2.f23749j.f23764b);
                            if (c == null) {
                                c = Float.valueOf(C3366v.m9114a(b2, b2.f23749j.f23763a));
                            }
                            int i2 = (int) a;
                            if (c.floatValue() > C3366v.m9114a(b2, i2)) {
                                a2.mo8267a(b2.f23749j.f23764b, C3366v.m9114a(b2, i2));
                            }
                        }
                    }
                } else if (C3550bm.this.f10110d.f9268d > (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * a) / 100.0f) {
                    C3550bm.this.f10110d.mo8542d(a / 100.0f);
                }
                C3550bm.this.f10109c.mo8588a(i);
                C3550bm bmVar = C3550bm.this;
                if (i < b) {
                    z = true;
                } else {
                    z = false;
                }
                bmVar.mo8934a(z);
            }
        }

        /* renamed from: a */
        public final void mo8943a(float f) {
            if (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a != 0.0f && C3550bm.this.f10110d != null) {
                C3550bm.this.f10110d.mo8542d(f / ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a);
            }
        }

        /* renamed from: a */
        public final void mo8944a(int i) {
            if (i != C3550bm.this.f10114h) {
                C3550bm.this.f10114h = i;
                if (C3550bm.this.f10107a != null) {
                    C3550bm.this.f10107a.mo8762b();
                }
            }
        }

        /* renamed from: a */
        public final int mo8941a(String[] strArr, String[] strArr2) {
            if (C3550bm.this.f10111e != null) {
                C3550bm.this.f10111e.mo8793a(strArr, strArr2);
            }
            return 0;
        }

        /* renamed from: a */
        public final int mo8939a(String str, String str2, float f) {
            try {
                if (C3550bm.this.f10111e != null) {
                    C3550bm.this.f10111e.mo8788a(str, str2, f);
                }
                return 0;
            } catch (FileNotFoundException e) {
                C3831a.m9714b("StartLivePreviewFragment", (Throwable) e);
                return -1;
            }
        }
    };

    /* renamed from: o */
    private SurfaceView f10119o;

    /* renamed from: p */
    private C3048a f10120p;

    /* renamed from: q */
    private TextView f10121q;

    /* renamed from: r */
    private AnimationSet f10122r;

    /* renamed from: s */
    private AnimationSet f10123s;

    /* renamed from: t */
    private int f10124t;

    /* renamed from: u */
    private GestureDetectLayout f10125u;

    /* renamed from: v */
    private OnTouchListener f10126v = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C3550bm.this.f10112f.onTouchEvent(motionEvent);
            return false;
        }
    };

    /* renamed from: com.bytedance.android.live.broadcast.preview.bm$a */
    final class C3555a extends SimpleOnGestureListener {
        private C3555a() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = false;
            if (motionEvent == null || motionEvent2 == null) {
                return false;
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) <= 200.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (x > 0.0f) {
                z = true;
            }
            if (C3550bm.this.f10109c != null) {
                if (z) {
                    C3550bm.this.f10109c.mo8594b("live_take_page", new HashMap());
                } else {
                    C3550bm.this.f10109c.mo8591a("live_take_page", new HashMap<>());
                }
                C3550bm.this.mo8934a(z);
            }
            return true;
        }
    }

    public final void onPause() {
        if (this.f10113g != null) {
            this.f10113g.mo8912m();
        }
        if (this.f10120p != null) {
            this.f10120p.mo8304c();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        if (this.f10120p != null) {
            this.f10120p.mo8303b();
        }
        if (this.f10113g == null) {
            this.f10116j = true;
        } else {
            this.f10113g.mo8911k();
        }
    }

    /* renamed from: a */
    public final void mo8933a() {
        if (this.f10107a != null) {
            this.f10107a.mo8757a();
            this.f10107a = null;
        }
        if (this.f10109c != null) {
            this.f10109c.mo8597e();
        }
        if (this.f10120p != null) {
            this.f10120p.mo8304c();
            this.f10120p.mo8305d();
            this.f10120p = null;
        }
        getActivity().finish();
    }

    public final void onDestroy() {
        if (this.f10107a != null) {
            this.f10107a.mo8757a();
            this.f10107a = null;
        }
        if (this.f10109c != null) {
            this.f10109c.mo8597e();
        }
        if (this.f10117k != null && !this.f10117k.isDisposed()) {
            this.f10117k.dispose();
        }
        if (this.f10120p != null) {
            this.f10120p.mo8305d();
            this.f10120p = null;
        }
        ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).startLiveManager().mo8932b(this);
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo8934a(boolean z) {
        String str = "";
        if (this.f10109c != null) {
            str = this.f10109c.mo8596d();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f10121q.setText(str);
            if (z) {
                if (this.f10122r == null) {
                    this.f10122r = m9369b(true);
                } else {
                    this.f10108b.clearAnimation();
                }
                this.f10108b.startAnimation(this.f10122r);
                return;
            }
            if (this.f10123s == null) {
                this.f10123s = m9369b(false);
            } else {
                this.f10108b.clearAnimation();
            }
            this.f10108b.startAnimation(this.f10123s);
        }
    }

    /* renamed from: b */
    private AnimationSet m9369b(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = (this.f10124t - this.f10121q.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C1024c());
        alphaAnimation.setDuration(300);
        if (z) {
            f = (float) (-width);
        } else {
            f = (float) width;
        }
        float f6 = 50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C1024c());
        translateAnimation.setDuration(300);
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        if (z) {
            f4 = 50.0f;
        } else {
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new C1023b());
        alphaAnimation2.setDuration(300);
        if (!z) {
            f6 = -50.0f;
        }
        if (z) {
            f5 = (float) width;
        } else {
            f5 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new C1023b());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                C3550bm.this.f10108b.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                C3550bm.this.f10108b.setVisibility(0);
            }
        });
        return animationSet;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null && C9431p.m18665a(intent.getStringExtra("orientation"), "landscape")) {
                activity.setRequestedOrientation(0);
            }
        }
        this.f10124t = C3922z.m9910c();
        this.f10108b = getView().findViewById(R.id.afk);
        this.f10125u = (GestureDetectLayout) getView().findViewById(R.id.bw_);
        this.f10119o = (SurfaceView) getView().findViewById(R.id.cvd);
        this.f10121q = (TextView) getView().findViewById(R.id.afl);
        if (((Integer) C4525b.f12433g.mo10347b()).intValue() == 0) {
            i = 2;
        } else {
            i = 1;
        }
        this.f10114h = i;
        C3617q.INST.getModelFilePath();
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            Intent intent2 = activity2.getIntent();
            if (intent2 == null || !C9431p.m18665a(intent2.getStringExtra("orientation"), "landscape")) {
                f10105m = 720;
                f10106n = 1280;
            } else {
                f10105m = 1280;
                f10106n = 720;
            }
        }
        C3442a a = new C3442a(getContext()).mo8827a(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).mo8823a((C3439a) new C3165d()).mo8824a((C3440b) new C3166e()).mo8825a((C3443a) new C3164c()).mo8840j(i).mo8833c(C3617q.INST.getModelFilePath()).mo8826a((Object) C3617q.INST.getResourceFinder(getContext())).mo8821a(f10105m, f10106n);
        a.f9849r = 0;
        this.f10120p = new C3430b(a.mo8829a());
        this.f10107a = new C3419b(this.f10119o, this.f10120p);
        this.f10107a.mo8759a((C3421a) new C3421a() {
            /* renamed from: a */
            public final void mo8798a(int i, int i2, String str) {
            }

            /* renamed from: b */
            public final void mo8799b(int i, int i2, String str) {
                if (!C3550bm.this.f10115i) {
                    C3550bm.this.f10117k = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3556bn<Object>(this), C3557bo.f10133a);
                }
            }
        });
        this.f10112f = new GestureDetector(getActivity(), new C3555a());
        this.f10125u.mo14708a(this.f10126v);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.agi, viewGroup, false);
    }
}

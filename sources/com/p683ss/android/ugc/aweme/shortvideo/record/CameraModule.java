package com.p683ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.util.SparseIntArray;
import android.view.View;
import com.C2240a;
import com.bytedance.als.C2762f;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ugc.asve.p1241e.C20391c;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.recorder.camera.p1246a.C20455b;
import com.p683ss.android.ugc.asve.recorder.camera.p1248c.C20469d;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43874d;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43875e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45457u;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModule */
public class CameraModule implements C0183j, C20463c {

    /* renamed from: i */
    public static SparseIntArray f112399i;

    /* renamed from: a */
    public final AppCompatActivity f112400a;

    /* renamed from: b */
    public final C44435a f112401b;

    /* renamed from: c */
    public C43874d f112402c = new C43875e();

    /* renamed from: d */
    public boolean f112403d = false;

    /* renamed from: e */
    public C20455b f112404e;

    /* renamed from: f */
    public ASCameraView f112405f;

    /* renamed from: g */
    public final C45004a f112406g;

    /* renamed from: h */
    public int f112407h;

    /* renamed from: j */
    private final C23524d<JSONObject> f112408j;

    /* renamed from: k */
    private boolean f112409k = false;

    /* renamed from: l */
    private boolean f112410l = false;

    /* renamed from: m */
    private boolean f112411m = false;

    /* renamed from: n */
    private C19358a f112412n = new C19358a() {
        /* renamed from: b */
        public final void mo40235b(int i, int i2) {
            CameraModule.this.f112401b.mo90320a(i, i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModule$a */
    public interface C44435a {
        /* renamed from: a */
        void mo90319a(int i);

        /* renamed from: a */
        void mo90320a(int i, int i2);

        /* renamed from: a */
        void mo90321a(int i, int i2, String str);

        /* renamed from: b */
        void mo90322b(int i);
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        mo90309a(0);
    }

    /* renamed from: b */
    public final C20469d mo90312b() {
        return this.f112405f.getCameraController().mo43372i();
    }

    /* renamed from: d */
    public boolean mo90314d() {
        if (this.f112405f.mo43636c()) {
            return false;
        }
        if (!this.f112409k) {
            C10691a.m21543b((Context) this.f112400a, (int) R.string.ffe, 1).mo19066a();
            this.f112409k = true;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo90315e() {
        C20420b bVar = this.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43352a(0.0f);
        mo90308a(0.0f);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f112399i = sparseIntArray;
        sparseIntArray.put(0, R.drawable.ak9);
        f112399i.put(1, R.drawable.ak_);
        f112399i.put(2, R.drawable.ak_);
        f112399i.put(3, R.drawable.ak8);
    }

    /* renamed from: f */
    public final int mo90316f() {
        Intent intent = this.f112400a.getIntent();
        if (intent == null || !intent.hasExtra("extra_camera_facing")) {
            return this.f112402c.mo89428a();
        }
        int a = this.f112402c.mo89429a(intent.getIntExtra("extra_camera_facing", 1));
        intent.removeExtra("extra_camera_facing");
        this.f112402c.mo89430b(a);
        return a;
    }

    /* renamed from: c */
    public void mo90313c() {
        switch (this.f112407h) {
            case 0:
                if (!this.f112405f.mo43634b() && !this.f112411m) {
                    this.f112411m = true;
                    C10691a.m21543b((Context) this.f112400a, (int) R.string.w7, 1).mo19066a();
                    return;
                }
            case 1:
                if (!this.f112405f.mo43634b() && !this.f112410l) {
                    this.f112410l = true;
                    C10691a.m21543b((Context) this.f112400a, (int) R.string.w7, 1).mo19066a();
                    break;
                }
        }
    }

    /* renamed from: g */
    public final int mo90317g() {
        int i;
        C45412b.m98979a().start("av_video_record_change_camera", "switchFrontRearCamera");
        final boolean z = true;
        this.f112402c.mo89430b(this.f112402c.mo89428a() ^ 1);
        if (mo90316f() != 0) {
            z = false;
        }
        if (z) {
            i = this.f112405f.getBackCameraPos();
        } else {
            i = this.f112405f.getFrontCameraPos();
        }
        C20455b bVar = this.f112404e;
        boolean z2 = !z;
        if (bVar.mo43400a() && VERSION.SDK_INT >= 23) {
            if (z2) {
                bVar.f56091g.mo43363c(false);
            } else {
                bVar.f56091g.mo43363c(C20455b.m50914a(bVar.f56089e, bVar.f56087a));
            }
        }
        try {
            final C17429o b = C17429o.m42675b();
            ASCameraView aSCameraView = this.f112405f;
            C444332 r4 = new C19263c() {
                /* renamed from: a */
                private void m97251a() {
                    C2762f l = CameraModule.this.f112406g.mo91365l();
                    if (l.mo7348a() != null && !((Boolean) l.mo7348a()).booleanValue()) {
                        CameraModule.this.f112406g.mo91355b(true);
                    }
                }

                /* renamed from: a */
                public final void mo39670a(int i) {
                    String str;
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) CameraModule.this.f112400a).mo359a(ShortVideoContextViewModel.class)).f107134a;
                    if (shortVideoContext != null && b.f48964a) {
                        b.mo33756d();
                        String a = C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(b.mo33754a(TimeUnit.MILLISECONDS))});
                        C47702b bVar = C47702b.f120193a;
                        String str2 = "flip_camera";
                        C42438az a2 = C42438az.m93209a().mo86526a("creation_id", shortVideoContext.f107131x).mo86526a("shoot_way", shortVideoContext.f107132y).mo86523a("draft_id", shortVideoContext.f107022A);
                        String str3 = "to_status";
                        if (CameraModule.this.mo90316f() == 0) {
                            str = "front";
                        } else {
                            str = "back";
                        }
                        bVar.mo94984a(str2, a2.mo86526a(str3, str).mo86526a("enter_from", "video_shoot_page").mo86526a("camera_type", C45457u.m99057a(i)).mo86526a("duration", a).f107329a);
                    }
                    CameraModule.this.f112402c.mo89430b(CameraModule.this.mo90316f());
                    C39618d.f101180u.mo74211b(!z);
                    CameraModule.this.f112405f.setPreviewSizeRatio((((float) CameraModule.this.f112405f.getCameraPreviewWidth()) * 1.0f) / ((float) CameraModule.this.f112405f.getCameraPreviewHeight()));
                    CameraModule.this.f112401b.mo90322b(CameraModule.this.mo90316f());
                    C23569o.m57776a("aweme_open_camera_error_rate", 0, new C42437ay().mo86517a("useVERecoder", Boolean.valueOf(true)).mo86522b());
                    CameraModule.this.f112407h = i;
                    C45412b.m98979a().step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
                    m97251a();
                }

                /* renamed from: a */
                public final void mo39671a(int i, int i2, String str) {
                    b.mo33757e();
                    m97251a();
                    C23569o.m57776a("aweme_open_camera_error_rate", i2, new C42437ay().mo86517a("useVERecoder", Boolean.valueOf(true)).mo86521a("errorDesc", str).mo86522b());
                }
            };
            C20420b bVar2 = aSCameraView.f56318e;
            if (bVar2 == null) {
                C52711k.m112237a("recorder");
            }
            bVar2.mo43253b().mo43341a(i, (C19263c) r4);
        } catch (Exception unused) {
        }
        this.f112405f.setOnFirstFrameRefreshListener(new C44454d(this));
        return i;
    }

    /* renamed from: a */
    public final void mo90307a() {
        final boolean z;
        int i;
        C20420b bVar = this.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43376m();
        this.f112405f.setCameraPreviewSizeInterface(this.f112412n);
        ASCameraView aSCameraView = this.f112405f;
        C52711k.m112240b(this, "zoomListener");
        C20420b bVar2 = aSCameraView.f56318e;
        if (bVar2 == null) {
            C52711k.m112237a("recorder");
        }
        bVar2.mo43253b().mo43346a((C20463c) this);
        boolean z2 = true;
        if (mo90316f() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.f112405f.getBackCameraPos();
        } else {
            i = this.f112405f.getFrontCameraPos();
        }
        C20455b bVar3 = this.f112404e;
        if (!bVar3.mo43400a() || VERSION.SDK_INT < 23) {
            C20391c.m50589a(bVar3.f56089e).mo43224b(2);
            C20455b.f56085c = false;
            C20455b.f56086d = false;
        } else {
            boolean a = C20455b.m50914a(bVar3.f56089e, bVar3.f56087a);
            C20455b.f56085c = a;
            C20455b.f56086d = a;
            C20457b bVar4 = bVar3.f56091g;
            if (!a || !z) {
                z2 = false;
            }
            bVar4.mo43363c(z2);
        }
        C45407ay.m98968a("CameraModule => open camera");
        this.f112405f.mo43626a(i, (C19263c) new C19263c() {
            /* renamed from: a */
            public final void mo39670a(int i) {
                C45407ay.m98968a("CameraModule => onOpenSuccess");
                C45412b.m98979a().step("av_video_record_init", "camera open success");
                C39618d.f101180u.mo74211b(!z);
                CameraModule.this.f112401b.mo90319a(CameraModule.this.mo90316f());
                if (i == 2) {
                    C39618d.f101151O.mo83113a(C40796a.RecordUseSuccessCameraType, 1);
                } else {
                    C39618d.f101151O.mo83113a(C40796a.RecordUseSuccessCameraType, 0);
                }
                C23569o.m57776a("aweme_open_camera_error_rate", 0, new C42437ay().mo86517a("useVERecoder", Boolean.valueOf(true)).mo86522b());
                CameraModule.this.f112407h = i;
                ASCameraView aSCameraView = CameraModule.this.f112405f;
                boolean a = C39618d.f101152P.mo83103a(C40790a.EnableSoftEncodeAcc);
                C20420b bVar = aSCameraView.f56318e;
                if (bVar == null) {
                    C52711k.m112237a("recorder");
                }
                bVar.mo43257e().mo43307b(a);
            }

            /* renamed from: a */
            public final void mo39671a(int i, int i2, String str) {
                CameraModule.this.f112401b.mo90321a(i, i2, str);
                C23569o.m57776a("aweme_open_camera_error_rate", i2, new C42437ay().mo86517a("useVERecoder", Boolean.valueOf(true)).mo86521a("errorDesc", str).mo86522b());
            }
        });
    }

    /* renamed from: a */
    public final void mo90309a(int i) {
        this.f112405f.mo43623a(i);
    }

    /* renamed from: a */
    public final void mo90308a(float f) {
        this.f112409k = false;
        this.f112403d = false;
        C20420b bVar = this.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43389v();
    }

    /* renamed from: a */
    public final synchronized void mo90310a(boolean z) {
        C20420b bVar = this.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43358b(false);
    }

    /* renamed from: a */
    public final void mo43414a(int i, float f, boolean z) {
        StringBuilder sb = new StringBuilder(" size = ");
        sb.append(f);
        C23569o.m57779a("zoom_info_log", new C42437ay().mo86521a("camera_zoom_size", sb.toString()).mo86522b());
    }

    /* renamed from: a */
    public final boolean mo90311a(View view, float f, float f2) {
        ASCameraView aSCameraView = this.f112405f;
        int width = view.getWidth();
        int height = view.getHeight();
        float f3 = this.f112400a.getResources().getDisplayMetrics().density;
        float[] fArr = {f, f2};
        C52711k.m112240b(fArr, "points");
        C20420b bVar = aSCameraView.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43353a(width, height, f3, fArr);
    }

    public CameraModule(AppCompatActivity appCompatActivity, C44435a aVar, C23524d<JSONObject> dVar, ASCameraView aSCameraView, C45004a aVar2) {
        this.f112400a = appCompatActivity;
        this.f112405f = aSCameraView;
        this.f112401b = aVar;
        this.f112408j = dVar;
        this.f112406g = aVar2;
        this.f112404e = new C20455b(appCompatActivity, aSCameraView.getCameraController(), C39618d.f101151O.mo83118b(C40796a.ShakeFreeWhiteList));
    }

    /* renamed from: a */
    public final void mo43415a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        String str2 = "zoom_info_log";
        C42437ay a = new C42437ay().mo86519a("cameraType", Integer.valueOf(i)).mo86517a("supportZoom", Boolean.valueOf(z)).mo86517a("supportSmooth", Boolean.valueOf(z2)).mo86518a("maxZoom", Float.valueOf(f));
        String str3 = "ratios";
        if (C9414h.m18631b(list)) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0));
            str = sb.toString();
        } else {
            str = " ";
        }
        C23569o.m57779a(str2, a.mo86521a(str3, str).mo86522b());
    }
}

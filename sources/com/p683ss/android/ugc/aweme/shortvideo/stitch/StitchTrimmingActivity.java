package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12921h;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12930k;
import com.p683ss.android.ugc.aweme.adaptation.BaseScreenAdaptActivity;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42734ad;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.gamora.editor.EditCornerViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.UUID;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity */
public final class StitchTrimmingActivity extends BaseScreenAdaptActivity {

    /* renamed from: c */
    public static boolean f113226c = true;

    /* renamed from: d */
    public static final C44724a f113227d = new C44724a(null);

    /* renamed from: b */
    public C44739g f113228b;

    /* renamed from: e */
    private CutVideoViewModel f113229e;

    /* renamed from: f */
    private EditCornerViewModel f113230f;

    /* renamed from: g */
    private String f113231g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity$a */
    public static final class C44724a {
        private C44724a() {
        }

        public /* synthetic */ C44724a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity$b */
    static final class C44725b implements C12930k {

        /* renamed from: a */
        final /* synthetic */ StitchTrimmingActivity f113232a;

        C44725b(StitchTrimmingActivity stitchTrimmingActivity) {
            this.f113232a = stitchTrimmingActivity;
        }

        /* renamed from: a */
        public final C12924i mo24488a(ClassLoader classLoader, String str, Bundle bundle) {
            C52711k.m112240b(classLoader, "<anonymous parameter 0>");
            C52711k.m112240b(str, "className");
            if (!C52711k.m112239a((Object) C44739g.class.getName(), (Object) str)) {
                return null;
            }
            C44739g gVar = this.f113232a.f113228b;
            if (gVar == null) {
                C52711k.m112237a("mRootScene");
            }
            return gVar;
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onResume() {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", true);
        super.onResume();
        String str2 = this.f113231g;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = f113226c;
        C52711k.m112240b(str2, "creationId");
        String str3 = "enter_video_stitch_page";
        C23089d a = C23089d.m56640a().mo47829a("shoot_way", "stitch").mo47829a("enter_from", "video_stitch_page").mo47829a("creation_id", str2).mo47829a("content_source", "shoot").mo47829a("content_type", "video");
        String str4 = "enter_method";
        if (z) {
            str = C31483a.f82385b;
        } else {
            str = "back";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str).f61491a);
        f113226c = false;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", false);
    }

    /* renamed from: b */
    public final void mo46740b() {
        CutVideoViewModel cutVideoViewModel = this.f113229e;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            C44739g gVar = this.f113228b;
            if (gVar == null) {
                C52711k.m112237a("mRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = gVar.f113264p;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (!cutVideoViewModel2.mo87178g()) {
                VideoEditViewModel videoEditViewModel = gVar.f113266r;
                if (videoEditViewModel == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int i = ((VideoSegment) videoEditViewModel.mo87634l().get(0)).f107908g;
                VideoEditViewModel videoEditViewModel2 = gVar.f113266r;
                if (videoEditViewModel2 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int min = Math.min(i, ((VideoSegment) videoEditViewModel2.mo87634l().get(0)).f107909h);
                VideoEditViewModel videoEditViewModel3 = gVar.f113266r;
                if (videoEditViewModel3 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int i2 = ((VideoSegment) videoEditViewModel3.mo87634l().get(0)).f107908g;
                VideoEditViewModel videoEditViewModel4 = gVar.f113266r;
                if (videoEditViewModel4 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int max = Math.max(i2, ((VideoSegment) videoEditViewModel4.mo87634l().get(0)).f107909h);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = gVar.f113265q;
                if (cutVideoPreviewViewModel == null) {
                    C52711k.m112237a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo87112a(min, max);
            }
        }
    }

    /* renamed from: a */
    public final void mo46739a(boolean z) {
        int i;
        CutVideoViewModel cutVideoViewModel = this.f113229e;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            EditCornerViewModel editCornerViewModel = this.f113230f;
            if (editCornerViewModel == null) {
                C52711k.m112237a("cornerViewModel");
            }
            if (z) {
                i = C43303dy.m94972c(this);
            } else {
                i = 0;
            }
            editCornerViewModel.mo96809a(i);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CutVideoViewModel cutVideoViewModel = this.f113229e;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87183l() && bundle != null) {
            String str = "workspace";
            CutVideoViewModel cutVideoViewModel2 = this.f113229e;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            bundle.putParcelable(str, cutVideoViewModel2.mo87177f().f108068k);
        }
    }

    /* renamed from: b */
    public final void mo46741b(boolean z) {
        int i;
        int i2;
        CutVideoViewModel cutVideoViewModel = this.f113229e;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            C44739g gVar = this.f113228b;
            if (gVar == null) {
                C52711k.m112237a("mRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = gVar.f113264p;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            int i3 = 0;
            if (!cutVideoViewModel2.mo87178g()) {
                C44735f J = gVar.mo90837J();
                int c = C22452a.m55497c();
                View view = J.mo90834J().f33834b;
                C52711k.m112236a((Object) view, "bottomBarScene.view");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    if (z) {
                        i = c;
                    } else {
                        i = (int) C9432q.m18687b((Context) J.f33840g_, 132.0f);
                    }
                    marginLayoutParams.height = i;
                    View view2 = J.mo90834J().f33834b;
                    C52711k.m112236a((Object) view2, "bottomBarScene.view");
                    view2.setLayoutParams(marginLayoutParams);
                    View view3 = J.mo90835K().f33834b;
                    C52711k.m112236a((Object) view3, "videoEditScene.view");
                    LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 != null) {
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                        if (z) {
                            i2 = (int) (C9432q.m18687b((Context) J.f33840g_, 5.5f) + ((float) c));
                        } else {
                            i2 = 0;
                        }
                        marginLayoutParams2.bottomMargin = i2;
                        View view4 = J.mo90835K().f33834b;
                        C52711k.m112236a((Object) view4, "videoEditScene.view");
                        view4.setLayoutParams(marginLayoutParams2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            EditCornerViewModel editCornerViewModel = this.f113230f;
            if (editCornerViewModel == null) {
                C52711k.m112237a("cornerViewModel");
            }
            if (z) {
                i3 = C22452a.m55497c();
            }
            editCornerViewModel.mo96811b(i3);
        }
    }

    public final void onCreate(Bundle bundle) {
        Workspace workspace;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", true);
        super.onCreate(bundle);
        C39629l.m88232a().mo58586q();
        setContentView((int) R.layout.axj);
        if (!getIntent().hasExtra("stitch_params")) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
            return;
        }
        FragmentActivity fragmentActivity = this;
        JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
        this.f113229e = (CutVideoViewModel) a;
        JediViewModel a2 = C48927d.m105736a(fragmentActivity).mo96760a(EditCornerViewModel.class);
        C52711k.m112236a((Object) a2, "JediViewModelProviders.o…nerViewModel::class.java)");
        this.f113230f = (EditCornerViewModel) a2;
        C42734ad adVar = new C42734ad();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("stitch_params");
        C52711k.m112236a((Object) parcelableExtra, "intent.getParcelableExtr…ants.EXTRA_STITCH_PARAMS)");
        StitchParams stitchParams = (StitchParams) parcelableExtra;
        this.f113231g = getIntent().getStringExtra("creation_id");
        if (TextUtils.isEmpty(this.f113231g)) {
            this.f113231g = UUID.randomUUID().toString();
        }
        adVar.f108079v = stitchParams;
        String videoPath = stitchParams.getVideoPath();
        if (TextUtils.isEmpty(videoPath)) {
            finish();
        } else {
            ArrayList arrayList = new ArrayList();
            MediaModel mediaModel = new MediaModel(1);
            mediaModel.f95383b = videoPath;
            arrayList.add(mediaModel);
            adVar.mo87190a(arrayList);
            adVar.f108061d = true;
            adVar.f108062e = getIntent().getLongExtra("min_duration", 3000);
            if (bundle == null) {
                workspace = Workspace.m93091a();
            } else {
                workspace = (Workspace) bundle.getParcelable("workspace");
            }
            adVar.f108068k = workspace;
            CutVideoViewModel cutVideoViewModel = this.f113229e;
            if (cutVideoViewModel == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            cutVideoViewModel.mo87175a(adVar);
        }
        this.f113228b = new C44739g();
        C44739g gVar = this.f113228b;
        if (gVar == null) {
            C52711k.m112237a("mRootScene");
        }
        gVar.f113269u = this.f113231g;
        C12921h.m25903a((Activity) this, C44739g.class).mo24452a(false).mo24451a((C12930k) new C44725b(this)).mo24454b(false).mo24455c(false).mo24450a((int) R.id.cdt).mo24453a();
        CutVideoViewModel cutVideoViewModel2 = this.f113229e;
        if (cutVideoViewModel2 == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo87178g()) {
            this.f60457f_ = false;
        } else {
            JediViewModel a3 = C48927d.m105736a(fragmentActivity).mo96760a(EditCornerViewModel.class);
            C52711k.m112236a((Object) a3, "JediViewModelProviders.o…nerViewModel::class.java)");
            this.f113230f = (EditCornerViewModel) a3;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            finish();
        }
    }
}

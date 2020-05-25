package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42734ad;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42735ae;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42798ar;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42820ax;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42875bp;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43889c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.story.shootvideo.C46668c;
import com.p683ss.android.ugc.gamora.editor.EditCornerViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity */
public final class VECutVideoActivity extends BaseScreenAdaptActivity {

    /* renamed from: c */
    public static final C42573a f107680c = new C42573a(null);

    /* renamed from: f */
    private static final String f107681f = VECutVideoActivity.class.getSimpleName();

    /* renamed from: b */
    public C42781ao f107682b;

    /* renamed from: d */
    private CutVideoViewModel f107683d;

    /* renamed from: e */
    private EditCornerViewModel f107684e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$a */
    public static final class C42573a {
        private C42573a() {
        }

        public /* synthetic */ C42573a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m93487a(Context context, Intent intent, int i) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(intent, "intent");
            intent.setClass(context, VECutVideoActivity.class);
            if (intent.getLongExtra("extra_start_enter_cut_page", -1) == -1) {
                intent.putExtra("extra_start_enter_cut_page", System.currentTimeMillis());
            }
            if (i == -1 || !(context instanceof Activity)) {
                context.startActivity(intent);
            } else {
                ((Activity) context).startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$b */
    static final class C42574b extends C52712l implements C52671b<Float, String> {

        /* renamed from: a */
        public static final C42574b f107685a = new C42574b();

        C42574b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return String.valueOf(((Number) obj).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$c */
    static final class C42575c implements C12930k {

        /* renamed from: a */
        final /* synthetic */ VECutVideoActivity f107686a;

        C42575c(VECutVideoActivity vECutVideoActivity) {
            this.f107686a = vECutVideoActivity;
        }

        /* renamed from: a */
        public final C12924i mo24488a(ClassLoader classLoader, String str, Bundle bundle) {
            C52711k.m112240b(classLoader, "<anonymous parameter 0>");
            C52711k.m112240b(str, "className");
            if (!C52711k.m112239a((Object) C42781ao.class.getName(), (Object) str)) {
                return null;
            }
            C42781ao aoVar = this.f107686a.f107682b;
            if (aoVar == null) {
                C52711k.m112237a("cutVideoRootScene");
            }
            return aoVar;
        }
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    public final void onBackPressed() {
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        cutVideoViewModel.mo87176e();
    }

    public final void onDestroy() {
        super.onDestroy();
        C45412b.m98979a().leave(this, "clip");
    }

    public final void onPause() {
        super.onPause();
        C45412b a = C45412b.m98979a();
        Context context = this;
        String str = "clip";
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        String str2 = cutVideoViewModel.mo87177f().f108071n;
        CutVideoViewModel cutVideoViewModel2 = this.f107683d;
        if (cutVideoViewModel2 == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        a.pause(context, str, str2, cutVideoViewModel2.mo87177f().f108074q);
    }

    public final void finish() {
        Serializable serializable;
        super.finish();
        if (C22795c.m56156a() != null) {
            C22795c.m56156a().mo47276c();
        }
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.f108052d != null) {
            C42734ad adVar = cutVideoViewModel.f108052d;
            if (adVar == null) {
                C52711k.m112237a("cutVideoModel");
            }
            serializable = adVar.f108066i;
        } else {
            serializable = null;
        }
        if (serializable == null) {
            return;
        }
        if (serializable != null) {
            startActivity(new Intent(this, (Class) serializable));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.Class<*>");
    }

    /* renamed from: b */
    public final void mo46740b() {
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            C42781ao aoVar = this.f107682b;
            if (aoVar == null) {
                C52711k.m112237a("cutVideoRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = aoVar.f108192p;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (!cutVideoViewModel2.mo87178g()) {
                VideoEditViewModel videoEditViewModel = aoVar.f108193q;
                if (videoEditViewModel == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int i = ((VideoSegment) videoEditViewModel.mo87634l().get(0)).f107908g;
                VideoEditViewModel videoEditViewModel2 = aoVar.f108193q;
                if (videoEditViewModel2 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int min = Math.min(i, ((VideoSegment) videoEditViewModel2.mo87634l().get(0)).f107909h);
                VideoEditViewModel videoEditViewModel3 = aoVar.f108193q;
                if (videoEditViewModel3 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int i2 = ((VideoSegment) videoEditViewModel3.mo87634l().get(0)).f107908g;
                VideoEditViewModel videoEditViewModel4 = aoVar.f108193q;
                if (videoEditViewModel4 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                int max = Math.max(i2, ((VideoSegment) videoEditViewModel4.mo87634l().get(0)).f107909h);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = aoVar.f108198v;
                if (cutVideoPreviewViewModel == null) {
                    C52711k.m112237a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo87112a(min, max);
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onEvent(C43889c cVar) {
        C52711k.m112240b(cVar, "event");
        finish();
    }

    /* renamed from: a */
    public final void mo46739a(boolean z) {
        int i;
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            EditCornerViewModel editCornerViewModel = this.f107684e;
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
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87183l() && bundle != null) {
            String str = "workspace";
            CutVideoViewModel cutVideoViewModel2 = this.f107683d;
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
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo87178g()) {
            C42781ao aoVar = this.f107682b;
            if (aoVar == null) {
                C52711k.m112237a("cutVideoRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = aoVar.f108192p;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            int i3 = 0;
            if (!cutVideoViewModel2.mo87178g()) {
                C42798ar J = aoVar.mo87237J();
                int c = C22452a.m55497c();
                View view = J.mo87253K().f33834b;
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
                    View view2 = J.mo87253K().f33834b;
                    C52711k.m112236a((Object) view2, "bottomBarScene.view");
                    view2.setLayoutParams(marginLayoutParams);
                    View view3 = J.mo87254L().f33834b;
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
                        View view4 = J.mo87254L().f33834b;
                        C52711k.m112236a((Object) view4, "videoEditScene.view");
                        view4.setLayoutParams(marginLayoutParams2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            EditCornerViewModel editCornerViewModel = this.f107684e;
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
        boolean z;
        List list;
        boolean z2;
        Workspace workspace;
        C43758o oVar;
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle2 = bundle;
        boolean z3 = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", true);
        C45412b.m98979a().enter(this, "clip");
        super.onCreate(bundle);
        try {
            z = C52711k.m112239a((Object) "system_upload", (Object) getIntent().getStringExtra("shoot_way"));
        } catch (Exception unused) {
            C45407ay.m98971b("cut video upload exception");
            z = false;
        }
        String str5 = null;
        if (z) {
            C43036f.m94305a(false);
            C43047h.m94332a(getIntent().getStringExtra("shoot_way"), getIntent().getStringExtra("creation_id"));
            if (C52711k.m112239a((Object) "comment_reply", (Object) getIntent().getStringExtra("shoot_way"))) {
                Serializable serializableExtra = getIntent().getSerializableExtra("comment_video_model");
                if (!(serializableExtra instanceof CommentVideoModel)) {
                    serializableExtra = null;
                }
                CommentVideoModel commentVideoModel = (CommentVideoModel) serializableExtra;
                if (commentVideoModel != null) {
                    str3 = commentVideoModel.getCommentId();
                } else {
                    str3 = null;
                }
                if (commentVideoModel != null) {
                    str4 = commentVideoModel.getUserId();
                } else {
                    str4 = null;
                }
                C43047h.m94334b(str3, str4);
            }
        }
        String stringExtra = getIntent().getStringExtra("shoot_way");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -2060806639) {
                if (hashCode == -1107435254 && stringExtra.equals("comment_reply")) {
                    Serializable serializableExtra2 = getIntent().getSerializableExtra("comment_video_model");
                    if (!(serializableExtra2 instanceof CommentVideoModel)) {
                        serializableExtra2 = null;
                    }
                    CommentVideoModel commentVideoModel2 = (CommentVideoModel) serializableExtra2;
                    if (commentVideoModel2 != null) {
                        str = commentVideoModel2.getCommentId();
                    } else {
                        str = null;
                    }
                    if (commentVideoModel2 != null) {
                        str2 = commentVideoModel2.getUserId();
                    } else {
                        str2 = null;
                    }
                    C43047h.m94334b(str, str2);
                }
            } else if (stringExtra.equals("system_upload")) {
                C43047h.m94332a(getIntent().getStringExtra("shoot_way"), getIntent().getStringExtra("creation_id"));
            }
        }
        C39629l.m88232a().mo58586q();
        setContentView((int) R.layout.ax7);
        FragmentActivity fragmentActivity = this;
        JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(CutVideoViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
        this.f107683d = (CutVideoViewModel) a;
        C42734ad adVar = new C42734ad();
        CutVideoViewModel cutVideoViewModel = this.f107683d;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        cutVideoViewModel.mo87175a(adVar);
        ArrayList arrayList = new ArrayList();
        C22795c a2 = C22795c.m56156a();
        if (a2 != null) {
            list = a2.mo47277d();
        } else {
            list = null;
        }
        if (list != null) {
            C22795c a3 = C22795c.m56156a();
            C52711k.m112236a((Object) a3, "MediaManager.instance()");
            arrayList = (ArrayList) a3.mo47277d();
        }
        String stringExtra2 = getIntent().getStringExtra("file_path");
        if (getIntent().hasExtra("open_sdk_import_media_list")) {
            arrayList = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list");
            C52711k.m112236a((Object) arrayList, "intent.getParcelableArra…PEN_SDK_IMPORT_MEDIALIST)");
        }
        if (!TextUtils.isEmpty(stringExtra2) || !arrayList.isEmpty()) {
            adVar.mo87190a(arrayList);
            adVar.f108059b = stringExtra2;
            adVar.f108060c = C46668c.m101263a(getIntent().getIntExtra("shoot_mode", -1));
            adVar.f108062e = getIntent().getLongExtra("min_duration", C43307ea.m94995a());
            if (bundle2 == null) {
                workspace = Workspace.m93091a();
            } else {
                workspace = (Workspace) bundle2.getParcelable("workspace");
                if (workspace == null) {
                    workspace = Workspace.m93091a();
                }
            }
            adVar.f108068k = workspace;
            String stringExtra3 = getIntent().getStringExtra(LeakCanaryFileProvider.f132050j);
            if (!TextUtils.isEmpty(stringExtra3)) {
                Workspace workspace2 = adVar.f108068k;
                if (workspace2 != null) {
                    workspace2.mo86453a(new File(stringExtra3));
                }
            }
            if (getIntent().getSerializableExtra("av_challenge") != null) {
                adVar.f108063f.clear();
                ArrayList<AVChallenge> arrayList2 = adVar.f108063f;
                Serializable serializableExtra3 = getIntent().getSerializableExtra("av_challenge");
                if (serializableExtra3 != null) {
                    arrayList2.add((AVChallenge) serializableExtra3);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
                }
            }
            if (getIntent().getSerializableExtra("av_challenge_list") != null) {
                Serializable serializableExtra4 = getIntent().getSerializableExtra("av_challenge_list");
                if (serializableExtra4 != null) {
                    ArrayList<AVChallenge> arrayList3 = (ArrayList) serializableExtra4;
                    C52711k.m112240b(arrayList3, "<set-?>");
                    adVar.f108063f = arrayList3;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
                }
            }
            adVar.f108064g = getIntent().getStringExtra("micro_app_id");
            if (getIntent().getSerializableExtra("micro_app_info") == null) {
                oVar = null;
            } else {
                Serializable serializableExtra5 = getIntent().getSerializableExtra("micro_app_info");
                if (serializableExtra5 != null) {
                    oVar = (C43758o) serializableExtra5;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
                }
            }
            adVar.f108065h = oVar;
            adVar.f108066i = getIntent().getSerializableExtra("micro_app_class");
            adVar.f108067j = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
            adVar.f108069l = (C26916m) getIntent().getSerializableExtra("extra_share_context");
            adVar.f108070m = getIntent().getIntExtra("extra_stick_point_type", 0);
            adVar.f108071n = getIntent().getStringExtra("shoot_way");
            adVar.f108072o = getIntent().getBooleanExtra("from_background_video", false);
            adVar.f108073p = getIntent().getLongExtra("background_video_max_length", 15000);
            adVar.f108074q = getIntent().getStringExtra("creation_id");
            adVar.f108078u = getIntent().getBooleanExtra("draft_to_cut", false);
            adVar.f108076s = (LivePublishModel) getIntent().getSerializableExtra("live_publish_model");
            LivePublishModel livePublishModel = adVar.f108076s;
            if (livePublishModel != null) {
                C43047h.m94332a(getIntent().getStringExtra("shoot_way"), getIntent().getStringExtra("creation_id"));
                C43047h.f108666f = getIntent().getStringExtra("content_type");
                if (adVar.f108078u) {
                    livePublishModel.setRotate(Integer.valueOf(0));
                }
                StringBuilder sb = new StringBuilder("watermark=");
                Float[] watermarkLocation = livePublishModel.getWatermarkLocation();
                if (watermarkLocation != null) {
                    str5 = C52568f.m112075a(watermarkLocation, "-", null, null, 0, null, C42574b.f107685a, 30, null);
                }
                sb.append(str5);
                sb.append(",rotate=");
                sb.append(livePublishModel.getRotate());
                sb.append(",file=");
                sb.append(livePublishModel.getFilePath());
            }
            adVar.f108077t = getIntent().getBooleanExtra("extra_enter_from_live", false);
            adVar.f108080w = getIntent().getLongExtra("extra_start_enter_cut_page", System.currentTimeMillis());
            z2 = true;
        } else {
            finish();
            z2 = false;
        }
        if (!z2) {
            z3 = false;
        } else {
            this.f107682b = new C42781ao();
            C12921h.m25903a((Activity) this, C42781ao.class).mo24452a(false).mo24451a((C12930k) new C42575c(this)).mo24454b(false).mo24455c(false).mo24450a((int) R.id.cdt).mo24453a();
        }
        if (!z3) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
            return;
        }
        CutVideoViewModel cutVideoViewModel2 = this.f107683d;
        if (cutVideoViewModel2 == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.mo87178g()) {
            this.f60457f_ = false;
        } else {
            JediViewModel a4 = C48927d.m105736a(fragmentActivity).mo96760a(EditCornerViewModel.class);
            C52711k.m112236a((Object) a4, "JediViewModelProviders.o…nerViewModel::class.java)");
            this.f107684e = (EditCornerViewModel) a4;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C42781ao aoVar = this.f107682b;
        if (aoVar == null) {
            C52711k.m112237a("cutVideoRootScene");
        }
        CutVideoViewModel cutVideoViewModel = aoVar.f108192p;
        if (cutVideoViewModel == null) {
            C52711k.m112237a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo87178g()) {
            C42735ae K = aoVar.mo87238K();
            CutVideoViewModel cutVideoViewModel2 = K.f108100s;
            if (cutVideoViewModel2 == null) {
                C52711k.m112237a("cutVideoViewModel");
            }
            if (cutVideoViewModel2.mo87182k()) {
                C42820ax axVar = K.f108097p;
                if (axVar != null) {
                    C42875bp bpVar = axVar.f108258b;
                    if (bpVar == null) {
                        C52711k.m112237a("stickPointVideoSegController");
                    }
                    bpVar.mo87317a(i, i2, intent);
                }
            } else if (i == 1001 && i2 == -1 && intent != null) {
                List parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                Collection collection = parcelableArrayListExtra;
                if (!C23715d.m58202a(collection)) {
                    ArrayList arrayList = new ArrayList();
                    VideoEditViewModel videoEditViewModel = K.f108101t;
                    if (videoEditViewModel == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    int size = videoEditViewModel.mo87634l().size();
                    if (parcelableArrayListExtra == null) {
                        C52711k.m112234a();
                    }
                    int size2 = collection.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        VideoSegment videoSegment = new VideoSegment((MediaModel) parcelableArrayListExtra.get(i3));
                        videoSegment.f107902a = size;
                        arrayList.add(videoSegment);
                        size++;
                    }
                    C43099t tVar = K.mo87195N().f108489i;
                    if (tVar != null) {
                        tVar.mo87500b((List<VideoSegment>) arrayList);
                    }
                    List list = arrayList;
                    K.mo87194M().mo87345G().mo87516a(list);
                    VECutVideoPresenter vECutVideoPresenter = K.f108098q;
                    if (vECutVideoPresenter == null) {
                        C52711k.m112237a("presenter");
                    }
                    VideoEditViewModel videoEditViewModel2 = K.f108101t;
                    if (videoEditViewModel2 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    vECutVideoPresenter.mo86816a(list, videoEditViewModel2.mo87634l().size());
                }
            }
        }
        Bundle bundle = null;
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (intent != null) {
                bundle = intent.getExtras();
            }
            if (bundle != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    C52711k.m112234a();
                }
                String string = extras.getString("edit result");
                String str = "record result";
                StringBuilder sb = new StringBuilder("RecordActivity return success ");
                if (string == null) {
                    C52711k.m112234a();
                }
                sb.append(string);
                intent2.putExtra(str, sb.toString());
            }
            setResult(-1, intent2);
            finish();
        } else if (i == 4 && i2 == 7) {
            setResult(7, intent);
            finish();
        } else {
            if (i == 8 && i2 == 9) {
                Intent intent3 = new Intent();
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                if (bundle != null) {
                    intent3.putExtras(intent.getExtras());
                }
                setResult(9, intent3);
                finish();
            }
        }
    }
}

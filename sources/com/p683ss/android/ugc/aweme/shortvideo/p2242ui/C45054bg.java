package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0810b;
import android.support.p030v4.graphics.drawable.C0812d;
import android.support.p030v4.p038f.C0794k;
import android.text.InputFilter;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.asve.p1241e.C20391c;
import com.p683ss.android.ugc.asve.recorder.camera.p1246a.C20455b;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.effectplatform.C29264p;
import com.p683ss.android.ugc.aweme.effectplatform.C29276x;
import com.p683ss.android.ugc.aweme.effectplatform.C29279y;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.greenscreen.C32890f;
import com.p683ss.android.ugc.aweme.imported.C35522c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.p1426bb.p1427a.C23764a;
import com.p683ss.android.ugc.aweme.p1435bh.C23803e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac.C39542a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39559e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be.C39595a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p683ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.Publish;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinApiLevel2;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinAvailableMemoryMBLevel2;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinJvmAvailableMemoryMBLevel2;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinTotalMemoryMBLevel2;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42423an;
import com.p683ss.android.ugc.aweme.shortvideo.C42464bj;
import com.p683ss.android.ugc.aweme.shortvideo.C42480by;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C42500co;
import com.p683ss.android.ugc.aweme.shortvideo.C42559cq;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43217dk;
import com.p683ss.android.ugc.aweme.shortvideo.C43223dp;
import com.p683ss.android.ugc.aweme.shortvideo.C43301dw;
import com.p683ss.android.ugc.aweme.shortvideo.C43839fl;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.C42386b;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43447bb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43448bc;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43452bf;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43597g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43670c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43672e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44482h;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44506s;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.presenter.C44352a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44364a;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44365b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44378h;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44400p.C44401a;
import com.p683ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45420bf;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45421bg.C45422a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45457u;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.C45488a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.C45492b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p683ss.android.ugc.aweme.status.C45733a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47699ax;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VERecordData;
import com.p683ss.android.vesdk.VEUtils;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bg */
public final class C45054bg extends Fragment implements C39592a, C42480by {

    /* renamed from: A */
    private View f114094A;

    /* renamed from: B */
    private View f114095B;

    /* renamed from: C */
    private HashTagMentionEditText f114096C;

    /* renamed from: D */
    private AtomicInteger f114097D = new AtomicInteger(0);

    /* renamed from: E */
    private long f114098E;

    /* renamed from: F */
    private long f114099F;

    /* renamed from: G */
    private CheckBox f114100G;

    /* renamed from: H */
    private FrameLayout f114101H;

    /* renamed from: I */
    private List<C0794k<Class<?>, IAVPublishExtension<?>>> f114102I = C39618d.f101179t.mo74306a(AVPublishContentType.Video);

    /* renamed from: J */
    private int f114103J;

    /* renamed from: K */
    private boolean f114104K;

    /* renamed from: L */
    private boolean f114105L;

    /* renamed from: M */
    private boolean f114106M;

    /* renamed from: N */
    private C26916m f114107N;

    /* renamed from: O */
    private int f114108O = -1;

    /* renamed from: P */
    private boolean f114109P;

    /* renamed from: Q */
    private boolean f114110Q;

    /* renamed from: R */
    private boolean f114111R;

    /* renamed from: S */
    private String f114112S;

    /* renamed from: T */
    private int f114113T = -1;

    /* renamed from: U */
    private C45488a f114114U;

    /* renamed from: a */
    CommonItemView f114115a;

    /* renamed from: b */
    CommonItemView f114116b;

    /* renamed from: c */
    C0198r f114117c = new C0198r();

    /* renamed from: d */
    C42559cq f114118d;

    /* renamed from: e */
    RelativeLayout f114119e;

    /* renamed from: f */
    View f114120f;

    /* renamed from: g */
    C44365b f114121g = new C44365b();

    /* renamed from: h */
    C43839fl f114122h;

    /* renamed from: i */
    LinearLayout f114123i;

    /* renamed from: j */
    C42464bj f114124j;

    /* renamed from: k */
    SimpleDraweeView f114125k;

    /* renamed from: l */
    View f114126l;

    /* renamed from: m */
    View f114127m;

    /* renamed from: n */
    View f114128n;

    /* renamed from: o */
    C43217dk f114129o;

    /* renamed from: p */
    C44378h f114130p;

    /* renamed from: q */
    VideoPublishEditModel f114131q;

    /* renamed from: r */
    public boolean f114132r;

    /* renamed from: s */
    public boolean f114133s;

    /* renamed from: t */
    public boolean f114134t;

    /* renamed from: u */
    public VideoCoverBitmapHolder f114135u;

    /* renamed from: v */
    public Bitmap f114136v;

    /* renamed from: w */
    C45546c f114137w;

    /* renamed from: x */
    public boolean f114138x;

    /* renamed from: y */
    OnTouchListener f114139y = new C45068bh(this);

    /* renamed from: z */
    private PermissionSettingItem f114140z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bg$a */
    interface C45067a {
        /* renamed from: a */
        void mo91433a();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo91421a(View view) {
        C10691a.m21534a(getContext(), (int) R.string.d_k, 0).mo19066a();
        return false;
    }

    /* renamed from: a */
    public final void mo91420a(boolean z) {
        if (!C39618d.f101183x.mo74282b()) {
            mo91419a((C45067a) new C45109cd(this, z));
        } else {
            mo91424b(z);
        }
    }

    /* renamed from: d */
    public final String mo78635d() {
        return this.f114122h.mo89380c();
    }

    /* renamed from: l */
    public final String mo91430l() {
        return C43855fx.m96289b(this.f114131q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ C52860x mo91431m() {
        mo91420a(true);
        return null;
    }

    /* renamed from: c */
    public final String mo78634c() {
        if (this.f114131q == null) {
            return null;
        }
        return this.f114131q.commerceData;
    }

    /* renamed from: f */
    public final void mo78637f() {
        if (this.f114131q != null) {
            this.f114131q.microAppModel = null;
        }
    }

    /* renamed from: j */
    public final void mo91428j() {
        C45422a.m98994a(getActivity(), new C45070bj(this));
    }

    /* renamed from: p */
    private void m98557p() {
        Intent intent = new Intent();
        intent.putExtra("publish result", "PublishActivity success");
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    /* renamed from: e */
    public final boolean mo78636e() {
        if (this.f114131q == null || (TextUtils.isEmpty(this.f114131q.microAppId) && this.f114131q.microAppModel == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final String mo91429k() {
        if (this.f114131q.getAvetParameter() != null) {
            return this.f114131q.getAvetParameter().getStoryShootEntrance();
        }
        return "";
    }

    /* renamed from: t */
    private void m98561t() {
        this.f114131q.setMainBusinessData(C43597g.updateSDKShareContextWhenSaveOrPost(this.f114131q.mIsFromDraft, this.f114131q.getMainBusinessData()));
        this.f114107N = (C26916m) C39618d.f101161b.mo34884a(C43597g.getShareContext(this.f114131q.getMainBusinessContext()), C26916m.class);
    }

    /* renamed from: i */
    public final void mo91427i() {
        for (C0794k kVar : this.f114102I) {
            ((IAVPublishExtension) kVar.f2712b).onBackPressed(C43448bc.m95233a(this.f114131q));
        }
    }

    public final void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        C50203g.m108358a("PublishDurationMonitor VideoPublishFragment onResume");
        for (C0794k kVar : this.f114102I) {
            ((IAVPublishExtension) kVar.f2712b).onResume();
        }
    }

    /* renamed from: q */
    private void m98558q() {
        if (this.f114113T == -1) {
            this.f114113T = C44482h.m97319a(getContext(), this.f114131q.isMvThemeVideoType());
        }
        if (this.f114113T != 0) {
            Intent intent = new Intent();
            Bundle c = m98552c(true);
            c.putInt("pre_publish_type", this.f114113T);
            if (C39618d.f101152P.mo83103a(C40790a.UploadOptimizeForPie)) {
                intent.putExtra("publish_bundle", c);
            } else {
                intent.putExtras(c);
            }
            if (C23763a.m58315a().f63349a) {
                this.f114112S = C23803e.m58426a(c, this.f114112S);
                return;
            }
            C23763a.m58315a().mo49229a(getActivity(), intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo91422b() {
        if (this.f114097D.decrementAndGet() == 0 && this.f114137w != null && this.f114137w.isShowing() && getActivity() != null && !getActivity().isFinishing()) {
            this.f114137w.dismiss();
            this.f114137w = null;
        }
    }

    /* renamed from: g */
    public final void mo91425g() {
        if (C39618d.f101183x.mo74286f()) {
            C47858ep.m103521c("TE");
            C10691a.m21548c(getContext(), (int) R.string.dw2).mo19066a();
            return;
        }
        this.f114122h.mo89378b("publish");
        C53755c.m114319a().mo112960d(new C23764a(true));
        if (((Integer) this.f114117c.getValue()).intValue() == 1) {
            mo91428j();
        } else {
            C39618d.f101162c.mo74145a(getContext(), (C39542a) new C39542a() {
                /* renamed from: a */
                public final void mo78639a(boolean z) {
                    if (z) {
                        C45054bg.this.f114117c.setValue(Integer.valueOf(1));
                    }
                    C45054bg.this.mo91428j();
                }
            });
        }
    }

    public final void onDestroyView() {
        boolean z;
        m98547a(getView(), (OnTouchListener) null);
        StringBuilder sb = new StringBuilder("ProcessPublish DestroyPublishFragment isPublish:");
        sb.append(this.f114106M);
        C50203g.m108358a(sb.toString());
        if (!this.f114106M) {
            C23763a.m58315a().mo49224a(getContext(), "FragmentDestroy");
        }
        super.onDestroyView();
        if (this.f114129o != null) {
            this.f114129o.mo87870c();
        } else {
            StringBuilder sb2 = new StringBuilder("syncModule is null and the fragment's view is null?:->");
            if (getView() == null) {
                z = true;
            } else {
                z = false;
            }
            sb2.append(z);
            C47625i.m103103a(sb2.toString());
        }
        for (C0794k kVar : this.f114102I) {
            ((IAVPublishExtension) kVar.f2712b).onDestroy();
        }
        C45380af.m98935a().mo91717b();
    }

    /* renamed from: o */
    private void m98556o() {
        final C0027j jVar = new C0027j();
        mo91418a();
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
        if (this.f114131q.mEffectList == null || this.f114131q.mEffectList.isEmpty()) {
            C50203g.m108363d("ignore fetch specialfilter because of empty effects");
            jVar.mo44a(null);
        } else {
            HashSet hashSet = new HashSet();
            Iterator it = this.f114131q.mEffectList.iterator();
            while (it.hasNext()) {
                EffectPointModel effectPointModel = (EffectPointModel) it.next();
                if (!C48016e.m103944b(effectPointModel.getResDir())) {
                    hashSet.add(effectPointModel.getKey());
                }
            }
            if (!hashSet.isEmpty()) {
                C29252f a = C29242c.m68868a(getActivity());
                a.mo59122a((C0184k) this);
                a.mo59141a((List<String>) new ArrayList<String>(hashSet), null, true, (C48704i) new C48704i() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo8638a(Object obj) {
                        List list = (List) obj;
                        C50203g.m108363d("uniformFetchList onSuccess");
                        jVar.mo44a(null);
                    }

                    /* renamed from: a */
                    public final void mo77143a(C48649d dVar) {
                        StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                        sb.append(dVar.toString());
                        C50203g.m108361b(sb.toString());
                        jVar.mo44a(null);
                    }
                });
            } else {
                C50203g.m108363d("All effects needn't download");
                jVar.mo44a(null);
            }
        }
        C0013i a2 = C0013i.m14a(null);
        final C0027j jVar2 = new C0027j();
        if (C39618d.f101152P.mo83104b(C40790a.ShowAutoImproveButtonInEditPage) != 1 || !this.f114131q.isReviewVideo() || this.f114131q.mIsFromDraft) {
            jVar2.mo44a(null);
        } else {
            new C29264p().mo59193a().mo59188a(new IFetchResourcesListener() {
                public final void onFailed(Exception exc) {
                    StringBuilder sb = new StringBuilder("fetchRequirement fail : ");
                    sb.append(exc.toString());
                    C50203g.m108361b(sb.toString());
                    jVar2.mo44a(null);
                }

                public final void onSuccess(String[] strArr) {
                    C50203g.m108363d("fetchRequirement onSuccess");
                    C29279y.m69003a(Arrays.asList(strArr));
                    jVar2.mo44a(null);
                }
            });
            if (C39618d.f101152P.mo83103a(C40790a.PreFetchPopEffectModel)) {
                C29276x.m68998a();
            }
        }
        C0013i.m21b((Collection<? extends C0013i<?>>) C17593ar.m43277a((E[]) new C0013i[]{a2, jVar.f77a, jVar2.f77a})).mo20a((C0011g<TResult, TContinuationResult>) new C45069bi<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* renamed from: h */
    public final void mo91426h() {
        this.f114122h.mo89377b();
        this.f114122h.f111009b.mo95674e();
        this.f114131q.title = this.f114122h.mo89380c();
        List d = this.f114122h.mo89381d();
        if (d != null) {
            this.f114131q.structList = d;
        }
        this.f114131q.isPrivate = ((Integer) this.f114117c.getValue()).intValue();
        if (this.f114121g.mo90230a() != null) {
            this.f114131q.challenges = new ArrayList();
            this.f114131q.challenges.add(this.f114121g.f112277a);
        } else {
            this.f114131q.challenges = null;
        }
        C43214dh.m94817a().mo87853c();
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f114102I, PoiPublishModel.class);
        if (poiPublishModel != null) {
            this.f114131q.poiId = poiPublishModel.getPoiContext();
        }
        if (this.f114130p != null) {
            this.f114131q.commentSetting = this.f114130p.mo90238a(this.f114115a);
            this.f114131q.allowDownloadSetting = this.f114130p.mo90245c();
        }
    }

    /* renamed from: s */
    private void m98560s() {
        boolean z;
        int i;
        if (this.f114131q.isMvThemeVideoType()) {
            String str = this.f114131q.mvCreateVideoData.videoCoverImgPath;
            if (C48016e.m103944b(str)) {
                C50181a.m108292a(this.f114125k, Uri.fromFile(new File(str)).toString());
            }
        } else if (this.f114131q.isStatusVideoType()) {
            String videoCoverImgPath = this.f114131q.statusCreateVideoData.getVideoCoverImgPath();
            if (C48016e.m103944b(videoCoverImgPath)) {
                C50181a.m108292a(this.f114125k, Uri.fromFile(new File(videoCoverImgPath)).toString());
            }
        } else if (this.f114131q.isMultiVideoEdit()) {
            VERecordData a = C43738a.m96063a(this.f114131q.getCurMultiEditVideoRecordData());
            Pair playInOutTime = this.f114131q.getCurMultiEditVideoRecordData().getPlayInOutTime();
            a.mo98589a((long) (((Integer) playInOutTime.first).intValue() * 1000), (long) (((Integer) playInOutTime.second).intValue() * 1000));
            int i2 = (int) (this.f114131q.mVideoCoverStartTm * 1000.0f);
            if (this.f114131q.isUseTimeReverseEffect()) {
                i = (((Integer) playInOutTime.second).intValue() - ((Integer) playInOutTime.first).intValue()) - i2;
            } else {
                i = i2;
            }
            VEUtils.getVideoThumb(a, i, this.f114131q.videoWidth(), this.f114131q.videoHeight(), false, new C45077bq(this));
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f114131q.mEffectList != null) {
                arrayList.addAll(this.f114131q.mEffectList);
            }
            if (this.f114131q.mTimeEffect != null) {
                arrayList.add(this.f114131q.mTimeEffect);
                if (this.f114131q.mTimeEffect.getKey().equals("1")) {
                    z = true;
                    C44352a.m97146a(arrayList, C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f114131q.getFilterIndex())), this.f114131q.mSelectedFilterIntensity, (int) (this.f114131q.mVideoCoverStartTm * 1000.0f), z, this.f114131q.getPreviewInfo(), this.f114131q.getVideoCoverPath(), new OnVideoCoverCallback() {
                        public final void onGetVideoCoverFailed(int i) {
                            C9432q.m18672a((Context) C39618d.f101160a, (int) R.string.cn4);
                        }

                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            if (C45054bg.this.f114125k != null && C45054bg.this.getContext() != null) {
                                C0810b a = C0812d.m2344a(C45054bg.this.getResources(), bitmap);
                                a.mo2609a(C9432q.m18687b((Context) C39618d.f101160a, 4.0f));
                                C45054bg.this.f114125k.setImageDrawable(a);
                                C45054bg.this.f114136v = bitmap;
                            }
                        }
                    });
                }
            }
            z = false;
            C44352a.m97146a(arrayList, C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f114131q.getFilterIndex())), this.f114131q.mSelectedFilterIntensity, (int) (this.f114131q.mVideoCoverStartTm * 1000.0f), z, this.f114131q.getPreviewInfo(), this.f114131q.getVideoCoverPath(), new OnVideoCoverCallback() {
                public final void onGetVideoCoverFailed(int i) {
                    C9432q.m18672a((Context) C39618d.f101160a, (int) R.string.cn4);
                }

                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (C45054bg.this.f114125k != null && C45054bg.this.getContext() != null) {
                        C0810b a = C0812d.m2344a(C45054bg.this.getResources(), bitmap);
                        a.mo2609a(C9432q.m18687b((Context) C39618d.f101160a, 4.0f));
                        C45054bg.this.f114125k.setImageDrawable(a);
                        C45054bg.this.f114136v = bitmap;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo91418a() {
        this.f114097D.incrementAndGet();
        if (this.f114137w == null && getActivity() != null && !getActivity().isFinishing()) {
            this.f114137w = C45546c.m99207a(getActivity(), getString(R.string.d7z));
            StringBuilder sb = new StringBuilder("VideoPublish prepareEffectPlatformImpl:");
            sb.append(this.f114137w);
            C50203g.m108363d(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ C52860x mo91432n() {
        String str;
        String str2;
        if (!C45492b.m99119a(this.f114131q) || this.f114131q.videoCategory != null) {
            this.f114099F = SystemClock.uptimeMillis();
            if (C39618d.f101183x.mo74280a()) {
                C23569o.m57779a("aweme_child_mode_publish", (JSONObject) null);
            }
            m98561t();
            if (TextUtils.isEmpty(this.f114131q.musicId)) {
                str = "";
            } else {
                str = this.f114131q.musicId;
            }
            if (TextUtils.isEmpty(str)) {
                C42482c b = C43214dh.m94817a().mo50201b();
                if (b == null) {
                    str = "";
                } else {
                    str = b.getMusicId();
                }
            }
            if (this.f114131q != null && !TextUtils.isEmpty(str) && "edit_page_recommend".equals(this.f114131q.mMusicOrigin) && 1 == this.f114131q.comFrom) {
                C26890h.m65011a("jarvis_item_click", C23089d.m56640a().mo47829a("item_id", str).mo47829a("channel_id", "94349537828").mo47829a("req_id", this.f114131q.aiMusicLogPbImprId).f61491a);
            }
            C23569o.m57779a("aweme_publish_stay_time", C23088c.m56631a().mo47823a("stay_time", Long.valueOf(System.currentTimeMillis() - this.f114098E)).mo47825b());
            this.f114122h.mo89377b();
            this.f114131q.title = this.f114122h.mo89380c();
            List d = this.f114122h.mo89381d();
            if (d == null) {
                this.f114131q.structList = new ArrayList();
            } else {
                this.f114131q.structList = d;
            }
            GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f114102I, GoodsPublishModel.class);
            if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
                this.f114131q.shopDraftId = goodsPublishModel.getGoodsDraftId();
            }
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f114102I, PoiPublishModel.class);
            if (poiPublishModel != null) {
                this.f114131q.poiId = poiPublishModel.getPoiContext();
                this.f114131q.latitude = poiPublishModel.getLatitude();
                this.f114131q.longitude = poiPublishModel.getLongitude();
            }
            this.f114131q.isPrivate = ((Integer) this.f114117c.getValue()).intValue();
            if (TextUtils.isEmpty(this.f114131q.mOutputFile)) {
                Workspace a = C42386b.m93131a(this.f114131q);
                this.f114131q.mOutputFile = a.mo86463j().getPath();
            }
            C22055c e = C39618d.f101183x.mo74285e();
            VideoPublishEditModel videoPublishEditModel = this.f114131q;
            if (e != null) {
                str2 = e.mo46164h();
            } else {
                str2 = "";
            }
            videoPublishEditModel.city = str2;
            this.f114131q.commentSetting = this.f114130p.mo90238a(this.f114115a);
            this.f114131q.reactDuetSetting = this.f114130p.mo90244b(this.f114116b);
            this.f114130p.mo90242a((BaseShortVideoContext) this.f114131q);
            this.f114131q.challenges = null;
            this.f114131q.mSaveModel = C43301dw.m94961a(this.f114131q.mSaveModel, this.f114129o.mo87869b());
            if (this.f114131q.mSaveModel != null) {
                this.f114131q.mSaveModel.setSaveToAlbum(this.f114130p.mo90243a());
                this.f114131q.mSaveModel.setSaveToAppPathInsteadOfAlbum(this.f114130p.f112290e);
                this.f114131q.mSaveModel.setEnableSilentEnhancement(C44378h.m97179e());
            }
            C29059c b2 = m98550b(this.f114131q);
            C39618d.f101144H.mo58573d().mo80730a(b2);
            m98548a(b2, false);
            C43214dh.m94817a().f109293h = b2.mo58774ak();
            C39629l.m88232a().mo58573d().mo80732a(b2, true);
            C39618d.f101145I.mo58606d().mo80661a().mo80666b(b2);
            int a2 = C45420bf.m98990a();
            if (this.f114131q != null && this.f114131q.reactionParams == null) {
                C45420bf.m98991a(a2 + 1);
            } else if (a2 < 3) {
                C45420bf.m98991a(0);
            }
            m98559r();
        } else {
            C10691a.m21533a(getContext(), (int) R.string.ful).mo19066a();
        }
        return null;
    }

    /* renamed from: r */
    private void m98559r() {
        String str;
        boolean z;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4;
        if (getActivity() != null && !getActivity().isFinishing()) {
            int i4 = 1;
            this.f114106M = true;
            if (!this.f114104K && !this.f114111R) {
                getActivity().finish();
            }
            C39618d.f101162c.mo74148a(getActivity(), this.f114131q.mStickerID);
            for (C0794k kVar : this.f114102I) {
                ((IAVPublishExtension) kVar.f2712b).onPublish(C43448bc.m95233a(this.f114131q));
            }
            C47858ep.m103516b();
            int i5 = this.f114131q.videoCount;
            int i6 = this.f114131q.photoCount;
            C23089d a = C23089d.m56640a().mo47829a("filter_list", this.f114131q.mCurFilterLabels).mo47829a("filter_id_list", this.f114131q.mCurFilterIds).mo47829a("creation_id", this.f114131q.creationId).mo47829a("shoot_way", this.f114131q.mShootWay).mo47826a("draft_id", this.f114131q.draftId).mo47829a("music_selected_from", this.f114131q.getMusicOrigin()).mo47829a("content_source", m98545a(this.f114131q)).mo47829a("content_type", mo91430l());
            String str5 = "prop_list";
            if (this.f114131q.isGreenScreen()) {
                str = "";
            } else {
                str = this.f114131q.mStickerID;
            }
            C23089d a2 = a.mo47829a(str5, str).mo47829a("effect_list", this.f114131q.getEditEffectList()).mo47829a("info_sticker_list", this.f114131q.getInfoStickerList()).mo47829a("infosticker_from", this.f114131q.getInfoStickerFrom()).mo47829a("enter_from", "video_post_page").mo47829a("camera_type", C45457u.m99056a()).mo47826a("camera_level", C39618d.f101151O.mo83118b(C40796a.RecordCameraCompatLevel));
            String str6 = "is_wide_angle";
            if (C20391c.m50589a(getContext()).mo43220a() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C23089d a3 = a2.mo47829a(str6, str2);
            String str7 = "is_anti_shake";
            if (C20455b.m50914a(getContext(), C39618d.f101151O.mo83118b(C40796a.ShakeFreeWhiteList))) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            C23089d a4 = a3.mo47829a(str7, str3).mo47829a("share_to", m98555e(this.f114129o.mo87866a())).mo47826a("fast_import_fail", this.f114131q.fastImportErrorCode).mo47829a("from_group_id", C42423an.m93185a()).mo47826a("file_fps", C43668b.m95929a(this.f114131q.getPreviewInfo())).mo47829a("mix_type", C45624b.m99356a(i5, i6));
            String str8 = "is_multi_content";
            if (i5 + i6 > 1) {
                i = 1;
            } else {
                i = 0;
            }
            C23089d a5 = a4.mo47826a(str8, i).mo47826a("location_gps_cnt", this.f114131q.getCoordinateCount());
            if (!TextUtils.isEmpty(this.f114131q.getPropSource())) {
                a5.mo47829a("prop_selected_from", this.f114131q.getPropSource());
            }
            if (this.f114108O >= 0) {
                a5.mo47826a("music_rec_type", this.f114108O);
            }
            if (this.f114131q.videoCategory != null) {
                a5.mo47826a("type", this.f114131q.videoCategory.getCategoryIndex()).mo47829a("type_name", this.f114131q.videoCategory.getCategoryName());
            }
            if (this.f114131q.mMusicShowRank > 0) {
                a5.mo47826a("music_show_rank", this.f114131q.mMusicShowRank);
            }
            if (!TextUtils.isEmpty(this.f114131q.mBindMvId)) {
                a5.mo47829a("mv_id", this.f114131q.mBindMvId);
            }
            if (!TextUtils.isEmpty(this.f114131q.nationalTaskId)) {
                a5.mo47829a("task_id", this.f114131q.nationalTaskId);
            } else if (!TextUtils.isEmpty(m98554d(this.f114131q.commerceData))) {
                a5.mo47829a("task_id", m98554d(this.f114131q.commerceData));
            }
            if (TextUtils.equals(this.f114131q.mShootWay, "task_platform")) {
                a5.mo47829a("enter_from", m98553c(this.f114131q.commerceData));
            } else {
                a5.mo47829a("enter_from", "video_post_page");
            }
            if (!TextUtils.isEmpty(this.f114131q.tagId)) {
                a5.mo47829a("tag_id", this.f114131q.tagId);
            }
            if (this.f114131q.isGreenScreen()) {
                a5.mo47826a("is_greenscreen", 1);
                a5.mo47829a("background_id_list", C32890f.m75776a(this.f114131q.greenScreenImages));
                a5.mo47829a("background_type_list", C32890f.m75777b(this.f114131q.greenScreenImages));
            }
            if (this.f114131q.mFromCut || this.f114131q.mFromMultiCut) {
                i3 = this.f114131q.videoCount;
                i2 = this.f114131q.photoCount;
                String str9 = "upload_type";
                if (this.f114131q.mFromMultiCut) {
                    str4 = "multiple_content";
                } else {
                    str4 = "single_content";
                }
                a5.mo47829a(str9, str4);
            } else {
                if (this.f114131q.extractFramesModel != null && this.f114131q.extractFramesModel.frames != null) {
                    i3 = this.f114131q.extractFramesModel.frames.size();
                } else if (this.f114131q.mvCreateVideoData == null || this.f114131q.mvCreateVideoData.selectMediaList == null) {
                    i3 = 0;
                } else {
                    i2 = this.f114131q.mvCreateVideoData.selectMediaList.size();
                    i3 = 0;
                }
                i2 = 0;
            }
            String str10 = "is_multi_content";
            if (i3 + i2 <= 1) {
                i4 = 0;
            }
            a5.mo47826a(str10, i4);
            try {
                InputFilter[] filters = this.f114096C.getFilters();
                if (filters != null && filters.length > 0) {
                    C35522c cVar = (C35522c) filters[0];
                    a5.mo47826a("hit_caption_limit", cVar.f91296a ? 1 : 0);
                    cVar.f91296a = false;
                    if (this.f114096C.getText() != null) {
                        this.f114131q.mentionEditTextLength = this.f114096C.getText().length();
                    }
                }
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(this.f114131q.pic2VideoSource)) {
                StringBuilder sb = new StringBuilder();
                String[] split = this.f114131q.pic2VideoSource.split(",");
                if (!C23715d.m58203a((T[]) split)) {
                    for (String str11 : split) {
                        if (!str11.isEmpty()) {
                            if (sb.length() != 0) {
                                sb.append(",");
                            }
                            sb.append(str11);
                        }
                    }
                    if (!TextUtils.isEmpty(sb)) {
                        a5.mo47829a("picture_source", sb.toString());
                    }
                }
            }
            if (!TextUtils.isEmpty(C42423an.m93187b())) {
                a5.mo47829a("tutorial_item_id", C42423an.m93187b());
            }
            if (CommentUtils.needMob(this.f114131q)) {
                a5.mo47829a("reply_comment_id", this.f114131q.commentVideoModel.getCommentId());
                a5.mo47829a("reply_user_id", this.f114131q.commentVideoModel.getUserId());
            }
            List b = C46717e.m101403b(this.f114131q);
            if (C46717e.m101404b(b)) {
                a5.mo47829a("text_added", "1");
            }
            if (C46717e.m101400a(b)) {
                a5.mo47829a("anchor_selected_from", "video_edit_page");
                a5.mo47829a("anchor_type", "wiki");
            }
            if (C46717e.m101398a((BaseShortVideoContext) this.f114131q)) {
                a5.mo47829a("anchor_selected_from", "video_post_page");
                a5.mo47829a("anchor_type", "wiki");
            }
            if (C45733a.m99540a()) {
                a5.mo47829a("is_commercial", "1");
            }
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f114102I, PoiPublishModel.class);
            Map<String, String> map = a5.f61491a;
            if (poiPublishModel != null) {
                map.putAll(poiPublishModel.getMobParams());
                this.f114131q.poiServerMobParam = poiPublishModel.getServerMobParams();
            }
            C26890h.m65011a("publish", map);
            C26890h.m65011a("performance_publish", new C23089d().mo47829a("creation_id", this.f114131q.creationId).mo47829a("content_type", mo91430l()).mo47826a("video_type", 0).mo47826a("memory_total_size_mb", (int) ((C47699ax.m103233a(getActivity()) / 1024) / 1024)).mo47826a("retry_publish", 0).mo47826a("pre_publish_type", this.f114113T).mo47826a("video_upload_type", this.f114109P ? 1 : 0).f61491a);
            C23569o.m57776a("user_publish_success_rate_parallel", -1, C23088c.m56631a().mo47822a("video_type", Integer.valueOf(0)).mo47822a("retry_publish", Integer.valueOf(0)).mo47822a("video_upload_type", Integer.valueOf(this.f114109P ? 1 : 0)).mo47825b());
            C23763a.m58315a().mo49226a(getActivity(), m98552c(false), this.f114112S);
            if (this.f114131q.isSaveLocal()) {
                C26890h.m65011a("download", new C23089d().mo47826a("scene_id", 1004).mo47829a("group_id", "").mo47829a("enter_from", "video_post_page").mo47829a("download_type", "self").mo47829a("download_method", "download_with_publish").f61491a);
            }
            mo91423b("publish");
        }
    }

    /* renamed from: a */
    public final void mo78776a(Object obj) {
        this.f114132r = true;
    }

    /* renamed from: a */
    public final void mo78632a(String str) {
        if (this.f114131q != null) {
            this.f114131q.commerceData = str;
        }
    }

    /* renamed from: a */
    public static String m98545a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            return "upload";
        }
        return "shoot";
    }

    /* renamed from: c */
    private String m98553c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(this.f114131q.commerceData).getString("national_task_enter_from");
            }
        } catch (JSONException unused) {
        }
        return "";
    }

    /* renamed from: d */
    private String m98554d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(this.f114131q.commerceData).getString("task_id");
            }
        } catch (JSONException unused) {
        }
        return "";
    }

    /* renamed from: b */
    private C29059c m98550b(VideoPublishEditModel videoPublishEditModel) {
        C39595a b = C39618d.f101174o.mo74238b();
        boolean z = true;
        if (this.f114131q.isPrivate() != 1) {
            z = false;
        }
        b.mo74246a(Boolean.valueOf(z));
        videoPublishEditModel.mSyncPlatforms = this.f114129o.mo87866a();
        C29059c a = new C43447bb("VideoPublishFragment").mo88377a(videoPublishEditModel);
        a.f76129G = System.currentTimeMillis();
        return a;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f114118d.mo86784a(bundle);
        for (C0794k kVar : this.f114102I) {
            ((IAVPublishExtension) kVar.f2712b).onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.f114121g.f112277a);
        bundle.putBoolean("contentModified", this.f114132r);
        bundle.putString("publish_id", this.f114112S);
    }

    /* renamed from: e */
    private static String m98555e(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] split = str.split(";");
            StringBuilder sb = new StringBuilder();
            for (String parseInt : split) {
                int parseInt2 = Integer.parseInt(parseInt);
                switch (parseInt2) {
                    case 1:
                        str2 = "local";
                        break;
                    case 2:
                        str2 = "instagram";
                        break;
                    case 3:
                        str2 = "instagram_story";
                        break;
                    default:
                        switch (parseInt2) {
                            case 100:
                                str2 = "helo";
                                break;
                            case BaseNotice.HASHTAG /*101*/:
                                str2 = "twitter";
                                break;
                            default:
                                str2 = "";
                                break;
                        }
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                    sb.append(",");
                }
            }
            String sb2 = sb.toString();
            if (sb2.endsWith(",")) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            return sb2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private void m98551b(View view) {
        if (C39618d.f101183x.mo74280a()) {
            for (C0794k kVar : this.f114102I) {
                ((IAVPublishExtension) kVar.f2712b).onEnterChildrenMode();
            }
            this.f114115a.setVisibility(8);
            this.f114116b.setVisibility(8);
            this.f114140z.setVisibility(8);
            this.f114094A.setVisibility(8);
            this.f114095B.setVisibility(8);
            this.f114120f.setVisibility(8);
            View findViewById = view.findViewById(R.id.t2);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C45108cc(this));
            if (!(this.f114129o == null || this.f114129o.f109303a == null)) {
                this.f114129o.f109303a.mo74261d().setVisibility(8);
                C44378h hVar = this.f114130p;
                CommonItemView commonItemView = hVar.f112289d;
                if (commonItemView != null) {
                    commonItemView.setChecked(false);
                }
                CommonItemView commonItemView2 = hVar.f112289d;
                if (commonItemView2 != null) {
                    commonItemView2.setVisibility(8);
                }
            }
            this.f114096C.setHint(R.string.a2b);
            this.f114096C.setMentionTextColor(C0726c.m2098c(getContext(), R.color.a17));
        }
    }

    /* renamed from: c */
    private Bundle m98552c(boolean z) {
        this.f114131q.mSaveModel = C43301dw.m94962a(this.f114131q.mSaveModel, this.f114129o.mo87869b(), z, this.f114130p);
        C46806g.m101653a(C44309n.m97057a((BaseShortVideoContext) this.f114131q), C44309n.m97058b((BaseShortVideoContext) this.f114131q), C46804e.PUBLISH, C46804e.SEND_REQUEST);
        this.f114131q.userClickPublishTime = this.f114099F;
        Bundle bundle = new Bundle();
        boolean z2 = false;
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", this.f114131q);
        bundle.putString("shoot_way", this.f114131q.mShootWay);
        bundle.putInt("extra_stick_point_type", this.f114103J);
        bundle.putBoolean("enter_record_from_other_platform", this.f114104K);
        bundle.putBoolean("extra_enter_from_live", this.f114111R);
        String str = "live_highlight";
        if (this.f114111R && this.f114131q.publishFromLiveHighLight()) {
            z2 = true;
        }
        bundle.putBoolean(str, z2);
        bundle.putInt("publish_private_state", this.f114131q.isPrivate());
        bundle.putBoolean("parallel_synthesize_upload", this.f114109P);
        if (this.f114110Q) {
            bundle.putBoolean("review_video_fast_publish", true);
        }
        StringBuilder sb = new StringBuilder("isFastPublish=");
        sb.append(this.f114110Q);
        C50203g.m108358a(sb.toString());
        StringBuilder sb2 = new StringBuilder("VideoPublishService.createBundleParams()  bundle=");
        sb2.append(bundle);
        C47625i.m103103a(sb2.toString());
        StringBuilder sb3 = new StringBuilder("VideoPublishService.createBundleParams()  bundle=");
        sb3.append(bundle);
        C26890h.m65011a("av_video_memory", C23089d.m56640a().mo47829a("log", sb3.toString()).f61491a);
        Publish.PublishBundle = bundle;
        return bundle;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f114109P = C39618d.f101152P.mo83103a(C40790a.EnableParallelSynthesizeUpload);
        this.f114098E = System.currentTimeMillis();
        this.f114106M = false;
        m98558q();
        if (bundle == null) {
            C42500co coVar = new C42500co(this.f114131q.videoWidth(), this.f114131q.videoHeight(), C40797m.m90249d(), 0.0f, C39618d.f101151O.mo83117a(C40796a.SyntheticHardCode));
            StringBuilder sb = new StringBuilder();
            sb.append(coVar.f107479a);
            sb.append("*");
            sb.append(coVar.f107480b);
            C23569o.m57779a("aweme_video_record_info", C23088c.m56631a().mo47824a("resolution", sb.toString()).mo47823a("bitrate", Long.valueOf(new BigDecimal((double) coVar.f107481c).longValue())).mo47823a("frame_rate", Long.valueOf(new BigDecimal((double) coVar.f107482d).longValue())).mo47819a("is_hardcode", Boolean.valueOf(coVar.f107483e)).mo47825b());
        }
    }

    /* renamed from: b */
    public final void mo91423b(String str) {
        C26890h.m65011a("leave_post_page", new C23089d().mo47829a("enter_from", "video_post_page").mo47829a("shoot_way", this.f114131q.mShootWay).mo47829a("creation_id", this.f114131q.creationId).mo47829a("leave_action", str).mo47826a("is_enter_cover", this.f114134t ? 1 : 0).mo47826a("is_enter_preview", this.f114133s ? 1 : 0).mo47826a("is_content_modified", this.f114132r ? 1 : 0).mo47827a("duration", System.currentTimeMillis() - this.f114098E).f61491a);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094 A[LOOP:0: B:12:0x008e->B:14:0x0094, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91424b(boolean r9) {
        /*
            r8 = this;
            r0 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.f114131q     // Catch:{ JSONException -> 0x001c }
            java.lang.String r2 = r2.commerceData     // Catch:{ JSONException -> 0x001c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x001c }
            if (r2 != 0) goto L_0x001c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001c }
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r8.f114131q     // Catch:{ JSONException -> 0x001c }
            java.lang.String r3 = r3.commerceData     // Catch:{ JSONException -> 0x001c }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x001c }
            java.lang.String r3 = "star_atlas_order_id"
            long r2 = r2.getLong(r3)     // Catch:{ JSONException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            java.lang.String r4 = "save_draft"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f114131q
            java.lang.String r7 = r7.creationId
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f114131q
            java.lang.String r7 = r7.mShootWay
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f114131q
            int r7 = r7.draftId
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47826a(r6, r7)
            java.lang.String r6 = "is_subtitle"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f114131q
            boolean r7 = r7.hasSubtitle()
            if (r7 == 0) goto L_0x004e
            java.lang.String r7 = "1"
            goto L_0x0050
        L_0x004e:
            java.lang.String r7 = "0"
        L_0x0050:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "task_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r5.mo47827a(r6, r2)
            java.lang.String r3 = "enter_from"
            java.lang.String r5 = "video_post_page"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r5)
            java.lang.String r3 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r8.f114131q
            java.lang.String r5 = m98545a(r5)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r5)
            java.lang.String r3 = "content_type"
            java.lang.String r5 = r8.mo91430l()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r2)
            java.lang.String r2 = "save_draft"
            r8.mo91423b(r2)
            r8.m98561t()
            r8.mo91426h()
            java.util.List<android.support.v4.f.k<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r2 = r8.f114102I
            java.util.Iterator r2 = r2.iterator()
        L_0x008e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r3 = r2.next()
            android.support.v4.f.k r3 = (android.support.p030v4.p038f.C0794k) r3
            S r3 = r3.f2712b
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r3 = (com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension) r3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r8.f114131q
            com.ss.android.ugc.aweme.services.publish.PublishOutput r4 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43448bc.m95233a(r4)
            r3.onSaveDraft(r4)
            goto L_0x008e
        L_0x00a8:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.f114131q
            com.ss.android.ugc.aweme.draft.model.c r2 = r8.m98550b(r2)
            com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101144H
            com.ss.android.ugc.aweme.port.internal.c r3 = r3.mo58573d()
            long r3 = r3.mo80730a(r2)
            com.ss.android.ugc.aweme.services.draft.IDraftService r5 = com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b.m102064a()
            r5.notifyDraftUpdate(r2)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x00c7
            r8.m98548a(r2, r9)
            goto L_0x00d1
        L_0x00c7:
            java.lang.String r0 = "draft save rows < 0"
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r0)
            java.lang.String r0 = "draft save rows < 0"
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18310a(r0)
        L_0x00d1:
            r0 = 1
            if (r9 == 0) goto L_0x00f0
            boolean r9 = r8.f114111R
            if (r9 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r8.f114131q
            boolean r9 = r9.publishFromLiveScreenCapture()
            if (r9 != 0) goto L_0x00f0
        L_0x00e0:
            android.app.Application r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            r1 = 2132548560(0x7f1c1bd0, float:2.0750398E38)
            java.lang.String r1 = r8.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21539a(r9, r1, r0, r0)
            r9.mo19066a()
        L_0x00f0:
            com.ss.android.ugc.aweme.port.in.u r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.internal.c r9 = r9.mo58573d()
            r1 = 0
            r9.mo80732a(r2, r1)
            boolean r9 = r8.f114111R
            if (r9 == 0) goto L_0x0155
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            if (r9 != 0) goto L_0x0107
            return
        L_0x0107:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r8.f114131q
            boolean r1 = r1.publishFromLiveHighLight()
            if (r1 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.shortvideo.edit.n r1 = new com.ss.android.ugc.aweme.shortvideo.edit.n
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setCode(r0)
            java.lang.String r0 = "highlight"
            r1.setType(r0)
            java.lang.String r0 = "draft"
            r1.setStatus(r0)
            java.lang.String r0 = "live_highlight_responce"
            r9.putExtra(r0, r1)
            goto L_0x013f
        L_0x0130:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.f114131q
            boolean r0 = r0.publishFromLiveScreenCapture()
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = "live_capture_responce"
            java.lang.String r1 = "draft"
            r9.putExtra(r0, r1)
        L_0x013f:
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            r1 = 9
            r0.setResult(r1, r9)
            java.lang.String r9 = "SaveDraft to Live"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r9)
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            r9.finish()
            return
        L_0x0155:
            boolean r9 = r8.f114104K
            if (r9 != 0) goto L_0x01e9
            boolean r9 = r8.f114105L
            if (r9 != 0) goto L_0x01e9
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            r9.putExtra(r2, r0)
            com.ss.android.ugc.aweme.common.m r2 = r8.f114107N
            if (r2 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.f114131q
            boolean r2 = r2.mIsFromDraft
            if (r2 != 0) goto L_0x0178
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG"
            com.ss.android.ugc.aweme.common.m r3 = r8.f114107N
            r9.putExtra(r2, r3)
        L_0x0178:
            com.ss.android.ugc.aweme.port.in.ac r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101162c
            boolean r2 = r2.mo74160f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SaveDraft publishContainerActivityClassAlive:"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r3)
            com.ss.android.ugc.aweme.property.h r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r4 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableOptimizePublishContainerActivityNotInStack
            boolean r3 = r3.mo83103a(r4)
            if (r3 == 0) goto L_0x01a0
            if (r2 != 0) goto L_0x01a0
            java.lang.String r2 = "enable_optimize_main_not_in_stack"
            r9.putExtra(r2, r0)
        L_0x01a0:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.f114131q
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x01b7
            com.ss.android.ugc.aweme.shortvideo.i.c r9 = new com.ss.android.ugc.aweme.shortvideo.i.c
            r9.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r9)
            java.lang.String r9 = "SaveDraft to DraftBox"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r9)
            r8.m98557p()
            goto L_0x01de
        L_0x01b7:
            com.ss.android.ugc.aweme.bb.a r0 = com.p683ss.android.ugc.aweme.p1426bb.C23763a.m58315a()
            android.content.Context r2 = r8.getContext()
            java.lang.String r3 = "SaveDraft"
            r0.mo49224a(r2, r3)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r9.addFlags(r0)
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            com.ss.android.ugc.aweme.port.in.ac r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101162c
            java.lang.Class r2 = r2.mo74159e()
            r9.setClass(r0, r2)
            java.lang.String r0 = "SaveDraft to Main"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r0)
            r8.startActivity(r9)
        L_0x01de:
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            r0 = 2131034155(0x7f05002b, float:1.767882E38)
            r9.overridePendingTransition(r1, r0)
            return
        L_0x01e9:
            boolean r9 = r8.f114105L
            if (r9 == 0) goto L_0x01f5
            com.ss.android.ugc.aweme.shortvideo.i.c r9 = new com.ss.android.ugc.aweme.shortvideo.i.c
            r9.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r9)
        L_0x01f5:
            java.lang.String r9 = "SaveDraft to OtherPlatform"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r9)
            r8.m98557p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45054bg.mo91424b(boolean):void");
    }

    /* renamed from: a */
    public final void mo91419a(final C45067a aVar) {
        if (getActivity().getIntent().getBooleanExtra("is_from_sys_share", false)) {
            C26890h.m65011a("login_notify", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").f61491a);
        }
        String string = getString(R.string.cvs);
        C23763a.m58315a().mo49224a(getContext(), "Login");
        C39618d.f101183x.mo74277a((Fragment) this, "video_edit_page", "click_shoot", C45422a.m98992a(string), (C39528a) new C39528a() {
            /* renamed from: b */
            public final void mo64372b() {
            }

            /* renamed from: a */
            public final void mo64371a() {
                if (C45054bg.this.f114130p != null) {
                    C45054bg.this.f114130p.mo90246d();
                }
                if (aVar != null && C39618d.f101152P.mo83103a(C40790a.EnableAutoProcessAfterLogin)) {
                    aVar.mo91433a();
                }
            }
        });
    }

    /* renamed from: a */
    private void m98547a(View view, OnTouchListener onTouchListener) {
        if (view.getId() != R.id.gf) {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m98547a(viewGroup.getChildAt(i), onTouchListener);
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m98548a(C29059c cVar, boolean z) {
        C0013i.m22b((Callable<TResult>) new C45076bp<TResult>(this, cVar, z)).mo20a((C0011g<TResult, TContinuationResult>) new C45075bo<TResult,TContinuationResult>(this), (Executor) C0013i.f24a);
    }

    /* renamed from: a */
    public static void m98549a(PermissionSettingItem permissionSettingItem, Activity activity) {
        boolean z;
        String str;
        if (permissionSettingItem != null && permissionSettingItem.getVisibility() == 0 && activity != null) {
            if (!TextUtils.equals("JP", C39618d.f101167h.mo74214a()) || !C39618d.f101152P.mo83103a(C40790a.CanShowPublishFriendGuide)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C23543g a = C23541e.m57714a(C39618d.f101160a, C39618d.f101174o.mo74236a());
                C22055c e = C39618d.f101183x.mo74285e();
                if (e == null || TextUtils.isEmpty(e.mo46159c())) {
                    str = "friends_only_uid_none";
                } else {
                    StringBuilder sb = new StringBuilder("friends_only_uid_");
                    sb.append(e.mo46159c());
                    str = sb.toString();
                }
                if (!a.mo48705a(str, false)) {
                    permissionSettingItem.postDelayed(new C45078br(permissionSettingItem, activity, a, str), 500);
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        m98547a(view, this.f114139y);
        Bundle arguments = getArguments();
        this.f114108O = arguments.getInt("music_rec_type", -1);
        this.f114131q = (VideoPublishEditModel) arguments.getSerializable("args");
        if (this.f114131q == null || this.f114131q.isPreviewInfoValid()) {
            boolean z3 = false;
            this.f114103J = arguments.getInt("extra_stick_point_type", 0);
            this.f114104K = arguments.getBoolean("enter_record_from_other_platform", false);
            this.f114111R = arguments.getBoolean("extra_enter_from_live", false);
            this.f114105L = arguments.getBoolean("edit_publish_session_end_together", false);
            StringBuilder sb = new StringBuilder("VideoPublishFragment filter_id_list:");
            sb.append(this.f114131q.mCurFilterIds);
            sb.append(" prop_list:");
            sb.append(this.f114131q.mStickerID);
            sb.append(" effect_list:");
            sb.append(this.f114131q.getEditEffectList());
            sb.append(" info_sticker_list:");
            sb.append(this.f114131q.getInfoStickerList());
            C50203g.m108363d(sb.toString());
            this.f114110Q = arguments.getBoolean("review_video_fast_publish", false);
            C39629l.m88232a().mo58586q();
            m98546a(view, bundle);
            if (this.f114131q.isReviewVideo() || this.f114131q.mIsFromDraft) {
                m98556o();
            }
            C43452bf.m95244a(getActivity());
            C42464bj bjVar = this.f114124j;
            String str = C42464bj.f107379a;
            C44364a aVar = C44364a.f112276b;
            VideoPublishEditModel videoPublishEditModel = this.f114131q;
            C52711k.m112240b(videoPublishEditModel, "videoEditViewModel");
            C39559e eVar = new C39559e();
            String editEffectList = videoPublishEditModel.getEditEffectList();
            C52711k.m112236a((Object) editEffectList, "videoEditViewModel.editEffectList");
            if (editEffectList.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(editEffectList);
                sb2.append(",");
                sb2.append(videoPublishEditModel.getStickers());
                editEffectList = sb2.toString();
            }
            if (editEffectList.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                editEffectList = videoPublishEditModel.getStickers();
                if (editEffectList == null) {
                    editEffectList = "";
                }
            }
            eVar.f101109b = editEffectList;
            eVar.f101108a = videoPublishEditModel.musicId;
            eVar.f101110c = "";
            if (TextUtils.isEmpty(videoPublishEditModel.mUploadPath)) {
                videoPublishEditModel.mUploadPath = (String) C44364a.f112275a.get(videoPublishEditModel.creationId);
            }
            eVar.f101111d = videoPublishEditModel.mUploadPath;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mShootWay", videoPublishEditModel.mShootWay);
            jSONObject.put("mIsFromDraft", videoPublishEditModel.mIsFromDraft);
            jSONObject.put("method", "getFromVideoEditModel");
            eVar.f101112e = jSONObject.toString();
            eVar.f101113f = C44364a.m97155a(videoPublishEditModel.creationId, "");
            CharSequence charSequence = eVar.f101111d;
            if (charSequence == null || charSequence.length() == 0) {
                z3 = true;
            }
            if (C39629l.m88232a().mo58583n().mo83104b(C40790a.RecommentMusicByAIPolicy) != 0) {
                C0013i.m18a((Callable<TResult>) new C44401a<TResult>(z3), (Executor) C26890h.m65003a());
            }
            bjVar.mo86594a(this, true, str, eVar);
            Context context = getContext();
            C52711k.m112240b(context, "context");
            C44506s a = C44482h.m97320a(context, C10193n.m20607a().mo18200a(PrePublishMinApiLevel2.class, "pre_publish_min_api_level_2", C10181b.m20511a().mo18175c().getPrePublishMinApiLevel2(), -1), C10193n.m20607a().mo18200a(PrePublishMinTotalMemoryMBLevel2.class, "pre_publish_min_total_memory_mb_level_2", C10181b.m20511a().mo18175c().getPrePublishMinTotalMemoryMbLevel2(), 1600), C10193n.m20607a().mo18200a(PrePublishMinAvailableMemoryMBLevel2.class, "pre_publish_min_available_memory_mb_level_2", C10181b.m20511a().mo18175c().getPrePublishMinAvailableMemoryMbLevel2(), -1), C10193n.m20607a().mo18200a(PrePublishMinJvmAvailableMemoryMBLevel2.class, "pre_publish_min_jvm_available_memory_mb_level_2", C10181b.m20511a().mo18175c().getPrePublishMinJvmAvailableMemoryMbLevel2(), -1));
            StringBuilder sb3 = new StringBuilder("PreSyntheticMachinePerformanceLimitLevel2 ");
            sb3.append(a.f112612b);
            C45407ay.m98968a(sb3.toString());
            this.f114138x = a.f112611a;
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
        C50203g.m108361b("VideoPublishPage finish because of null EditPreviewInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m98546a(android.view.View r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            r11 = r24
            android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m438a(r22)
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo> r1 = com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo.class
            android.arch.lifecycle.x r0 = r0.mo359a(r1)
            r12 = r0
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r12 = (com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo) r12
            r0 = 2132021545(0x7f141129, float:1.9681484E38)
            android.view.View r0 = r10.findViewById(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem r0 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem) r0
            r9.f114140z = r0
            com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem r0 = r9.f114140z
            com.ss.android.ugc.aweme.shortvideo.ui.bt r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bt
            r1.<init>(r9)
            r0.mo91079a(r1)
            com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem r0 = r9.f114140z
            r13 = 0
            com.ss.android.ugc.aweme.shortvideo.cq r0 = com.p683ss.android.ugc.aweme.shortvideo.C42559cq.m93454a(r9, r0, r13)
            r9.f114118d = r0
            com.ss.android.ugc.aweme.shortvideo.cq r0 = r9.f114118d
            com.ss.android.ugc.aweme.shortvideo.ui.bg$6 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bg$6
            r1.<init>()
            r0.mo86785a(r1)
            com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem r0 = r9.f114140z
            android.support.v4.app.FragmentActivity r1 = r22.getActivity()
            m98549a(r0, r1)
            android.arch.lifecycle.r r0 = r9.f114117c
            com.ss.android.ugc.aweme.shortvideo.ui.bx r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bx
            r1.<init>(r9, r12)
            r0.observe(r9, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.videocategory.C45492b.m99119a(r0)
            if (r0 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.shortvideo.videocategory.b r0 = new com.ss.android.ugc.aweme.shortvideo.videocategory.b
            android.support.v4.app.FragmentActivity r1 = r22.requireActivity()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r2 = r2.videoCategory
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r3.getAvetParameter()
            r0.<init>(r1, r2, r3, r10)
            r9.f114114U = r0
        L_0x006b:
            r0 = 2132017712(0x7f140230, float:1.967371E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r9.f114119e = r0
            r0 = 2132018689(0x7f140601, float:1.9675692E38)
            android.view.View r0 = r10.findViewById(r0)
            r9.f114120f = r0
            r0 = 2132020507(0x7f140d1b, float:1.967938E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r9.f114123i = r0
            r0 = 2132018190(0x7f14040e, float:1.967468E38)
            android.view.View r0 = r10.findViewById(r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r0
            r9.f114115a = r0
            r0 = 2132017462(0x7f140136, float:1.9673203E38)
            android.view.View r0 = r10.findViewById(r0)
            r9.f114094A = r0
            r0 = 2132017461(0x7f140135, float:1.9673201E38)
            android.view.View r0 = r10.findViewById(r0)
            r9.f114095B = r0
            r0 = 2132018756(0x7f140644, float:1.9675828E38)
            android.view.View r0 = r10.findViewById(r0)
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r0 = (com.p683ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText) r0
            r9.f114096C = r0
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r0 = r9.f114096C
            r0.requestFocus()
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r0 = r9.f114096C
            android.view.View r1 = r9.f114094A
            android.view.View r2 = r9.f114095B
            com.ss.android.ugc.aweme.shortvideo.fl r0 = com.p683ss.android.ugc.aweme.shortvideo.C43839fl.m96268a(r9, r0, r1, r2, r13)
            r9.f114122h = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r0 = r0.creationId
            com.ss.android.ugc.aweme.shortvideo.fl r1 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.bj r0 = com.p683ss.android.ugc.aweme.shortvideo.C42464bj.m93292a(r0, r1, r10)
            r9.f114124j = r0
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            r0.mo89371a()
            r0 = 2132019610(0x7f14099a, float:1.967756E38)
            android.view.View r0 = r10.findViewById(r0)
            com.facebook.drawee.view.SimpleDraweeView r0 = (com.facebook.drawee.view.SimpleDraweeView) r0
            r9.f114125k = r0
            com.facebook.drawee.view.SimpleDraweeView r0 = r9.f114125k
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r0 = r0.getVideoCoverPath()
            if (r0 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r0 = r0.getVideoCoverPath()
            com.p683ss.android.ugc.aweme.video.C48016e.m103947c(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            r0.generateVideoCoverPath()
        L_0x0102:
            r22.m98560s()
            com.facebook.drawee.view.SimpleDraweeView r0 = r9.f114125k
            com.ss.android.ugc.aweme.shortvideo.ui.bg$8 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bg$8
            r2 = 600(0x258, float:8.41E-43)
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            r0 = 2132018032(0x7f140370, float:1.967436E38)
            android.view.View r0 = r10.findViewById(r0)
            r9.f114126l = r0
            android.view.View r0 = r9.f114126l
            com.ss.android.ugc.aweme.shortvideo.ui.bg$2 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bg$2
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.f114120f
            r1 = 2132021991(0x7f1412e7, float:1.968239E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.ss.android.ugc.aweme.property.h r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewPublishShareDescription
            boolean r1 = r1.mo83103a(r2)
            if (r1 == 0) goto L_0x0141
            if (r0 == 0) goto L_0x0141
            r1 = 2132549127(0x7f1c1e07, float:2.0751548E38)
            r0.setText(r1)
        L_0x0141:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            r14 = 1
            if (r0 == 0) goto L_0x017b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.mIsFromDraft
            if (r0 != 0) goto L_0x017b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.publishFromLive()
            if (r0 == 0) goto L_0x017b
            android.app.Activity[] r0 = com.p683ss.android.ugc.aweme.utils.ActivityStack.getActivityStack()
            int r1 = r0.length
            r2 = 0
        L_0x015a:
            if (r2 >= r1) goto L_0x0173
            r3 = r0[r2]
            java.lang.Class r3 = r3.getClass()
            com.ss.android.ugc.aweme.port.in.ac r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101162c
            java.lang.Class r4 = r4.mo74166l()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0170
            r0 = 1
            goto L_0x0174
        L_0x0170:
            int r2 = r2 + 1
            goto L_0x015a
        L_0x0173:
            r0 = 0
        L_0x0174:
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = "publish container is live"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r0)
        L_0x017b:
            android.view.View r0 = r9.f114120f
            r1 = 2132021990(0x7f1412e6, float:1.9682387E38)
            android.view.View r0 = r0.findViewById(r1)
            r9.f114127m = r0
            android.view.View r0 = r9.f114127m
            com.ss.android.ugc.aweme.shortvideo.ui.bg$9 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bg$9
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.f114120f
            r1 = 2132018685(0x7f1405fd, float:1.9675684E38)
            android.view.View r0 = r0.findViewById(r1)
            r9.f114128n = r0
            android.view.View r0 = r9.f114128n
            com.ss.android.ugc.aweme.shortvideo.ui.bg$10 r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bg$10
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.util.List r0 = r0.challenges
            if (r0 == 0) goto L_0x01bd
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01bd
            com.ss.android.ugc.aweme.shortvideo.publish.b r1 = r9.f114121g
            java.lang.Object r0 = r0.get(r13)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r0
            r1.f112277a = r0
        L_0x01bd:
            com.ss.android.ugc.aweme.port.in.be r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101174o
            com.ss.android.ugc.aweme.port.in.be$a r0 = r0.mo74238b()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            int r1 = r1.isPrivate
            if (r1 != r14) goto L_0x01cb
            r1 = 1
            goto L_0x01cc
        L_0x01cb:
            r1 = 0
        L_0x01cc:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.mo74246a(r1)
            android.arch.lifecycle.r r0 = r9.f114117c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            int r1 = r1.isPrivate
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.mIsFromDraft
            r1 = 2
            if (r0 != 0) goto L_0x021f
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.DefaultPublishPrivacyType
            int r0 = r0.mo83104b(r2)
            android.arch.lifecycle.r r2 = r9.f114117c
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            switch(r0) {
                case 0: goto L_0x0215;
                case 1: goto L_0x0213;
                case 2: goto L_0x0211;
                case 3: goto L_0x0200;
                default: goto L_0x01fe;
            }
        L_0x01fe:
            r0 = r2
            goto L_0x0216
        L_0x0200:
            android.app.Application r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache> r2 = com.p683ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache.class
            java.lang.Object r0 = com.p683ss.android.ugc.aweme.common.p1595g.C26888e.m65000a(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache r0 = (com.p683ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache) r0
            if (r0 == 0) goto L_0x0215
            int r0 = r0.getPublishPermission(r13)
            goto L_0x0216
        L_0x0211:
            r0 = 2
            goto L_0x0216
        L_0x0213:
            r0 = 1
            goto L_0x0216
        L_0x0215:
            r0 = 0
        L_0x0216:
            android.arch.lifecycle.r r2 = r9.f114117c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.setValue(r0)
        L_0x021f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r0 = r0.title
            if (r0 == 0) goto L_0x023f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r0 = r0.title
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x023f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            java.lang.String r2 = r2.title
            java.lang.String r2 = r2.trim()
            r0.title = r2
        L_0x023f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r0.stitchParams
            if (r0 == 0) goto L_0x026b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r0.stitchParams
            java.lang.String r0 = r0.getChain()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026b
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            java.lang.String r2 = r2.title
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r3 = r3.stitchParams
            java.lang.String r3 = r3.getChain()
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r4 = r0.f111009b
            r4.setText(r2)
            r0.f111018k = r3
            r0.f111019l = r14
            goto L_0x0274
        L_0x026b:
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            java.lang.String r2 = r2.title
            r0.mo89375a(r2)
        L_0x0274:
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            java.lang.String r2 = r2.creationId
            r0.f111014g = r2
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r3 = r0.f111009b
            if (r3 == 0) goto L_0x0285
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r0 = r0.f111009b
            r0.setCreationId(r2)
        L_0x0285:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.isDuet()
            if (r0 == 0) goto L_0x0293
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            r0.mo89372a(r14)
            goto L_0x02af
        L_0x0293:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.isReaction()
            if (r0 == 0) goto L_0x02a1
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            r0.mo89372a(r1)
            goto L_0x02af
        L_0x02a1:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r0 = r0.isCommentReply()
            if (r0 == 0) goto L_0x02af
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            r1 = 3
            r0.mo89372a(r1)
        L_0x02af:
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            java.util.List r1 = r1.structList
            r0.mo89379b(r1)
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            java.util.List r1 = r1.challenges
            r0.mo89376a(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r0.stickerChallenge
            if (r0 == 0) goto L_0x031b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r0.stickerChallenge
            java.util.Collection r0 = r0.infoStickerChallenges()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x031b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r0 = r0.stickerChallenge
            java.util.Collection r0 = r0.infoStickerChallenges()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            java.util.List r2 = r2.challenges
            if (r2 == 0) goto L_0x0313
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f114131q
            java.util.List r2 = r2.challenges
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02f3
            goto L_0x0313
        L_0x02f3:
            java.util.Iterator r0 = r0.iterator()
        L_0x02f7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0316
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r2
            if (r2 == 0) goto L_0x02f7
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f114131q
            java.util.List r3 = r3.challenges
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L_0x02f7
            r1.add(r2)
            goto L_0x02f7
        L_0x0313:
            r1.addAll(r0)
        L_0x0316:
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            r0.mo89376a(r1)
        L_0x031b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.util.List r0 = r0.challenges
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 != 0) goto L_0x0368
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.util.List r0 = r0.challenges
            java.util.Iterator r0 = r0.iterator()
        L_0x032d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0368
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r1 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r1
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r2 = r1.mentionedUsers
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x032d
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r1 = r1.mentionedUsers
            java.util.Iterator r1 = r1.iterator()
        L_0x0347:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x032d
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.discover.model.TaskMentionedUser r2 = (com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser) r2
            com.ss.android.ugc.aweme.shortvideo.fl r3 = r9.f114122h
            java.lang.String r4 = r2.getNickname()
            java.lang.String r2 = r2.getUserId()
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r5 = r3.f111009b
            r5.mo95669a(r13, r4, r2)
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r2 = r3.f111009b
            r2.mo91795b()
            goto L_0x0347
        L_0x0368:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel r0 = r0.mentionUserModel
            r15 = 0
            if (r0 == 0) goto L_0x03cb
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel r0 = r0.mentionUserModel
            java.util.List r0 = com.p683ss.android.ugc.aweme.utils.C47951r.m103760a(r0)
            if (r0 == 0) goto L_0x03cb
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x03cb
            java.util.Iterator r0 = r0.iterator()
        L_0x0383:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03cb
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p683ss.android.ugc.aweme.profile.model.User) r1
            if (r1 != 0) goto L_0x0392
            goto L_0x0383
        L_0x0392:
            com.ss.android.ugc.aweme.shortvideo.fl r2 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r3 = r2.f111009b
            java.lang.String r4 = "mWidget"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            if (r1 == 0) goto L_0x03a2
            java.lang.String r4 = r1.getUniqueId()
            goto L_0x03a3
        L_0x03a2:
            r4 = r15
        L_0x03a3:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x03b4
            if (r1 == 0) goto L_0x03b2
            java.lang.String r4 = r1.getShortId()
            goto L_0x03ba
        L_0x03b2:
            r4 = r15
            goto L_0x03ba
        L_0x03b4:
            if (r1 == 0) goto L_0x03b2
            java.lang.String r4 = r1.getUniqueId()
        L_0x03ba:
            if (r1 == 0) goto L_0x03c1
            java.lang.String r1 = r1.getUid()
            goto L_0x03c2
        L_0x03c1:
            r1 = r15
        L_0x03c2:
            r3.mo95669a(r13, r4, r1)
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r1 = r2.f111009b
            r1.mo91795b()
            goto L_0x0383
        L_0x03cb:
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r0 = r0.f111009b
            r0.mo91794a(r14)
            if (r11 == 0) goto L_0x03ff
            com.ss.android.ugc.aweme.shortvideo.publish.b r0 = r9.f114121g
            java.lang.String r1 = "challenge"
            java.io.Serializable r1 = r11.getSerializable(r1)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r1 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r1
            r0.f112277a = r1
            android.arch.lifecycle.r r0 = r9.f114117c
            java.lang.String r1 = "permission"
            int r1 = r11.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
            java.lang.String r0 = "contentModified"
            boolean r0 = r11.getBoolean(r0)
            r9.f114132r = r0
            java.lang.String r0 = "publish_id"
            java.lang.String r0 = r11.getString(r0)
            r9.f114112S = r0
        L_0x03ff:
            java.util.List<android.support.v4.f.k<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r0 = r9.f114102I
            java.util.Iterator r16 = r0.iterator()
        L_0x0405:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0470
            java.lang.Object r0 = r16.next()
            android.support.v4.f.k r0 = (android.support.p030v4.p038f.C0794k) r0
            S r0 = r0.f2712b
            r17 = r0
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r17 = (com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension) r17
            r0 = 2132018934(0x7f1406f6, float:1.9676189E38)
            android.view.View r0 = r10.findViewById(r0)
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            com.ss.android.ugc.aweme.services.publish.AVPublishContentType r19 = com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType.Video
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.services.publish.PublishOutput r20 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43448bc.m95233a(r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r21 = new com.ss.android.ugc.aweme.services.publish.ExtensionMisc
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r1 = r0.poiData
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.draft.model.e r2 = r0.defaultSelectStickerPoi
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r3 = r0.poiId
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.edit.o r4 = r0.microAppModel
            com.ss.android.ugc.aweme.services.publish.MobParam r7 = new com.ss.android.ugc.aweme.services.publish.MobParam
            java.lang.String r0 = "video_post_page"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r9.f114131q
            java.lang.String r5 = r5.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r9.f114131q
            java.lang.String r6 = r6.creationId
            r7.<init>(r0, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            boolean r8 = com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e.m101399a(r0)
            r0 = r21
            r5 = r22
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.ui.by r7 = new com.ss.android.ugc.aweme.shortvideo.ui.by
            r7.<init>(r9)
            r0 = r17
            r1 = r22
            r2 = r18
            r3 = r24
            r4 = r19
            r5 = r20
            r6 = r21
            r0.onCreate(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0405
        L_0x0470:
            java.util.List<android.support.v4.f.k<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r0 = r9.f114102I
            java.util.Iterator r0 = r0.iterator()
        L_0x0476:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x048a
            java.lang.Object r1 = r0.next()
            android.support.v4.f.k r1 = (android.support.p030v4.p038f.C0794k) r1
            S r1 = r1.f2712b
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r1 = (com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension) r1
            r1.onCreateFinish()
            goto L_0x0476
        L_0x048a:
            r0 = 2132022084(0x7f141344, float:1.9682578E38)
            android.view.View r0 = r10.findViewById(r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r0
            r9.f114116b = r0
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r1 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioDuetChangeLayout
            boolean r0 = r0.mo83103a(r1)
            if (r0 == 0) goto L_0x04c2
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r1 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEnableStitch
            boolean r0 = r0.mo83103a(r1)
            if (r0 == 0) goto L_0x04b6
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.f114116b
            r1 = 2132541867(0x7f1c01ab, float:2.0736823E38)
            java.lang.String r1 = r9.getString(r1)
            r0.setLeftText(r1)
            goto L_0x04c2
        L_0x04b6:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.f114116b
            r1 = 2132541862(0x7f1c01a6, float:2.0736813E38)
            java.lang.String r1 = r9.getString(r1)
            r0.setLeftText(r1)
        L_0x04c2:
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r1 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioEnableStitch
            boolean r0 = r0.mo83103a(r1)
            if (r0 == 0) goto L_0x04d8
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.f114116b
            r1 = 2132547776(0x7f1c18c0, float:2.0748808E38)
            java.lang.String r1 = r9.getString(r1)
            r0.setLeftText(r1)
        L_0x04d8:
            com.ss.android.ugc.aweme.shortvideo.publish.h r0 = new com.ss.android.ugc.aweme.shortvideo.publish.h
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            boolean r1 = r1.mIsFromDraft
            r2 = 5
            r0.<init>(r9, r1, r2)
            r9.f114130p = r0
            com.ss.android.ugc.aweme.shortvideo.publish.h r0 = r9.f114130p
            android.widget.LinearLayout r1 = r9.f114123i
            r0.mo90240a(r1)
            com.ss.android.ugc.aweme.shortvideo.publish.h r2 = r9.f114130p
            android.widget.LinearLayout r3 = r9.f114123i
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f114131q
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            if (r0 != 0) goto L_0x04f7
        L_0x04f5:
            r5 = r15
            goto L_0x051d
        L_0x04f7:
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.lang.String r0 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            java.lang.String r1 = r1.creationId
            r15.put(r0, r1)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "video_post_page"
            r15.put(r0, r1)
            java.lang.String r0 = "content_type"
            java.lang.String r1 = "video"
            r15.put(r0, r1)
            java.lang.String r0 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            java.lang.String r1 = r1.mShootWay
            r15.put(r0, r1)
            goto L_0x04f5
        L_0x051d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114131q
            java.lang.String r6 = r0.creationId
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r7 = r9.f114116b
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r8 = r9.f114115a
            r2.mo90241a(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.dk r0 = com.p683ss.android.ugc.aweme.shortvideo.C43217dk.m94834a(r9, r10, r14)
            r9.f114129o = r0
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.publish.C44372f.m97167a()
            if (r0 == 0) goto L_0x0541
            com.ss.android.ugc.aweme.shortvideo.dk r0 = r9.f114129o
            com.ss.android.ugc.aweme.port.in.bl$a r0 = r0.f109303a
            com.ss.android.ugc.aweme.shortvideo.ui.bz r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bz
            r1.<init>(r9)
            r0.mo74255a(r14, r1)
            goto L_0x0571
        L_0x0541:
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 == 0) goto L_0x0553
            boolean r0 = r0.isPreventDownload()
            if (r0 == 0) goto L_0x0553
            r0 = 1
            goto L_0x0554
        L_0x0553:
            r0 = 0
        L_0x0554:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0571
            com.ss.android.ugc.aweme.shortvideo.dk r0 = r9.f114129o
            com.ss.android.ugc.aweme.port.in.bl$a r0 = r0.f109303a
            r0.mo74256a(r14, r13)
            com.ss.android.ugc.aweme.shortvideo.dk r0 = r9.f114129o
            com.ss.android.ugc.aweme.port.in.bl$a r0 = r0.f109303a
            com.ss.android.ugc.aweme.shortvideo.ui.ca r1 = new com.ss.android.ugc.aweme.shortvideo.ui.ca
            r1.<init>(r9)
            r0.mo74255a(r14, r1)
        L_0x0571:
            com.ss.android.ugc.aweme.shortvideo.dk r0 = r9.f114129o
            java.lang.String r1 = "syncModule"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.String r1 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r1)
            com.ss.android.ugc.aweme.property.h r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.UseNewPublishShareDescription
            com.ss.android.ugc.aweme.property.aa$a r2 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r2
            boolean r1 = r1.mo83103a(r2)
            if (r1 == 0) goto L_0x0595
            com.ss.android.ugc.aweme.port.in.bl$a r2 = r0.f109303a
            r3 = 2132549136(0x7f1c1e10, float:2.0751566E38)
            java.lang.String r3 = r9.getString(r3)
            r2.mo74258a(r3)
        L_0x0595:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x05b3 }
            java.lang.String r3 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x05b3 }
            java.lang.Boolean r2 = r2.getSilentShareConfigurable()     // Catch:{ a -> 0x05b3 }
            java.lang.String r3 = "SettingsReader.get().silentShareConfigurable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x05b3 }
            boolean r2 = r2.booleanValue()     // Catch:{ a -> 0x05b3 }
            if (r2 == 0) goto L_0x05b1
            if (r1 != 0) goto L_0x05b1
            r1 = 1
            goto L_0x05b4
        L_0x05b1:
            r1 = 0
            goto L_0x05b4
        L_0x05b3:
            r1 = r1 ^ r14
        L_0x05b4:
            if (r1 == 0) goto L_0x05c2
            com.ss.android.ugc.aweme.port.in.bl$a r0 = r0.f109303a
            r1 = 2132549086(0x7f1c1dde, float:2.0751465E38)
            java.lang.String r1 = r9.getString(r1)
            r0.mo74258a(r1)
        L_0x05c2:
            com.ss.android.ugc.aweme.shortvideo.dk r0 = r9.f114129o
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f114131q
            if (r1 == 0) goto L_0x05f2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "creation_id"
            java.lang.String r4 = r1.creationId
            r2.put(r3, r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "video_post_page"
            r2.put(r3, r4)
            java.lang.String r3 = "content_type"
            java.lang.String r4 = "video"
            r2.put(r3, r4)
            java.lang.String r3 = "shoot_way"
            java.lang.String r1 = r1.mShootWay
            r2.put(r3, r1)
            com.ss.android.ugc.aweme.port.in.bl$a r0 = r0.f109303a
            android.view.View r0 = r0.mo74261d()
            r0.setTag(r2)
        L_0x05f2:
            android.arch.lifecycle.r r0 = r9.f114117c
            com.ss.android.ugc.aweme.shortvideo.ui.cb r1 = new com.ss.android.ugc.aweme.shortvideo.ui.cb
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.ss.android.ugc.aweme.shortvideo.fl r0 = r9.f114122h
            r0.mo89374a(r9)
            r0 = 2132018024(0x7f140368, float:1.9674343E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r9.f114100G = r0
            r0 = 2132019142(0x7f1407c6, float:1.967661E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.f114101H = r0
            android.content.Context r0 = r22.getContext()
            android.widget.FrameLayout r1 = r9.f114101H
            android.widget.CheckBox r2 = r9.f114100G
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.lang.String r0 = "mSaveFl"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
            java.lang.String r0 = "mSaveCheck"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            r0 = 8
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.port.in.am r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101137A
            boolean r1 = r1.mo74204a()
            if (r1 == 0) goto L_0x0674
            r1 = 2132023214(0x7f1417ae, float:1.968487E38)
            android.view.View r1 = r10.findViewById(r1)
            r1.setVisibility(r0)
            r1 = 2132021268(0x7f141014, float:1.9680923E38)
            android.view.View r2 = r10.findViewById(r1)
            r2.setVisibility(r13)
            android.widget.FrameLayout r2 = r9.f114101H
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r3 = 6
            r2.addRule(r3, r1)
            r2.addRule(r0, r1)
            android.widget.FrameLayout r1 = r9.f114101H
            r1.setLayoutParams(r2)
            android.widget.CheckBox r1 = r9.f114100G
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = 16
            r1.gravity = r2
            android.widget.CheckBox r2 = r9.f114100G
            r2.setLayoutParams(r1)
        L_0x0674:
            com.ss.android.ugc.aweme.port.in.aa r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101183x
            com.ss.android.ugc.aweme.account.model.c r1 = r1.mo74285e()
            if (r1 == 0) goto L_0x06a4
            boolean r1 = r1.mo46160d()
            if (r1 == 0) goto L_0x06a4
            com.ss.android.ugc.aweme.port.in.am r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101137A
            boolean r1 = r1.mo74204a()
            if (r1 != 0) goto L_0x06a4
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0697 }
            java.lang.Boolean r1 = r1.getSilentShareConfigurable()     // Catch:{ a -> 0x0697 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x0697 }
            r14 = r1
        L_0x0697:
            if (r14 == 0) goto L_0x06a4
            com.ss.android.ugc.aweme.shortvideo.dk r1 = r9.f114129o
            com.ss.android.ugc.aweme.port.in.bl$a r1 = r1.f109303a
            android.view.View r1 = r1.mo74261d()
            r1.setVisibility(r0)
        L_0x06a4:
            r22.m98551b(r23)
            com.bytedance.ies.abmock.n r0 = com.bytedance.ies.abmock.C10193n.m20607a()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.util.VideoPublishHintDescriptionSettings> r1 = com.p683ss.android.ugc.aweme.shortvideo.util.VideoPublishHintDescriptionSettings.class
            java.lang.String r2 = "video_description"
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = r3.mo18175c()
            java.lang.String r3 = r3.getVideoDescription()
            java.lang.String r4 = ""
            java.lang.String r0 = r0.mo18203a(r1, r2, r3, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x06cc
            com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText r1 = r9.f114096C
            r1.setHint(r0)
        L_0x06cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45054bg.m98546a(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.qx, viewGroup, false);
        C45380af.m98935a().mo91715a(getActivity(), (ViewGroup) inflate.findViewById(R.id.a9b));
        return inflate;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (C0794k kVar : this.f114102I) {
            ((IAVPublishExtension) kVar.f2712b).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ C52860x m98544a(C29059c cVar, boolean z, Workspace workspace) {
        C29059c cVar2 = cVar;
        if (C43223dp.m94850a()) {
            C43670c cVar3 = new C43670c();
            C52847n nVar = new C52847n(cVar.mo58777an().curMultiEditVideoRecordData, cVar2.f76142T.f76082ak);
            C52711k.m112240b(nVar, "data");
            C43672e eVar = new C43672e(cVar3.f110579a, cVar3.f110580b, cVar3.f110581c, cVar3.f110582d);
            List<MultiEditVideoSegmentRecordData> list = ((MultiEditVideoRecordData) nVar.getFirst()).segmentDataList;
            C52711k.m112236a((Object) list, "data.first.segmentDataList");
            Iterable<MultiEditVideoSegmentRecordData> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : iterable) {
                String str = multiEditVideoSegmentRecordData.draftVideoPath;
                C52711k.m112236a((Object) str, "it.draftVideoPath");
                String str2 = multiEditVideoSegmentRecordData.draftAudioPath;
                C43670c cVar4 = cVar3;
                VideoFileInfo videoFileInfo = r10;
                VideoFileInfo videoFileInfo2 = new VideoFileInfo(cVar3.f110579a, cVar3.f110580b, multiEditVideoSegmentRecordData.videoLength, -100, 0, 16, null);
                arrayList.add(new EditVideoSegment(str, str2, videoFileInfo));
                cVar3 = cVar4;
            }
            EditPreviewInfo a = eVar.mo89102a(C52575l.m112139e((Collection<? extends T>) (List) arrayList));
            a.setReverseAudioArray(((EditPreviewInfo) nVar.getSecond()).getReverseVideoArray());
            a.setReverseVideoArray(((EditPreviewInfo) nVar.getSecond()).getReverseVideoArray());
            cVar2.mo58753a(a);
        }
        EditPreviewInfo editPreviewInfo = cVar2.f76142T.f76082ak;
        if (editPreviewInfo != null) {
            List videoList = editPreviewInfo.getVideoList();
            if (!C9414h.m18630a(videoList)) {
                String videoPath = ((EditVideoSegment) videoList.get(0)).getVideoPath();
                if (videoPath != null && videoPath.endsWith("/tmp/1_frag_v")) {
                    C50203g.m108361b("draft path end with tmp");
                    C9220a.m18310a("draft path end with tmp");
                }
            }
        }
        C39618d.f101144H.mo58573d().mo80734b(cVar2);
        C43668b.m95937a(cVar);
        if (z) {
            workspace.mo86462i();
        }
        C43306a.m94978a();
        return null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C0794k kVar : this.f114102I) {
            ((IAVPublishExtension) kVar.f2712b).onActivityResult(i, i2, intent);
        }
        this.f114129o.mo87868a(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
                this.f114121g.f112277a = null;
            } else if (intent != null) {
                this.f114121g.f112277a = (AVChallenge) intent.getSerializableExtra("challenge");
            }
            this.f114132r = true;
        }
        if (i == 2 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
            if (C39618d.f101152P.mo83104b(C40790a.DefaultPublishPrivacyType) == 3) {
                IPublishPermissionCache iPublishPermissionCache = (IPublishPermissionCache) C26888e.m65000a(C39618d.f101160a, IPublishPermissionCache.class);
                if (iPublishPermissionCache != null) {
                    iPublishPermissionCache.setPublishPermission(intExtra);
                }
            }
            String str = "public";
            switch (intExtra) {
                case 0:
                    str = "public";
                    break;
                case 1:
                    str = "private";
                    break;
                case 2:
                    str = "friends";
                    break;
            }
            C26890h.m65011a("select_privacy_setting", C23089d.m56640a().mo47829a("creation_id", this.f114131q.creationId).mo47829a("shoot_way", this.f114131q.mShootWay).mo47829a("content_source", m98545a(this.f114131q)).mo47829a("content_type", mo91430l()).mo47829a("enter_from", "video_post_page").mo47829a("to_status", str).f61491a);
            this.f114117c.setValue(Integer.valueOf(intent.getIntExtra("extra.PERMISSION", 0)));
            this.f114132r = true;
        }
        if (i == 3 && i2 == -1) {
            this.f114122h.mo89373a(intent);
            this.f114132r = true;
        }
        if (i == 4 && i2 == -1) {
            if (this.f114138x) {
                m98558q();
            }
            if (!(intent == null || intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT") == null)) {
                this.f114131q = (VideoPublishEditModel) intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
                m98560s();
            }
        }
        if (6 == i && -1 == i2 && intent != null && this.f114131q != null) {
            this.f114131q.videoCategory = (VideoCategoryParam) intent.getParcelableExtra("KEY_VIDEO_CATEGORY_CHOOSE_RESULT");
            this.f114114U.mo91765a(this.f114131q.videoCategory);
        }
        if (this.f114130p != null) {
            this.f114130p.mo90239a(i, i2, intent);
        }
    }
}

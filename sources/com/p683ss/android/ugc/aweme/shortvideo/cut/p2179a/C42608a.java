package com.p683ss.android.ugc.aweme.shortvideo.cut.p2179a;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.services.cutvideo.DisplayVideoView;
import com.p683ss.android.ugc.aweme.services.cutvideo.ICutVideo;
import com.p683ss.android.ugc.aweme.services.cutvideo.ICutVideoListener;
import com.p683ss.android.ugc.aweme.services.cutvideo.ICutViewInternal;
import com.p683ss.android.ugc.aweme.services.cutvideo.IDisplayVideo;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42650i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C42583d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42837b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Locale;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a */
public final class C42608a implements ICutVideo, ICutViewInternal {

    /* renamed from: a */
    public VEVideoEditView f107783a;

    /* renamed from: b */
    CutMultiVideoViewModel f107784b;

    /* renamed from: c */
    public VEVideoCutterViewModel f107785c;

    /* renamed from: d */
    public VideoEditViewModel f107786d;

    /* renamed from: e */
    public C42621b f107787e;

    /* renamed from: f */
    public int f107788f;

    /* renamed from: g */
    public final C43168a f107789g = new C43168a(3, 0, C50743d.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: h */
    public ICutVideoListener f107790h;

    /* renamed from: i */
    private Context f107791i;

    /* renamed from: j */
    private TextView f107792j;

    /* renamed from: k */
    private String f107793k = "";

    /* renamed from: l */
    private String f107794l = "";

    /* renamed from: m */
    private long f107795m;

    /* renamed from: n */
    private long f107796n;

    /* renamed from: o */
    private long f107797o = C43307ea.m94995a();

    /* renamed from: p */
    private final int f107798p = 3600000;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$a */
    static final class C42609a<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107799a;

        C42609a(C42608a aVar) {
            this.f107799a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    C42608a.m93526a(this.f107799a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107799a).getPlayingPosition(), C50743d.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$b */
    static final class C42610b<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107800a;

        C42610b(C42608a aVar) {
            this.f107800a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42608a.m93526a(this.f107800a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107800a).getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$c */
    static final class C42611c<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107801a;

        C42611c(C42608a aVar) {
            this.f107801a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42608a.m93526a(this.f107801a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107801a).getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$d */
    static final class C42612d<T> implements C0199s<Long> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107802a;

        C42612d(C42608a aVar) {
            this.f107802a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                C42608a.m93526a(this.f107802a).mo87731a(new C43168a(3, l.longValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$e */
    static final class C42613e<T> implements C0199s<Float> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107803a;

        C42613e(C42608a aVar) {
            this.f107803a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            this.f107803a.mo86845d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$f */
    static final class C42614f<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107804a;

        C42614f(C42608a aVar) {
            this.f107804a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42608a.m93526a(this.f107804a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107804a).getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            this.f107804a.mo86845d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$g */
    static final class C42615g<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107805a;

        C42615g(C42608a aVar) {
            this.f107805a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42608a.m93526a(this.f107805a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107805a).getRightSeekingValue(), C50743d.EDITOR_SEEK_FLAG_OnGoing));
            this.f107805a.mo86845d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$h */
    static final class C42616h<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107806a;

        C42616h(C42608a aVar) {
            this.f107806a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42608a.m93526a(this.f107806a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107806a).getLeftSeekingValue(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            this.f107806a.mo86845d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$i */
    static final class C42617i<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107807a;

        C42617i(C42608a aVar) {
            this.f107807a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C42608a.m93526a(this.f107807a).mo87731a(new C43168a(3, C42608a.m93527b(this.f107807a).getRightSeekingValue(), C50743d.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            this.f107807a.mo86845d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$j */
    static final class C42618j<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107808a;

        C42618j(C42608a aVar) {
            this.f107808a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            this.f107808a.f107789g.f109119b = C42608a.m93527b(this.f107808a).getPlayingPosition();
            C42608a.m93526a(this.f107808a).mo87731a(this.f107808a.f107789g);
            this.f107808a.mo86845d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$k */
    static final class C42619k<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C42608a f107809a;

        C42619k(C42608a aVar) {
            this.f107809a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            long singlePlayingPosition = C42608a.m93527b(this.f107809a).getSinglePlayingPosition();
            VECutVideoPresenter d = C42608a.m93528c(this.f107809a).mo86859d();
            C0794k playBoundary = C42608a.m93527b(this.f107809a).getPlayBoundary();
            C52711k.m112236a((Object) playBoundary, "videoEditView.playBoundary");
            d.mo86813a(playBoundary);
            C42608a.m93526a(this.f107809a).mo87731a(new C43168a(3, singlePlayingPosition, C50743d.EDITOR_SEEK_FLAG_LastSeek));
            this.f107809a.mo86845d();
            VECutVideoPresenter d2 = C42608a.m93528c(this.f107809a).mo86859d();
            VideoEditViewModel videoEditViewModel = this.f107809a.f107786d;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo87634l().get(this.f107809a.f107788f);
            F f = C42608a.m93527b(this.f107809a).getPlayBoundary().f2711a;
            if (f == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) f, "videoEditView.playBoundary.first!!");
            long longValue = ((Number) f).longValue();
            S s = C42608a.m93527b(this.f107809a).getPlayBoundary().f2712b;
            if (s == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) s, "videoEditView.playBoundary.second!!");
            d2.mo86815a(videoSegment, longValue, ((Number) s).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a$l */
    public static final class C42620l implements C42837b {

        /* renamed from: a */
        final /* synthetic */ C42608a f107810a;

        public final void onCompileDone() {
            ICutVideoListener iCutVideoListener = this.f107810a.f107790h;
            if (iCutVideoListener != null) {
                iCutVideoListener.onCompileDone();
            }
        }

        C42620l(C42608a aVar) {
            this.f107810a = aVar;
        }

        /* renamed from: a */
        public final void mo86846a(boolean z) {
            ICutVideoListener iCutVideoListener = this.f107810a.f107790h;
            if (iCutVideoListener != null) {
                iCutVideoListener.onStart();
            }
        }

        public final void onCompileProgress(float f) {
            ICutVideoListener iCutVideoListener = this.f107810a.f107790h;
            if (iCutVideoListener != null) {
                iCutVideoListener.onCompileProgress(f);
            }
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            ICutVideoListener iCutVideoListener = this.f107810a.f107790h;
            if (iCutVideoListener != null) {
                iCutVideoListener.onCompileError(i, i2, f, str);
            }
        }
    }

    public final ICutVideo getProxy() {
        return this;
    }

    public final void setProxy(ICutVideo iCutVideo) {
        C52711k.m112240b(iCutVideo, "proxy");
    }

    public final void restore() {
        VEVideoEditView vEVideoEditView = this.f107783a;
        if (vEVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        vEVideoEditView.mo87585q();
    }

    /* renamed from: a */
    public final VEVideoEditView mo86842a() {
        VEVideoEditView vEVideoEditView = this.f107783a;
        if (vEVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        return vEVideoEditView;
    }

    /* renamed from: b */
    public final VEVideoCutterViewModel mo86843b() {
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f107785c;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public final VideoEditViewModel mo86844c() {
        VideoEditViewModel videoEditViewModel = this.f107786d;
        if (videoEditViewModel == null) {
            C52711k.m112237a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: d */
    public final void mo86845d() {
        Locale locale = Locale.getDefault();
        C52711k.m112236a((Object) locale, "Locale.getDefault()");
        String str = "%.1f";
        Object[] objArr = new Object[1];
        VEVideoEditView vEVideoEditView = this.f107783a;
        if (vEVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        objArr[0] = Float.valueOf(vEVideoEditView.getSelectedTime());
        String a = C2240a.m6773a(locale, str, Arrays.copyOf(objArr, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
        Context context = this.f107791i;
        if (context == null) {
            C52711k.m112237a("context");
        }
        String string = context.getResources().getString(R.string.c8j, new Object[]{a});
        TextView textView = this.f107792j;
        if (textView == null) {
            C52711k.m112237a("tvTime");
        }
        textView.setText(string);
    }

    public final void compile() {
        boolean z;
        long j;
        Context context = this.f107791i;
        if (context == null) {
            C52711k.m112237a("context");
        }
        Activity a = C18998a.m46169a(context);
        if ((a == null || !a.isFinishing()) && !TextUtils.isEmpty(this.f107794l)) {
            C42621b bVar = this.f107787e;
            if (bVar == null) {
                C52711k.m112237a("displayVideoView");
            }
            if (bVar.mo86859d().mo86808a() + 5 < this.f107797o) {
                Context context2 = this.f107791i;
                if (context2 == null) {
                    C52711k.m112237a("context");
                }
                Context context3 = this.f107791i;
                if (context3 == null) {
                    C52711k.m112237a("context");
                }
                C10691a.m21545b(context2, context3.getString(R.string.fb5, new Object[]{Long.valueOf(this.f107797o / 1000)})).mo19066a();
                return;
            }
            C42621b bVar2 = this.f107787e;
            if (bVar2 == null) {
                C52711k.m112237a("displayVideoView");
            }
            if (bVar2.mo86859d().mo86808a() > ((long) this.f107798p)) {
                Context context4 = this.f107791i;
                if (context4 == null) {
                    C52711k.m112237a("context");
                }
                C10691a.m21542b(context4, (int) R.string.c89).mo19066a();
                return;
            }
            C42621b bVar3 = this.f107787e;
            if (bVar3 == null) {
                C52711k.m112237a("displayVideoView");
            }
            VECutVideoPresenter d = bVar3.mo86859d();
            int i = this.f107788f;
            VideoEditViewModel videoEditViewModel = this.f107786d;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            VECutVideoPresenter.m93492a(d, i, (float) ((VideoSegment) videoEditViewModel.mo87633k().get(this.f107788f)).f107912k, false, 0.0f, 0.0f, 0, 0, 120, null);
            C42621b bVar4 = this.f107787e;
            if (bVar4 == null) {
                C52711k.m112237a("displayVideoView");
            }
            VECutVideoPresenter d2 = bVar4.mo86859d();
            String str = this.f107794l;
            C42837b lVar = new C42620l(this);
            C52711k.m112240b(str, "outputPath");
            C52711k.m112240b(lVar, "listener");
            if (!d2.f107694h) {
                C45407ay.m98968a("VECutVideo,return compile because of editor not init");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C42650i iVar = d2.f107695i;
            if (iVar != null) {
                z = iVar.mo86927d();
            } else {
                z = false;
            }
            d2.f107691e = z;
            VEVideoCutterViewModel vEVideoCutterViewModel = d2.f107698l;
            if (vEVideoCutterViewModel == null) {
                C52711k.m112237a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.mo87731a(new C43168a(2, true));
            C42650i iVar2 = d2.f107695i;
            if (iVar2 != null) {
                j = iVar2.mo86919a();
            } else {
                j = 0;
            }
            d2.f107689c = j;
            lVar.mo86846a(false);
            C45407ay.m98968a("VECutVideo,using normalImport strategy");
            C0013i e = d2.mo86823e();
            C42583d dVar = new C42583d(d2, currentTimeMillis, str, lVar);
            e.mo19a((C0011g<TResult, TContinuationResult>) dVar);
        }
    }

    public final void setListener(ICutVideoListener iCutVideoListener) {
        C52711k.m112240b(iCutVideoListener, "listener");
        this.f107790h = iCutVideoListener;
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m93526a(C42608a aVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = aVar.f107785c;
        if (vEVideoCutterViewModel == null) {
            C52711k.m112237a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoEditView m93527b(C42608a aVar) {
        VEVideoEditView vEVideoEditView = aVar.f107783a;
        if (vEVideoEditView == null) {
            C52711k.m112237a("videoEditView");
        }
        return vEVideoEditView;
    }

    /* renamed from: c */
    public static final /* synthetic */ C42621b m93528c(C42608a aVar) {
        C42621b bVar = aVar.f107787e;
        if (bVar == null) {
            C52711k.m112237a("displayVideoView");
        }
        return bVar;
    }

    public final void attachDisplayView(DisplayVideoView displayVideoView) {
        C52711k.m112240b(displayVideoView, "displayView");
        IDisplayVideo proxy = displayVideoView.getProxy();
        if (proxy != null) {
            this.f107787e = (C42621b) proxy;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.cover.DisplayVideoViewProxy");
    }

    public final void initInternal(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        Context context = viewGroup.getContext();
        C52711k.m112236a((Object) context, "parent.context");
        this.f107791i = context;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ay2, null, true);
        View findViewById = inflate.findViewById(R.id.dos);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.videoEditView)");
        this.f107783a = (VEVideoEditView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.d6f);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.tvTime)");
        this.f107792j = (TextView) findViewById2;
        viewGroup.addView(inflate);
        Context context2 = this.f107791i;
        if (context2 == null) {
            C52711k.m112237a("context");
        }
        if (context2 != null) {
            FragmentActivity fragmentActivity = (AppCompatActivity) context2;
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(CutMultiVideoViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f107784b = (CutMultiVideoViewModel) a;
            C0209x a2 = C0214z.m440a(fragmentActivity).mo359a(VEVideoCutterViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
            this.f107785c = (VEVideoCutterViewModel) a2;
            C0209x a3 = C0214z.m440a(fragmentActivity).mo359a(VideoEditViewModel.class);
            C52711k.m112236a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f107786d = (VideoEditViewModel) a3;
            if (!TextUtils.isEmpty(this.f107793k)) {
                VEVideoEditView vEVideoEditView = this.f107783a;
                if (vEVideoEditView == null) {
                    C52711k.m112237a("videoEditView");
                }
                vEVideoEditView.setMaxVideoLength(this.f107796n);
                VEVideoEditView vEVideoEditView2 = this.f107783a;
                if (vEVideoEditView2 == null) {
                    C52711k.m112237a("videoEditView");
                }
                vEVideoEditView2.setMinVideoLength(this.f107795m);
                VEVideoEditView vEVideoEditView3 = this.f107783a;
                if (vEVideoEditView3 == null) {
                    C52711k.m112237a("videoEditView");
                }
                vEVideoEditView3.setExtractFramesInRoughMode(true);
                VEVideoEditView vEVideoEditView4 = this.f107783a;
                if (vEVideoEditView4 == null) {
                    C52711k.m112237a("videoEditView");
                }
                Context context3 = this.f107791i;
                if (context3 == null) {
                    C52711k.m112237a("context");
                }
                Activity a4 = C18998a.m46169a(context3);
                if (a4 != null) {
                    FragmentActivity fragmentActivity2 = (FragmentActivity) a4;
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.f107784b;
                    if (cutMultiVideoViewModel == null) {
                        C52711k.m112237a("cutMultiVideoViewModel");
                    }
                    vEVideoEditView4.mo87551a(fragmentActivity2, cutMultiVideoViewModel, this.f107793k);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            VideoEditViewModel videoEditViewModel = this.f107786d;
            if (videoEditViewModel == null) {
                C52711k.m112237a("videoEditViewModel");
            }
            C0198r<Boolean> rVar = videoEditViewModel.f108908c;
            Context context4 = this.f107791i;
            if (context4 == null) {
                C52711k.m112237a("context");
            }
            Activity a5 = C18998a.m46169a(context4);
            if (a5 != null) {
                rVar.observe((FragmentActivity) a5, new C42609a(this));
                VideoEditViewModel videoEditViewModel2 = this.f107786d;
                if (videoEditViewModel2 == null) {
                    C52711k.m112237a("videoEditViewModel");
                }
                C0198r<Long> rVar2 = videoEditViewModel2.f108910e;
                Context context5 = this.f107791i;
                if (context5 == null) {
                    C52711k.m112237a("context");
                }
                Activity a6 = C18998a.m46169a(context5);
                if (a6 != null) {
                    rVar2.observe((FragmentActivity) a6, new C42612d(this));
                    VideoEditViewModel videoEditViewModel3 = this.f107786d;
                    if (videoEditViewModel3 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    C0198r<Float> rVar3 = videoEditViewModel3.f108909d;
                    Context context6 = this.f107791i;
                    if (context6 == null) {
                        C52711k.m112237a("context");
                    }
                    Activity a7 = C18998a.m46169a(context6);
                    if (a7 != null) {
                        rVar3.observe((FragmentActivity) a7, new C42613e(this));
                        VideoEditViewModel videoEditViewModel4 = this.f107786d;
                        if (videoEditViewModel4 == null) {
                            C52711k.m112237a("videoEditViewModel");
                        }
                        C0198r<Void> rVar4 = videoEditViewModel4.f108912g;
                        Context context7 = this.f107791i;
                        if (context7 == null) {
                            C52711k.m112237a("context");
                        }
                        Activity a8 = C18998a.m46169a(context7);
                        if (a8 != null) {
                            rVar4.observe((FragmentActivity) a8, new C42614f(this));
                            VideoEditViewModel videoEditViewModel5 = this.f107786d;
                            if (videoEditViewModel5 == null) {
                                C52711k.m112237a("videoEditViewModel");
                            }
                            C0198r<Void> rVar5 = videoEditViewModel5.f108911f;
                            Context context8 = this.f107791i;
                            if (context8 == null) {
                                C52711k.m112237a("context");
                            }
                            Activity a9 = C18998a.m46169a(context8);
                            if (a9 != null) {
                                rVar5.observe((FragmentActivity) a9, new C42615g(this));
                                VideoEditViewModel videoEditViewModel6 = this.f107786d;
                                if (videoEditViewModel6 == null) {
                                    C52711k.m112237a("videoEditViewModel");
                                }
                                C0198r<Void> rVar6 = videoEditViewModel6.f108913h;
                                Context context9 = this.f107791i;
                                if (context9 == null) {
                                    C52711k.m112237a("context");
                                }
                                Activity a10 = C18998a.m46169a(context9);
                                if (a10 != null) {
                                    rVar6.observe((FragmentActivity) a10, new C42616h(this));
                                    VideoEditViewModel videoEditViewModel7 = this.f107786d;
                                    if (videoEditViewModel7 == null) {
                                        C52711k.m112237a("videoEditViewModel");
                                    }
                                    C0198r<Void> rVar7 = videoEditViewModel7.f108916k;
                                    Context context10 = this.f107791i;
                                    if (context10 == null) {
                                        C52711k.m112237a("context");
                                    }
                                    Activity a11 = C18998a.m46169a(context10);
                                    if (a11 != null) {
                                        rVar7.observe((FragmentActivity) a11, new C42617i(this));
                                        VideoEditViewModel videoEditViewModel8 = this.f107786d;
                                        if (videoEditViewModel8 == null) {
                                            C52711k.m112237a("videoEditViewModel");
                                        }
                                        C0198r<Void> rVar8 = videoEditViewModel8.f108917l;
                                        Context context11 = this.f107791i;
                                        if (context11 == null) {
                                            C52711k.m112237a("context");
                                        }
                                        Activity a12 = C18998a.m46169a(context11);
                                        if (a12 != null) {
                                            rVar8.observe((FragmentActivity) a12, new C42618j(this));
                                            VideoEditViewModel videoEditViewModel9 = this.f107786d;
                                            if (videoEditViewModel9 == null) {
                                                C52711k.m112237a("videoEditViewModel");
                                            }
                                            C0198r<Void> rVar9 = videoEditViewModel9.f108918m;
                                            Context context12 = this.f107791i;
                                            if (context12 == null) {
                                                C52711k.m112237a("context");
                                            }
                                            Activity a13 = C18998a.m46169a(context12);
                                            if (a13 != null) {
                                                rVar9.observe((FragmentActivity) a13, new C42619k(this));
                                                VideoEditViewModel videoEditViewModel10 = this.f107786d;
                                                if (videoEditViewModel10 == null) {
                                                    C52711k.m112237a("videoEditViewModel");
                                                }
                                                C0198r<Void> rVar10 = videoEditViewModel10.f108914i;
                                                Context context13 = this.f107791i;
                                                if (context13 == null) {
                                                    C52711k.m112237a("context");
                                                }
                                                Activity a14 = C18998a.m46169a(context13);
                                                if (a14 != null) {
                                                    rVar10.observe((FragmentActivity) a14, new C42610b(this));
                                                    VideoEditViewModel videoEditViewModel11 = this.f107786d;
                                                    if (videoEditViewModel11 == null) {
                                                        C52711k.m112237a("videoEditViewModel");
                                                    }
                                                    C0198r<Void> rVar11 = videoEditViewModel11.f108915j;
                                                    Context context14 = this.f107791i;
                                                    if (context14 == null) {
                                                        C52711k.m112237a("context");
                                                    }
                                                    Activity a15 = C18998a.m46169a(context14);
                                                    if (a15 != null) {
                                                        rVar11.observe((FragmentActivity) a15, new C42611c(this));
                                                        return;
                                                    }
                                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                        }
                                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    public final void init(String str, String str2, long j, long j2) {
        C52711k.m112240b(str, "inputPath");
        C52711k.m112240b(str2, "outputPath");
        this.f107793k = str;
        this.f107794l = str2;
        this.f107795m = j;
        this.f107796n = j2;
    }
}

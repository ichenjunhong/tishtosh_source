package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44881d;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g.C44886a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44891l;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.EmbaddedWindowInfo;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.tools.C47066k;
import com.p683ss.android.ugc.aweme.tools.C47348w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.en */
public final class C43790en implements C44881d {

    /* renamed from: a */
    private final C45017b f110880a;

    /* renamed from: b */
    private final AppCompatActivity f110881b;

    /* renamed from: c */
    private final ASCameraView f110882c;

    /* renamed from: d */
    private final ShortVideoContext f110883d;

    /* renamed from: e */
    private long f110884e;

    public final void onEvent(C47348w wVar) {
        List<EmbaddedWindowInfo> list;
        this.f110884e = System.currentTimeMillis();
        boolean z = true;
        if (this.f110883d.f107095au == 1) {
            this.f110882c.mo43635c(true);
        }
        if (this.f110883d.mo86362d()) {
            if (this.f110883d.f107040S) {
                this.f110882c.mo43635c(false);
            } else {
                this.f110882c.mo43635c(true);
            }
        }
        C45412b.m98979a().step("av_video_edit", "startConcat");
        if (C43236a.m94873a(this.f110883d)) {
            this.f110882c.mo43633b(false);
        }
        if ((C43236a.m94873a(this.f110883d) || this.f110883d.mo86366g()) && this.f110883d.f107031J) {
            float[] suggestVolume = this.f110882c.getSuggestVolume();
            if (!(suggestVolume == null || suggestVolume.length != 2 || suggestVolume[0] == 0.0f || suggestVolume[1] == 0.0f)) {
                this.f110883d.f107029H = suggestVolume[0];
                this.f110883d.f107030I = suggestVolume[1];
            }
        }
        C44886a aVar = new C44886a();
        aVar.f113602a = this.f110883d.f107118k.mo86455c().getPath();
        aVar.f113603b = this.f110883d.f107118k.mo86456d().getPath();
        aVar.f113606e = this.f110882c.getMediaController();
        aVar.f113605d = this.f110883d.f107038Q;
        if (!C43223dp.m94850a() || this.f110883d.mo86362d()) {
            z = false;
        }
        aVar.f113607f = z;
        AppCompatActivity appCompatActivity = this.f110881b;
        String path = this.f110883d.f107118k.mo86455c().getPath();
        Integer valueOf = Integer.valueOf((int) this.f110883d.f107120m);
        Integer valueOf2 = Integer.valueOf(this.f110883d.f107116i);
        Integer valueOf3 = Integer.valueOf(this.f110883d.f107117j);
        if (this.f110883d.mo86365f()) {
            list = this.f110883d.f107039R;
        } else {
            list = null;
        }
        aVar.f113604c = C43882k.m96392a(true, false, (Context) appCompatActivity, path, valueOf, valueOf2, valueOf3, list);
        if (aVar.f113607f) {
            mo89292a(aVar.f113602a, aVar.f113603b, aVar.f113604c, 0);
            return;
        }
        if (aVar.f113602a != null) {
            File file = new File(aVar.f113602a);
            if (file.exists()) {
                file.delete();
            }
        }
        if (aVar.f113603b != null) {
            File file2 = new File(aVar.f113603b);
            if (file2.exists()) {
                file2.delete();
            }
        }
        aVar.f113606e.mo43298a(aVar.f113602a, aVar.f113603b, aVar.f113605d, aVar.f113604c, "", (C52671b<? super RecorderConcatResult, C52860x>) new C44891l<Object,C52860x>(aVar, new WeakReference(this), this));
    }

    public C43790en(AppCompatActivity appCompatActivity, C45017b bVar, ShortVideoContext shortVideoContext, ASCameraView aSCameraView) {
        this.f110883d = shortVideoContext;
        this.f110880a = bVar;
        this.f110881b = appCompatActivity;
        this.f110882c = aSCameraView;
    }

    /* renamed from: a */
    public final void mo89292a(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder("MultiEditLog: concat statusCode");
        sb.append(i);
        C45407ay.m98968a(sb.toString());
        C45412b.m98979a().step("av_video_edit", "concatEnd");
        C45017b bVar = this.f110880a;
        C47066k kVar = new C47066k(this.f110884e, str, str2, str3, i);
        bVar.f114035m.mo7350a(kVar);
    }
}

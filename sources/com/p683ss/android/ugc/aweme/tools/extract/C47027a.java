package com.p683ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.tools.utils.C50199c;
import dmt.p2652av.video.C52884a;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a */
public abstract class C47027a implements C47038j {

    /* renamed from: a */
    protected ExtractFramesModel f118774a = new ExtractFramesModel(mo94328f());

    /* renamed from: b */
    protected volatile boolean f118775b;

    /* renamed from: c */
    protected C47040k f118776c = new C47040k();

    /* renamed from: d */
    protected String f118777d = UUID.randomUUID().toString();

    /* renamed from: e */
    public final ExtractFramesModel mo94324e() {
        return this.f118774a;
    }

    /* renamed from: b */
    public static boolean m102125b() {
        if (C39618d.f101151O.mo83118b(C40796a.CloseUploadExtractFrames) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo94322c() {
        if (this.f118774a != null) {
            this.f118774a.removeLastSegment();
        }
    }

    /* renamed from: d */
    public final void mo94323d() {
        if (this.f118774a != null) {
            this.f118774a.removeStickerFace();
        }
    }

    /* renamed from: a */
    public void mo94316a() {
        this.f118775b = false;
        this.f118774a = new ExtractFramesModel(mo94328f());
        this.f118777d = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public void mo94320a(boolean z) {
        C52884a.m112518a(1, "extracting_frame");
        this.f118775b = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo94315a(C0013i iVar) throws Exception {
        String str = (String) iVar.mo34e();
        if (!TextUtils.isEmpty(str)) {
            this.f118774a.addStickFace(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo94317a(ExtractFramesModel extractFramesModel) {
        if (extractFramesModel != null) {
            this.f118774a = extractFramesModel;
            if (this.f118776c != null) {
                this.f118776c.f118792a = this.f118774a.extractFramesDir;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo94321b(String str) throws Exception {
        if (!new File(str).exists()) {
            return null;
        }
        if (!this.f118776c.f118792a.contains(mo94328f())) {
            this.f118776c.mo94333a(mo94328f(), this.f118777d);
            this.f118774a.extractFramesDir = this.f118776c.f118792a;
        }
        String a = this.f118776c.mo78585a();
        C50199c.m108337a(C50199c.m108334a(str, C47037i.f118791a), new File(a), 70, CompressFormat.JPEG);
        return a;
    }

    /* renamed from: a */
    public void mo94318a(C47039a aVar) {
        C52884a.m112519a(1, "extracting_frame", mo94328f());
        if (!m102125b()) {
            aVar.mo86668a(false);
            return;
        }
        this.f118775b = true;
        this.f118776c.mo94333a(mo94328f(), this.f118777d);
        this.f118774a.extractFramesDir = this.f118776c.f118792a;
        this.f118774a.addFrameSegment(new ArrayList());
    }

    /* renamed from: a */
    public final void mo94319a(String str) {
        if (this.f118774a != null && !TextUtils.isEmpty(str)) {
            C0013i.m16a((Callable<TResult>) new C47028b<TResult>(this, str)).mo20a((C0011g<TResult, TContinuationResult>) new C47029c<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.p2175a;

import android.graphics.Bitmap;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14041b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.p683ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache;
import com.p683ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache.C45370a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.a.a */
public final class C42388a extends C1322a<C42390a> {

    /* renamed from: a */
    private int f107191a;

    /* renamed from: b */
    private int f107192b;

    /* renamed from: c */
    private float f107193c;

    /* renamed from: d */
    private int f107194d;

    /* renamed from: e */
    private int f107195e;

    /* renamed from: f */
    private VideoCoverBitmapCache f107196f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.a.a$a */
    static class C42390a extends C1352v {

        /* renamed from: a */
        ImageView f107200a;

        /* renamed from: b */
        C13715a<C14042c> f107201b;

        C42390a(View view) {
            super(view);
            this.f107200a = (ImageView) view.findViewById(R.id.b4w);
            view.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                }
            });
        }
    }

    public final int getItemCount() {
        return this.f107195e;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C42390a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b4p, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        final C42390a aVar = (C42390a) vVar;
        C13715a.m27752c(aVar.f107201b);
        final int min = (int) Math.min(((float) i) * this.f107193c * 1000.0f, (float) this.f107192b);
        ImageView imageView = aVar.f107200a;
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        imageView.setTag(sb.toString());
        LayoutParams layoutParams = (LayoutParams) aVar.f107200a.getLayoutParams();
        layoutParams.height = this.f107191a;
        layoutParams.width = this.f107191a;
        layoutParams.setMargins(0, 0, 0, 0);
        if (i <= 0 || i >= this.f107195e - 1) {
            int i2 = this.f107191a >> 1;
            if (i == this.f107195e - 1 && i == 0) {
                double d = (double) (((float) this.f107192b) % (this.f107193c * 1000.0f));
                Double.isNaN(d);
                double d2 = d * 1.0d;
                double d3 = (double) (this.f107193c * 1000.0f);
                Double.isNaN(d3);
                double d4 = d2 / d3;
                double d5 = (double) this.f107191a;
                Double.isNaN(d5);
                layoutParams.width = (int) (d4 * d5);
                layoutParams.setMargins(i2, 0, this.f107194d, 0);
            } else if (i == 0) {
                layoutParams.width = this.f107191a;
                layoutParams.setMargins(i2, 0, 0, 0);
            } else if (i == this.f107195e - 1) {
                float f = ((float) this.f107192b) % (this.f107193c * 1000.0f);
                if (f == 0.0f) {
                    f = this.f107193c * 1000.0f;
                }
                double d6 = (double) f;
                Double.isNaN(d6);
                double d7 = d6 * 1.0d;
                double d8 = (double) (this.f107193c * 1000.0f);
                Double.isNaN(d8);
                double d9 = d7 / d8;
                double d10 = (double) this.f107191a;
                Double.isNaN(d10);
                layoutParams.width = (int) (d9 * d10);
                if (i < 5) {
                    layoutParams.setMargins(0, 0, i2 + this.f107194d, 0);
                } else {
                    layoutParams.setMargins(0, 0, i2, 0);
                }
            }
        } else {
            layoutParams.width = this.f107191a;
            aVar.f107200a.setPadding(0, 0, 0, 0);
        }
        aVar.f107200a.setLayoutParams(layoutParams);
        aVar.f107200a.setScaleType(ScaleType.CENTER_CROP);
        aVar.f107200a.setImageBitmap(null);
        if (this.f107196f != null) {
            this.f107196f.mo91704a(min, new C45370a() {
                /* renamed from: a */
                public final void mo86475a(C13715a<C14042c> aVar) {
                    Bitmap d = ((C14041b) aVar.mo25630a()).mo26257d();
                    if (d != null && !d.isRecycled() && aVar.f107200a != null) {
                        Object tag = aVar.f107200a.getTag();
                        StringBuilder sb = new StringBuilder();
                        sb.append(min);
                        if (tag.equals(sb.toString())) {
                            aVar.f107201b = aVar;
                            aVar.f107200a.setImageBitmap(d);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover] */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v7
      assigns: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover, com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl]
      uses: [com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache, com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover, com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl]
      mth insns count: 25
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42388a(android.arch.lifecycle.C0184k r7, int r8, int r9, float r10, int r11, java.lang.String r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            r6.<init>()
            r6.f107191a = r8
            r6.f107192b = r9
            r6.f107193c = r10
            r6.f107194d = r11
            r6.f107195e = r15
            com.p683ss.android.ttve.nativePort.C20129b.m49685b()
            com.ss.android.medialib.jni.FrameThumb r2 = new com.ss.android.medialib.jni.FrameThumb
            r2.<init>()
            int[] r8 = r2.initVideoToGraph(r12, r13, r14)
            r9 = 0
            r9 = r8[r9]
            if (r9 != 0) goto L_0x003a
            r9 = 4
            r4 = r8[r9]
            r9 = 5
            r5 = r8[r9]
            r8 = 40
            if (r15 < r8) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl r8 = new com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl
            r0 = r8
            r1 = r7
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x003b
        L_0x0031:
            com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover r8 = new com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover
            r0 = r8
            r1 = r7
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            r6.f107196f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2175a.C42388a.<init>(android.arch.lifecycle.k, int, int, float, int, java.lang.String, int, int, int):void");
    }
}

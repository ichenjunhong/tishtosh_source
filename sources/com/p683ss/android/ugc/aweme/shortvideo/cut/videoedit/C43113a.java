package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.C9414h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14041b;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42664g;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44002b;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45592a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45617m;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a */
public final class C43113a extends C1322a<C1352v> {

    /* renamed from: a */
    public int f108930a;

    /* renamed from: b */
    public Context f108931b;

    /* renamed from: c */
    public HashMap<String, Float> f108932c = new HashMap<>();

    /* renamed from: d */
    public List<C0794k<String, C0794k<Integer, Integer>>> f108933d;

    /* renamed from: e */
    public C42664g f108934e;

    /* renamed from: f */
    public List<VideoSegment> f108935f = new ArrayList();

    /* renamed from: g */
    public List<VideoSegment> f108936g;

    /* renamed from: h */
    public C0198r<Bitmap> f108937h;

    /* renamed from: i */
    public C0198r<Boolean> f108938i;

    /* renamed from: j */
    public int f108939j;

    /* renamed from: k */
    public int f108940k;

    /* renamed from: l */
    public List<Bitmap> f108941l = new ArrayList();

    /* renamed from: m */
    public boolean f108942m;

    /* renamed from: n */
    public C20347c f108943n;

    /* renamed from: o */
    private C45617m f108944o;

    /* renamed from: p */
    private boolean f108945p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a$a */
    class C43114a extends C1352v {

        /* renamed from: a */
        ImageView f108946a = ((ImageView) this.itemView.findViewById(R.id.b4w));

        /* renamed from: b */
        C13715a<C14041b> f108947b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo87650a() {
            C13715a.m27752c(this.f108947b);
        }

        C43114a(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x5, viewGroup, false));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo87649a(String str, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < C43113a.this.f108936g.size() && !str.equals(((VideoSegment) C43113a.this.f108936g.get(i2)).mo86950e())) {
                i3 = (int) (((long) i3) + ((VideoSegment) C43113a.this.f108936g.get(i2)).f107904c);
                i2++;
            }
            return i3 + i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo87646b() {
        if (this.f108934e != null) {
            this.f108934e.mo86833b();
        }
    }

    /* renamed from: c */
    private void m94570c() {
        if (this.f108942m) {
            new C44002b().mo89832a(this.f108939j, this.f108940k).mo89835b(this.f108938i).mo89833a(this.f108937h).mo89834a(this.f108931b, this.f108943n, m94567a((int) ((VideoSegment) this.f108935f.get(0)).f107904c, ((VideoSegment) this.f108935f.get(0)).mo86950e()), new C43118b(this));
        }
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        int i;
        if (this.f108942m) {
            return this.f108941l.size();
        }
        if (this.f108944o != null) {
            return this.f108944o.f115388a;
        }
        if (C9414h.m18630a(this.f108935f)) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f108935f.size(); i3++) {
            if (this.f108930a == 1) {
                i = m94567a((int) (((VideoSegment) this.f108935f.get(i3)).f107906e - ((VideoSegment) this.f108935f.get(i3)).f107905d), ((VideoSegment) this.f108935f.get(i3)).mo86950e());
            } else {
                i = m94567a((int) ((VideoSegment) this.f108935f.get(i3)).f107904c, ((VideoSegment) this.f108935f.get(i3)).mo86950e());
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo87638a() {
        int i;
        if (this.f108933d == null) {
            this.f108933d = new ArrayList();
        } else {
            this.f108933d.clear();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f108935f.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) this.f108935f.get(i3);
            if (this.f108930a == 1) {
                i = m94567a((int) (videoSegment.mo86953g() - videoSegment.mo86952f()), videoSegment.mo86950e());
            } else {
                i = m94567a((int) videoSegment.f107904c, videoSegment.mo86950e());
            }
            Integer valueOf = Integer.valueOf(i2);
            i2 += i;
            this.f108933d.add(C0794k.m2265a(videoSegment.mo86950e(), C0794k.m2265a(valueOf, Integer.valueOf(i2 - 1))));
        }
    }

    /* renamed from: c */
    public final void mo87648c(boolean z) {
        if (this.f108945p ^ z) {
            this.f108945p = z;
            notifyDataSetChanged();
        }
    }

    public final void onViewRecycled(C1352v vVar) {
        super.onViewRecycled(vVar);
        if (vVar instanceof C43114a) {
            ((C43114a) vVar).mo87650a();
        }
    }

    /* renamed from: b */
    public final void mo87647b(boolean z) {
        if (this.f108934e instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) this.f108934e).f107759b = z;
        }
    }

    /* renamed from: b */
    private void m94569b(HashMap<String, Float> hashMap) {
        for (String str : hashMap.keySet()) {
            this.f108932c.put(str, Float.valueOf(((Float) hashMap.get(str)).floatValue() * ((float) this.f108939j)));
        }
    }

    /* renamed from: a */
    public final void mo87643a(HashMap<String, Float> hashMap) {
        m94569b(hashMap);
        if (this.f108934e != null) {
            this.f108934e.mo86833b();
        }
        mo87638a();
        m94570c();
    }

    /* renamed from: a */
    public final void mo87644a(List<VideoSegment> list) {
        this.f108935f = new ArrayList(list);
        mo87638a();
        m94570c();
    }

    /* renamed from: a */
    public final void mo87645a(boolean z) {
        if (this.f108934e instanceof C45592a) {
            ((C45592a) this.f108934e).f115326b = z;
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43114a(viewGroup);
    }

    /* renamed from: a */
    private int m94567a(int i, String str) {
        float f;
        if (this.f108932c.get(str) != null) {
            f = ((Float) this.f108932c.get(str)).floatValue();
        } else {
            f = -1.0f;
        }
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("duration: ");
            sb.append(i);
            sb.append(" oneFrameDurMap");
            sb.append(this.f108932c.get(str));
            sb.append(" path: ");
            sb.append(str);
            C50203g.m108362c(sb.toString());
        }
        return (int) Math.ceil((double) (((float) i) / f));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        float f;
        if (vVar instanceof C43114a) {
            if (this.f108945p) {
                int itemCount = getItemCount();
                int i3 = (itemCount - i) - 1;
                if (i3 >= 0 && i3 < itemCount) {
                    i = i3;
                }
            }
            C43114a aVar = (C43114a) vVar;
            C43113a.this.mo87638a();
            C43113a aVar2 = C43113a.this;
            int i4 = 0;
            while (true) {
                if (i4 >= aVar2.f108933d.size()) {
                    i4 = -1;
                    break;
                }
                C0794k kVar = (C0794k) ((C0794k) aVar2.f108933d.get(i4)).f2712b;
                if (i >= ((Integer) kVar.f2711a).intValue() && i <= ((Integer) kVar.f2712b).intValue()) {
                    break;
                }
                i4++;
            }
            if (i4 >= 0) {
                C0794k kVar2 = (C0794k) ((C0794k) C43113a.this.f108933d.get(i4)).f2712b;
                if (C43113a.this.f108930a == 1) {
                    i2 = (int) Math.min((((float) (i - ((Integer) kVar2.f2711a).intValue())) * ((Float) C43113a.this.f108932c.get(((VideoSegment) C43113a.this.f108935f.get(i4)).mo86950e())).floatValue()) + ((float) ((VideoSegment) C43113a.this.f108935f.get(i4)).mo86952f()), (float) ((VideoSegment) C43113a.this.f108935f.get(i4)).mo86953g());
                } else {
                    i2 = (int) Math.min(((float) (i - ((Integer) kVar2.f2711a).intValue())) * ((Float) C43113a.this.f108932c.get(((VideoSegment) C43113a.this.f108935f.get(i4)).mo86950e())).floatValue(), (float) ((VideoSegment) C43113a.this.f108935f.get(i4)).f107904c);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i4);
                sb.append("-");
                sb.append(i2);
                String sb2 = sb.toString();
                aVar.f108946a.setTag(sb2);
                LayoutParams layoutParams = (LayoutParams) aVar.f108946a.getLayoutParams();
                layoutParams.height = C43113a.this.f108940k;
                layoutParams.width = C43113a.this.f108939j;
                if (i == ((Integer) kVar2.f2712b).intValue()) {
                    if (C43113a.this.f108930a == 1) {
                        f = ((float) (((VideoSegment) C43113a.this.f108935f.get(i4)).mo86953g() - ((VideoSegment) C43113a.this.f108935f.get(i4)).mo86952f())) % ((Float) C43113a.this.f108932c.get(((VideoSegment) C43113a.this.f108935f.get(i4)).mo86950e())).floatValue();
                    } else {
                        f = ((float) ((VideoSegment) C43113a.this.f108935f.get(i4)).f107904c) % ((Float) C43113a.this.f108932c.get(((VideoSegment) C43113a.this.f108935f.get(i4)).mo86950e())).floatValue();
                    }
                    double floatValue = (double) (f / ((Float) C43113a.this.f108932c.get(((VideoSegment) C43113a.this.f108935f.get(i4)).mo86950e())).floatValue());
                    double d = (double) C43113a.this.f108939j;
                    Double.isNaN(floatValue);
                    Double.isNaN(d);
                    layoutParams.width = (int) (floatValue * d);
                }
                aVar.f108946a.setLayoutParams(layoutParams);
                aVar.f108946a.setImageBitmap(null);
                aVar.f108946a.setBackgroundColor(C43113a.this.f108931b.getResources().getColor(R.color.cp));
                if (C43113a.this.f108942m) {
                    aVar.f108946a.setImageBitmap((Bitmap) C43113a.this.f108941l.get(i));
                } else if (C43113a.this.f108934e != null) {
                    String a = ((VideoSegment) C43113a.this.f108935f.get(i4)).mo86941a(false);
                    C42664g gVar = C43113a.this.f108934e;
                    int a2 = aVar.mo87649a(((VideoSegment) C43113a.this.f108935f.get(i4)).mo86950e(), i2);
                    C43119c cVar = new C43119c(aVar, aVar, sb2, i, kVar2, a);
                    gVar.mo86830a(i, a, a2, i2, cVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87639a(C0184k kVar, VideoSegment videoSegment, HashMap<String, Float> hashMap) {
        if (!C9414h.m18630a(this.f108935f)) {
            this.f108935f.remove(videoSegment);
            mo87643a(hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87642a(C0184k kVar, List<VideoSegment> list, HashMap<String, Float> hashMap) {
        this.f108935f.addAll(list);
        mo87643a(hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87640a(C0184k kVar, HashMap<String, Float> hashMap, int i, boolean z) {
        mo87643a(hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87641a(C0184k kVar, HashMap<String, Float> hashMap, VideoSegment videoSegment, boolean z) {
        this.f108935f.clear();
        this.f108935f.add(videoSegment);
        mo87643a(hashMap);
    }

    /* renamed from: a */
    private void m94568a(Context context, List<VideoSegment> list, HashMap<String, Float> hashMap, int i) {
        this.f108931b = context;
        this.f108930a = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            VideoSegment videoSegment = (VideoSegment) list.get(i2);
            this.f108932c.put(videoSegment.mo86950e(), Float.valueOf(((Float) hashMap.get(videoSegment.mo86950e())).floatValue() * ((float) this.f108939j)));
        }
        this.f108936g = list;
    }

    public C43113a(Context context, int[] iArr, List<VideoSegment> list, HashMap<String, Float> hashMap, int i) {
        this.f108939j = iArr[0];
        this.f108940k = iArr[1];
        m94568a(context, list, hashMap, i);
        this.f108934e = new VEMediaParserFrameProviderImpl(context);
    }

    public C43113a(Context context, int[] iArr, List<VideoSegment> list, HashMap<String, Float> hashMap, int i, C45617m mVar) {
        this.f108939j = iArr[0];
        this.f108940k = iArr[1];
        this.f108944o = mVar;
        m94568a(context, list, hashMap, i);
        this.f108934e = new C45592a(mVar);
    }
}

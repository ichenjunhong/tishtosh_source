package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c */
public final class C43152c extends C1322a<C43153a> {

    /* renamed from: a */
    public float f109082a;

    /* renamed from: b */
    public List<C52847n<Integer, Integer>> f109083b = new ArrayList();

    /* renamed from: c */
    public List<VideoSegment> f109084c = new ArrayList();

    /* renamed from: d */
    public int f109085d;

    /* renamed from: e */
    public int f109086e;

    /* renamed from: f */
    public float f109087f;

    /* renamed from: g */
    public Context f109088g;

    /* renamed from: h */
    public VEMediaParserProviderV2 f109089h;

    /* renamed from: i */
    public int f109090i;

    /* renamed from: j */
    private int f109091j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c$a */
    public final class C43153a extends C1352v {

        /* renamed from: a */
        public ImageView f109092a;

        /* renamed from: b */
        public Bitmap f109093b;

        /* renamed from: c */
        final /* synthetic */ C43152c f109094c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c$a$a */
        public static final class C43154a implements C43149a {

            /* renamed from: a */
            final /* synthetic */ C43153a f109095a;

            /* renamed from: b */
            final /* synthetic */ C43153a f109096b;

            /* renamed from: c */
            final /* synthetic */ String f109097c;

            /* renamed from: a */
            public final void mo87717a(Bitmap bitmap) {
                C52711k.m112240b(bitmap, "bitmap");
                if (C52711k.m112239a(this.f109096b.f109092a.getTag(), (Object) this.f109097c)) {
                    this.f109095a.f109092a.setImageBitmap(bitmap);
                    Bitmap bitmap2 = this.f109095a.f109093b;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f109095a.f109093b = null;
                    this.f109095a.f109093b = bitmap;
                }
            }

            C43154a(C43153a aVar, C43153a aVar2, String str) {
                this.f109095a = aVar;
                this.f109096b = aVar2;
                this.f109097c = str;
            }
        }

        public C43153a(C43152c cVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f109094c = cVar;
            super(view);
            this.f109092a = (ImageView) view;
        }
    }

    public final int getItemCount() {
        if (this.f109084c.isEmpty()) {
            return 0;
        }
        return this.f109091j;
    }

    /* renamed from: a */
    public final void mo87721a(float f) {
        mo87726b(f, 0.0f);
    }

    /* renamed from: b */
    private final int m94684b(float f) {
        return C52733a.m112277a((float) Math.ceil((double) (f / this.f109082a)));
    }

    /* renamed from: a */
    public final void mo87725a(boolean z) {
        this.f109089h.f108983b = z;
    }

    /* renamed from: a */
    public final void mo87723a(List<? extends VideoSegment> list) {
        C52711k.m112240b(list, "data");
        this.f109084c = new ArrayList(list);
        this.f109091j = m94685c(0.0f);
        this.f109089h.mo87680d();
        notifyDataSetChanged();
    }

    public final /* synthetic */ void onViewRecycled(C1352v vVar) {
        C43153a aVar = (C43153a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewRecycled(aVar);
        aVar.f109092a.setImageBitmap(null);
        Bitmap bitmap = aVar.f109093b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        aVar.f109093b = null;
    }

    /* renamed from: c */
    private final int m94685c(float f) {
        this.f109083b.clear();
        int i = 0;
        if (this.f109090i == 1) {
            for (VideoSegment videoSegment : this.f109084c) {
                int b = m94684b(((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / videoSegment.mo86954h());
                List<C52847n<Integer, Integer>> list = this.f109083b;
                Integer valueOf = Integer.valueOf(i);
                i += b;
                list.add(new C52847n(valueOf, Integer.valueOf(i - 1)));
            }
            return i;
        }
        VideoSegment videoSegment2 = (VideoSegment) this.f109084c.get(0);
        this.f109087f = videoSegment2.mo86954h();
        if (f != 0.0f) {
            this.f109087f = f;
        }
        int b2 = m94684b(((float) videoSegment2.f107904c) / this.f109087f);
        this.f109083b.add(new C52847n(Integer.valueOf(0), Integer.valueOf(b2 - 1)));
        return b2;
    }

    /* renamed from: a */
    public final void mo87722a(float f, float f2) {
        mo87726b(f, f2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo87726b(float f, float f2) {
        this.f109082a = f * ((float) this.f109085d);
        this.f109091j = m94685c(f2);
        this.f109089h.mo87680d();
        notifyDataSetChanged();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f109088g).inflate(R.layout.x6, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…_frame_v2, parent, false)");
        return new C43153a(this, inflate);
    }

    /* renamed from: a */
    public final void mo87724a(List<? extends VideoSegment> list, float f) {
        C52711k.m112240b(list, "data");
        this.f109084c = new ArrayList(list);
        mo87726b(f, 0.0f);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        float f;
        float f2;
        C43153a aVar = (C43153a) vVar;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(aVar, "holder");
        int size = aVar.f109094c.f109083b.size();
        int i2 = 0;
        while (i2 < size) {
            C52847n nVar = (C52847n) aVar.f109094c.f109083b.get(i2);
            if (i < ((Number) nVar.getFirst()).intValue() || i > ((Number) nVar.getSecond()).intValue()) {
                i2++;
            } else {
                C52847n nVar2 = (C52847n) aVar.f109094c.f109083b.get(i2);
                VideoSegment videoSegment = (VideoSegment) aVar.f109094c.f109084c.get(i2);
                if (aVar.f109094c.f109090i == 1) {
                    f = Math.min((((float) (i - ((Number) nVar2.getFirst()).intValue())) * aVar.f109094c.f109082a * videoSegment.mo86954h()) + ((float) videoSegment.mo86952f()), (float) videoSegment.mo86953g());
                } else {
                    f = Math.min(((float) (i - ((Number) nVar2.getFirst()).intValue())) * aVar.f109094c.f109082a * aVar.f109094c.f109087f, (float) videoSegment.f107904c);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('-');
                sb.append(f);
                String sb2 = sb.toString();
                aVar.f109092a.setTag(sb2);
                View view = aVar.itemView;
                C52711k.m112236a((Object) view, "holder.itemView");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    layoutParams2.height = aVar.f109094c.f109086e;
                    layoutParams2.width = aVar.f109094c.f109085d;
                    if (i == ((Number) nVar2.getSecond()).intValue()) {
                        if (aVar.f109094c.f109090i == 1) {
                            f2 = (((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / videoSegment.mo86954h()) - (aVar.f109094c.f109082a * ((float) (((Number) nVar2.getSecond()).intValue() - ((Number) nVar2.getFirst()).intValue())));
                        } else {
                            f2 = (((float) videoSegment.f107904c) / aVar.f109094c.f109087f) - (aVar.f109094c.f109082a * ((Number) nVar2.getSecond()).floatValue());
                        }
                        if (f2 >= 0.0f) {
                            layoutParams2.width = C52733a.m112277a((f2 / aVar.f109094c.f109082a) * ((float) aVar.f109094c.f109085d));
                        }
                    }
                    View view2 = aVar.itemView;
                    C52711k.m112236a((Object) view2, "holder.itemView");
                    view2.setLayoutParams(layoutParams2);
                    Bitmap bitmap = aVar.f109093b;
                    if (bitmap != null && bitmap.isRecycled()) {
                        ImageView imageView = aVar.f109092a;
                        if (aVar.f109094c.f109090i == 1) {
                            imageView.setBackground(aVar.f109094c.f109088g.getResources().getDrawable(R.drawable.f7));
                        } else {
                            imageView.setBackground(aVar.f109094c.f109088g.getResources().getDrawable(R.drawable.f9));
                        }
                    }
                    String a = ((VideoSegment) aVar.f109094c.f109084c.get(i2)).mo86941a(false);
                    VEMediaParserProviderV2 vEMediaParserProviderV2 = aVar.f109094c.f109089h;
                    C52711k.m112236a((Object) a, "videoPath");
                    int i3 = (int) f;
                    C43149a aVar2 = new C43154a(aVar, aVar, sb2);
                    C52711k.m112240b(a, LeakCanaryFileProvider.f132050j);
                    C52711k.m112240b(aVar2, "onGetBitmap");
                    vEMediaParserProviderV2.mo87677a(i, a, i3, aVar2, true);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
            }
        }
        StringBuilder sb3 = new StringBuilder("unknow pos = ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString());
    }

    public C43152c(Context context, int[] iArr, float f, VEMediaParserProviderV2 vEMediaParserProviderV2, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iArr, "frameSize");
        C52711k.m112240b(vEMediaParserProviderV2, "mBitmapCache");
        this.f109088g = context;
        this.f109089h = vEMediaParserProviderV2;
        this.f109090i = i;
        this.f109085d = iArr[0];
        this.f109086e = iArr[1];
        this.f109082a = f * ((float) this.f109085d);
    }
}

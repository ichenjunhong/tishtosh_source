package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2197a;

import android.graphics.Bitmap;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43102c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43170w;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42663f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43693a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43693a.C43696a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a */
public final class C43675a extends C43099t {

    /* renamed from: g */
    public final HashMap<String, Bitmap> f110597g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<String, ImageView> f110598h = new HashMap<>();

    /* renamed from: i */
    public final C43693a f110599i = new C43693a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a */
    public final class C43676a extends C43102c {

        /* renamed from: d */
        final /* synthetic */ C43675a f110600d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a$a */
        static final class C43677a implements C43696a {

            /* renamed from: a */
            final /* synthetic */ C43676a f110601a;

            /* renamed from: b */
            final /* synthetic */ String f110602b;

            C43677a(C43676a aVar, String str) {
                this.f110601a = aVar;
                this.f110602b = str;
            }

            /* renamed from: a */
            public final void mo89104a(String str, Bitmap bitmap) {
                if (bitmap != null && this.f110601a.f110600d.f110598h.get(this.f110602b) != null) {
                    Object obj = this.f110601a.f110600d.f110598h.get(str);
                    if (obj == null) {
                        C52711k.m112234a();
                    }
                    ((ImageView) obj).setImageBitmap(bitmap);
                    this.f110601a.f110600d.f110597g.put(this.f110602b, bitmap);
                }
            }
        }

        public C43676a(C43675a aVar, ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            this.f110600d = aVar;
            super(viewGroup);
        }

        /* renamed from: a */
        public final void mo87504a(C43102c cVar, String str) {
            C52711k.m112240b(cVar, "holder");
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            SimpleDraweeView simpleDraweeView = cVar.f108813a;
            C52711k.m112236a((Object) simpleDraweeView, "holder.videoCover");
            simpleDraweeView.setScaleType(ScaleType.CENTER_CROP);
            Map map = this.f110600d.f110598h;
            SimpleDraweeView simpleDraweeView2 = cVar.f108813a;
            C52711k.m112236a((Object) simpleDraweeView2, "holder.videoCover");
            map.put(str, simpleDraweeView2);
            if (this.f110600d.f110597g.get(str) == null) {
                this.f110600d.f110599i.mo89132a(str, new C43677a(this, str));
            } else {
                cVar.f108813a.setImageBitmap((Bitmap) this.f110600d.f110597g.get(str));
            }
        }
    }

    public final int getItemViewType(int i) {
        return 10002;
    }

    public final int getItemCount() {
        if (this.f108806a == null) {
            return 0;
        }
        return this.f108806a.size();
    }

    public final long getItemId(int i) {
        return (long) ((C43170w) this.f108806a.get(i)).f109122a;
    }

    /* renamed from: b */
    public final void mo87499b(VideoSegment videoSegment) {
        if (videoSegment != null) {
            List list = this.f108806a;
            C52711k.m112236a((Object) list, "items");
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (C52711k.m112239a((Object) ((C43170w) this.f108806a.get(i)).f109123b.mo86941a(false), (Object) videoSegment.mo86941a(false))) {
                    this.f108806a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            notifyDataSetChanged();
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C43676a(this, viewGroup);
    }

    /* renamed from: a */
    public final void mo86929a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (vVar instanceof C43676a) {
            ((C43676a) vVar).mo87503a();
            this.f108811f.mo86800a(new C42663f(0, vVar.getAdapterPosition(), -1));
        }
    }

    /* renamed from: a */
    public final void mo86930a(C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(vVar, "sourceHolder");
        C52711k.m112240b(vVar2, "targetHolder");
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f108806a.size() && adapterPosition2 < this.f108806a.size()) {
            this.f108806a.add(adapterPosition2, (C43170w) this.f108806a.remove(adapterPosition));
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f108811f.mo86800a(new C42663f(1, adapterPosition, adapterPosition2));
        }
    }

    /* renamed from: a */
    public final void mo86931a(C1352v vVar, boolean z) {
        C52711k.m112240b(vVar, "holder");
        if (vVar instanceof C43676a) {
            ((C43676a) vVar).mo87506b();
            C42663f fVar = new C42663f(2, -1, vVar.getAdapterPosition());
            fVar.f107950a = z;
            this.f108811f.mo86800a(fVar);
        }
    }

    public C43675a(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        C52711k.m112240b(videoEditViewModel, "videoEditViewModel");
        C52711k.m112240b(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        C52711k.m112240b(list, "videoSegments");
        super(videoEditViewModel, cutMultiVideoViewModel, list);
    }
}

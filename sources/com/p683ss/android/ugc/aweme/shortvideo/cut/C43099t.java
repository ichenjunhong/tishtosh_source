package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.imported.C35524e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42663f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t */
public class C43099t extends C1322a<C1352v> implements C42651j {

    /* renamed from: a */
    public List<C43170w> f108806a = new ArrayList();

    /* renamed from: b */
    public int f108807b = 0;

    /* renamed from: c */
    public C43101b f108808c;

    /* renamed from: d */
    public boolean f108809d = true;

    /* renamed from: e */
    protected VideoEditViewModel f108810e;

    /* renamed from: f */
    protected CutMultiVideoViewModel f108811f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t$a */
    public class C43100a extends C1352v {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo87502a(View view) {
            C43099t.this.mo87382a(view);
        }

        public C43100a(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0s, viewGroup, false));
            DmtPlusView dmtPlusView = (DmtPlusView) this.itemView.findViewById(R.id.dm);
            dmtPlusView.setBgColor(Color.parseColor("#FFFFFF"));
            dmtPlusView.setAlpha(0.25f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t$b */
    public interface C43101b {
        /* renamed from: a */
        void mo87356a(View view, int i, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.t$c */
    public class C43102c extends C1352v {

        /* renamed from: a */
        public SimpleDraweeView f108813a = ((SimpleDraweeView) this.itemView.findViewById(R.id.dp2));

        /* renamed from: b */
        public VideoSegment f108814b;

        /* renamed from: d */
        private RelativeLayout f108816d = ((RelativeLayout) this.itemView.findViewById(R.id.cfl));

        /* renamed from: e */
        private TextView f108817e;

        /* renamed from: a */
        public final void mo87503a() {
            if (this.f108816d != null) {
                this.f108816d.setScaleX(1.25f);
                this.f108816d.setScaleY(1.25f);
            }
        }

        /* renamed from: b */
        public final void mo87506b() {
            if (this.f108816d != null) {
                this.f108816d.setScaleY(1.0f);
                this.f108816d.setScaleX(1.0f);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo87387a(C43102c cVar) {
            this.itemView.setOnClickListener(new C43104v(this, cVar));
        }

        public C43102c(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a17, viewGroup, false));
            SimpleDraweeView simpleDraweeView = this.f108813a;
            if (VERSION.SDK_INT >= 21) {
                simpleDraweeView.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) ((int) C9432q.m18687b((Context) C39629l.m88233b(), 2.0f)));
                    }
                });
                simpleDraweeView.setClipToOutline(true);
            }
            this.f108817e = (TextView) this.itemView.findViewById(R.id.ckd);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo87504a(C43102c cVar, String str) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            cVar.f108813a.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(cVar.f108813a.getController())).mo25757b(C14232c.m29169a(Uri.parse(sb.toString())).mo26453a(new C13952d(C23728o.m58241a(48.0d), C23728o.m58241a(48.0d))).mo26449a())).mo25763d());
            ((C13833a) cVar.f108813a.getHierarchy()).mo25904b(C42430at.m93196a(637534207, 637534207, 0, 0));
        }

        /* renamed from: a */
        public final void mo87505a(C43170w wVar, int i, C43102c cVar) {
            String str;
            this.f108814b = wVar.f109123b;
            if (TextUtils.isEmpty(wVar.f109123b.f107910i)) {
                str = wVar.f109123b.mo86941a(false);
            } else {
                str = wVar.f109123b.f107910i;
            }
            mo87504a(cVar, str);
            StringBuilder sb = new StringBuilder();
            sb.append(C2240a.m6773a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) (wVar.f109123b.mo86953g() - wVar.f109123b.mo86952f())) / (wVar.f109123b.mo86954h() * 1000.0f))}));
            sb.append("s");
            cVar.f108817e.setText(sb.toString());
            cVar.f108817e.setShadowLayer(6.0f, 0.0f, 4.0f, this.itemView.getContext().getResources().getColor(R.color.a3t));
            mo87387a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo87496a(List<VideoSegment> list) {
        this.f108806a.clear();
        for (VideoSegment videoSegment : list) {
            this.f108806a.add(new C43170w(videoSegment.f107902a, videoSegment));
        }
    }

    /* renamed from: a */
    public final void mo87495a(VideoSegment videoSegment) {
        for (int i = 0; i < this.f108806a.size(); i++) {
            if (((C43170w) this.f108806a.get(i)).f109123b.mo86950e().equals(videoSegment.mo86950e())) {
                ((C43170w) this.f108806a.get(i)).f109123b = videoSegment;
                notifyItemChanged(i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo87493a() {
        return mo87498b().size();
    }

    public int getItemCount() {
        if (this.f108806a == null) {
            return 0;
        }
        return this.f108806a.size() + 1;
    }

    /* renamed from: c */
    public final long mo87501c() {
        long j = 0;
        if (C9190h.m18253a(this.f108806a)) {
            return 0;
        }
        for (C43170w wVar : this.f108806a) {
            if (wVar != null && !wVar.f109123b.f107911j) {
                j += wVar.f109123b.f107904c;
            }
        }
        return j;
    }

    /* renamed from: b */
    public final ArrayList<String> mo87498b() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (C9190h.m18253a(this.f108806a)) {
            return arrayList;
        }
        for (C43170w wVar : this.f108806a) {
            if (wVar != null && !wVar.f109123b.f107911j) {
                if (C44300e.m97039a(wVar.f109123b.mo86941a(false))) {
                    arrayList.add(wVar.f109123b.f107910i);
                } else {
                    arrayList.add(wVar.f109123b.mo86941a(false));
                }
            }
        }
        return arrayList;
    }

    public int getItemViewType(int i) {
        if (i < this.f108806a.size()) {
            return 10002;
        }
        return 10003;
    }

    /* renamed from: a */
    public final ViewPropertyAnimator mo86928a(C1352v vVar) {
        return vVar.itemView.animate().scaleX(1.0f).scaleY(1.0f);
    }

    public long getItemId(int i) {
        if (getItemViewType(i) == 10003) {
            return 10003;
        }
        return (long) ((C43170w) this.f108806a.get(i)).f109122a;
    }

    /* renamed from: b */
    public void mo87499b(VideoSegment videoSegment) {
        int i = 0;
        while (true) {
            if (i >= this.f108806a.size()) {
                break;
            } else if (((C43170w) this.f108806a.get(i)).f109123b.mo86950e().equals(videoSegment.mo86950e())) {
                this.f108806a.remove(i);
                break;
            } else {
                i++;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C43170w mo87381a(int i) {
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C43170w) this.f108806a.get(i);
    }

    /* renamed from: b */
    public final void mo87500b(List<VideoSegment> list) {
        if (!C9190h.m18253a(list)) {
            if (this.f108806a == null) {
                this.f108806a = new ArrayList();
            }
            for (VideoSegment videoSegment : list) {
                this.f108806a.add(new C43170w(videoSegment.f107902a, videoSegment));
            }
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87382a(View view) {
        if (this.f108808c != null) {
            this.f108808c.mo87356a(view, 10003, null);
        }
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 10003) {
            return new C43100a(viewGroup);
        }
        return new C43102c(viewGroup);
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        if (vVar instanceof C43102c) {
            C43102c cVar = (C43102c) vVar;
            cVar.mo87505a(mo87381a(i), i, cVar);
            return;
        }
        if (vVar instanceof C43100a) {
            C43100a aVar = (C43100a) vVar;
            aVar.itemView.setOnClickListener(new C43103u(aVar));
        }
    }

    /* renamed from: a */
    public int mo87380a(RecyclerView recyclerView, int i) {
        C0794k a = C35524e.m80267a(recyclerView);
        if (i >= ((Integer) a.f2711a).intValue() && i <= ((Integer) a.f2712b).intValue() && i < getItemCount() && i >= 0) {
            C1352v f = recyclerView.mo4847f(i);
            if (f != null) {
                int[] iArr = new int[2];
                f.itemView.getLocationOnScreen(iArr);
                return iArr[0] + C23728o.m58241a(23.5d);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final Rect mo87497b(RecyclerView recyclerView, int i) {
        C0794k a = C35524e.m80267a(recyclerView);
        if (i >= ((Integer) a.f2711a).intValue() && i <= ((Integer) a.f2712b).intValue() && i < getItemCount() && i >= 0) {
            C1352v f = recyclerView.mo4847f(i);
            if (!(f == null || f.itemView == null)) {
                int[] iArr = new int[2];
                f.itemView.getLocationInWindow(iArr);
                return new Rect(iArr[0], iArr[1], iArr[0] + f.itemView.getWidth(), iArr[1] + f.itemView.getHeight());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87494a(int i, int i2) {
        this.f108810e.mo87634l().add(i2, (VideoSegment) this.f108810e.mo87634l().remove(i));
        int i3 = 0;
        for (VideoSegment videoSegment : this.f108810e.mo87634l()) {
            videoSegment.f107902a = i3;
            i3++;
        }
    }

    /* renamed from: a */
    public void mo86929a(C1352v vVar, int i) {
        if (vVar instanceof C43102c) {
            C43102c cVar = (C43102c) vVar;
            cVar.mo87503a();
            this.f108811f.mo86800a(new C42663f(0, cVar.f108814b.f107902a, -1));
        }
    }

    /* renamed from: a */
    public void mo86930a(C1352v vVar, C1352v vVar2) {
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f108806a.size() && adapterPosition2 < this.f108806a.size()) {
            int i = ((C43102c) vVar).f108814b.f107902a;
            int i2 = ((C43102c) vVar2).f108814b.f107902a;
            this.f108806a.add(adapterPosition2, (C43170w) this.f108806a.remove(adapterPosition));
            mo87494a(i, i2);
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f108811f.mo86800a(new C42663f(1, i, i2));
        }
    }

    /* renamed from: a */
    public void mo86931a(C1352v vVar, boolean z) {
        if (vVar instanceof C43102c) {
            C43102c cVar = (C43102c) vVar;
            cVar.mo87506b();
            C42663f fVar = new C42663f(2, -1, cVar.f108814b.f107902a);
            fVar.f107950a = z;
            this.f108811f.mo86800a(fVar);
        }
    }

    public C43099t(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        this.f108810e = videoEditViewModel;
        this.f108811f = cutMultiVideoViewModel;
        mo87496a(list);
        setHasStableIds(true);
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.p002a.p003a.p004a.C0034b.C0035a;
import android.p002a.p003a.p004a.C0037d;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p971k.C14048a;
import com.facebook.imagepipeline.p975o.C14229b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.imported.C35524e;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22808c;
import com.p683ss.android.ugc.aweme.p1361ap.C22818f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44029b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44284a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45406ax;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45454s;
import com.p683ss.android.ugc.aweme.utils.C47671al;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47871f;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter */
public final class MvImageChooseAdapter extends C1322a<C1352v> implements C44029b {

    /* renamed from: a */
    public int f111633a = 12;

    /* renamed from: b */
    public String f111634b;

    /* renamed from: c */
    final Context f111635c;

    /* renamed from: d */
    List<MyMediaModel> f111636d = new ArrayList();

    /* renamed from: e */
    public HashMap<String, MyMediaModel> f111637e = new HashMap<>();

    /* renamed from: f */
    public C44083d f111638f;

    /* renamed from: g */
    public C44082c f111639g;

    /* renamed from: h */
    public boolean f111640h = true;

    /* renamed from: i */
    public boolean f111641i;

    /* renamed from: j */
    int f111642j = 1;

    /* renamed from: k */
    public RecyclerView f111643k;

    /* renamed from: l */
    final List<C44147k> f111644l = new ArrayList();

    /* renamed from: m */
    public int f111645m = -1;

    /* renamed from: n */
    private int f111646n;

    /* renamed from: o */
    private C0035a f111647o;

    /* renamed from: p */
    private Map<Long, Float> f111648p = new HashMap();

    /* renamed from: q */
    private double f111649q;

    /* renamed from: r */
    private int f111650r;

    /* renamed from: s */
    private C22818f f111651s;

    /* renamed from: t */
    private final HashSet<String> f111652t = new HashSet<>();

    /* renamed from: u */
    private Long f111653u = Long.valueOf(0);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel */
    public static class MyMediaModel extends MediaModel implements C44147k {

        /* renamed from: q */
        public int f111661q = -1;

        /* renamed from: r */
        public int f111662r = -1;

        /* renamed from: s */
        public int f111663s = -1;

        /* renamed from: a */
        public final int mo89970a() {
            return 2;
        }

        public MyMediaModel(long j) {
            super(j);
        }

        /* renamed from: a */
        public static MyMediaModel m96697a(MediaModel mediaModel) {
            MyMediaModel myMediaModel = new MyMediaModel(mediaModel.f95382a);
            myMediaModel.f95383b = mediaModel.f95383b;
            myMediaModel.f95384c = mediaModel.f95384c;
            myMediaModel.f95385d = mediaModel.f95385d;
            myMediaModel.f95386e = mediaModel.f95386e;
            myMediaModel.f95387f = mediaModel.f95387f;
            myMediaModel.f95388g = mediaModel.f95388g;
            myMediaModel.f95389h = mediaModel.f95389h;
            myMediaModel.f95390i = mediaModel.f95390i;
            myMediaModel.f95391j = mediaModel.f95391j;
            myMediaModel.f95392k = mediaModel.f95392k;
            myMediaModel.f95393l = mediaModel.f95393l;
            myMediaModel.mo76674a(mediaModel.ce_());
            return myMediaModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$a */
    interface C44080a {
        /* renamed from: a */
        void mo89971a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$b */
    public enum C44081b {
        PREVIEW(1),
        THUMBNAIL(0);
        
        public int value;

        private C44081b(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c */
    public interface C44082c {
        /* renamed from: a */
        int mo89944a(MyMediaModel myMediaModel, boolean z);

        /* renamed from: a */
        void mo89945a(MyMediaModel myMediaModel, View view);

        /* renamed from: a */
        void mo89946a(List<MyMediaModel> list, C44081b bVar);

        /* renamed from: a */
        boolean mo89947a();

        /* renamed from: a */
        boolean mo89948a(MediaModel mediaModel);

        /* renamed from: a */
        boolean mo89949a(MyMediaModel myMediaModel);

        /* renamed from: b */
        void mo89950b(MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$d */
    public interface C44083d {
        /* renamed from: a */
        void mo89972a(View view, MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$e */
    static class C44084e extends C1352v {

        /* renamed from: a */
        DmtTextView f111665a;

        C44084e(View view) {
            super(view);
            this.f111665a = (DmtTextView) view.findViewById(R.id.f47);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$f */
    static class C44085f extends C1352v {

        /* renamed from: a */
        SimpleDraweeView f111666a;

        /* renamed from: b */
        TextView f111667b;

        /* renamed from: c */
        TextView f111668c;

        /* renamed from: d */
        FrameLayout f111669d;

        /* renamed from: e */
        View f111670e;

        /* renamed from: f */
        String f111671f;

        /* renamed from: g */
        MyMediaModel f111672g;

        /* renamed from: h */
        View f111673h;

        /* renamed from: i */
        int f111674i;

        /* renamed from: j */
        int f111675j;

        /* renamed from: b */
        private boolean m96708b() {
            if (this.f111675j == 6) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89973a() {
            this.f111667b.setText("");
            this.f111667b.setBackgroundResource(R.drawable.m5);
        }

        C44085f(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo89974a(int i) {
            if (m96708b()) {
                this.f111667b.setText("");
                this.f111667b.setBackgroundResource(R.drawable.ccs);
                return;
            }
            this.f111667b.setText(String.valueOf(i));
            this.f111667b.setBackgroundResource(R.drawable.m6);
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final CharSequence mo89892a(int i) {
        if (i < 0 || i >= this.f111644l.size()) {
            return "";
        }
        C44147k kVar = (C44147k) this.f111644l.get(i);
        if (kVar instanceof C44154q) {
            return C45406ax.m98965a(this.f111635c, ((C44154q) kVar).f111846b);
        }
        if (kVar instanceof MyMediaModel) {
            return C45406ax.m98965a(this.f111635c, ((MyMediaModel) kVar).f95384c * 1000);
        }
        return C45406ax.m98965a(this.f111635c, System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void mo89966a(boolean z) {
        m96683c();
        this.f111640h = z;
        if (!C9414h.m18630a(this.f111636d)) {
            this.f111636d.clear();
            this.f111637e.clear();
            if (this.f111639g != null) {
                this.f111639g.mo89946a(this.f111636d, (C44081b) null);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo89965a(List<MyMediaModel> list) {
        this.f111644l.clear();
        int b = C39618d.f101152P.mo83104b(C40790a.EnableAlbumTimelineAndFullScreenPreview);
        int i = 0;
        if (!(b == 2 || b == 3) || this.f111645m == 1) {
            while (i < list.size()) {
                ((MyMediaModel) list.get(i)).f111661q = i;
                this.f111644l.add(list.get(i));
                i++;
            }
        } else {
            this.f111653u = Long.valueOf(0);
            int i2 = 0;
            while (i < list.size()) {
                MyMediaModel myMediaModel = (MyMediaModel) list.get(i);
                Long valueOf = Long.valueOf(myMediaModel.f95384c);
                if (valueOf.longValue() / 86400 != this.f111653u.longValue() / 86400) {
                    this.f111644l.add(new C44154q(C45406ax.m98967b(this.f111635c, valueOf.longValue() * 1000), valueOf.longValue() * 1000));
                    i2++;
                }
                myMediaModel.f111661q = i2;
                this.f111644l.add(myMediaModel);
                i2++;
                this.f111653u = valueOf;
                i++;
            }
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo89963a() {
        C0794k a = C35524e.m80267a(this.f111643k);
        int intValue = ((Integer) a.f2711a).intValue();
        notifyItemRangeChanged(intValue, ((Integer) a.f2712b).intValue() - intValue, new Object());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo89964a(MediaModel mediaModel, C44080a aVar) {
        if (3 == this.f111650r) {
            if (mediaModel.mo76676c()) {
                m96684c(mediaModel, aVar);
            } else {
                m96682b(mediaModel, aVar);
            }
        } else if (1 == this.f111650r) {
            m96684c(mediaModel, aVar);
        } else {
            m96682b(mediaModel, aVar);
        }
    }

    public final int getItemCount() {
        return this.f111644l.size();
    }

    /* renamed from: c */
    private void m96683c() {
        for (MyMediaModel myMediaModel : this.f111636d) {
            myMediaModel.f111662r = -1;
        }
        for (C44147k kVar : this.f111644l) {
            if (kVar instanceof MyMediaModel) {
                ((MyMediaModel) kVar).f111662r = -1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo89967b() {
        int i = -1;
        for (C44147k kVar : this.f111644l) {
            i++;
            if (kVar instanceof MyMediaModel) {
                for (MyMediaModel myMediaModel : this.f111636d) {
                    if (((MyMediaModel) kVar).f95383b.equals(myMediaModel.f95383b)) {
                        if (this.f111652t.isEmpty()) {
                            notifyItemChanged(i, new Object());
                        } else {
                            notifyItemChanged(i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo89969c(List<String> list) {
        this.f111652t.addAll(list);
    }

    public final int getItemViewType(int i) {
        return ((C44147k) this.f111644l.get(i)).mo89970a();
    }

    /* renamed from: a */
    private void m96675a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f111646n) {
            int i = layoutParams.height;
            double d = (double) this.f111646n;
            double d2 = this.f111649q;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f111646n;
                double d3 = (double) this.f111646n;
                double d4 = this.f111649q;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: a */
    private static void m96677a(C44085f fVar) {
        Object tag = fVar.f111666a.getTag(R.id.b4u);
        if (tag instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) tag;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            fVar.f111666a.setTag(R.id.b4u, null);
        }
    }

    /* renamed from: b */
    private static String m96681b(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            return C2240a.m6773a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        return C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
    }

    /* renamed from: b */
    public final void mo89968b(List<MyMediaModel> list) {
        C44147k kVar;
        int i;
        boolean z;
        if (this.f111644l.size() > 0) {
            kVar = (C44147k) this.f111644l.get(this.f111644l.size() - 1);
        } else {
            kVar = null;
        }
        if ((kVar instanceof MyMediaModel) && list != null && list.size() > 0) {
            i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                i++;
                if (((MyMediaModel) list.get(i2)).f95382a == ((MyMediaModel) kVar).f95382a) {
                    break;
                }
            }
        } else {
            i = -1;
        }
        int size = this.f111644l.size();
        int i3 = size;
        for (int i4 = i + 1; i4 < list.size(); i4++) {
            int b = C39618d.f101152P.mo83104b(C40790a.EnableAlbumTimelineAndFullScreenPreview);
            if (b == 2 || b == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!z || this.f111645m == 1) {
                ((MyMediaModel) list.get(i4)).f111661q = i3;
                this.f111644l.add(list.get(i4));
                i3++;
            } else {
                MyMediaModel myMediaModel = (MyMediaModel) list.get(i4);
                long j = myMediaModel.f95384c;
                if (j / 86400 != this.f111653u.longValue() / 86400) {
                    long j2 = 1000 * j;
                    this.f111644l.add(new C44154q(C45406ax.m98967b(this.f111635c, j2), j2));
                    i3++;
                }
                myMediaModel.f111661q = i3;
                this.f111644l.add(myMediaModel);
                i3++;
                this.f111653u = Long.valueOf(j);
            }
        }
        if (C47671al.m103181a()) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeInserted(size, this.f111644l.size());
        }
    }

    /* renamed from: a */
    static void m96676a(MediaModel mediaModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaModel);
        C44300e.m97037a((List<? extends MediaModel>) arrayList, (C44284a) new C44105an(z));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (getItemViewType(i) == 2) {
            m96678a((C44085f) vVar, i, false);
            return;
        }
        C44147k kVar = (C44147k) this.f111644l.get(i);
        if (kVar instanceof C44154q) {
            ((C44084e) vVar).f111665a.setText(((C44154q) kVar).f111845a);
        }
    }

    /* renamed from: c */
    private void m96684c(MediaModel mediaModel, C44080a aVar) {
        if (this.f111651s == null) {
            this.f111651s = new C22808c(this.f111635c);
            this.f111651s.mo47262a("enter_from_multi");
        }
        this.f111651s.mo47261a(mediaModel, 1000, -1, new C44102ak(this, aVar, mediaModel), new C44103al(this, mediaModel));
    }

    /* renamed from: a */
    private void m96679a(C44085f fVar, boolean z) {
        float f;
        float f2 = 1.0f;
        if (fVar.f111672g.f111662r >= 0) {
            fVar.mo89974a(fVar.f111672g.f111662r);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            fVar.mo89973a();
            if (this.f111639g.mo89947a()) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (fVar.f111666a.getAlpha() != f) {
            fVar.f111666a.setAlpha(f);
        }
        if (fVar.f111666a.getScaleX() != f2) {
            if (z) {
                fVar.f111666a.animate().scaleY(f2).scaleX(f2).setDuration(300).start();
            } else {
                fVar.f111666a.setScaleX(f2);
                fVar.f111666a.setScaleY(f2);
            }
        }
    }

    /* renamed from: b */
    private void m96682b(MediaModel mediaModel, C44080a aVar) {
        double d = (double) mediaModel.f95390i;
        double d2 = (double) mediaModel.f95391j;
        Double.isNaN(d2);
        if (d <= d2 * 2.4d) {
            double d3 = (double) mediaModel.f95391j;
            double d4 = (double) mediaModel.f95390i;
            Double.isNaN(d4);
            if (d3 <= d4 * 2.4d) {
                C47871f.m103559a().mo95087a(mediaModel.f95383b, C47804db.IMAGE);
                aVar.mo89971a();
                return;
            }
        }
        C44108ap.m96742a(0, 1);
        C10691a.m21548c(this.f111635c, (int) R.string.dhr).mo19066a();
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 0;
        if (i != 2) {
            return new C44084e(LayoutInflater.from(this.f111635c).inflate(R.layout.blc, viewGroup, false));
        }
        View inflate = LayoutInflater.from(this.f111635c).inflate(R.layout.rn, viewGroup, false);
        C44085f fVar = new C44085f(inflate);
        fVar.f111666a = (SimpleDraweeView) inflate.findViewById(R.id.bky);
        fVar.f111667b = (TextView) inflate.findViewById(R.id.ari);
        fVar.f111669d = (FrameLayout) inflate.findViewById(R.id.ah5);
        fVar.f111670e = inflate.findViewById(R.id.cme);
        fVar.f111668c = (TextView) inflate.findViewById(R.id.a91);
        TextView textView = fVar.f111668c;
        if (!this.f111641i) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        fVar.f111673h = inflate.findViewById(R.id.ckw);
        fVar.f111673h.findViewById(R.id.ckv).setVisibility(8);
        fVar.f111675j = this.f111645m;
        return fVar;
    }

    public final void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        if (getItemViewType(i) != 2) {
            C44147k kVar = (C44147k) this.f111644l.get(i);
            if (kVar instanceof C44154q) {
                ((C44084e) vVar).f111665a.setText(((C44154q) kVar).f111845a);
            }
        } else if (list.isEmpty()) {
            m96678a((C44085f) vVar, i, false);
        } else {
            m96678a((C44085f) vVar, i, true);
        }
    }

    /* renamed from: a */
    private void m96678a(C44085f fVar, int i, boolean z) {
        int i2;
        float f;
        int i3;
        final C44085f fVar2 = fVar;
        int i4 = i;
        boolean z2 = z;
        m96675a((View) fVar2.f111666a);
        m96675a(fVar2.f111670e);
        C44147k kVar = (C44147k) this.f111644l.get(i4);
        if (kVar instanceof MyMediaModel) {
            final MyMediaModel myMediaModel = (MyMediaModel) kVar;
            if (myMediaModel == null) {
                StringBuilder sb = new StringBuilder("mediaModel is empty ");
                sb.append(i4);
                sb.append(" cur type: ");
                sb.append(this.f111650r);
                sb.append("  ");
                sb.append(this.f111644l.size());
                C50203g.m108361b(sb.toString());
                return;
            }
            myMediaModel.f111661q = i4;
            fVar2.f111672g = myMediaModel;
            fVar2.f111674i = i4;
            FrameLayout frameLayout = fVar2.f111669d;
            if (this.f111640h) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
            m96679a(fVar2, z2);
            fVar2.f111673h.setVisibility(8);
            if (this.f111652t.contains(myMediaModel.f95383b)) {
                fVar2.f111673h.setVisibility(0);
            }
            if (!z2) {
                StringBuilder sb2 = new StringBuilder("file://");
                sb2.append(myMediaModel.f95383b);
                String sb3 = sb2.toString();
                Bitmap bitmap = null;
                if (this.f111647o != null) {
                    if (1 == myMediaModel.f95385d) {
                        i3 = 1;
                    } else {
                        i3 = 3;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    bitmap = this.f111647o.mo49a((int) myMediaModel.f95382a, myMediaModel.f95384c, i3, 2, null);
                    C44150n.m96800a(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb4 = new StringBuilder("hw thumbnail dup id:");
                    sb4.append(myMediaModel.f95382a);
                    sb4.append(" url: ");
                    sb4.append(sb3);
                    C50203g.m108361b(sb4.toString());
                }
                if (!TextUtils.equals(fVar2.f111671f, sb3)) {
                    fVar2.f111671f = sb3;
                    if (bitmap != null) {
                        if (this.f111648p.containsKey(Long.valueOf(myMediaModel.f95382a))) {
                            f = ((Float) this.f111648p.get(Long.valueOf(myMediaModel.f95382a))).floatValue();
                        } else {
                            f = (float) C45454s.m99046a(fVar2.f111671f);
                            this.f111648p.put(Long.valueOf(myMediaModel.f95382a), Float.valueOf(f));
                        }
                        m96677a(fVar);
                        if (f != 0.0f) {
                            bitmap = C45454s.m99047a(bitmap, f);
                        }
                        fVar2.f111666a.setTag(R.id.b4u, bitmap);
                        fVar2.f111666a.setImageBitmap(bitmap);
                    } else {
                        C50181a.m108295a(fVar2.f111666a, fVar2.f111671f, this.f111646n, this.f111646n, Config.ARGB_4444, new C14048a() {

                            /* renamed from: a */
                            long f111654a;

                            public final void onRequestSuccess(C14229b bVar, String str, boolean z) {
                                super.onRequestSuccess(bVar, str, z);
                                C44150n.m96800a(System.currentTimeMillis() - this.f111654a);
                            }

                            public final void onRequestStart(C14229b bVar, Object obj, String str, boolean z) {
                                super.onRequestStart(bVar, obj, str, z);
                                this.f111654a = System.currentTimeMillis();
                            }
                        });
                    }
                }
                if (myMediaModel.f111662r >= 0) {
                    fVar2.f111670e.setVisibility(0);
                } else {
                    fVar2.f111670e.setVisibility(4);
                }
            }
            fVar2.itemView.setOnClickListener(new C47687av() {
                /* renamed from: a */
                public final void mo59929a(View view) {
                    boolean z;
                    if (fVar2.f111672g.f111662r >= 0 || !MvImageChooseAdapter.this.f111639g.mo89947a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z && MvImageChooseAdapter.this.f111638f != null) {
                        MvImageChooseAdapter.this.f111638f.mo89972a(view, myMediaModel);
                    }
                }
            });
            fVar2.f111669d.setOnClickListener(new C47687av() {
                /* renamed from: a */
                public final void mo59929a(View view) {
                    MvImageChooseAdapter mvImageChooseAdapter = MvImageChooseAdapter.this;
                    C44085f fVar = fVar2;
                    if (fVar.f111672g.f111662r >= 0) {
                        fVar.f111670e.animate().alpha(0.0f).setDuration(300).withEndAction(new C44100ai(fVar)).start();
                        int i = fVar.f111672g.f111662r;
                        int i2 = -1;
                        fVar.f111672g.f111662r = -1;
                        for (int i3 = 0; i3 < mvImageChooseAdapter.f111636d.size(); i3++) {
                            MyMediaModel myMediaModel = (MyMediaModel) mvImageChooseAdapter.f111636d.get(i3);
                            if (myMediaModel.f95382a == fVar.f111672g.f95382a) {
                                i2 = i3;
                            }
                            if (myMediaModel.f111662r > i) {
                                myMediaModel.f111662r--;
                            }
                        }
                        mvImageChooseAdapter.f111637e.remove(fVar.f111672g.f95383b);
                        if (i2 >= 0) {
                            mvImageChooseAdapter.f111636d.remove(i2);
                        }
                        if (mvImageChooseAdapter.f111636d.size() + 1 == mvImageChooseAdapter.f111633a) {
                            mvImageChooseAdapter.mo89963a();
                            mvImageChooseAdapter.notifyItemChanged(fVar.f111674i, new Object());
                        } else {
                            if (fVar.f111674i >= 0) {
                                mvImageChooseAdapter.notifyItemChanged(fVar.f111674i, new Object());
                            }
                            for (MyMediaModel myMediaModel2 : mvImageChooseAdapter.f111636d) {
                                mvImageChooseAdapter.notifyItemChanged(myMediaModel2.f111661q, new Object());
                            }
                        }
                        if (mvImageChooseAdapter.f111639g != null) {
                            mvImageChooseAdapter.f111639g.mo89946a(mvImageChooseAdapter.f111636d, C44081b.THUMBNAIL);
                            mvImageChooseAdapter.f111639g.mo89944a(fVar.f111672g, false);
                        }
                        return;
                    }
                    if (!C48016e.m103944b(fVar.f111672g.f95383b)) {
                        if (fVar.f111672g.mo76676c()) {
                            C10691a.m21551c(mvImageChooseAdapter.f111635c, mvImageChooseAdapter.f111635c.getString(R.string.bex)).mo19066a();
                            MvImageChooseAdapter.m96676a((MediaModel) fVar.f111672g, false);
                        } else {
                            C10691a.m21551c(mvImageChooseAdapter.f111635c, mvImageChooseAdapter.f111635c.getString(R.string.coz)).mo19066a();
                        }
                    } else if (mvImageChooseAdapter.f111639g.mo89947a()) {
                        C10691a.m21551c(mvImageChooseAdapter.f111635c, mvImageChooseAdapter.f111634b).mo19066a();
                        if (fVar.f111672g.mo76676c()) {
                            MvImageChooseAdapter.m96676a((MediaModel) fVar.f111672g, false);
                        }
                    } else if (mvImageChooseAdapter.f111639g.mo89948a((MediaModel) fVar.f111672g) && mvImageChooseAdapter.f111639g.mo89949a(fVar.f111672g)) {
                        mvImageChooseAdapter.mo89964a((MediaModel) fVar.f111672g, (C44080a) new C44101aj(mvImageChooseAdapter, fVar));
                    }
                }
            });
            fVar2.f111667b.setOnClickListener(new C44099ah(fVar2));
            if (myMediaModel.f95385d == 4) {
                fVar2.f111668c.setText(m96681b(Math.round((((float) myMediaModel.f95386e) * 1.0f) / 1000.0f)));
                if (this.f111641i) {
                    fVar2.f111668c.setVisibility(0);
                } else {
                    fVar2.f111668c.setVisibility(8);
                }
            } else {
                fVar2.f111668c.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private static void m96680a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C23569o.m57780a("aweme_video_import_duration", jSONObject, C23088c.m56631a().mo47824a("status", String.valueOf(i)).mo47824a("scene_name", str2).mo47824a("type", str).mo47825b());
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo89962a(C44080a aVar, MediaModel mediaModel, String str, Long l) {
        m96680a(str, 0, l.longValue(), "select");
        aVar.mo89971a();
        m96676a(mediaModel, true);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo89961a(MediaModel mediaModel, String str, Long l, Integer num, String str2) {
        m96680a(str, 1, l.longValue(), "select");
        C23569o.m57776a("aweme_movie_import_error_rate", 1, C23088c.m56631a().mo47824a("errorCode", String.valueOf(num)).mo47824a("errorMsg", str2).mo47825b());
        C44108ap.m96742a(num.intValue(), 0);
        C44153p.m96803a(this.f111635c, num.intValue(), 1000);
        m96676a(mediaModel, false);
        return null;
    }

    public MvImageChooseAdapter(Context context, int i, double d, float f, int i2, int i3) {
        this.f111635c = context;
        this.f111649q = 1.0d;
        context.getResources().getDimensionPixelOffset(R.dimen.ja);
        this.f111646n = ((C9432q.m18670a(context) - (((int) C9432q.m18687b(this.f111635c, 1.5f)) * 3)) + 0) / 4;
        this.f111634b = this.f111635c.getString(R.string.a2j);
        this.f111650r = i3;
        if (C39618d.f101152P.mo83103a(C40790a.EnableVboostOpt)) {
            this.f111647o = C0037d.m58b().mo51a();
        }
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad */
public final class C44091ad extends C1322a<C44094c> implements OnClickListener {

    /* renamed from: a */
    ArrayList<C44092a> f111698a = new ArrayList<>();

    /* renamed from: b */
    HashMap<String, C44092a> f111699b;

    /* renamed from: c */
    int f111700c;

    /* renamed from: d */
    C44093b f111701d;

    /* renamed from: e */
    C44092a f111702e = null;

    /* renamed from: f */
    public C44095d f111703f;

    /* renamed from: g */
    private Context f111704g;

    /* renamed from: h */
    private LayoutInflater f111705h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad$a */
    class C44092a {

        /* renamed from: a */
        String f111706a = "";

        /* renamed from: b */
        List<MyMediaModel> f111707b = new ArrayList();

        /* renamed from: c */
        List<MyMediaModel> f111708c = new ArrayList();

        /* renamed from: a */
        public final List<MyMediaModel> mo90003a() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f111707b);
            arrayList.addAll(this.f111708c);
            Collections.sort(arrayList, C44098ag.f111722a);
            return arrayList;
        }

        C44092a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad$b */
    public interface C44093b {
        /* renamed from: a */
        void mo89953a(C44092a aVar, boolean z, int i, boolean z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad$c */
    class C44094c extends C1352v {

        /* renamed from: a */
        View f111710a;

        /* renamed from: b */
        AnimatedImageView f111711b;

        /* renamed from: c */
        TextView f111712c;

        /* renamed from: d */
        TextView f111713d;

        C44094c(View view, AnimatedImageView animatedImageView, TextView textView, TextView textView2) {
            super(view);
            this.f111710a = view;
            this.f111711b = animatedImageView;
            this.f111712c = textView;
            this.f111713d = textView2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad$d */
    public interface C44095d {
        /* renamed from: a */
        void mo90004a(int i);
    }

    public final int getItemCount() {
        return this.f111698a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C44092a mo90000a() {
        if (this.f111698a.size() > 0) {
            return (C44092a) this.f111698a.get(0);
        }
        return null;
    }

    public final int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C44092a aVar = (C44092a) view.getTag();
        if (this.f111701d != null) {
            this.f111701d.mo89953a(aVar, true, this.f111700c, true);
            this.f111702e = aVar;
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.f111705h.inflate(R.layout.xk, viewGroup, false);
        C44094c cVar = new C44094c(inflate, (AnimatedImageView) inflate.findViewById(R.id.b1k), (TextView) inflate.findViewById(R.id.arf), (TextView) inflate.findViewById(R.id.ara));
        inflate.setOnClickListener(this);
        return cVar;
    }

    public C44091ad(Context context, C44093b bVar) {
        this.f111704g = context;
        this.f111705h = LayoutInflater.from(context);
        this.f111701d = bVar;
        C44092a aVar = new C44092a();
        aVar.f111706a = this.f111704g.getResources().getString(R.string.h2);
        this.f111698a.add(aVar);
        this.f111699b = new HashMap<>();
        Iterator it = this.f111698a.iterator();
        while (it.hasNext()) {
            C44092a aVar2 = (C44092a) it.next();
            this.f111699b.put(aVar2.f111706a, aVar2);
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        MediaModel mediaModel;
        int i2;
        C44094c cVar = (C44094c) vVar;
        C44092a aVar = (C44092a) this.f111698a.get(i);
        cVar.f111710a.setTag(aVar);
        cVar.f111712c.setText(aVar.f111706a);
        cVar.f111713d.setText(String.valueOf(aVar.f111707b.size() + aVar.f111708c.size()));
        if (aVar.f111707b.size() != 0 || aVar.f111708c.size() != 0) {
            if (C9414h.m18630a(aVar.f111707b)) {
                mediaModel = (MediaModel) aVar.f111708c.get(0);
            } else {
                mediaModel = (MediaModel) aVar.f111707b.get(0);
            }
            if (mediaModel != null && C48016e.m103944b(mediaModel.f95383b)) {
                if (cVar.f111711b.getLayoutParams().width > 0) {
                    i2 = cVar.f111711b.getLayoutParams().width;
                } else {
                    i2 = -1;
                }
                C50181a.m108294a((SimpleDraweeView) cVar.f111711b, Uri.fromFile(new File(mediaModel.f95383b)).toString(), i2, i2, Config.ARGB_4444);
            }
        }
    }

    /* renamed from: a */
    static void m96727a(C44092a aVar, MyMediaModel myMediaModel, int i) {
        if (myMediaModel != null) {
            if (i == 4) {
                aVar.f111708c.add(myMediaModel);
                return;
            }
            if (i == 3) {
                aVar.f111707b.add(myMediaModel);
            }
        }
    }

    /* renamed from: a */
    public final void mo90001a(List<MyMediaModel> list, int i, boolean z, boolean z2) {
        if (i == 4 || i == 3) {
            C0013i.m16a((Callable<TResult>) new C44096ae<TResult>(this, z, i, list)).mo20a((C0011g<TResult, TContinuationResult>) new C44097af<TResult,TContinuationResult>(this, i, z2), C0013i.f25b);
        }
    }
}

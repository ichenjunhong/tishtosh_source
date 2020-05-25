package com.p683ss.android.ugc.aweme.sticker.prop.p2313a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.prop.fragment.C46388d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.a.b */
public final class C46358b extends BaseAdapter {

    /* renamed from: a */
    public List<C46069d> f116954a = new ArrayList();

    /* renamed from: b */
    public int f116955b;

    /* renamed from: c */
    private Context f116956c;

    /* renamed from: d */
    private C46388d f116957d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.a.b$a */
    static class C46359a {

        /* renamed from: a */
        public View f116958a;

        /* renamed from: b */
        public RemoteImageView f116959b;

        C46359a() {
        }
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        if (this.f116954a == null) {
            return 0;
        }
        return this.f116954a.size();
    }

    public C46358b(Context context, C46388d dVar) {
        this.f116956c = context;
        this.f116957d = dVar;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C46359a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f116956c).inflate(R.layout.a0u, viewGroup, false);
            aVar = new C46359a();
            aVar.f116958a = view.findViewById(R.id.arv);
            aVar.f116959b = (RemoteImageView) view.findViewById(R.id.ct_);
            view.setTag(aVar);
        } else {
            aVar = (C46359a) view.getTag();
        }
        ((C13833a) aVar.f116959b.getHierarchy()).mo25902b((int) R.drawable.dy2);
        C23515d.m57669a(aVar.f116959b, ((C46069d) this.f116954a.get(i)).iconUrl);
        if (((C46069d) this.f116954a.get(i)).mIsSelect) {
            aVar.f116958a.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f116958a, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        } else {
            aVar.f116958a.setVisibility(4);
        }
        return view;
    }
}

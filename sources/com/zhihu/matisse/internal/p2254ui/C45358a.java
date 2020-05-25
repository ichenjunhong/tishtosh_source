package com.zhihu.matisse.internal.p2254ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2252b.C45342b;
import com.zhihu.matisse.internal.p2252b.C45342b.C45343a;
import com.zhihu.matisse.internal.p2252b.C45344c;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52525a;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52525a.C52528b;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52525a.C52530d;
import com.zhihu.matisse.internal.p2254ui.widget.C52544c;

/* renamed from: com.zhihu.matisse.internal.ui.a */
public class C45358a extends Fragment implements C45343a, C52528b, C52530d {

    /* renamed from: a */
    public C52525a f114705a;

    /* renamed from: b */
    private final C45342b f114706b = new C45342b();

    /* renamed from: c */
    private RecyclerView f114707c;

    /* renamed from: d */
    private C45359a f114708d;

    /* renamed from: e */
    private C52528b f114709e;

    /* renamed from: f */
    private C52530d f114710f;

    /* renamed from: com.zhihu.matisse.internal.ui.a$a */
    public interface C45359a {
        /* renamed from: c */
        C45344c mo91686c();
    }

    /* renamed from: a */
    public final void mo91640a() {
        this.f114705a.mo110067a(null);
    }

    /* renamed from: b */
    public final void mo91685b() {
        if (this.f114709e != null) {
            this.f114709e.mo91685b();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f114706b.mo91637a();
    }

    /* renamed from: a */
    public final void mo91641a(Cursor cursor) {
        this.f114705a.mo110067a(cursor);
    }

    /* renamed from: a */
    public static C45358a m98907a(Album album) {
        C45358a aVar = new C45358a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", album);
        aVar.setArguments(bundle);
        return aVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C45359a) {
            this.f114708d = (C45359a) context;
            if (context instanceof C52528b) {
                this.f114709e = (C52528b) context;
            }
            if (context instanceof C52530d) {
                this.f114710f = (C52530d) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Album album = (Album) getArguments().getParcelable("extra_album");
        this.f114705a = new C52525a(getContext(), this.f114708d.mo91686c(), this.f114707c);
        this.f114705a.f130796a = this;
        this.f114705a.f130797b = this;
        int i = 1;
        this.f114707c.setHasFixedSize(true);
        C45353c a = C45353c.m98893a();
        if (a.f114677n > 0) {
            int round = Math.round(((float) getContext().getResources().getDisplayMetrics().widthPixels) / ((float) a.f114677n));
            if (round != 0) {
                i = round;
            }
        } else {
            i = a.f114676m;
        }
        this.f114707c.setLayoutManager(new GridLayoutManager(getContext(), i));
        this.f114707c.mo4798a((C1331h) new C52544c(i, getResources().getDimensionPixelSize(R.dimen.jc), false));
        this.f114707c.setAdapter(this.f114705a);
        this.f114706b.mo91638a(getActivity(), (C45343a) this);
        this.f114706b.mo91639a(album, a.f114674k);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f114707c = (RecyclerView) view.findViewById(R.id.cak);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.oc, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo91684a(Album album, Item item, int i) {
        if (this.f114710f != null) {
            this.f114710f.mo91684a((Album) getArguments().getParcelable("extra_album"), item, i);
        }
    }
}

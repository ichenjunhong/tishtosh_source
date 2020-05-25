package com.zhihu.matisse.internal.p2254ui.p2626a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C45352b;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2252b.C45344c;
import com.zhihu.matisse.internal.p2254ui.widget.CheckView;
import com.zhihu.matisse.internal.p2254ui.widget.MediaGrid;
import com.zhihu.matisse.internal.p2254ui.widget.MediaGrid.C52537a;
import com.zhihu.matisse.internal.p2254ui.widget.MediaGrid.C52538b;

/* renamed from: com.zhihu.matisse.internal.ui.a.a */
public final class C52525a extends C52535d<C1352v> implements C52537a {

    /* renamed from: a */
    public C52528b f130796a;

    /* renamed from: b */
    public C52530d f130797b;

    /* renamed from: d */
    private final C45344c f130798d;

    /* renamed from: e */
    private final Drawable f130799e;

    /* renamed from: f */
    private C45353c f130800f = C45353c.m98893a();

    /* renamed from: g */
    private RecyclerView f130801g;

    /* renamed from: h */
    private int f130802h;

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$a */
    static class C52527a extends C1352v {

        /* renamed from: a */
        public TextView f130804a;

        C52527a(View view) {
            super(view);
            this.f130804a = (TextView) view.findViewById(R.id.aos);
        }
    }

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$b */
    public interface C52528b {
        /* renamed from: b */
        void mo91685b();
    }

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$c */
    static class C52529c extends C1352v {

        /* renamed from: a */
        public MediaGrid f130805a;

        C52529c(View view) {
            super(view);
            this.f130805a = (MediaGrid) view;
        }
    }

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$d */
    public interface C52530d {
        /* renamed from: a */
        void mo91684a(Album album, Item item, int i);
    }

    /* renamed from: com.zhihu.matisse.internal.ui.a.a$e */
    public interface C52531e {
        /* renamed from: d */
        void mo110062d();
    }

    /* renamed from: a */
    private void m112005a() {
        notifyDataSetChanged();
        if (this.f130796a != null) {
            this.f130796a.mo91685b();
        }
    }

    /* renamed from: a */
    private boolean m112006a(Context context, Item item) {
        C45352b d = this.f130798d.mo91650d(item);
        C45352b.m98892a(context, d);
        if (d == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo110057a(int i, Cursor cursor) {
        boolean z;
        if (Item.m98888a(cursor).f114653a == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 1;
        }
        return 2;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C52527a aVar = new C52527a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.acg, viewGroup, false));
            aVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (view.getContext() instanceof C52531e) {
                        ((C52531e) view.getContext()).mo110062d();
                    }
                }
            });
            return aVar;
        } else if (i == 2) {
            return new C52529c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a_t, viewGroup, false));
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110058a(C1352v vVar, Cursor cursor) {
        int i;
        if (vVar instanceof C52527a) {
            C52527a aVar = (C52527a) vVar;
            Drawable[] compoundDrawables = aVar.f130804a.getCompoundDrawables();
            TypedArray obtainStyledAttributes = vVar.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.e2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
                Drawable drawable = compoundDrawables[i2];
                if (drawable != null) {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        Drawable mutate = constantState.newDrawable().mutate();
                        mutate.setColorFilter(color, Mode.SRC_IN);
                        mutate.setBounds(drawable.getBounds());
                        compoundDrawables[i2] = mutate;
                    }
                }
            }
            aVar.f130804a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            return;
        }
        if (vVar instanceof C52529c) {
            C52529c cVar = (C52529c) vVar;
            Item a = Item.m98888a(cursor);
            MediaGrid mediaGrid = cVar.f130805a;
            Context context = cVar.f130805a.getContext();
            if (this.f130802h == 0) {
                int i3 = ((GridLayoutManager) this.f130801g.getLayoutManager()).f4521b;
                this.f130802h = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.jc) * (i3 - 1))) / i3;
                this.f130802h = (int) (((float) this.f130802h) * this.f130800f.f114678o);
            }
            mediaGrid.f130833f = new C52538b(this.f130802h, this.f130799e, this.f130800f.f114669f, vVar);
            MediaGrid mediaGrid2 = cVar.f130805a;
            mediaGrid2.f130832e = a;
            ImageView imageView = mediaGrid2.f130830c;
            if (mediaGrid2.f130832e.mo91664b()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            mediaGrid2.f130829b.setCountable(mediaGrid2.f130833f.f130837c);
            C14229b a2 = C14232c.m29169a(mediaGrid2.f130832e.f114655c).mo26453a(new C13952d(mediaGrid2.f130833f.f130835a, mediaGrid2.f130833f.f130835a)).mo26449a();
            if (mediaGrid2.f130832e.mo91664b()) {
                mediaGrid2.f130828a.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(mediaGrid2.f130828a.getController())).mo25757b(a2)).mo25762c(true)).mo25763d());
            } else {
                mediaGrid2.f130828a.setImageRequest(a2);
            }
            if (mediaGrid2.f130832e.mo91665c()) {
                mediaGrid2.f130831d.setVisibility(0);
                mediaGrid2.f130831d.setText(DateUtils.formatElapsedTime(mediaGrid2.f130832e.f114657e / 1000));
            } else {
                mediaGrid2.f130831d.setVisibility(8);
            }
            cVar.f130805a.setOnMediaGridClickListener(this);
            MediaGrid mediaGrid3 = cVar.f130805a;
            if (this.f130800f.f114669f) {
                int e = this.f130798d.mo91652e(a);
                if (e > 0 || !this.f130798d.mo91653e()) {
                    mediaGrid3.setCheckEnabled(true);
                    mediaGrid3.setCheckedNum(e);
                    return;
                }
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setCheckedNum(DynamicTabYellowPointVersion.DEFAULT);
            } else if (this.f130798d.mo91649c(a)) {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(true);
            } else if (this.f130798d.mo91653e()) {
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setChecked(false);
            } else {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(false);
            }
        }
    }

    public C52525a(Context context, C45344c cVar, RecyclerView recyclerView) {
        super(null);
        this.f130798d = cVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.pe});
        this.f130799e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f130801g = recyclerView;
    }

    /* renamed from: a */
    public final void mo110059a(ImageView imageView, Item item, C1352v vVar) {
        if (this.f130797b != null) {
            this.f130797b.mo91684a(null, item, vVar.getAdapterPosition());
        }
    }

    /* renamed from: a */
    public final void mo110060a(CheckView checkView, Item item, C1352v vVar) {
        if (this.f130800f.f114669f) {
            if (this.f130798d.mo91652e(item) != Integer.MIN_VALUE) {
                this.f130798d.mo91647b(item);
                m112005a();
            } else if (m112006a(vVar.itemView.getContext(), item)) {
                this.f130798d.mo91644a(item);
                m112005a();
            }
        } else if (this.f130798d.mo91649c(item)) {
            this.f130798d.mo91647b(item);
            m112005a();
        } else if (m112006a(vVar.itemView.getContext(), item)) {
            this.f130798d.mo91644a(item);
            m112005a();
        }
    }
}

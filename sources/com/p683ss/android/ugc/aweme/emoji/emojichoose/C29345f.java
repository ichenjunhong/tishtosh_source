package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29289e;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.emoji.utils.C29478h;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f */
public final class C29345f {

    /* renamed from: a */
    public View f76842a = LayoutInflater.from(this.f76845d).inflate(R.layout.ll, this.f76846e, false);

    /* renamed from: b */
    public GridView f76843b = ((GridView) this.f76842a.findViewById(R.id.a_w));

    /* renamed from: c */
    public int f76844c;

    /* renamed from: d */
    private Context f76845d;

    /* renamed from: e */
    private ViewGroup f76846e;

    /* renamed from: f */
    private C29346a f76847f;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f$a */
    final class C29346a extends BaseAdapter {

        /* renamed from: a */
        public List<C29285a> f76848a = new ArrayList();

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return this.f76848a.size();
        }

        public final Object getItem(int i) {
            return this.f76848a.get(i);
        }

        C29346a() {
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C29347b bVar;
            C29285a aVar = (C29285a) this.f76848a.get(i);
            if (view != null && aVar != null && aVar.equals(view.getTag(R.id.b64))) {
                return view;
            }
            if (view == null) {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                int i2 = C29345f.this.f76844c;
                int i3 = R.layout.lc;
                if (i2 == 1) {
                    i3 = R.layout.lg;
                } else if (C29345f.this.f76844c == 4 && ((C29285a) this.f76848a.get(i)).f76665a == R.drawable.y7) {
                    i3 = R.layout.lf;
                }
                view = from.inflate(i3, viewGroup, false);
                bVar = new C29347b(view);
                view.setTag(R.id.b63, bVar);
            } else {
                bVar = (C29347b) view.getTag(R.id.b63);
            }
            view.setTag(R.id.b64, aVar);
            bVar.mo59236a(aVar);
            return view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f$b */
    final class C29347b extends C29289e<C29285a> {

        /* renamed from: b */
        private RemoteImageView f76851b;

        /* renamed from: c */
        private TextView f76852c;

        /* renamed from: b */
        public final void mo59237b() {
        }

        /* renamed from: a */
        public final void mo59235a() {
            this.f76851b = (RemoteImageView) this.itemView.findViewById(R.id.a_s);
            this.f76852c = (TextView) this.itemView.findViewById(R.id.d1l);
        }

        /* renamed from: c */
        private void m69180c(C29285a aVar) {
            C29366a aVar2 = aVar.f76668d;
            if (C29298a.m69090d(aVar2)) {
                C29478h.m69558a(this.f76851b, aVar2.getStaticUrl());
            } else {
                C23515d.m57669a(this.f76851b, aVar2.getStaticUrl());
            }
        }

        /* renamed from: f */
        private boolean m69183f(C29285a aVar) {
            if (!aVar.mo59210a() || (C29345f.this.f76844c != 2 && (C29345f.this.f76844c != 4 || aVar.f76665a != R.drawable.y7))) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        private void m69181d(C29285a aVar) {
            File file = new File(C29473c.m69541a(), C29473c.m69545c(aVar.f76668d));
            if (file.exists()) {
                m69177a(file.getAbsolutePath(), C29298a.m69090d(aVar.f76668d));
                return;
            }
            m69180c(aVar);
        }

        /* renamed from: e */
        private void m69182e(C29285a aVar) {
            if (this.f76852c != null) {
                this.f76852c.setVisibility(0);
                if (m69183f(aVar)) {
                    this.f76852c.setText(C29298a.m69088b(aVar.f76668d));
                } else {
                    this.f76852c.setText("");
                }
            }
        }

        /* renamed from: b */
        private void m69179b(C29285a aVar) {
            if (this.f76852c != null) {
                this.f76852c.setText("");
            }
            if (this.f76851b != null) {
                if (!aVar.mo59210a() || aVar.f76668d.getStaticUrl() == null) {
                    ((C13833a) this.f76851b.getHierarchy()).mo25909c((Drawable) null);
                    ((C13833a) this.f76851b.getHierarchy()).mo25904b((Drawable) null);
                } else {
                    ((C13833a) this.f76851b.getHierarchy()).mo25907c((int) R.drawable.ya);
                    ((C13833a) this.f76851b.getHierarchy()).mo25902b((int) R.drawable.ya);
                }
            }
        }

        /* renamed from: a */
        public final void mo59236a(C29285a aVar) {
            if (aVar != null) {
                m69179b(aVar);
                Context context = this.itemView.getContext();
                if (aVar.mo59210a()) {
                    m69176a(context, aVar);
                } else if (!TextUtils.isEmpty(aVar.f76667c) || aVar.f76665a > 0 || !TextUtils.isEmpty(aVar.f76666b)) {
                    m69178b(context, aVar);
                } else {
                    if (this.f76851b != null) {
                        this.f76851b.setVisibility(8);
                    }
                    if (this.f76852c != null) {
                        this.f76852c.setVisibility(8);
                    }
                }
                m69182e(aVar);
            }
        }

        C29347b(View view) {
            super(view);
        }

        /* renamed from: a */
        private void m69175a(Context context, int i) {
            StringBuilder sb = new StringBuilder("res://");
            sb.append(context.getPackageName());
            sb.append("/");
            sb.append(i);
            C23515d.m57677a(this.f76851b, sb.toString());
        }

        /* renamed from: a */
        private void m69177a(String str, boolean z) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            String sb2 = sb.toString();
            if (z) {
                C29478h.m69562a(this.f76851b, sb2);
            } else {
                C23515d.m57677a(this.f76851b, sb2);
            }
        }

        /* renamed from: b */
        private void m69178b(Context context, C29285a aVar) {
            if (this.f76851b != null) {
                this.f76851b.setVisibility(0);
                C29408b.m69343a(this.f76851b, aVar);
                this.f76851b.setContentDescription(context.getString(R.string.ax1, new Object[]{aVar.f76667c}));
            }
        }

        /* renamed from: a */
        private void m69176a(Context context, C29285a aVar) {
            if (this.f76851b != null) {
                this.f76851b.setVisibility(0);
                this.f76851b.setDrawingCacheEnabled(true);
                if (aVar.f76668d.getStickerType() == 2) {
                    if (aVar.f76665a == R.drawable.xz) {
                        m69175a(context, aVar.f76665a);
                    } else {
                        m69181d(aVar);
                    }
                    this.f76851b.setContentDescription(context.getString(R.string.ax4));
                } else if (aVar.f76668d.getStickerType() != 10) {
                    String a = C29473c.m69543a(aVar.f76668d);
                    if (new File(a).exists()) {
                        m69177a(a, C29298a.m69090d(aVar.f76668d));
                    } else {
                        m69180c(aVar);
                    }
                    if (!TextUtils.isEmpty(aVar.f76667c)) {
                        this.f76851b.setContentDescription(context.getString(R.string.ax1, new Object[]{aVar.f76667c}));
                    }
                } else if (aVar.f76665a == R.drawable.y7) {
                    m69175a(context, aVar.f76665a);
                    this.f76851b.setContentDescription(context.getString(R.string.ax3));
                } else {
                    m69180c(aVar);
                    this.f76851b.setContentDescription(context.getString(R.string.ax2));
                }
            }
        }
    }

    /* renamed from: a */
    public final List<C29285a> mo59283a() {
        return this.f76847f.f76848a;
    }

    /* renamed from: a */
    public final void mo59284a(List<C29285a> list) {
        C29346a aVar = this.f76847f;
        aVar.f76848a.clear();
        aVar.f76848a.addAll(list);
        this.f76847f.notifyDataSetChanged();
    }

    public C29345f(ViewGroup viewGroup, int i) {
        this.f76845d = viewGroup.getContext();
        this.f76844c = i;
        this.f76846e = viewGroup;
        this.f76843b.setSelector(17170445);
        this.f76843b.setStretchMode(1);
        this.f76843b.setGravity(17);
        Resources resources = this.f76845d.getResources();
        if (this.f76844c == 1) {
            this.f76843b.setNumColumns(7);
            this.f76843b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.he));
            this.f76843b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.hg));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hf);
            this.f76843b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            this.f76843b.setNumColumns(4);
            this.f76843b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.h_));
            this.f76843b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.hb));
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ha);
            this.f76843b.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        this.f76847f = new C29346a();
        this.f76843b.setAdapter(this.f76847f);
    }
}

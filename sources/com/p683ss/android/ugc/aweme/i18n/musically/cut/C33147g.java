package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22808c;
import com.p683ss.android.ugc.aweme.p1361ap.C22816d;
import com.p683ss.android.ugc.aweme.p1361ap.C22818f;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22796a;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c.C22798c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44153p;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.g */
public final class C33147g extends C1322a<C1352v> {

    /* renamed from: a */
    public boolean f86044a;

    /* renamed from: b */
    public final List<MediaModel> f86045b = new ArrayList();

    /* renamed from: c */
    public final Set<MediaModel> f86046c = new HashSet(9);

    /* renamed from: d */
    public List<Integer> f86047d;

    /* renamed from: e */
    public List<Integer> f86048e;

    /* renamed from: f */
    public boolean f86049f;

    /* renamed from: g */
    public C33154a f86050g;

    /* renamed from: h */
    public int f86051h = -1;

    /* renamed from: i */
    public int f86052i = -1;

    /* renamed from: j */
    public boolean f86053j;

    /* renamed from: k */
    List<MediaModel> f86054k;

    /* renamed from: l */
    public C33158j f86055l;

    /* renamed from: m */
    C22818f f86056m;

    /* renamed from: n */
    public final C22795c f86057n = C22795c.m56156a();

    /* renamed from: o */
    C22798c f86058o = new C22798c() {
        /* renamed from: a */
        public final void mo47280a() {
            C33147g.this.f86046c.clear();
            C33147g.this.f86046c.addAll(C33147g.this.f86057n.mo47277d());
        }
    };

    /* renamed from: p */
    C22796a f86059p = new C22796a() {
        /* renamed from: a */
        public final void mo47278a(int i) {
            if (4 == i) {
                C33147g.this.f86045b.clear();
                C33147g.this.f86045b.addAll(C33147g.this.f86057n.mo47272b(i));
                C33147g.this.mo70190a(C33147g.this.f86045b.size());
                C33147g.this.f86055l.mo70201a();
            }
        }
    };

    /* renamed from: q */
    private final Context f86060q;

    /* renamed from: r */
    private int f86061r = 0;

    /* renamed from: s */
    private int f86062s;

    /* renamed from: t */
    private double f86063t;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.g$a */
    public interface C33154a {
        /* renamed from: a */
        void mo70195a(View view, MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.g$b */
    static class C33155b extends C1352v {

        /* renamed from: a */
        SimpleDraweeView f86078a;

        /* renamed from: b */
        TextView f86079b;

        /* renamed from: c */
        TextView f86080c;

        /* renamed from: d */
        View f86081d;

        /* renamed from: e */
        FrameLayout f86082e;

        /* renamed from: f */
        View f86083f;

        /* renamed from: a */
        public final void mo70196a() {
            this.f86080c.setText("");
            this.f86080c.setBackgroundResource(R.drawable.m5);
        }

        C33155b(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo70197a(int i) {
            this.f86080c.setText(String.valueOf(i + 1));
            this.f86080c.setBackgroundResource(R.drawable.m6);
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemCount() {
        return this.f86045b.size();
    }

    /* renamed from: a */
    private void m76160a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f86061r) {
            int i = layoutParams.height;
            double d = (double) this.f86061r;
            double d2 = this.f86063t;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f86061r;
                double d3 = (double) this.f86061r;
                double d4 = this.f86063t;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: a */
    public final void mo70190a(int i) {
        if (this.f86048e == null) {
            this.f86048e = new ArrayList();
        } else {
            this.f86048e.clear();
        }
        if (this.f86047d == null) {
            this.f86047d = new ArrayList();
        } else {
            this.f86047d.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f86047d.add(Integer.valueOf(-1));
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f86060q).inflate(R.layout.a_p, null);
        C33155b bVar = new C33155b(inflate);
        bVar.f86078a = (SimpleDraweeView) inflate.findViewById(R.id.bky);
        bVar.f86079b = (TextView) inflate.findViewById(R.id.dp6);
        bVar.f86080c = (TextView) inflate.findViewById(R.id.ari);
        bVar.f86081d = inflate.findViewById(R.id.dlh);
        bVar.f86081d.setVisibility(8);
        bVar.f86083f = inflate.findViewById(R.id.ckh);
        bVar.f86082e = (FrameLayout) inflate.findViewById(R.id.ah5);
        inflate.setTag(bVar);
        return bVar;
    }

    public final void onBindViewHolder(C1352v vVar, final int i) {
        int i2;
        String str;
        float f;
        final C33155b bVar = (C33155b) vVar;
        m76160a((View) bVar.f86078a);
        m76160a(bVar.f86081d);
        m76160a(bVar.f86083f);
        final MediaModel mediaModel = (MediaModel) this.f86045b.get(i);
        FrameLayout frameLayout = bVar.f86082e;
        if (this.f86049f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        if (this.f86051h != -1) {
            bVar.f86079b.setTextColor(this.f86051h);
        }
        if (this.f86052i != -1) {
            bVar.f86079b.setShadowLayer(6.0f, 0.0f, 3.0f, this.f86052i);
        }
        if (!this.f86053j) {
            bVar.f86079b.setBackgroundResource(0);
        } else {
            C13837e eVar = new C13837e();
            eVar.mo25932a(C9432q.m18687b(this.f86060q, 2.0f));
            C13833a a = new C13834b(this.f86060q.getResources()).mo25912a();
            a.mo25899a(eVar);
            bVar.f86078a.setHierarchy(a);
            bVar.f86079b.setBackgroundResource(R.drawable.b2o);
            Drawable drawable = this.f86060q.getResources().getDrawable(2131956788);
            bVar.f86079b.setCompoundDrawablePadding((int) C9432q.m18687b(this.f86060q, 2.0f));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            bVar.f86079b.setCompoundDrawables(drawable, null, null, null);
        }
        float f2 = 1.0f;
        int round = Math.round((((float) mediaModel.f95386e) * 1.0f) / 1000.0f);
        bVar.f86081d.setVisibility(4);
        TextView textView = bVar.f86079b;
        int i3 = round % 60;
        int i4 = round / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            str = C2240a.m6773a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        } else {
            str = C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        textView.setText(str);
        int intValue = ((Integer) this.f86047d.get(i)).intValue();
        if (intValue >= 0) {
            bVar.mo70197a(intValue);
            bVar.f86083f.setVisibility(0);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            bVar.mo70196a();
            bVar.f86083f.setVisibility(4);
            if (this.f86048e.size() >= 12) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (bVar.f86078a.getAlpha() != f) {
            bVar.f86078a.setAlpha(f);
        }
        if (bVar.f86078a.getScaleX() != f2) {
            bVar.f86078a.setScaleX(f2);
            bVar.f86078a.setScaleY(f2);
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(mediaModel.f95383b);
        bVar.f86078a.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(bVar.f86078a.getController())).mo25757b(C14232c.m29169a(Uri.parse(sb.toString())).mo26453a(new C13952d(this.f86061r, this.f86061r)).mo26449a())).mo25763d());
        bVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                if (i < C33147g.this.f86047d.size()) {
                    if (((Integer) C33147g.this.f86047d.get(i)).intValue() >= 0 || C33147g.this.f86048e.size() < 12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        C33147g.this.f86050g.mo70195a(view, mediaModel);
                    }
                }
            }
        });
        bVar.f86082e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C33147g.this.f86044a) {
                    C22816d.m56188a(true, true);
                    C33147g gVar = C33147g.this;
                    C33155b bVar = bVar;
                    int i = i;
                    MediaModel mediaModel = mediaModel;
                    int indexOf = gVar.f86048e.indexOf(Integer.valueOf(i));
                    if (indexOf >= 0) {
                        gVar.f86047d.set(i, Integer.valueOf(-1));
                        bVar.mo70196a();
                        gVar.f86044a = true;
                        bVar.f86083f.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(bVar, i) {

                            /* renamed from: a */
                            final /* synthetic */ C33155b f86073a;

                            /* renamed from: b */
                            final /* synthetic */ int f86074b;

                            public final void run() {
                                this.f86073a.f86083f.setVisibility(4);
                                this.f86073a.f86083f.setAlpha(1.0f);
                                C33147g.this.notifyItemChanged(this.f86074b);
                                C33147g.this.f86044a = false;
                            }

                            {
                                this.f86073a = r2;
                                this.f86074b = r3;
                            }
                        }).start();
                        bVar.f86078a.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                        if (gVar.f86054k != null) {
                            gVar.f86054k.remove(indexOf);
                        }
                        gVar.f86048e.remove(Integer.valueOf(i));
                        int size = gVar.f86048e.size();
                        while (indexOf < size) {
                            gVar.f86047d.set(((Integer) gVar.f86048e.get(indexOf)).intValue(), Integer.valueOf(indexOf));
                            if (size != 11) {
                                gVar.notifyItemChanged(((Integer) gVar.f86048e.get(indexOf)).intValue());
                            }
                            indexOf++;
                        }
                        if (size == 11) {
                            gVar.f86055l.mo70201a();
                        }
                        return;
                    }
                    gVar.f86056m.mo47261a(mediaModel, 0, -1, new C33156h(gVar, bVar, i, mediaModel), new C33157i(gVar, bVar.itemView.getContext()));
                }
            }
        });
    }

    /* renamed from: a */
    private static void m76161a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C23569o.m57780a("aweme_video_import_duration", jSONObject, C23088c.m56631a().mo47824a("status", String.valueOf(i)).mo47824a("scene_name", str2).mo47824a("type", str).mo47825b());
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo70188a(Context context, String str, Long l, Integer num, String str2) {
        m76161a(str, 1, l.longValue(), "select");
        C23569o.m57776a("aweme_movie_import_error_rate", 1, C23088c.m56631a().mo47824a("errorCode", String.valueOf(num)).mo47824a("errorMsg", str2).mo47825b());
        C44153p.m96803a(context, num.intValue(), -1);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo70189a(C33155b bVar, int i, MediaModel mediaModel, String str, Long l) {
        m76161a(str, 0, l.longValue(), "select");
        if (this.f86048e.size() >= 12) {
            C9432q.m18676a(this.f86060q, this.f86060q.getString(R.string.a2k));
        } else {
            if (this.f86054k == null) {
                this.f86054k = new ArrayList();
            }
            this.f86054k.add(mediaModel);
            this.f86048e.add(Integer.valueOf(i));
            bVar.mo70197a(this.f86048e.size() - 1);
            final int size = this.f86048e.size();
            this.f86047d.set(i, Integer.valueOf(size - 1));
            this.f86044a = true;
            bVar.f86078a.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable() {
                public final void run() {
                    int i = size;
                    C33147g.this.f86055l.mo70201a();
                    C33147g.this.f86044a = false;
                }
            }).start();
            bVar.f86083f.setAlpha(0.0f);
            bVar.f86083f.setVisibility(0);
            bVar.f86083f.animate().alpha(1.0f).setDuration(300).start();
        }
        return null;
    }

    public C33147g(Context context, C33158j jVar, int i, double d, float f, int i2) {
        this.f86060q = context;
        this.f86055l = jVar;
        this.f86062s = i;
        this.f86063t = 1.0d;
        context.getResources().getDimensionPixelOffset(R.dimen.ja);
        this.f86061r = ((C9432q.m18670a(context) - ((this.f86062s - 1) * ((int) C9432q.m18687b(this.f86060q, 1.5f)))) - 0) / this.f86062s;
        this.f86056m = new C22808c(context);
        this.f86056m.mo47263a(false);
        this.f86056m.mo47262a("enter_from_multi");
    }
}

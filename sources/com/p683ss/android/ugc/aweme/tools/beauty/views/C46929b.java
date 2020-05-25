package com.p683ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.beauty.C23784g;
import com.p683ss.android.ugc.aweme.beauty.C23785h;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f.C46899a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46904h;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b */
public final class C46929b extends FrameLayout implements OnClickListener, C46898f {

    /* renamed from: a */
    public C46899a f118557a;

    /* renamed from: b */
    C23784g f118558b;

    /* renamed from: c */
    public boolean f118559c;

    /* renamed from: d */
    int f118560d;

    /* renamed from: e */
    private View f118561e;

    /* renamed from: f */
    private View f118562f;

    /* renamed from: g */
    private AVDmtImageTextView f118563g;

    /* renamed from: h */
    private AVDmtImageTextView f118564h;

    /* renamed from: i */
    private AVDmtImageTextView f118565i;

    /* renamed from: j */
    private AVDmtImageTextView f118566j;

    /* renamed from: k */
    private AVDmtImageTextView f118567k;

    /* renamed from: l */
    private View f118568l;

    /* renamed from: m */
    private BeautyProgressBar f118569m;

    /* renamed from: n */
    private boolean f118570n;

    /* renamed from: o */
    private ViewGroup f118571o;

    /* renamed from: p */
    private AVETParameter f118572p;

    /* renamed from: q */
    private C46923a f118573q;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b$a */
    public static class C46932a {

        /* renamed from: a */
        private final Context f118576a;

        /* renamed from: b */
        private C46899a f118577b;

        /* renamed from: c */
        private C23784g f118578c;

        /* renamed from: d */
        private AVETParameter f118579d;

        /* renamed from: a */
        public final C46932a mo94226a(AVETParameter aVETParameter) {
            this.f118579d = aVETParameter;
            return this;
        }

        public C46932a(Context context) {
            this.f118576a = context;
        }

        /* renamed from: a */
        public final C46932a mo94227a(C46899a aVar) {
            this.f118577b = aVar;
            return this;
        }

        /* renamed from: a */
        public final C46932a mo94225a(C23784g gVar) {
            if (gVar == null) {
                gVar = new C23784g();
            }
            this.f118578c = gVar;
            return this;
        }

        /* renamed from: a */
        public final C46929b mo94228a(ViewGroup viewGroup) {
            C46929b bVar = new C46929b(this.f118576a, this.f118578c, this.f118579d, C23785h.m58373a("2", "3"), viewGroup);
            bVar.f118557a = this.f118577b;
            return bVar;
        }
    }

    public final ViewGroup getContainer() {
        return this.f118571o;
    }

    /* renamed from: a */
    public final void mo94171a() {
        if (this.f118573q != null) {
            this.f118573q.mo50219a((C24454d) new C24453c());
        }
        if (this.f118557a != null) {
            this.f118557a.mo94065a();
        }
    }

    /* renamed from: b */
    public final void mo94172b() {
        if (this.f118573q != null) {
            this.f118573q.mo50223b(new C24453c());
        }
        m101940c();
        if (this.f118557a != null) {
            this.f118557a.mo94071b();
        }
    }

    /* renamed from: c */
    private void m101940c() {
        if (this.f118559c) {
            this.f118559c = false;
            C47702b.f120193a.mo94984a("select_beautify", C42438az.m93209a().mo86526a("creation_id", this.f118572p.getCreationId()).mo86526a("shoot_way", this.f118572p.getShootWay()).mo86526a("tab_name", C23784g.f63385a[this.f118560d]).mo86523a("beautify_value", this.f118558b.f63388c[this.f118560d]).mo86526a("content_source", this.f118572p.getContentSource()).mo86526a("content_type", this.f118572p.getContentType()).mo86526a("enter_from", "video_shoot_page").f107329a);
        }
    }

    public final void setListener(C46899a aVar) {
        this.f118557a = aVar;
    }

    public final void setContainer(ViewGroup viewGroup) {
        this.f118571o = viewGroup;
        this.f118573q = new C46923a(this.f118571o, this, this.f118562f);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.hf) {
            this.f118569m.setProgress((int) ((C23784g.f63386b[this.f118560d] / C23784g.f63387d[this.f118560d]) * 100.0f));
            return;
        }
        m101940c();
        this.f118563g.mo93970a(false);
        this.f118564h.mo93970a(false);
        this.f118565i.mo93970a(false);
        this.f118566j.mo93970a(false);
        this.f118567k.mo93970a(false);
        if (id == R.id.hh) {
            this.f118563g.mo93970a(true);
            this.f118560d = 0;
        } else if (id == R.id.hg) {
            this.f118564h.mo93970a(true);
            this.f118560d = 1;
        } else if (id == R.id.hd) {
            this.f118565i.mo93970a(true);
            this.f118560d = 2;
        } else if (id == R.id.he) {
            this.f118566j.mo93970a(true);
            this.f118560d = 3;
        } else if (id == R.id.hb) {
            this.f118567k.mo93970a(true);
            this.f118560d = 4;
        }
        if (this.f118572p != null) {
            C47702b.f120193a.mo94984a("click_beautify_tab", C42438az.m93209a().mo86526a("creation_id", this.f118572p.getCreationId()).mo86526a("shoot_way", this.f118572p.getShootWay()).mo86526a("tab_name", C23784g.f63385a[this.f118560d]).mo86526a("content_source", this.f118572p.getContentSource()).mo86526a("content_type", this.f118572p.getContentType()).mo86526a("enter_from", "video_shoot_page").f107329a);
        }
        this.f118569m.setProgress(this.f118558b.f63388c[this.f118560d]);
    }

    private C46929b(Context context, C23784g gVar, AVETParameter aVETParameter, boolean z, ViewGroup viewGroup) {
        super(context);
        this.f118558b = gVar;
        this.f118572p = aVETParameter;
        this.f118570n = z;
        this.f118571o = viewGroup;
        this.f118562f = LayoutInflater.from(getContext()).inflate(R.layout.gk, this, true);
        this.f118573q = new C46923a(this.f118571o, this, this.f118562f);
        this.f118561e = this.f118562f.findViewById(R.id.h9);
        this.f118563g = (AVDmtImageTextView) this.f118561e.findViewById(R.id.hh);
        this.f118564h = (AVDmtImageTextView) this.f118561e.findViewById(R.id.hg);
        this.f118565i = (AVDmtImageTextView) this.f118561e.findViewById(R.id.hd);
        this.f118566j = (AVDmtImageTextView) this.f118561e.findViewById(R.id.he);
        this.f118567k = (AVDmtImageTextView) this.f118561e.findViewById(R.id.hb);
        this.f118568l = this.f118562f.findViewById(R.id.jq);
        this.f118568l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C46929b.this.mo94172b();
            }
        });
        if (this.f118570n) {
            this.f118566j.setVisibility(0);
            this.f118567k.setVisibility(0);
        }
        TextView textView = (TextView) this.f118562f.findViewById(R.id.hf);
        textView.setText("");
        textView.setPadding((int) C9432q.m18687b(this.f118562f.getContext(), 18.0f), 0, 0, 0);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.d3z, 0, 0, 0);
        this.f118569m = (BeautyProgressBar) this.f118562f.findViewById(R.id.ha);
        this.f118569m.setMinValue(0);
        this.f118569m.setMaxValue(100);
        this.f118563g.mo93970a(true);
        this.f118569m.setProgress(this.f118558b.f63388c[this.f118560d]);
        this.f118563g.setOnClickListener(this);
        this.f118564h.setOnClickListener(this);
        this.f118565i.setOnClickListener(this);
        this.f118566j.setOnClickListener(this);
        this.f118567k.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.f118569m.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                C46929b.this.f118559c = true;
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C46929b bVar = C46929b.this;
                bVar.f118558b.f63388c[bVar.f118560d] = i;
                if (bVar.f118557a != null) {
                    if (bVar.f118560d == 0) {
                        bVar.f118557a.mo94066a(C46904h.SMOOTH, i, z);
                    } else if (bVar.f118560d == 1) {
                        bVar.f118557a.mo94066a(C46904h.RESHAPE, i, z);
                    } else if (bVar.f118560d == 2) {
                        bVar.f118557a.mo94066a(C46904h.BIG_EYE, i, z);
                    } else if (bVar.f118560d == 3) {
                        bVar.f118557a.mo94066a(C46904h.LIP, i, z);
                    } else if (bVar.f118560d == 4) {
                        bVar.f118557a.mo94066a(C46904h.BLUSH, i, z);
                    }
                }
            }
        });
    }
}

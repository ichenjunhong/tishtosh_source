package com.p683ss.android.newmedia.p1195a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C1000h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch;
import com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch.C11108b;
import com.bytedance.ies.uikit.viewpager.ImageViewTouchViewPager;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.download.p1160a.C19087e;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.p1147d.C18946h;
import com.p683ss.android.p1147d.C18947i;
import com.p683ss.android.p1147d.C18957l;
import com.p683ss.android.p1147d.C18957l.C18959a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p2699pl.droidsonroids.gif.C53874a;

/* renamed from: com.ss.android.newmedia.a.a */
public final class C19531a extends Dialog implements C9382a, C18915b<String>, C18959a {

    /* renamed from: a */
    final Context f53877a;

    /* renamed from: b */
    final C18933b f53878b;

    /* renamed from: c */
    final boolean f53879c;

    /* renamed from: d */
    public C18957l f53880d;

    /* renamed from: e */
    public C18947i f53881e;

    /* renamed from: f */
    public C19087e<String, Bitmap> f53882f;

    /* renamed from: g */
    View f53883g;

    /* renamed from: h */
    TextView f53884h;

    /* renamed from: i */
    ImageViewTouchViewPager f53885i;

    /* renamed from: j */
    C19536a f53886j;

    /* renamed from: k */
    final C9381g f53887k = new C9381g(this);

    /* renamed from: l */
    public final List<C18946h> f53888l = new ArrayList();

    /* renamed from: m */
    final List<C18946h> f53889m = new ArrayList();

    /* renamed from: n */
    public int f53890n = -1;

    /* renamed from: o */
    int f53891o = -1;

    /* renamed from: p */
    public boolean f53892p = true;

    /* renamed from: q */
    final OnClickListener f53893q = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C19531a.this.dismiss();
        }
    };

    /* renamed from: com.ss.android.newmedia.a.a$a */
    class C19536a extends PagerAdapter {

        /* renamed from: a */
        final LinkedList<View> f53898a = new LinkedList<>();

        /* renamed from: b */
        final List<C18946h> f53899b = new ArrayList();

        /* renamed from: c */
        LayoutInflater f53900c;

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final int getCount() {
            return this.f53899b.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo40794a(List<C18946h> list) {
            this.f53899b.clear();
            if (list != null) {
                this.f53899b.addAll(list);
            }
        }

        public final int getItemPosition(Object obj) {
            if (this.f53899b.isEmpty()) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        /* renamed from: a */
        public final C18946h mo40792a(int i) {
            if (i < 0 || i >= this.f53899b.size()) {
                return null;
            }
            return (C18946h) this.f53899b.get(i);
        }

        /* renamed from: a */
        private C19537b m47812a(String str) {
            if (C19531a.this.f53885i == null || C9431p.m18664a(str)) {
                return null;
            }
            int childCount = C19531a.this.f53885i.getChildCount();
            C19537b bVar = null;
            for (int i = 0; i < childCount; i++) {
                Object tag = C19531a.this.f53885i.getChildAt(i).getTag();
                if (tag instanceof C19537b) {
                    bVar = (C19537b) tag;
                }
                if (bVar != null && bVar.f53902a != null && str.equals(bVar.f53902a.mUri)) {
                    return bVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo40793a(String str, Object obj) {
            m47813a(m47812a(str), obj);
        }

        C19536a(Context context) {
            this.f53900c = LayoutInflater.from(context);
        }

        /* renamed from: a */
        private void m47813a(C19537b bVar, Object obj) {
            if (bVar != null) {
                bVar.f53906e.setVisibility(8);
                bVar.f53907f.setVisibility(8);
                if (obj == null) {
                    bVar.f53909h.setVisibility(8);
                    C19531a.m47808a(C19531a.this.f53883g, false);
                    C19539b.m47818a(Toast.makeText(C19531a.this.f53877a, R.string.bql, 0));
                    C18898c.m46009a(C19531a.this.f53877a, "image", "fail");
                    return;
                }
                bVar.f53909h.setVisibility(0);
                bVar.f53910i.setVisibility(8);
                C19531a.m47808a(C19531a.this.f53883g, true);
                if (obj instanceof Bitmap) {
                    bVar.f53909h.setImageBitmap((Bitmap) obj);
                    return;
                }
                if (obj instanceof C53874a) {
                    bVar.f53909h.setImageDrawable((C53874a) obj);
                }
            }
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            C19537b bVar;
            Object obj;
            if (this.f53898a.size() > 0) {
                view = (View) this.f53898a.removeFirst();
            } else {
                view = null;
            }
            if (view == null) {
                bVar = new C19537b();
                view2 = this.f53900c.inflate(R.layout.b49, viewGroup, false);
                boolean z = C19531a.this.f53879c;
                view2.setOnClickListener(C19531a.this.f53893q);
                bVar.f53906e = (ProgressBar) view2.findViewById(R.id.c62);
                bVar.f53907f = (TextView) view2.findViewById(R.id.c6e);
                bVar.f53908g = view2.findViewById(R.id.cbv);
                C9432q.m18691b(bVar.f53908g, 8);
                bVar.f53909h = (ImageViewTouch) view2.findViewById(R.id.ak1);
                bVar.f53910i = (ImageView) view2.findViewById(R.id.d00);
                if (z) {
                    bVar.f53909h.setFitToWidth(true);
                }
                C1056u.m3025a((View) bVar.f53909h, 1, (Paint) null);
                bVar.f53906e.setVisibility(8);
                bVar.f53909h.setMyOnClickListener(C19531a.this.f53893q);
                bVar.f53909h.setDoubleTapListener(new C11108b() {
                    /* renamed from: a */
                    public final void mo20172a() {
                        C19531a.this.onEvent("zoom_in");
                    }
                });
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C19537b) view.getTag();
            }
            C18946h hVar = (C18946h) C19531a.this.f53888l.get(i);
            bVar.f53905d = false;
            bVar.f53902a = hVar;
            bVar.f53904c = null;
            if (C19531a.this.f53889m == null || C19531a.this.f53889m.size() < i + 1) {
                bVar.f53903b = null;
            } else {
                bVar.f53903b = (C18946h) C19531a.this.f53889m.get(i);
            }
            if (hVar.mKey != null) {
                bVar.f53904c = C18933b.m46092b(hVar.mKey);
            }
            bVar.f53909h.setVisibility(8);
            if (bVar.f53902a == null || bVar.f53902a.mUri == null) {
                bVar.f53906e.setVisibility(8);
            } else {
                bVar.f53906e.setVisibility(0);
                bVar.f53906e.setProgress(0);
                bVar.f53907f.setVisibility(0);
                bVar.f53907f.setText("");
                C19531a.m47808a(C19531a.this.f53883g, false);
                if (C19531a.this.f53882f != null) {
                    obj = (Bitmap) C19531a.this.f53882f.mo39014a(bVar.f53902a.mUri);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    m47813a(bVar, obj);
                } else if (C19531a.this.f53880d == null) {
                    mo40793a(bVar.f53902a.mUri, (Object) null);
                } else {
                    if (C19531a.this.f53881e == null || bVar.f53903b == null) {
                        C9432q.m18691b((View) bVar.f53910i, 8);
                    } else {
                        C9432q.m18691b((View) bVar.f53910i, 0);
                        bVar.f53910i.setImageDrawable(null);
                        C19531a.this.f53881e.mo38818a(bVar.f53910i, bVar.f53903b, false);
                    }
                    C18957l lVar = C19531a.this.f53880d;
                    String str = bVar.f53902a.mUri;
                    String str2 = bVar.f53902a.mUrlList;
                    if (lVar.f52252h) {
                        String a = C9395d.m18571a(str);
                        if (a == null) {
                            lVar.f52251g.mo38833a(str, null);
                        } else {
                            lVar.f52246b.mo39005a(a, str, str2, null);
                        }
                    }
                }
            }
            viewGroup.addView(view2);
            return view2;
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            C19537b bVar;
            if (obj != null) {
                View view = (View) obj;
                viewGroup.removeView(view);
                this.f53898a.addFirst(view);
                if (view != null) {
                    Object tag = view.getTag();
                    if (tag instanceof C19537b) {
                        bVar = (C19537b) tag;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        bVar.f53902a = null;
                        bVar.f53904c = null;
                        bVar.f53909h.mo20181b();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.newmedia.a.a$b */
    class C19537b {

        /* renamed from: a */
        C18946h f53902a;

        /* renamed from: b */
        C18946h f53903b;

        /* renamed from: c */
        String f53904c;

        /* renamed from: d */
        boolean f53905d;

        /* renamed from: e */
        ProgressBar f53906e;

        /* renamed from: f */
        TextView f53907f;

        /* renamed from: g */
        View f53908g;

        /* renamed from: h */
        ImageViewTouch f53909h;

        /* renamed from: i */
        ImageView f53910i;

        C19537b() {
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (this.f53885i != null) {
            this.f53888l.clear();
            this.f53886j.mo40794a(this.f53888l);
            this.f53886j.notifyDataSetChanged();
            int childCount = this.f53885i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Object tag = this.f53885i.getChildAt(i).getTag();
                C19537b bVar = null;
                if (tag instanceof C19537b) {
                    bVar = (C19537b) tag;
                }
                if (!(bVar == null || bVar.f53902a == null || bVar.f53902a.mUri == null)) {
                    bVar.f53909h.mo20181b();
                }
            }
        }
    }

    public final void onEvent(String str) {
        C18898c.m46009a(this.f53877a, "image", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40785a(int i) {
        if (this.f53886j != null && this.f53884h != null && this.f53892p) {
            int count = this.f53886j.getCount();
            int i2 = i + 1;
            String str = "";
            if (i2 > 0 && i2 <= count && count > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append("/");
                sb.append(count);
                str = sb.toString();
            }
            this.f53884h.setText(str);
        }
    }

    public final void handleMsg(Message message) {
        String str;
        C19537b bVar;
        if (message.what == 257 && this.f53885i != null && this.f53886j != null) {
            int i = message.arg1;
            if (message.obj instanceof String) {
                str = (String) message.obj;
            } else {
                str = null;
            }
            if (str != null && isShowing()) {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 100) {
                    i = 99;
                }
                int childCount = this.f53885i.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Object tag = this.f53885i.getChildAt(i2).getTag();
                    if (tag instanceof C19537b) {
                        bVar = (C19537b) tag;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null && str.equals(bVar.f53904c)) {
                        bVar.f53906e.setProgress(i);
                        TextView textView = bVar.f53907f;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        sb.append("%");
                        textView.setText(sb.toString());
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b48);
        setCancelable(true);
        this.f53883g = findViewById(R.id.cgy);
        this.f53884h = (TextView) findViewById(R.id.bvu);
        this.f53885i = (ImageViewTouchViewPager) findViewById(R.id.arg);
        this.f53886j = new C19536a(this.f53877a);
        this.f53885i.setOnPageChangeListener(new C1000h() {
            public final void onPageSelected(int i) {
                C19537b bVar;
                C19531a aVar = C19531a.this;
                if (aVar.f53885i != null) {
                    aVar.mo40785a(i);
                    int i2 = aVar.f53891o;
                    aVar.f53891o = i;
                    if (i2 >= 0 && i2 < aVar.f53886j.getCount()) {
                        C18946h a = aVar.f53886j.mo40792a(i2);
                        C18946h a2 = aVar.f53886j.mo40792a(i);
                        if (a != null && a2 != null) {
                            int childCount = aVar.f53885i.getChildCount();
                            C19537b bVar2 = null;
                            C19537b bVar3 = null;
                            for (int i3 = 0; i3 < childCount; i3++) {
                                Object tag = aVar.f53885i.getChildAt(i3).getTag();
                                if (tag instanceof C19537b) {
                                    bVar = (C19537b) tag;
                                } else {
                                    bVar = null;
                                }
                                if (bVar != null) {
                                    if (bVar.f53902a == a) {
                                        bVar2 = bVar;
                                    }
                                    if (bVar.f53902a == a2) {
                                        bVar3 = bVar;
                                    }
                                }
                            }
                            if (!(bVar2 == null || bVar2.f53909h.getDrawable() == null)) {
                                bVar2.f53909h.mo20182b(1.0f, 300.0f);
                            }
                            if (!(bVar3 == null || bVar3.f53909h.getDrawable() == null || !(bVar3.f53909h.getDrawable() instanceof C53874a))) {
                                try {
                                    ((C53874a) bVar3.f53909h.getDrawable()).mo113907b();
                                    ((C53874a) bVar3.f53909h.getDrawable()).start();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            }
        });
        this.f53885i.setAdapter(this.f53886j);
        this.f53883g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C19531a aVar = C19531a.this;
                if (aVar.f53885i != null) {
                    C18946h a = aVar.f53886j.mo40792a(aVar.f53885i.getCurrentItem());
                    if (a != null) {
                        String str = a.mUri;
                        if (!C9431p.m18664a(str)) {
                            aVar.f53878b.mo38803a(aVar.f53877a, C9395d.m18571a(str), str);
                        }
                    }
                }
                C19531a.this.onEvent("download");
            }
        });
        setOnShowListener(new OnShowListener() {
            public final void onShow(DialogInterface dialogInterface) {
                C19531a aVar = C19531a.this;
                if (aVar.f53885i != null) {
                    aVar.f53886j.mo40794a(null);
                    aVar.f53886j.notifyDataSetChanged();
                    aVar.f53886j.mo40794a(aVar.f53888l);
                    aVar.f53886j.notifyDataSetChanged();
                    int count = aVar.f53886j.getCount();
                    if (aVar.f53890n >= 0 && aVar.f53890n < count) {
                        aVar.f53885i.setCurrentItem(aVar.f53890n, false);
                    }
                    aVar.mo40785a(aVar.f53885i.getCurrentItem());
                    aVar.f53890n = -1;
                    if (count > 0) {
                        aVar.f53883g.setVisibility(0);
                        return;
                    }
                    aVar.f53883g.setVisibility(8);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m47808a(View view, boolean z) {
        if (view != null && view.isEnabled() != z) {
            view.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo38772a(int i, Object obj) {
        String str = (String) obj;
        Message obtainMessage = this.f53887k.obtainMessage(257);
        obtainMessage.arg1 = i;
        obtainMessage.obj = str;
        this.f53887k.sendMessage(obtainMessage);
    }

    /* renamed from: a */
    public final void mo38833a(String str, Object obj) {
        if (isShowing() && this.f53886j != null) {
            this.f53886j.mo40793a(str, obj);
        }
    }

    public C19531a(Context context, C18933b bVar, boolean z) {
        super(context, 16973830);
        this.f53877a = context;
        this.f53878b = bVar;
        this.f53879c = true;
        this.f53882f = new C19087e<>();
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2213c.C44015a;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.view.p2512e.C50233b;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b */
public final class C44002b {

    /* renamed from: a */
    public C44009g f111431a;

    /* renamed from: b */
    List<Bitmap> f111432b;

    /* renamed from: c */
    int f111433c;

    /* renamed from: d */
    C20347c f111434d;

    /* renamed from: e */
    int[] f111435e;

    /* renamed from: f */
    int f111436f;

    /* renamed from: g */
    C50711k f111437g;

    /* renamed from: h */
    Handler f111438h;

    /* renamed from: i */
    HandlerThread f111439i;

    /* renamed from: j */
    Handler f111440j;

    /* renamed from: k */
    C50233b f111441k;

    /* renamed from: l */
    public C0198r<Bitmap> f111442l;

    /* renamed from: m */
    public C0198r<Boolean> f111443m;

    /* renamed from: n */
    boolean f111444n;

    /* renamed from: o */
    private int f111445o;

    /* renamed from: p */
    private int f111446p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b$a */
    static class C44004a extends Handler {

        /* renamed from: a */
        private WeakReference<C44002b> f111448a;

        C44004a(C44002b bVar) {
            this.f111448a = new WeakReference<>(bVar);
        }

        public final void handleMessage(Message message) {
            if (this.f111448a.get() != null) {
                if (message.what == 1002) {
                    List list = (List) message.obj;
                    if (((C44002b) this.f111448a.get()).f111431a != null) {
                        ((C44002b) this.f111448a.get()).f111431a.mo59016a(list);
                        if (!(list == null || list.isEmpty() || list.get(0) == null)) {
                            if (((C44002b) this.f111448a.get()).f111443m != null) {
                                ((C44002b) this.f111448a.get()).f111443m.setValue(Boolean.valueOf(true));
                            }
                            if (((C44002b) this.f111448a.get()).f111442l != null) {
                                ((C44002b) this.f111448a.get()).f111442l.setValue(list.get(0));
                            }
                        }
                    }
                    return;
                }
                if (message.what == 1003) {
                    C44002b bVar = (C44002b) this.f111448a.get();
                    if (bVar.f111431a != null) {
                        bVar.f111431a.mo59016a(bVar.f111432b);
                    }
                    if (bVar.f111434d != null) {
                        bVar.f111434d.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                    }
                    if (!(bVar.f111434d == null || bVar.f111437g == null)) {
                        bVar.f111434d.mo43048c(bVar.f111437g);
                    }
                    if (bVar.f111439i != null && VERSION.SDK_INT >= 18) {
                        bVar.f111439i.quitSafely();
                    }
                    if (bVar.f111441k != null) {
                        bVar.f111441k.dismiss();
                    }
                    if (bVar.f111443m != null) {
                        bVar.f111443m.setValue(Boolean.valueOf(false));
                    }
                    bVar.f111431a = null;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo89831a() {
        Bitmap bitmap;
        if (this.f111434d == null) {
            return null;
        }
        if (this.f111445o == 0) {
            bitmap = this.f111434d.mo43045c();
        } else {
            bitmap = this.f111434d.mo43011a(this.f111445o);
        }
        return bitmap;
    }

    public C44002b() {
        this.f111432b = new ArrayList();
        this.f111433c = 7;
        this.f111439i = new HandlerThread("mv_cover_creator");
        this.f111439i.start();
        this.f111438h = new Handler(this.f111439i.getLooper()) {
            public final void handleMessage(Message message) {
                C44002b bVar = C44002b.this;
                if (message.what != 1001) {
                    bVar.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
                } else if (bVar.f111436f >= bVar.f111433c) {
                    if (bVar.f111436f == bVar.f111433c) {
                        bVar.f111432b.add(bVar.mo89831a());
                    }
                    bVar.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
                } else if (bVar.f111434d == null) {
                    bVar.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
                } else {
                    int i = bVar.f111435e[bVar.f111436f];
                    Bitmap a = bVar.mo89831a();
                    bVar.f111432b.add(a);
                    if (bVar.f111432b.size() == 1) {
                        ArrayList arrayList = new ArrayList(bVar.f111433c);
                        for (int i2 = 0; i2 < bVar.f111433c; i2++) {
                            arrayList.add(a);
                        }
                        Message message2 = new Message();
                        message2.obj = arrayList;
                        message2.what = BaseNotice.CHECK_PROFILE;
                        bVar.f111440j.sendMessage(message2);
                    }
                    bVar.f111434d.mo42983a(i, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
        };
        this.f111440j = new C44004a(this);
    }

    /* renamed from: a */
    public final C44002b mo89833a(C0198r<Bitmap> rVar) {
        this.f111442l = rVar;
        return this;
    }

    /* renamed from: b */
    public final C44002b mo89835b(C0198r<Boolean> rVar) {
        this.f111443m = rVar;
        return this;
    }

    /* renamed from: a */
    private boolean m96560a(Context context) {
        if (context == null) {
            this.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
            return false;
        }
        if (context instanceof Activity) {
            if (((Activity) context).isFinishing()) {
                this.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
                return false;
            }
        } else if (((Activity) context).isFinishing()) {
            this.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C44002b mo89832a(int i, int i2) {
        this.f111445o = i;
        this.f111446p = i2;
        return this;
    }

    /* renamed from: b */
    private static int[] m96561b(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo89834a(Context context, C20347c cVar, int i, C44009g gVar) {
        if (m96560a(context)) {
            this.f111441k = C50233b.m108421a(context, context.getString(R.string.dnt));
            this.f111441k.setIndeterminate(true);
            this.f111431a = gVar;
            this.f111433c = i;
            this.f111434d = cVar;
            if (cVar == null) {
                this.f111440j.sendEmptyMessage(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
                return;
            }
            this.f111435e = m96561b(cVar.mo43071k(), this.f111433c);
            this.f111437g = new C44006d(this);
            cVar.mo43087s();
            cVar.mo43039b(this.f111437g);
            cVar.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    public C44002b(C20347c cVar, String str, int i, C44015a aVar) {
        this.f111432b = new ArrayList();
        this.f111433c = 7;
        if (cVar == null) {
            C39629l.m88232a().mo58567E().mo49425a("MvChooseCoverBitmap veEditor is null");
        } else if (TextUtils.isEmpty(str)) {
            C39629l.m88232a().mo58567E().mo49425a("MvChooseCoverBitmap imgPath is null");
        } else {
            this.f111434d = cVar;
            try {
                if (C50200d.m108346a(str)) {
                    C13771c.m27875c().mo26191b(Uri.fromFile(new File(str)));
                    new File(str).delete();
                }
                this.f111437g = new C44005c(this, str, cVar, aVar);
                cVar.mo43087s();
                cVar.mo43039b(this.f111437g);
                int a = cVar.mo42983a(i, C50743d.EDITOR_SEEK_FLAG_LastSeek);
                if (a != 0) {
                    C39567as E = C39629l.m88232a().mo58567E();
                    StringBuilder sb = new StringBuilder("MvChooseCoverBitmap start time ");
                    sb.append(i);
                    sb.append(", seek error ");
                    sb.append(a);
                    E.mo49425a(sb.toString());
                }
            } catch (Exception e) {
                C39567as E2 = C39629l.m88232a().mo58567E();
                StringBuilder sb2 = new StringBuilder("MvChooseCoverBitmap exception");
                sb2.append(e.toString());
                E2.mo49425a(sb2.toString());
            }
        }
    }
}

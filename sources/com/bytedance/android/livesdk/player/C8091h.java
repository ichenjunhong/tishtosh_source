package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b;
import com.bytedance.android.live.livepullstream.p250b.C4141b.C4144b.C4145a;
import com.bytedance.android.live.livepullstream.p250b.C4147d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.detail.C5058a;
import com.bytedance.android.livesdk.player.C8086g.C8087a;
import com.bytedance.android.livesdk.player.C8086g.C8088b;
import com.bytedance.android.livesdk.player.C8086g.C8090d;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8651a;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8653c;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8654d;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8656e;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.common.utility.C9431p;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.h */
public class C8091h implements C4189h, C8087a, C8088b, C8619a {

    /* renamed from: a */
    public static final String f22077a = "h";

    /* renamed from: g */
    private static final C8654d f22078g = C8654d.m17099a().mo15124a();

    /* renamed from: A */
    private boolean f22079A = true;

    /* renamed from: B */
    private final SurfaceTextureListener f22080B = new SurfaceTextureListener() {
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (C8091h.this.f22083b != null) {
                C8091h.this.f22083b.mo14246a((SurfaceHolder) null);
            }
            return true;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (C8091h.this.f22084c != null) {
                if (C8091h.this.f22085d != null) {
                    C8091h.this.f22085d.release();
                }
                C8091h.this.f22085d = new Surface(surfaceTexture);
                C8091h.this.mo14277e(true);
            }
        }
    };

    /* renamed from: C */
    private long f22081C;

    /* renamed from: D */
    private String f22082D = "";

    /* renamed from: b */
    public C8086g f22083b;

    /* renamed from: c */
    public TextureView f22084c;

    /* renamed from: d */
    public Surface f22085d;

    /* renamed from: e */
    C8097k f22086e;

    /* renamed from: f */
    Map<String, String> f22087f;

    /* renamed from: h */
    private int f22088h;

    /* renamed from: i */
    private String f22089i = "";

    /* renamed from: j */
    private String f22090j = "";

    /* renamed from: k */
    private String f22091k = "";

    /* renamed from: l */
    private String f22092l;

    /* renamed from: m */
    private C8654d f22093m = f22078g;

    /* renamed from: n */
    private boolean f22094n;

    /* renamed from: o */
    private C8618a f22095o;

    /* renamed from: p */
    private C8653c f22096p;

    /* renamed from: q */
    private volatile int f22097q;

    /* renamed from: r */
    private int f22098r;

    /* renamed from: s */
    private C8710m f22099s;

    /* renamed from: t */
    private final Context f22100t;

    /* renamed from: u */
    private final IHostPlugin f22101u;

    /* renamed from: v */
    private final C8085f f22102v;

    /* renamed from: w */
    private String f22103w = "";

    /* renamed from: x */
    private boolean f22104x = true;

    /* renamed from: y */
    private boolean f22105y;

    /* renamed from: z */
    private boolean f22106z;

    /* renamed from: com.bytedance.android.livesdk.player.h$a */
    public static final class C8094a implements C4144b<C4189h> {
        /* renamed from: a */
        public final C4145a<C4189h> mo9533a(C4145a<C4189h> aVar) {
            return aVar.mo9535a(new C8091h(((IHostContext) C4116c.m10249a(IHostContext.class)).context(), (IHostPlugin) C4116c.m10249a(IHostPlugin.class), new C8096j())).mo9534a();
        }
    }

    /* renamed from: h */
    public final int mo14280h() {
        return this.f22097q;
    }

    /* renamed from: k */
    public final String mo14283k() {
        return this.f22089i;
    }

    /* renamed from: l */
    public final String mo14284l() {
        return this.f22090j;
    }

    /* renamed from: a */
    public final void mo14269a(String str, String str2, TextureView textureView, int i, C8654d dVar, C8653c cVar) throws Exception {
        mo9612a(str, str2, textureView, i, dVar, cVar, (String) null);
    }

    /* renamed from: a */
    public final void mo9612a(String str, String str2, TextureView textureView, int i, C8654d dVar, C8653c cVar, String str3) throws Exception {
        if (str == null) {
            m16064m();
            if (this.f22083b != null) {
                this.f22083b.mo14243a();
            }
            return;
        }
        this.f22082D = "";
        this.f22089i = "";
        this.f22090j = "";
        this.f22099s = C8710m.valueOf(i);
        if (textureView != null) {
            m16058a(textureView);
        }
        if (str3 != null) {
            this.f22103w = str3;
        }
        this.f22096p = cVar;
        this.f22094n = true;
        boolean z = !C9431p.m18665a(this.f22090j, str);
        this.f22090j = str;
        this.f22091k = str2;
        if (dVar == null) {
            dVar = f22078g;
        }
        this.f22093m = dVar;
        if (this.f22083b == null) {
            m16065n();
        } else if (this.f22083b.mo14262h()) {
            m16065n();
        }
        if (this.f22106z) {
            this.f22083b.mo14244a(1);
        } else {
            this.f22083b.mo14244a(0);
        }
        this.f22083b.mo14247a((C8087a) this, (C8088b) this);
        m16073v();
        if (z || !m16071t()) {
            if (z) {
                this.f22098r = 0;
            }
            m16067p();
        } else if (m16070s()) {
            this.f22083b.mo14245a(this.f22085d);
            this.f22083b.mo14256c();
            if (m16072u()) {
                ((C4193l) C4116c.m10249a(C4193l.class)).cacheEndTime(this, System.currentTimeMillis());
                this.f22095o.obtainMessage(C8652b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }

    /* renamed from: a */
    public final void mo14270a(boolean z, Context context) {
        mo9616a(z, C8651a.m17097a(context));
    }

    /* renamed from: a */
    public final void mo9616a(boolean z, String str) {
        if (TextUtils.equals(str, this.f22103w) && this.f22083b != null) {
            this.f22083b.mo14251a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo9617a() {
        if (this.f22083b == null) {
            return false;
        }
        Point i = this.f22083b.mo14263i();
        if (i.x > i.y) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo9615a(boolean z) {
        this.f22105y = z;
        m16069r();
    }

    /* renamed from: a */
    public final void mo9614a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("player_type")) {
            if (this.f22083b instanceof C8111u) {
                try {
                    jSONObject.put("new_sdk", true);
                } catch (JSONException e) {
                    C3831a.m9714b(f22077a, (Throwable) e);
                }
            } else {
                try {
                    jSONObject.put("new_sdk", false);
                } catch (JSONException e2) {
                    C3831a.m9714b(f22077a, (Throwable) e2);
                }
            }
        }
        if (!(this.f22087f == null || jSONObject == null)) {
            try {
                for (Entry entry : this.f22087f.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        mo14271b(jSONObject);
        C8097k kVar = this.f22086e;
        C8626b a = C8626b.m17014a();
        C8100b bVar = new C8100b(kVar.f22113c, kVar.f22114d, kVar.f22112b, kVar.f22115e, kVar.f22116f, jSONObject);
        a.mo15106a((Callable) bVar);
    }

    /* renamed from: d */
    public final JSONObject mo9625d() {
        return this.f22083b.mo14264j();
    }

    /* renamed from: j */
    public final boolean mo14282j() {
        return m16072u();
    }

    /* renamed from: s */
    private boolean m16070s() {
        if ((this.f22088h & 2) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private boolean m16071t() {
        if ((this.f22088h & 1) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private boolean m16072u() {
        if ((this.f22088h & 4) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo9622c() {
        C8097k kVar = this.f22086e;
        kVar.f22111a = false;
        kVar.f22112b = 0.0f;
    }

    /* renamed from: e */
    public final void mo14266e() {
        if (this.f22096p instanceof C8656e) {
            try {
                ((C8656e) this.f22096p).mo10921a();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public final void mo14267f() {
        if (this.f22096p instanceof C8656e) {
            try {
                ((C8656e) this.f22096p).mo10923b();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public final boolean mo14281i() {
        if (this.f22083b == null || !this.f22083b.mo14261g()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo9618b() {
        C8097k kVar = this.f22086e;
        kVar.f22111a = true;
        kVar.f22113c = C3922z.m9908b();
        kVar.f22114d = C3922z.m9910c();
        C8626b.m17014a().mo15106a((Callable) new C8104n(kVar));
    }

    /* renamed from: m */
    private void m16064m() {
        this.f22096p = null;
        this.f22094n = false;
        this.f22089i = "";
        this.f22090j = "";
        this.f22093m = f22078g;
        if (this.f22084c != null) {
            this.f22084c.setSurfaceTextureListener(null);
            this.f22084c = null;
        }
        if (this.f22085d != null) {
            this.f22085d.release();
            this.f22085d = null;
        }
        this.f22097q = 0;
        this.f22098r = 0;
        this.f22087f = null;
        m16063g(false);
        m16060f(false);
        mo14277e(false);
    }

    /* renamed from: n */
    private void m16065n() throws Exception {
        if (this.f22083b != null) {
            this.f22083b.mo14260f();
            this.f22083b.mo14247a((C8087a) null, (C8088b) null);
            m16060f(false);
            m16063g(false);
        }
        this.f22083b = this.f22102v.mo14242a(this.f22100t, new C8095i(this));
        this.f22083b.mo14247a((C8087a) this, (C8088b) this);
        this.f22083b.mo14257c(this.f22106z);
        m16073v();
    }

    /* renamed from: q */
    private void m16068q() {
        if (this.f22083b != null) {
            this.f22083b.mo14245a((Surface) null);
            this.f22083b.mo14246a((SurfaceHolder) null);
            this.f22083b.mo14251a(true);
        }
        if (this.f22084c != null) {
            this.f22084c.setSurfaceTextureListener(null);
            this.f22084c = null;
        }
        if (this.f22085d != null) {
            this.f22085d.release();
            this.f22085d = null;
        }
        mo14277e(false);
    }

    /* renamed from: r */
    private void m16069r() {
        if (this.f22083b != null) {
            if (!this.f22104x) {
                this.f22083b.mo14244a(0);
            } else if (this.f22105y) {
                this.f22083b.mo14244a(3);
            } else {
                this.f22083b.mo14244a(2);
            }
        }
    }

    /* renamed from: o */
    private void m16066o() {
        if (m16070s() && this.f22083b != null) {
            this.f22083b.mo14245a(this.f22085d);
            if (m16071t() && this.f22094n && !this.f22083b.mo14261g()) {
                this.f22083b.mo14256c();
            }
        }
        if (this.f22088h == 7 && this.f22094n) {
            ((C4193l) C4116c.m10249a(C4193l.class)).cacheEndTime(this, System.currentTimeMillis());
            this.f22095o.obtainMessage(C8652b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
        }
    }

    /* renamed from: v */
    private void m16073v() {
        if (this.f22099s == C8710m.SCREEN_RECORD || this.f22099s == C8710m.THIRD_PARTY || this.f22099s == C8710m.OFFICIAL_ACTIVITY) {
            if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
                this.f22083b.mo14254b("musically_game_live");
            } else {
                this.f22083b.mo14254b("tiktok_game_live");
            }
        } else if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
            this.f22083b.mo14254b("musically_live");
        } else {
            this.f22083b.mo14254b("tiktok_live");
        }
    }

    /* renamed from: g */
    public final void mo14279g() {
        if (this.f22083b != null) {
            this.f22083b.mo14247a((C8087a) null, (C8088b) null);
            this.f22083b.mo14259e();
            this.f22083b = null;
        }
        m16064m();
    }

    /* renamed from: p */
    private void m16067p() throws Exception {
        C8090d dVar;
        if (this.f22083b != null) {
            if (this.f22083b.mo14262h()) {
                m16065n();
            }
            m16073v();
            this.f22097q = 0;
            m16060f(false);
            m16063g(false);
            if (!C9431p.m18664a(this.f22090j)) {
                this.f22083b.mo14249a(this.f22090j, this.f22091k);
            } else {
                switch (this.f22099s) {
                    case AUDIO:
                        dVar = C8090d.AUDIO;
                        break;
                    case THIRD_PARTY:
                        dVar = C8090d.OBS;
                        break;
                    case SCREEN_RECORD:
                        dVar = C8090d.SCREENSHOT;
                        break;
                    default:
                        dVar = C8090d.VIDEO;
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_params", this.f22092l);
                this.f22083b.mo14250a(this.f22089i, (Map<String, String>) hashMap, dVar);
                this.f22083b.mo14252a(this.f22093m.f23680a, this.f22093m.f23681b, this.f22093m.f23682c);
            }
            this.f22081C = SystemClock.currentThreadTimeMillis();
            this.f22083b.mo14255b(this.f22079A);
            this.f22083b.mo14253b();
        }
    }

    /* renamed from: a */
    public final void mo9613a(Map<String, String> map) {
        this.f22087f = map;
    }

    /* renamed from: c */
    public final void mo9624c(boolean z) {
        this.f22079A = z;
    }

    /* renamed from: a */
    public final void mo9608a(Context context) {
        mo9623c(C8651a.m17097a(context));
    }

    /* renamed from: b */
    public final void mo9619b(Context context) {
        mo9626d(C8651a.m17097a(context));
    }

    /* renamed from: e */
    public final void mo14275e(Context context) {
        mo9610a(C8651a.m17097a(context));
    }

    /* renamed from: f */
    public final void mo14278f(Context context) {
        mo9620b(C8651a.m17097a(context));
    }

    /* renamed from: a */
    private void m16058a(TextureView textureView) {
        String str;
        if (textureView != null) {
            str = C8651a.m17097a(textureView.getContext());
        } else {
            str = null;
        }
        mo9609a(textureView, str);
    }

    /* renamed from: b */
    public final void mo9621b(boolean z) {
        this.f22104x = z;
        m16069r();
    }

    /* renamed from: d */
    public final void mo14273d(Context context) {
        m16062g(C8651a.m17097a(context));
    }

    /* renamed from: g */
    private void m16062g(String str) {
        if (TextUtils.equals(str, this.f22103w)) {
            this.f22094n = false;
            if (this.f22083b != null) {
                this.f22083b.mo14258d();
            }
        }
    }

    /* renamed from: a */
    public final void mo9610a(String str) {
        if (TextUtils.equals(str, this.f22103w)) {
            if (this.f22083b != null) {
                this.f22083b.mo14247a((C8087a) null, (C8088b) null);
                this.f22083b.mo14259e();
                this.f22083b = null;
            }
            m16064m();
        }
    }

    /* renamed from: c */
    public final void mo14272c(Context context) {
        String a = C8651a.m17097a(context);
        if (TextUtils.equals(a, this.f22103w)) {
            new C5058a(this).mo10927a(a);
            m16062g(a);
            mo9610a(a);
        }
    }

    /* renamed from: d */
    public final void mo9626d(String str) {
        if (TextUtils.equals(str, this.f22103w)) {
            if (this.f22096p != null) {
                this.f22096p.mo10922a(C8652b.STOP_WHEN_JOIN_INTERACT, null);
            }
            mo9610a(str);
        }
    }

    /* renamed from: e */
    public final void mo14276e(String str) {
        if (this.f22083b != null) {
            this.f22083b.mo14248a(str);
        }
    }

    /* renamed from: f */
    private void m16060f(boolean z) {
        if (z) {
            this.f22088h |= 1;
            if (this.f22099s == C8710m.AUDIO) {
                this.f22088h |= 2;
                this.f22088h |= 4;
            }
        } else {
            this.f22088h &= -2;
        }
        m16066o();
    }

    /* renamed from: g */
    private void m16063g(boolean z) {
        if (z) {
            this.f22088h |= 4;
        } else {
            this.f22088h &= -5;
        }
        m16066o();
    }

    /* renamed from: b */
    public final void mo9620b(String str) {
        if (TextUtils.equals(str, this.f22103w)) {
            if (this.f22096p != null) {
                this.f22096p.mo10922a(C8652b.STOP_WHEN_PLAYING_OTHER, null);
            }
            mo9610a(str);
        }
    }

    /* renamed from: c */
    public final void mo9623c(String str) {
        if (TextUtils.equals(str, this.f22103w)) {
            this.f22094n = false;
            if (this.f22083b != null) {
                this.f22083b.mo14258d();
            }
            this.f22096p = null;
            m16068q();
        }
    }

    /* renamed from: d */
    public final void mo14274d(boolean z) {
        this.f22106z = z;
        if (this.f22083b != null) {
            this.f22083b.mo14257c(z);
        }
    }

    /* renamed from: e */
    public final void mo14277e(boolean z) {
        if (z) {
            this.f22088h |= 2;
        } else {
            this.f22088h &= -3;
        }
        m16066o();
    }

    /* renamed from: f */
    private boolean m16061f(String str) {
        try {
            Uri parse = Uri.parse(this.f22089i);
            Uri parse2 = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getHost());
            sb.append(parse.getPath());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(parse2.getHost());
            sb3.append(parse2.getPath());
            if (!C9431p.m18665a(sb2, sb3.toString())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (message.what == 9) {
            try {
                m16067p();
            } catch (Exception unused) {
            }
        } else {
            C8652b valueOf = C8652b.valueOf(message.what);
            if (!(valueOf == C8652b.UNKNOWN || this.f22096p == null)) {
                this.f22096p.mo10922a(valueOf, message.obj);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14271b(JSONObject jSONObject) {
        String optString = jSONObject.optString("cdn_play_url");
        if (jSONObject != null && !TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "none")) {
            if (TextUtils.isEmpty(this.f22082D)) {
                this.f22082D = optString;
                return;
            }
            if (!TextUtils.equals(this.f22082D, optString)) {
                C8109s.m16129a(jSONObject, this.f22082D, this.f22089i, this.f22090j, this.f22091k, this.f22092l);
            }
        }
    }

    /* renamed from: a */
    private void m16059a(C8652b bVar, Object obj) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.f22095o.obtainMessage(bVar.ordinal(), obj).sendToTarget();
        } else if (this.f22096p != null) {
            this.f22096p.mo10922a(bVar, obj);
        }
    }

    /* renamed from: a */
    public final void mo9609a(TextureView textureView, String str) {
        if (textureView == null) {
            if (this.f22083b != null) {
                this.f22083b.mo14258d();
            }
            if (this.f22084c != null) {
                this.f22084c.setSurfaceTextureListener(null);
                this.f22084c = null;
            }
            if (this.f22085d != null) {
                this.f22085d.release();
                this.f22085d = null;
            }
            if (m16070s()) {
                mo14277e(false);
            }
        } else if (this.f22084c != textureView) {
            if (this.f22084c != null) {
                this.f22084c.setSurfaceTextureListener(null);
                this.f22084c = null;
            }
            if (this.f22085d != null) {
                this.f22085d.release();
                this.f22085d = null;
            }
            this.f22084c = textureView;
            this.f22103w = str;
            this.f22084c.setSurfaceTextureListener(this.f22080B);
            if (this.f22084c.getSurfaceTexture() != null) {
                this.f22085d = new Surface(this.f22084c.getSurfaceTexture());
                mo14277e(true);
                return;
            }
            mo14277e(false);
        }
    }

    public C8091h(Context context, IHostPlugin iHostPlugin, C8085f fVar) {
        this.f22100t = context;
        this.f22101u = iHostPlugin;
        this.f22102v = fVar;
        this.f22095o = new C8618a(this);
        this.f22086e = C4147d.m10295f().mo9529b();
        String a = C4147d.m10295f().mo9531d().mo9525a(context);
        if (a != null) {
            this.f22086e.mo9527a(a);
        }
        m16064m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f2, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14265a(com.bytedance.android.livesdk.player.C8086g.C8089c r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            int[] r0 = com.bytedance.android.livesdk.player.C8091h.C80932.f22109b
            int r1 = r8.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0063;
                case 2: goto L_0x004d;
                case 3: goto L_0x004d;
                case 4: goto L_0x002f;
                case 5: goto L_0x0020;
                case 6: goto L_0x001a;
                case 7: goto L_0x0014;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0066
        L_0x000e:
            com.bytedance.android.livesdkapi.depend.live.h$b r9 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.BUFFERING_END
            r7.m16059a(r9, r10)
            goto L_0x0066
        L_0x0014:
            com.bytedance.android.livesdkapi.depend.live.h$b r9 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.BUFFERING_START
            r7.m16059a(r9, r10)
            goto L_0x0066
        L_0x001a:
            com.bytedance.android.livesdkapi.depend.live.h$b r9 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.INTERACT_SEI
            r7.m16059a(r9, r10)
            goto L_0x0066
        L_0x0020:
            r7.f22097q = r9
            r7.m16069r()
            com.bytedance.android.livesdkapi.depend.live.h$b r10 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.VIDEO_SIZE_CHANGED
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r7.m16059a(r10, r9)
            goto L_0x0066
        L_0x002f:
            com.bytedance.android.livesdk.player.g r9 = r7.f22083b
            if (r9 == 0) goto L_0x0042
            com.bytedance.android.livesdk.player.g r9 = r7.f22083b
            android.graphics.Point r9 = r9.mo14263i()
            int r0 = r9.x
            int r9 = r9.y
            int r9 = r9 << 16
            r9 = r9 | r0
            r7.f22097q = r9
        L_0x0042:
            r7.f22098r = r2
            r7.m16060f(r1)
            com.bytedance.android.livesdkapi.depend.live.h$b r9 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.PLAYER_PREPARED
            r7.m16059a(r9, r10)
            goto L_0x0066
        L_0x004d:
            r7.m16060f(r2)
            r7.m16063g(r2)
            com.bytedance.android.livesdk.player.g$c r9 = com.bytedance.android.livesdk.player.C8086g.C8089c.MEDIA_ERROR
            if (r8 != r9) goto L_0x005d
            com.bytedance.android.livesdkapi.depend.live.h$b r9 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.MEDIA_ERROR
            r7.m16059a(r9, r10)
            goto L_0x0066
        L_0x005d:
            com.bytedance.android.livesdkapi.depend.live.h$b r9 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.COMPLETE_PLAY
            r7.m16059a(r9, r10)
            goto L_0x0066
        L_0x0063:
            r7.m16063g(r1)
        L_0x0066:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Throwable -> 0x00f3 }
            r9.<init>()     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "event_page"
            java.lang.String r0 = "live_detail"
            r9.put(r10, r0)     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "time"
            long r3 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ Throwable -> 0x00f3 }
            long r5 = r7.f22081C     // Catch:{ Throwable -> 0x00f3 }
            r0 = 0
            long r3 = r3 - r5
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x00f3 }
            r9.put(r10, r0)     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "url"
            java.lang.String r0 = r7.f22089i     // Catch:{ Throwable -> 0x00f3 }
            r9.put(r10, r0)     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "pull_stream_data"
            java.lang.String r0 = r7.f22090j     // Catch:{ Throwable -> 0x00f3 }
            r9.put(r10, r0)     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "default_resolution"
            java.lang.String r0 = r7.f22091k     // Catch:{ Throwable -> 0x00f3 }
            r9.put(r10, r0)     // Catch:{ Throwable -> 0x00f3 }
            int[] r10 = com.bytedance.android.livesdk.player.C8091h.C80932.f22109b     // Catch:{ Throwable -> 0x00f3 }
            int r8 = r8.ordinal()     // Catch:{ Throwable -> 0x00f3 }
            r8 = r10[r8]     // Catch:{ Throwable -> 0x00f3 }
            switch(r8) {
                case 1: goto L_0x00db;
                case 2: goto L_0x00c4;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00a4;
                default: goto L_0x00a3;
            }     // Catch:{ Throwable -> 0x00f3 }
        L_0x00a3:
            goto L_0x00f2
        L_0x00a4:
            com.bytedance.android.livesdk.o.c r8 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "live_block_end"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00f3 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r0[r2] = r1     // Catch:{ Throwable -> 0x00f3 }
            r8.mo14202a(r10, r9, r0)     // Catch:{ Throwable -> 0x00f3 }
            goto L_0x00f2
        L_0x00b4:
            com.bytedance.android.livesdk.o.c r8 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "live_block_start"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00f3 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r0[r2] = r1     // Catch:{ Throwable -> 0x00f3 }
            r8.mo14202a(r10, r9, r0)     // Catch:{ Throwable -> 0x00f3 }
            goto L_0x00f9
        L_0x00c4:
            java.lang.String r8 = "is_success"
            java.lang.String r10 = "0"
            r9.put(r8, r10)     // Catch:{ Throwable -> 0x00f3 }
            com.bytedance.android.livesdk.o.c r8 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "live_first_play"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00f3 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r0[r2] = r1     // Catch:{ Throwable -> 0x00f3 }
            r8.mo14202a(r10, r9, r0)     // Catch:{ Throwable -> 0x00f3 }
            goto L_0x00f9
        L_0x00db:
            java.lang.String r8 = "is_success"
            java.lang.String r10 = "1"
            r9.put(r8, r10)     // Catch:{ Throwable -> 0x00f3 }
            com.bytedance.android.livesdk.o.c r8 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r10 = "live_first_play"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00f3 }
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r0[r2] = r1     // Catch:{ Throwable -> 0x00f3 }
            r8.mo14202a(r10, r9, r0)     // Catch:{ Throwable -> 0x00f3 }
            goto L_0x00f9
        L_0x00f2:
            return
        L_0x00f3:
            r8 = move-exception
            java.lang.String r9 = "LivePlayController"
            com.bytedance.android.live.core.p224c.C3831a.m9714b(r9, r8)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.C8091h.mo14265a(com.bytedance.android.livesdk.player.g$c, int, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo14268a(String str, TextureView textureView, int i, C8654d dVar, C8653c cVar, String str2) throws Exception {
        mo9611a(str, textureView, i, dVar, cVar, str2, (String) null);
    }

    /* renamed from: a */
    public final void mo9611a(String str, TextureView textureView, int i, C8654d dVar, C8653c cVar, String str2, String str3) throws Exception {
        if (str == null) {
            m16064m();
            if (this.f22083b != null) {
                this.f22083b.mo14243a();
            }
            return;
        }
        this.f22082D = "";
        this.f22089i = "";
        this.f22090j = "";
        this.f22099s = C8710m.valueOf(i);
        if (textureView != null) {
            m16058a(textureView);
        }
        if (str3 != null) {
            this.f22103w = str3;
        }
        if (this.f22096p != null) {
            this.f22096p.mo10922a(C8652b.PLAYER_DETACHED, null);
        }
        this.f22096p = cVar;
        this.f22094n = true;
        boolean f = m16061f(str);
        this.f22089i = str;
        this.f22092l = str2;
        if (dVar == null) {
            dVar = f22078g;
        }
        this.f22093m = dVar;
        if (this.f22083b == null) {
            m16065n();
        } else if (this.f22083b.mo14262h()) {
            m16065n();
        }
        if (this.f22106z) {
            this.f22083b.mo14244a(1);
        } else {
            this.f22083b.mo14244a(0);
        }
        this.f22083b.mo14247a((C8087a) this, (C8088b) this);
        m16073v();
        if (f || !m16071t()) {
            if (f) {
                this.f22098r = 0;
            }
            m16067p();
        } else if (m16070s()) {
            this.f22083b.mo14245a(this.f22085d);
            this.f22083b.mo14256c();
            if (m16072u()) {
                ((C4193l) C4116c.m10249a(C4193l.class)).cacheEndTime(this, System.currentTimeMillis());
                this.f22095o.obtainMessage(C8652b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }
}

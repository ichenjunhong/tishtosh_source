package com.google.gson.p1078c;

import com.bef.effectsdk.message.MessageCenter;
import com.google.gson.C18088r;
import com.google.gson.internal.C18059e;
import com.google.gson.internal.bind.C18002c;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.gson.c.a */
public class C17958a implements Closeable {

    /* renamed from: c */
    private static final char[] f49846c = ")]}'\n".toCharArray();

    /* renamed from: a */
    public boolean f49847a;

    /* renamed from: b */
    int f49848b;

    /* renamed from: d */
    private final Reader f49849d;

    /* renamed from: e */
    private final char[] f49850e = new char[PreloadTask.BYTE_UNIT_NUMBER];

    /* renamed from: f */
    private int f49851f;

    /* renamed from: g */
    private int f49852g;

    /* renamed from: h */
    private int f49853h;

    /* renamed from: i */
    private int f49854i;

    /* renamed from: j */
    private long f49855j;

    /* renamed from: k */
    private int f49856k;

    /* renamed from: l */
    private String f49857l;

    /* renamed from: m */
    private int[] f49858m = new int[32];

    /* renamed from: n */
    private int f49859n;

    /* renamed from: o */
    private String[] f49860o;

    /* renamed from: p */
    private int[] f49861p;

    static {
        C18059e.f50107a = new C18059e() {
            /* renamed from: a */
            public final void mo34856a(C17958a aVar) throws IOException {
                if (aVar instanceof C18002c) {
                    C18002c cVar = (C18002c) aVar;
                    cVar.mo34945a(C17960b.NAME);
                    Entry entry = (Entry) ((Iterator) cVar.mo34947g()).next();
                    cVar.mo34946a(entry.getValue());
                    cVar.mo34946a((Object) new C18088r((String) entry.getKey()));
                    return;
                }
                int i = aVar.f49848b;
                if (i == 0) {
                    i = aVar.mo34853q();
                }
                if (i == 13) {
                    aVar.f49848b = 9;
                } else if (i == 12) {
                    aVar.f49848b = 8;
                } else if (i == 14) {
                    aVar.f49848b = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(aVar.mo34843f());
                    sb.append(aVar.mo34854r());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }

    /* renamed from: u */
    private void m44022u() throws IOException {
        if (!this.f49847a) {
            throw m44015b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public void close() throws IOException {
        this.f49848b = 0;
        this.f49858m[0] = 8;
        this.f49859n = 1;
        this.f49849d.close();
    }

    /* renamed from: e */
    public boolean mo34842e() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 2 || i == 4) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo34854r());
        return sb.toString();
    }

    /* renamed from: v */
    private void m44023v() throws IOException {
        char c;
        do {
            if (this.f49851f >= this.f49852g && !m44017b(1)) {
                break;
            }
            char[] cArr = this.f49850e;
            int i = this.f49851f;
            this.f49851f = i + 1;
            c = cArr[i];
            if (c == 10) {
                this.f49853h++;
                this.f49854i = this.f49851f;
                return;
            }
        } while (c != 13);
    }

    /* renamed from: x */
    private void m44025x() throws IOException {
        m44011a(true);
        this.f49851f--;
        if (this.f49851f + f49846c.length <= this.f49852g || m44017b(f49846c.length)) {
            int i = 0;
            while (i < f49846c.length) {
                if (this.f49850e[this.f49851f + i] == f49846c[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.f49851f += f49846c.length;
        }
    }

    /* renamed from: b */
    public void mo34838b() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 4) {
            this.f49859n--;
            int[] iArr = this.f49861p;
            int i2 = this.f49859n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f49848b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(mo34843f());
        sb.append(mo34854r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public void mo34847k() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 7) {
            this.f49848b = 0;
            int[] iArr = this.f49861p;
            int i2 = this.f49859n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(mo34843f());
        sb.append(mo34854r());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final String mo34854r() {
        int i = this.f49853h + 1;
        int i2 = (this.f49851f - this.f49854i) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(mo34852p());
        return sb.toString();
    }

    /* renamed from: c */
    public void mo34839c() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 1) {
            m44012a(3);
            this.f49848b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(mo34843f());
        sb.append(mo34854r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public void mo34841d() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 2) {
            this.f49859n--;
            this.f49860o[this.f49859n] = null;
            int[] iArr = this.f49861p;
            int i2 = this.f49859n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f49848b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(mo34843f());
        sb.append(mo34854r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public C17960b mo34843f() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        switch (i) {
            case 1:
                return C17960b.BEGIN_OBJECT;
            case 2:
                return C17960b.END_OBJECT;
            case 3:
                return C17960b.BEGIN_ARRAY;
            case 4:
                return C17960b.END_ARRAY;
            case 5:
            case 6:
                return C17960b.BOOLEAN;
            case 7:
                return C17960b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C17960b.STRING;
            case 12:
            case 13:
            case 14:
                return C17960b.NAME;
            case 15:
            case 16:
                return C17960b.NUMBER;
            case 17:
                return C17960b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: h */
    public String mo34844h() throws IOException {
        String str;
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 14) {
            str = m44021t();
        } else if (i == 12) {
            str = m44016b('\'');
        } else if (i == 13) {
            str = m44016b('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(mo34843f());
            sb.append(mo34854r());
            throw new IllegalStateException(sb.toString());
        }
        this.f49848b = 0;
        this.f49860o[this.f49859n - 1] = str;
        return str;
    }

    /* renamed from: j */
    public boolean mo34846j() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 5) {
            this.f49848b = 0;
            int[] iArr = this.f49861p;
            int i2 = this.f49859n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f49848b = 0;
            int[] iArr2 = this.f49861p;
            int i3 = this.f49859n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(mo34843f());
            sb.append(mo34854r());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: p */
    public String mo34852p() {
        StringBuilder sb = new StringBuilder(ClassUtils.INNER_CLASS_SEPARATOR);
        int i = this.f49859n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f49858m[i2]) {
                case 1:
                case 2:
                    sb.append('[');
                    sb.append(this.f49861p[i2]);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    if (this.f49860o[i2] == null) {
                        break;
                    } else {
                        sb.append(this.f49860o[i2]);
                        break;
                    }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    private int mo34947g() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.f49850e[this.f49851f];
        if (c == 't' || c == 'T') {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f49851f + i2 >= this.f49852g && !m44017b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f49850e[this.f49851f + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f49851f + length < this.f49852g || m44017b(length + 1)) && m44013a(this.f49850e[this.f49851f + length])) {
            return 0;
        }
        this.f49851f += length;
        this.f49848b = i;
        return i;
    }

    /* renamed from: t */
    private String m44021t() throws IOException {
        int i;
        String str;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            i = 0;
            while (true) {
                if (this.f49851f + i < this.f49852g) {
                    switch (this.f49850e[this.f49851f + i]) {
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                        case '/':
                        case ';':
                        case BaseNotice.TCM /*61*/:
                        case '\\':
                            m44022u();
                            break;
                        default:
                            i++;
                            break;
                    }
                } else if (i >= this.f49850e.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i, 16));
                    }
                    sb.append(this.f49850e, this.f49851f, i);
                    this.f49851f += i;
                    if (!m44017b(1)) {
                    }
                } else if (m44017b(i + 1)) {
                }
            }
        }
        i2 = i;
        if (sb == null) {
            str = new String(this.f49850e, this.f49851f, i2);
        } else {
            sb.append(this.f49850e, this.f49851f, i2);
            str = sb.toString();
        }
        this.f49851f += i2;
        return str;
    }

    /* renamed from: w */
    private char m44024w() throws IOException {
        int i;
        if (this.f49851f != this.f49852g || m44017b(1)) {
            char[] cArr = this.f49850e;
            int i2 = this.f49851f;
            this.f49851f = i2 + 1;
            char c = cArr[i2];
            if (c == 10) {
                this.f49853h++;
                this.f49854i = this.f49851f;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                switch (c) {
                    case 't':
                        return 9;
                    case 'u':
                        if (this.f49851f + 4 <= this.f49852g || m44017b(4)) {
                            char c2 = 0;
                            int i3 = this.f49851f;
                            int i4 = i3 + 4;
                            while (i3 < i4) {
                                char c3 = this.f49850e[i3];
                                char c4 = (char) (c2 << 4);
                                if (c3 >= '0' && c3 <= '9') {
                                    i = c3 - '0';
                                } else if (c3 >= 'a' && c3 <= 'f') {
                                    i = (c3 - 'a') + 10;
                                } else if (c3 < 'A' || c3 > 'F') {
                                    StringBuilder sb = new StringBuilder("\\u");
                                    sb.append(new String(this.f49850e, this.f49851f, 4));
                                    throw new NumberFormatException(sb.toString());
                                } else {
                                    i = (c3 - 'A') + 10;
                                }
                                c2 = (char) (c4 + i);
                                i3++;
                            }
                            this.f49851f += 4;
                            return c2;
                        }
                        throw m44015b("Unterminated escape sequence");
                    default:
                        throw m44015b("Invalid escape sequence");
                }
            }
            return c;
        }
        throw m44015b("Unterminated escape sequence");
    }

    /* renamed from: i */
    public String mo34845i() throws IOException {
        String str;
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 10) {
            str = m44021t();
        } else if (i == 8) {
            str = m44016b('\'');
        } else if (i == 9) {
            str = m44016b('\"');
        } else if (i == 11) {
            str = this.f49857l;
            this.f49857l = null;
        } else if (i == 15) {
            str = Long.toString(this.f49855j);
        } else if (i == 16) {
            str = new String(this.f49850e, this.f49851f, this.f49856k);
            this.f49851f += this.f49856k;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(mo34843f());
            sb.append(mo34854r());
            throw new IllegalStateException(sb.toString());
        }
        this.f49848b = 0;
        int[] iArr = this.f49861p;
        int i2 = this.f49859n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: l */
    public double mo34848l() throws IOException {
        char c;
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 15) {
            this.f49848b = 0;
            int[] iArr = this.f49861p;
            int i2 = this.f49859n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f49855j;
        }
        if (i == 16) {
            this.f49857l = new String(this.f49850e, this.f49851f, this.f49856k);
            this.f49851f += this.f49856k;
        } else if (i == 8 || i == 9) {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f49857l = m44016b(c);
        } else if (i == 10) {
            this.f49857l = m44021t();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(mo34843f());
            sb.append(mo34854r());
            throw new IllegalStateException(sb.toString());
        }
        this.f49848b = 11;
        double parseDouble = Double.parseDouble(this.f49857l);
        if (this.f49847a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f49857l = null;
            this.f49848b = 0;
            int[] iArr2 = this.f49861p;
            int i3 = this.f49859n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo34854r());
        throw new C17962d(sb2.toString());
    }

    /* renamed from: m */
    public long mo34849m() throws IOException {
        char c;
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 15) {
            this.f49848b = 0;
            int[] iArr = this.f49861p;
            int i2 = this.f49859n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f49855j;
        }
        if (i == 16) {
            this.f49857l = new String(this.f49850e, this.f49851f, this.f49856k);
            this.f49851f += this.f49856k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f49857l = m44021t();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f49857l = m44016b(c);
            }
            try {
                long parseLong = Long.parseLong(this.f49857l);
                this.f49848b = 0;
                int[] iArr2 = this.f49861p;
                int i3 = this.f49859n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(mo34843f());
            sb.append(mo34854r());
            throw new IllegalStateException(sb.toString());
        }
        this.f49848b = 11;
        double parseDouble = Double.parseDouble(this.f49857l);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f49857l = null;
            this.f49848b = 0;
            int[] iArr3 = this.f49861p;
            int i4 = this.f49859n - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder("Expected a long but was ");
        sb2.append(this.f49857l);
        sb2.append(mo34854r());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: n */
    public int mo34850n() throws IOException {
        char c;
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 15) {
            int i2 = (int) this.f49855j;
            if (this.f49855j == ((long) i2)) {
                this.f49848b = 0;
                int[] iArr = this.f49861p;
                int i3 = this.f49859n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.f49855j);
            sb.append(mo34854r());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f49857l = new String(this.f49850e, this.f49851f, this.f49856k);
            this.f49851f += this.f49856k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f49857l = m44021t();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f49857l = m44016b(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f49857l);
                this.f49848b = 0;
                int[] iArr2 = this.f49861p;
                int i4 = this.f49859n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(mo34843f());
            sb2.append(mo34854r());
            throw new IllegalStateException(sb2.toString());
        }
        this.f49848b = 11;
        double parseDouble = Double.parseDouble(this.f49857l);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f49857l = null;
            this.f49848b = 0;
            int[] iArr3 = this.f49861p;
            int i6 = this.f49859n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder("Expected an int but was ");
        sb3.append(this.f49857l);
        sb3.append(mo34854r());
        throw new NumberFormatException(sb3.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r6.f49851f += r2;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34851o() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r6.f49848b
            if (r2 != 0) goto L_0x000a
            int r2 = r6.mo34853q()
        L_0x000a:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L_0x0015
            r6.m44012a(r4)
            int r1 = r1 + 1
            goto L_0x0091
        L_0x0015:
            if (r2 != r4) goto L_0x001e
            r6.m44012a(r3)
            int r1 = r1 + 1
            goto L_0x0091
        L_0x001e:
            r3 = 4
            if (r2 != r3) goto L_0x002a
            int r2 = r6.f49859n
            int r2 = r2 - r4
            r6.f49859n = r2
            int r1 = r1 + -1
            goto L_0x0091
        L_0x002a:
            r3 = 2
            if (r2 != r3) goto L_0x0035
            int r2 = r6.f49859n
            int r2 = r2 - r4
            r6.f49859n = r2
            int r1 = r1 + -1
            goto L_0x0091
        L_0x0035:
            r3 = 14
            if (r2 == r3) goto L_0x0068
            r3 = 10
            if (r2 != r3) goto L_0x003e
            goto L_0x0068
        L_0x003e:
            r3 = 8
            if (r2 == r3) goto L_0x0062
            r3 = 12
            if (r2 != r3) goto L_0x0047
            goto L_0x0062
        L_0x0047:
            r3 = 9
            if (r2 == r3) goto L_0x005c
            r3 = 13
            if (r2 != r3) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r3 = 16
            if (r2 != r3) goto L_0x0091
            int r2 = r6.f49851f
            int r3 = r6.f49856k
            int r2 = r2 + r3
            r6.f49851f = r2
            goto L_0x0091
        L_0x005c:
            r2 = 34
            r6.m44018c(r2)
            goto L_0x0091
        L_0x0062:
            r2 = 39
            r6.m44018c(r2)
            goto L_0x0091
        L_0x0068:
            r2 = 0
        L_0x0069:
            int r3 = r6.f49851f
            int r3 = r3 + r2
            int r5 = r6.f49852g
            if (r3 >= r5) goto L_0x0086
            char[] r3 = r6.f49850e
            int r5 = r6.f49851f
            int r5 = r5 + r2
            char r3 = r3[r5]
            switch(r3) {
                case 9: goto L_0x0080;
                case 10: goto L_0x0080;
                case 12: goto L_0x0080;
                case 13: goto L_0x0080;
                case 32: goto L_0x0080;
                case 35: goto L_0x007d;
                case 44: goto L_0x0080;
                case 47: goto L_0x007d;
                case 58: goto L_0x0080;
                case 59: goto L_0x007d;
                case 61: goto L_0x007d;
                case 91: goto L_0x0080;
                case 92: goto L_0x007d;
                case 93: goto L_0x0080;
                case 123: goto L_0x0080;
                case 125: goto L_0x0080;
                default: goto L_0x007a;
            }
        L_0x007a:
            int r2 = r2 + 1
            goto L_0x0069
        L_0x007d:
            r6.m44022u()
        L_0x0080:
            int r3 = r6.f49851f
            int r3 = r3 + r2
            r6.f49851f = r3
            goto L_0x0091
        L_0x0086:
            int r3 = r6.f49851f
            int r3 = r3 + r2
            r6.f49851f = r3
            boolean r2 = r6.m44017b(r4)
            if (r2 != 0) goto L_0x0068
        L_0x0091:
            r6.f49848b = r0
            if (r1 != 0) goto L_0x0002
            int[] r0 = r6.f49861p
            int r1 = r6.f49859n
            int r1 = r1 - r4
            r2 = r0[r1]
            int r2 = r2 + r4
            r0[r1] = r2
            java.lang.String[] r0 = r6.f49860o
            int r1 = r6.f49859n
            int r1 = r1 - r4
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p1078c.C17958a.mo34851o():void");
    }

    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m44020s() throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            char[] r1 = r0.f49850e
            int r2 = r0.f49851f
            int r3 = r0.f49852g
            r6 = 1
            r7 = 0
            r8 = r3
            r3 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r13 = 0
        L_0x0011:
            int r14 = r2 + r3
            r15 = 2
            if (r14 != r8) goto L_0x0026
            int r2 = r1.length
            if (r3 != r2) goto L_0x001a
            return r7
        L_0x001a:
            int r2 = r3 + 1
            boolean r2 = r0.m44017b(r2)
            if (r2 == 0) goto L_0x0097
            int r2 = r0.f49851f
            int r8 = r0.f49852g
        L_0x0026:
            int r14 = r2 + r3
            char r14 = r1[r14]
            r7 = 43
            r4 = 3
            r5 = 5
            if (r14 == r7) goto L_0x00ee
            r7 = 69
            if (r14 == r7) goto L_0x00e2
            r7 = 101(0x65, float:1.42E-43)
            if (r14 == r7) goto L_0x00e2
            switch(r14) {
                case 45: goto L_0x00d5;
                case 46: goto L_0x00cd;
                default: goto L_0x003b;
            }
        L_0x003b:
            r7 = 48
            if (r14 < r7) goto L_0x008f
            r7 = 57
            if (r14 <= r7) goto L_0x0044
            goto L_0x008f
        L_0x0044:
            if (r9 == r6) goto L_0x0084
            if (r9 != 0) goto L_0x0049
            goto L_0x0084
        L_0x0049:
            if (r9 != r15) goto L_0x0074
            r16 = 0
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            r4 = 0
            return r4
        L_0x0053:
            r4 = 10
            long r4 = r4 * r11
            int r14 = r14 + -48
            long r14 = (long) r14
            long r4 = r4 - r14
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x006f
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x006d
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r7 = 0
            goto L_0x0070
        L_0x006f:
            r7 = 1
        L_0x0070:
            r7 = r7 & r10
            r11 = r4
            r10 = r7
            goto L_0x007f
        L_0x0074:
            if (r9 != r4) goto L_0x0079
            r7 = 0
            r9 = 4
            goto L_0x008b
        L_0x0079:
            if (r9 == r5) goto L_0x0081
            r4 = 6
            if (r9 != r4) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r7 = 0
            goto L_0x008b
        L_0x0081:
            r7 = 0
            r9 = 7
            goto L_0x008b
        L_0x0084:
            int r14 = r14 + -48
            int r4 = -r14
            long r4 = (long) r4
            r11 = r4
            r7 = 0
            r9 = 2
        L_0x008b:
            r16 = 0
            goto L_0x00f5
        L_0x008f:
            boolean r1 = r0.m44013a(r14)
            if (r1 == 0) goto L_0x0097
            r1 = 0
            return r1
        L_0x0097:
            if (r9 != r15) goto L_0x00bb
            if (r10 == 0) goto L_0x00bb
            r1 = -9223372036854775808
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x00a3
            if (r13 == 0) goto L_0x00bb
        L_0x00a3:
            r16 = 0
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00ab
            if (r13 != 0) goto L_0x00bb
        L_0x00ab:
            if (r13 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            long r11 = -r11
        L_0x00af:
            r0.f49855j = r11
            int r1 = r0.f49851f
            int r1 = r1 + r3
            r0.f49851f = r1
            r1 = 15
            r0.f49848b = r1
            return r1
        L_0x00bb:
            if (r9 == r15) goto L_0x00c6
            r1 = 4
            if (r9 == r1) goto L_0x00c6
            r1 = 7
            if (r9 != r1) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r7 = 0
            return r7
        L_0x00c6:
            r0.f49856k = r3
            r1 = 16
            r0.f49848b = r1
            return r1
        L_0x00cd:
            r7 = 0
            r16 = 0
            if (r9 != r15) goto L_0x00d4
            r9 = 3
            goto L_0x00f5
        L_0x00d4:
            return r7
        L_0x00d5:
            r4 = 6
            r7 = 0
            r16 = 0
            if (r9 != 0) goto L_0x00de
            r9 = 1
            r13 = 1
            goto L_0x00f5
        L_0x00de:
            if (r9 != r5) goto L_0x00e1
            goto L_0x00f4
        L_0x00e1:
            return r7
        L_0x00e2:
            r7 = 0
            r16 = 0
            if (r9 == r15) goto L_0x00ec
            r4 = 4
            if (r9 != r4) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            return r7
        L_0x00ec:
            r9 = 5
            goto L_0x00f5
        L_0x00ee:
            r4 = 6
            r7 = 0
            r16 = 0
            if (r9 != r5) goto L_0x00f9
        L_0x00f4:
            r9 = 6
        L_0x00f5:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x00f9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p1078c.C17958a.m44020s():int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final int mo34853q() throws IOException {
        int i = this.f49858m[this.f49859n - 1];
        if (i == 1) {
            this.f49858m[this.f49859n - 1] = 2;
        } else if (i == 2) {
            int a = m44011a(true);
            if (a != 44) {
                if (a == 59) {
                    m44022u();
                } else if (a == 93) {
                    this.f49848b = 4;
                    return 4;
                } else {
                    throw m44015b("Unterminated array");
                }
            }
        } else if (i == 3 || i == 5) {
            this.f49858m[this.f49859n - 1] = 4;
            if (i == 5) {
                int a2 = m44011a(true);
                if (a2 != 44) {
                    if (a2 == 59) {
                        m44022u();
                    } else if (a2 == 125) {
                        this.f49848b = 2;
                        return 2;
                    } else {
                        throw m44015b("Unterminated object");
                    }
                }
            }
            int a3 = m44011a(true);
            if (a3 == 34) {
                this.f49848b = 13;
                return 13;
            } else if (a3 == 39) {
                m44022u();
                this.f49848b = 12;
                return 12;
            } else if (a3 != 125) {
                m44022u();
                this.f49851f--;
                if (m44013a((char) a3)) {
                    this.f49848b = 14;
                    return 14;
                }
                throw m44015b("Expected name");
            } else if (i != 5) {
                this.f49848b = 2;
                return 2;
            } else {
                throw m44015b("Expected name");
            }
        } else if (i == 4) {
            this.f49858m[this.f49859n - 1] = 5;
            int a4 = m44011a(true);
            if (a4 != 58) {
                if (a4 == 61) {
                    m44022u();
                    if ((this.f49851f < this.f49852g || m44017b(1)) && this.f49850e[this.f49851f] == '>') {
                        this.f49851f++;
                    }
                } else {
                    throw m44015b("Expected ':'");
                }
            }
        } else if (i == 6) {
            if (this.f49847a) {
                m44025x();
            }
            this.f49858m[this.f49859n - 1] = 7;
        } else if (i == 7) {
            if (m44011a(false) == -1) {
                this.f49848b = 17;
                return 17;
            }
            m44022u();
            this.f49851f--;
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m44011a(true);
        if (a5 == 34) {
            this.f49848b = 9;
            return 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f49848b = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        this.f49851f--;
                        int g = mo34947g();
                        if (g != 0) {
                            return g;
                        }
                        int s = m44020s();
                        if (s != 0) {
                            return s;
                        }
                        if (m44013a(this.f49850e[this.f49851f])) {
                            m44022u();
                            this.f49848b = 10;
                            return 10;
                        }
                        throw m44015b("Expected value");
                    }
                    this.f49848b = 1;
                    return 1;
                } else if (i == 1) {
                    this.f49848b = 4;
                    return 4;
                }
            }
            if (i == 1 || i == 2) {
                m44022u();
                this.f49851f--;
                this.f49848b = 7;
                return 7;
            }
            throw m44015b("Unexpected value");
        } else {
            m44022u();
            this.f49848b = 8;
            return 8;
        }
    }

    /* renamed from: a */
    public void mo34837a() throws IOException {
        int i = this.f49848b;
        if (i == 0) {
            i = mo34853q();
        }
        if (i == 3) {
            m44012a(1);
            this.f49861p[this.f49859n - 1] = 0;
            this.f49848b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(mo34843f());
        sb.append(mo34854r());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    private IOException m44015b(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo34854r());
        throw new C17962d(sb.toString());
    }

    public C17958a(Reader reader) {
        int[] iArr = this.f49858m;
        int i = this.f49859n;
        this.f49859n = i + 1;
        iArr[i] = 6;
        this.f49860o = new String[32];
        this.f49861p = new int[32];
        if (reader != null) {
            this.f49849d = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: a */
    private void m44012a(int i) {
        if (this.f49859n == this.f49858m.length) {
            int[] iArr = new int[(this.f49859n * 2)];
            int[] iArr2 = new int[(this.f49859n * 2)];
            String[] strArr = new String[(this.f49859n * 2)];
            System.arraycopy(this.f49858m, 0, iArr, 0, this.f49859n);
            System.arraycopy(this.f49861p, 0, iArr2, 0, this.f49859n);
            System.arraycopy(this.f49860o, 0, strArr, 0, this.f49859n);
            this.f49858m = iArr;
            this.f49861p = iArr2;
            this.f49860o = strArr;
        }
        int[] iArr3 = this.f49858m;
        int i2 = this.f49859n;
        this.f49859n = i2 + 1;
        iArr3[i2] = i;
    }

    /* renamed from: c */
    private void m44018c(char c) throws IOException {
        char[] cArr = this.f49850e;
        do {
            int i = this.f49851f;
            int i2 = this.f49852g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f49851f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f49851f = i3;
                    m44024w();
                    i = this.f49851f;
                    i2 = this.f49852g;
                } else {
                    if (c2 == 10) {
                        this.f49853h++;
                        this.f49854i = i3;
                    }
                    i = i3;
                }
            }
            this.f49851f = i;
        } while (m44017b(1));
        throw m44015b("Unterminated string");
    }

    /* renamed from: a */
    private boolean m44013a(char c) throws IOException {
        switch (c) {
            case 9:
            case 10:
            case 12:
            case 13:
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                break;
            case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
            case '/':
            case ';':
            case BaseNotice.TCM /*61*/:
            case '\\':
                m44022u();
                break;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m44017b(int i) throws IOException {
        char[] cArr = this.f49850e;
        this.f49854i -= this.f49851f;
        if (this.f49852g != this.f49851f) {
            this.f49852g -= this.f49851f;
            System.arraycopy(cArr, this.f49851f, cArr, 0, this.f49852g);
        } else {
            this.f49852g = 0;
        }
        this.f49851f = 0;
        do {
            int read = this.f49849d.read(cArr, this.f49852g, cArr.length - this.f49852g);
            if (read == -1) {
                return false;
            }
            this.f49852g += read;
            if (this.f49853h == 0 && this.f49854i == 0 && this.f49852g > 0 && cArr[0] == 65279) {
                this.f49851f++;
                this.f49854i++;
                i++;
            }
        } while (this.f49852g < i);
        return true;
    }

    /* renamed from: a */
    private int m44011a(boolean z) throws IOException {
        char[] cArr = this.f49850e;
        int i = this.f49851f;
        int i2 = this.f49852g;
        while (true) {
            if (i == i2) {
                this.f49851f = i;
                if (m44017b(1)) {
                    i = this.f49851f;
                    i2 = this.f49852g;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder("End of input");
                    sb.append(mo34854r());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f49853h++;
                this.f49854i = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f49851f = i3;
                    if (i3 == i2) {
                        this.f49851f--;
                        boolean b = m44017b(2);
                        this.f49851f++;
                        if (!b) {
                            return c;
                        }
                    }
                    m44022u();
                    char c2 = cArr[this.f49851f];
                    if (c2 == '*') {
                        this.f49851f++;
                        if (m44014a("*/")) {
                            i = this.f49851f + 2;
                            i2 = this.f49852g;
                        } else {
                            throw m44015b("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f49851f++;
                        m44023v();
                        i = this.f49851f;
                        i2 = this.f49852g;
                    }
                } else if (c == '#') {
                    this.f49851f = i3;
                    m44022u();
                    m44023v();
                    i = this.f49851f;
                    i2 = this.f49852g;
                } else {
                    this.f49851f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private String m44016b(char c) throws IOException {
        char[] cArr = this.f49850e;
        StringBuilder sb = null;
        do {
            int i = this.f49851f;
            int i2 = this.f49852g;
            int i3 = i;
            while (i < i2) {
                int i4 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f49851f = i4;
                    int i5 = (i4 - i3) - 1;
                    if (sb == null) {
                        return new String(cArr, i3, i5);
                    }
                    sb.append(cArr, i3, i5);
                    return sb.toString();
                } else if (c2 == '\\') {
                    this.f49851f = i4;
                    int i6 = (i4 - i3) - 1;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                    }
                    sb.append(cArr, i3, i6);
                    sb.append(m44024w());
                    i3 = this.f49851f;
                    i2 = this.f49852g;
                    i = i3;
                } else {
                    if (c2 == 10) {
                        this.f49853h++;
                        this.f49854i = i4;
                    }
                    i = i4;
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i - i3) * 2, 16));
            }
            sb.append(cArr, i3, i - i3);
            this.f49851f = i;
        } while (m44017b(1));
        throw m44015b("Unterminated string");
    }

    /* renamed from: a */
    private boolean m44014a(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f49851f + length > this.f49852g && !m44017b(length)) {
                return false;
            }
            if (this.f49850e[this.f49851f] == 10) {
                this.f49853h++;
                this.f49854i = this.f49851f + 1;
            } else {
                while (i < length) {
                    if (this.f49850e[this.f49851f + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f49851f++;
        }
    }
}

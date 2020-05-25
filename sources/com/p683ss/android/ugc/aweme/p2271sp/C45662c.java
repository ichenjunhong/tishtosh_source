package com.p683ss.android.ugc.aweme.p2271sp;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.ss.android.ugc.aweme.sp.c */
public final class C45662c implements XmlSerializer {

    /* renamed from: a */
    private static final String[] f115454a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b */
    private final char[] f115455b = new char[VideoCacheReadBuffersizeExperiment.DEFAULT];

    /* renamed from: c */
    private int f115456c;

    /* renamed from: d */
    private Writer f115457d;

    /* renamed from: e */
    private OutputStream f115458e;

    /* renamed from: f */
    private CharsetEncoder f115459f;

    /* renamed from: g */
    private ByteBuffer f115460g = ByteBuffer.allocate(VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: h */
    private boolean f115461h;

    public final void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    public final String getName() {
        throw new UnsupportedOperationException();
    }

    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m99418a() throws IOException {
        int position = this.f115460g.position();
        if (position > 0) {
            this.f115460g.flip();
            this.f115458e.write(this.f115460g.array(), 0, position);
            this.f115460g.clear();
        }
    }

    public final void flush() throws IOException {
        if (this.f115456c > 0) {
            if (this.f115458e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f115455b, 0, this.f115456c);
                CoderResult encode = this.f115459f.encode(wrap, this.f115460g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        m99418a();
                        encode = this.f115459f.encode(wrap, this.f115460g, true);
                    } else {
                        m99418a();
                        this.f115458e.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f115457d.write(this.f115455b, 0, this.f115456c);
            this.f115457d.flush();
            this.f115456c = 0;
        }
    }

    public final void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f115457d = writer;
    }

    public final void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public final void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m99420a(String str) throws IOException {
        m99421a(str, 0, str.length());
    }

    public final XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f115461h) {
            m99420a(">");
            this.f115461h = false;
        }
        m99423b(str);
        return this;
    }

    /* renamed from: a */
    private void m99419a(char c) throws IOException {
        int i = this.f115456c;
        if (i >= 8191) {
            flush();
            i = this.f115456c;
        }
        this.f115455b[i] = c;
        this.f115456c = i + 1;
    }

    /* renamed from: b */
    private void m99423b(String str) throws IOException {
        int length = str.length();
        char length2 = (char) f115454a.length;
        String[] strArr = f115454a;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i2 < i) {
                        m99421a(str, i2, i - i2);
                    }
                    i2 = i + 1;
                    m99420a(str2);
                }
            }
            i++;
        }
        if (i2 < i) {
            m99421a(str, i2, i - i2);
        }
    }

    public final String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public final void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    public final XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f115461h) {
            m99420a(">\n");
        }
        m99419a('<');
        if (str != null) {
            m99420a(str);
            m99419a(':');
        }
        m99420a(str2);
        this.f115461h = true;
        return this;
    }

    public final XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f115461h) {
            m99420a(" />\n");
        } else {
            m99420a("</");
            if (str != null) {
                m99420a(str);
                m99419a(':');
            }
            m99420a(str2);
            m99420a(">\n");
        }
        this.f115461h = false;
        return this;
    }

    public final void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f115459f = Charset.forName(str).newEncoder();
                this.f115458e = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        String str2;
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        m99420a(sb.toString());
    }

    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        m99419a(' ');
        if (str != null) {
            m99420a(str);
            m99419a(':');
        }
        m99420a(str2);
        m99420a("=\"");
        m99423b(str3);
        m99419a('\"');
        return this;
    }

    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f115461h) {
            m99420a(">");
            this.f115461h = false;
        }
        char length = (char) f115454a.length;
        String[] strArr = f115454a;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length) {
                String str = strArr[c];
                if (str != null) {
                    if (i4 < i) {
                        m99422a(cArr, i4, i - i4);
                    }
                    i4 = i + 1;
                    m99420a(str);
                }
            }
            i++;
        }
        if (i4 < i) {
            m99422a(cArr, i4, i - i4);
        }
        return this;
    }

    /* renamed from: a */
    private void m99421a(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + VideoCacheReadBuffersizeExperiment.DEFAULT;
                if (i5 < i4) {
                    i3 = VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else {
                    i3 = i4 - i;
                }
                m99421a(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.f115456c;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.f115456c;
        }
        str.getChars(i, i + i2, this.f115455b, i6);
        this.f115456c = i6 + i2;
    }

    /* renamed from: a */
    private void m99422a(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + VideoCacheReadBuffersizeExperiment.DEFAULT;
                if (i5 < i4) {
                    i3 = VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else {
                    i3 = i4 - i;
                }
                m99422a(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.f115456c;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.f115456c;
        }
        System.arraycopy(cArr, i, this.f115455b, i6, i2);
        this.f115456c = i6 + i2;
    }
}

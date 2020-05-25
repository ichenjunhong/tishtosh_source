package p2628d.p2638e;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;

/* renamed from: d.e.o */
public final class C52666o {

    /* renamed from: d.e.o$a */
    static final class C52667a extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f130961a;

        C52667a(ArrayList arrayList) {
            this.f130961a = arrayList;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            this.f130961a.add(str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public static final String m112218b(Reader reader) {
        C52711k.m112240b(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        m112213a(reader, stringWriter, VideoCacheReadBuffersizeExperiment.DEFAULT);
        String stringWriter2 = stringWriter.toString();
        C52711k.m112236a((Object) stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* renamed from: a */
    public static final C52785g<String> m112215a(BufferedReader bufferedReader) {
        C52711k.m112240b(bufferedReader, "$this$lineSequence");
        return C52786h.m112338b(new C52664n(bufferedReader));
    }

    /* renamed from: a */
    public static final List<String> m112216a(Reader reader) {
        C52711k.m112240b(reader, "$this$readLines");
        ArrayList arrayList = new ArrayList();
        m112217a(reader, new C52667a(arrayList));
        return arrayList;
    }

    /* renamed from: a */
    private static void m112217a(Reader reader, C52671b<? super String, C52860x> bVar) {
        BufferedReader bufferedReader;
        Throwable th;
        C52711k.m112240b(reader, "$this$forEachLine");
        C52711k.m112240b(bVar, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
        Closeable closeable = bufferedReader;
        try {
            Iterator a = m112215a((BufferedReader) closeable).mo110157a();
            while (a.hasNext()) {
                bVar.invoke(a.next());
            }
            C52647c.m112189a(closeable, null);
        } catch (Throwable th2) {
            C52647c.m112189a(closeable, th);
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m112213a(Reader reader, Writer writer, int i) {
        C52711k.m112240b(reader, "$this$copyTo");
        C52711k.m112240b(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }
}

package org.eclipse.mat.parser.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.eclipse.mat.hprof.HprofHeapObjectReader;
import org.eclipse.mat.hprof.HprofIndexBuilder;
import org.eclipse.mat.parser.IIndexBuilder;
import org.eclipse.mat.parser.IObjectReader;
import org.eclipse.mat.snapshot.SnapshotFormat;

public class ParserRegistry {
    private static ParserRegistry instance = new ParserRegistry();
    public List<Parser> parsers = new ArrayList();

    public static class Parser {

        /* renamed from: id */
        private String f133288id;
        private IIndexBuilder indexBuilder;
        private IObjectReader objectReader;
        public Pattern[] patterns;
        private SnapshotFormat snapshotFormat;

        public String getId() {
            return this.f133288id;
        }

        public IIndexBuilder getIndexBuilder() {
            return this.indexBuilder;
        }

        public IObjectReader getObjectReader() {
            return this.objectReader;
        }

        public SnapshotFormat getSnapshotFormat() {
            return this.snapshotFormat;
        }

        public String getUniqueIdentifier() {
            return this.f133288id;
        }

        public Parser(String str, SnapshotFormat snapshotFormat2, IObjectReader iObjectReader, IIndexBuilder iIndexBuilder) {
            this.f133288id = str;
            this.snapshotFormat = snapshotFormat2;
            this.patterns = new Pattern[snapshotFormat2.getFileExtensions().length];
            for (int i = 0; i < snapshotFormat2.getFileExtensions().length; i++) {
                Pattern[] patternArr = this.patterns;
                StringBuilder sb = new StringBuilder("(.*\\.)((?i)");
                sb.append(snapshotFormat2.getFileExtensions()[i]);
                sb.append(")(\\.[0-9]*)?");
                patternArr[i] = Pattern.compile(sb.toString());
            }
            this.objectReader = iObjectReader;
            this.indexBuilder = iIndexBuilder;
        }
    }

    public static List<Parser> allParsers() {
        return instance.parsers;
    }

    private ParserRegistry() {
    }

    static {
        addParser("hprof", "hprof", new String[]{"hprof", "bin"}, new HprofHeapObjectReader(), new HprofIndexBuilder());
    }

    public static Parser lookupParser(String str) {
        for (Parser parser : instance.parsers) {
            if (str.equals(parser.getUniqueIdentifier())) {
                return parser;
            }
        }
        return null;
    }

    public static List<Parser> matchParser(String str) {
        ArrayList arrayList = new ArrayList();
        for (Parser parser : instance.parsers) {
            Pattern[] patternArr = parser.patterns;
            int length = patternArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (patternArr[i].matcher(str).matches()) {
                    arrayList.add(parser);
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static void addParser(String str, String str2, String[] strArr, IObjectReader iObjectReader, IIndexBuilder iIndexBuilder) {
        instance.parsers.add(new Parser(str, new SnapshotFormat(str2, strArr), iObjectReader, iIndexBuilder));
    }
}

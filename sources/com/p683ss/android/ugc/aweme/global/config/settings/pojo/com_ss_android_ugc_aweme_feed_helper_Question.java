package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Question */
public final class com_ss_android_ugc_aweme_feed_helper_Question extends Message<com_ss_android_ugc_aweme_feed_helper_Question, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_Question> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Question();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3355)

    /* renamed from: id */
    public final String f85458id;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Option#ADAPTER", label = 2, tag = 175733094)
    public final List<com_ss_android_ugc_aweme_feed_helper_Option> options;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 110371416)
    public final String title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3575610)
    public final Integer type;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Question$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_feed_helper_Question, Builder> {

        /* renamed from: id */
        public String f85459id;
        public List<com_ss_android_ugc_aweme_feed_helper_Option> options = Internal.newMutableList();
        public String title;
        public Integer type;

        public final com_ss_android_ugc_aweme_feed_helper_Question build() {
            com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question = new com_ss_android_ugc_aweme_feed_helper_Question(this.f85459id, this.type, this.title, this.options, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_feed_helper_question;
        }

        /* renamed from: id */
        public final Builder mo69442id(String str) {
            this.f85459id = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder options(List<com_ss_android_ugc_aweme_feed_helper_Option> list) {
            Internal.checkElementsNotNull(list);
            this.options = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Question$ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Question */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Question extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_Question> {
        public final com_ss_android_ugc_aweme_feed_helper_Question redact(com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question) {
            return com_ss_android_ugc_aweme_feed_helper_question;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_Question() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_feed_helper_Question.class);
        }

        public final com_ss_android_ugc_aweme_feed_helper_Question decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_feed_helper_Question) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question) {
            return ProtoAdapter.STRING.encodedSizeWithTag(3355, com_ss_android_ugc_aweme_feed_helper_question.f85458id) + ProtoAdapter.INT32.encodedSizeWithTag(3575610, com_ss_android_ugc_aweme_feed_helper_question.type) + ProtoAdapter.STRING.encodedSizeWithTag(110371416, com_ss_android_ugc_aweme_feed_helper_question.title) + com_ss_android_ugc_aweme_feed_helper_Option.ADAPTER.asRepeated().encodedSizeWithTag(175733094, com_ss_android_ugc_aweme_feed_helper_question.options) + com_ss_android_ugc_aweme_feed_helper_question.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3355, com_ss_android_ugc_aweme_feed_helper_question.f85458id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3575610, com_ss_android_ugc_aweme_feed_helper_question.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 110371416, com_ss_android_ugc_aweme_feed_helper_question.title);
            com_ss_android_ugc_aweme_feed_helper_Option.ADAPTER.asRepeated().encodeWithTag(protoWriter, 175733094, com_ss_android_ugc_aweme_feed_helper_question.options);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_feed_helper_question.unknownFields());
        }

        public final com_ss_android_ugc_aweme_feed_helper_Question decode(ProtoReader protoReader, com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question2 = (com_ss_android_ugc_aweme_feed_helper_Question) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_feed_helper_Question.class, com_ss_android_ugc_aweme_feed_helper_question);
            if (com_ss_android_ugc_aweme_feed_helper_question2 != null) {
                builder = com_ss_android_ugc_aweme_feed_helper_question2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<com_ss_android_ugc_aweme_feed_helper_Option> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.options = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag == 3355) {
                    builder.mo69442id((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3575610) {
                    builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 110371416) {
                    builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 175733094) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_feed_helper_question2 == null) {
                            throw e;
                        }
                    }
                } else {
                    newMutableList.add(com_ss_android_ugc_aweme_feed_helper_Option.ADAPTER.decode(protoReader, C10617a.m21405a().mo18839a(com_ss_android_ugc_aweme_feed_helper_Option.class)));
                }
            }
        }
    }

    public final List<com_ss_android_ugc_aweme_feed_helper_Option> getOptions() {
        return this.options;
    }

    public final String getId() throws C10174a {
        if (this.f85458id != null) {
            return this.f85458id;
        }
        throw new C10174a();
    }

    public final String getTitle() throws C10174a {
        if (this.title != null) {
            return this.title;
        }
        throw new C10174a();
    }

    public final Integer getType() throws C10174a {
        if (this.type != null) {
            return this.type;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f85459id = this.f85458id;
        builder.type = this.type;
        builder.title = this.title;
        builder.options = Internal.copyOf("options", this.options);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.f85458id != null) {
            i = this.f85458id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.type != null) {
            i2 = this.type.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.title != null) {
            i4 = this.title.hashCode();
        }
        int hashCode2 = ((i6 + i4) * 37) + this.options.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f85458id != null) {
            sb.append(", id=");
            sb.append(this.f85458id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_feed_helper_Question{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_feed_helper_Question)) {
            return false;
        }
        com_ss_android_ugc_aweme_feed_helper_Question com_ss_android_ugc_aweme_feed_helper_question = (com_ss_android_ugc_aweme_feed_helper_Question) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_feed_helper_question.unknownFields()) || !Internal.equals(this.f85458id, com_ss_android_ugc_aweme_feed_helper_question.f85458id) || !Internal.equals(this.type, com_ss_android_ugc_aweme_feed_helper_question.type) || !Internal.equals(this.title, com_ss_android_ugc_aweme_feed_helper_question.title) || !this.options.equals(com_ss_android_ugc_aweme_feed_helper_question.options)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_feed_helper_Question(String str, Integer num, String str2, List<com_ss_android_ugc_aweme_feed_helper_Option> list) {
        this(str, num, str2, list, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_feed_helper_Question(String str, Integer num, String str2, List<com_ss_android_ugc_aweme_feed_helper_Option> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f85458id = str;
        this.type = num;
        this.title = str2;
        this.options = Internal.immutableCopyOf("options", list);
    }
}

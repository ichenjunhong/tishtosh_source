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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurvey */
public final class com_ss_android_ugc_aweme_feed_helper_FeedSurvey extends Message<com_ss_android_ugc_aweme_feed_helper_FeedSurvey, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_FeedSurvey> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_FeedSurvey();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 229454899)
    public final String cancel_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3355)

    /* renamed from: id */
    public final String f85454id;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_Question#ADAPTER", label = 2, tag = 171622073)
    public final List<com_ss_android_ugc_aweme_feed_helper_Question> questions;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 53546228)
    public final String submit_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 110371416)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurvey$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_feed_helper_FeedSurvey, Builder> {
        public String cancel_text;

        /* renamed from: id */
        public String f85455id;
        public List<com_ss_android_ugc_aweme_feed_helper_Question> questions = Internal.newMutableList();
        public String submit_text;
        public String title;

        public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey build() {
            com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey = new com_ss_android_ugc_aweme_feed_helper_FeedSurvey(this.f85455id, this.title, this.cancel_text, this.submit_text, this.questions, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_feed_helper_feedsurvey;
        }

        public final Builder cancel_text(String str) {
            this.cancel_text = str;
            return this;
        }

        /* renamed from: id */
        public final Builder mo69402id(String str) {
            this.f85455id = str;
            return this;
        }

        public final Builder submit_text(String str) {
            this.submit_text = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder questions(List<com_ss_android_ugc_aweme_feed_helper_Question> list) {
            Internal.checkElementsNotNull(list);
            this.questions = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_feed_helper_FeedSurvey$ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_FeedSurvey */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_FeedSurvey extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_feed_helper_FeedSurvey> {
        public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey redact(com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey) {
            return com_ss_android_ugc_aweme_feed_helper_feedsurvey;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_feed_helper_FeedSurvey() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_feed_helper_FeedSurvey.class);
        }

        public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_feed_helper_FeedSurvey) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey) {
            return ProtoAdapter.STRING.encodedSizeWithTag(3355, com_ss_android_ugc_aweme_feed_helper_feedsurvey.f85454id) + ProtoAdapter.STRING.encodedSizeWithTag(110371416, com_ss_android_ugc_aweme_feed_helper_feedsurvey.title) + ProtoAdapter.STRING.encodedSizeWithTag(229454899, com_ss_android_ugc_aweme_feed_helper_feedsurvey.cancel_text) + ProtoAdapter.STRING.encodedSizeWithTag(53546228, com_ss_android_ugc_aweme_feed_helper_feedsurvey.submit_text) + com_ss_android_ugc_aweme_feed_helper_Question.ADAPTER.asRepeated().encodedSizeWithTag(171622073, com_ss_android_ugc_aweme_feed_helper_feedsurvey.questions) + com_ss_android_ugc_aweme_feed_helper_feedsurvey.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3355, com_ss_android_ugc_aweme_feed_helper_feedsurvey.f85454id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 110371416, com_ss_android_ugc_aweme_feed_helper_feedsurvey.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 229454899, com_ss_android_ugc_aweme_feed_helper_feedsurvey.cancel_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 53546228, com_ss_android_ugc_aweme_feed_helper_feedsurvey.submit_text);
            com_ss_android_ugc_aweme_feed_helper_Question.ADAPTER.asRepeated().encodeWithTag(protoWriter, 171622073, com_ss_android_ugc_aweme_feed_helper_feedsurvey.questions);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_feed_helper_feedsurvey.unknownFields());
        }

        public final com_ss_android_ugc_aweme_feed_helper_FeedSurvey decode(ProtoReader protoReader, com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey2 = (com_ss_android_ugc_aweme_feed_helper_FeedSurvey) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_feed_helper_FeedSurvey.class, com_ss_android_ugc_aweme_feed_helper_feedsurvey);
            if (com_ss_android_ugc_aweme_feed_helper_feedsurvey2 != null) {
                builder = com_ss_android_ugc_aweme_feed_helper_feedsurvey2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<com_ss_android_ugc_aweme_feed_helper_Question> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.questions = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag == 3355) {
                    builder.mo69402id((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 53546228) {
                    builder.submit_text((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 110371416) {
                    builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 171622073) {
                    newMutableList.add(com_ss_android_ugc_aweme_feed_helper_Question.ADAPTER.decode(protoReader, C10617a.m21405a().mo18839a(com_ss_android_ugc_aweme_feed_helper_Question.class)));
                } else if (nextTag != 229454899) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_feed_helper_feedsurvey2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.cancel_text((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final List<com_ss_android_ugc_aweme_feed_helper_Question> getQuestions() {
        return this.questions;
    }

    public final String getCancelText() throws C10174a {
        if (this.cancel_text != null) {
            return this.cancel_text;
        }
        throw new C10174a();
    }

    public final String getId() throws C10174a {
        if (this.f85454id != null) {
            return this.f85454id;
        }
        throw new C10174a();
    }

    public final String getSubmitText() throws C10174a {
        if (this.submit_text != null) {
            return this.submit_text;
        }
        throw new C10174a();
    }

    public final String getTitle() throws C10174a {
        if (this.title != null) {
            return this.title;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f85455id = this.f85454id;
        builder.title = this.title;
        builder.cancel_text = this.cancel_text;
        builder.submit_text = this.submit_text;
        builder.questions = Internal.copyOf("questions", this.questions);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.f85454id != null) {
            i = this.f85454id.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.title != null) {
            i2 = this.title.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.cancel_text != null) {
            i3 = this.cancel_text.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.submit_text != null) {
            i5 = this.submit_text.hashCode();
        }
        int hashCode2 = ((i8 + i5) * 37) + this.questions.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f85454id != null) {
            sb.append(", id=");
            sb.append(this.f85454id);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.cancel_text != null) {
            sb.append(", cancel_text=");
            sb.append(this.cancel_text);
        }
        if (this.submit_text != null) {
            sb.append(", submit_text=");
            sb.append(this.submit_text);
        }
        if (!this.questions.isEmpty()) {
            sb.append(", questions=");
            sb.append(this.questions);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_feed_helper_FeedSurvey{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_feed_helper_FeedSurvey)) {
            return false;
        }
        com_ss_android_ugc_aweme_feed_helper_FeedSurvey com_ss_android_ugc_aweme_feed_helper_feedsurvey = (com_ss_android_ugc_aweme_feed_helper_FeedSurvey) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_feed_helper_feedsurvey.unknownFields()) || !Internal.equals(this.f85454id, com_ss_android_ugc_aweme_feed_helper_feedsurvey.f85454id) || !Internal.equals(this.title, com_ss_android_ugc_aweme_feed_helper_feedsurvey.title) || !Internal.equals(this.cancel_text, com_ss_android_ugc_aweme_feed_helper_feedsurvey.cancel_text) || !Internal.equals(this.submit_text, com_ss_android_ugc_aweme_feed_helper_feedsurvey.submit_text) || !this.questions.equals(com_ss_android_ugc_aweme_feed_helper_feedsurvey.questions)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_feed_helper_FeedSurvey(String str, String str2, String str3, String str4, List<com_ss_android_ugc_aweme_feed_helper_Question> list) {
        this(str, str2, str3, str4, list, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_feed_helper_FeedSurvey(String str, String str2, String str3, String str4, List<com_ss_android_ugc_aweme_feed_helper_Question> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f85454id = str;
        this.title = str2;
        this.cancel_text = str3;
        this.submit_text = str4;
        this.questions = Internal.immutableCopyOf("questions", list);
    }
}

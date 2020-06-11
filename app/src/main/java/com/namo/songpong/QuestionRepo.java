package com.namo.songpong;

import com.google.gson.annotations.SerializedName;

public class QuestionRepo {
    @SerializedName("id")
    String id;
    @SerializedName("writer")
    String writer;
    @SerializedName("content")
    String content;
    @SerializedName("date")
    String date;
}
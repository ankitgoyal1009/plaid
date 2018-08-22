/*
 * Copyright 2018 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.plaidapp.core.designernews.data.api.model

import com.google.gson.annotations.SerializedName

class NewCommentRequest(
    body: CharSequence,
    parent_comment: String?,
    story: String?,
    user: String,
    @SerializedName("comments") val comment: PostCommentRequest =
    PostCommentRequest(CommentData(body), CommentLinks(parent_comment, story, user))
)

data class PostCommentRequest(
    @SerializedName("comment") val commentData: CommentData,
    @SerializedName("links") val commentLinks: CommentLinks
)

data class CommentData(
    @SerializedName("body") val body: CharSequence
)

data class CommentLinks(
    @SerializedName("parent_comment") val parent_comment: String?,
    @SerializedName("story") val story: String?,
    @SerializedName("user") val user: String
)
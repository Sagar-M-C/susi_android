package org.fossasia.susi.ai.rest.responses.susi

import com.google.gson.annotations.SerializedName

/**
 *
 * Created by chiragw15 on 16/8/17.
 */
data class ListSkillsResponse(
        val group: String = "Knowledge",
        @SerializedName("skills")
        val skillMap: Map<String, SkillData> = HashMap(),
        @SerializedName("filteredData")
        val filteredSkillsData: List<SkillData> = ArrayList()
)